package e10;

import a00.C0072g;
import a10.AbstractC0122j;
import a10.EnumC0120h;
import android.content.SharedPreferences;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1585g0;
import b20.C2326f;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import com.stripe.android.core.exception.StripeException;
import com.whoop.android.R;
import com.whoop.profile.view.edit.C9790n;
import d13.AbstractC11478a;
import d30.C11552o;
import d33.C11636x;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import h20.C16663h;
import java.util.ArrayList;
import java.util.Iterator;
import l10.C23218c;
import l83.C23454a0;
import l83.C23470p;
import o10.C27388a;
import p003a1.C0106e;
import p003a1.C0109h;
import p088dc.AbstractC11895b;
import p236j.InterfaceC21064c;
import p442qy.C30765d;
import p479s4.AbstractC32123d;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29817f0;
import q20.C29819g0;
import q20.C29823i0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import v00.C35459c0;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38915o4;
import y00.C39013z3;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: e10.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12568r0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f42913a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2994c0 f42914b;

    /* JADX INFO: renamed from: c */
    public final C1601k1 f42915c;

    /* JADX INFO: renamed from: d */
    public final C2326f f42916d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC30063j f42917e;

    /* JADX INFO: renamed from: f */
    public final C30765d f42918f;

    /* JADX INFO: renamed from: g */
    public final C12554k0 f42919g;

    /* JADX INFO: renamed from: h */
    public final C12558m0 f42920h;

    /* JADX INFO: renamed from: i */
    public final boolean f42921i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f42922j;

    /* JADX INFO: renamed from: k */
    public final C13081r1 f42923k;

    public C12568r0(ArrayList arrayList, InterfaceC2994c0 interfaceC2994c0, C1601k1 savedStateHandle, C2326f errorReporter, InterfaceC30063j ioContext, C30765d logger, C12554k0 confirmationSaver) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(ioContext, "ioContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(confirmationSaver, "confirmationSaver");
        this.f42913a = arrayList;
        this.f42914b = interfaceC2994c0;
        this.f42915c = savedStateHandle;
        this.f42916d = errorReporter;
        this.f42917e = ioContext;
        this.f42918f = logger;
        this.f42919g = confirmationSaver;
        C12558m0 c12558m0 = (C12558m0) savedStateHandle.m5001b("AwaitingConfirmationResult");
        this.f42920h = c12558m0;
        boolean z4 = c12558m0 != null;
        this.f42921i = z4;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c12558m0 != null ? new C12580z(c12558m0.f42889x) : C12534a0.f42838a);
        this.f42922j = c13045h2M36593c;
        this.f42923k = AbstractC13091v.m36598h(c13045h2M36593c);
        if (z4) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C12556l0(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m35245a(C12568r0 c12568r0, C12553k c12553k, AbstractC32275i abstractC32275i) throws Throwable {
        Object next;
        InterfaceC12551j interfaceC12551j;
        InterfaceC12555l interfaceC12555lMo35207b;
        c12568r0.getClass();
        InterfaceC12555l interfaceC12555l = c12553k.f42877w;
        C13045h2 c13045h2 = c12568r0.f42922j;
        C12580z c12580z = new C12580z(interfaceC12555l);
        c13045h2.getClass();
        c13045h2.m36571k(null, c12580z);
        Iterator it = c12568r0.f42913a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C12550i0 c12550i0 = (C12550i0) next;
            c12550i0.getClass();
            interfaceC12551j = c12550i0.f42872b;
            interfaceC12555lMo35207b = interfaceC12551j.mo35207b(interfaceC12555l);
        } while (!(interfaceC12555lMo35207b != null ? interfaceC12551j.mo35208c(interfaceC12555lMo35207b, c12553k) : false));
        C12550i0 c12550i1 = (C12550i0) next;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c12550i1 != null) {
            Object objM35248d = c12568r0.m35248d(interfaceC12555l, c12553k, c12550i1, abstractC32275i);
            return objM35248d == EnumC31071a.f128113w ? objM35248d : c23454a0;
        }
        C2326f c2326f = c12568r0.f42916d;
        EnumC2325e enumC2325e = EnumC2325e.INTENT_CONFIRMATION_HANDLER_INVALID_PAYMENT_CONFIRMATION_OPTION;
        int i13 = StripeException.f22154E;
        AbstractC35903f.m113990H(c2326f, enumC2325e, AbstractC32123d.m100024d(new IllegalStateException("Attempting to confirm intent for invalid confirmation option: " + interfaceC12555l)), null, 4);
        c12568r0.m35249e(new C12575v(new IllegalStateException(AbstractC11895b.m31996o("Attempted to confirm invalid ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC12555l.getClass()).getQualifiedName(), " confirmation type")), AbstractC32128i.m100054h(R.string.stripe_something_went_wrong), C12567r.f42912a));
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m35246b(AbstractC32269c abstractC32269c) {
        C12562o0 c12562o0;
        if (abstractC32269c instanceof C12562o0) {
            c12562o0 = (C12562o0) abstractC32269c;
            int i13 = c12562o0.f42901y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12562o0.f42901y = i13 - Integer.MIN_VALUE;
            } else {
                c12562o0 = new C12562o0(this, abstractC32269c);
            }
        } else {
            c12562o0 = new C12562o0(this, abstractC32269c);
        }
        Object objM36616z = c12562o0.f42899w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12562o0.f42901y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36616z);
            C13045h2 c13045h2 = this.f42922j;
            InterfaceC12536b0 interfaceC12536b0 = (InterfaceC12536b0) c13045h2.getValue();
            InterfaceC30057d interfaceC30057d = null;
            if (interfaceC12536b0 instanceof C12534a0) {
                return null;
            }
            if (interfaceC12536b0 instanceof C12579y) {
                return ((C12579y) interfaceC12536b0).f42950a;
            }
            if (!(interfaceC12536b0 instanceof C12580z)) {
                throw new NoWhenBranchMatchedException();
            }
            C11636x c11636x = new C11636x(2, 1, interfaceC30057d);
            c12562o0.f42901y = 1;
            objM36616z = AbstractC13091v.m36616z(c13045h2, c11636x, c12562o0);
            if (objM36616z == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36616z);
        }
        if (objM36616z != null) {
            return ((C12579y) objM36616z).f42950a;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.stripe.android.paymentelement.confirmation.ConfirmationHandler.State.Complete");
    }

    /* JADX INFO: renamed from: c */
    public final void m35247c(C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        for (C12550i0 c12550i0 : this.f42913a) {
            c12550i0.getClass();
            c12550i0.f42872b.mo35209d(paymentMethodMetadata);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m35248d(InterfaceC12555l interfaceC12555l, C12553k c12553k, C12550i0 c12550i0, AbstractC32269c abstractC32269c) throws Throwable {
        C12564p0 c12564p0;
        C12568r0 c12568r0;
        C12550i0 c12550i1;
        InterfaceC12555l interfaceC12555l2;
        if (abstractC32269c instanceof C12564p0) {
            c12564p0 = (C12564p0) abstractC32269c;
            int i13 = c12564p0.f42904F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12564p0.f42904F = i13 - Integer.MIN_VALUE;
            } else {
                c12564p0 = new C12564p0(this, abstractC32269c);
            }
        } else {
            c12564p0 = new C12564p0(this, abstractC32269c);
        }
        Object objM8705K = c12564p0.f42908z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12564p0.f42904F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C0109h c0109h = new C0109h(c12550i0, interfaceC12555l, c12553k, null, 17);
            c12564p0.f42905w = this;
            c12564p0.f42906x = interfaceC12555l;
            c12564p0.f42907y = c12550i0;
            c12564p0.f42904F = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f42917e, c0109h, c12564p0);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
            c12568r0 = this;
            c12550i1 = c12550i0;
            interfaceC12555l2 = interfaceC12555l;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12550i1 = c12564p0.f42907y;
            interfaceC12555l2 = c12564p0.f42906x;
            c12568r0 = c12564p0.f42905w;
            AbstractC34132o.m107864I(objM8705K);
        }
        InterfaceC12544f0 interfaceC12544f0 = (InterfaceC12544f0) objM8705K;
        if (interfaceC12544f0 instanceof C12542e0) {
            C12542e0 c12542e0 = (C12542e0) interfaceC12544f0;
            c12568r0.f42915c.m5004e(new C12558m0(c12550i1.f42875e, interfaceC12555l2, c12542e0.f42853b), "AwaitingConfirmationResult");
            c12542e0.f42852a.invoke();
        } else if (interfaceC12544f0 instanceof C12540d0) {
            C12540d0 c12540d0 = (C12540d0) interfaceC12544f0;
            c12568r0.m35249e(new C12575v(c12540d0.f42848a, c12540d0.f42849b, c12540d0.f42850c));
        } else {
            if (!(interfaceC12544f0 instanceof C12538c0)) {
                throw new NoWhenBranchMatchedException();
            }
            C12538c0 c12538c0 = (C12538c0) interfaceC12544f0;
            c12568r0.m35249e(new C12577w(c12538c0.f42845a, c12538c0.f42846b, c12538c0.f42847c));
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX INFO: renamed from: e */
    public final void m35249e(InterfaceC12578x interfaceC12578x) {
        C12553k c12553k;
        Object c29823i0;
        AbstractC0122j abstractC0122j;
        String strM30857i;
        String strM31996o;
        interfaceC12578x.mo35243a(this.f42918f);
        C12579y c12579y = new C12579y(interfaceC12578x);
        C13045h2 c13045h2 = this.f42922j;
        c13045h2.getClass();
        c13045h2.m36571k(null, c12579y);
        boolean z4 = interfaceC12578x instanceof C12577w;
        C1601k1 c1601k1 = this.f42915c;
        if (z4 && (c12553k = (C12553k) c1601k1.m5001b("INITIAL_CONFIRMATION_ARGUMENTS_KEY")) != null) {
            InterfaceC38802c8 stripeIntent = ((C12577w) interfaceC12578x).f42947a;
            InterfaceC12555l confirmationOption = c12553k.f42877w;
            boolean z13 = c12553k.f42878x.f150984a0;
            C12554k0 c12554k0 = this.f42919g;
            c12554k0.getClass();
            AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
            AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
            boolean z14 = confirmationOption instanceof C12572t0;
            boolean zM124359b = true;
            C29817f0 c29817f0 = C29817f0.f121885w;
            C29819g0 c29819g0 = C29819g0.f121891w;
            if (z14) {
                C12572t0 c12572t0 = (C12572t0) confirmationOption;
                C38915o4 c38915o4Mo124330Y = stripeIntent.mo124330Y();
                if (stripeIntent instanceof C38887l3) {
                    zM124359b = ((C38887l3) stripeIntent).m124359b(c12572t0.f42935w.f167026w);
                } else if (!(stripeIntent instanceof C38840g6)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!z13 && !c12572t0.f42938z && !zM124359b) {
                    c38915o4Mo124330Y = null;
                }
                if (c38915o4Mo124330Y != null) {
                    c29823i0 = new C29823i0(c38915o4Mo124330Y.f167527w, false);
                } else {
                    c29823i0 = null;
                }
            } else if (confirmationOption instanceof C12574u0) {
                C38915o4 c38915o4 = ((C12574u0) confirmationOption).f42940w;
                C39013z3 c39013z3 = c38915o4.f167514H;
                EnumC0120h enumC0120h = (c39013z3 == null || (abstractC0122j = c39013z3.f167915J) == null) ? null : abstractC0122j.f379w;
                int i13 = enumC0120h == null ? -1 : AbstractC12552j0.f42876a[enumC0120h.ordinal()];
                if (i13 == 1) {
                    c29823i0 = c29817f0;
                } else if (i13 != 2) {
                    c29823i0 = new C29823i0(c38915o4.f167527w, false);
                } else {
                    c29823i0 = c29819g0;
                }
            } else if (confirmationOption instanceof C23218c) {
                c29823i0 = c29817f0;
            } else if (confirmationOption instanceof C27388a) {
                c29823i0 = c29819g0;
            } else {
                c29823i0 = null;
            }
            if (c29823i0 != null) {
                C16663h c16663h = (C16663h) c12554k0.f42881x;
                C38915o4 c38915o4Mo124330Y2 = stripeIntent.mo124330Y();
                String str = c38915o4Mo124330Y2 != null ? c38915o4Mo124330Y2.f167513G : null;
                C0072g c0072g = new C0072g(c16663h.f64075a, str, c16663h.f64076b);
                if (c29823i0.equals(c29817f0)) {
                    strM30857i = "google_pay";
                } else if (c29823i0.equals(c29819g0)) {
                    strM30857i = "link";
                } else if (c29823i0 instanceof C29823i0) {
                    C29823i0 c29823i1 = (C29823i0) c29823i0;
                    strM30857i = AbstractC11478a.m30857i("payment_method:", c29823i1.f121904w, ":", c29823i1.f121905x);
                } else {
                    strM30857i = "";
                }
                Object value = ((C23470p) c0072g.f221E).getValue();
                AbstractC22676k.m65749i(value, "getValue(...)");
                SharedPreferences.Editor editorEdit = ((SharedPreferences) value).edit();
                if (str == null || (strM31996o = AbstractC11895b.m31996o("customer[", str, "]")) == null) {
                    strM31996o = "guest";
                }
                editorEdit.putString(strM31996o, strM30857i).commit();
            }
        }
        c1601k1.m5004e(null, "INITIAL_CONFIRMATION_ARGUMENTS_KEY");
        c1601k1.m5003d("AwaitingConfirmationResult");
    }

    /* JADX INFO: renamed from: f */
    public final void m35250f(InterfaceC21064c activityResultCaller, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        for (C12550i0 c12550i0 : this.f42913a) {
            C0106e c0106e = new C0106e(1, this, C12568r0.class, "onResult", "onResult(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;)V", 0, 25);
            c12550i0.getClass();
            c12550i0.f42873c = c12550i0.f42872b.mo35212g(activityResultCaller, new C9790n(14, c12550i0, c0106e));
        }
        lifecycleOwner.getLifecycle().mo4986a(new C12566q0(this, 0));
    }

    /* JADX INFO: renamed from: g */
    public final Object m35251g(C12553k c12553k, AbstractC32269c abstractC32269c) throws Throwable {
        this.f42915c.m5004e(c12553k, "INITIAL_CONFIRMATION_ARGUMENTS_KEY");
        Object objM8705K = AbstractC3006f0.m8705K(this.f42914b.getCoroutineContext(), new C11552o(this, c12553k, null, 7), abstractC32269c);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }
}
