package d20;

import p715kotlin.jvm.internal.AbstractC22676k;
import v10.C35526b;

/* JADX INFO: renamed from: d20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C11489e extends AbstractC11492h {

    /* JADX INFO: renamed from: a */
    public final C35526b f36948a;

    public C11489e(C35526b c35526b) {
        this.f36948a = c35526b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11489e) && AbstractC22676k.m65745e(this.f36948a, ((C11489e) obj).f36948a);
    }

    public final int hashCode() {
        return this.f36948a.hashCode();
    }

    public final String toString() {
        return "Complete(result=" + this.f36948a + ")";
    }
}
