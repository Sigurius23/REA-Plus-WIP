package c33;

import p715kotlin.jvm.internal.AbstractC22676k;
import z40.AbstractC40058e;

/* JADX INFO: renamed from: c33.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3943j extends AbstractC3945l {

    /* JADX INFO: renamed from: a */
    public final String f16082a;

    /* JADX INFO: renamed from: b */
    public final AbstractC40058e f16083b;

    public C3943j(AbstractC40058e audio) {
        AbstractC22676k.m65750j(audio, "audio");
        this.f16082a = "Speakerphone";
        this.f16083b = audio;
    }

    @Override // c33.AbstractC3945l
    /* JADX INFO: renamed from: a */
    public final AbstractC40058e mo11992a() {
        return this.f16083b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3943j)) {
            return false;
        }
        C3943j c3943j = (C3943j) obj;
        return AbstractC22676k.m65745e(this.f16082a, c3943j.f16082a) && AbstractC22676k.m65745e(this.f16083b, c3943j.f16083b);
    }

    public final int hashCode() {
        return this.f16083b.hashCode() + (this.f16082a.hashCode() * 31);
    }

    public final String toString() {
        return "Speakerphone(name=" + this.f16082a + ", audio=" + this.f16083b + ")";
    }
}
