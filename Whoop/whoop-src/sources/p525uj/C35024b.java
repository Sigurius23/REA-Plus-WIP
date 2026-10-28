package p525uj;

import p208i2.InterfaceC17869a1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uj.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C35024b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC17869a1 f148207a;

    public C35024b(InterfaceC17869a1 interfaceC17869a1) {
        this.f148207a = interfaceC17869a1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35024b) && AbstractC22676k.m65745e(this.f148207a, ((C35024b) obj).f148207a);
    }

    public final int hashCode() {
        return this.f148207a.hashCode();
    }

    public final String toString() {
        return "ButtonShape(container=" + this.f148207a + ')';
    }
}
