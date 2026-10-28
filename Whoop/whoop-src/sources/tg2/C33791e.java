package tg2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.StressInterventionModel;
import com.whoop.whoopaction.domain.models.DismissModalAction;
import ec3.InterfaceC13058l;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n82.C26457c;
import n82.InterfaceC26456b;
import nf3.C26669a;
import ng2.AbstractC26685d;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22656a;
import p720m91.InterfaceC25297f;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sg2.C32469t;
import su1.C33018d;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: tg2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Ltg2/e;", "Lm91/f;", "Ltg2/m;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ltg2/l;", "pickerViewModel", "Ln82/c;", "pickerViewState", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33791e implements InterfaceC25297f<C33799m> {

    /* JADX INFO: renamed from: tg2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f141475w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f141476x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f141477y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f141478z;

        /* JADX INFO: renamed from: tg2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42388a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f141479w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42388a(C21647a c21647a) {
                super(0);
                this.f141479w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f141479w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f141475w = c38266c;
            this.f141476x = interfaceC35951a;
            this.f141477y = interfaceC4339a;
            this.f141478z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, tg2.l] */
        @Override // c93.InterfaceC4339a
        public final C33798l invoke() {
            return AbstractC21598x.m60668X(this.f141475w, this.f141476x, new C42388a(this.f141478z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33798l.class), null, this.f141477y);
        }
    }

    /* JADX INFO: renamed from: tg2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.selectactivity.SelectActivityPickerItem$Compose$1$1", m100430f = "SelectActivityPickerState.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141480w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f141481x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f141481x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f141481x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f141480w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C33798l.m106952p(C33791e.m106877d(this.f141481x), null, 1, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tg2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22656a implements Function1 {
        public c(Object obj) {
            super(1, 8, C33798l.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/select/activity/presentation/SelectActivityViewEvent;)Lkotlinx/coroutines/Job;");
        }

        /* JADX INFO: renamed from: a */
        public final void m106883a(InterfaceC26456b p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C33798l) this.receiver).m106955r(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m106883a((InterfaceC26456b) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C33798l m106877d(InterfaceC23462h interfaceC23462h) {
        return (C33798l) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: e */
    private static final C26457c m106878e(InterfaceC28670t2 interfaceC28670t2) {
        return (C26457c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m106879f(Function1 function1, C33799m c33799m, String internalName) {
        AbstractC22676k.m65750j(internalName, "internalName");
        if (AbstractC33797k.m106947a(internalName)) {
            function1.invoke(new C9598e(AppScreen.C9445w5.f28022w, new StressInterventionModel(internalName), null, 4, null));
            function1.invoke(new DesignItemInteraction(DismissModalAction.INSTANCE, null));
        } else {
            function1.invoke(AbstractC26685d.m79375b(internalName, c33799m.getIsGpsTrackingEnabled(), true));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m106880g(C33791e c33791e, Modifier modifier, C33799m c33799m, Function1 function1, int i13, Composer composer, int i14) {
        c33791e.Compose(modifier, c33799m, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C33799m itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1387986851);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC13058l viewState = m106877d(interfaceC23462h).getViewState();
            C26457c c26457c = new C26457c(null, null, null, null, null, null, null, null, null, false, 1023, null);
            int i15 = C26457c.f105074k;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewState, c26457c, null, c28655q, i15 << 3, 2);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C33794h();
                c28655q.m87172p0(objM87133R2);
            }
            C33794h c33794h = (C33794h) objM87133R2;
            boolean zM87153g2 = c28655q.m87153g(m106878e(interfaceC28601c1M87260n)) | c28655q.m87153g(itemState.getSelectedInternalName());
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = c33794h.m106915a(m106878e(interfaceC28601c1M87260n), itemState.getSelectedInternalName());
                c28655q.m87172p0(objM87133R3);
            }
            C26457c c26457c2 = (C26457c) objM87133R3;
            String id4 = itemState.getId();
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i || objM87133R4 == c28676v0) {
                objM87133R4 = new b(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, id4);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            boolean zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC33790d.m106873t())).booleanValue();
            C33798l c33798lM106877d = m106877d(interfaceC23462h);
            boolean zM87157i2 = c28655q.m87157i(c33798lM106877d);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i2 || objM87133R5 == c28676v0) {
                objM87133R5 = new c(c33798lM106877d);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function1 = (Function1) objM87133R5;
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32);
            Object objM87133R6 = c28655q.m87133R();
            if (z4 || objM87133R6 == c28676v0) {
                objM87133R6 = new C32469t(17, onViewEvent, itemState);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC33796j.m106930l(c26457c2, function1, (Function1) objM87133R6, modifierM3409f, zBooleanValue, c28655q, i15, 0);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33018d(i13, 28, this, modifier, itemState, onViewEvent);
        }
    }
}
