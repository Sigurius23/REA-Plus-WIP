package m00;

import g40.InterfaceC15367i1;
import h00.EnumC16519o0;
import java.util.Iterator;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import s20.C32077a;
import y00.C38809d5;

/* JADX INFO: renamed from: m00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24869a {

    /* JADX INFO: renamed from: a */
    public final C32077a f97416a;

    /* JADX INFO: renamed from: b */
    public final List f97417b;

    /* JADX INFO: renamed from: c */
    public final EnumC16519o0 f97418c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41211c f97419d;

    /* JADX INFO: renamed from: e */
    public final boolean f97420e;

    /* JADX INFO: renamed from: f */
    public final C38809d5 f97421f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41211c f97422g;

    /* JADX INFO: renamed from: h */
    public final List f97423h;

    public C24869a(C32077a c32077a, List list, EnumC16519o0 enumC16519o0, InterfaceC41211c interfaceC41211c, boolean z4, C38809d5 c38809d5, InterfaceC41211c interfaceC41211c2) {
        this.f97416a = c32077a;
        this.f97417b = list;
        this.f97418c = enumC16519o0;
        this.f97419d = interfaceC41211c;
        this.f97420e = z4;
        this.f97421f = c38809d5;
        this.f97422g = interfaceC41211c2;
        List list2 = list;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((InterfaceC15367i1) it.next()).mo43548b(this.f97420e);
        }
        this.f97423h = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C24869a m72901a(C24869a c24869a, EnumC16519o0 enumC16519o0, boolean z4, C38809d5 c38809d5, InterfaceC41211c interfaceC41211c, int i13) {
        C32077a c32077a = c24869a.f97416a;
        List list = c24869a.f97417b;
        if ((i13 & 4) != 0) {
            enumC16519o0 = c24869a.f97418c;
        }
        EnumC16519o0 enumC16519o1 = enumC16519o0;
        InterfaceC41211c interfaceC41211c2 = c24869a.f97419d;
        if ((i13 & 16) != 0) {
            z4 = c24869a.f97420e;
        }
        boolean z13 = z4;
        if ((i13 & 32) != 0) {
            c38809d5 = c24869a.f97421f;
        }
        C38809d5 c38809d6 = c38809d5;
        if ((i13 & 64) != 0) {
            interfaceC41211c = c24869a.f97422g;
        }
        c24869a.getClass();
        return new C24869a(c32077a, list, enumC16519o1, interfaceC41211c2, z13, c38809d6, interfaceC41211c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24869a)) {
            return false;
        }
        C24869a c24869a = (C24869a) obj;
        return AbstractC22676k.m65745e(this.f97416a, c24869a.f97416a) && AbstractC22676k.m65745e(this.f97417b, c24869a.f97417b) && this.f97418c == c24869a.f97418c && AbstractC22676k.m65745e(this.f97419d, c24869a.f97419d) && this.f97420e == c24869a.f97420e && AbstractC22676k.m65745e(this.f97421f, c24869a.f97421f) && AbstractC22676k.m65745e(this.f97422g, c24869a.f97422g);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.f97419d.hashCode() + ((this.f97418c.hashCode() + AbstractC11895b.m31983b(this.f97416a.hashCode() * 31, 31, this.f97417b)) * 31)) * 31, 31, this.f97420e);
        C38809d5 c38809d5 = this.f97421f;
        int iHashCode = (iM8289b + (c38809d5 == null ? 0 : c38809d5.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c = this.f97422g;
        return iHashCode + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentMethodState(formArguments=" + this.f97416a + ", formElements=" + this.f97417b + ", primaryButtonState=" + this.f97418c + ", primaryButtonLabel=" + this.f97419d + ", isValidating=" + this.f97420e + ", paymentMethodCreateParams=" + this.f97421f + ", errorMessage=" + this.f97422g + ")";
    }
}
