package io;

import java.util.Map;
import p465rm.InterfaceC31529f;
import p690zr.AbstractC41047q;
import p690zr.C41009b1;

/* JADX INFO: renamed from: io.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C20709u implements InterfaceC31529f {

    /* JADX INFO: renamed from: x */
    public static final C20709u f77529x = new C20709u(C41009b1.f176959G);

    /* JADX INFO: renamed from: w */
    public final C41009b1 f77530w;

    public C20709u(Map map) {
        this.f77530w = C41009b1.m133232a(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20709u.class != obj.getClass()) {
            return false;
        }
        C41009b1 c41009b1 = ((C20709u) obj).f77530w;
        C41009b1 c41009b2 = this.f77530w;
        c41009b2.getClass();
        return AbstractC41047q.m133275e(c41009b1, c41009b2);
    }

    public final int hashCode() {
        return this.f77530w.hashCode();
    }
}
