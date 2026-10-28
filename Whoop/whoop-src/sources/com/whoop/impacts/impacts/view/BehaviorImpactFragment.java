package com.whoop.impacts.impacts.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import gq1.C16081a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
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
import pp2.C29451o;
import q83.AbstractC30060g;
import tq1.AbstractC34082a;
import tq1.C34083b;
import uf3.C34911a;
import uo1.C35141b;
import uq1.AbstractC35161a;
import uq1.AbstractC35163c;
import uq1.C35162b;
import vf3.InterfaceC35951a;
import vv1.C36532c;
import wq1.AbstractC37509c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*¨\u0006.²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroidx/fragment/app/r0;", "activity", "F", "(Landroidx/fragment/app/r0;)V", "Luq1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Luq1/b;", "viewModel", "Lgq1/a;", "x", "C", "()Lgq1/a;", "analyticsHelper", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "D", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Luq1/c;", "viewState", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BehaviorImpactFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8959e(this, null, new C8958d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.impacts.impacts.view.BehaviorImpactFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8955a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26811w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26812x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26813y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8955a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26811w = componentCallbacks;
            this.f26812x = interfaceC35951a;
            this.f26813y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [gq1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C16081a invoke() {
            ComponentCallbacks componentCallbacks = this.f26811w;
            InterfaceC35951a interfaceC35951a = this.f26812x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26813y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16081a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.impacts.impacts.view.BehaviorImpactFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8956b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26814w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26815x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26816y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8956b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26814w = componentCallbacks;
            this.f26815x = interfaceC35951a;
            this.f26816y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26814w;
            InterfaceC35951a interfaceC35951a = this.f26815x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26816y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.impacts.impacts.view.BehaviorImpactFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8957c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26817w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26818x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26819y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8957c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26817w = componentCallbacks;
            this.f26818x = interfaceC35951a;
            this.f26819y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f26817w;
            InterfaceC35951a interfaceC35951a = this.f26818x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26819y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.impacts.impacts.view.BehaviorImpactFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8958d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26820w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8958d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26820w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26820w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.impacts.impacts.view.BehaviorImpactFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8959e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26821w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26822x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26823y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26824z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8959e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26821w = componentCallbacks;
            this.f26822x = interfaceC35951a;
            this.f26823y = interfaceC4339a;
            this.f26824z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, uq1.b] */
        @Override // c93.InterfaceC4339a
        public final C35162b invoke() {
            return AbstractC34132o.m107857B(this.f26821w, this.f26822x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35162b.class), this.f26823y, this.f26824z);
        }
    }

    public BehaviorImpactFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8955a(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8956b(this, null, new C36532c(this, 14)));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C8957c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C16081a m22214C() {
        return (C16081a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final FeatureFlagChecker m22215D() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C35162b m22216E() {
        return (C35162b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C34911a m22217G(BehaviorImpactFragment behaviorImpactFragment) {
        return AbstractC15751g.m44431K(behaviorImpactFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22218H(BehaviorImpactFragment behaviorImpactFragment, C34083b c34083b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC35163c abstractC35163cM22219I = m22219I(AbstractC28683x.m87260n(behaviorImpactFragment.m22216E().getViewState(), AbstractC35163c.b.f149254a, null, c28655q, 48, 2));
            boolean zM87157i = c28655q.m87157i(behaviorImpactFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C35141b(behaviorImpactFragment, 20);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c34083b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C35141b(c34083b, 21);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC37509c.m120245r(abstractC35163cM22219I, function1, (Function1) objM87133R2, behaviorImpactFragment.m22215D().isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final AbstractC35163c m22219I(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC35163c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22220J(BehaviorImpactFragment behaviorImpactFragment, AbstractC35161a it) {
        AbstractC22676k.m65750j(it, "it");
        behaviorImpactFragment.m22216E().m111271n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m22221K(C34083b c34083b, AbstractC34082a it) {
        AbstractC22676k.m65750j(it, "it");
        c34083b.m107739c(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: F */
    public final void m22224F(AbstractActivityC1340r0 activity) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C29451o(26, this, new C34083b(this, m22214C(), getNavigator())), true, 958459620));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m22224F(getActivity());
        m22216E().m111271n(AbstractC35161a.a.f149233a);
        C16081a c16081aM22214C = m22214C();
        C16081a.c cVar = C16081a.c.RECOVERY;
        Bundle arguments = getArguments();
        c16081aM22214C.m45433d("", cVar, arguments != null ? arguments.getString("source") : null);
    }
}
