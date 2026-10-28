package g53;

import n23.C26200c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g53.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C15502g extends AbstractC15506k {

    /* JADX INFO: renamed from: a */
    public final C26200c f58173a;

    public C15502g(C26200c c26200c) {
        this.f58173a = c26200c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15502g) && AbstractC22676k.m65745e(this.f58173a, ((C15502g) obj).f58173a);
    }

    public final int hashCode() {
        return this.f58173a.hashCode();
    }

    public final String toString() {
        return "DisconnectedTemporarily(error=" + this.f58173a + ")";
    }
}
