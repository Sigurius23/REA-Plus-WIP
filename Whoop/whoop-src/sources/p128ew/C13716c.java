package p128ew;

import e10.C12554k0;
import ih0.AbstractC18489d0;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: ew.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13716c implements Closeable {

    /* JADX INFO: renamed from: E */
    public final C12554k0 f48687E;

    /* JADX INFO: renamed from: w */
    public final int f48688w;

    /* JADX INFO: renamed from: x */
    public final String f48689x;

    /* JADX INFO: renamed from: y */
    public final InputStream f48690y;

    /* JADX INFO: renamed from: z */
    public final C13715b f48691z;

    public C13716c(int i13, String str, InputStream inputStream, C13715b c13715b, C12554k0 c12554k0) {
        this.f48688w = i13;
        this.f48689x = str;
        this.f48690y = inputStream;
        this.f48691z = c13715b;
        this.f48687E = c12554k0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f48690y.close();
            ((HttpURLConnection) ((C22669g0) this.f48687E.f42881x).f89336w).disconnect();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13716c)) {
            return false;
        }
        C13716c c13716c = (C13716c) obj;
        return this.f48688w == c13716c.f48688w && AbstractC22676k.m65745e(this.f48689x, c13716c.f48689x) && AbstractC22676k.m65745e(this.f48690y, c13716c.f48690y) && AbstractC22676k.m65745e(this.f48691z, c13716c.f48691z) && AbstractC22676k.m65745e(this.f48687E, c13716c.f48687E);
    }

    public final int hashCode() {
        return this.f48687E.hashCode() + ((this.f48691z.hashCode() + ((this.f48690y.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.f48688w) * 31, 31, this.f48689x)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(this.f48688w, "HttpResponse(code=", ", message=", this.f48689x, ", body=");
        sbM53373n.append(this.f48690y);
        sbM53373n.append(", headers=");
        sbM53373n.append(this.f48691z);
        sbM53373n.append(", connection=");
        sbM53373n.append(this.f48687E);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
