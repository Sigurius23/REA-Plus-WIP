package kz;

import p236j.AbstractC21065d;
import p266jz.C22057e;
import p266jz.C22058f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C22913j implements InterfaceC22918o {

    /* JADX INFO: renamed from: a */
    public final AbstractC21065d f90465a;

    public C22913j(AbstractC21065d activityResultLauncher) {
        AbstractC22676k.m65750j(activityResultLauncher, "activityResultLauncher");
        this.f90465a = activityResultLauncher;
    }

    @Override // kz.InterfaceC22918o
    /* JADX INFO: renamed from: c */
    public final void mo6701c(C22058f configuration, C22057e c22057e) {
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f90465a.mo4052a(new C22904a(configuration, c22057e), null);
    }
}
