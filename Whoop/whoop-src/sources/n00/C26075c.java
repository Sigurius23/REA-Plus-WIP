package n00;

import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: n00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C26075c {

    /* JADX INFO: renamed from: a */
    public final String f103258a;

    /* JADX INFO: renamed from: b */
    public final boolean f103259b;

    /* JADX INFO: renamed from: c */
    public final boolean f103260c;

    /* JADX INFO: renamed from: d */
    public final boolean f103261d;

    /* JADX INFO: renamed from: e */
    public final EnumC26076d f103262e;

    /* JADX INFO: renamed from: f */
    public final boolean f103263f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC41211c f103264g;

    /* JADX INFO: renamed from: h */
    public final String f103265h;

    public C26075c(String merchantName, boolean z4, boolean z13, boolean z14, EnumC26076d signUpState, boolean z15, InterfaceC41211c interfaceC41211c, String str) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(signUpState, "signUpState");
        this.f103258a = merchantName;
        this.f103259b = z4;
        this.f103260c = z13;
        this.f103261d = z14;
        this.f103262e = signUpState;
        this.f103263f = z15;
        this.f103264g = interfaceC41211c;
        this.f103265h = str;
    }

    /* JADX INFO: renamed from: a */
    public static C26075c m77570a(C26075c c26075c, boolean z4, EnumC26076d enumC26076d, boolean z13, InterfaceC41211c interfaceC41211c, String str, int i13) {
        String merchantName = c26075c.f103258a;
        if ((i13 & 2) != 0) {
            z4 = c26075c.f103259b;
        }
        boolean z14 = z4;
        boolean z15 = c26075c.f103260c;
        boolean z16 = c26075c.f103261d;
        if ((i13 & 16) != 0) {
            enumC26076d = c26075c.f103262e;
        }
        EnumC26076d signUpState = enumC26076d;
        if ((i13 & 32) != 0) {
            z13 = c26075c.f103263f;
        }
        boolean z17 = z13;
        if ((i13 & 64) != 0) {
            interfaceC41211c = c26075c.f103264g;
        }
        InterfaceC41211c interfaceC41211c2 = interfaceC41211c;
        if ((i13 & 128) != 0) {
            str = c26075c.f103265h;
        }
        c26075c.getClass();
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(signUpState, "signUpState");
        return new C26075c(merchantName, z14, z15, z16, signUpState, z17, interfaceC41211c2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26075c)) {
            return false;
        }
        C26075c c26075c = (C26075c) obj;
        return AbstractC22676k.m65745e(this.f103258a, c26075c.f103258a) && this.f103259b == c26075c.f103259b && this.f103260c == c26075c.f103260c && this.f103261d == c26075c.f103261d && this.f103262e == c26075c.f103262e && this.f103263f == c26075c.f103263f && AbstractC22676k.m65745e(this.f103264g, c26075c.f103264g) && AbstractC22676k.m65745e(this.f103265h, c26075c.f103265h);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.f103262e.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f103258a.hashCode() * 31, 31, this.f103259b), 31, this.f103260c), 31, this.f103261d)) * 31, 31, this.f103263f);
        InterfaceC41211c interfaceC41211c = this.f103264g;
        int iHashCode = (iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31;
        String str = this.f103265h;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("SignUpScreenState(merchantName=", this.f103258a, ", signUpEnabled=", ", requiresNameCollection=", this.f103259b);
        AbstractC38963t7.m124392v(sbM73379l, this.f103260c, ", canEditEmail=", this.f103261d, ", signUpState=");
        sbM73379l.append(this.f103262e);
        sbM73379l.append(", isSubmitting=");
        sbM73379l.append(this.f103263f);
        sbM73379l.append(", errorMessage=");
        sbM73379l.append(this.f103264g);
        sbM73379l.append(", suggestedEmail=");
        sbM73379l.append(this.f103265h);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
