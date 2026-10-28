package p516u8;

import androidx.health.platform.client.proto.C1533u;
import java.util.Arrays;
import java.util.Objects;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u8.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34581a0 {

    /* JADX INFO: renamed from: B */
    public static final C34581a0 f145608B;

    /* JADX INFO: renamed from: A */
    public final AbstractC41023g0 f145609A;

    /* JADX INFO: renamed from: a */
    public final CharSequence f145610a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f145611b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f145612c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f145613d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f145614e;

    /* JADX INFO: renamed from: f */
    public final byte[] f145615f;

    /* JADX INFO: renamed from: g */
    public final Integer f145616g;

    /* JADX INFO: renamed from: h */
    public final Integer f145617h;

    /* JADX INFO: renamed from: i */
    public final Integer f145618i;

    /* JADX INFO: renamed from: j */
    public final Integer f145619j;

    /* JADX INFO: renamed from: k */
    public final Boolean f145620k;

    /* JADX INFO: renamed from: l */
    public final Integer f145621l;

    /* JADX INFO: renamed from: m */
    public final Integer f145622m;

    /* JADX INFO: renamed from: n */
    public final Integer f145623n;

    /* JADX INFO: renamed from: o */
    public final Integer f145624o;

    /* JADX INFO: renamed from: p */
    public final Integer f145625p;

    /* JADX INFO: renamed from: q */
    public final Integer f145626q;

    /* JADX INFO: renamed from: r */
    public final Integer f145627r;

    /* JADX INFO: renamed from: s */
    public final CharSequence f145628s;

    /* JADX INFO: renamed from: t */
    public final CharSequence f145629t;

    /* JADX INFO: renamed from: u */
    public final CharSequence f145630u;

    /* JADX INFO: renamed from: v */
    public final Integer f145631v;

    /* JADX INFO: renamed from: w */
    public final Integer f145632w;

    /* JADX INFO: renamed from: x */
    public final CharSequence f145633x;

    /* JADX INFO: renamed from: y */
    public final CharSequence f145634y;

    /* JADX INFO: renamed from: z */
    public final Integer f145635z;

    static {
        C34630z c34630z = new C34630z();
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        c34630z.f145903z = C41060w0.f177067E;
        f145608B = new C34581a0(c34630z);
        AbstractC33745d.m106663v(0, 1, 2, 3, 4);
        AbstractC33745d.m106663v(5, 6, 8, 9, 10);
        AbstractC33745d.m106663v(11, 12, 13, 14, 15);
        AbstractC33745d.m106663v(16, 17, 18, 19, 20);
        AbstractC33745d.m106663v(21, 22, 23, 24, 25);
        AbstractC33745d.m106663v(26, 27, 28, 29, 30);
        AbstractC33745d.m106663v(31, 32, 33, 34, 1000);
    }

    public C34581a0(C34630z c34630z) {
        Boolean boolValueOf = c34630z.f145888k;
        Integer numValueOf = c34630z.f145887j;
        Integer numValueOf2 = c34630z.f145902y;
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i13 = 0;
                            break;
                        case 21:
                            i13 = 2;
                            break;
                        case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                            i13 = 3;
                            break;
                        case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                            i13 = 4;
                            break;
                        case 24:
                            i13 = 5;
                            break;
                        case 25:
                            i13 = 6;
                            break;
                    }
                    i15 = i13;
                }
                numValueOf = Integer.valueOf(i15);
            }
        } else if (numValueOf != null) {
            boolean z4 = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z4);
            if (z4 && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i14 = 21;
                        break;
                    case 3:
                        i14 = 22;
                        break;
                    case 4:
                        i14 = 23;
                        break;
                    case 5:
                        i14 = 24;
                        break;
                    case 6:
                        i14 = 25;
                        break;
                    default:
                        i14 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i14);
            }
        }
        this.f145610a = c34630z.f145878a;
        this.f145611b = c34630z.f145879b;
        this.f145612c = c34630z.f145880c;
        this.f145613d = c34630z.f145881d;
        this.f145614e = c34630z.f145882e;
        this.f145615f = c34630z.f145883f;
        this.f145616g = c34630z.f145884g;
        this.f145617h = c34630z.f145885h;
        this.f145618i = c34630z.f145886i;
        this.f145619j = numValueOf;
        this.f145620k = boolValueOf;
        Integer num = c34630z.f145889l;
        this.f145621l = num;
        this.f145622m = num;
        this.f145623n = c34630z.f145890m;
        this.f145624o = c34630z.f145891n;
        this.f145625p = c34630z.f145892o;
        this.f145626q = c34630z.f145893p;
        this.f145627r = c34630z.f145894q;
        this.f145628s = c34630z.f145895r;
        this.f145629t = c34630z.f145896s;
        this.f145630u = c34630z.f145897t;
        this.f145631v = c34630z.f145898u;
        this.f145632w = c34630z.f145899v;
        this.f145633x = c34630z.f145900w;
        this.f145634y = c34630z.f145901x;
        this.f145635z = numValueOf2;
        this.f145609A = c34630z.f145903z;
    }

    /* JADX INFO: renamed from: a */
    public final C34630z m109362a() {
        C34630z c34630z = new C34630z();
        c34630z.f145878a = this.f145610a;
        c34630z.f145879b = this.f145611b;
        c34630z.f145880c = this.f145612c;
        c34630z.f145881d = this.f145613d;
        c34630z.f145882e = this.f145614e;
        c34630z.f145883f = this.f145615f;
        c34630z.f145884g = this.f145616g;
        c34630z.f145885h = this.f145617h;
        c34630z.f145886i = this.f145618i;
        c34630z.f145887j = this.f145619j;
        c34630z.f145888k = this.f145620k;
        c34630z.f145889l = this.f145622m;
        c34630z.f145890m = this.f145623n;
        c34630z.f145891n = this.f145624o;
        c34630z.f145892o = this.f145625p;
        c34630z.f145893p = this.f145626q;
        c34630z.f145894q = this.f145627r;
        c34630z.f145895r = this.f145628s;
        c34630z.f145896s = this.f145629t;
        c34630z.f145897t = this.f145630u;
        c34630z.f145898u = this.f145631v;
        c34630z.f145899v = this.f145632w;
        c34630z.f145900w = this.f145633x;
        c34630z.f145901x = this.f145634y;
        c34630z.f145902y = this.f145635z;
        c34630z.f145903z = this.f145609A;
        return c34630z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34581a0.class != obj.getClass()) {
            return false;
        }
        C34581a0 c34581a0 = (C34581a0) obj;
        return Objects.equals(this.f145610a, c34581a0.f145610a) && Objects.equals(this.f145611b, c34581a0.f145611b) && Objects.equals(this.f145612c, c34581a0.f145612c) && Objects.equals(this.f145613d, c34581a0.f145613d) && Objects.equals(this.f145614e, c34581a0.f145614e) && Arrays.equals(this.f145615f, c34581a0.f145615f) && Objects.equals(this.f145616g, c34581a0.f145616g) && Objects.equals(this.f145617h, c34581a0.f145617h) && Objects.equals(this.f145618i, c34581a0.f145618i) && Objects.equals(this.f145619j, c34581a0.f145619j) && Objects.equals(this.f145620k, c34581a0.f145620k) && Objects.equals(this.f145622m, c34581a0.f145622m) && Objects.equals(this.f145623n, c34581a0.f145623n) && Objects.equals(this.f145624o, c34581a0.f145624o) && Objects.equals(this.f145625p, c34581a0.f145625p) && Objects.equals(this.f145626q, c34581a0.f145626q) && Objects.equals(this.f145627r, c34581a0.f145627r) && Objects.equals(this.f145628s, c34581a0.f145628s) && Objects.equals(this.f145629t, c34581a0.f145629t) && Objects.equals(this.f145630u, c34581a0.f145630u) && Objects.equals(this.f145631v, c34581a0.f145631v) && Objects.equals(this.f145632w, c34581a0.f145632w) && Objects.equals(this.f145633x, c34581a0.f145633x) && Objects.equals(this.f145634y, c34581a0.f145634y) && Objects.equals(this.f145635z, c34581a0.f145635z) && Objects.equals(this.f145609A, c34581a0.f145609A);
    }

    public final int hashCode() {
        return Objects.hash(this.f145610a, this.f145611b, this.f145612c, this.f145613d, null, null, this.f145614e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f145615f)), this.f145616g, null, this.f145617h, this.f145618i, this.f145619j, this.f145620k, null, this.f145622m, this.f145623n, this.f145624o, this.f145625p, this.f145626q, this.f145627r, this.f145628s, this.f145629t, this.f145630u, this.f145631v, this.f145632w, this.f145633x, null, this.f145634y, this.f145635z, true, this.f145609A);
    }
}
