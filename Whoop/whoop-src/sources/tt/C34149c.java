package tt;

import ae3.C0803k;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import gt.C16165d;
import gt.C16173l;
import ht.ExecutorC17621j;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p073cq.C11040i;
import p073cq.C11052u;
import p098dt.C12355g;
import p108e4.AbstractC12682p;
import p249jc.C21567b;
import p529uo.AbstractC35135w;
import p533ut.C35227a;
import p533ut.C35228b;
import p561vt.C36480a;
import p561vt.C36481b;
import p561vt.C36482c;
import p561vt.C36483d;
import pa3.C29039b;
import pg3.C29203o;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: tt.c */
/* JADX INFO: loaded from: classes.dex */
public final class C34149c implements InterfaceC34150d {

    /* JADX INFO: renamed from: m */
    public static final Object f143137m = new Object();

    /* JADX INFO: renamed from: a */
    public final C12355g f143138a;

    /* JADX INFO: renamed from: b */
    public final C36482c f143139b;

    /* JADX INFO: renamed from: c */
    public final C29203o f143140c;

    /* JADX INFO: renamed from: d */
    public final C34155i f143141d;

    /* JADX INFO: renamed from: e */
    public final C16173l f143142e;

    /* JADX INFO: renamed from: f */
    public final C34153g f143143f;

    /* JADX INFO: renamed from: g */
    public final Object f143144g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f143145h;

    /* JADX INFO: renamed from: i */
    public final ExecutorC17621j f143146i;

    /* JADX INFO: renamed from: j */
    public String f143147j;

    /* JADX INFO: renamed from: k */
    public final HashSet f143148k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f143149l;

    static {
        new AtomicInteger(1);
    }

    public C34149c(C12355g c12355g, InterfaceC32956a interfaceC32956a, ExecutorService executorService, ExecutorC17621j executorC17621j) {
        c12355g.m34610a();
        C36482c c36482c = new C36482c(c12355g.f41519a, interfaceC32956a);
        C29203o c29203o = new C29203o(c12355g);
        if (C21567b.f82709x == null) {
            C21567b.f82709x = new C21567b(28);
        }
        C21567b c21567b = C21567b.f82709x;
        if (C34155i.f143157d == null) {
            C34155i.f143157d = new C34155i(c21567b);
        }
        C34155i c34155i = C34155i.f143157d;
        C16173l c16173l = new C16173l(new C16165d(c12355g, 2));
        C34153g c34153g = new C34153g();
        this.f143144g = new Object();
        this.f143148k = new HashSet();
        this.f143149l = new ArrayList();
        this.f143138a = c12355g;
        this.f143139b = c36482c;
        this.f143140c = c29203o;
        this.f143141d = c34155i;
        this.f143142e = c16173l;
        this.f143143f = c34153g;
        this.f143145h = executorService;
        this.f143146i = executorC17621j;
    }

