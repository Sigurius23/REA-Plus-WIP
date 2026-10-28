package p516u8;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p141f9.C14278t;
import p499t9.C33650s;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34607n0 {

    /* JADX INFO: renamed from: q */
    public static final Object f145699q = new Object();

    /* JADX INFO: renamed from: r */
    public static final C34626x f145700r;

    /* JADX INFO: renamed from: b */
    public Object f145702b;

    /* JADX INFO: renamed from: d */
    public Object f145704d;

    /* JADX INFO: renamed from: e */
    public long f145705e;

    /* JADX INFO: renamed from: f */
    public long f145706f;

    /* JADX INFO: renamed from: g */
    public long f145707g;

    /* JADX INFO: renamed from: h */
    public boolean f145708h;

    /* JADX INFO: renamed from: i */
    public boolean f145709i;

    /* JADX INFO: renamed from: j */
    public C34618t f145710j;

    /* JADX INFO: renamed from: k */
    public boolean f145711k;

    /* JADX INFO: renamed from: l */
    public long f145712l;

    /* JADX INFO: renamed from: m */
    public long f145713m;

    /* JADX INFO: renamed from: n */
    public int f145714n;

    /* JADX INFO: renamed from: o */
    public int f145715o;

    /* JADX INFO: renamed from: p */
    public long f145716p;

    /* JADX INFO: renamed from: a */
    public Object f145701a = f145699q;

    /* JADX INFO: renamed from: c */
    public C34626x f145703c = f145700r;

    static {
        C33650s c33650s = new C33650s();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        List list = Collections.EMPTY_LIST;
        C41060w0 c41060w1 = C41060w0.f177067E;
        C14278t c14278t = new C14278t();
        C34622v c34622v = C34622v.f145862a;
        Uri uri = Uri.EMPTY;
        f145700r = new C34626x("androidx.media3.common.Timeline", new C34616s(c33650s), uri != null ? new C34620u(uri, null, null, list, c41060w1, -9223372036854775807L) : null, new C34618t(c14278t), C34581a0.f145608B, c34622v);
        AbstractC33745d.m106663v(1, 2, 3, 4, 5);
        AbstractC33745d.m106663v(6, 7, 8, 9, 10);
        AbstractC38065t.m121892F(11);
        AbstractC38065t.m121892F(12);
        AbstractC38065t.m121892F(13);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m109401a() {
        return this.f145710j != null;
    }

    /* JADX INFO: renamed from: b */
    public final void m109402b(C34626x c34626x, Object obj, long j7, long j13, long j14, boolean z4, boolean z13, C34618t c34618t, long j15, long j16, int i13, long j17) {
        this.f145701a = f145699q;
        this.f145703c = c34626x != null ? c34626x : f145700r;
        if (c34626x != null) {
            C34620u c34620u = c34626x.f145867b;
        }
        this.f145702b = null;
        this.f145704d = obj;
        this.f145705e = j7;
        this.f145706f = j13;
        this.f145707g = j14;
        this.f145708h = z4;
        this.f145709i = z13;
        this.f145710j = c34618t;
        this.f145712l = j15;
        this.f145713m = j16;
        this.f145714n = 0;
        this.f145715o = i13;
        this.f145716p = j17;
        this.f145711k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C34607n0.class.equals(obj.getClass())) {
            return false;
        }
        C34607n0 c34607n0 = (C34607n0) obj;
        return Objects.equals(this.f145701a, c34607n0.f145701a) && Objects.equals(this.f145703c, c34607n0.f145703c) && Objects.equals(this.f145704d, c34607n0.f145704d) && Objects.equals(this.f145710j, c34607n0.f145710j) && this.f145705e == c34607n0.f145705e && this.f145706f == c34607n0.f145706f && this.f145707g == c34607n0.f145707g && this.f145708h == c34607n0.f145708h && this.f145709i == c34607n0.f145709i && this.f145711k == c34607n0.f145711k && this.f145712l == c34607n0.f145712l && this.f145713m == c34607n0.f145713m && this.f145714n == c34607n0.f145714n && this.f145715o == c34607n0.f145715o && this.f145716p == c34607n0.f145716p;
    }

    public final int hashCode() {
        int iHashCode = (this.f145703c.hashCode() + AbstractC33745d.m106644c(217, 31, this.f145701a)) * 31;
        Object obj = this.f145704d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C34618t c34618t = this.f145710j;
        int iHashCode3 = (iHashCode2 + (c34618t != null ? c34618t.hashCode() : 0)) * 31;
        long j7 = this.f145705e;
        int i13 = (iHashCode3 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j13 = this.f145706f;
        int i14 = (i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f145707g;
        int i15 = (((((((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f145708h ? 1 : 0)) * 31) + (this.f145709i ? 1 : 0)) * 31) + (this.f145711k ? 1 : 0)) * 31;
        long j15 = this.f145712l;
        int i16 = (i15 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f145713m;
        int i17 = (((((i16 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.f145714n) * 31) + this.f145715o) * 31;
        long j17 = this.f145716p;
        return i17 + ((int) (j17 ^ (j17 >>> 32)));
    }
}
