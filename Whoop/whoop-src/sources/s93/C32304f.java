package s93;

import java.util.Iterator;
import m83.C25270x;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: s93.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C32304f implements InterfaceC32307i {
    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: J */
    public final /* bridge */ boolean mo52688J(C35847e c35847e) {
        return AbstractC32306h.m100567p(this, c35847e);
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: T */
    public final InterfaceC32300b mo52689T(C35847e fqName) {
        AbstractC22676k.m65750j(fqName, "fqName");
        return null;
    }

    @Override // s93.InterfaceC32307i
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return C25270x.f99161w;
    }

    public final String toString() {
        return "EMPTY";
    }
}
