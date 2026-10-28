package b30;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import h20.C16621a;
import h20.C16687l;
import h20.C16698m4;
import h20.C16704n4;
import h20.C16710o4;
import h20.C16716p4;
import h20.C16722q4;
import h20.EnumC16677j1;
import h20.InterfaceC16728r4;
import hc3.AbstractC17182o;
import hc3.C17171d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kc3.C22365e;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import m83.AbstractC25267u;
import n53.C26318e;
import ou1.C28376a;
import p000.C12473e;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p537ux.InterfaceC35320a;
import p547v8.AbstractC35785b;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38915o4;
import y00.C38931q2;
import y00.C38940r2;
import y00.C38995x3;
import y00.C39013z3;
import y00.EnumC38853i;
import y00.InterfaceC38949s2;

/* JADX INFO: renamed from: b30.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2659y0 implements InterfaceC2545i6 {

    /* JADX INFO: renamed from: F */
    public static final C41210b f10383F = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_set_default_payment_method_failed_error_message);

    /* JADX INFO: renamed from: G */
    public static final C41210b f10384G = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_set_default_payment_method_failed_error_message);

    /* JADX INFO: renamed from: H */
    public static final C41210b f10385H = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_card_updates_failed_error_message);

    /* JADX INFO: renamed from: A */
    public final boolean f10386A;

    /* JADX INFO: renamed from: B */
    public final boolean f10387B;

    /* JADX INFO: renamed from: C */
    public final C26318e f10388C;

    /* JADX INFO: renamed from: D */
    public final C23470p f10389D;

    /* JADX INFO: renamed from: E */
    public final C26318e f10390E;

    /* JADX INFO: renamed from: b */
    public final boolean f10391b;

    /* JADX INFO: renamed from: c */
    public final C16687l f10392c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC35320a f10393d;

    /* JADX INFO: renamed from: e */
    public final EnumC16677j1 f10394e;

    /* JADX INFO: renamed from: f */
    public final Set f10395f;

    /* JADX INFO: renamed from: g */
    public final boolean f10396g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41211c f10397h;

    /* JADX INFO: renamed from: i */
    public final boolean f10398i;

    /* JADX INFO: renamed from: j */
    public final boolean f10399j;

    /* JADX INFO: renamed from: k */
    public final Object f10400k;

    /* JADX INFO: renamed from: l */
    public final Object f10401l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC4351m f10402m;

    /* JADX INFO: renamed from: n */
    public final Function1 f10403n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4339a f10404o;

    /* JADX INFO: renamed from: p */
    public final C2519f4 f10405p;

    /* JADX INFO: renamed from: q */
    public final C17171d f10406q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f10407r;

    /* JADX INFO: renamed from: s */
    public final C13045h2 f10408s;

    /* JADX INFO: renamed from: t */
    public final boolean f10409t;

    /* JADX INFO: renamed from: u */
    public final C13045h2 f10410u;

    /* JADX INFO: renamed from: v */
    public final C13045h2 f10411v;

    /* JADX INFO: renamed from: w */
    public final boolean f10412w;

    /* JADX INFO: renamed from: x */
    public final boolean f10413x;

    /* JADX INFO: renamed from: y */
    public final C41210b f10414y;

    /* JADX INFO: renamed from: z */
    public final C2550j3 f10415z;

    /* JADX WARN: Code duplicated, block: B:36:0x0112  */
    public C2659y0(boolean z4, boolean z13, C16687l displayableSavedPaymentMethod, InterfaceC35320a cardBrandFilter, EnumC16677j1 addressCollectionMode, Set allowedBillingCountries, boolean z14, C41210b c41210b, boolean z15, boolean z16, InterfaceC4351m interfaceC4351m, Function3 function3, InterfaceC4351m setDefaultPaymentMethodExecutor, Function1 function1, InterfaceC4339a interfaceC4339a) {
        ArrayList arrayList;
        boolean z17;
        C38995x3 c38995x3;
        C2519f4 c2519f4 = new C2519f4();
        AbstractC22676k.m65750j(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(addressCollectionMode, "addressCollectionMode");
        AbstractC22676k.m65750j(allowedBillingCountries, "allowedBillingCountries");
        AbstractC22676k.m65750j(setDefaultPaymentMethodExecutor, "setDefaultPaymentMethodExecutor");
        this.f10391b = z13;
        this.f10392c = displayableSavedPaymentMethod;
        this.f10393d = cardBrandFilter;
        this.f10394e = addressCollectionMode;
        this.f10395f = allowedBillingCountries;
        this.f10396g = z14;
        this.f10397h = c41210b;
        this.f10398i = z15;
        this.f10399j = z16;
        this.f10400k = interfaceC4351m;
        this.f10401l = function3;
        this.f10402m = setDefaultPaymentMethodExecutor;
        this.f10403n = function1;
        this.f10404o = interfaceC4339a;
        this.f10405p = c2519f4;
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f10406q = AbstractC3006f0.m8708b(AbstractC17182o.f65999a.plus(AbstractC3006f0.m8710d()));
        this.f10407r = AbstractC13091v.m36593c(m7525b());
        this.f10408s = AbstractC13091v.m36593c(EnumC2505d6.Idle);
        this.f10409t = z15;
        this.f10410u = AbstractC13091v.m36593c(Boolean.valueOf(z15));
        this.f10411v = AbstractC13091v.m36593c(null);
        C39013z3 c39013z3 = displayableSavedPaymentMethod.f64178b.f167514H;
        if (c39013z3 == null || (c38995x3 = c39013z3.f167916K) == null) {
            arrayList = null;
        } else {
            Set<String> set = c38995x3.f167842w;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(set, 10));
            for (String str : set) {
                EnumC38853i.f167238M.getClass();
                arrayList2.add(C33623c0.m106236i(str));
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (this.f10393d.mo112179o((EnumC38853i) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        int i13 = 0;
        boolean z18 = true;
        this.f10412w = (arrayList != null ? arrayList.size() : 0) > 1;
        InterfaceC16728r4 interfaceC16728r4 = this.f10392c.f64179c;
        C16698m4 c16698m4 = interfaceC16728r4 instanceof C16698m4 ? (C16698m4) interfaceC16728r4 : null;
        if (c16698m4 != null) {
            C39013z3 c39013z4 = c16698m4.f64222a;
            Integer num = c39013z4.f167921z;
            Integer num2 = c39013z4.f167910E;
            if (num == null || num2 == null || AbstractC35785b.m113386I(num.intValue(), num2.intValue())) {
                z17 = false;
            } else {
                z17 = true;
            }
        } else {
            z17 = false;
        }
        this.f10413x = z17;
        C16687l displayableSavedPaymentMethod2 = this.f10392c;
        InterfaceC2545i6.f9880a.getClass();
        Integer numValueOf = Integer.valueOf(R.string.stripe_paymentsheet_manage_card);
        AbstractC22676k.m65750j(displayableSavedPaymentMethod2, "displayableSavedPaymentMethod");
        InterfaceC16728r4 interfaceC16728r5 = displayableSavedPaymentMethod2.f64179c;
        if (interfaceC16728r5 instanceof C16710o4) {
            numValueOf = Integer.valueOf(R.string.stripe_paymentsheet_manage_sepa_debit);
        } else if (interfaceC16728r5 instanceof C16716p4) {
            numValueOf = Integer.valueOf(R.string.stripe_paymentsheet_manage_bank_account);
        } else if (!(interfaceC16728r5 instanceof C16698m4)) {
            if (interfaceC16728r5 instanceof C16704n4) {
                InterfaceC38949s2 interfaceC38949s2 = displayableSavedPaymentMethod2.f64178b.f167524R;
                if (interfaceC38949s2 instanceof C38931q2) {
                    numValueOf = Integer.valueOf(R.string.stripe_paymentsheet_manage_international_bank_account);
                } else if (!(interfaceC38949s2 instanceof C38940r2)) {
                    if (interfaceC38949s2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else if (!interfaceC16728r5.equals(C16722q4.f64264a)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        this.f10414y = numValueOf != null ? AbstractC32128i.m100054h(numValueOf.intValue()) : null;
        this.f10415z = new C2550j3(!z4, false, false, new C28376a(7));
        this.f10386A = !this.f10398i;
        if (!this.f10392c.m47246d(this.f10396g) && (!this.f10399j || this.f10398i)) {
            z18 = false;
        }
        this.f10387B = z18;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(this.f10410u, new C2610r0(this, i13));
        this.f10388C = c26318eM9484M;
        this.f10389D = AbstractC30060g.m92088H(new C2617s0(this, i13));
        this.f10390E = AbstractC3269g.m9511r(this.f10407r, this.f10408s, this.f10410u, c26318eM9484M, this.f10411v, new C2624t0(this, i13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.jvm.functions.Function3] */
    /* JADX INFO: renamed from: a */
    public static final Serializable m7524a(C2659y0 c2659y0, AbstractC32269c abstractC32269c) {
        C2652x0 c2652x0;
        if (abstractC32269c instanceof C2652x0) {
            c2652x0 = (C2652x0) abstractC32269c;
            int i13 = c2652x0.f10363z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2652x0.f10363z = i13 - Integer.MIN_VALUE;
            } else {
                c2652x0 = new C2652x0(c2659y0, abstractC32269c);
            }
        } else {
            c2652x0 = new C2652x0(c2659y0, abstractC32269c);
        }
        Object objInvoke = c2652x0.f10361x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2652x0.f10363z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            C16621a c16621a = (C16621a) c2659y0.f10411v.getValue();
            if (c16621a == null) {
                return null;
            }
            ?? r10 = c2659y0.f10401l;
            C38915o4 c38915o4 = c2659y0.f10392c.f64178b;
            c2652x0.f10360w = c2659y0;
            c2652x0.f10363z = 1;
            objInvoke = r10.invoke(c38915o4, c16621a, c2652x0);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2659y0 = c2652x0.f10360w;
            AbstractC34132o.m107864I(objInvoke);
        }
        Object obj = ((C23468n) objInvoke).f92940w;
        if (!(obj instanceof C23467m)) {
            c2659y0.f10411v.m36570j(null);
        }
        return new C23468n(obj);
    }

    /* JADX INFO: renamed from: b */
    public final C41210b m7525b() {
        C16687l c16687l = this.f10392c;
        InterfaceC16728r4 interfaceC16728r4 = c16687l.f64179c;
        C16698m4 c16698m4 = interfaceC16728r4 instanceof C16698m4 ? (C16698m4) interfaceC16728r4 : null;
        if (c16698m4 != null) {
            C39013z3 c39013z3 = c16698m4.f64222a;
            Integer num = c39013z3.f167921z;
            Integer num2 = c39013z3.f167910E;
            if (num != null && num2 != null && !AbstractC35785b.m113386I(num.intValue(), num2.intValue()) && !c16687l.m47246d(this.f10396g)) {
                InterfaceC2545i6.f9880a.getClass();
                return C2489b6.f9704b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m7526c(AbstractC34235f abstractC34235f) {
        C13045h2 c13045h2;
        Object value;
        boolean zEquals = abstractC34235f.equals(C2521f6.f9811a);
        InterfaceC30057d interfaceC30057d = null;
        C17171d c17171d = this.f10406q;
        if (zEquals) {
            AbstractC3006f0.m8732z(c17171d, null, null, new C12473e(this, interfaceC30057d, 16), 3);
            return;
        }
        if (abstractC34235f.equals(C2529g6.f9832a)) {
            AbstractC3006f0.m8732z(c17171d, null, null, new C12473e(this, interfaceC30057d, 17), 3);
            return;
        }
        if (abstractC34235f.equals(C2513e6.f9782a)) {
            ((C2571m0) this.f10389D.getValue()).m7501b(C2524g1.f9817a);
            return;
        }
        if (!(abstractC34235f instanceof C2537h6)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z4 = ((C2537h6) abstractC34235f).f9852a;
        do {
            c13045h2 = this.f10410u;
            value = c13045h2.getValue();
            ((Boolean) value).getClass();
        } while (!c13045h2.m36569i(value, Boolean.valueOf(z4)));
    }
}
