package p218ic;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ic.z */
/* JADX INFO: loaded from: classes.dex */
public final class C18392z extends AbstractC18379q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18392z(Class workerClass) {
        super(workerClass);
        AbstractC22676k.m65750j(workerClass, "workerClass");
    }

    @Override // p218ic.AbstractC18379q0
    /* JADX INFO: renamed from: c */
    public final AbstractC18381r0 mo52869c() {
        if (this.f71542a && this.f71544c.f123643j.f71468d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new C18347a0(this.f71543b, this.f71544c, this.f71545d);
    }

    @Override // p218ic.AbstractC18379q0
    /* JADX INFO: renamed from: d */
    public final AbstractC18379q0 mo52870d() {
        return this;
    }
}
