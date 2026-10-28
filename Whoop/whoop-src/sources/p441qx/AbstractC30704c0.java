package p441qx;

import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: qx.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30704c0 implements Closeable, Flushable {

    /* JADX INFO: renamed from: E */
    public String f126432E;

    /* JADX INFO: renamed from: F */
    public boolean f126433F;

    /* JADX INFO: renamed from: G */
    public boolean f126434G;

    /* JADX INFO: renamed from: H */
    public boolean f126435H;

    /* JADX INFO: renamed from: w */
    public int f126437w = 0;

    /* JADX INFO: renamed from: x */
    public int[] f126438x = new int[32];

    /* JADX INFO: renamed from: y */
    public String[] f126439y = new String[32];

    /* JADX INFO: renamed from: z */
    public int[] f126440z = new int[32];

    /* JADX INFO: renamed from: I */
    public int f126436I = -1;

    /* JADX INFO: renamed from: F0 */
    public abstract AbstractC30704c0 mo94362F0(String str);

    /* JADX INFO: renamed from: J */
    public abstract AbstractC30704c0 mo94363J();

    /* JADX INFO: renamed from: M0 */
    public abstract AbstractC30704c0 mo94364M0(boolean z4);

    /* JADX INFO: renamed from: T */
    public final int m94376T() {
        int i13 = this.f126437w;
        if (i13 != 0) {
            return this.f126438x[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: a0 */
    public final void m94377a0(int i13) {
        int[] iArr = this.f126438x;
        int i14 = this.f126437w;
        this.f126437w = i14 + 1;
        iArr[i14] = i13;
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC30704c0 mo94367b();

    /* JADX INFO: renamed from: b0 */
    public void mo94378b0(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.f126432E = str;
    }

    /* JADX INFO: renamed from: h */
    public abstract AbstractC30704c0 mo94368h();

    /* JADX INFO: renamed from: i */
    public final void m94379i() {
        int i13 = this.f126437w;
        int[] iArr = this.f126438x;
        if (i13 != iArr.length) {
            return;
        }
        if (i13 == 256) {
            throw new JsonDataException("Nesting too deep at " + m94380s() + ": circular reference?");
        }
        this.f126438x = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f126439y;
        this.f126439y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f126440z;
        this.f126440z = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof C30702b0) {
            C30702b0 c30702b0 = (C30702b0) this;
            Object[] objArr = c30702b0.f126424J;
            c30702b0.f126424J = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract AbstractC30704c0 mo94369k();

    /* JADX INFO: renamed from: m */
    public abstract AbstractC30704c0 mo94370m();

    /* JADX INFO: renamed from: o0 */
    public abstract AbstractC30704c0 mo94371o0(double d3);

    /* JADX INFO: renamed from: p0 */
    public abstract AbstractC30704c0 mo94372p0(long j7);

    /* JADX INFO: renamed from: s */
    public final String m94380s() {
        return AbstractC34870c0.m109984T(this.f126437w, this.f126438x, this.f126440z, this.f126439y);
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC30704c0 mo94373x(String str);

    /* JADX INFO: renamed from: x0 */
    public abstract AbstractC30704c0 mo94374x0(Float f13);
}
