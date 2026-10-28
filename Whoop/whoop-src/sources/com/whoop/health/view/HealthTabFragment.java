package com.whoop.health.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bj1.C3330a;
import bj1.C3332c;
import c93.InterfaceC4339a;
import cj1.InterfaceC4751g;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eg.C13161j;
import ej1.AbstractC13257t;
import ej1.C13242h;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21138e;
import j02.InterfaceC21136d;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p078d1.C11456i;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lcom/whoop/health/view/HealthTabFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "isNavBarVisible", "Ll83/a0;", "H", "(Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lbj1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Lbj1/c;", "navRouter", "Lbj1/a;", "x", "C", "()Lbj1/a;", "healthTabActionRouter", "Lj02/e;", "y", "B", "()Lj02/e;", "bffBottomNavTabEventPublisher", "Ltr2/n;", "z", "Ltr2/n;", "logger", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HealthTabFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h healthTabActionRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h bffBottomNavTabEventPublisher;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.health.view.HealthTabFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8778a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26168w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26169x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8778a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26168w = componentCallbacks;
            this.f26169x = interfaceC35951a;
            this.f26170y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bj1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3332c invoke() {
            ComponentCallbacks componentCallbacks = this.f26168w;
            InterfaceC35951a interfaceC35951a = this.f26169x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26170y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3332c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.health.view.HealthTabFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8779b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26171w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26172x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8779b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26171w = componentCallbacks;
            this.f26172x = interfaceC35951a;
            this.f26173y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bj1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3330a invoke() {
            ComponentCallbacks componentCallbacks = this.f26171w;
            InterfaceC35951a interfaceC35951a = this.f26172x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26173y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3330a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.health.view.HealthTabFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8780c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26174w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26175x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26176y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8780c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26174w = componentCallbacks;
            this.f26175x = interfaceC35951a;
            this.f26176y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21138e invoke() {
            ComponentCallbacks componentCallbacks = this.f26174w;
            InterfaceC35951a interfaceC35951a = this.f26175x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26176y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21138e.class), interfaceC35951a);
        }
    }

    public HealthTabFragment() {
        C11456i c11456i = new C11456i(this, 16);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C8778a(this, null, c11456i));
        this.healthTabActionRouter = AbstractC30060g.m92087G(enumC23463i, new C8779b(this, null, null));
        this.bffBottomNavTabEventPublisher = AbstractC30060g.m92087G(enumC23463i, new C8780c(this, null, null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HealthTabFragment");
    }

    /* JADX INFO: renamed from: B */
    private final C21138e m21512B() {
        return (C21138e) this.bffBottomNavTabEventPublisher.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C3330a m21513C() {
        return (C3330a) this.healthTabActionRouter.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C3332c m21514D() {
        return (C3332c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m21515E(HealthTabFragment healthTabFragment) {
        return AbstractC15751g.m44431K(healthTabFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m21516F(HealthTabFragment healthTabFragment, Composer composer, int i13) {
        String strM85315e;
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = healthTabFragment.getArguments();
            if (arguments == null || (string = arguments.getString("source")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) {
                strM85315e = "bottom_navigation";
            }
            String str = strM85315e;
            C3332c c3332cM21514D = healthTabFragment.m21514D();
            C3330a c3330aM21513C = healthTabFragment.m21513C();
            InterfaceC4751g.k kVar = new InterfaceC4751g.k(str, null, null, 6, null);
            boolean zM87157i = c28655q.m87157i(healthTabFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C13161j(healthTabFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC13257t.m37271f(kVar, c3332cM21514D, c3330aM21513C, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m21517G(HealthTabFragment healthTabFragment, boolean z4) {
        healthTabFragment.m21518H(!z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private final void m21518H(boolean isNavBarVisible) {
        getActivity();
        m21512B().m58980c(new InterfaceC21136d.a(!isNavBarVisible));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        AbstractC28163g0.m85250f(this, this.logger);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C13242h(this, 0), true, -653452134));
    }
}
