package i63;

import c93.InterfaceC4351m;
import java.util.Set;
import m83.C25235a0;
import o73.C27648a;

/* JADX INFO: renamed from: i63.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C18168g implements InterfaceC18184w {

    /* JADX INFO: renamed from: c */
    public static final C18168g f70491c = new C18168g();

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: b */
    public final Set mo52165b() {
        return C25235a0.f99113w;
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: c */
    public final void mo52166c(InterfaceC4351m interfaceC4351m) {
        C27648a.m83603z(this, interfaceC4351m);
    }

    @Override // o63.InterfaceC27622m
    /* JADX INFO: renamed from: d */
    public final boolean mo52167d() {
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC18184w) && ((InterfaceC18184w) obj).isEmpty();
    }

    @Override // o63.InterfaceC27622m
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + C25235a0.f99113w;
    }
}
