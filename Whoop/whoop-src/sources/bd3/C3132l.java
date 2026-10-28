package bd3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bd3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C3132l extends C3130k {

    /* JADX INFO: renamed from: d */
    public final boolean f12280d;

    public C3132l(C3143v c3143v, boolean z4) {
        super(c3143v);
        this.f12280d = z4;
    }

    @Override // bd3.C3130k
    /* JADX INFO: renamed from: l */
    public final void mo9001l(String value) {
        AbstractC22676k.m65750j(value, "value");
        if (this.f12280d) {
            super.mo9001l(value);
        } else {
            m8999j(value);
        }
    }
}
