package c33;

import p715kotlin.jvm.internal.AbstractC22676k;
import z40.AbstractC40058e;

/* JADX INFO: renamed from: c33.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3941h extends AbstractC3945l {

    /* JADX INFO: renamed from: a */
    public final String f16078a;

    /* JADX INFO: renamed from: b */
    public final AbstractC40058e f16079b;

    public C3941h(AbstractC40058e audio) {
        AbstractC22676k.m65750j(audio, "audio");
        this.f16078a = "Bluetooth";
        this.f16079b = audio;
    }

    @Override // c33.AbstractC3945l
    /* JADX INFO: renamed from: a */
    public final AbstractC40058e mo11992a() {
        return this.f16079b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3941h)) {
            return false;
        }
        C3941h c3941h = (C3941h) obj;
        return AbstractC22676k.m65745e(this.f16078a, c3941h.f16078a) && AbstractC22676k.m65745e(this.f16079b, c3941h.f16079b);
    }

    public final int hashCode() {
        return this.f16079b.hashCode() + (this.f16078a.hashCode() * 31);
    }

    public final String toString() {
        return "BluetoothHeadset(name=" + this.f16078a + ", audio=" + this.f16079b + ")";
    }
}
