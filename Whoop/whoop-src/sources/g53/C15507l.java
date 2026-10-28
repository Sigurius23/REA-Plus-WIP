package g53;

/* JADX INFO: renamed from: g53.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C15507l extends AbstractC15508m {

    /* JADX INFO: renamed from: a */
    public final EnumC15496a f58177a;

    public C15507l(EnumC15496a enumC15496a) {
        this.f58177a = enumC15496a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15507l) && this.f58177a == ((C15507l) obj).f58177a;
    }

    public final int hashCode() {
        return this.f58177a.hashCode();
    }

    public final String toString() {
        return "RestartConnection(reason=" + this.f58177a + ")";
    }
}
