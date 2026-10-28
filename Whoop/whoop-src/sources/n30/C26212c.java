package n30;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23465k;
import l83.C23467m;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import mx1.C26009o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p023ay.C2147u;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29922o0;
import q83.InterfaceC30063j;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: n30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C26212c implements InterfaceC26213d {

    /* JADX INFO: renamed from: E */
    public final C26211b f103926E;

    /* JADX INFO: renamed from: F */
    public final String f103927F;

    /* JADX INFO: renamed from: G */
    public final String f103928G;

    /* JADX INFO: renamed from: H */
    public final int f103929H;

    /* JADX INFO: renamed from: w */
    public final Context f103930w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC26210a f103931x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC30063j f103932y;

    /* JADX INFO: renamed from: z */
    public final AbstractC37926s0 f103933z;

    static {
        StandardCharsets.UTF_8.name();
    }

    public C26212c(Context context, C26215f c26215f, InterfaceC30063j workContext, AbstractC37926s0 abstractC37926s0, int i13) {
        InterfaceC26210a interfaceC26210a = (i13 & 2) != 0 ? C26211b.f103924w : c26215f;
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            workContext = ExecutorC22364d.f87316w;
        }
        abstractC37926s0 = (i13 & 8) != 0 ? C29922o0.f122220c : abstractC37926s0;
        C26211b c26211b = C26211b.f103925x;
        String localeCountry = Locale.getDefault().getCountry();
        int i14 = Build.VERSION.SDK_INT;
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(localeCountry, "localeCountry");
        this.f103930w = context;
        this.f103931x = interfaceC26210a;
        this.f103932y = workContext;
        this.f103933z = abstractC37926s0;
        this.f103926E = c26211b;
        this.f103927F = "release";
        this.f103928G = localeCountry;
        this.f103929H = i14;
    }

    /* JADX INFO: renamed from: a */
    public static final void m77826a(C26212c c26212c, JSONObject jSONObject) throws IOException {
        c26212c.f103926E.getClass();
        URLConnection uRLConnectionOpenConnection = new URL("https://errors.stripe.com/api/426/store/").openConnection();
        AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        C23465k c23465k = new C23465k("Content-Type", "application/json; charset=utf-8");
        C23465k c23465k2 = new C23465k("User-Agent", "Android3ds2Sdk 22.6.1");
        C23465k c23465k3 = new C23465k("sentry_key", "dcb428fea25c40e7b99f81ae5981ee6a");
        C23465k c23465k4 = new C23465k("sentry_version", "7");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis);
        for (Map.Entry entry : AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("X-Sentry-Auth", AbstractC25265s.m74110N0(AbstractC37056f.m118959K("Sentry", AbstractC25265s.m74110N0(AbstractC37056f.m118959K(c23465k3, c23465k4, new C23465k("sentry_timestamp", seconds + "." + (jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds))), new C23465k("sentry_client", "Android3ds2Sdk 22.6.1")), ", ", null, null, new C26009o(15), 30)), " ", null, null, null, 62))).entrySet()) {
            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        try {
            AbstractC22676k.m65747g(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC22676k.m65749i(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(jSONObject.toString());
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
                httpsURLConnection.connect();
                httpsURLConnection.getResponseCode();
                httpsURLConnection.disconnect();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(outputStreamWriter, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC35854l.m113829i(outputStream, th5);
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m77827b(Throwable th3) throws JSONException {
        List<StackTraceElement> listM74055Z0;
        Object objM107888l;
        ApplicationInfo applicationInfo;
        JSONObject jSONObjectPut = new JSONObject().put("release", "com.stripe.android.stripe3ds2@22.6.1");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectPut2 = new JSONObject().put("type", th3.getClass().getCanonicalName());
        String message = th3.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("value", message);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray2 = new JSONArray();
        StackTraceElement[] stackTrace = th3.getStackTrace();
        AbstractC22676k.m65749i(stackTrace, "getStackTrace(...)");
        if (stackTrace.length == 0) {
            listM74055Z0 = C25271y.f99162w;
        } else {
            listM74055Z0 = AbstractC25260n.m74055Z0(stackTrace);
            Collections.reverse(listM74055Z0);
        }
        for (StackTraceElement stackTraceElement : listM74055Z0) {
            jSONArray2.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        JSONObject jSONObjectPut4 = jSONObject2.put("frames", jSONArray2);
        AbstractC22676k.m65749i(jSONObjectPut4, "put(...)");
        JSONObject jSONObjectPut5 = jSONObjectPut.put("exception", jSONObject.put("values", jSONArray.put(jSONObjectPut3.put("stacktrace", jSONObjectPut4))));
        JSONObject jSONObjectPut6 = new JSONObject().put("locale", this.f103928G).put("environment", this.f103927F).put("android_os_version", this.f103929H);
        for (Map.Entry entry : this.f103931x.mo77825b().entrySet()) {
            jSONObjectPut6.put((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject jSONObjectPut7 = jSONObjectPut5.put("tags", jSONObjectPut6);
        Context context = this.f103930w;
        try {
            objM107888l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        PackageInfo packageInfo = (PackageInfo) objM107888l;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(context.getPackageManager());
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObjectPut8 = new JSONObject().put("app_identifier", context.getPackageName()).put("app_name", charSequenceLoadLabel);
        String str = packageInfo != null ? packageInfo.versionName : null;
        JSONObject jSONObjectPut9 = jSONObject3.put("app", jSONObjectPut8.put("app_version", str != null ? str : ""));
        JSONObject jSONObjectPut10 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject jSONObjectPut11 = jSONObjectPut9.put("os", jSONObjectPut10.put("type", str2).put("build", Build.DISPLAY));
        JSONObject jSONObjectPut12 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray3 = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        AbstractC22676k.m65749i(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str3 : SUPPORTED_ABIS) {
            jSONArray3.put(str3);
        }
        JSONObject jSONObjectPut13 = jSONObjectPut11.put("device", jSONObjectPut12.put("archs", jSONArray3));
        AbstractC22676k.m65749i(jSONObjectPut13, "put(...)");
        JSONObject jSONObjectPut14 = jSONObjectPut7.put("contexts", jSONObjectPut13);
        AbstractC22676k.m65749i(jSONObjectPut14, "put(...)");
        return jSONObjectPut14;
    }

    /* JADX INFO: renamed from: c */
    public final void m77828c(Throwable th3) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f103932y), null, null, new C2147u(this, th3, null, 12), 3);
    }
}
