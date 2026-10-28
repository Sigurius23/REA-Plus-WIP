package fi;

import bc3.InterfaceC3027k1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fi.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C14495a implements InterfaceC14510p {

    /* JADX INFO: renamed from: w */
    public final InterfaceC3027k1 f52925w;

    public /* synthetic */ C14495a(InterfaceC3027k1 interfaceC3027k1) {
        this.f52925w = interfaceC3027k1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14495a) {
            return AbstractC22676k.m65745e(this.f52925w, ((C14495a) obj).f52925w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52925w.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f52925w + ')';
    }
}
