package com.whoop.whattoexpect.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import gw2.C16269a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kw2.C22872a;
import kw2.InterfaceC22873b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lw2.C24777b;
import lw2.C24778c;
import lw2.InterfaceC24776a;
import mw1.C25985a;
import no0.C26944e0;
import nr0.C27072e;
import or2.AbstractC28163g0;
import ow2.AbstractC28440c;
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
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!¨\u0006%²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/whattoexpect/view/WhatToExpectFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Llw2/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Llw2/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lgw2/a;", "y", "D", "()Lgw2/a;", "analytics", "Llw2/c;", "viewState", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhatToExpectFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10806e(this, null, new C10805d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: com.whoop.whattoexpect.view.WhatToExpectFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.whattoexpect.view.WhatToExpectFragment$onCreateView$1$1$1", m100430f = "WhatToExpectFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10802a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33090w;

        public C10802a(InterfaceC30057d<? super C10802a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return WhatToExpectFragment.this.new C10802a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10802a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33090w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            WhatToExpectFragment.this.m28402E().m72622n(new InterfaceC24776a.a(true));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whattoexpect.view.WhatToExpectFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10803b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33092w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33093x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33094y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10803b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33092w = componentCallbacks;
            this.f33093x = interfaceC35951a;
            this.f33094y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f33092w;
            InterfaceC35951a interfaceC35951a = this.f33093x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f33094y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whattoexpect.view.WhatToExpectFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10804c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33095w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33096x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33097y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10804c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f33095w = componentCallbacks;
            this.f33096x = interfaceC35951a;
            this.f33097y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gw2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16269a invoke() {
            ComponentCallbacks componentCallbacks = this.f33095w;
            InterfaceC35951a interfaceC35951a = this.f33096x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f33097y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16269a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whattoexpect.view.WhatToExpectFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10805d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33098w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10805d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f33098w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f33098w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whattoexpect.view.WhatToExpectFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10806e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f33099w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f33100x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f33101y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f33102z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10806e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f33099w = componentCallbacks;
            this.f33100x = interfaceC35951a;
            this.f33101y = interfaceC4339a;
            this.f33102z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, lw2.b] */
        @Override // c93.InterfaceC4339a
        public final C24777b invoke() {
            return AbstractC34132o.m107857B(this.f33099w, this.f33100x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24777b.class), this.f33101y, this.f33102z);
        }
    }

    public WhatToExpectFragment() {
        C27072e c27072e = new C27072e(this, 4);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10803b(this, null, c27072e));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10804c(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C16269a m28401D() {
        return (C16269a) this.analytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C24777b m28402E() {
        return (C24777b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C34911a m28403F(WhatToExpectFragment whatToExpectFragment) {
        return AbstractC15751g.m44431K(whatToExpectFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m28404G(WhatToExpectFragment whatToExpectFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        C22872a c22872a = new C22872a(AbstractC5583n.m16799z(whatToExpectFragment), whatToExpectFragment.getNavigator(), whatToExpectFragment.m28401D());
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(whatToExpectFragment.m28402E().getViewState(), new C24778c(false, false, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), null, c28655q, 0, 2);
        boolean zM87157i = c28655q.m87157i(whatToExpectFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = whatToExpectFragment.new C10802a(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        C24778c c24778cM28405H = m28405H(interfaceC28601c1M87260n);
        boolean zM87157i2 = c28655q.m87157i(whatToExpectFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C26944e0(whatToExpectFragment, 5);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function1 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c22872a);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C26944e0(c22872a, 6);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28440c.m86176d(c24778cM28405H, function1, (Function1) objM87133R3, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: renamed from: H */
    private static final C24778c m28405H(InterfaceC28670t2 interfaceC28670t2) {
        return (C24778c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m28406I(WhatToExpectFragment whatToExpectFragment, InterfaceC24776a it) {
        AbstractC22676k.m65750j(it, "it");
        whatToExpectFragment.m28402E().m72622n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m28407J(C22872a c22872a, InterfaceC22873b it) {
        AbstractC22676k.m65750j(it, "it");
        c22872a.m66455a(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 21), true, 1287095316));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
