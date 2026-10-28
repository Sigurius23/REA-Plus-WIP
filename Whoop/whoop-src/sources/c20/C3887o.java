package c20;

import a30.C0279c;
import a30.C0294h;
import android.content.Context;
import b10.C2222b;
import b20.C2327g;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import h20.C16651f;
import java.util.Set;
import k20.C22136a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p048ce.AbstractC4482w;
import p078d1.C11457j;
import p664yy.C39865j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import s10.C32064f;
import s93.AbstractC32309k;
import u00.C34377e;
import u10.C34433u;
import v00.C35459c0;
import v03.C35515b;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import v10.C35525a;
import z20.C40013g;

/* JADX INFO: renamed from: c20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C3887o implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f15914E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f15915F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35521h f15916G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC35521h f15917H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC35521h f15918I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC35521h f15919J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15920w = 1;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f15921x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f15922y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f15923z;

    public C3887o(InterfaceC35521h interfaceC35521h, C2327g c2327g, C35518e c35518e, C35518e c35518e2, C35518e c35518e3, C35518e c35518e4, C35518e c35518e5, InterfaceC35521h interfaceC35521h2, C3879g c3879g) {
        this.f15921x = interfaceC35521h;
        this.f15914E = c2327g;
        this.f15923z = c35518e;
        this.f15915F = c35518e2;
        this.f15916G = c35518e3;
        this.f15917H = c35518e4;
        this.f15918I = c35518e5;
        this.f15922y = interfaceC35521h2;
        this.f15919J = c3879g;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        int i13 = this.f15920w;
        InterfaceC35521h interfaceC35521h = this.f15915F;
        InterfaceC35521h interfaceC35521h2 = this.f15919J;
        InterfaceC35521h interfaceC35521h3 = this.f15918I;
        InterfaceC35521h interfaceC35521h4 = this.f15917H;
        InterfaceC35521h interfaceC35521h5 = this.f15916G;
        InterfaceC35521h interfaceC35521h6 = this.f15923z;
        InterfaceC35521h interfaceC35521h7 = this.f15914E;
        InterfaceC35521h interfaceC35521h8 = this.f15922y;
        InterfaceC35521h interfaceC35521h9 = this.f15921x;
        switch (i13) {
            case 0:
                return new C3886n((Function1) interfaceC35521h9.get(), (C39865j) ((C2327g) interfaceC35521h7).get(), (C2222b) ((C35518e) interfaceC35521h6).f151137w, ((Boolean) ((C35518e) interfaceC35521h).f151137w).booleanValue(), (InterfaceC30063j) ((C35518e) interfaceC35521h5).f151137w, (InterfaceC4339a) ((C35518e) interfaceC35521h4).f151137w, ((Boolean) ((C35518e) interfaceC35521h3).f151137w).booleanValue(), (C35525a) interfaceC35521h8.get(), (C11457j) ((C3879g) interfaceC35521h2).get());
            case 1:
                Context context = (Context) interfaceC35521h9.get();
                boolean zBooleanValue = ((Boolean) interfaceC35521h8.get()).booleanValue();
                InterfaceC30063j workContext = (InterfaceC30063j) interfaceC35521h7.get();
                InterfaceC30063j uiContext = (InterfaceC30063j) interfaceC35521h.get();
                C2222b paymentAnalyticsRequestFactory = (C2222b) interfaceC35521h5.get();
                InterfaceC4339a publishableKeyProvider = (InterfaceC4339a) interfaceC35521h4.get();
                Set productUsage = (Set) interfaceC35521h3.get();
                boolean zBooleanValue2 = ((Boolean) interfaceC35521h2.get()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) ((C35518e) interfaceC35521h6).f151137w).booleanValue();
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(workContext, "workContext");
                AbstractC22676k.m65750j(uiContext, "uiContext");
                AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
                AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
                AbstractC22676k.m65750j(productUsage, "productUsage");
                C3873a c3873aM13970F = AbstractC4482w.m13970F(context, paymentAnalyticsRequestFactory, zBooleanValue, workContext, uiContext, publishableKeyProvider, productUsage, zBooleanValue2, zBooleanValue3);
                AbstractC32309k.m100574c(c3873aM13970F);
                return c3873aM13970F;
            default:
                C22136a c22136a = (C22136a) interfaceC35521h9.get();
                C40013g c40013g = (C40013g) interfaceC35521h8.get();
                C32064f c32064f = (C32064f) interfaceC35521h7.get();
                C16651f c16651f = (C16651f) interfaceC35521h6.get();
                C35459c0 c35459c0 = (C35459c0) interfaceC35521h5.get();
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return new C34433u(c22136a, c40013g, c32064f, c16651f, this.f15915F, c35459c0, executorC22364d, (InterfaceC30063j) interfaceC35521h4.get(), (InterfaceC2994c0) interfaceC35521h3.get(), (C35515b) interfaceC35521h2);
        }
    }

    public C3887o(C34377e c34377e, C35518e c35518e, C35518e c35518e2, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, C0279c c0279c, C35518e c35518e3, C35518e c35518e4, C0294h c0294h, C35518e c35518e5) {
        this.f15921x = c35518e;
        this.f15922y = c35518e2;
        this.f15914E = interfaceC35521h;
        this.f15915F = interfaceC35521h2;
        this.f15916G = c0279c;
        this.f15917H = c35518e3;
        this.f15918I = c35518e4;
        this.f15919J = c0294h;
        this.f15923z = c35518e5;
    }

    public C3887o(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, InterfaceC35521h interfaceC35521h6, InterfaceC35521h interfaceC35521h7, InterfaceC35521h interfaceC35521h8, C35515b c35515b) {
        this.f15921x = interfaceC35521h;
        this.f15922y = interfaceC35521h2;
        this.f15914E = interfaceC35521h3;
        this.f15923z = interfaceC35521h4;
        this.f15915F = interfaceC35521h5;
        this.f15916G = interfaceC35521h6;
        this.f15917H = interfaceC35521h7;
        this.f15918I = interfaceC35521h8;
        this.f15919J = c35515b;
    }
}
