package com.ly.e8.config;

/**
 * <一句话功能简述>
 * <功能详细描述>配置信息
 */
public class Config {
    
	public static String key = "";
	
    public static String mchPrivateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDIFk1MCWy7dnl3rJDaN6g2ndckhNsC8kuuAt91glJf3//1hQ8j6tkbiJ8+BxiTDiqNgV1MAGZTdL18Za+pya+dkpB4jwWTubw/9MlJHUtgFC0EccXpWhgPk/GRJUam5nrAw5355IpetZGvKZTLKNAXQgTiTEAVAzEsoIHSJlrX++V6qHx+GVz6D9ShivirvduX8lQT9Gr+QFig5QXRPNz5mBI3dOpEGuZS0TaYDBnms8g8f1WgkvOJ1yaQhH3G+xkIuA7Eqh3H3ICU3VqvPDNk6JNfL3AE1kxq5+4bFfIwpf8GhpfA7lzPohr3ONR0hc5aAC7VwdnEHt0widFdyw71AgMBAAECggEAMJuCYbN0b8IjVhhdBDY7LjGAH4YK8pdMHVTjVle3jUUMmGefuvkFjzPMg7QTmz34xnGj6Z+7PBEDK2JEn3m4qQ3+/Nq53x5jBiKAd7ufIRMlsIu3Ka5SZA5rw/gLRuZ88bFUAm4r00BGyQfP9t7OVqgaKaOeebxRyOahQx1AOnGvyoZK+CSawmol4Iibl+zUkvHRFFDkwxYihmOfogFdfv9Gey+BkQrVcA9crL/Kp9s6aWUAikQRBdUJKh84YGnfLHWEYv9AfEiBO9bwa8bLXZxKZE2Xbrzm9/BbY8SpXvuSNl7ka/qlZx4S4EkTcdiKNkNqqkKGTkTUld7NG6g0oQKBgQD7EXbTMjxJKzjiYA8qtIRYfbINFhi/ClxTZb+nnP+MoTQjO0YOw9y84YOz86iHshmf4zD9zhLnxcNlsVgp+ib2atGB2xnZM3rvgn7QvZ5Xj8QE1qY/ur8QF0Iqm8aotj4hHFgPBUvBmrpTkNJjxUUgADIvX/+OgevLzQAM/wwJ/QKBgQDMBHio86BxjO6DliJBod5RX2LdG1Djos3SL8aD6ow1FbqYARZjeb2E3ykQBsVwmu7sgeZb0lyeUKynA3lnaCKwj3M/YqWtiYs0OUtyy0enoeMhMzPsgm11RDTAnfjoArYvukeStEkqo33lbjcrzT2wefgs35co8tA205K5QHrOWQKBgGZ1XRGZKaMOgXtYijf6TRwzx4qxns2vs7fRCSKk3mEMlFNgaBm0coueWHoCkJ833l8yfxbEl1CAk1oXwov26xmaw/8DZAwQhzXhAlG7YDgJkowK8POHCVvOshDjW3IUVUx73a/bkGvk8e8SZdmTcr85dUGCIq+Mc6bK9R9YohgdAoGASbW72l7bMutWKViO2+OdrQynbXc3DGd/sVbthC+zpGJLXivWaO5NGLp/3Xh00TBI7k4oajhgmhpPpq/Mpx2qmtvZKad8cGxnTOD+b2UeaGRG6XHUarjczydrX8Qzb6+7HxdQUKKuZKdZDxF5AWxPw3jtv1ixBmxj6csbEa9IL1ECgYEArIYJlohzslcErN/uajXz1+oRoOznZ5+UJ103mxkMmAXy7YZLVHzaoxZCsFLl5VvukXWRn/l6ncmBPyU5dxXy6xUibXP6C94UjEK/lICf7bumetty/Ob8u9eDGQHdSpDgXKnta1wlKb/LAurfXqAHb7PS0t6DBOQWDP+/5oWOYF0=";
    
    public static String platPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvIWcc/moe45UAM2qyrig2Hqk7u4tNmzGuOaJ4vm38CF0Lc1U/75NrDnSImj4KfCAWFfDDZFDXw61PBvkSMqh451TvIq/kL7Rhziclfmht1vHr69ArI4SNzUbBsBUmdq51rVz3SWu2Kgno4UMCKweiTi6fLLBVzNU5lOBKJ06y6j+9gi0R8i7o32QcwlfuCyyN2tzY62Lzqy1YfhrHgviMZ2pe78PcDWYSwc+dJjStPT6lR1czXoBrRvtzdp9GPbXVi1jGlauEBbpWnl+tG0XDv3u939zXnHLuSYB23FYmUQbW30DkRriQZ12UXZ352SNbh5xtHKR0OmI8Fqse0JJXwIDAQAB";
    /**
     * 请求下单url
     */
    public static String req_url = "https://interface.e8pay.com/api/pay/Order";
    /**
     * 通知回调url
     */
    public static String notify_url = "http://localhost:369/e8/callback";
}
