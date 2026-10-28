package qa2;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ec3.InterfaceC13087t1;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kc2.AbstractC22355e;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import oe2.C27878c;
import or2.C28216y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q80.C30036h;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ra2.AbstractC31179a;
import ra2.C31180b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ta2.AbstractC33673a;
import ta2.C33674b;
import ua2.C34720a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wa2.AbstractC36981a;
import xa2.C38139a;

/* JADX INFO: renamed from: qa2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lqa2/b;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lor2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lta2/b;", "x", "D", "()Lta2/b;", "navRouter", "Lxa2/a;", "y", "E", "()Lxa2/a;", "viewModel", "Lra2/b;", "z", "C", "()Lra2/b;", "analytics", "Lua2/a;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30114b extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: qa2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.settings.affiliates.SettingsAffiliatesFragment$onCreateView$1$1$1", m100430f = "SettingsAffiliatesFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f122950w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30114b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f122950w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C30114b.this.m92258E().m122158p(new AbstractC22355e.a(null, 1, 0 == true ? 1 : 0));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qa2.b$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f122952w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f122953x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f122954y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f122952w = componentCallbacks;
            this.f122953x = interfaceC35951a;
            this.f122954y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f122952w;
            InterfaceC35951a interfaceC35951a = this.f122953x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f122954y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: qa2.b$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f122955w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f122956x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f122957y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f122955w = componentCallbacks;
            this.f122956x = interfaceC35951a;
            this.f122957y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ta2.b] */
        @Override // c93.InterfaceC4339a
        public final C33674b invoke() {
            ComponentCallbacks componentCallbacks = this.f122955w;
            InterfaceC35951a interfaceC35951a = this.f122956x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f122957y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33674b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: qa2.b$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f122958w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f122959x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f122960y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f122958w = componentCallbacks;
            this.f122959x = interfaceC35951a;
            this.f122960y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ra2.b] */
        @Override // c93.InterfaceC4339a
        public final C31180b invoke() {
            ComponentCallbacks componentCallbacks = this.f122958w;
            InterfaceC35951a interfaceC35951a = this.f122959x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f122960y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31180b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: qa2.b$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f122961w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f122961w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f122961w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: qa2.b$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f122962w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f122963x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f122964y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f122965z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f122962w = componentCallbacks;
            this.f122963x = interfaceC35951a;
            this.f122964y = interfaceC4339a;
            this.f122965z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, xa2.a] */
        @Override // c93.InterfaceC4339a
        public final C38139a invoke() {
            return AbstractC34132o.m107857B(this.f122962w, this.f122963x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38139a.class), this.f122964y, this.f122965z);
        }
    }

    public C30114b() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new b(this, null, null));
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new c(this, null, new C30036h(this, 2)));
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(this, null, new e(this), null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new d(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C33674b m92249D() {
        return (C33674b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m92250F(C30114b c30114b) {
        return AbstractC15751g.m44431K(c30114b.requireActivity(), c30114b.getExternalLinkNavigator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m92251G(final C30114b c30114b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        boolean zM87157i = c28655q.m87157i(c30114b);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = c30114b.new a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        InterfaceC13087t1 interfaceC13087t1M122157n = c30114b.m92258E().getViewState();
        C34720a c34720a = new C34720a(null, 1, null);
        int i14 = TextResource.$stable;
        C34720a c34720aM92252H = m92252H(AbstractC28683x.m87260n(interfaceC13087t1M122157n, c34720a, null, c28655q, i14 << 3, 2));
        boolean zM87157i2 = c28655q.m87157i(c30114b);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i15 = 0;
            objM87133R2 = new Function1(c30114b) { // from class: qa2.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C30114b f122945x;

                {
                    this.f122945x = c30114b;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return C30114b.m92253I(this.f122945x, (AbstractC31179a) obj);
                        default:
                            return C30114b.m92254J(this.f122945x, (AbstractC33673a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c30114b);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            final int i16 = 1;
            objM87133R3 = new Function1(c30114b) { // from class: qa2.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C30114b f122945x;

                {
                    this.f122945x = c30114b;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return C30114b.m92253I(this.f122945x, (AbstractC31179a) obj);
                        default:
                            return C30114b.m92254J(this.f122945x, (AbstractC33673a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC36981a.m118720g(c34720aM92252H, function1, (Function1) objM87133R3, c28655q, i14, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: H */
    private static final C34720a m92252H(InterfaceC28670t2 interfaceC28670t2) {
        return (C34720a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m92253I(C30114b c30114b, AbstractC31179a event) {
        AbstractC22676k.m65750j(event, "event");
        c30114b.m92257C().m95912a(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m92254J(C30114b c30114b, AbstractC33673a event) {
        AbstractC22676k.m65750j(event, "event");
        c30114b.m92249D().m106417a(event);
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    /* JADX INFO: renamed from: C */
    public final C31180b m92257C() {
        return (C31180b) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: E */
    public final C38139a m92258E() {
        return (C38139a) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 23), true, -303571372));
    }
}
