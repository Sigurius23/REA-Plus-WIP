package androidx.glance.appwidget.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.i */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1391i implements Iterable, Serializable {

    /* JADX INFO: renamed from: x */
    public static final C1388h f5905x = new C1388h(AbstractC1383f0.f5888b);

    /* JADX INFO: renamed from: y */
    public static final C1382f f5906y;

    /* JADX INFO: renamed from: w */
    public int f5907w;

    static {
        f5906y = AbstractC1373c.m4297a() ? new C1382f(1) : new C1382f(0);
    }

    /* JADX INFO: renamed from: c */
    public static int m4352c(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8296i(i13, "Beginning index: ", " < 0"));
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i14, i15, "End index: ", " >= "));
    }

    /* JADX INFO: renamed from: d */
    public static C1388h m4353d(byte[] bArr, int i13, int i14) {
        byte[] bArrCopyOfRange;
        m4352c(i13, i13 + i14, bArr.length);
        switch (f5906y.f5886a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14 + i13);
                break;
            default:
                bArrCopyOfRange = new byte[i14];
                System.arraycopy(bArr, i13, bArrCopyOfRange, 0, i14);
                break;
        }
        return new C1388h(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo4335a(int i13);

    /* JADX INFO: renamed from: e */
    public abstract void mo4336e(int i13, byte[] bArr);

    public final int hashCode() {
        int i13 = this.f5907w;
        if (i13 != 0) {
            return i13;
        }
        int size = size();
        C1388h c1388h = (C1388h) this;
        int iMo4337f = c1388h.mo4337f();
        int i14 = size;
        for (int i15 = iMo4337f; i15 < iMo4337f + size; i15++) {
            i14 = (i14 * 31) + c1388h.f5903z[i15];
        }
        if (i14 == 0) {
            i14 = 1;
        }
        this.f5907w = i14;
        return i14;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC12313p.m34250B(this);
        } else {
            StringBuilder sb4 = new StringBuilder();
            C1388h c1388h = (C1388h) this;
            int iM4352c = m4352c(0, 47, c1388h.size());
            sb4.append(AbstractC12313p.m34250B(iM4352c == 0 ? f5905x : new C1385g(c1388h.f5903z, c1388h.mo4337f(), iM4352c)));
            sb4.append("...");
            string = sb4.toString();
        }
        return AbstractC25012a.m73376i(string, "\">", AbstractC11266d.m30467u(size, "<ByteString@", hexString, " size=", " contents=\""));
    }
}
