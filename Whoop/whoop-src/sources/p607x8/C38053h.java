package p607x8;

import p309lo.C24547e;

/* JADX INFO: renamed from: x8.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C38053h {

    /* JADX INFO: renamed from: a */
    public final Object f162991a;

    /* JADX INFO: renamed from: b */
    public C24547e f162992b = new C24547e(1);

    /* JADX INFO: renamed from: c */
    public boolean f162993c;

    /* JADX INFO: renamed from: d */
    public boolean f162994d;

    public C38053h(Object obj) {
        this.f162991a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38053h.class != obj.getClass()) {
            return false;
        }
        return this.f162991a.equals(((C38053h) obj).f162991a);
    }

    public final int hashCode() {
        return this.f162991a.hashCode();
    }
}
