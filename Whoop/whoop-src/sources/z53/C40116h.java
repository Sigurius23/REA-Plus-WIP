package z53;

import c93.InterfaceC4351m;
import i63.InterfaceC18174m;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import p026b2.C2312r;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: z53.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C40116h implements InterfaceC18174m {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C34807d0 f173159c;

    public C40116h(C34807d0 c34807d0) {
        this.f173159c = c34807d0;
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: b */
    public final Set mo52165b() {
        return this.f173159c.m109866e().entrySet();
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
        List listM109868j = this.f173159c.m109868j(name);
        if (listM109868j.isEmpty()) {
            listM109868j = null;
        }
        if (listM109868j != null) {
            return (String) AbstractC25265s.m74100H0(listM109868j);
        }
        return null;
    }
}
