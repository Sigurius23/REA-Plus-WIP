package t00;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: t00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33254a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41211c f138652a;

    /* JADX INFO: renamed from: b */
    public final boolean f138653b;

    /* JADX INFO: renamed from: c */
    public final int f138654c;

    /* JADX INFO: renamed from: d */
    public final Integer f138655d;

    /* JADX INFO: renamed from: e */
    public final String f138656e;

    /* JADX INFO: renamed from: f */
    public final String f138657f;

    /* JADX INFO: renamed from: g */
    public final boolean f138658g;

    /* JADX INFO: renamed from: h */
    public final String f138659h;

    /* JADX INFO: renamed from: i */
    public final Integer f138660i;

    public C33254a(InterfaceC41211c displayName, boolean z4, int i13, Integer num, String str, String str2, boolean z13, String str3, Integer num2) {
        AbstractC22676k.m65750j(displayName, "displayName");
        this.f138652a = displayName;
        this.f138653b = z4;
        this.f138654c = i13;
        this.f138655d = num;
        this.f138656e = str;
        this.f138657f = str2;
        this.f138658g = z13;
        this.f138659h = str3;
        this.f138660i = num2;
    }

    /* JADX INFO: renamed from: a */
    public static C33254a m105492a(C33254a c33254a, C41210b c41210b, String str, int i13) {
        InterfaceC41211c interfaceC41211c = c41210b;
        if ((i13 & 1) != 0) {
            interfaceC41211c = c33254a.f138652a;
        }
        InterfaceC41211c displayName = interfaceC41211c;
        boolean z4 = (i13 & 2) != 0 ? c33254a.f138653b : false;
        int i14 = c33254a.f138654c;
        Integer num = c33254a.f138655d;
        String str2 = c33254a.f138656e;
        String str3 = c33254a.f138657f;
        boolean z13 = c33254a.f138658g;
        if ((i13 & 128) != 0) {
            str = c33254a.f138659h;
        }
        Integer num2 = c33254a.f138660i;
        c33254a.getClass();
        AbstractC22676k.m65750j(displayName, "displayName");
        return new C33254a(displayName, z4, i14, num, str2, str3, z13, str, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33254a)) {
            return false;
        }
        C33254a c33254a = (C33254a) obj;
        return AbstractC22676k.m65745e(this.f138652a, c33254a.f138652a) && this.f138653b == c33254a.f138653b && this.f138654c == c33254a.f138654c && AbstractC22676k.m65745e(this.f138655d, c33254a.f138655d) && AbstractC22676k.m65745e(this.f138656e, c33254a.f138656e) && AbstractC22676k.m65745e(this.f138657f, c33254a.f138657f) && this.f138658g == c33254a.f138658g && AbstractC22676k.m65745e(this.f138659h, c33254a.f138659h) && AbstractC22676k.m65745e(this.f138660i, c33254a.f138660i);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f138654c, AbstractC2875y.m8289b(this.f138652a.hashCode() * 31, 31, this.f138653b), 31);
        Integer num = this.f138655d;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f138656e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138657f;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f138658g);
        String str3 = this.f138659h;
        int iHashCode3 = (iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f138660i;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FormHeaderInformation(displayName=");
        sb4.append(this.f138652a);
        sb4.append(", shouldShowIcon=");
        sb4.append(this.f138653b);
        sb4.append(", iconResource=");
        sb4.append(this.f138654c);
        sb4.append(", iconResourceNight=");
        sb4.append(this.f138655d);
        sb4.append(", lightThemeIconUrl=");
        AbstractC11266d.m30444B(sb4, this.f138656e, ", darkThemeIconUrl=", this.f138657f, ", iconRequiresTinting=");
        AbstractC38963t7.m124391u(sb4, this.f138658g, ", promoBadge=", this.f138659h, ", outlinedIconResource=");
        return AbstractC11478a.m30859k(sb4, this.f138660i, ")");
    }
}
