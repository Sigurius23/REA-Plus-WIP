package b30;

import c93.InterfaceC4339a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.j3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2550j3 {

    /* JADX INFO: renamed from: a */
    public final boolean f9910a;

    /* JADX INFO: renamed from: b */
    public final boolean f9911b;

    /* JADX INFO: renamed from: c */
    public final boolean f9912c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f9913d;

    public C2550j3(boolean z4, boolean z13, boolean z14, InterfaceC4339a onEditIconPressed) {
        AbstractC22676k.m65750j(onEditIconPressed, "onEditIconPressed");
        this.f9910a = z4;
        this.f9911b = z13;
        this.f9912c = z14;
        this.f9913d = onEditIconPressed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2550j3)) {
            return false;
        }
        C2550j3 c2550j3 = (C2550j3) obj;
        return this.f9910a == c2550j3.f9910a && this.f9911b == c2550j3.f9911b && this.f9912c == c2550j3.f9912c && AbstractC22676k.m65745e(this.f9913d, c2550j3.f9913d);
    }

    public final int hashCode() {
        return this.f9913d.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.f9910a) * 31, 31, this.f9911b), 31, this.f9912c);
    }

    public final String toString() {
        StringBuilder sbM32002u = AbstractC11895b.m32002u("PaymentSheetTopBarState(showTestModeLabel=", ", showEditMenu=", ", isEditing=", this.f9910a, this.f9911b);
        sbM32002u.append(this.f9912c);
        sbM32002u.append(", onEditIconPressed=");
        sbM32002u.append(this.f9913d);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
