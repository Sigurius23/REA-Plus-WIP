package androidx.room;

import java.util.Iterator;
import java.util.TreeMap;
import p518ub.InterfaceC34733f;
import p518ub.InterfaceC34734g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1813n1 implements InterfaceC34734g, InterfaceC34733f {

    /* JADX INFO: renamed from: I */
    public static final TreeMap f7126I = new TreeMap();

    /* JADX INFO: renamed from: E */
    public final String[] f7127E;

    /* JADX INFO: renamed from: F */
    public final byte[][] f7128F;

    /* JADX INFO: renamed from: G */
    public final int[] f7129G;

    /* JADX INFO: renamed from: H */
    public int f7130H;

    /* JADX INFO: renamed from: w */
    public final int f7131w;

    /* JADX INFO: renamed from: x */
    public volatile String f7132x;

    /* JADX INFO: renamed from: y */
    public final long[] f7133y;

    /* JADX INFO: renamed from: z */
    public final double[] f7134z;

    public C1813n1(int i13) {
        this.f7131w = i13;
        int i14 = i13 + 1;
        this.f7129G = new int[i14];
        this.f7133y = new long[i14];
        this.f7134z = new double[i14];
        this.f7127E = new String[i14];
        this.f7128F = new byte[i14][];
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: b */
    public final int mo5445b() {
        return this.f7130H;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: h */
    public final String mo5446h() {
        String str = this.f7132x;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: i */
    public final void mo5447i(InterfaceC34733f interfaceC34733f) {
        int i13 = this.f7130H;
        if (1 > i13) {
            return;
        }
        int i14 = 1;
        while (true) {
            int i15 = this.f7129G[i14];
            if (i15 == 1) {
                interfaceC34733f.mo5436u(i14);
            } else if (i15 == 2) {
                interfaceC34733f.mo5433p(i14, this.f7133y[i14]);
            } else if (i15 == 3) {
                interfaceC34733f.mo5435t(this.f7134z[i14], i14);
            } else if (i15 == 4) {
                String str = this.f7127E[i14];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC34733f.mo5432n0(i14, str);
            } else if (i15 == 5) {
                byte[] bArr = this.f7128F[i14];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                interfaceC34733f.mo5434q(i14, bArr);
            }
            if (i14 == i13) {
                return;
            } else {
                i14++;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5448k() {
        TreeMap treeMap = f7126I;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f7131w), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC22676k.m65749i(it, "iterator(...)");
                while (true) {
                    int i13 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i13;
                }
            }
        }
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: n0 */
    public final void mo5432n0(int i13, String str) {
        this.f7129G[i13] = 4;
        this.f7127E[i13] = str;
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: p */
    public final void mo5433p(int i13, long j7) {
        this.f7129G[i13] = 2;
        this.f7133y[i13] = j7;
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: q */
    public final void mo5434q(int i13, byte[] bArr) {
        this.f7129G[i13] = 5;
        this.f7128F[i13] = bArr;
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: t */
    public final void mo5435t(double d3, int i13) {
        this.f7129G[i13] = 3;
        this.f7134z[i13] = d3;
    }

    @Override // p518ub.InterfaceC34733f
    /* JADX INFO: renamed from: u */
    public final void mo5436u(int i13) {
        this.f7129G[i13] = 1;
    }
}
