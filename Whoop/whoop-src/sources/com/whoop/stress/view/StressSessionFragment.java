package com.whoop.stress.view;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import aq0.C1904o;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.stress.domain.BreathingEvent;
import com.whoop.stress.view.StressSessionFragment;
import e93.AbstractC12889b;
import fj2.C14543a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj2.AbstractC24479e;
import lj2.AbstractC24480f;
import lj2.C24481g;
import nj2.C26761h;
import nj2.C26764k;
import nj2.C26770q;
import nj2.C26773t;
import nj2.EnumC26772s;
import no0.C26954j0;
import oe2.C27878c;
import os0.C28308d;
import p000.AbstractC11266d;
import p040c0.InterfaceC3764o;
import p114eb.C12962i;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
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
import pj2.AbstractC29318q;
import pj2.AbstractC29319r;
import pj2.AbstractC29321t;
import pj2.C29322u;
import pj2.C29323v;
import pj2.C29324w;
import pj2.C29326y;
import q83.AbstractC30060g;
import rj2.C31490b;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b2\u0010%R\"\u00106\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/stress/view/StressSessionFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "N", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lpj2/y;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leb/i;", "d0", "()Lpj2/y;", "args", "Lrj2/b;", "x", "Ll83/h;", "f0", "()Lrj2/b;", "viewModel", "Lfj2/a;", "y", "c0", "()Lfj2/a;", "analyticsManager", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "z", "e0", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lj/d;", "Landroid/content/Intent;", "E", "Lj/d;", "activityResultLauncher", "F", "b0", "analytics", "kotlin.jvm.PlatformType", "G", "videoActivityResultLauncher", "Lnj2/t;", "viewState", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StressSessionFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final AbstractC21065d videoActivityResultLauncher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29326y.class), new C10371d(this));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: com.whoop.stress.view.StressSessionFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10368a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31319w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31320x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31321y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10368a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31319w = componentCallbacks;
            this.f31320x = interfaceC35951a;
            this.f31321y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fj2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14543a invoke() {
            ComponentCallbacks componentCallbacks = this.f31319w;
            InterfaceC35951a interfaceC35951a = this.f31320x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31321y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14543a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressSessionFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10369b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31322w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31323x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31324y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10369b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31322w = componentCallbacks;
            this.f31323x = interfaceC35951a;
            this.f31324y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31322w;
            InterfaceC35951a interfaceC35951a = this.f31323x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31324y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressSessionFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10370c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31325w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31326x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31327y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10370c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31325w = componentCallbacks;
            this.f31326x = interfaceC35951a;
            this.f31327y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fj2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14543a invoke() {
            ComponentCallbacks componentCallbacks = this.f31325w;
            InterfaceC35951a interfaceC35951a = this.f31326x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31327y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14543a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressSessionFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10371d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f31328w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10371d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f31328w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f31328w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f31328w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressSessionFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10372e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31329w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10372e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31329w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31329w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.stress.view.StressSessionFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10373f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31330w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31331x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31332y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31333z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10373f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31330w = componentCallbacks;
            this.f31331x = interfaceC35951a;
            this.f31332y = interfaceC4339a;
            this.f31333z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, rj2.b] */
        @Override // c93.InterfaceC4339a
        public final C31490b invoke() {
            return AbstractC34132o.m107857B(this.f31330w, this.f31331x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31490b.class), this.f31332y, this.f31333z);
        }
    }

    public StressSessionFragment() {
        C29322u c29322u = new C29322u(this, 0);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10373f(this, null, new C10372e(this), c29322u));
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsManager = AbstractC30060g.m92087G(enumC23463i, new C10368a(this, null, null));
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C10369b(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10370c(this, null, null));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new C1904o(this, 10));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.videoActivityResultLauncher = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: N */
    private final void m26446N(Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1507385284);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(this) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m26464f0().getViewState(), new C26773t(true, false, null, null, null, null, null, 126, null), null, c28655q2, 0, 2);
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("StressSessionNavHost", null, c28655q2, 6, 2);
            String strM89244a = m26462d0().m89244a();
            AbstractC22676k.m65749i(strM89244a, "getSessionType(...)");
            C24481g c24481g = new C24481g(strM89244a, m26464f0(), m26461c0(), c12991u0M58963a, this, m26463e0());
            boolean zM87153g = c28655q2.m87153g(interfaceC28601c1M87260n) | c28655q2.m87157i(this) | c28655q2.m87157i(c24481g);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C26954j0(this, c24481g, interfaceC28601c1M87260n, 12);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC17269i.m48886d(c12991u0M58963a, "HOME", null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, 0, 1020);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(this, i13, 8);
        }
    }

    /* JADX INFO: renamed from: O */
    private static final C26773t m26447O(InterfaceC28670t2 interfaceC28670t2) {
        return (C26773t) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26448P(StressSessionFragment stressSessionFragment, final C24481g c24481g, final InterfaceC28670t2 interfaceC28670t2, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36290t(NavHost, "HOME", null, null, null, null, null, new C37816b(new C29324w(stressSessionFragment, c24481g, interfaceC28670t2), true, 1195170177), 254);
        AbstractC12889b.m36290t(NavHost, "SESSION", null, null, null, null, null, new C37816b(new C29324w(c24481g, stressSessionFragment, interfaceC28670t2), true, 689388906), 254);
        final int i13 = 0;
        AbstractC12889b.m36290t(NavHost, "DISCLAIMER", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: pj2.x
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return StressSessionFragment.m26455W(interfaceC28670t2, c24481g, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return StressSessionFragment.m26457Y(interfaceC28670t2, c24481g, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, 274062089), 254);
        final int i14 = 1;
        AbstractC12889b.m36290t(NavHost, "DISCLAIMER/{CYCLE}/{SPEED}", null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: pj2.x
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return StressSessionFragment.m26455W(interfaceC28670t2, c24481g, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return StressSessionFragment.m26457Y(interfaceC28670t2, c24481g, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, -141264728), 254);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m26449Q(StressSessionFragment stressSessionFragment, C24481g c24481g, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C26770q c26770qM79783d = m26447O(interfaceC28670t2).getDetails();
        boolean z4 = m26447O(interfaceC28670t2).getDisclaimerScreen() != null;
        boolean zM79788i = m26447O(interfaceC28670t2).getIsLoading();
        boolean zM79787h = m26447O(interfaceC28670t2).getIsError();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(stressSessionFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C29322u(stressSessionFragment, 2);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c24481g);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C29323v(c24481g, 0);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29318q.m89101F0(c26770qM79783d, z4, zM79788i, zM79787h, interfaceC4339a, (Function1) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26450R(StressSessionFragment stressSessionFragment) {
        AbstractC5583n.m16799z(stressSessionFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26451S(C24481g c24481g, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c24481g.m71257a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m26452T(C24481g c24481g, StressSessionFragment stressSessionFragment, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C26764k c26764kM79785f = m26447O(interfaceC28670t2).getIntervention();
        List<BreathingEvent> listM79782c = m26447O(interfaceC28670t2).m79782c();
        EnumC26772s enumC26772sM79786g = m26447O(interfaceC28670t2).getInterventionSavingState();
        boolean zM79787h = m26447O(interfaceC28670t2).getIsError();
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c24481g);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C29323v(c24481g, 3);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(stressSessionFragment);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C29322u(stressSessionFragment, 1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29321t.m89193D(c26764kM79785f, listM79782c, enumC26772sM79786g, zM79787h, function1, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m26453U(C24481g c24481g, AbstractC24480f it) {
        AbstractC22676k.m65750j(it, "it");
        c24481g.m71257a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m26454V(StressSessionFragment stressSessionFragment) {
        AbstractC5583n.m16799z(stressSessionFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m26455W(InterfaceC28670t2 interfaceC28670t2, C24481g c24481g, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C26761h c26761hM79784e = m26447O(interfaceC28670t2).getDisclaimerScreen();
        if (c26761hM79784e == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-149083968);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-149083967);
            boolean zM87157i = c28655q2.m87157i(c24481g);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29323v(c24481g, 1);
                c28655q2.m87172p0(objM87133R);
            }
            int i14 = TextResource.$stable;
            AbstractC29319r.m89186d(c26761hM79784e, null, null, (Function1) objM87133R, c28655q2, AbstractC22403o.f87638a | i14 | i14 | i14 | i14 | i14, 6);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m26456X(C24481g c24481g, AbstractC24479e event) {
        AbstractC22676k.m65750j(event, "event");
        c24481g.m71257a(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m26457Y(InterfaceC28670t2 interfaceC28670t2, C24481g c24481g, InterfaceC3764o composable, C12982q backStackEntry, Composer composer, int i13) {
        String string;
        String string2;
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C26761h c26761hM79784e = m26447O(interfaceC28670t2).getDisclaimerScreen();
        if (c26761hM79784e == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(650515423);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(650515424);
            Bundle bundleM36479a = backStackEntry.m36479a();
            String str = (bundleM36479a == null || (string2 = bundleM36479a.getString("SPEED")) == null) ? "" : string2;
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            String str2 = (bundleM36479a2 == null || (string = bundleM36479a2.getString("CYCLE")) == null) ? "" : string;
            boolean zM87157i = c28655q2.m87157i(c24481g);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29323v(c24481g, 2);
                c28655q2.m87172p0(objM87133R);
            }
            int i14 = TextResource.$stable;
            AbstractC29319r.m89186d(c26761hM79784e, str, str2, (Function1) objM87133R, c28655q2, AbstractC22403o.f87638a | i14 | i14 | i14 | i14 | i14, 0);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m26458Z(C24481g c24481g, AbstractC24479e event) {
        AbstractC22676k.m65750j(event, "event");
        c24481g.m71257a(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m26459a0(StressSessionFragment stressSessionFragment, int i13, Composer composer, int i14) {
        stressSessionFragment.m26446N(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private final C14543a m26460b0() {
        return (C14543a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private final C14543a m26461c0() {
        return (C14543a) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: d0 */
    private final C29326y m26462d0() {
        return (C29326y) this.args.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    private final FeatureFlagRepository m26463e0() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: f0 */
    private final C31490b m26464f0() {
        return (C31490b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m26465g0(StressSessionFragment stressSessionFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            stressSessionFragment.m26446N(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m26466h0(StressSessionFragment stressSessionFragment, C21062a result) {
        String stringExtra;
        String stringExtra2;
        AbstractC22676k.m65750j(result, "result");
        C14543a c14543aM26460b0 = stressSessionFragment.m26460b0();
        Intent intent = result.f79916x;
        String str = "unknown";
        if (intent == null || (stringExtra = intent.getStringExtra("INTERVENTION")) == null) {
            stringExtra = "unknown";
        }
        c14543aM26460b0.m41538e(stringExtra);
        if (intent == null || !intent.getBooleanExtra("USER_VIEWED_FULL_VIDEO", false)) {
            return;
        }
        C14543a c14543aM26460b1 = stressSessionFragment.m26460b0();
        if (intent != null && (stringExtra2 = intent.getStringExtra("INTERVENTION")) != null) {
            str = stringExtra2;
        }
        c14543aM26460b1.m41555x(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C34911a m26467i0(StressSessionFragment stressSessionFragment) {
        return AbstractC15751g.m44431K(stressSessionFragment.m26462d0().m89244a());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activityResultLauncher = this.videoActivityResultLauncher;
        C14543a c14543aM26461c0 = m26461c0();
        String strM89244a = m26462d0().m89244a();
        AbstractC22676k.m65749i(strM89244a, "getSessionType(...)");
        c14543aM26461c0.m41545m(strM89244a);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 17), true, -2089643614));
    }
}
