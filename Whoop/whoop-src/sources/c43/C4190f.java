package c43;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4190f {

    /* JADX INFO: renamed from: a */
    public C4198n f17047a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4190f) && AbstractC22676k.m65745e(this.f17047a, ((C4190f) obj).f17047a);
    }

    public final int hashCode() {
        return this.f17047a.hashCode();
    }

    public final String toString() {
        return "Ingress(rtmp=" + this.f17047a + ")";
    }
}
