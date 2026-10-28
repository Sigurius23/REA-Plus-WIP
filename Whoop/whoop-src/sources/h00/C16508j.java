package h00;

import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C16508j {

    /* JADX INFO: renamed from: a */
    public final boolean f63480a;

    /* JADX INFO: renamed from: b */
    public final boolean f63481b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c f63482c;

    /* JADX INFO: renamed from: d */
    public final boolean f63483d;

    public C16508j(boolean z4, boolean z13, InterfaceC41211c interfaceC41211c, boolean z14) {
        this.f63480a = z4;
        this.f63481b = z13;
        this.f63482c = interfaceC41211c;
        this.f63483d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16508j)) {
            return false;
        }
        C16508j c16508j = (C16508j) obj;
        return this.f63480a == c16508j.f63480a && this.f63481b == c16508j.f63481b && AbstractC22676k.m65745e(this.f63482c, c16508j.f63482c) && this.f63483d == c16508j.f63483d;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.f63480a) * 31, 31, this.f63481b);
        InterfaceC41211c interfaceC41211c = this.f63482c;
        return Boolean.hashCode(this.f63483d) + ((iM8289b + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM32002u = AbstractC11895b.m32002u("LinkAppBarState(showHeader=", ", canNavigateBack=", ", title=", this.f63480a, this.f63481b);
        sbM32002u.append(this.f63482c);
        sbM32002u.append(", isElevated=");
        sbM32002u.append(this.f63483d);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }
}
