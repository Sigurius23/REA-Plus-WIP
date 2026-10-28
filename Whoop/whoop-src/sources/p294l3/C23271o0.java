package p294l3;

import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: l3.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23271o0 implements InterfaceC23244b {

    /* JADX INFO: renamed from: a */
    public final String f92213a;

    public /* synthetic */ C23271o0(String str) {
        this.f92213a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23271o0) {
            return AbstractC22676k.m65745e(this.f92213a, ((C23271o0) obj).f92213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f92213a.hashCode();
    }

    public final String toString() {
        return AbstractC31061c.m95633i(')', "StringAnnotation(value=", this.f92213a);
    }
}
