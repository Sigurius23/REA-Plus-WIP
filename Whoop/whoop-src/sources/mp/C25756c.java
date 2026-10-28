package mp;

/* JADX INFO: renamed from: mp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C25756c extends AbstractC25762e {

    /* JADX INFO: renamed from: w */
    public static final C25756c f101470w = new C25756c();

    @Override // mp.AbstractC25762e
    /* JADX INFO: renamed from: a */
    public final Object mo76008a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // mp.AbstractC25762e
    /* JADX INFO: renamed from: b */
    public final boolean mo76009b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
