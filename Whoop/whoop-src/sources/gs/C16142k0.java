package gs;

import java.util.Objects;

/* JADX INFO: renamed from: gs.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16142k0 extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final C16139j f61331a;

    public C16142k0(C16139j c16139j) {
        this.f61331a = c16139j;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61331a != C16139j.f61318y;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16142k0) && ((C16142k0) obj).f61331a == this.f61331a;
    }

    public final int hashCode() {
        return Objects.hash(C16142k0.class, this.f61331a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f61331a + ")";
    }
}
