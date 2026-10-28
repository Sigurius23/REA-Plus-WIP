package b30;

import c13.AbstractC3855a;
import p507tx.AbstractC34235f;

/* JADX INFO: renamed from: b30.h6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2537h6 extends AbstractC34235f {

    /* JADX INFO: renamed from: a */
    public final boolean f9852a;

    public C2537h6(boolean z4) {
        this.f9852a = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2537h6) && this.f9852a == ((C2537h6) obj).f9852a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9852a);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("SetAsDefaultCheckboxChanged(isChecked=", ")", this.f9852a);
    }
}
