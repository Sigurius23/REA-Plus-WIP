package q00;

import p266jz.C22058f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29705b implements InterfaceC29707c {

    /* JADX INFO: renamed from: a */
    public final C22058f f121473a;

    public C29705b(C22058f c22058f) {
        this.f121473a = c22058f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29705b) && AbstractC22676k.m65745e(this.f121473a, ((C29705b) obj).f121473a);
    }

    public final int hashCode() {
        C22058f c22058f = this.f121473a;
        if (c22058f == null) {
            return 0;
        }
        return c22058f.hashCode();
    }

    public final String toString() {
        return "Processing(configToPresent=" + this.f121473a + ")";
    }
}
