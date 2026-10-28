package p326mf;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mf.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25492l {
    /* JADX INFO: renamed from: a */
    public abstract Long mo74901a();

    /* JADX INFO: renamed from: b */
    public boolean mo74904b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo74902c();

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC25492l)) {
            return false;
        }
        AbstractC25492l abstractC25492l = (AbstractC25492l) obj;
        return AbstractC22676k.m65745e(abstractC25492l.mo74901a(), mo74901a()) && abstractC25492l.mo74902c() == mo74902c() && abstractC25492l.mo74904b() == mo74904b();
    }
}
