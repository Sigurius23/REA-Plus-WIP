package cz;

import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11199f0 {

    /* JADX INFO: renamed from: a */
    public final boolean f35920a;

    /* JADX INFO: renamed from: b */
    public final String f35921b;

    public C11199f0(boolean z4, String str) {
        this.f35920a = z4;
        this.f35921b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11199f0)) {
            return false;
        }
        C11199f0 c11199f0 = (C11199f0) obj;
        return this.f35920a == c11199f0.f35920a && AbstractC22676k.m65745e(this.f35921b, c11199f0.f35921b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f35920a) * 31;
        String str = this.f35921b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3855a.m11825i("SelectionConfirmationState(isConfirming=", ", error=", this.f35921b, ")", this.f35920a);
    }
}
