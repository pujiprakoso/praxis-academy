package org.json.simple.tiga;
import org.json.simple.JSONObject;

public class JsonEncodeDemo {

   public static void mulai() {
      JSONObject obj = new JSONObject();

      obj.put("key", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
   }
}