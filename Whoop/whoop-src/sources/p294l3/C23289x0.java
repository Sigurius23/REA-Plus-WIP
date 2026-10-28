package p294l3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23289x0 implements InterfaceC23244b {

    /* JADX INFO: renamed from: a */
    public final String f92269a;

    public C23289x0(String str) {
        this.f92269a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m67383a() {
        return this.f92269a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23289x0) {
            return AbstractC22676k.m65745e(this.f92269a, ((C23289x0) obj).f92269a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92269a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f92269a, ')');
    }
}