    /* JADX INFO: renamed from: a */
    public final void m107920a() {
        C35227a c35227aM88704t0;
        synchronized (f143137m) {
            try {
                C12355g c12355g = this.f143138a;
                c12355g.m34610a();
                C29203o c29203oM88698n0 = C29203o.m88698n0(c12355g.f41519a);
                try {
                    c35227aM88704t0 = this.f143140c.m88704t0();
                    int i13 = c35227aM88704t0.f149824b;
                    boolean z4 = true;
                    if (i13 != 2 && i13 != 1) {
                        z4 = false;
                    }
                    if (z4) {
                        String strM107925f = m107925f(c35227aM88704t0);
                        C29203o c29203o = this.f143140c;
                        C29039b c29039bM111610a = c35227aM88704t0.m111610a();
                        c29039bM111610a.f117523b = strM107925f;
                        c29039bM111610a.f117524c = 3;
                        c35227aM88704t0 = c29039bM111610a.m88283a();
                        c29203o.m88701q0(c35227aM88704t0);
                    }
                    if (c29203oM88698n0 != null) {
                        c29203oM88698n0.m88705u0();
                    }
                } catch (Throwable th3) {
                    if (c29203oM88698n0 != null) {
                        c29203oM88698n0.m88705u0();
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        m107928i(c35227aM88704t0);
        this.f143146i.execute(new RunnableC34148b(this, 2));
    }

    /* JADX INFO: renamed from: b */
    public final C35227a m107921b(C35227a c35227a) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionM116913c;
        C36481b c36481bM116909f;
        C36482c c36482c = this.f143139b;
        C12355g c12355g = this.f143138a;
        c12355g.m34610a();
        String str = c12355g.f41521c.f41533a;
        String str2 = c35227a.f149823a;
        C12355g c12355g2 = this.f143138a;
        c12355g2.m34610a();
        String str3 = c12355g2.f41521c.f41539g;
        String str4 = c35227a.f149826d;
        C36483d c36483d = c36482c.f155825c;
        if (!c36483d.m116914a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM116905a = C36482c.m116905a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i13 = 0;
        while (true) {
            if (i13 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionM116913c = c36482c.m116913c(urlM116905a, str);
            try {
                try {
                    httpURLConnectionM116913c.setRequestMethod("POST");
                    httpURLConnectionM116913c.addRequestProperty(TokenAuthInterceptor.AUTH_HEADER, "FIS_v2 " + str4);
                    httpURLConnectionM116913c.setDoOutput(true);
                    C36482c.m116911h(httpURLConnectionM116913c);
                    int responseCode = httpURLConnectionM116913c.getResponseCode();
                    c36483d.m116915b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c36481bM116909f = C36482c.m116909f(httpURLConnectionM116913c);
                        break;
                    }
                    C36482c.m116906b(httpURLConnectionM116913c, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        C0803k c0803kM116904a = C36481b.m116904a();
                        c0803kM116904a.f2964b = 3;
                        c36481bM116909f = c0803kM116904a.m1944a();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        C0803k c0803kM116904a2 = C36481b.m116904a();
                        c0803kM116904a2.f2964b = 2;
                        c36481bM116909f = c0803kM116904a2.m1944a();
                        break;
                    }
                    httpURLConnectionM116913c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i13++;
                } catch (Throwable th3) {
                    httpURLConnectionM116913c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th3;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionM116913c.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iM35485e = AbstractC12682p.m35485e(c36481bM116909f.f155820c);
        if (iM35485e != 0) {
            if (iM35485e == 1) {
                C29039b c29039bM111610a = c35227a.m111610a();
                c29039bM111610a.f117529h = "BAD CONFIG";
                c29039bM111610a.f117524c = 5;
                return c29039bM111610a.m88283a();
            }
            if (iM35485e != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.f143147j = null;
            }
            C29039b c29039bM111610a2 = c35227a.m111610a();
            c29039bM111610a2.f117524c = 2;
            return c29039bM111610a2.m88283a();
        }
        String str5 = c36481bM116909f.f155818a;
        long j7 = c36481bM116909f.f155819b;
        C34155i c34155i = this.f143141d;
        c34155i.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c34155i.f143158a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        C29039b c29039bM111610a3 = c35227a.m111610a();
        c29039bM111610a3.f117525d = str5;
        c29039bM111610a3.f117527f = Long.valueOf(j7);
        c29039bM111610a3.f117528g = Long.valueOf(seconds);
        return c29039bM111610a3.m88283a();
    }

    /* JADX INFO: renamed from: c */
    public final C11052u m107922c() {
        String str;
        m107924e();
        synchronized (this) {
            str = this.f143147j;
        }
        if (str != null) {
            return Tasks.m15640d(str);
        }
        C11040i c11040i = new C11040i();
        C34152f c34152f = new C34152f(c11040i);
        synchronized (this.f143144g) {
            this.f143149l.add(c34152f);
        }
        C11052u c11052u = c11040i.f34644a;
        this.f143145h.execute(new RunnableC34148b(this, 0));
        return c11052u;
    }

    /* JADX INFO: renamed from: d */
    public final C11052u m107923d() {
        m107924e();
        C11040i c11040i = new C11040i();
        C34151e c34151e = new C34151e(this.f143141d, c11040i);
        synchronized (this.f143144g) {
            this.f143149l.add(c34151e);
        }
        C11052u c11052u = c11040i.f34644a;
        this.f143145h.execute(new RunnableC34148b(this, 1));
        return c11052u;
    }

    /* JADX INFO: renamed from: e */
    public final void m107924e() {
        C12355g c12355g = this.f143138a;
        c12355g.m34610a();
        AbstractC35135w.m111093e(c12355g.f41521c.f41534b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c12355g.m34610a();
        AbstractC35135w.m111093e(c12355g.f41521c.f41539g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c12355g.m34610a();
        AbstractC35135w.m111093e(c12355g.f41521c.f41533a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c12355g.m34610a();
        String str = c12355g.f41521c.f41534b;
        Pattern pattern = C34155i.f143156c;
        AbstractC35135w.m111090b(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c12355g.m34610a();
        AbstractC35135w.m111090b(C34155i.f143156c.matcher(c12355g.f41521c.f41533a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX INFO: renamed from: f */
    public final String m107925f(C35227a c35227a) {
        C35228b c35228b;
        String string;
        C12355g c12355g = this.f143138a;
        c12355g.m34610a();
        if (!c12355g.f41520b.equals("CHIME_ANDROID_SDK")) {
            C12355g c12355g2 = this.f143138a;
            c12355g2.m34610a();
            if ("[DEFAULT]".equals(c12355g2.f41520b)) {
                if (c35227a.f149824b == 1) {
                    c35228b = (C35228b) this.f143142e.get();
                    synchronized (c35228b.f149831a) {
                        try {
                            synchronized (c35228b.f149831a) {
                                string = c35228b.f149831a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = c35228b.m111611a();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f143143f.getClass();
                    return C34153g.m107931a();
                }
            }
        } else if (c35227a.f149824b == 1) {
            c35228b = (C35228b) this.f143142e.get();
            synchronized (c35228b.f149831a) {
                synchronized (c35228b.f149831a) {
                    string = c35228b.f149831a.getString("|S|id", null);
                    if (string != null) {
                        string = c35228b.m111611a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f143143f.getClass();
                    return C34153g.m107931a();
                }
            }
        }
        this.f143143f.getClass();
        return C34153g.m107931a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [vt.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [vt.a] */
    /* JADX INFO: renamed from: g */
    public final C35227a m107926g(C35227a c35227a) throws FirebaseInstallationsException {
        String str = c35227a.f149823a;
        String string = null;
        if (str != null && str.length() == 11) {
            C35228b c35228b = (C35228b) this.f143142e.get();
            synchronized (c35228b.f149831a) {
                try {
                    String[] strArr = C35228b.f149830c;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= 4) {
                            break;
                        }
                        String str2 = strArr[i13];
                        String string2 = c35228b.f149831a.getString("|T|" + c35228b.f149832b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i13++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        C36482c c36482c = this.f143139b;
        C12355g c12355g = this.f143138a;
        c12355g.m34610a();
        String str3 = c12355g.f41521c.f41533a;
        String str4 = c35227a.f149823a;
        C12355g c12355g2 = this.f143138a;
        c12355g2.m34610a();
        String str5 = c12355g2.f41521c.f41539g;
        C12355g c12355g3 = this.f143138a;
        c12355g3.m34610a();
        String str6 = c12355g3.f41521c.f41534b;
        C36483d c36483d = c36482c.f155825c;
        if (!c36483d.m116914a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM116905a = C36482c.m116905a("projects/" + str5 + "/installations");
        int i14 = 0;
        C36480a c36480a = c36482c;
        while (i14 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM116913c = c36480a.m116913c(urlM116905a, str3);
            try {
                try {
                    httpURLConnectionM116913c.setRequestMethod("POST");
                    httpURLConnectionM116913c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM116913c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C36482c.m116910g(httpURLConnectionM116913c, str4, str6);
                    int responseCode = httpURLConnectionM116913c.getResponseCode();
                    c36483d.m116915b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        C36480a c36480aM116908e = C36482c.m116908e(httpURLConnectionM116913c);
                        httpURLConnectionM116913c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c36480a = c36480aM116908e;
                    } else {
                        try {
                            C36482c.m116906b(httpURLConnectionM116913c, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                C36480a c36480a2 = new C36480a(null, null, null, null, 2);
                                httpURLConnectionM116913c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                c36480a = c36480a2;
                            } else {
                                httpURLConnectionM116913c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i14++;
                                c36480a = c36480a;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionM116913c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionM116913c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i14++;
                        c36480a = c36480a;
                    }
                    int iM35485e = AbstractC12682p.m35485e(c36480a.f155817e);
                    if (iM35485e != 0) {
                        if (iM35485e != 1) {
                            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        C29039b c29039bM111610a = c35227a.m111610a();
                        c29039bM111610a.f117529h = "BAD CONFIG";
                        c29039bM111610a.f117524c = 5;
                        return c29039bM111610a.m88283a();
                    }
                    String str7 = c36480a.f155814b;
                    String str8 = c36480a.f155815c;
                    C34155i c34155i = this.f143141d;
                    c34155i.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    c34155i.f143158a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    C36481b c36481b = c36480a.f155816d;
                    String str9 = c36481b.f155818a;
                    long j7 = c36481b.f155819b;
                    C29039b c29039bM111610a2 = c35227a.m111610a();
                    c29039bM111610a2.f117523b = str7;
                    c29039bM111610a2.f117524c = 4;
                    c29039bM111610a2.f117525d = str9;
                    c29039bM111610a2.f117526e = str8;
                    c29039bM111610a2.f117527f = Long.valueOf(j7);
                    c29039bM111610a2.f117528g = Long.valueOf(seconds);
                    return c29039bM111610a2.m88283a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th4) {
                httpURLConnectionM116913c.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th4;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX INFO: renamed from: h */
    public final void m107927h(Exception exc) {
        synchronized (this.f143144g) {
            try {
                Iterator it = this.f143149l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC34154h) it.next()).mo107929a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m107928i(C35227a c35227a) {
        synchronized (this.f143144g) {
            try {
                Iterator it = this.f143149l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC34154h) it.next()).mo107930b(c35227a)) {
                        it.remove();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
