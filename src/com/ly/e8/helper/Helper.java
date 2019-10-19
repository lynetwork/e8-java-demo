package com.ly.e8.helper;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import com.ly.e8.config.Config;
import com.ly.e8.entity.Callback;

public class Helper {

	public static String filterNullParams(Object obj, String key) {
		Class cls = obj.getClass();
		Field[] fd = cls.getDeclaredFields();
		List list = new ArrayList();
		String result = "";
		Field[] arrayOfField1;
		int j = (arrayOfField1 = fd).length;
		for (int i = 0; i < j; i++) {
			Field f = arrayOfField1[i];
			boolean isStatic = Modifier.isStatic(f.getModifiers());
			if (!isStatic) {
				f.setAccessible(true);
				try {
					if (f.get(obj) != null && !f.get(obj).equals("")) {
						list.add(f.getName() + "	" + f.get(obj));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				f.setAccessible(false);
			}
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			String str = ((String) list.get(i));
			result = result + (i > 0 ? str.contains("status") ? "&"+str.replace("	", "=") : str.replace("ly", "&ly").replace("	", "=") : ((String) list.get(i)).replace("	", "="));
		}

		if (key == null) {
			return result;
		}
		return result + "&ly_key=" + key;
	}
	
	@SuppressWarnings("deprecation")
	public static String valueToUrlEncode(String str) {
		String[] ps = str.split("&");
		StringBuffer sb = new StringBuffer();
		for (String kv : ps) {
			String[] _kv = kv.split("=");
			sb.append(_kv[0]+"="+URLEncoder.encode(_kv[1])+"&");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}

	public static boolean checkSign(Callback callback) throws Exception {
		String sign = callback.getLy_sign();
		callback.setLy_sign(null);
		String param = Helper.filterNullParams(callback, null);
		return SignUtil.verifySign(param, sign, "RSA_1_256", Config.platPublicKey);
	}
}
