package p341nh;

import bh.C3244g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C26711e implements InterfaceC26715i {

    /* JADX INFO: renamed from: w */
    public final C26714h f106212w;

    public C26711e(C26714h c26714h) {
        this.f106212w = c26714h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C26711e) {
            return AbstractC22676k.m65745e(this.f106212w, ((C26711e) obj).f106212w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106212w.hashCode();
    }

    @Override // p341nh.InterfaceC26715i
    /* JADX INFO: renamed from: j */
    public final Object mo1866j(C3244g c3244g) {
        return this.f106212w;
    }
}
