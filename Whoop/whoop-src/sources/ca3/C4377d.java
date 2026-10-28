package ca3;

import j93.InterfaceC21461d;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ca3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C4377d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f17707a;

    public C4377d(InterfaceC21461d klass) {
        AbstractC22676k.m65750j(klass, "klass");
        this.f17707a = klass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4377d) {
            return AbstractC22676k.m65745e(this.f17707a, ((C4377d) obj).f17707a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17707a.hashCode();
    }

    public final String toString() {
        return AbstractC21598x.m60663S(this.f17707a).getName();
    }
}
