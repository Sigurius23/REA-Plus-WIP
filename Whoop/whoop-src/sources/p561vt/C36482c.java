package p561vt;

import ae3.C0803k;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p035bp.C3512c;
import p437qt.C30581d;
import p437qt.InterfaceC30583f;
import p497t7.InterfaceC33561b;
import p529uo.AbstractC35135w;
import p687zo.AbstractC40909b;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: vt.c */
/* JADX INFO: loaded from: classes.dex */
public final class C36482c {

    /* JADX INFO: renamed from: d */
    public static final Pattern f155821d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    public static final Charset f155822e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f155823a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC32956a f155824b;

    /* JADX INFO: renamed from: c */
    public final C36483d f155825c = new C36483d();

    public C36482c(Context context, InterfaceC32956a interfaceC32956a) {
        this.f155823a = context;
        this.f155824b = interfaceC32956a;
    }

    /* JADX INFO: renamed from: a */
    public static URL m116905a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e5) {
            throw new FirebaseInstallationsException(e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m116906b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f155822e));
            try {
                StringBuilder sb4 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb4.append(line);
                    sb4.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb4);
            } catch (IOException unused) {
            } catch (Throwable th3) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th3;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", AbstractC2875y.m8300m("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : AbstractC11266d.m30461o(", ", str)));
    }

    /* JADX INFO: renamed from: d */
    public static long m116907d(String str) {
        AbstractC35135w.m111090b(f155821d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: e */
    public static C36480a m116908e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f155822e));
        C0803k c0803kM116904a = C36481b.m116904a();
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        C36481b c36481b = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                strNextString = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                strNextString2 = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                strNextString3 = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        c0803kM116904a.f2966d = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        c0803kM116904a.f2965c = Long.valueOf(m116907d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                C36481b c36481bM1944a = c0803kM116904a.m1944a();
                jsonReader.endObject();
                c36481b = c36481bM1944a;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C36480a(strNextString, strNextString2, strNextString3, c36481b, 1);
    }

    /* JADX INFO: renamed from: f */
    public static C36481b m116909f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f155822e));
        C0803k c0803kM116904a = C36481b.m116904a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                c0803kM116904a.f2966d = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                c0803kM116904a.f2965c = Long.valueOf(m116907d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        c0803kM116904a.f2964b = 1;
        return c0803kM116904a.m1944a();
    }

    /* JADX INFO: renamed from: g */
    public static void m116910g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            m116912i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m116911h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m116912i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e5) {
            throw new IllegalStateException(e5);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m116912i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX INFO: renamed from: c */
    public final HttpURLConnection m116913c(URL url, String str) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.f155823a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            InterfaceC30583f interfaceC30583f = (InterfaceC30583f) this.f155824b.get();
            if (interfaceC30583f != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((C30581d) interfaceC30583f).m93813a()));
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e5);
                } catch (ExecutionException e13) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e13);
                }
            }
            String string = null;
            try {
                PackageInfo packageInfo = ((Context) C3512c.m10398a(context).f3422w).getPackageManager().getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr == null || signatureArr.length != 1) {
                    bArrDigest = null;
                } else {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 2) {
                            messageDigest = null;
                            break;
                        }
                        try {
                            messageDigest = MessageDigest.getInstance("SHA1");
                            if (messageDigest != null) {
                                break;
                            }
                            i13++;
                        } catch (NoSuchAlgorithmException unused) {
                        }
                    }
                    if (messageDigest == null) {
                        bArrDigest = null;
                    } else {
                        bArrDigest = messageDigest.digest(packageInfo.signatures[0].toByteArray());
                    }
                }
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb4 = new StringBuilder(length + length);
                    for (int i14 = 0; i14 < length; i14++) {
                        char[] cArr = AbstractC40909b.f176318a;
                        sb4.append(cArr[(bArrDigest[i14] & 240) >>> 4]);
                        sb4.append(cArr[bArrDigest[i14] & 15]);
                    }
                    string = sb4.toString();
                }
            } catch (PackageManager.NameNotFoundException e14) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e14);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
