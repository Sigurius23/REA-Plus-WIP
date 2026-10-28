package ud3;

import androidx.room.AbstractC1772c1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ne3.C26616h;
import ne3.C26624l;
import ne3.InterfaceC26618i;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.C39412p;

/* JADX INFO: renamed from: ud3.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34822j0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: e */
    public static final C34818h0 f146597e;

    /* JADX INFO: renamed from: f */
    public static final C34818h0 f146598f;

    /* JADX INFO: renamed from: g */
    public static final byte[] f146599g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f146600h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f146601i;

    /* JADX INFO: renamed from: a */
    public final C26624l f146602a;

    /* JADX INFO: renamed from: b */
    public final List f146603b;

    /* JADX INFO: renamed from: c */
    public final C34818h0 f146604c;

    /* JADX INFO: renamed from: d */
    public long f146605d;

    static {
        C39412p c39412p = C34818h0.f146589e;
        f146597e = AbstractC1772c1.m5403u("multipart/mixed");
        AbstractC1772c1.m5403u("multipart/alternative");
        AbstractC1772c1.m5403u("multipart/digest");
        AbstractC1772c1.m5403u("multipart/parallel");
        f146598f = AbstractC1772c1.m5403u("multipart/form-data");
        f146599g = new byte[]{58, 32};
        f146600h = new byte[]{13, 10};
        f146601i = new byte[]{45, 45};
    }

    public C34822j0(C26624l boundaryByteString, C34818h0 type, List list) {
        AbstractC22676k.m65750j(boundaryByteString, "boundaryByteString");
        AbstractC22676k.m65750j(type, "type");
        this.f146602a = boundaryByteString;
        this.f146603b = list;
        C39412p c39412p = C34818h0.f146589e;
        this.f146604c = AbstractC1772c1.m5403u(type + "; boundary=" + boundaryByteString.m79265s());
        this.f146605d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final long m109890a(InterfaceC26618i interfaceC26618i, boolean z4) {
        C26616h c26616h;
        InterfaceC26618i c26616h2;
        if (z4) {
            c26616h2 = new C26616h();
            c26616h = c26616h2;
        } else {
            c26616h = 0;
            c26616h2 = interfaceC26618i;
        }
        List list = this.f146603b;
        int size = list.size();
        long j7 = 0;
        int i13 = 0;
        while (true) {
            C26624l c26624l = this.f146602a;
            byte[] bArr = f146601i;
            byte[] bArr2 = f146600h;
            if (i13 >= size) {
                AbstractC22676k.m65747g(c26616h2);
                c26616h2.write(bArr);
                c26616h2.mo79191Q(c26624l);
                c26616h2.write(bArr);
                c26616h2.write(bArr2);
                if (!z4) {
                    return j7;
                }
                AbstractC22676k.m65747g(c26616h);
                long j13 = j7 + c26616h.f105866x;
                c26616h.m79200b();
                return j13;
            }
            C34820i0 c34820i0 = (C34820i0) list.get(i13);
            C34807d0 c34807d0 = c34820i0.f146595a;
            AbstractC34846v0 abstractC34846v0 = c34820i0.f146596b;
            AbstractC22676k.m65747g(c26616h2);
            c26616h2.write(bArr);
            c26616h2.mo79191Q(c26624l);
            c26616h2.write(bArr2);
            int size2 = c34807d0.size();
            for (int i14 = 0; i14 < size2; i14++) {
                c26616h2.mo79193S(c34807d0.m109864c(i14)).write(f146599g).mo79193S(c34807d0.m109867g(i14)).write(bArr2);
            }
            C34818h0 c34818h0ContentType = abstractC34846v0.getContentType();
            if (c34818h0ContentType != null) {
                c26616h2.mo79193S("Content-Type: ").mo79193S(c34818h0ContentType.f146591a).write(bArr2);
            }
            long jContentLength = abstractC34846v0.contentLength();
            if (jContentLength == -1 && z4) {
                AbstractC22676k.m65747g(c26616h);
                c26616h.m79200b();
                return -1L;
            }
            c26616h2.write(bArr2);
            if (z4) {
                j7 += jContentLength;
            } else {
                abstractC34846v0.writeTo(c26616h2);
            }
            c26616h2.write(bArr2);
            i13++;
        }
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        long j7 = this.f146605d;
        if (j7 != -1) {
            return j7;
        }
        long jM109890a = m109890a(null, true);
        this.f146605d = jM109890a;
        return jM109890a;
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return this.f146604c;
    }

    @Override // ud3.AbstractC34846v0
    public final boolean isOneShot() {
        List list = this.f146603b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C34820i0) it.next()).f146596b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) {
        m109890a(interfaceC26618i, false);
    }
}
