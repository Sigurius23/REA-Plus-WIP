package p618xk;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC4962d;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p031b9.AbstractC2875y;
import p093dl.C12144i;
import p586wk.EnumC37323a;
import tl.AbstractC33908g;
import tl.C33904c;

/* JADX INFO: renamed from: xk.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C38420k implements InterfaceC38414e {

    /* JADX INFO: renamed from: E */
    public volatile boolean f164486E;

    /* JADX INFO: renamed from: w */
    public final C12144i f164487w;

    /* JADX INFO: renamed from: x */
    public final int f164488x;

    /* JADX INFO: renamed from: y */
    public HttpURLConnection f164489y;

    /* JADX INFO: renamed from: z */
    public InputStream f164490z;

    public C38420k(C12144i c12144i, int i13) {
        this.f164487w = c12144i;
        this.f164488x = i13;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: a */
    public final void mo33597a() {
        InputStream inputStream = this.f164490z;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f164489y;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f164489y = null;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: b */
    public final Class mo33598b() {
        return InputStream.class;
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m123044c(URL url, int i13, URL url2, Map map) throws IOException {
        if (i13 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f164489y = (HttpURLConnection) url.openConnection();
        for (Map.Entry entry : map.entrySet()) {
            this.f164489y.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        this.f164489y.setConnectTimeout(this.f164488x);
        this.f164489y.setReadTimeout(this.f164488x);
        this.f164489y.setUseCaches(false);
        this.f164489y.setDoInput(true);
        this.f164489y.setInstanceFollowRedirects(false);
        this.f164489y.connect();
        this.f164490z = this.f164489y.getInputStream();
        if (this.f164486E) {
            return null;
        }
        int responseCode = this.f164489y.getResponseCode();
        int i14 = responseCode / 100;
        if (i14 == 2) {
            HttpURLConnection httpURLConnection = this.f164489y;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f164490z = new C33904c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f164490z = httpURLConnection.getInputStream();
            }
            return this.f164490z;
        }
        if (i14 != 3) {
            if (responseCode == -1) {
                throw new HttpException(AbstractC2875y.m8295h(responseCode, "Http request failed with status code: "), null);
            }
            throw new HttpException(this.f164489y.getResponseMessage(), null);
        }
        String headerField = this.f164489y.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url", null);
        }
        URL url3 = new URL(url, headerField);
        mo33597a();
        return m123044c(url3, i13 + 1, url, map);
    }

    @Override // p618xk.InterfaceC38414e
    public final void cancel() {
        this.f164486E = true;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: d */
    public final EnumC37323a mo33599d() {
        return EnumC37323a.f159582x;
    }

    @Override // p618xk.InterfaceC38414e
    /* JADX INFO: renamed from: e */
    public final void mo33600e(EnumC4962d enumC4962d, InterfaceC38413d interfaceC38413d) {
        C12144i c12144i = this.f164487w;
        int i13 = AbstractC33908g.f142084b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            if (c12144i.f40386f == null) {
                c12144i.f40386f = new URL(c12144i.m33607d());
            }
            interfaceC38413d.mo33618f(m123044c(c12144i.f40386f, 0, null, c12144i.f40382b.getHeaders()));
        } catch (IOException e5) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e5);
            }
            interfaceC38413d.mo33617c(e5);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC33908g.m107258a(jElapsedRealtimeNanos));
            }
        }
    }
}
