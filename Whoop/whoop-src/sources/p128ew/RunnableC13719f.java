package p128ew;

import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.RunnableC1283d;
import c93.InterfaceC4339a;
import com.mapbox.common.module.RunnableC5445c;
import e10.C12554k0;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p009a8.RunnableC0533c;
import p035bp.AbstractC3511b;
import p044c5.ExecutorC4220l;
import p087db.C11856j0;
import p100dw.C12399d;
import p100dw.InterfaceC12401f;
import p108e4.AbstractC12682p;
import p497t7.InterfaceC33561b;
import p673z7.C40137a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: ew.f */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC13719f implements Runnable {

    /* JADX INFO: renamed from: E */
    public final InterfaceC12401f f48696E;

    /* JADX INFO: renamed from: F */
    public final C40137a f48697F;

    /* JADX INFO: renamed from: w */
    public final C11856j0 f48698w;

    /* JADX INFO: renamed from: x */
    public final ExecutorC4220l f48699x;

    /* JADX INFO: renamed from: y */
    public final String f48700y;

    /* JADX INFO: renamed from: z */
    public final C12554k0 f48701z;

    public RunnableC13719f(C11856j0 c11856j0, ExecutorC4220l executorC4220l, String deviceSerial, C12554k0 c12554k0, InterfaceC12401f callback, C40137a c40137a) {
        AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
        AbstractC22676k.m65750j(callback, "callback");
        this.f48698w = c11856j0;
        this.f48699x = executorC4220l;
        this.f48700y = deviceSerial;
        this.f48701z = c12554k0;
        this.f48696E = callback;
        this.f48697F = c40137a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listM74093D1;
        ExecutorC4220l executorC4220l;
        C40137a c40137a;
        C13716c c13716c;
        ConcurrentLinkedQueue<byte[]> concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f48701z.f42881x;
        C22665e0 c22665e0 = new C22665e0();
        while (true) {
            ArrayList arrayList = new ArrayList();
            int i13 = 0;
            for (byte[] chunk : concurrentLinkedQueue) {
                if (i13 >= 100) {
                    break;
                }
                AbstractC22676k.m65749i(chunk, "chunk");
                arrayList.add(chunk);
                i13++;
            }
            listM74093D1 = AbstractC25265s.m74093D1(arrayList);
            boolean zIsEmpty = listM74093D1.isEmpty();
            executorC4220l = this.f48699x;
            if (zIsEmpty) {
                executorC4220l.execute(new RunnableC0533c(21, this, c22665e0));
                return;
            }
            c40137a = this.f48697F;
            Long lM128686f = c40137a.m128686f();
            if (lM128686f != null) {
                long jLongValue = lM128686f.longValue();
                Exception exc = new Exception("Detected send() before retry delay has passed!");
                AbstractC3511b.m10363C(exc, "Incorrect API usage", 3);
                executorC4220l.execute(new RunnableC5445c(this, jLongValue, exc, 2));
                return;
            }
            String deviceSerial = this.f48700y;
            AbstractC22676k.m65750j(deviceSerial, "deviceSerial");
            Uri uri = Uri.parse("https://chunks.memfault.com").buildUpon().appendPath("api").appendPath("v0").appendPath("chunks").appendPath(deviceSerial).appendQueryParameter("sdkPlatform", "android-cloud").appendQueryParameter("sdkVersion", "2.1.0").build();
            Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("Memfault-Project-Key", this.f48698w.f38685x), new C23465k("X-Request-ID", UUID.randomUUID().toString()));
            List list = listM74093D1;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C13718e(new C13714a((byte[]) it.next())));
            }
            C13717d c13717d = new C13717d(arrayList2);
            AbstractC22676k.m65749i(uri, "uri");
            String message = "POST " + uri.getPath() + " " + mapM73990Y.get("X-Request-ID");
            AbstractC22676k.m65750j(message, "message");
            if (AbstractC12682p.m35482b(6, 1) <= 0) {
                Log.v("MFLT-SDK", message);
            }
            String string = uri.toString();
            AbstractC22676k.m65749i(string, "uri.toString()");
            String message2 = "POST ".concat(string);
            AbstractC22676k.m65750j(message2, "message");
            if (AbstractC12682p.m35482b(6, 1) <= 0) {
                Log.v("MFLT-SDK", message2);
            }
            URL url = new URL(string);
            C22669g0 c22669g0 = new C22669g0();
            try {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setConnectTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
                httpURLConnection.setReadTimeout(DateTimeConstants.MILLIS_PER_MINUTE);
                c22669g0.f89336w = httpURLConnection;
                if (httpURLConnection instanceof HttpsURLConnection) {
                    SocketFactory socketFactory = SSLSocketFactory.getDefault();
                    AbstractC22676k.m65748h(socketFactory, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory((SSLSocketFactory) socketFactory);
                }
                for (Map.Entry entry : mapM73990Y.entrySet()) {
                    ((HttpURLConnection) c22669g0.f89336w).addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                String strM30461o = AbstractC11266d.m30461o("multipart/mixed; boundary=", c13717d.f48693b);
                if (strM30461o != null) {
                    ((HttpURLConnection) c22669g0.f89336w).addRequestProperty("Content-Type", strM30461o);
                }
                ((HttpURLConnection) c22669g0.f89336w).setFixedLengthStreamingMode(((Number) c13717d.f48694c.getValue()).intValue());
                ((HttpURLConnection) c22669g0.f89336w).setDoOutput(true);
                OutputStream outputStream = ((HttpURLConnection) c22669g0.f89336w).getOutputStream();
                try {
                    AbstractC22676k.m65749i(outputStream, "outputStream");
                    c13717d.m38859a(outputStream);
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = ((HttpURLConnection) c22669g0.f89336w).getResponseCode();
                    String responseMessage = ((HttpURLConnection) c22669g0.f89336w).getResponseMessage();
                    Map<String, List<String>> headerFields = ((HttpURLConnection) c22669g0.f89336w).getHeaderFields();
                    AbstractC22676k.m65748h(headerFields, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String?, kotlin.collections.List<kotlin.String>>");
                    InputStream responseBodyStream = responseCode > 299 ? ((HttpURLConnection) c22669g0.f89336w).getErrorStream() : ((HttpURLConnection) c22669g0.f89336w).getInputStream();
                    try {
                        ArrayList arrayList3 = new ArrayList(headerFields.size());
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            arrayList3.add(new C23465k(entry2.getKey(), AbstractC25265s.m74110N0(entry2.getValue(), null, null, null, null, 63)));
                            responseCode = responseCode;
                        }
                        int i14 = responseCode;
                        Map mapM74000i0 = AbstractC25247g0.m74000i0(arrayList3);
                        AbstractC22676k.m65749i(responseMessage, "responseMessage");
                        AbstractC22676k.m65749i(responseBodyStream, "responseBodyStream");
                        c13716c = new C13716c(i14, responseMessage, responseBodyStream, new C13715b(mapM74000i0), new C12554k0(c22669g0, 10));
                    } catch (Exception e5) {
                        e = e5;
                        String message3 = "POST failed ".concat(string);
                        AbstractC22676k.m65750j(message3, "message");
                        AbstractC3511b.m10363C(e, message3, 2);
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) c22669g0.f89336w;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        c13716c = null;
                    }
                    if (c13716c == null) {
                        break;
                    }
                    try {
                        if (c13716c.f48688w >= 300) {
                            break;
                        }
                        c22665e0.f89334w += listM74093D1.size();
                        for (int size = listM74093D1.size(); size > 0 && !concurrentLinkedQueue.isEmpty(); size--) {
                            concurrentLinkedQueue.poll();
                        }
                        ((C12399d) c40137a.f173193b).f41994b = -1;
                        c40137a.f173195d = null;
                        c40137a.f173192a = 0;
                        AbstractC35854l.m113829i(c13716c, null);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(c13716c, th3);
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
            } catch (Exception e13) {
                e = e13;
            }
        }
        String str = c13716c != null ? (String) c13716c.f48691z.get("Retry-After") : null;
        long j7 = str != null ? Long.parseLong(str) : 10L;
        C12399d c12399d = (C12399d) c40137a.f173193b;
        c12399d.getClass();
        int i15 = c12399d.f41994b;
        C12399d c12399d2 = new C12399d(j7, i15);
        c40137a.f173193b = c12399d2;
        c12399d2.f41994b = Math.min(i15 + 1, 10);
        c40137a.f173195d = (Long) ((InterfaceC4339a) c40137a.f173194c).invoke();
        int i16 = c40137a.f173192a + 1;
        c40137a.f173192a = i16;
        if (i16 > 100) {
            for (int size2 = listM74093D1.size(); size2 > 0 && !concurrentLinkedQueue.isEmpty(); size2--) {
                concurrentLinkedQueue.poll();
            }
        }
        executorC4220l.execute(new RunnableC1283d(this, c22665e0, c13716c, 6));
        AbstractC35854l.m113829i(c13716c, null);
    }
}
