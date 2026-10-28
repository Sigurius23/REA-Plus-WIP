package id0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import b30.C2588o1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ep1.C13412g;
import fc0.C14359c;
import fd0.AbstractC14397a;
import fy1.AbstractC14874j;
import gd0.AbstractC15711a;
import gd0.AbstractC15713c;
import gy0.AbstractC16277f;
import h02.C16587n0;
import hy0.C17794v;
import i01.C17841d;
import ib0.C18332c;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import ob0.AbstractC27789a;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p095dp.AbstractC12240d;
import p178gz.C16283a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p409q0.AbstractC29677c0;
import p409q0.AbstractC29701y;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pb0.AbstractC29052c;
import pb0.AbstractC29053d;
import pb0.C29051b;
import q83.InterfaceC30057d;
import qb0.AbstractC30180b;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: id0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\t\u001aC\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001aE\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u000b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lgd0/c;", "viewState", "Lkotlin/Function1;", "Lgd0/a;", "Ll83/a0;", "onViewEvent", "Lfd0/a;", "onNavigationEvent", "D", "(Lgd0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "p", "Lgd0/c$e;", "v", "(Lgd0/c$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lob0/a;", "navigationEvent", "H", "(Lob0/a;Lgd0/c$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lpb0/c;", "consentViewEvent", "Lpb0/d$a;", "consentForm", "", "pageIndex", "I", "(Lpb0/c;Lpb0/d$a;Lkotlin/jvm/functions/Function1;ILgd0/c$e;)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18409c {

    /* JADX INFO: renamed from: id0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentScreenKt$MultiConsent$4$1", m100430f = "MultiConsentScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71603w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f71604x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71604x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f71604x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f71603w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f71604x.invoke(AbstractC14397a.a.f52541a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentScreenKt$MultiConsentContent$3$1", m100430f = "MultiConsentScreen.kt", m100431l = {107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71605w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC29701y f71606x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC15713c.e f71607y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC29701y abstractC29701y, AbstractC15713c.e eVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71606x = abstractC29701y;
            this.f71607y = eVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f71606x, this.f71607y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71605w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f71606x.m91162k() != this.f71607y.getCurrentPageIndex()) {
                    AbstractC29701y abstractC29701y = this.f71606x;
                    int iM44293f = this.f71607y.getCurrentPageIndex();
                    this.f71605w = 1;
                    if (AbstractC29701y.m91155g(abstractC29701y, iM44293f, null, this, 6) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m52953A(AbstractC15713c.e eVar, Function1 function1, Function1 function2, AbstractC27789a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        m52960H(navigationEvent, eVar, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m52954B(AbstractC29053d.a aVar, Function1 function1, int i13, AbstractC15713c.e eVar, AbstractC29052c consentViewEvent) {
        AbstractC22676k.m65750j(consentViewEvent, "consentViewEvent");
        m52961I(consentViewEvent, aVar, function1, i13, eVar);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m52955C(AbstractC15713c.e eVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m52983v(eVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m52956D(AbstractC15713c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        Function1 function4;
        Function1 function5;
        Function1 function6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2019921327);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18332c(5);
                    c28655q.m87172p0(objM87133R);
                }
                function5 = (Function1) objM87133R;
            } else {
                function5 = function1;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C18332c(6);
                    c28655q.m87172p0(objM87133R2);
                }
                function6 = (Function1) objM87133R2;
            } else {
                function6 = function2;
            }
            AbstractC14874j.m42904c(viewState, "advanced_labs_multi_consent_screen", c28655q, (i15 & 14) | 48);
            Function1 function7 = function5;
            m52977p(viewState, function7, function6, c28655q, i15 & 1022, 0);
            function4 = function6;
            function3 = function7;
        } else {
            c28655q.m87138X();
            function3 = function1;
            function4 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18408b(viewState, function3, function4, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m52957E(AbstractC15711a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m52958F(AbstractC14397a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m52959G(AbstractC15713c abstractC15713c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m52956D(abstractC15713c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final void m52960H(AbstractC27789a navigationEvent, AbstractC15713c.e viewState, Function1 onViewEvent, Function1 onNavigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        if (!(navigationEvent instanceof AbstractC27789a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (viewState.getCurrentPageIndex() > 0) {
            onViewEvent.invoke(AbstractC15711a.c.f59176a);
        } else {
            onNavigationEvent.invoke(AbstractC14397a.a.f52541a);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m52961I(AbstractC29052c consentViewEvent, AbstractC29053d.a consentForm, Function1 onViewEvent, int i13, AbstractC15713c.e viewState) {
        AbstractC22676k.m65750j(consentViewEvent, "consentViewEvent");
        AbstractC22676k.m65750j(consentForm, "consentForm");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(viewState, "viewState");
        if (!(consentViewEvent instanceof AbstractC29052c.b)) {
            if (consentViewEvent instanceof AbstractC29052c.a) {
                if (i13 == AbstractC37056f.m118951C(viewState.m44292e())) {
                    onViewEvent.invoke(new AbstractC15711a.d(viewState.getSubmitRequest(), viewState.getFinalNavigationAction()));
                    return;
                } else {
                    onViewEvent.invoke(AbstractC15711a.b.f59175a);
                    return;
                }
            }
            return;
        }
        Iterator<C29051b> it = consentForm.m88308f().iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (AbstractC22676k.m65745e(it.next().getText(), ((AbstractC29052c.b) consentViewEvent).getCheckboxText())) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 >= 0) {
            onViewEvent.invoke(new AbstractC15711a.e(i13, i14, ((AbstractC29052c.b) consentViewEvent).getIsChecked()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0207  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    /* JADX WARN: Code duplicated, block: B:67:0x0136  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:73:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0162  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x019f  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final void m52977p(AbstractC15713c viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        Function1 function9;
        List list;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Function1 function10;
        boolean z15;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(621954077);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C18332c(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function3 = (Function1) objM87133R5;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C18332c(8);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    } else {
                        function7 = function4;
                    }
                    if (viewState instanceof AbstractC15713c.e) {
                        c28655q.m87150e0(145244995);
                        m52983v((AbstractC15713c.e) viewState, function3, function7, c28655q, i15 & 1022, 0);
                        function8 = function3;
                        function9 = function7;
                        c28655q.m87173q(false);
                    } else {
                        function8 = function3;
                        function9 = function7;
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (viewState instanceof AbstractC15713c.b) {
                            c28655q.m87150e0(145486330);
                            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i18, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                            z15 = (i15 & 896) == 256;
                            objM87133R3 = c28655q.m87133R();
                            if (z15 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C16283a(function9, 27);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function10 = function9;
                            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC15713c.a) {
                            c28655q.m87150e0(145910689);
                            z15 = (i15 & 896) == 256;
                            objM87133R2 = c28655q.m87133R();
                            if (z15 || objM87133R2 == c28676v0) {
                                objM87133R2 = new a(function9, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC15713c.c) {
                            c28655q.m87150e0(146056141);
                            function10 = function9;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC15713c.d) {
                                throw AbstractC11895b.m32003v(697421464, c28655q, false);
                            }
                            c28655q.m87150e0(146269483);
                            if ((i15 & 14) == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = z13 | ((i15 & 896) == 256);
                            objM87133R = c28655q.m87133R();
                            if (z14 || objM87133R == c28676v0) {
                                objM87133R = new C17841d(8, viewState, function9);
                                c28655q.m87172p0(objM87133R);
                            }
                            function10 = function9;
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 1000L, (InterfaceC4339a) objM87133R, 1, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        function6 = function10;
                        function5 = function8;
                    }
                    function10 = function9;
                    function6 = function10;
                    function5 = function8;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18408b(viewState, function5, function6, i13, i14, 1);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18332c(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(8);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function4;
                }
                if (viewState instanceof AbstractC15713c.e) {
                    c28655q.m87150e0(145244995);
                    m52983v((AbstractC15713c.e) viewState, function3, function7, c28655q, i15 & 1022, 0);
                    function8 = function3;
                    function9 = function7;
                    c28655q.m87173q(false);
                } else {
                    function8 = function3;
                    function9 = function7;
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC15713c.b) {
                        c28655q.m87150e0(145486330);
                        AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i18, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                        if ((i15 & 896) == 256) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C16283a(function9, 27);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C16283a(function9, 27);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function10 = function9;
                        AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC15713c.a) {
                        c28655q.m87150e0(145910689);
                        if ((i15 & 896) == 256) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new a(function9, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function9, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC15713c.c) {
                        c28655q.m87150e0(146056141);
                        function10 = function9;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC15713c.d) {
                            throw AbstractC11895b.m32003v(697421464, c28655q, false);
                        }
                        c28655q.m87150e0(146269483);
                        if ((i15 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((i15 & 896) == 256);
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new C17841d(8, viewState, function9);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C17841d(8, viewState, function9);
                            c28655q.m87172p0(objM87133R);
                        }
                        function10 = function9;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 1000L, (InterfaceC4339a) objM87133R, 1, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    function6 = function10;
                    function5 = function8;
                }
                function10 = function9;
                function6 = function10;
                function5 = function8;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18408b(viewState, function5, function6, i13, i14, 1);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C18332c(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function3 = (Function1) objM87133R5;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(8);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function4;
                }
                if (viewState instanceof AbstractC15713c.e) {
                    c28655q.m87150e0(145244995);
                    m52983v((AbstractC15713c.e) viewState, function3, function7, c28655q, i15 & 1022, 0);
                    function8 = function3;
                    function9 = function7;
                    c28655q.m87173q(false);
                } else {
                    function8 = function3;
                    function9 = function7;
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (viewState instanceof AbstractC15713c.b) {
                        c28655q.m87150e0(145486330);
                        AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i18, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                        if ((i15 & 896) == 256) {
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z15) {
                            objM87133R3 = new C16283a(function9, 27);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C16283a(function9, 27);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function10 = function9;
                        AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC15713c.a) {
                        c28655q.m87150e0(145910689);
                        if ((i15 & 896) == 256) {
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new a(function9, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new a(function9, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC15713c.c) {
                        c28655q.m87150e0(146056141);
                        function10 = function9;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC15713c.d) {
                            throw AbstractC11895b.m32003v(697421464, c28655q, false);
                        }
                        c28655q.m87150e0(146269483);
                        if ((i15 & 14) == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = z13 | ((i15 & 896) == 256);
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new C17841d(8, viewState, function9);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C17841d(8, viewState, function9);
                            c28655q.m87172p0(objM87133R);
                        }
                        function10 = function9;
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 1000L, (InterfaceC4339a) objM87133R, 1, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    function6 = function10;
                    function5 = function8;
                }
                function10 = function9;
                function6 = function10;
                function5 = function8;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18408b(viewState, function5, function6, i13, i14, 1);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C18332c(7);
                    c28655q.m87172p0(objM87133R5);
                }
                function3 = (Function1) objM87133R5;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C18332c(8);
                    c28655q.m87172p0(objM87133R4);
                }
                function7 = (Function1) objM87133R4;
            } else {
                function7 = function4;
            }
            if (viewState instanceof AbstractC15713c.e) {
                c28655q.m87150e0(145244995);
                m52983v((AbstractC15713c.e) viewState, function3, function7, c28655q, i15 & 1022, 0);
                function8 = function3;
                function9 = function7;
                c28655q.m87173q(false);
            } else {
                function8 = function3;
                function9 = function7;
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (viewState instanceof AbstractC15713c.b) {
                    c28655q.m87150e0(145486330);
                    AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i18, objArr == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i18, objArr3 == true ? 1 : 0);
                    if ((i15 & 896) == 256) {
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z15) {
                        objM87133R3 = new C16283a(function9, 27);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C16283a(function9, 27);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function10 = function9;
                    AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R3, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC15713c.a) {
                    c28655q.m87150e0(145910689);
                    if ((i15 & 896) == 256) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new a(function9, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(function9, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC15713c.c) {
                    c28655q.m87150e0(146056141);
                    function10 = function9;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC15713c.d) {
                        throw AbstractC11895b.m32003v(697421464, c28655q, false);
                    }
                    c28655q.m87150e0(146269483);
                    if ((i15 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new C17841d(8, viewState, function9);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C17841d(8, viewState, function9);
                        c28655q.m87172p0(objM87133R);
                    }
                    function10 = function9;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 1000L, (InterfaceC4339a) objM87133R, 1, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                function6 = function10;
                function5 = function8;
            }
            function10 = function9;
            function6 = function10;
            function5 = function8;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18408b(viewState, function5, function6, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m52978q(AbstractC15711a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m52979r(AbstractC14397a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m52980s(Function1 function1) {
        function1.invoke(AbstractC14397a.a.f52541a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m52981t(AbstractC15713c abstractC15713c, Function1 function1) {
        C9598e c9598eM44288b = ((AbstractC15713c.d) abstractC15713c).getFinalNavigationAction();
        if (c9598eM44288b != null) {
            function1.invoke(new AbstractC14397a.b(c9598eM44288b));
        } else {
            function1.invoke(AbstractC14397a.a.f52541a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m52982u(AbstractC15713c abstractC15713c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m52977p(abstractC15713c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    private static final void m52983v(AbstractC15713c.e eVar, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        C28655q c28655q;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        boolean zM87157i;
        Object objM87133R;
        C29674b c29674bM91150b;
        boolean zM87153g;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(26506218);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(eVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q2.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C18332c(9);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C18332c(10);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function4;
                    }
                    int iM44293f = eVar.getCurrentPageIndex();
                    zM87157i = c28655q2.m87157i(eVar);
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C16587n0(eVar, 17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, iM44293f, 0, c28655q2, 2);
                    Integer numValueOf = Integer.valueOf(eVar.getCurrentPageIndex());
                    zM87153g = c28655q2.m87153g(c29674bM91150b) | c28655q2.m87157i(eVar);
                    objM87133R2 = c28655q2.m87133R();
                    if (zM87153g || objM87133R2 == c28676v0) {
                        objM87133R2 = new b(c29674bM91150b, eVar, null);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, numValueOf);
                    Function1 function8 = function7;
                    c28655q = c28655q2;
                    AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1299101449, c28655q2, new C14359c(eVar, function6, function7, 1)), c28655q, 100663344, 24576, 16124);
                    function3 = function6;
                    function5 = function8;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17794v(i13, i14, 8, (Object) eVar, (Object) function5, function3);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(9);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C18332c(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                int iM44293f2 = eVar.getCurrentPageIndex();
                zM87157i = c28655q2.m87157i(eVar);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C16587n0(eVar, 17);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C16587n0(eVar, 17);
                    c28655q2.m87172p0(objM87133R);
                }
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, iM44293f2, 0, c28655q2, 2);
                Integer numValueOf2 = Integer.valueOf(eVar.getCurrentPageIndex());
                zM87153g = c28655q2.m87153g(c29674bM91150b) | c28655q2.m87157i(eVar);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = new b(c29674bM91150b, eVar, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(c29674bM91150b, eVar, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, numValueOf2);
                Function1 function9 = function7;
                c28655q = c28655q2;
                AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1299101449, c28655q2, new C14359c(eVar, function6, function7, 1)), c28655q, 100663344, 24576, 16124);
                function3 = function6;
                function5 = function9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 8, (Object) eVar, (Object) function5, function3);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C18332c(9);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C18332c(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function4;
                }
                int iM44293f3 = eVar.getCurrentPageIndex();
                zM87157i = c28655q2.m87157i(eVar);
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C16587n0(eVar, 17);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C16587n0(eVar, 17);
                    c28655q2.m87172p0(objM87133R);
                }
                c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, iM44293f3, 0, c28655q2, 2);
                Integer numValueOf3 = Integer.valueOf(eVar.getCurrentPageIndex());
                zM87153g = c28655q2.m87153g(c29674bM91150b) | c28655q2.m87157i(eVar);
                objM87133R2 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R2 = new b(c29674bM91150b, eVar, null);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new b(c29674bM91150b, eVar, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, numValueOf3);
                Function1 function10 = function7;
                c28655q = c28655q2;
                AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1299101449, c28655q2, new C14359c(eVar, function6, function7, 1)), c28655q, 100663344, 24576, 16124);
                function3 = function6;
                function5 = function10;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 8, (Object) eVar, (Object) function5, function3);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C18332c(9);
                    c28655q2.m87172p0(objM87133R4);
                }
                function6 = (Function1) objM87133R4;
            } else {
                function6 = function3;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C18332c(10);
                    c28655q2.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function4;
            }
            int iM44293f4 = eVar.getCurrentPageIndex();
            zM87157i = c28655q2.m87157i(eVar);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R = new C16587n0(eVar, 17);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C16587n0(eVar, 17);
                c28655q2.m87172p0(objM87133R);
            }
            c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, iM44293f4, 0, c28655q2, 2);
            Integer numValueOf4 = Integer.valueOf(eVar.getCurrentPageIndex());
            zM87153g = c28655q2.m87153g(c29674bM91150b) | c28655q2.m87157i(eVar);
            objM87133R2 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R2 = new b(c29674bM91150b, eVar, null);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new b(c29674bM91150b, eVar, null);
                c28655q2.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, numValueOf4);
            Function1 function11 = function7;
            c28655q = c28655q2;
            AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, null, 0, 0.0f, null, null, false, null, null, null, AbstractC37817c.m121344e(1299101449, c28655q2, new C14359c(eVar, function6, function7, 1)), c28655q, 100663344, 24576, 16124);
            function3 = function6;
            function5 = function11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 8, (Object) eVar, (Object) function5, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m52984w(AbstractC15711a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m52985x(AbstractC14397a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final int m52986y(AbstractC15713c.e eVar) {
        return eVar.m44292e().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m52987z(AbstractC15713c.e eVar, Function1 function1, Function1 function2, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC29053d.a aVar;
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        AbstractC29053d.a aVar2 = eVar.m44292e().get(i13);
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(eVar) | c28655q.m87153g(function1) | c28655q.m87153g(function2);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C13412g(eVar, function1, function2, 28);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function3 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(aVar2) | c28655q.m87153g(function1) | ((((i14 & 112) ^ 48) > 32 && c28655q.m87149e(i13)) || (i14 & 48) == 32) | c28655q.m87157i(eVar);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            aVar = aVar2;
            C2588o1 c2588o1 = new C2588o1(aVar, function1, i13, eVar, 3);
            c28655q.m87172p0(c2588o1);
            objM87133R2 = c2588o1;
        } else {
            aVar = aVar2;
        }
        AbstractC30180b.m92390q(aVar, function3, (Function1) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }
}
