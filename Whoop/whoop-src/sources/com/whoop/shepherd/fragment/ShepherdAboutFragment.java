package com.whoop.shepherd.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ld2.C23866a;
import mw1.C25985a;
import nr0.C27072e;
import o02.InterfaceC27353d;
import oe2.C27876a;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pd2.InterfaceC29106b;
import pe2.AbstractC29117a;
import pe2.C29118b;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qd2.AbstractC30295a;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lcom/whoop/shepherd/fragment/ShepherdAboutFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "x", "getNavigatorReducer", "()Lo02/d;", "navigatorReducer", "Lld2/a;", "y", "B", "()Lld2/a;", "analytics", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShepherdAboutFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigatorReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdAboutFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10180a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30754w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30755x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30756y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10180a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30754w = componentCallbacks;
            this.f30755x = interfaceC35951a;
            this.f30756y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30754w;
            InterfaceC35951a interfaceC35951a = this.f30755x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30756y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdAboutFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10181b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30757w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30758x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30759y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10181b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30757w = componentCallbacks;
            this.f30758x = interfaceC35951a;
            this.f30759y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f30757w;
            InterfaceC35951a interfaceC35951a = this.f30758x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30759y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdAboutFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10182c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30760w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30761x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30762y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10182c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30760w = componentCallbacks;
            this.f30761x = interfaceC35951a;
            this.f30762y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ld2.a] */
        @Override // c93.InterfaceC4339a
        public final C23866a invoke() {
            ComponentCallbacks componentCallbacks = this.f30760w;
            InterfaceC35951a interfaceC35951a = this.f30761x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30762y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23866a.class), interfaceC35951a);
        }
    }

    public ShepherdAboutFragment() {
        C27072e c27072e = new C27072e(this, 12);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10180a(this, null, c27072e));
        this.navigatorReducer = AbstractC30060g.m92087G(enumC23463i, new C10181b(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10182c(this, null, null));
    }

    /* JADX INFO: renamed from: B */
    private final C23866a m25840B() {
        return (C23866a) this.analytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m25841C(ShepherdAboutFragment shepherdAboutFragment) {
        return AbstractC15751g.m44431K(shepherdAboutFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m25842D(ShepherdAboutFragment shepherdAboutFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(shepherdAboutFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29118b(abstractC12939a0, (InterfaceC14515a) AbstractC29125c.m88492A(shepherdAboutFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), shepherdAboutFragment.getNavigator());
                c28655q.m87172p0(objM87133R2);
            }
            C29118b c29118b = (C29118b) objM87133R2;
            C23866a c23866aM25840B = shepherdAboutFragment.m25840B();
            boolean zM87157i = c28655q.m87157i(abstractC12939a0) | c28655q.m87157i(c29118b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C27876a(abstractC12939a0, c29118b, 0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC30295a.m92591u(c23866aM25840B, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m25843E(AbstractC12939a0 abstractC12939a0, C29118b c29118b, InterfaceC29106b.c navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC29106b.a.f117774a)) {
            abstractC12939a0.m36410z();
        } else if (navEvent.equals(InterfaceC29106b.e.f117778a)) {
            c29118b.m88488a(new AbstractC29117a.e("Shepherd about"));
        } else if (navEvent instanceof InterfaceC29106b.d) {
            c29118b.m88488a(new AbstractC29117a.c(((InterfaceC29106b.d) navEvent).getNavAction()));
        } else {
            if (!(navEvent instanceof InterfaceC29106b.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c29118b.m88488a(new AbstractC29117a.g(((InterfaceC29106b.f) navEvent).getNavAction()));
        }
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
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 28), true, 421971762));
    }
}
