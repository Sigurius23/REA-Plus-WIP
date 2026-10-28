package p254jj;

import ad3.AbstractC0770m;
import com.amplitude.android.engagement.C4861a;
import io.getstream.chat.android.client.api.QueryParams;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p027b3.C2442t0;
import p031b9.AbstractC2875y;
import p222ij.C18581g;
import p222ij.C18582h;
import p222ij.InterfaceC18576b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jj.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21735a implements InterfaceC18576b {
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    @Override // p222ij.InterfaceC18576b
    /* JADX INFO: renamed from: a */
    public final String mo53797a(String msgId, JsonObject jsonObject, C2442t0 c2442t0) {
        String strM1844f;
        String strM1844f2;
        String strM1844f3;
        String string;
        AbstractC22676k.m65750j(msgId, "msgId");
        try {
            JsonElement jsonElement = (JsonElement) jsonObject.get(QueryParams.URL);
            String str = "";
            if (jsonElement == null || (strM1844f = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement))) == null) {
                strM1844f = "";
            }
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("options");
            JsonObject jsonObjectM1847i = jsonElement2 != null ? AbstractC0770m.m1847i(jsonElement2) : new JsonObject(new LinkedHashMap());
            JsonElement jsonElement3 = (JsonElement) jsonObjectM1847i.get((Object) "method");
            if (jsonElement3 == null || (strM1844f2 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement3))) == null) {
                strM1844f2 = "GET";
            }
            JsonElement jsonElement4 = (JsonElement) jsonObjectM1847i.get((Object) "body");
            if (jsonElement4 == null || (strM1844f3 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(jsonElement4))) == null) {
                strM1844f3 = "";
            }
            JsonElement jsonElement5 = (JsonElement) jsonObjectM1847i.get((Object) "headers");
            JsonObject jsonObjectM1847i2 = jsonElement5 != null ? AbstractC0770m.m1847i(jsonElement5) : new JsonObject(new LinkedHashMap());
            URLConnection uRLConnectionOpenConnection = new URL(strM1844f).openConnection();
            AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod(strM1844f2);
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            for (Map.Entry<String, JsonElement> entry : jsonObjectM1847i2.entrySet()) {
                String key = entry.getKey();
                String strM1844f4 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(entry.getValue()));
                if (strM1844f4 != null) {
                    httpURLConnection.setRequestProperty(key, strM1844f4);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry2 : jsonObjectM1847i2.entrySet()) {
                String key2 = entry2.getKey();
                String strM1844f5 = AbstractC0770m.m1844f(AbstractC0770m.m1848j(entry2.getValue()));
                if (strM1844f5 != null) {
                    linkedHashMap.put(key2, strM1844f5);
                }
            }
            boolean z4 = true;
            if (!strM1844f2.equals("GET") && !strM1844f2.equals("HEAD") && strM1844f3.length() > 0) {
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    byte[] bytes = strM1844f3.getBytes(AbstractC39397a.f169546a);
                    AbstractC22676k.m65749i(bytes, "getBytes(...)");
                    outputStream.write(bytes);
                    outputStream.flush();
                    outputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(outputStream, th3);
                        throw th4;
                    }
                }
            }
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = responseCode >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                try {
                    StringBuilder sb4 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb4.append(line);
                        C4861a.f20259o.m16032K("Error during network request", e);
                        c2442t0.invoke(new C18581g(AbstractC2875y.m8298k(e, new StringBuilder("Fetch error: "))));
                        return null;
                    }
                    string = sb4.toString();
                    bufferedReader.close();
                    if (string == null) {
                        string = "";
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC35854l.m113829i(bufferedReader, th5);
                        throw th6;
                    }
                }
            } else {
                string = "";
            }
            if (string.length() == 0 || AbstractC39414r.m125890i0(string)) {
                string = "{}";
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            JsonPrimitive element = AbstractC0770m.m1840b(Integer.valueOf(responseCode));
            AbstractC22676k.m65750j(element, "element");
            String responseMessage = httpURLConnection.getResponseMessage();
            if (responseMessage != null) {
                str = responseMessage;
            }
            JsonPrimitive element2 = AbstractC0770m.m1841c(str);
            AbstractC22676k.m65750j(element2, "element");
            JsonPrimitive element3 = AbstractC0770m.m1841c(string);
            AbstractC22676k.m65750j(element3, "element");
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            AbstractC22676k.m65749i(headerFields, "connection.headerFields");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(headerFields.size()));
            for (Object obj : headerFields.entrySet()) {
                Object key3 = ((Map.Entry) obj).getKey();
                Object value = ((Map.Entry) obj).getValue();
                AbstractC22676k.m65749i(value, "it.value");
                linkedHashMap3.put(key3, AbstractC0770m.m1841c(AbstractC25265s.m74110N0((Iterable) value, ", ", null, null, null, 62)));
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                if (((String) entry3.getKey()) != null) {
                    linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                }
            }
            if (responseCode >= 400) {
                z4 = false;
            }
            JsonPrimitive element4 = AbstractC0770m.m1839a(Boolean.valueOf(z4));
            AbstractC22676k.m65750j(element4, "element");
            c2442t0.invoke(new C18582h(new JsonObject(linkedHashMap2).toString()));
            return null;
        } catch (Exception e5) {
            C4861a.f20259o.m16032K("Error during network request", e5);
            c2442t0.invoke(new C18581g(AbstractC2875y.m8298k(e5, new StringBuilder("Fetch error: "))));
            return null;
        }
    }
}
