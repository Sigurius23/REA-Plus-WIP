package b30;

import c93.InterfaceC4339a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.h3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2534h3 {

    /* JADX INFO: renamed from: a */
    public final boolean f9840a;

    /* JADX INFO: renamed from: b */
    public final boolean f9841b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f9842c;

    public C2534h3(boolean z4, boolean z13, InterfaceC4339a onEditIconPressed) {
        AbstractC22676k.m65750j(onEditIconPressed, "onEditIconPressed");
        this.f9840a = z4;
        this.f9841b = z13;
        this.f9842c = onEditIconPressed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2534h3)) {
            return false;
        }
        C2534h3 c2534h3 = (C2534h3) obj;
        return this.f9840a == c2534h3.f9840a && this.f9841b == c2534h3.f9841b && AbstractC22676k.m65745e(this.f9842c, c2534h3.f9842c);
    }

    public final int hashCode() {
        return this.f9842c.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.f9840a) * 31, 31, this.f9841b);
    }

    public final String toString() {
        StringBuilder sbM32002u = AbstractC11895b.m32002u("Maybe(isEditing=", ", canEdit=", ", onEditIconPressed=", this.f9840a, this.f9841b);
        sbM32002u.append(this.f9842c);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
