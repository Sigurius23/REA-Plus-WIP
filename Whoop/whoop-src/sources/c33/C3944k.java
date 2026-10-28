package c33;

import p715kotlin.jvm.internal.AbstractC22676k;
import z40.AbstractC40058e;

/* JADX INFO: renamed from: c33.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C3944k extends AbstractC3945l {

    /* JADX INFO: renamed from: a */
    public final String f16084a;

    /* JADX INFO: renamed from: b */
    public final AbstractC40058e f16085b;

    public C3944k(AbstractC40058e audio) {
        AbstractC22676k.m65750j(audio, "audio");
        this.f16084a = "Wired Headset";
        this.f16085b = audio;
    }

    @Override // c33.AbstractC3945l
    /* JADX INFO: renamed from: a */
    public final AbstractC40058e mo11992a() {
        return this.f16085b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3944k)) {
            return false;
        }
        C3944k c3944k = (C3944k) obj;
        return AbstractC22676k.m65745e(this.f16084a, c3944k.f16084a) && AbstractC22676k.m65745e(this.f16085b, c3944k.f16085b);
    }

    public final int hashCode() {
        return this.f16085b.hashCode() + (this.f16084a.hashCode() * 31);
    }

    public final String toString() {
        return "WiredHeadset(name=" + this.f16084a + ", audio=" + this.f16085b + ")";
    }
}
