package p563vw;

import java.lang.reflect.Type;
import java.util.Objects;
import p440qw.AbstractC30672g;

/* JADX INFO: renamed from: vw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36540a {

    /* JADX INFO: renamed from: a */
    public final Class f156459a;

    /* JADX INFO: renamed from: b */
    public final Type f156460b;

    /* JADX INFO: renamed from: c */
    public final int f156461c;

    public C36540a(Type type) {
        Objects.requireNonNull(type);
        Type typeM94265a = AbstractC30672g.m94265a(type);
        this.f156460b = typeM94265a;
        this.f156459a = AbstractC30672g.m94272h(typeM94265a);
        this.f156461c = typeM94265a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C36540a) {
            return AbstractC30672g.m94269e(this.f156460b, ((C36540a) obj).f156460b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f156461c;
    }

    public final String toString() {
        return AbstractC30672g.m94275k(this.f156460b);
    }
}
