package x93;

import java.util.Collection;
import m83.C25271y;
import ma3.InterfaceC25373b;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: x93.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C38132x extends AbstractC38126r implements InterfaceC25373b {

    /* JADX INFO: renamed from: a */
    public final C35847e f163241a;

    public C38132x(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        this.f163241a = fqName;
    }

    @Override // ma3.InterfaceC25373b
    /* JADX INFO: renamed from: a */
    public final C38111d mo74422a(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C38132x) {
            return AbstractC22676k.m65745e(this.f163241a, ((C38132x) obj).f163241a);
        }
        return false;
    }

    @Override // ma3.InterfaceC25373b
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return C25271y.f99162w;
    }

    public final int hashCode() {
        return this.f163241a.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        AbstractC11266d.m30443A(C38132x.class, sb4, ": ");
        sb4.append(this.f163241a);
        return sb4.toString();
    }
}
