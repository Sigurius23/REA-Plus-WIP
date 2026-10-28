package p023ay;

import a30.C0273a;
import a30.C0279c;
import a30.C0294h;
import a30.C0332w0;
import a33.C0352d;
import androidx.lifecycle.C1601k1;
import b20.C2326f;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c20.C3874b;
import c20.C3879g;
import c93.InterfaceC4339a;
import cz.C11233w0;
import d30.C11535h;
import dz.C12466m;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import f20.C14022a;
import h20.C16651f;
import h20.C16687l;
import h20.C16735t;
import h20.C16776z4;
import i10.C17851a;
import j20.C21241c;
import java.util.List;
import java.util.Set;
import k20.C22136a;
import k83.InterfaceC22297a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import m83.AbstractC25265s;
import n53.C26318e;
import p00.C28573j;
import p352ny.C27231c;
import p352ny.C27232d;
import p352ny.C27236h;
import p408q.C29662f;
import p479s4.AbstractC32128i;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29718h0;
import q20.C29838w;
import q83.InterfaceC30063j;
import rm2.C31604d;
import s10.C32064f;
import s93.AbstractC32309k;
import tz.C34274a;
import u00.C34377e;
import u00.C34378f;
import u10.AbstractC34428p;
import u10.C34416d;
import u10.C34426n;
import u10.C34427o;
import u10.C34429q;
import v00.C35459c0;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import w30.C36784a;
import y00.C38915o4;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: ay.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C2149w implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8553w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f8554x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f8555y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f8556z;

    public /* synthetic */ C2149w(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, int i13) {
        this.f8553w = i13;
        this.f8554x = interfaceC35521h;
        this.f8555y = interfaceC35521h2;
        this.f8556z = interfaceC35521h3;
    }

    /* JADX INFO: renamed from: a */
    public static C27232d m6698a(C27232d isStripeTerminalSdkAvailable, C27236h connectionManager, C27232d terminalWrapper, C2326f errorReporter, C27231c createCardPresentSetupIntentCallbackRetriever) {
        AbstractC22676k.m65750j(isStripeTerminalSdkAvailable, "isStripeTerminalSdkAvailable");
        AbstractC22676k.m65750j(connectionManager, "connectionManager");
        AbstractC22676k.m65750j(terminalWrapper, "terminalWrapper");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(createCardPresentSetupIntentCallbackRetriever, "createCardPresentSetupIntentCallbackRetriever");
        return new C27232d();
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        AbstractC34428p c34426n;
        String str;
        C34378f c34378fM112534R;
        int i13 = this.f8553w;
        final int i14 = 0;
        InterfaceC35521h interfaceC35521h = this.f8556z;
        InterfaceC35521h interfaceC35521h2 = this.f8555y;
        InterfaceC35521h interfaceC35521h3 = this.f8554x;
        switch (i13) {
            case 0:
                return new C2148v((InterfaceC4339a) ((C35518e) interfaceC35521h3).f151137w, (Set) ((C35518e) interfaceC35521h2).f151137w, (InterfaceC30063j) ((C35518e) interfaceC35521h).f151137w);
            case 1:
                C34274a c34274a = (C34274a) ((C0279c) interfaceC35521h3).get();
                C14022a c14022a = C14022a.f50044a;
                C34377e c34377e = new C34377e(0);
                C0352d c0352d = (C0352d) ((C12466m) interfaceC35521h2).get();
                C2326f c2326f = (C2326f) ((C12466m) interfaceC35521h).get();
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return new C11233w0(c34274a, c14022a, c34377e, c0352d, c2326f, executorC22364d);
            case 2:
                return new C17851a((String) interfaceC35521h3.get(), (C0294h) interfaceC35521h2, (C2326f) interfaceC35521h.get());
            case 3:
                return new C21241c((C39865j) interfaceC35521h3.get(), (AbstractC39851c) ((C0279c) interfaceC35521h2).get(), (InterfaceC30063j) interfaceC35521h.get());
            case 4:
                return new C17851a((String) interfaceC35521h3.get(), (C0294h) interfaceC35521h2, (C2326f) interfaceC35521h.get(), (byte) 0);
            case 5:
                return new C27231c((C2326f) interfaceC35521h3.get(), interfaceC35521h2, (C0294h) interfaceC35521h);
            case 6:
                return m6698a(new C27232d(), (C27236h) interfaceC35521h3.get(), new C27232d(), (C2326f) interfaceC35521h2.get(), (C27231c) ((C2149w) interfaceC35521h).get());
            case 7:
                C1601k1 savedStateHandle = (C1601k1) interfaceC35521h3.get();
                C32064f selectionHolder = (C32064f) interfaceC35521h2.get();
                InterfaceC13037f2 interfaceC13037f2 = (InterfaceC13037f2) ((C3879g) interfaceC35521h).get();
                AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
                AbstractC22676k.m65750j(selectionHolder, "selectionHolder");
                return new C16651f(AbstractC3269g.m9484M(interfaceC13037f2, new C31604d(28)), savedStateHandle, selectionHolder.f132973b);
            default:
                C29662f c29662f = (C29662f) ((C3874b) interfaceC35521h3).get();
                InterfaceC2994c0 viewModelScope = (InterfaceC2994c0) interfaceC35521h2.get();
                C22136a eventReporter = (C22136a) interfaceC35521h.get();
                AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
                AbstractC22676k.m65750j(eventReporter, "eventReporter");
                C35459c0 c35459c0 = (C35459c0) c29662f.f121231y;
                C0273a c0273a = (C0273a) ((C16651f) c29662f.f121230x).f64021b.f45200w.getValue();
                InterfaceC41211c interfaceC41211c = null;
                List list = c0273a != null ? c0273a.f935w : null;
                final int i15 = 1;
                if (list == null || list.size() != 1) {
                    final C0332w0 c0332w0 = (C0332w0) c29662f.f121228E;
                    C26318e c26318e = ((C16651f) c0332w0.f1169y).f64022c;
                    C35459c0 c35459c1 = (C35459c0) c0332w0.f1168x;
                    C13081r1 c13081r1 = ((C32064f) c0332w0.f1170z).f132973b;
                    C16776z4 c16776z4 = (C16776z4) c0332w0.f1164E;
                    C13045h2 c13045h2 = c16776z4.f64498q;
                    C26318e c26318e2 = c16776z4.f64496o;
                    C28573j c28573j = new C28573j(0, (C16776z4) c0332w0.f1164E, C16776z4.class, "toggleEditing", "toggleEditing()V", 0, 20);
                    Function1 function1 = new Function1() { // from class: u10.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    C16687l it = (C16687l) obj;
                                    AbstractC22676k.m65750j(it, "it");
                                    C29838w c29838w = new C29838w(it.f64178b, null, null);
                                    C0332w0 c0332w1 = c0332w0;
                                    ((C32064f) c0332w1.f1170z).m99630a(c29838w);
                                    ((C22136a) c0332w1.f1165F).m63399s(c29838w);
                                    ((C34429q) ((InterfaceC22297a) c0332w1.f1166G).get()).m108796a(new C34424l(true));
                                    break;
                                default:
                                    ((Boolean) obj).booleanValue();
                                    ((C34429q) ((InterfaceC22297a) c0332w0.f1166G).get()).m108796a(C34423k.f144661b);
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    C16776z4 c16776z5 = (C16776z4) c0332w0.f1164E;
                    c34426n = new C34426n(new C11535h(c26318e, c35459c1, c13081r1, c13045h2, c26318e2, c28573j, function1, new C29718h0(1, c16776z5, C16776z4.class, "updatePaymentMethod", "updatePaymentMethod(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;)V", 0, 28), new Function1() { // from class: u10.a
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    C16687l it = (C16687l) obj;
                                    AbstractC22676k.m65750j(it, "it");
                                    C29838w c29838w = new C29838w(it.f64178b, null, null);
                                    C0332w0 c0332w1 = c0332w0;
                                    ((C32064f) c0332w1.f1170z).m99630a(c29838w);
                                    ((C22136a) c0332w1.f1165F).m63399s(c29838w);
                                    ((C34429q) ((InterfaceC22297a) c0332w1.f1166G).get()).m108796a(new C34424l(true));
                                    break;
                                default:
                                    ((Boolean) obj).booleanValue();
                                    ((C34429q) ((InterfaceC22297a) c0332w0.f1166G).get()).m108796a(C34423k.f144661b);
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    }, c16776z5.f64494m));
                } else {
                    C38915o4 c38915o4 = (C38915o4) AbstractC25265s.m74096F0(list);
                    EnumC38828f4 enumC38828f4 = c38915o4.f167511E;
                    if (enumC38828f4 != null && (str = enumC38828f4.f167132w) != null && (c34378fM112534R = c35459c0.m112534R(str)) != null) {
                        interfaceC41211c = c34378fM112534R.f144469c;
                    }
                    c34426n = new C34427o(((C34416d) c29662f.f121232z).m108791a(C16735t.m47262c(AbstractC32128i.m100061p(interfaceC41211c), c38915o4, c35459c0.f150965H instanceof C36784a, 8)));
                }
                return new C34429q(viewModelScope, c34426n, eventReporter);
        }
    }
}
