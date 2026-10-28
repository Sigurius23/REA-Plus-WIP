package j10;

import android.content.Context;
import android.os.Parcelable;
import b10.C2222b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bz.C3710i;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.paymentelement.confirmation.intent.CallbackNotFoundException;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.whoop.android.R;
import com.whoop.profile.view.edit.C9790n;
import e10.C12535b;
import e10.C12537c;
import e10.C12541e;
import e10.C12543f;
import e10.C12545g;
import e10.C12547h;
import e10.C12548h0;
import e10.C12553k;
import e10.C12565q;
import e10.C12569s;
import e10.C12571t;
import e10.C12572t0;
import e10.C12574u0;
import e10.EnumC12557m;
import e10.InterfaceC12549i;
import e10.InterfaceC12551j;
import e10.InterfaceC12555l;
import e10.InterfaceC12576v0;
import f10.C13999a;
import g20.AbstractC15258d;
import g20.C15255a;
import g20.C15256b;
import g20.C15257c;
import g20.C15262h;
import g20.C15265k;
import g20.C15277w;
import h20.C16689l1;
import h20.EnumC16660g2;
import i20.AbstractC17960l1;
import i20.C17928b;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import j00.C21105i;
import js2.C21930h;
import l10.AbstractC23216a;
import l10.C23217b;
import l10.C23218c;
import l20.C23236a;
import l83.C23454a0;
import n10.C26123d0;
import n10.C26125e0;
import n10.C26129g0;
import n10.EnumC26121c0;
import n10.InterfaceC26127f0;
import n10.InterfaceC26131h0;
import n10.InterfaceC26133i0;
import p097ds.AbstractC12313p;
import p213i7.C18194g;
import p236j.AbstractC21065d;
import p236j.InterfaceC21064c;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p664yy.C39865j;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sz.AbstractC33132g0;
import sz.C33124c0;
import sz.C33126d0;
import sz.C33128e0;
import sz.C33130f0;
import sz.C33134h0;
import sz.C33142l0;
import sz.EnumC33131g;
import tz.C34274a;
import tz.C34275b;
import v00.AbstractC35455a0;
import v00.C35459c0;
import v00.C35484p;
import w20.C36709a0;
import w20.C36713c0;
import w20.C36723m;
import w20.C36724n;
import w20.InterfaceC36725o;
import x30.AbstractC37926s0;
import y00.AbstractC38970u5;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38889l5;
import y00.C38901n;
import y00.C38919p;
import y00.C38928q;
import y00.C38937r;
import y00.InterfaceC38802c8;
import y00.InterfaceC38946s;

