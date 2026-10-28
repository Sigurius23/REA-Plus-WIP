package gm;

import a33.C0352d;
import dm.C12173c;
import dm.InterfaceC12175e;
import java.util.Set;
import p537ux.C35331f0;

/* JADX INFO: renamed from: gm.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C15988p implements InterfaceC12175e {

    /* JADX INFO: renamed from: a */
    public final Set f60502a;

    /* JADX INFO: renamed from: b */
    public final C15981i f60503b;

    /* JADX INFO: renamed from: c */
    public final C15989q f60504c;

    public C15988p(Set set, C15981i c15981i, C15989q c15989q) {
        this.f60502a = set;
        this.f60503b = c15981i;
        this.f60504c = c15989q;
    }

    /* JADX INFO: renamed from: a */
    public final C0352d m45131a(C12173c c12173c, C35331f0 c35331f0) {
        Set set = this.f60502a;
        if (set.contains(c12173c)) {
            return new C0352d(this.f60503b, c12173c, c35331f0, this.f60504c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c12173c, set));
    }
}
