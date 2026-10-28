package d30;

import o20.C27457b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11540i1 implements InterfaceC11543j1 {

    /* JADX INFO: renamed from: a */
    public final C27457b f37215a;

    public C11540i1(C27457b c27457b) {
        this.f37215a = c27457b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11540i1) && AbstractC22676k.m65745e(this.f37215a, ((C11540i1) obj).f37215a);
    }

    public final int hashCode() {
        C27457b c27457b = this.f37215a;
        if (c27457b == null) {
            return 0;
        }
        return c27457b.hashCode();
    }

    public final String toString() {
        return "FormFieldValuesChanged(formValues=" + this.f37215a + ")";
    }
}
