package com.whoop.homecustomization.view.legacy;

import a80.C0542f;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bn1.C3498a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.homecustomization.view.legacy.HomeCustomizationFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hn1.AbstractC17518d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import jn1.AbstractC21803b;
import jn1.AbstractC21805d;
import jn1.C21804c;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mn1.AbstractC25717h;
import mn1.C25710a;
import mn1.C25715f;
import p163g1.EnumC15209z3;
import p291l0.InterfaceC23013y;
import p329n0.AbstractC26071x;
import p329n0.C26068u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006#²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/homecustomization/view/legacy/HomeCustomizationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lhn1/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "D", "(Lhn1/d;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ljn1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Ljn1/c;", "viewModel", "Lbn1/a;", "x", "E", "()Lbn1/a;", "analyticsHelper", "Ljn1/d;", "viewState", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HomeCustomizationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8866c(this, null, new C8865b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8864a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.legacy.HomeCustomizationFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8864a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26607w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26608x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26609y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8864a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26607w = componentCallbacks;
            this.f26608x = interfaceC35951a;
            this.f26609y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bn1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3498a invoke() {
            ComponentCallbacks componentCallbacks = this.f26607w;
            InterfaceC35951a interfaceC35951a = this.f26608x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26609y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3498a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.legacy.HomeCustomizationFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8865b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26610w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8865b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26610w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26610w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.legacy.HomeCustomizationFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8866c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26611w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26612x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26613y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26614z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8866c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26611w = componentCallbacks;
            this.f26612x = interfaceC35951a;
            this.f26613y = interfaceC4339a;
            this.f26614z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, jn1.c] */
        @Override // c93.InterfaceC4339a
        public final C21804c invoke() {
            return AbstractC34132o.m107857B(this.f26611w, this.f26612x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21804c.class), this.f26613y, this.f26614z);
        }
    }

    /* JADX INFO: renamed from: D */
    private final void m21910D(AbstractC17518d event) {
        if (AbstractC22676k.m65745e(event, AbstractC17518d.a.f67753a)) {
            AbstractC5583n.m16799z(this).m36410z();
        }
    }

    /* JADX INFO: renamed from: E */
    private final C3498a m21911E() {
        return (C3498a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final C21804c m21912F() {
        return (C21804c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m21913G(HomeCustomizationFragment homeCustomizationFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(homeCustomizationFragment.m21912F().getViewState(), AbstractC21805d.b.f84050a, null, c28655q, 48, 2);
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57107x;
            boolean zM87157i = c28655q.m87157i(homeCustomizationFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C25715f(homeCustomizationFragment, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(AbstractC1118c.m3460c(enumC15209z3, null, (Function1) objM87133R, false, c28655q, 3078, 2)), null, null, null, null, AbstractC37817c.m121344e(-2109105079, c28655q, new C0542f(AbstractC26071x.m77569a(0, 0, c28655q, 3), homeCustomizationFragment, interfaceC28601c1M87260n, 28)), false, null, null, null, false, null, C25710a.f101260a.m75713b(), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16249);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final AbstractC21805d m21914H(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC21805d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final boolean m21915I(HomeCustomizationFragment homeCustomizationFragment, EnumC15209z3 it) {
        AbstractC22676k.m65750j(it, "it");
        if (it != EnumC15209z3.f57106w) {
            return true;
        }
        homeCustomizationFragment.m21911E().m10326c();
        AbstractC5583n.m16799z(homeCustomizationFragment).m36410z();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m21916J(C26068u c26068u, HomeCustomizationFragment homeCustomizationFragment, InterfaceC28670t2 interfaceC28670t2, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC21805d abstractC21805dM21914H = m21914H(interfaceC28670t2);
            boolean zM87157i = c28655q.m87157i(homeCustomizationFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C25715f(homeCustomizationFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(homeCustomizationFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25715f(homeCustomizationFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25717h.m75778n(abstractC21805dM21914H, c26068u, function1, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m21917K(HomeCustomizationFragment homeCustomizationFragment, AbstractC21803b it) {
        AbstractC22676k.m65750j(it, "it");
        homeCustomizationFragment.m21912F().m61718n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m21918L(HomeCustomizationFragment homeCustomizationFragment, AbstractC17518d it) {
        AbstractC22676k.m65750j(it, "it");
        homeCustomizationFragment.m21910D(it);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        Bundle arguments = getArguments();
        m21912F().m61718n(new AbstractC21803b.b(arguments != null ? arguments.getBoolean("showOnboarding") : false));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: mn1.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return HomeCustomizationFragment.m21913G(this.f101300w, (Composer) obj, iIntValue);
            }
        }, true, -1610466021));
    }
}
