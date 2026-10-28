package com.iterable.iterableapi;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import live.hms.video.error.ErrorCodes;
import org.json.JSONException;
import org.json.JSONObject;
import p097ds.RunnableC12316s;
import p098dt.AbstractC12350b;
import p497t7.InterfaceC33561b;

/* JADX INFO: renamed from: com.iterable.iterableapi.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC5304a2 extends AsyncTask {

    /* JADX INFO: renamed from: c */
    public static final Handler f21632c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public int f21633a = 0;

    /* JADX INFO: renamed from: b */
    public C5357o f21634b;

    /* JADX INFO: renamed from: a */
    public static String m16403a(HttpURLConnection httpURLConnection) {
        StringBuilder sb4 = new StringBuilder("\nHeaders { \n");
        for (String str : httpURLConnection.getRequestProperties().keySet()) {
            if (!str.equals("Api-Key") && !str.equals(TokenAuthInterceptor.AUTH_HEADER)) {
                sb4.append(str);
                sb4.append(" : ");
                sb4.append(httpURLConnection.getRequestProperties().get(str));
                sb4.append("\n");
            }
        }
        sb4.append("}");
        return sb4.toString();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0277 A[Catch: all -> 0x00fb, Exception -> 0x0286, ArrayIndexOutOfBoundsException -> 0x0289, JSONException -> 0x028c, IOException -> 0x028f, TRY_ENTER, TryCatch #17 {IOException -> 0x028f, blocks: (B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:110:0x0291), top: B:231:0x0275 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0291 A[Catch: all -> 0x00fb, Exception -> 0x0286, ArrayIndexOutOfBoundsException -> 0x0289, JSONException -> 0x028c, IOException -> 0x028f, TryCatch #17 {IOException -> 0x028f, blocks: (B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:110:0x0291), top: B:231:0x0275 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02aa A[Catch: all -> 0x00fb, Exception -> 0x0286, ArrayIndexOutOfBoundsException -> 0x0289, JSONException -> 0x028c, IOException -> 0x028f, LOOP:0: B:112:0x02a4->B:114:0x02aa, LOOP_END, TryCatch #17 {IOException -> 0x028f, blocks: (B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:110:0x0291), top: B:231:0x0275 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02f6 A[Catch: all -> 0x00fb, Exception -> 0x0316, ArrayIndexOutOfBoundsException -> 0x0319, IOException -> 0x031c, JSONException -> 0x031f, TryCatch #34 {all -> 0x00fb, blocks: (B:29:0x00b6, B:31:0x00e2, B:47:0x011f, B:49:0x0149, B:98:0x026c, B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:119:0x02c1, B:120:0x02c6, B:129:0x02f6, B:131:0x02fc, B:140:0x0322, B:144:0x0330, B:146:0x0338, B:150:0x0343, B:154:0x034e, B:157:0x0356, B:159:0x036e, B:160:0x0373, B:162:0x037c, B:164:0x0382, B:166:0x038b, B:168:0x0392, B:126:0x02eb, B:202:0x0400, B:207:0x0415, B:212:0x042a, B:217:0x0440, B:110:0x0291, B:117:0x02b8), top: B:236:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02fc A[Catch: all -> 0x00fb, Exception -> 0x0316, ArrayIndexOutOfBoundsException -> 0x0319, IOException -> 0x031c, JSONException -> 0x031f, TryCatch #34 {all -> 0x00fb, blocks: (B:29:0x00b6, B:31:0x00e2, B:47:0x011f, B:49:0x0149, B:98:0x026c, B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:119:0x02c1, B:120:0x02c6, B:129:0x02f6, B:131:0x02fc, B:140:0x0322, B:144:0x0330, B:146:0x0338, B:150:0x0343, B:154:0x034e, B:157:0x0356, B:159:0x036e, B:160:0x0373, B:162:0x037c, B:164:0x0382, B:166:0x038b, B:168:0x0392, B:126:0x02eb, B:202:0x0400, B:207:0x0415, B:212:0x042a, B:217:0x0440, B:110:0x0291, B:117:0x02b8), top: B:236:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0322 A[Catch: all -> 0x00fb, Exception -> 0x0316, ArrayIndexOutOfBoundsException -> 0x0319, IOException -> 0x031c, JSONException -> 0x031f, TryCatch #34 {all -> 0x00fb, blocks: (B:29:0x00b6, B:31:0x00e2, B:47:0x011f, B:49:0x0149, B:98:0x026c, B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:119:0x02c1, B:120:0x02c6, B:129:0x02f6, B:131:0x02fc, B:140:0x0322, B:144:0x0330, B:146:0x0338, B:150:0x0343, B:154:0x034e, B:157:0x0356, B:159:0x036e, B:160:0x0373, B:162:0x037c, B:164:0x0382, B:166:0x038b, B:168:0x0392, B:126:0x02eb, B:202:0x0400, B:207:0x0415, B:212:0x042a, B:217:0x0440, B:110:0x0291, B:117:0x02b8), top: B:236:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x032c  */
    /* JADX WARN: Code duplicated, block: B:147:0x033d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0341  */
    /* JADX WARN: Code duplicated, block: B:151:0x0348  */
    /* JADX WARN: Code duplicated, block: B:153:0x034c  */
    /* JADX WARN: Code duplicated, block: B:161:0x037a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x037c A[Catch: all -> 0x00fb, Exception -> 0x0316, ArrayIndexOutOfBoundsException -> 0x0319, IOException -> 0x031c, JSONException -> 0x031f, TryCatch #34 {all -> 0x00fb, blocks: (B:29:0x00b6, B:31:0x00e2, B:47:0x011f, B:49:0x0149, B:98:0x026c, B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:119:0x02c1, B:120:0x02c6, B:129:0x02f6, B:131:0x02fc, B:140:0x0322, B:144:0x0330, B:146:0x0338, B:150:0x0343, B:154:0x034e, B:157:0x0356, B:159:0x036e, B:160:0x0373, B:162:0x037c, B:164:0x0382, B:166:0x038b, B:168:0x0392, B:126:0x02eb, B:202:0x0400, B:207:0x0415, B:212:0x042a, B:217:0x0440, B:110:0x0291, B:117:0x02b8), top: B:236:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0389 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:166:0x038b A[Catch: all -> 0x00fb, Exception -> 0x0316, ArrayIndexOutOfBoundsException -> 0x0319, IOException -> 0x031c, JSONException -> 0x031f, TryCatch #34 {all -> 0x00fb, blocks: (B:29:0x00b6, B:31:0x00e2, B:47:0x011f, B:49:0x0149, B:98:0x026c, B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:119:0x02c1, B:120:0x02c6, B:129:0x02f6, B:131:0x02fc, B:140:0x0322, B:144:0x0330, B:146:0x0338, B:150:0x0343, B:154:0x034e, B:157:0x0356, B:159:0x036e, B:160:0x0373, B:162:0x037c, B:164:0x0382, B:166:0x038b, B:168:0x0392, B:126:0x02eb, B:202:0x0400, B:207:0x0415, B:212:0x042a, B:217:0x0440, B:110:0x0291, B:117:0x02b8), top: B:236:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0390  */
    /* JADX WARN: Code duplicated, block: B:168:0x0392 A[Catch: all -> 0x00fb, Exception -> 0x0316, ArrayIndexOutOfBoundsException -> 0x0319, IOException -> 0x031c, JSONException -> 0x031f, TRY_LEAVE, TryCatch #34 {all -> 0x00fb, blocks: (B:29:0x00b6, B:31:0x00e2, B:47:0x011f, B:49:0x0149, B:98:0x026c, B:101:0x0277, B:111:0x029f, B:112:0x02a4, B:114:0x02aa, B:115:0x02ae, B:119:0x02c1, B:120:0x02c6, B:129:0x02f6, B:131:0x02fc, B:140:0x0322, B:144:0x0330, B:146:0x0338, B:150:0x0343, B:154:0x034e, B:157:0x0356, B:159:0x036e, B:160:0x0373, B:162:0x037c, B:164:0x0382, B:166:0x038b, B:168:0x0392, B:126:0x02eb, B:202:0x0400, B:207:0x0415, B:212:0x042a, B:217:0x0440, B:110:0x0291, B:117:0x02b8), top: B:236:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03a7 A[PHI: r2 r3 r5 r7
      0x03a7: PHI (r2v48 java.lang.String) = 
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v40 java.lang.String)
      (r2v41 java.lang.String)
      (r2v43 java.lang.String)
      (r2v45 java.lang.String)
      (r2v49 java.lang.String)
     binds: [B:168:0x0392, B:167:0x0390, B:166:0x038b, B:164:0x0382, B:160:0x0373, B:159:0x036e, B:157:0x0356, B:150:0x0343, B:140:0x0322, B:131:0x02fc, B:204:0x040f, B:218:0x044d, B:209:0x0424, B:214:0x0439] A[DONT_GENERATE, DONT_INLINE]
      0x03a7: PHI (r3v32 java.lang.String) = 
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v24 java.lang.String)
      (r3v25 java.lang.String)
      (r3v27 java.lang.String)
      (r3v29 java.lang.String)
      (r3v33 java.lang.String)
     binds: [B:168:0x0392, B:167:0x0390, B:166:0x038b, B:164:0x0382, B:160:0x0373, B:159:0x036e, B:157:0x0356, B:150:0x0343, B:140:0x0322, B:131:0x02fc, B:204:0x040f, B:218:0x044d, B:209:0x0424, B:214:0x0439] A[DONT_GENERATE, DONT_INLINE]
      0x03a7: PHI (r5v26 com.iterable.iterableapi.p) = 
      (r5v8 com.iterable.iterableapi.p)
      (r5v9 com.iterable.iterableapi.p)
      (r5v10 com.iterable.iterableapi.p)
      (r5v11 com.iterable.iterableapi.p)
      (r5v13 com.iterable.iterableapi.p)
      (r5v14 com.iterable.iterableapi.p)
      (r5v16 com.iterable.iterableapi.p)
      (r5v18 com.iterable.iterableapi.p)
      (r5v20 com.iterable.iterableapi.p)
      (r5v21 com.iterable.iterableapi.p)
      (r5v22 com.iterable.iterableapi.p)
      (r5v23 com.iterable.iterableapi.p)
      (r5v24 com.iterable.iterableapi.p)
      (r5v27 com.iterable.iterableapi.p)
     binds: [B:168:0x0392, B:167:0x0390, B:166:0x038b, B:164:0x0382, B:160:0x0373, B:159:0x036e, B:157:0x0356, B:150:0x0343, B:140:0x0322, B:131:0x02fc, B:204:0x040f, B:218:0x044d, B:209:0x0424, B:214:0x0439] A[DONT_GENERATE, DONT_INLINE]
      0x03a7: PHI (r7v16 java.net.HttpURLConnection) = 
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v9 java.net.HttpURLConnection)
      (r7v10 java.net.HttpURLConnection)
      (r7v12 java.net.HttpURLConnection)
      (r7v14 java.net.HttpURLConnection)
      (r7v17 java.net.HttpURLConnection)
     binds: [B:168:0x0392, B:167:0x0390, B:166:0x038b, B:164:0x0382, B:160:0x0373, B:159:0x036e, B:157:0x0356, B:150:0x0343, B:140:0x0322, B:131:0x02fc, B:204:0x040f, B:218:0x044d, B:209:0x0424, B:214:0x0439] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:204:0x040f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0424  */
    /* JADX WARN: Code duplicated, block: B:214:0x0439  */
    /* JADX WARN: Code duplicated, block: B:256:0x02ae A[EDGE_INSN: B:256:0x02ae->B:115:0x02ae BREAK  A[LOOP:0: B:112:0x02a4->B:114:0x02aa], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x0392, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX INFO: renamed from: b */
    public static C5360p m16404b(C5357o c5357o) throws Throwable {
        ?? r10;
        String str;
        HttpURLConnection httpURLConnection;
        String str2;
        String string;
        int responseCode;
        String message;
        JSONObject jSONObject;
        String message2;
        C5360p c5360pM16506a;
        String string2;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        String line;
        if (c5357o == null) {
            return null;
        }
        String str3 = c5357o.f21783a;
        String str4 = c5357o.f21786d;
        String str5 = c5357o.f21787e;
        JSONObject jSONObject2 = c5357o.f21785c;
        String str6 = c5357o.f21784b;
        AbstractC12350b.m34577Z("IterableRequest", ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        m16405c();
        try {
            String str7 = "======================================";
            try {
                if (str4 == "GET") {
                    try {
                        Uri.Builder builderBuildUpon = Uri.parse("https://api.iterable.com/api/" + str6).buildUpon();
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                builderBuildUpon.appendQueryParameter(next, jSONObject2.getString(next));
                            } catch (IOException e5) {
                                e = e5;
                                str = "IterableRequest";
                                string = null;
                                httpURLConnection = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            } catch (ArrayIndexOutOfBoundsException e13) {
                                e = e13;
                                str = "IterableRequest";
                                string = null;
                                httpURLConnection = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            } catch (JSONException e14) {
                                e = e14;
                                str = "IterableRequest";
                                string = null;
                                httpURLConnection = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            } catch (Exception e15) {
                                e = e15;
                                str = "IterableRequest";
                                string = null;
                                httpURLConnection = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            }
                        }
                        httpURLConnection = (HttpURLConnection) new URL(builderBuildUpon.build().toString()).openConnection();
                        try {
                            httpURLConnection.setReadTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
                            httpURLConnection.setConnectTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
                            httpURLConnection.setRequestProperty("Api-Key", str3);
                            httpURLConnection.setRequestProperty("SDK-Platform", "Android");
                            httpURLConnection.setRequestProperty("SDK-Version", "3.6.6");
                            httpURLConnection.setRequestProperty("Sent-At", String.valueOf(new Date().getTime() / 1000));
                            httpURLConnection.setRequestProperty("SDK-Request-Processor", c5357o.f21788f.toString());
                            if (str5 != null) {
                                try {
                                    httpURLConnection.setRequestProperty(TokenAuthInterceptor.AUTH_HEADER, "Bearer " + str5);
                                } catch (IOException e16) {
                                    e = e16;
                                    str7 = str7;
                                    str = "IterableRequest";
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (ArrayIndexOutOfBoundsException e17) {
                                    e = e17;
                                    str7 = str7;
                                    str = "IterableRequest";
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (JSONException e18) {
                                    e = e18;
                                    str7 = str7;
                                    str = "IterableRequest";
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (Exception e19) {
                                    e = e19;
                                    str7 = str7;
                                    str = "IterableRequest";
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                }
                            }
                            str2 = "IterableRequest";
                            try {
                                AbstractC12350b.m34577Z(str2, "GET Request \nURI : https://api.iterable.com/api/" + str6 + m16403a(httpURLConnection) + "\n body : \n" + jSONObject2.toString(2));
                                str = str2;
                                str7 = str7;
                                try {
                                    try {
                                        AbstractC12350b.m34577Z(str, str7);
                                        responseCode = httpURLConnection.getResponseCode();
                                        try {
                                            if (responseCode < 400) {
                                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                            } else {
                                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                                            }
                                            stringBuffer = new StringBuffer();
                                            while (true) {
                                                line = bufferedReader.readLine();
                                                if (line != null) {
                                                    break;
                                                }
                                                stringBuffer.append(line);
                                            }
                                            bufferedReader.close();
                                            string = stringBuffer.toString();
                                            message = null;
                                        } catch (IOException e22) {
                                            m16407e(c5357o, e22);
                                            message = e22.getMessage();
                                            string = null;
                                        }
                                        try {
                                            jSONObject = new JSONObject(string);
                                            try {
                                                AbstractC12350b.m34577Z(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nResponse from : https://api.iterable.com/api/" + str6);
                                                AbstractC12350b.m34577Z(str, jSONObject.toString(2));
                                                message2 = null;
                                            } catch (Exception e24) {
                                                e = e24;
                                                try {
                                                    m16407e(c5357o, e);
                                                    message2 = e.getMessage();
                                                } catch (IOException e25) {
                                                    e = e25;
                                                    m16407e(c5357o, e);
                                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    AbstractC12350b.m34577Z(str, str7);
                                                    return c5360pM16506a;
                                                } catch (ArrayIndexOutOfBoundsException e26) {
                                                    e = e26;
                                                    m16407e(c5357o, e);
                                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    AbstractC12350b.m34577Z(str, str7);
                                                    return c5360pM16506a;
                                                } catch (JSONException e27) {
                                                    e = e27;
                                                    m16407e(c5357o, e);
                                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    AbstractC12350b.m34577Z(str, str7);
                                                    return c5360pM16506a;
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    m16407e(c5357o, e);
                                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                                    if (httpURLConnection != null) {
                                                    }
                                                    AbstractC12350b.m34577Z(str, str7);
                                                    return c5360pM16506a;
                                                }
                                            }
                                        } catch (Exception e29) {
                                            e = e29;
                                            jSONObject = null;
                                        }
                                        if (responseCode == 401) {
                                            if (m16409g(jSONObject)) {
                                                C5360p c5360pM16506a2 = C5360p.m16506a(responseCode, string, jSONObject, "JWT Authorization header error");
                                                C5369s c5369sM16484c = C5341k.m16480f().m16484c();
                                                m16406d(jSONObject);
                                                c5369sM16484c.getClass();
                                                m16410h(c5357o);
                                                c5360pM16506a = c5360pM16506a2;
                                            } else {
                                                c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, "Invalid API Key");
                                            }
                                        } else if (responseCode >= 400) {
                                            string2 = "Invalid Request";
                                            if (jSONObject == null && jSONObject.has(NotificationCompat.CATEGORY_MESSAGE)) {
                                                string2 = jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE);
                                            } else if (responseCode >= 500) {
                                                string2 = "Internal Server Error";
                                            }
                                            c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, string2);
                                        } else if (responseCode == 200) {
                                            c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, "Received non-200 response: " + responseCode);
                                        } else if (message == null || string.length() <= 0) {
                                            if (message != null && string.length() == 0) {
                                                c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, "No data received");
                                            } else if (message != null) {
                                                c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, message);
                                            } else {
                                                c5360pM16506a = null;
                                            }
                                        } else if (message2 != null) {
                                            c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, "Could not parse json: " + message2);
                                        } else {
                                            c5360pM16506a = jSONObject != null ? C5360p.m16507b(responseCode, string, jSONObject) : C5360p.m16506a(responseCode, string, jSONObject, "Response is not a JSON object");
                                        }
                                    } catch (IOException e34) {
                                        e = e34;
                                        string = null;
                                        m16407e(c5357o, e);
                                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        AbstractC12350b.m34577Z(str, str7);
                                        return c5360pM16506a;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e35) {
                                    e = e35;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (JSONException e36) {
                                    e = e36;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (Exception e37) {
                                    e = e37;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                }
                            } catch (IOException e38) {
                                e = e38;
                                str = str2;
                                str7 = str7;
                                string = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            } catch (ArrayIndexOutOfBoundsException e39) {
                                e = e39;
                                str = str2;
                                str7 = str7;
                                string = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            } catch (JSONException e44) {
                                e = e44;
                                str = str2;
                                str7 = str7;
                                string = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            } catch (Exception e45) {
                                e = e45;
                                str = str2;
                                str7 = str7;
                                string = null;
                                m16407e(c5357o, e);
                                c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                AbstractC12350b.m34577Z(str, str7);
                                return c5360pM16506a;
                            }
                        } catch (IOException e46) {
                            e = e46;
                            str2 = "IterableRequest";
                        } catch (ArrayIndexOutOfBoundsException e47) {
                            e = e47;
                            str2 = "IterableRequest";
                        } catch (JSONException e48) {
                            e = e48;
                            str2 = "IterableRequest";
                        } catch (Exception e49) {
                            e = e49;
                            str2 = "IterableRequest";
                        }
                    } catch (IOException e54) {
                        e = e54;
                        str = "IterableRequest";
                    } catch (ArrayIndexOutOfBoundsException e55) {
                        e = e55;
                        str = "IterableRequest";
                    } catch (JSONException e56) {
                        e = e56;
                        str = "IterableRequest";
                    } catch (Exception e57) {
                        e = e57;
                        str = "IterableRequest";
                    }
                    httpURLConnection.disconnect();
                } else {
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://api.iterable.com/api/" + str6).openConnection();
                        try {
                            try {
                                httpURLConnection2.setDoOutput(true);
                                httpURLConnection2.setRequestMethod(str4);
                                httpURLConnection2.setReadTimeout(ErrorCodes.TracksErrors.cGenericTrack);
                                httpURLConnection2.setConnectTimeout(ErrorCodes.TracksErrors.cGenericTrack);
                                httpURLConnection2.setRequestProperty("Accept", "application/json");
                                httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                                httpURLConnection2.setRequestProperty("Api-Key", str3);
                                httpURLConnection2.setRequestProperty("SDK-Platform", "Android");
                                httpURLConnection2.setRequestProperty("SDK-Version", "3.6.6");
                                httpURLConnection2.setRequestProperty("Sent-At", String.valueOf(new Date().getTime() / 1000));
                                httpURLConnection2.setRequestProperty("SDK-Request-Processor", c5357o.f21788f.toString());
                                if (str5 != null) {
                                    try {
                                        httpURLConnection2.setRequestProperty(TokenAuthInterceptor.AUTH_HEADER, "Bearer ".concat(str5));
                                    } catch (IOException e58) {
                                        e = e58;
                                        httpURLConnection = httpURLConnection2;
                                        str7 = str7;
                                        str = "IterableRequest";
                                        string = null;
                                        m16407e(c5357o, e);
                                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        AbstractC12350b.m34577Z(str, str7);
                                        return c5360pM16506a;
                                    } catch (ArrayIndexOutOfBoundsException e59) {
                                        e = e59;
                                        httpURLConnection = httpURLConnection2;
                                        str7 = str7;
                                        str = "IterableRequest";
                                        string = null;
                                        m16407e(c5357o, e);
                                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        AbstractC12350b.m34577Z(str, str7);
                                        return c5360pM16506a;
                                    } catch (JSONException e64) {
                                        e = e64;
                                        httpURLConnection = httpURLConnection2;
                                        str7 = str7;
                                        str = "IterableRequest";
                                        string = null;
                                        m16407e(c5357o, e);
                                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        AbstractC12350b.m34577Z(str, str7);
                                        return c5360pM16506a;
                                    } catch (Exception e65) {
                                        e = e65;
                                        httpURLConnection = httpURLConnection2;
                                        str7 = str7;
                                        str = "IterableRequest";
                                        string = null;
                                        m16407e(c5357o, e);
                                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                        }
                                        AbstractC12350b.m34577Z(str, str7);
                                        return c5360pM16506a;
                                    }
                                }
                                str = "IterableRequest";
                                try {
                                    AbstractC12350b.m34577Z(str, "POST Request \nURI : https://api.iterable.com/api/" + str6 + m16403a(httpURLConnection2) + "\n body : \n" + jSONObject2.toString(2));
                                    OutputStream outputStream = httpURLConnection2.getOutputStream();
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                                    bufferedWriter.write(jSONObject2.toString());
                                    bufferedWriter.close();
                                    outputStream.close();
                                    httpURLConnection = httpURLConnection2;
                                    str7 = str7;
                                    AbstractC12350b.m34577Z(str, str7);
                                    responseCode = httpURLConnection.getResponseCode();
                                    if (responseCode < 400) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                    } else {
                                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
                                    }
                                    stringBuffer = new StringBuffer();
                                    while (true) {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            break;
                                            break;
                                        }
                                        stringBuffer.append(line);
                                    }
                                    bufferedReader.close();
                                    string = stringBuffer.toString();
                                    message = null;
                                    jSONObject = new JSONObject(string);
                                    AbstractC12350b.m34577Z(str, "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nResponse from : https://api.iterable.com/api/" + str6);
                                    AbstractC12350b.m34577Z(str, jSONObject.toString(2));
                                    message2 = null;
                                    if (responseCode == 401) {
                                        if (m16409g(jSONObject)) {
                                            C5360p c5360pM16506a3 = C5360p.m16506a(responseCode, string, jSONObject, "JWT Authorization header error");
                                            C5369s c5369sM16484c2 = C5341k.m16480f().m16484c();
                                            m16406d(jSONObject);
                                            c5369sM16484c2.getClass();
                                            m16410h(c5357o);
                                            c5360pM16506a = c5360pM16506a3;
                                        } else {
                                            c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, "Invalid API Key");
                                        }
                                    } else if (responseCode >= 400) {
                                        string2 = "Invalid Request";
                                        if (jSONObject == null) {
                                            if (responseCode >= 500) {
                                                string2 = "Internal Server Error";
                                            }
                                        } else if (responseCode >= 500) {
                                            string2 = "Internal Server Error";
                                        }
                                        c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, string2);
                                    } else if (responseCode == 200) {
                                        c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, "Received non-200 response: " + responseCode);
                                    } else if (message == null) {
                                        if (message != null) {
                                            if (message != null) {
                                                c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, message);
                                            } else {
                                                c5360pM16506a = null;
                                            }
                                        } else if (message != null) {
                                            c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, message);
                                        } else {
                                            c5360pM16506a = null;
                                        }
                                    } else if (message != null) {
                                        if (message != null) {
                                            c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, message);
                                        } else {
                                            c5360pM16506a = null;
                                        }
                                    } else if (message != null) {
                                        c5360pM16506a = C5360p.m16506a(responseCode, string, jSONObject, message);
                                    } else {
                                        c5360pM16506a = null;
                                    }
                                } catch (IOException e66) {
                                    e = e66;
                                    httpURLConnection = httpURLConnection2;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (ArrayIndexOutOfBoundsException e67) {
                                    e = e67;
                                    httpURLConnection = httpURLConnection2;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (JSONException e68) {
                                    e = e68;
                                    httpURLConnection = httpURLConnection2;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                } catch (Exception e69) {
                                    e = e69;
                                    httpURLConnection = httpURLConnection2;
                                    string = null;
                                    m16407e(c5357o, e);
                                    c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    AbstractC12350b.m34577Z(str, str7);
                                    return c5360pM16506a;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                r10 = httpURLConnection2;
                                if (r10 != 0) {
                                    r10.disconnect();
                                }
                                throw th;
                            }
                        } catch (IOException e72) {
                            e = e72;
                            str = "IterableRequest";
                        } catch (ArrayIndexOutOfBoundsException e74) {
                            e = e74;
                            str = "IterableRequest";
                        } catch (JSONException e75) {
                            e = e75;
                            str = "IterableRequest";
                        } catch (Exception e76) {
                            e = e76;
                            str = "IterableRequest";
                        }
                    } catch (IOException e77) {
                        e = e77;
                        str = "IterableRequest";
                        string = null;
                        httpURLConnection = null;
                        m16407e(c5357o, e);
                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        AbstractC12350b.m34577Z(str, str7);
                        return c5360pM16506a;
                    } catch (ArrayIndexOutOfBoundsException e78) {
                        e = e78;
                        str = "IterableRequest";
                        string = null;
                        httpURLConnection = null;
                        m16407e(c5357o, e);
                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        AbstractC12350b.m34577Z(str, str7);
                        return c5360pM16506a;
                    } catch (JSONException e79) {
                        e = e79;
                        str = "IterableRequest";
                        string = null;
                        httpURLConnection = null;
                        m16407e(c5357o, e);
                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        AbstractC12350b.m34577Z(str, str7);
                        return c5360pM16506a;
                    } catch (Exception e84) {
                        e = e84;
                        str = "IterableRequest";
                        string = null;
                        httpURLConnection = null;
                        m16407e(c5357o, e);
                        c5360pM16506a = C5360p.m16506a(0, string, null, e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        AbstractC12350b.m34577Z(str, str7);
                        return c5360pM16506a;
                    }
                    httpURLConnection.disconnect();
                }
                AbstractC12350b.m34577Z(str, str7);
                return c5360pM16506a;
            } catch (Throwable th4) {
                th = th4;
                r10 = 0;
            }
        } catch (Throwable th5) {
            th = th5;
            r10 = str4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16405c() {
        C5341k.f21742r.f21744b.getClass();
    }

    /* JADX INFO: renamed from: d */
    public static void m16406d(JSONObject jSONObject) {
        String str;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(NotificationCompat.CATEGORY_MESSAGE)) {
                    String lowerCase = jSONObject.getString(NotificationCompat.CATEGORY_MESSAGE).toLowerCase();
                    switch (lowerCase.hashCode()) {
                        case -1798300651:
                            str = "email could not be found";
                            break;
                        case -1637373127:
                            str = "exp must be less than 1 year from iat";
                            break;
                        case -1146775046:
                            str = "jwt is invalid";
                            break;
                        case -1106130705:
                            str = "jwt token is expired";
                            break;
                        case -481783598:
                            str = "jwt authorization header is not set";
                            break;
                        case 1952848923:
                            str = "jwt token has been invalidated";
                            break;
                        case 2107082853:
                            str = "invalid payload";
                            break;
                        case 2124430769:
                            str = "jwt format is invalid";
                            break;
                        case 2142617325:
                            str = "jwt payload requires a value for userid or email";
                            break;
                        default:
                            return;
                    }
                    lowerCase.equals(str);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m16407e(C5357o c5357o, Exception exc) {
        AbstractC12350b.m34595p("IterableRequest", "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\nException occurred for : https://api.iterable.com/api/" + c5357o.f21784b);
        AbstractC12350b.m34596q("IterableRequest", exc.getMessage(), exc);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m16408f(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.has("code") && jSONObject.getString("code").equals(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16409g(JSONObject jSONObject) {
        return m16408f("InvalidJwtPayload", jSONObject) || m16408f("BadAuthorizationHeader", jSONObject) || m16408f("JwtUserIdentifiersMismatched", jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public static void m16410h(C5357o c5357o) {
        C5341k.f21742r.m16484c().getClass();
        C5341k.f21742r.m16484c().m16518e(C5341k.f21742r.m16484c().f21822z.f21773a, false, new C5392z1(c5357o));
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C5357o[] c5357oArr = (C5357o[]) objArr;
        if (c5357oArr != null && c5357oArr.length > 0) {
            this.f21634b = c5357oArr[0];
        }
        return m16404b(this.f21634b);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        C5360p c5360p = (C5360p) obj;
        boolean z4 = c5360p.f21797a;
        if (!z4 && c5360p.f21798b >= 500 && this.f21633a <= 5) {
            AsyncTaskC5304a2 asyncTaskC5304a2 = new AsyncTaskC5304a2();
            asyncTaskC5304a2.f21633a = this.f21633a + 1;
            int i13 = this.f21633a;
            f21632c.postDelayed(new RunnableC12316s(this, asyncTaskC5304a2, false, 5), i13 > 2 ? ((long) i13) * 2000 : 0L);
            return;
        }
        if (z4) {
            if (!Objects.equals(this.f21634b.f21784b, "mobile/getRemoteConfiguration") && !Objects.equals(this.f21634b.f21784b, "users/disableDevice")) {
                C5341k.f21742r.m16484c().getClass();
                C5341k.f21742r.m16484c().getClass();
                C5341k.f21742r.m16484c().getClass();
            }
            C5392z1 c5392z1 = this.f21634b.f21790h;
            if (c5392z1 != null) {
                c5392z1.m16544a(c5360p.f21800d);
            }
        } else {
            this.f21634b.getClass();
        }
        InterfaceC5322f0 interfaceC5322f0 = this.f21634b.f21789g;
        if (interfaceC5322f0 != null) {
            interfaceC5322f0.mo11170i(c5360p.f21799c);
        }
        super.onPostExecute(c5360p);
    }
}
