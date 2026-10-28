package com.whoop.membership.view.upcycle;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.membership.view.upcycle.UpcycleLandingFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.view.edit.C9790n;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import org.xmlpull.v1.XmlPullParserException;
import ox1.AbstractC28453a;
import ox1.C28454b;
import p003a1.C0111j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
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
import px1.InterfaceC29597a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qx1.InterfaceC30758e;
import r83.EnumC31071a;
import rx1.C31903a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006&²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/membership/view/upcycle/UpcycleLandingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lrx1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lrx1/a;", "viewModel", "Lcom/whoop/membership/view/upcycle/a;", "x", "D", "()Lcom/whoop/membership/view/upcycle/a;", "analyticsHelper", "Lox1/b;", "y", "E", "()Lox1/b;", "navRouter", "Lqx1/e;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UpcycleLandingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9143e(this, null, new C9142d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: com.whoop.membership.view.upcycle.UpcycleLandingFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.view.upcycle.UpcycleLandingFragment$onCreateView$1$1$1", m100430f = "UpcycleLandingFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9139a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27344w;

        public C9139a(InterfaceC30057d<? super C9139a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return UpcycleLandingFragment.this.new C9139a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9139a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27344w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            UpcycleLandingFragment.this.m22865F().m99184o(InterfaceC29597a.a.f120845a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.view.upcycle.UpcycleLandingFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9140b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27346w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27347x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27348y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9140b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27346w = componentCallbacks;
            this.f27347x = interfaceC35951a;
            this.f27348y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.membership.view.upcycle.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C9144a invoke() {
            ComponentCallbacks componentCallbacks = this.f27346w;
            InterfaceC35951a interfaceC35951a = this.f27347x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27348y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9144a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.view.upcycle.UpcycleLandingFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9141c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27350x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27351y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9141c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27349w = componentCallbacks;
            this.f27350x = interfaceC35951a;
            this.f27351y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ox1.b] */
        @Override // c93.InterfaceC4339a
        public final C28454b invoke() {
            ComponentCallbacks componentCallbacks = this.f27349w;
            InterfaceC35951a interfaceC35951a = this.f27350x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27351y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28454b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.view.upcycle.UpcycleLandingFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9142d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27352w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9142d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27352w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27352w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.view.upcycle.UpcycleLandingFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9143e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27353w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27354x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27355y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27356z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9143e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27353w = componentCallbacks;
            this.f27354x = interfaceC35951a;
            this.f27355y = interfaceC4339a;
            this.f27356z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rx1.a] */
        @Override // c93.InterfaceC4339a
        public final C31903a invoke() {
            return AbstractC34132o.m107857B(this.f27353w, this.f27354x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31903a.class), this.f27355y, this.f27356z);
        }
    }

    public UpcycleLandingFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C9140b(this, null, null));
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C9141c(this, null, new C0111j(this, 28)));
    }

    /* JADX INFO: renamed from: D */
    private final C9144a m22855D() {
        return (C9144a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C28454b m22856E() {
        return (C28454b) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C34911a m22857G(UpcycleLandingFragment upcycleLandingFragment) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(upcycleLandingFragment), upcycleLandingFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22858H(final UpcycleLandingFragment upcycleLandingFragment, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(upcycleLandingFragment.m22865F().getViewState(), InterfaceC30758e.b.f126629a, null, c28655q, 48, 2);
        boolean zM87157i = c28655q.m87157i(upcycleLandingFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = upcycleLandingFragment.new C9139a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        InterfaceC30758e interfaceC30758eM22859I = m22859I(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(upcycleLandingFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            final int i14 = 0;
            objM87133R2 = new Function1(upcycleLandingFragment) { // from class: cy1.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ UpcycleLandingFragment f35875x;

                {
                    this.f35875x = upcycleLandingFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return UpcycleLandingFragment.m22860J(this.f35875x, (InterfaceC29597a) obj);
                        default:
                            return UpcycleLandingFragment.m22862L(this.f35875x, (AbstractC28453a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(upcycleLandingFragment);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = new C9790n(5, interfaceC28601c1M87260n, upcycleLandingFragment);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function2 = (Function1) objM87133R3;
        boolean zM87157i3 = c28655q.m87157i(upcycleLandingFragment);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87157i3 || objM87133R4 == c28676v0) {
            final int i15 = 1;
            objM87133R4 = new Function1(upcycleLandingFragment) { // from class: cy1.a

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ UpcycleLandingFragment f35875x;

                {
                    this.f35875x = upcycleLandingFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return UpcycleLandingFragment.m22860J(this.f35875x, (InterfaceC29597a) obj);
                        default:
                            return UpcycleLandingFragment.m22862L(this.f35875x, (AbstractC28453a) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC9145b.m22882o(interfaceC30758eM22859I, function1, function2, (Function1) objM87133R4, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: I */
    private static final InterfaceC30758e m22859I(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC30758e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22860J(UpcycleLandingFragment upcycleLandingFragment, InterfaceC29597a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        upcycleLandingFragment.m22865F().m99184o(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m22861K(InterfaceC28670t2 interfaceC28670t2, UpcycleLandingFragment upcycleLandingFragment, C9144a.b analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        InterfaceC30758e interfaceC30758eM22859I = m22859I(interfaceC28670t2);
        InterfaceC30758e.c cVar = interfaceC30758eM22859I instanceof InterfaceC30758e.c ? (InterfaceC30758e.c) interfaceC30758eM22859I : null;
        if (cVar != null) {
            upcycleLandingFragment.m22855D().m22866a(cVar, analyticEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m22862L(UpcycleLandingFragment upcycleLandingFragment, AbstractC28453a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        upcycleLandingFragment.m22856E().m86261a(navigationEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public final C31903a m22865F() {
        return (C31903a) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 14), true, 1874260197));
    }
}
