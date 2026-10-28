package wa3;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import p508ty.C34249c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wa3.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36990e implements Iterable {

    /* JADX INFO: renamed from: w */
    public static final C37018u f158321w = new C37018u(new byte[0]);

    /* JADX INFO: renamed from: a */
    public static AbstractC36990e m118741a(Iterator it, int i13) {
        if (i13 == 1) {
            return (AbstractC36990e) it.next();
        }
        int i14 = i13 >>> 1;
        return m118741a(it, i14).m118743c(m118741a(it, i13 - i14));
    }

    /* JADX INFO: renamed from: l */
    public static C36988d m118742l() {
        return new C36988d();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC36990e m118743c(AbstractC36990e abstractC36990e) {
        int size = size();
        int size2 = abstractC36990e.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb4 = new StringBuilder(53);
            sb4.append("ByteString would be too long: ");
            sb4.append(size);
            sb4.append("+");
            sb4.append(size2);
            throw new IllegalArgumentException(sb4.toString());
        }
        int[] iArr = C37023z.f158392H;
        C37023z c37023z = this instanceof C37023z ? (C37023z) this : null;
        if (abstractC36990e.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC36990e;
        }
        int size3 = abstractC36990e.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC36990e.size();
            byte[] bArr = new byte[size4 + size5];
            m118744d(0, 0, size4, bArr);
            abstractC36990e.m118744d(0, size4, size5, bArr);
            return new C37018u(bArr);
        }
        if (c37023z != null) {
            AbstractC36990e abstractC36990e2 = c37023z.f158398z;
            if (abstractC36990e.size() + abstractC36990e2.size() < 128) {
                int size6 = abstractC36990e2.size();
                int size7 = abstractC36990e.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC36990e2.m118744d(0, 0, size6, bArr2);
                abstractC36990e.m118744d(0, size6, size7, bArr2);
                return new C37023z(c37023z.f158397y, new C37018u(bArr2));
            }
        }
        if (c37023z != null) {
            AbstractC36990e abstractC36990e3 = c37023z.f158398z;
            AbstractC36990e abstractC36990e4 = c37023z.f158397y;
            if (abstractC36990e4.mo118746f() > abstractC36990e3.mo118746f() && c37023z.f158394F > abstractC36990e.mo118746f()) {
                return new C37023z(abstractC36990e4, new C37023z(abstractC36990e3, abstractC36990e));
            }
        }
        return size3 >= C37023z.f158392H[Math.max(mo118746f(), abstractC36990e.mo118746f()) + 1] ? new C37023z(this, abstractC36990e) : C34249c.m108292h(new C34249c(16), this, abstractC36990e);
    }

    /* JADX INFO: renamed from: d */
    public final void m118744d(int i13, int i14, int i15, byte[] bArr) {
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(30, i13, "Source offset < 0: "));
        }
        if (i14 < 0) {
            throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(30, i14, "Target offset < 0: "));
        }
        if (i15 < 0) {
            throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(23, i15, "Length < 0: "));
        }
        int i16 = i13 + i15;
        if (i16 > size()) {
            throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(34, i16, "Source end offset < 0: "));
        }
        int i17 = i14 + i15;
        if (i17 > bArr.length) {
            throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(34, i17, "Target end offset < 0: "));
        }
        if (i15 > 0) {
            mo118745e(i13, i14, i15, bArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo118745e(int i13, int i14, int i15, byte[] bArr);

    /* JADX INFO: renamed from: f */
    public abstract int mo118746f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo118747g();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo118748j();

    /* JADX INFO: renamed from: m */
    public abstract int mo118749m(int i13, int i14, int i15);

    /* JADX INFO: renamed from: n */
    public abstract int mo118750n(int i13, int i14, int i15);

    /* JADX INFO: renamed from: o */
    public abstract int mo118751o();

    /* JADX INFO: renamed from: p */
    public abstract String mo118752p();

    /* JADX INFO: renamed from: q */
    public final String m118753q() {
        try {
            return mo118752p();
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo118754r(OutputStream outputStream, int i13, int i14);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