/* JADX INFO: renamed from: j10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21196a implements InterfaceC12551j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f80769a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f80770b;

    /* JADX INFO: renamed from: c */
    public final Object f80771c;

    public C21196a(C23236a handler, C36709a0 factory) {
        AbstractC22676k.m65750j(handler, "handler");
        AbstractC22676k.m65750j(factory, "factory");
        this.f80770b = handler;
        this.f80771c = factory;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: a */
    public final void mo35206a(Object obj, Object obj2, InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        String str;
        switch (this.f80769a) {
            case 0:
                C12574u0 confirmationOption = (C12574u0) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                ((C23236a) this.f80770b).m67269b(confirmationOption.f42940w, new C19223a(26, (C36713c0) obj, confirmationArgs));
                return;
            case 1:
                AbstractC21065d abstractC21065d = (AbstractC21065d) obj;
                C23218c confirmationOption2 = (C23218c) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationOption2, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                C35459c0 c35459c0 = confirmationArgs.f42878x;
                C23217b c23217b = confirmationOption2.f91933w;
                InterfaceC38802c8 interfaceC38802c8 = confirmationArgs.f42879y;
                C34275b c34275b = (C34275b) this.f80770b;
                AbstractC3006f0.m8708b(AbstractC3050q0.f12077a);
                EnumC16660g2 enumC16660g2 = c23217b.f91929w;
                C16689l1 c16689l1 = c23217b.f91925G;
                EnumC33131g enumC33131g = (enumC16660g2 == null ? -1 : AbstractC23216a.f91922a[enumC16660g2.ordinal()]) == 1 ? EnumC33131g.Production : EnumC33131g.Test;
                String str2 = c23217b.f91931y;
                String str3 = c35459c0.f150967J;
                if (str3 == null) {
                    str3 = c23217b.f91930x;
                }
                C33124c0 c33124c0 = new C33124c0(enumC33131g, str2, str3, c16689l1.m47250f(), c16689l1.m47253k(), c23217b.f91928J);
                new C18194g(21);
                InterfaceC35320a cardBrandFilter = c23217b.f91926H;
                InterfaceC35322b cardFundingFilter = c23217b.f91927I;
                C21105i c21105i = c34275b.f143965a;
                Context context = (Context) c21105i.f80039a.get();
                C34274a googlePayRepositoryFactory = (C34274a) c21105i.f80040b.get();
                C2222b paymentAnalyticsRequestFactory = (C2222b) c21105i.f80041c.get();
                C39865j analyticsRequestExecutor = (C39865j) c21105i.f80042d.get();
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(googlePayRepositoryFactory, "googlePayRepositoryFactory");
                AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
                AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
                AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
                AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
                if (!C33134h0.f138199a) {
                    C33134h0.f138199a = true;
                    analyticsRequestExecutor.m127938a(C2222b.m7051c(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayPaymentMethodLauncherInit, null, null, null, null, 62));
                }
                boolean z4 = interfaceC38802c8 instanceof C38887l3;
                C38887l3 c38887l3 = z4 ? (C38887l3) interfaceC38802c8 : null;
                if ((c38887l3 == null || (str = c38887l3.f167376K) == null) && (str = c23217b.f91932z) == null) {
                    str = "";
                }
                String str4 = str;
                long jLongValue = 0;
                if (z4) {
                    Long l7 = ((C38887l3) interfaceC38802c8).f167393y;
                    if (l7 != null) {
                        jLongValue = l7.longValue();
                    }
                } else {
                    if (!(interfaceC38802c8 instanceof C38840g6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Long l12 = c23217b.f91923E;
                    if (l12 != null) {
                        jLongValue = l12.longValue();
                    }
                }
                abstractC21065d.mo4052a(new C33142l0(c33124c0, str4, jLongValue, c23217b.f91924F, interfaceC38802c8.getId(), cardBrandFilter, cardFundingFilter, c35459c0.f150987d0, true), null);
                return;
            default:
                C15277w c15277w = (C15277w) obj;
                InterfaceC26127f0 interfaceC26127f0 = (InterfaceC26127f0) obj2;
                AbstractC22676k.m65750j((InterfaceC12576v0) interfaceC12555l, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                if (!(interfaceC26127f0 instanceof C26123d0)) {
                    if (!(interfaceC26127f0 instanceof C26125e0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c15277w.f57364c.mo4052a(new C15265k((String) c15277w.f57362a.invoke(), (String) c15277w.f57363b.invoke(), c15277w.f57366e, c15277w.f57367f, true, ((C26125e0) interfaceC26127f0).f103508a, c15277w.f57365d), null);
                    return;
                }
                InterfaceC38946s interfaceC38946s = ((C26123d0) interfaceC26127f0).f103501a;
                if (interfaceC38946s instanceof C38928q) {
                    c15277w.f57364c.mo4052a(new C15262h((String) c15277w.f57362a.invoke(), (String) c15277w.f57363b.invoke(), c15277w.f57366e, c15277w.f57367f, true, (C38928q) interfaceC38946s, c15277w.f57365d), null);
                    return;
                } else {
                    if (!(interfaceC38946s instanceof C38937r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c15277w.f57364c.mo4052a(new C15262h((String) c15277w.f57362a.invoke(), (String) c15277w.f57363b.invoke(), c15277w.f57366e, c15277w.f57367f, true, (C38937r) interfaceC38946s, c15277w.f57365d), null);
                    return;
                }
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: b */
    public final InterfaceC12555l mo35207b(InterfaceC12555l confirmationOption) {
        switch (this.f80769a) {
            case 0:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C12574u0) {
                    return (C12574u0) confirmationOption;
                }
                return null;
            case 1:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof C23218c) {
                    return (C23218c) confirmationOption;
                }
                return null;
            default:
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                if (confirmationOption instanceof InterfaceC12576v0) {
                    return (InterfaceC12576v0) confirmationOption;
                }
                return null;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: c */
    public final boolean mo35208c(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        switch (this.f80769a) {
            case 0:
                C12574u0 c12574u0 = (C12574u0) interfaceC12555l;
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC38970u5 abstractC38970u5 = c12574u0.f42941x;
                return (!(abstractC38970u5 instanceof C38889l5) || ((C38889l5) abstractC38970u5).f167404x == null) && ((C23236a) this.f80770b).m67270c(confirmationArgs.f42879y, c12574u0.f42940w) && !c12574u0.f42942y;
            case 1:
                AbstractC12313p.m34303u((C23218c) interfaceC12555l, confirmationArgs);
                return true;
            default:
                AbstractC12313p.m34303u((InterfaceC12576v0) interfaceC12555l, confirmationArgs);
                return true;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: d */
    public final void mo35209d(C35459c0 c35459c0) {
        switch (this.f80769a) {
            case 0:
                AbstractC12313p.m34302t(c35459c0);
                break;
            case 1:
                AbstractC12313p.m34302t(c35459c0);
                break;
            default:
                AbstractC12313p.m34302t(c35459c0);
                break;
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: e */
    public final Object mo35210e(InterfaceC12555l interfaceC12555l, C12553k c12553k, C12548h0 c12548h0) {
        switch (this.f80769a) {
            case 0:
                return new C12537c(C23454a0.f92919a, true, null);
            case 1:
                if (((C23218c) interfaceC12555l).f91933w.f91932z != null || (c12553k.f42879y instanceof C38887l3)) {
                    return new C12537c(C23454a0.f92919a, true, null);
                }
                C3710i c3710i = (C3710i) this.f80771c;
                if (c3710i != null) {
                    c3710i.m11528a("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent");
                }
                return new C12535b(new IllegalStateException("GooglePayConfig.currencyCode is required in order to use Google Pay when processing a Setup Intent"), AbstractC32128i.m100054h(R.string.stripe_something_went_wrong), C12569s.f42924a);
            default:
                return m59428i((InterfaceC12576v0) interfaceC12555l, c12553k, c12548h0);
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: f */
    public final InterfaceC12549i mo35211f(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs, EnumC26121c0 enumC26121c0, Parcelable parcelable) {
        switch (this.f80769a) {
            case 0:
                C12574u0 confirmationOption = (C12574u0) interfaceC12555l;
                InterfaceC36725o result = (InterfaceC36725o) parcelable;
                AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result, "result");
                if (result instanceof C36724n) {
                    AbstractC38970u5 abstractC38970u5 = confirmationOption.f42941x;
                    return new C12545g(C12574u0.m35256b(confirmationOption, abstractC38970u5 instanceof C38889l5 ? C38889l5.m124360f((C38889l5) abstractC38970u5, ((C36724n) result).f157213w, null, 14) : new C38889l5(6, ((C36724n) result).f157213w, null)), confirmationArgs);
                }
                if (result instanceof C36723m) {
                    return new C12541e(EnumC12557m.f42884w);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                AbstractC33132g0 result2 = (AbstractC33132g0) parcelable;
                AbstractC22676k.m65750j((C23218c) interfaceC12555l, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result2, "result");
                if (result2 instanceof C33128e0) {
                    return new C12545g(new C12574u0(((C33128e0) result2).f138190w, null, 24), confirmationArgs);
                }
                if (result2 instanceof C33130f0) {
                    C33130f0 c33130f0 = (C33130f0) result2;
                    int i13 = c33130f0.f138193x;
                    return new C12543f(c33130f0.f138192w, i13 == 3 ? AbstractC32128i.m100054h(R.string.stripe_failure_connection_error) : AbstractC32128i.m100054h(R.string.stripe_internal_error), new C12565q(i13));
                }
                if (result2 instanceof C33126d0) {
                    return new C12541e(EnumC12557m.f42884w);
                }
                throw new NoWhenBranchMatchedException();
            default:
                AbstractC15258d result3 = (AbstractC15258d) parcelable;
                AbstractC22676k.m65750j((InterfaceC12576v0) interfaceC12555l, "confirmationOption");
                AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
                AbstractC22676k.m65750j(result3, "result");
                if (result3 instanceof C15256b) {
                    return new C12547h(((C15256b) result3).f57287w, enumC26121c0, true);
                }
                if (result3 instanceof C15257c) {
                    Throwable th3 = ((C15257c) result3).f57288w;
                    return new C12543f(th3, AbstractC37926s0.m121456H(th3), C12571t.f42932a);
                }
                if (result3 instanceof C15255a) {
                    return new C12541e(EnumC12557m.f42884w);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: g */
    public final Object mo35212g(InterfaceC21064c activityResultCaller, C9790n c9790n) {
        switch (this.f80769a) {
            case 0:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                C36709a0 c36709a0 = (C36709a0) this.f80771c;
                AbstractC21065d activityResultLauncher = activityResultCaller.registerForActivityResult(new CvcRecollectionContract(), new C13999a(c9790n, 4));
                c36709a0.getClass();
                AbstractC22676k.m65750j(activityResultLauncher, "activityResultLauncher");
                return new C36713c0(activityResultLauncher);
            case 1:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return activityResultCaller.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new C13999a(c9790n, 6));
            default:
                AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
                return (C15277w) ((C21930h) this.f80771c).invoke(activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new C13999a(c9790n, 7)));
        }
    }

    @Override // e10.InterfaceC12551j
    public final String getKey() {
        switch (this.f80769a) {
            case 0:
                return "CvcRecollection";
            case 1:
                return "GooglePay";
            default:
                return "IntentConfirmation";
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo35213h(Object obj) {
        switch (this.f80769a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public Object m59428i(InterfaceC12576v0 interfaceC12576v0, C12553k c12553k, AbstractC32269c abstractC32269c) {
        C26129g0 c26129g0;
        if (abstractC32269c instanceof C26129g0) {
            c26129g0 = (C26129g0) abstractC32269c;
            int i13 = c26129g0.f103525E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26129g0.f103525E = i13 - Integer.MIN_VALUE;
            } else {
                c26129g0 = new C26129g0(this, abstractC32269c);
            }
        } else {
            c26129g0 = new C26129g0(this, abstractC32269c);
        }
        C26129g0 c26129g1 = c26129g0;
        Object objMo77685a = c26129g1.f103528y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26129g1.f103525E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo77685a);
                C35459c0 c35459c0 = c12553k.f42878x;
                InterfaceC26131h0 interfaceC26131h0 = (InterfaceC26131h0) this.f80770b;
                AbstractC35455a0 abstractC35455a0 = c35459c0.f150991h0;
                C35484p c35484p = c35459c0.f150973P;
                String str = c35484p != null ? c35484p.f151059w : null;
                String str2 = c35484p != null ? c35484p.f151060x : null;
                C38901n c38901n = c35459c0.f150987d0;
                c26129g1.f103526w = interfaceC12576v0;
                c26129g1.f103527x = c12553k;
                c26129g1.f103525E = 1;
                objMo77685a = interfaceC26131h0.mo77685a(abstractC35455a0, str, str2, c38901n, c26129g1);
                if (objMo77685a == enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    AbstractC34132o.m107864I(objMo77685a);
                    return objMo77685a;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo77685a);
                return objMo77685a;
            }
            c12553k = c26129g1.f103527x;
            interfaceC12576v0 = c26129g1.f103526w;
            AbstractC34132o.m107864I(objMo77685a);
            InterfaceC26133i0 interfaceC26133i0 = (InterfaceC26133i0) objMo77685a;
            if (interfaceC12576v0 instanceof C12572t0) {
                InterfaceC38802c8 interfaceC38802c8 = c12553k.f42879y;
                C12572t0 c12572t0 = (C12572t0) interfaceC12576v0;
                C17928b c17928b = c12553k.f42878x.f150969L;
                C38919p c38919pM51587n = c17928b != null ? AbstractC17960l1.m51587n(c17928b) : null;
                c26129g1.f103526w = null;
                c26129g1.f103527x = null;
                c26129g1.f103525E = 2;
                Object objMo77681b = interfaceC26133i0.mo77681b(interfaceC38802c8, c12572t0, c38919pM51587n, c26129g1);
                if (objMo77681b != enumC31071a) {
                    return objMo77681b;
                }
            } else {
                if (!(interfaceC12576v0 instanceof C12574u0)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC38802c8 interfaceC38802c9 = c12553k.f42879y;
                C12574u0 c12574u0 = (C12574u0) interfaceC12576v0;
                C17928b c17928b2 = c12553k.f42878x.f150969L;
                C38919p c38919pM51587n2 = c17928b2 != null ? AbstractC17960l1.m51587n(c17928b2) : null;
                c26129g1.f103526w = null;
                c26129g1.f103527x = null;
                c26129g1.f103525E = 3;
                Object objMo77680a = interfaceC26133i0.mo77680a(interfaceC38802c9, c12574u0, c38919pM51587n2, c26129g1);
                if (objMo77680a != enumC31071a) {
                    return objMo77680a;
                }
            }
            return enumC31071a;
        } catch (CallbackNotFoundException e5) {
            return new C12535b(new IllegalStateException(e5.getMessage()), e5.f22330F, C12571t.f42932a);
        }
    }

    public C21196a(InterfaceC26131h0 interfaceC26131h0, C21930h c21930h) {
        this.f80770b = interfaceC26131h0;
        this.f80771c = c21930h;
    }

    public C21196a(C34275b googlePayPaymentMethodLauncherFactory, C3710i c3710i) {
        AbstractC22676k.m65750j(googlePayPaymentMethodLauncherFactory, "googlePayPaymentMethodLauncherFactory");
        this.f80770b = googlePayPaymentMethodLauncherFactory;
        this.f80771c = c3710i;
    }
}
