package i63;

import c93.InterfaceC4351m;
import java.util.Set;
import m83.C25235a0;
import p026b2.C2312r;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i63.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C18167f implements InterfaceC18174m {

    /* JADX INFO: renamed from: c */
    public static final C18167f f70490c = new C18167f();

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: b */
    public final Set mo52165b() {
        return C25235a0.f99113w;
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: c */
    public final void mo52166c(InterfaceC4351m interfaceC4351m) {
        AbstractC37056f.m119002z(this, (C2312r) interfaceC4351m);
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: d */
    public final boolean mo52167d() {
        return true;
    }

    @Override // o63.InterfaceC27622m
    public final String get(String name) {
        AbstractC22676k.m65750j(name, "name");
        return null;
    }

    public final String toString() {
        return "Headers " + C25235a0.f99113w;
    }
}
