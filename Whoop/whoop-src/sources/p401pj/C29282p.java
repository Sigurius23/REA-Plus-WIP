package p401pj;

import p108e4.AbstractC12682p;

/* JADX INFO: renamed from: pj.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C29282p {

    /* JADX INFO: renamed from: a */
    public final C29267f f118495a;

    /* JADX INFO: renamed from: b */
    public final int f118496b;

    /* JADX INFO: renamed from: c */
    public final C29267f f118497c;

    public C29282p(C29267f c29267f, int i13, C29267f c29267f2) {
        this.f118495a = c29267f;
        this.f118496b = i13;
        this.f118497c = c29267f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29282p)) {
            return false;
        }
        C29282p c29282p = (C29282p) obj;
        return this.f118495a.equals(c29282p.f118495a) && this.f118496b == c29282p.f118496b && this.f118497c.equals(c29282p.f118497c);
    }

    public final int hashCode() {
        int iHashCode = this.f118495a.hashCode() * 31;
        int i13 = this.f118496b;
        return this.f118497c.hashCode() + ((iHashCode + (i13 == 0 ? 0 : AbstractC12682p.m35485e(i13))) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("PinNudgePosition(pos=");
        sb4.append(this.f118495a);
        sb4.append(", placement=");
        switch (this.f118496b) {
            case 1:
                str = "TOP";
                break;
            case 2:
                str = "RIGHT";
                break;
            case 3:
                str = "BOTTOM";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "TOP_START";
                break;
            case 6:
                str = "TOP_END";
                break;
            case 7:
                str = "RIGHT_START";
                break;
            case 8:
                str = "RIGHT_END";
                break;
            case 9:
                str = "BOTTOM_START";
                break;
            case 10:
                str = "BOTTOM_END";
                break;
            case 11:
                str = "LEFT_START";
                break;
            case 12:
                str = "LEFT_END";
                break;
            default:
                str = "null";
                break;
        }
        sb4.append(str);
        sb4.append(", arrow=");
        sb4.append(this.f118497c);
        sb4.append(')');
        return sb4.toString();
    }
}
