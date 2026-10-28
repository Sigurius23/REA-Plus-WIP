package g53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g53.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C15512q extends AbstractC15519x {

    /* JADX INFO: renamed from: a */
    public final C26200c f58182a;

    public C15512q(C26200c c26200c) {
        this.f58182a = c26200c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15512q) && AbstractC22676k.m65745e(this.f58182a, ((C15512q) obj).f58182a);
    }

    public final int hashCode() {
        return this.f58182a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f58182a + ")";
    }
}
