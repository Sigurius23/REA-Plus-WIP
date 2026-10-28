package ws;

import java.util.Objects;
import p347ns.AbstractC27099t;

/* JADX INFO: renamed from: ws.h */
/* JADX INFO: loaded from: classes.dex */
public final class C37586h extends AbstractC27099t {

    /* JADX INFO: renamed from: a */
    public final C37585g f160735a;

    public C37586h(C37585g c37585g) {
        this.f160735a = c37585g;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C37586h) && ((C37586h) obj).f160735a == this.f160735a;
    }

    public final int hashCode() {
        return Objects.hash(C37586h.class, this.f160735a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.f160735a + ")";
    }
}
