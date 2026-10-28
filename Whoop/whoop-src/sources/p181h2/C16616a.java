package p181h2;

import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: h2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16616a {

    /* JADX INFO: renamed from: a */
    public float f63933a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f63934b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f63935c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f63936d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m47183a(float f13, float f14, float f15, float f16) {
        this.f63933a = Math.max(f13, this.f63933a);
        this.f63934b = Math.max(f14, this.f63934b);
        this.f63935c = Math.min(f15, this.f63935c);
        this.f63936d = Math.min(f16, this.f63936d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47184b() {
        return (this.f63933a >= this.f63935c) | (this.f63934b >= this.f63936d);
    }

    public final String toString() {
        return "MutableRect(" + AbstractC22674j.m65711S(this.f63933a) + ", " + AbstractC22674j.m65711S(this.f63934b) + ", " + AbstractC22674j.m65711S(this.f63935c) + ", " + AbstractC22674j.m65711S(this.f63936d) + ')';
    }
}
