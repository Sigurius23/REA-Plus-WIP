package gs;

import java.util.Objects;

/* JADX INFO: renamed from: gs.w */
/* JADX INFO: loaded from: classes.dex */
public final class C16154w extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final C16139j f61373a;

    public C16154w(C16139j c16139j) {
        this.f61373a = c16139j;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61373a != C16139j.f61315v;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16154w) && ((C16154w) obj).f61373a == this.f61373a;
    }

    public final int hashCode() {
        return Objects.hash(C16154w.class, this.f61373a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f61373a + ")";
    }
}
