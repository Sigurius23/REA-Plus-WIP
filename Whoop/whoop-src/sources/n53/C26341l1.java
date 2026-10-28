package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.l1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26341l1 {

    /* JADX INFO: renamed from: a */
    public final String f104671a;

    public C26341l1(String dir1) {
        AbstractC22676k.m65750j(dir1, "dir1");
        this.f104671a = dir1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26341l1) && AbstractC22676k.m65745e(this.f104671a, ((C26341l1) obj).f104671a);
    }

    public final int hashCode() {
        return this.f104671a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpSimulcast(dir1=", this.f104671a, ")");
    }
}
