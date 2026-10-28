package p502ti;

import java.util.List;
import p119ej.C13224a;

/* JADX INFO: renamed from: ti.c */
/* JADX INFO: loaded from: classes.dex */
public final class C33820c implements InterfaceC33819b {

    /* JADX INFO: renamed from: w */
    public final C13224a f141643w;

    /* JADX INFO: renamed from: x */
    public float f141644x = -1.0f;

    public C33820c(List list) {
        this.f141643w = (C13224a) list.get(0);
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: a */
    public final boolean mo9718a(float f13) {
        if (this.f141644x == f13) {
            return true;
        }
        this.f141644x = f13;
        return false;
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: b */
    public final C13224a mo9719b() {
        return this.f141643w;
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: c */
    public final boolean mo9720c(float f13) {
        return !this.f141643w.m37125c();
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: d */
    public final float mo9721d() {
        return this.f141643w.m37124b();
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: e */
    public final float mo9722e() {
        return this.f141643w.m37123a();
    }

    @Override // p502ti.InterfaceC33819b
    public final boolean isEmpty() {
        return false;
    }
}
