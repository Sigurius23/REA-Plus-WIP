package p194hg;

import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: hg.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C17250k {

    /* JADX INFO: renamed from: a */
    public final Object f66270a;

    /* JADX INFO: renamed from: b */
    public final C22672i f66271b;

    /* JADX WARN: Multi-variable type inference failed */
    public C17250k(Object obj, InterfaceC4351m interfaceC4351m) {
        this.f66270a = obj;
        this.f66271b = (C22672i) interfaceC4351m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17250k)) {
            return false;
        }
        C17250k c17250k = (C17250k) obj;
        return AbstractC22676k.m65745e(this.f66270a, c17250k.f66270a) && this.f66271b.equals(c17250k.f66271b);
    }

    public final int hashCode() {
        Object obj = this.f66270a;
        return this.f66271b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "SdkSerializableLambda(input=" + this.f66270a + ", serializeFn=" + this.f66271b + ')';
    }
}
