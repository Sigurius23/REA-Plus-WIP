package c33;

import p715kotlin.jvm.internal.AbstractC22676k;
import z40.AbstractC40058e;

/* JADX INFO: renamed from: c33.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C3942i extends AbstractC3945l {

    /* JADX INFO: renamed from: a */
    public final String f16080a;

    /* JADX INFO: renamed from: b */
    public final AbstractC40058e f16081b;

    public C3942i(AbstractC40058e audio) {
        AbstractC22676k.m65750j(audio, "audio");
        this.f16080a = "Earpiece";
        this.f16081b = audio;
    }

    @Override // c33.AbstractC3945l
    /* JADX INFO: renamed from: a */
    public final AbstractC40058e mo11992a() {
        return this.f16081b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3942i)) {
            return false;
        }
        C3942i c3942i = (C3942i) obj;
        return AbstractC22676k.m65745e(this.f16080a, c3942i.f16080a) && AbstractC22676k.m65745e(this.f16081b, c3942i.f16081b);
    }

    public final int hashCode() {
        return this.f16081b.hashCode() + (this.f16080a.hashCode() * 31);
    }

    public final String toString() {
        return "Earpiece(name=" + this.f16080a + ", audio=" + this.f16081b + ")";
    }
}
