package p163g1;

import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g1.v2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15168v2 {

    /* JADX INFO: renamed from: a */
    public final Object f56899a;

    /* JADX INFO: renamed from: b */
    public final C37816b f56900b;

    public C15168v2(C15072l6 c15072l6, C37816b c37816b) {
        this.f56899a = c15072l6;
        this.f56900b = c37816b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15168v2)) {
            return false;
        }
        C15168v2 c15168v2 = (C15168v2) obj;
        return AbstractC22676k.m65745e(this.f56899a, c15168v2.f56899a) && this.f56900b.equals(c15168v2.f56900b);
    }

    public final int hashCode() {
        Object obj = this.f56899a;
        return this.f56900b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f56899a + ", transition=" + this.f56900b + ')';
    }
}
