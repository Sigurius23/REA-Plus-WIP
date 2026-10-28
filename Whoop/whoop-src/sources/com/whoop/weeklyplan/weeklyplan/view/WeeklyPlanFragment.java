package com.whoop.weeklyplan.weeklyplan.view;

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
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ls2.C24717b;
import or2.AbstractC28163g0;
import or2.C28216y;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vt2.AbstractC36497f;
import vt2.C36499h;
import wt2.AbstractC37634o;
import wt2.AbstractC37636q;
import wt2.C37635p;
import yt2.C39773d;
import yt2.C39779j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010-¨\u00061²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lwt2/p;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lwt2/p;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lor2/y;", "y", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lls2/b;", "z", "A", "()Lls2/b;", "analytics", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lwt2/q;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WeeklyPlanFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10737f(this, null, new C10736e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10732a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32733w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32734x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10732a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32733w = componentCallbacks;
            this.f32734x = interfaceC35951a;
            this.f32735y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32733w;
            InterfaceC35951a interfaceC35951a = this.f32734x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32735y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10733b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32737x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10733b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32736w = componentCallbacks;
            this.f32737x = interfaceC35951a;
            this.f32738y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f32736w;
            InterfaceC35951a interfaceC35951a = this.f32737x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32738y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10734c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32739w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32740x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32741y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10734c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32739w = componentCallbacks;
            this.f32740x = interfaceC35951a;
            this.f32741y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ls2.b] */
        @Override // c93.InterfaceC4339a
        public final C24717b invoke() {
            ComponentCallbacks componentCallbacks = this.f32739w;
            InterfaceC35951a interfaceC35951a = this.f32740x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32741y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10735d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32742w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32743x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32744y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10735d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32742w = componentCallbacks;
            this.f32743x = interfaceC35951a;
            this.f32744y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32742w;
            InterfaceC35951a interfaceC35951a = this.f32743x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32744y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10736e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32745w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10736e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32745w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32745w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10737f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32746w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32747x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32748y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32749z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10737f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32746w = componentCallbacks;
            this.f32747x = interfaceC35951a;
            this.f32748y = interfaceC4339a;
            this.f32749z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, wt2.p] */
        @Override // c93.InterfaceC4339a
        public final C37635p invoke() {
            return AbstractC34132o.m107857B(this.f32746w, this.f32747x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37635p.class), this.f32748y, this.f32749z);
        }
    }

    public WeeklyPlanFragment() {
        C39773d c39773d = new C39773d(this, 3);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10732a(this, null, c39773d));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10733b(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10734c(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10735d(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C24717b m28005A() {
        return (C24717b) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C37635p m28006B() {
        return (C37635p) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m28007C(WeeklyPlanFragment weeklyPlanFragment) {
        return AbstractC15751g.m44431K(weeklyPlanFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m28008D(WeeklyPlanFragment weeklyPlanFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(weeklyPlanFragment.m28006B().getViewState(), AbstractC37636q.b.f161161a, null, c28655q, 48, 2);
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("WeeklyPlanFragmentWeeklyPlanFragmentNavHost", null, c28655q, 6, 2);
            C36499h c36499h = new C36499h(weeklyPlanFragment, c12991u0M58963a, AbstractC5583n.m16799z(weeklyPlanFragment), weeklyPlanFragment.getNavigator(), weeklyPlanFragment.getExternalLinkNavigator(), weeklyPlanFragment.m28005A());
            C37635p c37635pM28006B = weeklyPlanFragment.m28006B();
            AbstractC37636q abstractC37636qM28009E = m28009E(interfaceC28601c1M87260n);
            String string = null;
            C24717b c24717bM28005A = weeklyPlanFragment.m28005A();
            Bundle arguments = weeklyPlanFragment.getArguments();
            boolean z4 = arguments != null ? arguments.getBoolean("navigateToPresets") : false;
            Bundle arguments2 = weeklyPlanFragment.getArguments();
            if (arguments2 != null) {
                string = arguments2.getString("scrollId");
            }
            if (string == null) {
                string = "";
            }
            AbstractC36497f.m116988v(c37635pM28006B, c36499h, c12991u0M58963a, abstractC37636qM28009E, c24717bM28005A, z4, string, false, null, null, c28655q, 12582912, 768);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final AbstractC37636q m28009E(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC37636q) interfaceC28670t2.getValue();
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
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
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37635p c37635pM28006B = m28006B();
        Bundle arguments = getArguments();
        c37635pM28006B.m120952r(new AbstractC37634o.c(null, arguments != null ? arguments.getString("source") : null));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C39779j(this, 2), true, 2046020878));
    }
}
