package d30;

import a30.C0311m1;
import a30.C0314n1;
import a30.EnumC0293g1;
import a33.C0352d;
import am2.C1042s;
import androidx.room.C1836v0;
import as1.C1949j;
import b30.C2531h0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.C2996c2;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import d11.C11473h;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import h00.C16520p;
import h00.C16522q;
import h00.C16524r;
import h20.C16735t;
import h20.InterfaceC16747v;
import hc3.AbstractC17182o;
import hc3.C17171d;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n53.C26318e;
import n83.C26460c;
import p003a1.C0106e;
import p181h2.C16617b;
import p181h2.C16618c;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.C29810c;
import q20.C29829n;
import q20.C29834s;
import q20.C29838w;
import q83.InterfaceC30057d;
import s20.C32077a;
import se.AbstractC32417h;
import u00.C34378f;
import v00.C35459c0;
import wb3.AbstractC37056f;
import y00.C38915o4;
import y00.EnumC38828f4;
import y00.EnumC38853i;

/* JADX INFO: renamed from: d30.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C11564u {

    /* JADX INFO: renamed from: a */
    public final C35459c0 f37295a;

    /* JADX INFO: renamed from: b */
    public final C11556q f37296b;

    /* JADX INFO: renamed from: c */
    public final C1836v0 f37297c;

    /* JADX INFO: renamed from: d */
    public final C11558r f37298d;

    /* JADX INFO: renamed from: e */
    public final C1042s f37299e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 f37300f;

    /* JADX INFO: renamed from: g */
    public final C2531h0 f37301g;

    /* JADX INFO: renamed from: h */
    public final C26318e f37302h;

    /* JADX INFO: renamed from: i */
    public final C0106e f37303i;

    /* JADX INFO: renamed from: j */
    public final C0106e f37304j;

    /* JADX INFO: renamed from: k */
    public final C11529f f37305k;

    /* JADX INFO: renamed from: l */
    public final C11556q f37306l;

    /* JADX INFO: renamed from: m */
    public final C2531h0 f37307m;

    /* JADX INFO: renamed from: n */
    public final C13045h2 f37308n;

    /* JADX INFO: renamed from: o */
    public final C13045h2 f37309o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f37310p;

    /* JADX INFO: renamed from: q */
    public final C26318e f37311q;

    /* JADX INFO: renamed from: r */
    public final boolean f37312r;

    /* JADX INFO: renamed from: s */
    public final C26318e f37313s;

    /* JADX INFO: renamed from: t */
    public final C26318e f37314t;

    /* JADX INFO: renamed from: u */
    public final C11530f0 f37315u;

    public C11564u(C35459c0 paymentMethodMetadata, C13081r1 processing, C13081r1 c13081r1, C13081r1 selection, C0352d c0352d, C11556q c11556q, C1836v0 c1836v0, C11558r c11558r, C1042s c1042s, C26318e paymentMethods, C13081r1 mostRecentlySelectedSavedPaymentMethod, C26318e canRemove, InterfaceC13037f2 walletsState, C26318e canUpdateFullPaymentMethodDetails, C2531h0 c2531h0, C26318e c26318e, C0106e c0106e, C0106e c0106e2, C11529f c11529f, C11556q c11556q2, C2531h0 c2531h1) {
        C22365e dispatcher = AbstractC3050q0.f12077a;
        AbstractC3069w1 mainDispatcher = AbstractC17182o.f65999a.mo8825s();
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(processing, "processing");
        AbstractC22676k.m65750j(selection, "selection");
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        AbstractC22676k.m65750j(mostRecentlySelectedSavedPaymentMethod, "mostRecentlySelectedSavedPaymentMethod");
        AbstractC22676k.m65750j(canRemove, "canRemove");
        AbstractC22676k.m65750j(walletsState, "walletsState");
        AbstractC22676k.m65750j(canUpdateFullPaymentMethodDetails, "canUpdateFullPaymentMethodDetails");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(mainDispatcher, "mainDispatcher");
        this.f37295a = paymentMethodMetadata;
        this.f37296b = c11556q;
        this.f37297c = c1836v0;
        this.f37298d = c11558r;
        this.f37299e = c1042s;
        this.f37300f = mostRecentlySelectedSavedPaymentMethod;
        this.f37301g = c2531h0;
        this.f37302h = c26318e;
        this.f37303i = c0106e;
        this.f37304j = c0106e2;
        this.f37305k = c11529f;
        this.f37306l = c11556q2;
        this.f37307m = c2531h1;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(dispatcher.plus(AbstractC3006f0.m8710d()));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(selection.f45200w.getValue());
        this.f37308n = c13045h2M36593c;
        this.f37309o = c13045h2M36593c;
        this.f37310p = paymentMethodMetadata.m112532J();
        C26318e c26318eM9509p = AbstractC3269g.m9509p(paymentMethods, mostRecentlySelectedSavedPaymentMethod, new C11538i(this, 0));
        C26318e c26318eM9510q = AbstractC3269g.m9510q(paymentMethods, c26318eM9509p, canRemove, canUpdateFullPaymentMethodDetails, new C1949j(this, 2));
        final int i13 = 0;
        C26318e c26318eM9513t = AbstractC3269g.m9513t(paymentMethods, walletsState, (C13081r1) c0352d.f1239z, new Function3(this) { // from class: d30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11564u f37217x;

            {
                this.f37217x = this;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C0311m1 c0311m1M827b;
                InterfaceC41211c interfaceC41211cM100054h;
                InterfaceC41211c interfaceC41211cM100054h2;
                int i14 = i13;
                C11564u c11564u = this.f37217x;
                switch (i14) {
                    case 0:
                        List paymentMethods2 = (List) obj;
                        C0314n1 c0314n1 = (C0314n1) obj2;
                        C29810c c29810c = (C29810c) obj3;
                        AbstractC22676k.m65750j(paymentMethods2, "paymentMethods");
                        ArrayList arrayList = c11564u.f37310p;
                        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (true) {
                            int i15 = 0;
                            if (!it.hasNext()) {
                                ArrayList arrayList3 = new ArrayList();
                                if (c0314n1 != null && (c0311m1M827b = c0314n1.m827b(EnumC0293g1.f1027x)) != null) {
                                    AbstractC32417h abstractC32417h = c0311m1M827b.f1072a;
                                    if (abstractC32417h instanceof C16524r) {
                                        interfaceC41211cM100054h = AbstractC32128i.m100055i(((C16524r) abstractC32417h).f63524a);
                                    } else {
                                        if (!(abstractC32417h instanceof C16522q) && !(abstractC32417h instanceof C16520p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        interfaceC41211cM100054h = AbstractC32128i.m100054h(R.string.stripe_link_simple_secure_payments);
                                    }
                                    InterfaceC41211c interfaceC41211c = interfaceC41211cM100054h;
                                    C33623c0 c33623c0 = EnumC38828f4.f167088G;
                                    arrayList3.add(new C11568w("link", AbstractC32128i.m100054h(R.string.stripe_link), R.drawable.stripe_ic_paymentsheet_link_arrow, interfaceC41211c, new C11548m(c11564u, i15)));
                                }
                                if (c0314n1 != null && c0314n1.m826a(EnumC0293g1.f1027x) != null) {
                                    arrayList3.add(new C11568w("google_pay", AbstractC32128i.m100054h(R.string.stripe_google_pay), R.drawable.stripe_google_pay_mark, null, new C11548m(c11564u, 1)));
                                }
                                return AbstractC25265s.m74129g1(arrayList3, arrayList2);
                            }
                            C34378f c34378f = (C34378f) it.next();
                            C29810c c29810cM91320b = c29810c != null ? c29810c.m91320b(c34378f.f144467a) : null;
                            C11546l c11546l = new C11546l(i15, c11564u, c34378f);
                            c34378f.getClass();
                            EnumC38828f4 enumC38828f4 = EnumC38828f4.f167090I;
                            List list = paymentMethods2;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                interfaceC41211cM100054h2 = c34378f.f144469c;
                            } else {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((C38915o4) it3.next()).f167511E == enumC38828f4) {
                                            if (AbstractC22676k.m65745e(c34378f.f144467a, "card")) {
                                                interfaceC41211cM100054h2 = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_new_card);
                                            }
                                        }
                                    }
                                    interfaceC41211cM100054h2 = c34378f.f144469c;
                                }
                            }
                            InterfaceC41211c interfaceC41211c2 = interfaceC41211cM100054h2;
                            arrayList2.add(new C11568w(c34378f.f144467a, c34378f.f144468b, interfaceC41211c2, c34378f.f144470d, c34378f.f144471e, c34378f.f144472f, c34378f.f144473g, c34378f.f144474h, c34378f.f144475i, c29810cM91320b != null ? c29810cM91320b.f121867x : null, c11546l, c34378f.f144476j));
                        }
                        break;
                    default:
                        List paymentMethods3 = (List) obj;
                        C0314n1 c0314n2 = (C0314n1) obj2;
                        C38915o4 c38915o4 = (C38915o4) obj3;
                        AbstractC22676k.m65750j(paymentMethods3, "paymentMethods");
                        if (c38915o4 == null) {
                            c38915o4 = (C38915o4) AbstractC25265s.m74100H0(paymentMethods3);
                        }
                        EnumC38828f4 enumC38828f5 = c38915o4 != null ? c38915o4.f167511E : null;
                        ArrayList arrayList4 = c11564u.f37310p;
                        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(((C34378f) it4.next()).f144467a);
                        }
                        C26460c c26460cM119000x = AbstractC37056f.m119000x();
                        if (enumC38828f5 != null) {
                            c26460cM119000x.add("saved");
                        }
                        if (c0314n2 != null && c0314n2.m827b(EnumC0293g1.f1027x) != null) {
                            C33623c0 c33623c1 = EnumC38828f4.f167088G;
                            c26460cM119000x.add("link");
                        }
                        if (c0314n2 != null && c0314n2.m826a(EnumC0293g1.f1027x) != null) {
                            c26460cM119000x.add("google_pay");
                        }
                        c26460cM119000x.addAll(arrayList5);
                        return AbstractC37056f.m118988k(c26460cM119000x);
                }
            }
        });
        final int i14 = 1;
        C26318e c26318eM9513t2 = AbstractC3269g.m9513t(paymentMethods, walletsState, mostRecentlySelectedSavedPaymentMethod, new Function3(this) { // from class: d30.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C11564u f37217x;

            {
                this.f37217x = this;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                C0311m1 c0311m1M827b;
                InterfaceC41211c interfaceC41211cM100054h;
                InterfaceC41211c interfaceC41211cM100054h2;
                int i15 = i14;
                C11564u c11564u = this.f37217x;
                switch (i15) {
                    case 0:
                        List paymentMethods2 = (List) obj;
                        C0314n1 c0314n1 = (C0314n1) obj2;
                        C29810c c29810c = (C29810c) obj3;
                        AbstractC22676k.m65750j(paymentMethods2, "paymentMethods");
                        ArrayList arrayList = c11564u.f37310p;
                        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (true) {
                            int i16 = 0;
                            if (!it.hasNext()) {
                                ArrayList arrayList3 = new ArrayList();
                                if (c0314n1 != null && (c0311m1M827b = c0314n1.m827b(EnumC0293g1.f1027x)) != null) {
                                    AbstractC32417h abstractC32417h = c0311m1M827b.f1072a;
                                    if (abstractC32417h instanceof C16524r) {
                                        interfaceC41211cM100054h = AbstractC32128i.m100055i(((C16524r) abstractC32417h).f63524a);
                                    } else {
                                        if (!(abstractC32417h instanceof C16522q) && !(abstractC32417h instanceof C16520p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        interfaceC41211cM100054h = AbstractC32128i.m100054h(R.string.stripe_link_simple_secure_payments);
                                    }
                                    InterfaceC41211c interfaceC41211c = interfaceC41211cM100054h;
                                    C33623c0 c33623c0 = EnumC38828f4.f167088G;
                                    arrayList3.add(new C11568w("link", AbstractC32128i.m100054h(R.string.stripe_link), R.drawable.stripe_ic_paymentsheet_link_arrow, interfaceC41211c, new C11548m(c11564u, i16)));
                                }
                                if (c0314n1 != null && c0314n1.m826a(EnumC0293g1.f1027x) != null) {
                                    arrayList3.add(new C11568w("google_pay", AbstractC32128i.m100054h(R.string.stripe_google_pay), R.drawable.stripe_google_pay_mark, null, new C11548m(c11564u, 1)));
                                }
                                return AbstractC25265s.m74129g1(arrayList3, arrayList2);
                            }
                            C34378f c34378f = (C34378f) it.next();
                            C29810c c29810cM91320b = c29810c != null ? c29810c.m91320b(c34378f.f144467a) : null;
                            C11546l c11546l = new C11546l(i16, c11564u, c34378f);
                            c34378f.getClass();
                            EnumC38828f4 enumC38828f4 = EnumC38828f4.f167090I;
                            List list = paymentMethods2;
                            if ((list instanceof Collection) && list.isEmpty()) {
                                interfaceC41211cM100054h2 = c34378f.f144469c;
                            } else {
                                Iterator it3 = list.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (((C38915o4) it3.next()).f167511E == enumC38828f4) {
                                            if (AbstractC22676k.m65745e(c34378f.f144467a, "card")) {
                                                interfaceC41211cM100054h2 = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_new_card);
                                            }
                                        }
                                    }
                                    interfaceC41211cM100054h2 = c34378f.f144469c;
                                }
                            }
                            InterfaceC41211c interfaceC41211c2 = interfaceC41211cM100054h2;
                            arrayList2.add(new C11568w(c34378f.f144467a, c34378f.f144468b, interfaceC41211c2, c34378f.f144470d, c34378f.f144471e, c34378f.f144472f, c34378f.f144473g, c34378f.f144474h, c34378f.f144475i, c29810cM91320b != null ? c29810cM91320b.f121867x : null, c11546l, c34378f.f144476j));
                        }
                        break;
                    default:
                        List paymentMethods3 = (List) obj;
                        C0314n1 c0314n2 = (C0314n1) obj2;
                        C38915o4 c38915o4 = (C38915o4) obj3;
                        AbstractC22676k.m65750j(paymentMethods3, "paymentMethods");
                        if (c38915o4 == null) {
                            c38915o4 = (C38915o4) AbstractC25265s.m74100H0(paymentMethods3);
                        }
                        EnumC38828f4 enumC38828f5 = c38915o4 != null ? c38915o4.f167511E : null;
                        ArrayList arrayList4 = c11564u.f37310p;
                        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(((C34378f) it4.next()).f144467a);
                        }
                        C26460c c26460cM119000x = AbstractC37056f.m119000x();
                        if (enumC38828f5 != null) {
                            c26460cM119000x.add("saved");
                        }
                        if (c0314n2 != null && c0314n2.m827b(EnumC0293g1.f1027x) != null) {
                            C33623c0 c33623c1 = EnumC38828f4.f167088G;
                            c26460cM119000x.add("link");
                        }
                        if (c0314n2 != null && c0314n2.m826a(EnumC0293g1.f1027x) != null) {
                            c26460cM119000x.add("google_pay");
                        }
                        c26460cM119000x.addAll(arrayList5);
                        return AbstractC37056f.m118988k(c26460cM119000x);
                }
            }
        });
        this.f37311q = c26318eM9513t2;
        this.f37312r = paymentMethodMetadata.f150996w.mo124338q0();
        this.f37313s = AbstractC3269g.m9512s(c26318eM9513t, processing, c13045h2M36593c, c26318eM9509p, c26318eM9510q, c13081r1, new C11544k(this, 0));
        this.f37314t = AbstractC3269g.m9484M(walletsState, new C11473h(1));
        int i15 = 0;
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(c17171dM8708b, mainDispatcher, null, new C11552o(selection, this, interfaceC30057d, i15), 2);
        AbstractC3006f0.m8732z(c17171dM8708b, mainDispatcher, null, new C11554p(this, interfaceC30057d, i15), 2);
        int i16 = 1;
        AbstractC3006f0.m8732z(c17171dM8708b, mainDispatcher, null, new C11554p(this, interfaceC30057d, i16), 2);
        this.f37315u = new C11530f0((List) ((InterfaceC4339a) c26318eM9513t2.f104635y).invoke(), new C11538i(this, i16), dispatcher);
    }

    /* JADX INFO: renamed from: a */
    public static String m30996a(AbstractC29835t abstractC29835t) {
        if (!(abstractC29835t instanceof C29829n)) {
            if (abstractC29835t instanceof C29834s) {
                return ((C29834s) abstractC29835t).f121948x;
            }
            return null;
        }
        C29829n c29829n = (C29829n) abstractC29835t;
        EnumC38853i enumC38853i = c29829n.f121923y;
        String str = enumC38853i.f167261x;
        if (enumC38853i == EnumC38853i.Unknown) {
            str = null;
        }
        String strConcat = str != null ? str.concat(" ") : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return AbstractC18489d0.m53370k(strConcat, "···· ", c29829n.f121921H);
    }

    /* JADX INFO: renamed from: b */
    public final void m30997b(InterfaceC11575z0 interfaceC11575z0) {
        boolean z4;
        int iM36284n;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = interfaceC11575z0 instanceof C11567v0;
        C0106e c0106e = this.f37303i;
        if (z16) {
            String paymentMethodCode = ((C11567v0) interfaceC11575z0).f37329a;
            c0106e.invoke(paymentMethodCode);
            if (((InterfaceC16747v) this.f37296b.invoke(paymentMethodCode)).equals(C16735t.f64290b)) {
                this.f37304j.invoke(paymentMethodCode);
                this.f37299e.invoke(paymentMethodCode);
                return;
            }
            AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
            C35459c0 metadata = this.f37295a;
            AbstractC22676k.m65750j(metadata, "metadata");
            this.f37297c.invoke(new C32077a(paymentMethodCode, metadata.f150965H, metadata.f150966I, metadata.m112537b(), metadata.f150968K, metadata.f150969L, metadata.f150976S, metadata.m112543x(paymentMethodCode), metadata.f150997x).m99782a(), paymentMethodCode);
            return;
        }
        if (interfaceC11575z0 instanceof C11569w0) {
            c0106e.invoke("saved");
            this.f37301g.invoke(new C29838w(((C11569w0) interfaceC11575z0).f37342a, null, null), Boolean.TRUE);
            return;
        }
        if (interfaceC11575z0 instanceof C11571x0) {
            this.f37298d.invoke();
            return;
        }
        if (interfaceC11575z0 instanceof C11565u0) {
            this.f37305k.invoke(((C11565u0) interfaceC11575z0).f37316a);
            return;
        }
        boolean z17 = interfaceC11575z0 instanceof C11573y0;
        C11530f0 c11530f0 = this.f37315u;
        if (!z17) {
            if (!(interfaceC11575z0 instanceof C11563t0)) {
                throw new NoWhenBranchMatchedException();
            }
            c11530f0.m30986i();
            return;
        }
        C11573y0 c11573y0 = (C11573y0) interfaceC11575z0;
        String itemCode = c11573y0.f37350a;
        InterfaceC39147y coordinates = c11573y0.f37351b;
        if (c11530f0.f37148a) {
            return;
        }
        List items = (List) ((InterfaceC4339a) this.f37311q.f104635y).invoke();
        AbstractC22676k.m65750j(items, "items");
        if (!AbstractC22676k.m65745e((List) c11530f0.f37150c, items)) {
            c11530f0.f37150c = items;
            c11530f0.m30986i();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c11530f0.f37153f;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c11530f0.f37154g;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c11530f0.f37152e;
        AbstractC22676k.m65750j(itemCode, "itemCode");
        AbstractC22676k.m65750j(coordinates, "coordinates");
        if (!((List) c11530f0.f37150c).contains(itemCode) || ((List) c11530f0.f37150c).isEmpty() || c11530f0.f37148a || !coordinates.mo3532g()) {
            return;
        }
        long jMo3510E = coordinates.mo3510E(0L);
        long jMo3541n = coordinates.mo3541n();
        C16618c c16618cM124660f = AbstractC39125q1.m124660f(coordinates);
        C11527e0 c11527e0 = new C11527e0(jMo3510E, jMo3541n, c16618cM124660f);
        float f13 = c16618cM124660f.f63939a;
        float f14 = c16618cM124660f.f63942d;
        float f15 = c16618cM124660f.f63941c;
        float f16 = c16618cM124660f.f63940b;
        if (f13 == 0.0f && f16 == 0.0f && f15 == 0.0f && f14 == 0.0f) {
            z13 = false;
        } else {
            int i13 = ((int) (jMo3541n >> 32)) * ((int) (jMo3541n & 4294967295L));
            float f17 = (f15 - f13) * (f14 - f16);
            if (i13 > 0) {
                z4 = false;
                iM36284n = AbstractC12889b.m36284n((int) ((f17 / i13) * 100), 0, 100);
            } else {
                z4 = false;
                iM36284n = 0;
            }
            z13 = iM36284n >= 95 ? true : z4;
        }
        C11527e0 c11527e1 = (C11527e0) linkedHashMap.get(itemCode);
        if (c11527e1 != null) {
            z14 = C16617b.m47187c(c11527e1.f37138a, jMo3510E) && C39180l.m124799a(c11527e1.f37139b, jMo3541n) && c11527e1.f37140c.equals(c16618cM124660f);
            linkedHashMap = linkedHashMap;
        } else {
            z14 = false;
        }
        linkedHashMap.put(itemCode, c11527e0);
        boolean zM65745e = AbstractC22676k.m65745e(linkedHashMap3.get(itemCode), Boolean.valueOf(z13));
        linkedHashMap3.put(itemCode, Boolean.valueOf(z13));
        if (z14 && zM65745e) {
            linkedHashMap2.put(itemCode, Boolean.TRUE);
        } else {
            linkedHashMap2.remove(itemCode);
            C2996c2 c2996c2 = (C2996c2) c11530f0.f37149b;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
        }
        Collection collectionValues = linkedHashMap3.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Boolean) it.next()).booleanValue()) {
                        z15 = true;
                        break;
                    }
                } else {
                    z15 = false;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        if (((List) c11530f0.f37150c).size() == linkedHashMap2.size() && ((List) c11530f0.f37150c).size() == linkedHashMap3.size()) {
            List<String> list = (List) c11530f0.f37150c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    if (!AbstractC22676k.m65745e(linkedHashMap2.get(str), Boolean.TRUE) || !linkedHashMap3.containsKey(str)) {
                        return;
                    }
                }
            }
            if (!z15 || c11530f0.f37148a) {
                return;
            }
            C2996c2 c2996c3 = (C2996c2) c11530f0.f37149b;
            InterfaceC30057d interfaceC30057d = null;
            if (c2996c3 != null) {
                c2996c3.cancel((CancellationException) null);
            }
            c11530f0.f37149b = AbstractC3006f0.m8732z((C17171d) c11530f0.f37155h, null, null, new C11552o(c11530f0, interfaceC30057d, 3), 3);
        }
    }
}
