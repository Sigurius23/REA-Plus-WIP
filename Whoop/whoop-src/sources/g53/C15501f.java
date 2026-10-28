package g53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g53.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15501f extends AbstractC15506k {

    /* JADX INFO: renamed from: a */
    public final C26200c f58172a;

    public C15501f(C26200c c26200c) {
        this.f58172a = c26200c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15501f) && AbstractC22676k.m65745e(this.f58172a, ((C15501f) obj).f58172a);
    }

    public final int hashCode() {
        return this.f58172a.hashCode();
    }

    public final String toString() {
        return "DisconnectedPermanently(error=" + this.f58172a + ")";
    }
}
