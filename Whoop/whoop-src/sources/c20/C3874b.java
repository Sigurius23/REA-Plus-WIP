package c20;

import a30.C0332w0;
import android.content.Context;
import c93.InterfaceC4339a;
import d20.C11488d;
import d20.C11493i;
import h20.C16651f;
import java.util.Map;
import java.util.Set;
import p408q.C29662f;
import p537ux.C35358t;
import u10.C34416d;
import v00.C35459c0;
import v03.C35518e;
import v03.C35520g;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: c20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3874b implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f15855E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15856w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f15857x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f15858y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35517d f15859z;

    public /* synthetic */ C3874b(int i13, InterfaceC35517d interfaceC35517d, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3) {
        this.f15856w = i13;
        this.f15857x = interfaceC35521h;
        this.f15855E = interfaceC35521h2;
        this.f15858y = interfaceC35521h3;
        this.f15859z = interfaceC35517d;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f15856w) {
            case 0:
                return new C3873a((C3875c) this.f15857x.get(), (Map) ((C35520g) this.f15855E).get(), ((Boolean) ((C35518e) this.f15858y).f151137w).booleanValue(), (Context) ((C35518e) this.f15859z).f151137w);
            case 1:
                return new C11493i((C35358t) this.f15857x.get(), ((Boolean) ((C35518e) this.f15858y).f151137w).booleanValue(), (InterfaceC4339a) ((C35518e) this.f15859z).f151137w, (Set) ((C35518e) this.f15855E).f151137w);
            default:
                return new C29662f((C16651f) this.f15857x.get(), (C35459c0) this.f15855E.get(), (C34416d) this.f15858y.get(), (C0332w0) ((C11488d) this.f15859z).get());
        }
    }

    public C3874b(InterfaceC35521h interfaceC35521h, C35518e c35518e, C35518e c35518e2, C35518e c35518e3) {
        this.f15856w = 1;
        this.f15857x = interfaceC35521h;
        this.f15858y = c35518e;
        this.f15859z = c35518e2;
        this.f15855E = c35518e3;
    }
}
