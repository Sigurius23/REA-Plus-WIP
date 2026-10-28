package com.whoop.healthmonitor.view;

import ak1.C0950c;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import c93.InterfaceC4339a;
import ci0.C4726a;
import cj2.C4769a;
import ck1.AbstractC4787j;
import ck1.AbstractC4788k;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.File;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28176k1;
import p003a1.C0111j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import vj1.AbstractC36068a;
import vj1.C36069b;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006+²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ljava/io/File;", "file", "Ll83/a0;", "K", "(Ljava/io/File;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lak1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lak1/c;", "viewModel", "Lor2/k1;", "x", "D", "()Lor2/k1;", "shareUtil", "Lvj1/b;", "y", "C", "()Lvj1/b;", "analyticHelper", "Lck1/k;", "viewState", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ComposableHealthReportFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8796d(this, null, new C8795c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h shareUtil;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticHelper;

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthReportFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8793a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26227w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26228x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8793a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26227w = componentCallbacks;
            this.f26228x = interfaceC35951a;
            this.f26229y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.k1] */
        @Override // c93.InterfaceC4339a
        public final C28176k1 invoke() {
            ComponentCallbacks componentCallbacks = this.f26227w;
            InterfaceC35951a interfaceC35951a = this.f26228x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26229y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28176k1.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthReportFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8794b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26230w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26231x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8794b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26230w = componentCallbacks;
            this.f26231x = interfaceC35951a;
            this.f26232y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vj1.b] */
        @Override // c93.InterfaceC4339a
        public final C36069b invoke() {
            ComponentCallbacks componentCallbacks = this.f26230w;
            InterfaceC35951a interfaceC35951a = this.f26231x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26232y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36069b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthReportFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8795c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26233w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8795c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f26233w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f26233w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f26233w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthReportFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8796d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f26234w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26235x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26236y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26237z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8796d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26234w = abstractComponentCallbacksC1320m0;
            this.f26235x = interfaceC35951a;
            this.f26236y = interfaceC4339a;
            this.f26237z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ak1.c, androidx.lifecycle.w1] */
        @Override // c93.InterfaceC4339a
        public final C0950c invoke() {
            return AbstractC37056f.m118952D(this.f26234w, this.f26235x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0950c.class), this.f26236y, this.f26237z);
        }
    }

    public ComposableHealthReportFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.shareUtil = AbstractC30060g.m92087G(enumC23463i, new C8793a(this, null, null));
        this.analyticHelper = AbstractC30060g.m92087G(enumC23463i, new C8794b(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C36069b m21594C() {
        return (C36069b) this.analyticHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C28176k1 m21595D() {
        return (C28176k1) this.shareUtil.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C0950c m21596E() {
        return (C0950c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m21597F(ComposableHealthReportFragment composableHealthReportFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC4788k abstractC4788kM21598G = m21598G(AbstractC28683x.m87261o(composableHealthReportFragment.m21596E().getHealthReportViewState(), c28655q, 0));
            boolean zM87157i = c28655q.m87157i(composableHealthReportFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C0111j(composableHealthReportFragment, 17);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(composableHealthReportFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4780c(composableHealthReportFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C4769a(11);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC4787j.m15113g(abstractC4788kM21598G, interfaceC4339a, function1, (Function1) objM87133R3, c28655q, 3072, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final AbstractC4788k m21598G(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC4788k) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m21599H(ComposableHealthReportFragment composableHealthReportFragment) {
        AbstractC5583n.m16799z(composableHealthReportFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m21600I(ComposableHealthReportFragment composableHealthReportFragment, File file) {
        AbstractC22676k.m65750j(file, "file");
        composableHealthReportFragment.m21602K(file);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m21601J(String str) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private final void m21602K(File file) {
        m21594C().m114549a(AbstractC36068a.e.f154038b);
        C28176k1 c28176k1M21595D = m21595D();
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        c28176k1M21595D.m85290a(file, contextRequireContext, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        super.onDestroyView();
        m21594C().m114549a(AbstractC36068a.a.f154031b);
        m21596E().m2394l();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        m21596E().m2395n();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 2), true, 761262014));
    }
}
