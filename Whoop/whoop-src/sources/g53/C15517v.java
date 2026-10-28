package g53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g53.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C15517v extends AbstractC15519x {

    /* JADX INFO: renamed from: a */
    public final C26200c f58187a;

    public C15517v(C26200c c26200c) {
        this.f58187a = c26200c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15517v) && AbstractC22676k.m65745e(this.f58187a, ((C15517v) obj).f58187a);
    }

    public final int hashCode() {
        return this.f58187a.hashCode();
    }

    public final String toString() {
        return "UnrecoverableError(error=" + this.f58187a + ")";
    }
}
