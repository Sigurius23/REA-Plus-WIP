package p023ay;

import d20.C11496l;
import d20.InterfaceC11497m;
import kz.C22905b;
import kz.InterfaceC22918o;
import p236j.AbstractC21065d;
import p266jz.C22057e;
import p266jz.C22058f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2151y implements InterfaceC2152z, InterfaceC11497m, InterfaceC22918o {

    /* JADX INFO: renamed from: a */
    public AbstractC21065d f8558a;

    public C2151y(AbstractC21065d launcher, int i13) {
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(launcher, "launcher");
                this.f8558a = launcher;
                break;
            default:
                AbstractC22676k.m65750j(launcher, "launcher");
                this.f8558a = launcher;
                break;
        }
    }

    @Override // p023ay.InterfaceC2152z
    /* JADX INFO: renamed from: a */
    public void mo6699a(C2142p c2142p) {
        this.f8558a.mo4052a(c2142p, null);
    }

    @Override // s40.InterfaceC32135b
    /* JADX INFO: renamed from: b */
    public void mo6700b(Object obj) {
        this.f8558a.mo4052a((C11496l) obj, null);
    }

    @Override // kz.InterfaceC22918o
    /* JADX INFO: renamed from: c */
    public void mo6701c(C22058f c22058f, C22057e c22057e) {
        this.f8558a.mo4052a(new C22905b(c22058f, c22057e), null);
    }
}
