package p013ah;

import androidx.health.platform.client.proto.C1533u;
import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: ah.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C0875j extends C0876k {

    /* JADX INFO: renamed from: g */
    public static final C0875j f3168g = new C0875j(1, null);

    /* JADX INFO: renamed from: h */
    public static final C0875j f3169h = new C0875j(2, null);

    /* JADX INFO: renamed from: i */
    public static final C0875j f3170i = new C0875j(3, null);

    /* JADX INFO: renamed from: j */
    public static final C0875j f3171j = new C0875j(4, null);

    /* JADX INFO: renamed from: e */
    public final int f3172e;

    /* JADX INFO: renamed from: f */
    public final int f3173f;

    public C0875j(int i13, AbstractC12682p abstractC12682p) {
        super(EnumC0877l.f3180w);
        int i14 = 0;
        switch (i13) {
            case 1:
                i14 = 20;
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
            case 6:
                break;
            default:
                throw null;
        }
        this.f3173f = i14;
        this.f3172e = i13;
    }

    @Override // p013ah.C0876k, p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0875j) {
            C0875j c0875j = (C0875j) obj;
            if (super.equals(obj) && this.f3173f == c0875j.f3173f) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.C0876k, p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ Integer.valueOf(this.f3173f).hashCode();
    }

    @Override // p013ah.C0876k
    public final String toString() {
        switch (this.f3172e) {
            case 1:
                return "FALSE";
            case 2:
                return "TRUE";
            case 3:
                return "NULL";
            case 4:
                return "UNDEFINED";
            case 5:
                return "RESERVED";
            case 6:
                return "UNALLOCATED";
            default:
                throw null;
        }
    }

    public C0875j(int i13) {
        int i14;
        super(i13 <= 23 ? EnumC0877l.f3180w : EnumC0877l.f3181x);
        this.f3173f = i13;
        switch (i13 & 31) {
            case 20:
                i14 = 1;
                break;
            case 21:
                i14 = 2;
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                i14 = 3;
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                i14 = 4;
                break;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                i14 = 5;
                break;
            default:
                i14 = 6;
                break;
        }
        this.f3172e = i14;
    }
}
