package cz;

import a30.C0294h;
import a33.C0352d;
import android.app.Application;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1585g0;
import b20.C2326f;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bz.C3710i;
import c10.C3831n;
import c20.C3879g;
import cy.C11181b;
import dz.C12466m;
import e10.C12560n0;
import e10.C12568r0;
import e10.C12570s0;
import k20.C22136a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p023ay.C2149w;
import p098dt.AbstractC12350b;
import p236j.InterfaceC21064c;
import p442qy.C30765d;
import p537ux.C35363y;
import s10.C32064f;
import s93.AbstractC32309k;
import t10.C33283c;
import t10.C33284d;
import t10.C33285e;
import t10.C33300t;
import v00.C35459c0;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: cz.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11217o0 implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f35976E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f35977F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35521h f35978G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC35521h f35979H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC35521h f35980I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC35521h f35981J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC35521h f35982K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC35521h f35983L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35984w = 0;

    /* JADX INFO: renamed from: x */
    public final C35518e f35985x;

    /* JADX INFO: renamed from: y */
    public final C35518e f35986y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f35987z;

    public C11217o0(C35518e c35518e, InterfaceC35521h interfaceC35521h, C35518e c35518e2, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, C35518e c35518e3, C35518e c35518e4, InterfaceC35521h interfaceC35521h6, InterfaceC35521h interfaceC35521h7) {
        this.f35987z = c35518e;
        this.f35976E = interfaceC35521h;
        this.f35977F = c35518e2;
        this.f35978G = interfaceC35521h2;
        this.f35979H = interfaceC35521h3;
        this.f35980I = interfaceC35521h4;
        this.f35981J = interfaceC35521h5;
        this.f35985x = c35518e3;
        this.f35986y = c35518e4;
        this.f35982K = interfaceC35521h6;
        this.f35983L = interfaceC35521h7;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        int i13 = this.f35984w;
        InterfaceC35521h interfaceC35521h = this.f35983L;
        InterfaceC35521h interfaceC35521h2 = this.f35982K;
        C35518e c35518e = this.f35986y;
        C35518e c35518e2 = this.f35985x;
        InterfaceC35521h interfaceC35521h3 = this.f35981J;
        InterfaceC35521h interfaceC35521h4 = this.f35980I;
        InterfaceC35521h interfaceC35521h5 = this.f35979H;
        InterfaceC35521h interfaceC35521h6 = this.f35978G;
        InterfaceC35521h interfaceC35521h7 = this.f35977F;
        InterfaceC35521h interfaceC35521h8 = this.f35976E;
        InterfaceC35521h interfaceC35521h9 = this.f35987z;
        switch (i13) {
            case 0:
                Application application = (Application) c35518e2.f151137w;
                C11190b c11190b = (C11190b) c35518e.f151137w;
                EnumC11202h enumC11202h = (EnumC11202h) ((C35518e) interfaceC35521h9).f151137w;
                C30765d c30765d = (C30765d) ((C11181b) interfaceC35521h7).get();
                C0352d c0352d = (C0352d) ((C12466m) interfaceC35521h6).get();
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return new C11215n0(application, null, c11190b, enumC11202h, c30765d, c0352d, executorC22364d, (C35363y) ((C3879g) interfaceC35521h5).get(), AbstractC12350b.m34570S("CustomerSheet"), (C12560n0) ((C12570s0) interfaceC35521h4).get(), (InterfaceC11204i) ((C2149w) interfaceC35521h3).get(), (C2326f) ((C12466m) interfaceC35521h2).get(), (C1601k1) ((C35518e) interfaceC35521h8).f151137w, (C3710i) ((C0294h) interfaceC35521h).get());
            default:
                return new C33284d((C35459c0) interfaceC35521h9.get(), (C12568r0) interfaceC35521h8.get(), (C3831n) interfaceC35521h7.get(), (C32064f) interfaceC35521h6.get(), (C33285e) interfaceC35521h5.get(), (C33300t) interfaceC35521h4.get(), (C22136a) interfaceC35521h3.get(), (InterfaceC1585g0) c35518e2.f151137w, (InterfaceC21064c) c35518e.f151137w, (InterfaceC2994c0) interfaceC35521h2.get(), (C33283c) interfaceC35521h.get());
        }
    }

    public C11217o0(C35518e c35518e, C35518e c35518e2, C35518e c35518e3, C11181b c11181b, C12466m c12466m, C3879g c3879g, C12570s0 c12570s0, C2149w c2149w, C12466m c12466m2, C35518e c35518e4, C0294h c0294h) {
        this.f35985x = c35518e;
        this.f35986y = c35518e2;
        this.f35987z = c35518e3;
        this.f35977F = c11181b;
        this.f35978G = c12466m;
        this.f35979H = c3879g;
        this.f35980I = c12570s0;
        this.f35981J = c2149w;
        this.f35982K = c12466m2;
        this.f35976E = c35518e4;
        this.f35983L = c0294h;
    }
}
