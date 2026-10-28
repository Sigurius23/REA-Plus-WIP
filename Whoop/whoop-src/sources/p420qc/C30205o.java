package p420qc;

import p218ic.EnumC18371m0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.o */
/* JADX INFO: loaded from: classes.dex */
public final class C30205o {

    /* JADX INFO: renamed from: a */
    public String f123613a;

    /* JADX INFO: renamed from: b */
    public EnumC18371m0 f123614b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30205o)) {
            return false;
        }
        C30205o c30205o = (C30205o) obj;
        return AbstractC22676k.m65745e(this.f123613a, c30205o.f123613a) && this.f123614b == c30205o.f123614b;
    }

    public final int hashCode() {
        return this.f123614b.hashCode() + (this.f123613a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f123613a + ", state=" + this.f123614b + ')';
    }
}
