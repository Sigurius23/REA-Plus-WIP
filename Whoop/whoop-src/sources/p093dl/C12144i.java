package p093dl;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import p586wk.InterfaceC37327e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: dl.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12144i implements InterfaceC37327e {

    /* JADX INFO: renamed from: b */
    public final InterfaceC12145j f40382b;

    /* JADX INFO: renamed from: c */
    public final URL f40383c;

    /* JADX INFO: renamed from: d */
    public final String f40384d;

    /* JADX INFO: renamed from: e */
    public String f40385e;

    /* JADX INFO: renamed from: f */
    public URL f40386f;

    /* JADX INFO: renamed from: g */
    public volatile byte[] f40387g;

    /* JADX INFO: renamed from: h */
    public int f40388h;

    public C12144i(URL url) {
        C12148m c12148m = InterfaceC12145j.f40389a;
        AbstractC29125c.m88539p(url, "Argument must not be null");
        this.f40383c = url;
        this.f40384d = null;
        AbstractC29125c.m88539p(c12148m, "Argument must not be null");
        this.f40382b = c12148m;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        if (this.f40387g == null) {
            this.f40387g = m33606c().getBytes(InterfaceC37327e.f159589a);
        }
        messageDigest.update(this.f40387g);
    }

    /* JADX INFO: renamed from: c */
    public final String m33606c() {
        String str = this.f40384d;
        if (str != null) {
            return str;
        }
        URL url = this.f40383c;
        AbstractC29125c.m88539p(url, "Argument must not be null");
        return url.toString();
    }

    /* JADX INFO: renamed from: d */
    public final String m33607d() {
        if (TextUtils.isEmpty(this.f40385e)) {
            String string = this.f40384d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f40383c;
                AbstractC29125c.m88539p(url, "Argument must not be null");
                string = url.toString();
            }
            this.f40385e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f40385e;
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C12144i) {
            C12144i c12144i = (C12144i) obj;
            if (m33606c().equals(c12144i.m33606c()) && this.f40382b.equals(c12144i.f40382b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        if (this.f40388h == 0) {
            int iHashCode = m33606c().hashCode();
            this.f40388h = iHashCode;
            this.f40388h = this.f40382b.hashCode() + (iHashCode * 31);
        }
        return this.f40388h;
    }

    public final String toString() {
        return m33606c();
    }

    public C12144i(String str) {
        this(str, InterfaceC12145j.f40389a);
    }

    public C12144i(String str, InterfaceC12145j interfaceC12145j) {
        this.f40383c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f40384d = str;
            AbstractC29125c.m88539p(interfaceC12145j, "Argument must not be null");
            this.f40382b = interfaceC12145j;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
