package n23;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n23.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C26204g extends AbstractC26205h {

    /* JADX INFO: renamed from: a */
    public final Object f103919a;

    public C26204g(Object value) {
        AbstractC22676k.m65750j(value, "value");
        this.f103919a = value;
    }

    /* JADX INFO: renamed from: e */
    public final Object m77814e() {
        return this.f103919a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26204g) && AbstractC22676k.m65745e(this.f103919a, ((C26204g) obj).f103919a);
    }

    public final int hashCode() {
        return this.f103919a.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f103919a, "Success(value=", ")");
    }
}
