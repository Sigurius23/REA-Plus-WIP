package b30;

import l40.C23328a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C2578n {

    /* JADX INFO: renamed from: a */
    public final C23328a f10019a;

    /* JADX INFO: renamed from: b */
    public final C23328a f10020b;

    /* JADX INFO: renamed from: c */
    public final C23328a f10021c;

    /* JADX INFO: renamed from: d */
    public final C23328a f10022d;

    /* JADX INFO: renamed from: e */
    public final C23328a f10023e;

    /* JADX INFO: renamed from: f */
    public final C23328a f10024f;

    /* JADX INFO: renamed from: g */
    public final C23328a f10025g;

    /* JADX INFO: renamed from: h */
    public final C23328a f10026h;

    /* JADX INFO: renamed from: i */
    public final C23328a f10027i;

    public C2578n(C23328a c23328a, C23328a c23328a2, C23328a c23328a3, C23328a c23328a4, C23328a c23328a5, C23328a c23328a6, C23328a c23328a7, C23328a c23328a8, C23328a c23328a9) {
        this.f10019a = c23328a;
        this.f10020b = c23328a2;
        this.f10021c = c23328a3;
        this.f10022d = c23328a4;
        this.f10023e = c23328a5;
        this.f10024f = c23328a6;
        this.f10025g = c23328a7;
        this.f10026h = c23328a8;
        this.f10027i = c23328a9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2578n)) {
            return false;
        }
        C2578n c2578n = (C2578n) obj;
        return AbstractC22676k.m65745e(this.f10019a, c2578n.f10019a) && AbstractC22676k.m65745e(this.f10020b, c2578n.f10020b) && AbstractC22676k.m65745e(this.f10021c, c2578n.f10021c) && AbstractC22676k.m65745e(this.f10022d, c2578n.f10022d) && AbstractC22676k.m65745e(this.f10023e, c2578n.f10023e) && AbstractC22676k.m65745e(this.f10024f, c2578n.f10024f) && AbstractC22676k.m65745e(this.f10025g, c2578n.f10025g) && AbstractC22676k.m65745e(this.f10026h, c2578n.f10026h) && AbstractC22676k.m65745e(this.f10027i, c2578n.f10027i);
    }

    public final int hashCode() {
        C23328a c23328a = this.f10019a;
        int iHashCode = (c23328a == null ? 0 : c23328a.hashCode()) * 31;
        C23328a c23328a2 = this.f10020b;
        int iHashCode2 = (iHashCode + (c23328a2 == null ? 0 : c23328a2.hashCode())) * 31;
        C23328a c23328a3 = this.f10021c;
        int iHashCode3 = (iHashCode2 + (c23328a3 == null ? 0 : c23328a3.hashCode())) * 31;
        C23328a c23328a4 = this.f10022d;
        int iHashCode4 = (iHashCode3 + (c23328a4 == null ? 0 : c23328a4.hashCode())) * 31;
        C23328a c23328a5 = this.f10023e;
        int iHashCode5 = (iHashCode4 + (c23328a5 == null ? 0 : c23328a5.hashCode())) * 31;
        C23328a c23328a6 = this.f10024f;
        int iHashCode6 = (iHashCode5 + (c23328a6 == null ? 0 : c23328a6.hashCode())) * 31;
        C23328a c23328a7 = this.f10025g;
        int iHashCode7 = (iHashCode6 + (c23328a7 == null ? 0 : c23328a7.hashCode())) * 31;
        C23328a c23328a8 = this.f10026h;
        int iHashCode8 = (iHashCode7 + (c23328a8 == null ? 0 : c23328a8.hashCode())) * 31;
        C23328a c23328a9 = this.f10027i;
        return iHashCode8 + (c23328a9 != null ? c23328a9.hashCode() : 0);
    }

    public final String toString() {
        return "BillingDetailsFormState(name=" + this.f10019a + ", email=" + this.f10020b + ", phone=" + this.f10021c + ", line1=" + this.f10022d + ", line2=" + this.f10023e + ", city=" + this.f10024f + ", postalCode=" + this.f10025g + ", state=" + this.f10026h + ", country=" + this.f10027i + ")";
    }
}
