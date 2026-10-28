package o00;

import h20.C16621a;
import p031b9.AbstractC2875y;
import p599wz.C37701a1;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: o00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27343a {

    /* JADX INFO: renamed from: a */
    public final String f109519a;

    /* JADX INFO: renamed from: b */
    public final C37701a1 f109520b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c f109521c;

    /* JADX INFO: renamed from: d */
    public final boolean f109522d;

    /* JADX INFO: renamed from: e */
    public final C16621a f109523e;

    /* JADX INFO: renamed from: f */
    public final EnumC38853i f109524f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41211c f109525g;

    /* JADX INFO: renamed from: h */
    public final boolean f109526h;

    public C27343a(String str, C37701a1 c37701a1, InterfaceC41211c interfaceC41211c, boolean z4, C16621a c16621a, EnumC38853i enumC38853i, InterfaceC41211c interfaceC41211c2, boolean z13) {
        this.f109519a = str;
        this.f109520b = c37701a1;
        this.f109521c = interfaceC41211c;
        this.f109522d = z4;
        this.f109523e = c16621a;
        this.f109524f = enumC38853i;
        this.f109525g = interfaceC41211c2;
        this.f109526h = z13;
    }

    /* JADX INFO: renamed from: a */
    public static C27343a m82484a(C27343a c27343a, String str, boolean z4, C16621a c16621a, EnumC38853i enumC38853i, InterfaceC41211c interfaceC41211c, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            str = c27343a.f109519a;
        }
        String str2 = str;
        C37701a1 c37701a1 = c27343a.f109520b;
        InterfaceC41211c interfaceC41211c2 = c27343a.f109521c;
        if ((i13 & 8) != 0) {
            z4 = c27343a.f109522d;
        }
        boolean z14 = z4;
        if ((i13 & 16) != 0) {
            c16621a = c27343a.f109523e;
        }
        C16621a c16621a2 = c16621a;
        if ((i13 & 32) != 0) {
            enumC38853i = c27343a.f109524f;
        }
        EnumC38853i enumC38853i2 = enumC38853i;
        InterfaceC41211c interfaceC41211c3 = (i13 & 64) != 0 ? c27343a.f109525g : interfaceC41211c;
        boolean z15 = (i13 & 128) != 0 ? c27343a.f109526h : z13;
        c27343a.getClass();
        return new C27343a(str2, c37701a1, interfaceC41211c2, z14, c16621a2, enumC38853i2, interfaceC41211c3, z15);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m82485b() {
        return this.f109520b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27343a)) {
            return false;
        }
        C27343a c27343a = (C27343a) obj;
        return AbstractC22676k.m65745e(this.f109519a, c27343a.f109519a) && AbstractC22676k.m65745e(this.f109520b, c27343a.f109520b) && AbstractC22676k.m65745e(this.f109521c, c27343a.f109521c) && this.f109522d == c27343a.f109522d && AbstractC22676k.m65745e(this.f109523e, c27343a.f109523e) && this.f109524f == c27343a.f109524f && AbstractC22676k.m65745e(this.f109525g, c27343a.f109525g) && this.f109526h == c27343a.f109526h;
    }

    public final int hashCode() {
        int iHashCode = this.f109519a.hashCode() * 31;
        C37701a1 c37701a1 = this.f109520b;
        int iM8289b = AbstractC2875y.m8289b((this.f109521c.hashCode() + ((iHashCode + (c37701a1 == null ? 0 : c37701a1.hashCode())) * 31)) * 31, 31, this.f109522d);
        C16621a c16621a = this.f109523e;
        int iHashCode2 = (iM8289b + (c16621a == null ? 0 : c16621a.hashCode())) * 31;
        EnumC38853i enumC38853i = this.f109524f;
        int iHashCode3 = (iHashCode2 + (enumC38853i == null ? 0 : enumC38853i.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c = this.f109525g;
        return Boolean.hashCode(this.f109526h) + ((iHashCode3 + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UpdateCardScreenState(paymentDetailsId=" + this.f109519a + ", billingDetailsUpdateFlow=" + this.f109520b + ", primaryButtonLabel=" + this.f109521c + ", isDefault=" + this.f109522d + ", cardUpdateParams=" + this.f109523e + ", preferredCardBrand=" + this.f109524f + ", error=" + this.f109525g + ", processing=" + this.f109526h + ")";
    }
}
