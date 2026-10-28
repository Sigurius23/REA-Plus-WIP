package com.whoop.weeklyplan.hubandspoke.view;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeFragment;
import d13.AbstractC11478a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import it2.AbstractC20932b;
import it2.C20931a;
import j02.AbstractC21130a1;
import j02.EnumC21172v;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.C23467m;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ls2.AbstractC24716a;
import ls2.C24717b;
import mt2.AbstractC25944e;
import mt2.C25945f;
import nf1.AbstractC26660a;
import nt2.AbstractC27131a;
import nt2.C27133c;
import or2.AbstractC28163g0;
import ot2.AbstractC28344m;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12991u0;
import p114eb.C12997x0;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import pt2.C29532n;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0003R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010<¨\u0006A²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "S", "Leb/a0;", "navController", "Lj02/v;", "dismissalType", "K", "(Leb/a0;Lj02/v;)V", "Lkotlin/Function0;", "popBackStack", "R", "(Leb/a0;Lj02/v;Lc93/a;)V", "Landroid/net/Uri;", "I", "()Landroid/net/Uri;", "", "popUpToDestinationId", "", "usePopUpTo", "Leb/x0;", "H", "(IZ)Leb/x0;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lls2/b;", "x", "E", "()Lls2/b;", "analyticsHelper", "Lit2/a;", "y", "G", "()Lit2/a;", "hubAndSpokeScreenArgs", "Lnt2/c;", "z", "J", "()Lnt2/c;", "viewModel", "a", "Lot2/m;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HubAndSpokeFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: F */
    public static final int f32690F = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h hubAndSpokeScreenArgs;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10723b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32695w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32696x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32697y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10723b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32695w = componentCallbacks;
            this.f32696x = interfaceC35951a;
            this.f32697y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32695w;
            InterfaceC35951a interfaceC35951a = this.f32696x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32697y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10724c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32698w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32699x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32700y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10724c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32698w = componentCallbacks;
            this.f32699x = interfaceC35951a;
            this.f32700y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ls2.b] */
        @Override // c93.InterfaceC4339a
        public final C24717b invoke() {
            ComponentCallbacks componentCallbacks = this.f32698w;
            InterfaceC35951a interfaceC35951a = this.f32699x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32700y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24717b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10725d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32701w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10725d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32701w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32701w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10726e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32702w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32703x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32704y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32705z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10726e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32702w = componentCallbacks;
            this.f32703x = interfaceC35951a;
            this.f32704y = interfaceC4339a;
            this.f32705z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nt2.c] */
        @Override // c93.InterfaceC4339a
        public final C27133c invoke() {
            return AbstractC34132o.m107857B(this.f32702w, this.f32703x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27133c.class), this.f32704y, this.f32705z);
        }
    }

    public HubAndSpokeFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10723b(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10724c(this, null, null));
        EnumC23463i enumC23463i2 = EnumC23463i.f92935y;
        this.hubAndSpokeScreenArgs = AbstractC30060g.m92087G(enumC23463i2, new C29532n(this, 0));
        this.viewModel = AbstractC30060g.m92087G(enumC23463i2, new C10726e(this, null, new C10725d(this), new C29532n(this, 1)));
    }

    /* JADX INFO: renamed from: E */
    private final C24717b m27946E() {
        return (C24717b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final FeatureFlagChecker m27947F() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C20931a m27948G() {
        return (C20931a) this.hubAndSpokeScreenArgs.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C27133c m27949J() {
        return (C27133c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C20931a m27950L(HubAndSpokeFragment hubAndSpokeFragment) {
        return AbstractC20932b.m58112b(hubAndSpokeFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m27951M(HubAndSpokeFragment hubAndSpokeFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(hubAndSpokeFragment.m27949J().getViewState(), AbstractC28344m.e.f114323a, null, c28655q, 48, 2);
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("HubAndSpokeNavHost", null, c28655q, 6, 2);
            C25945f c25945f = new C25945f(c12991u0M58963a, hubAndSpokeFragment.m27946E(), hubAndSpokeFragment.m27948G().getPlanName(), hubAndSpokeFragment.m27948G().getCategory());
            AbstractC28344m abstractC28344mM27952N = m27952N(interfaceC28601c1M87260n);
            C27133c c27133cM27949J = hubAndSpokeFragment.m27949J();
            boolean showMetricSelection = hubAndSpokeFragment.m27948G().getShowMetricSelection();
            boolean zM87157i = c28655q.m87157i(hubAndSpokeFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C29532n(hubAndSpokeFragment, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(hubAndSpokeFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29532n(hubAndSpokeFragment, 3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25944e.m76776t(c27133cM27949J, abstractC28344mM27952N, c12991u0M58963a, c25945f, showMetricSelection, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0, 32);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final AbstractC28344m m27952N(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC28344m) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m27953O(HubAndSpokeFragment hubAndSpokeFragment) {
        hubAndSpokeFragment.m27961K(AbstractC5583n.m16799z(hubAndSpokeFragment), hubAndSpokeFragment.m27948G().getDismissalType());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m27954P(HubAndSpokeFragment hubAndSpokeFragment) {
        hubAndSpokeFragment.m27962R(AbstractC5583n.m16799z(hubAndSpokeFragment), hubAndSpokeFragment.m27948G().getDismissalType(), new C29532n(hubAndSpokeFragment, 4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m27955Q(HubAndSpokeFragment hubAndSpokeFragment) {
        hubAndSpokeFragment.m27963S();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C34911a m27956T(HubAndSpokeFragment hubAndSpokeFragment) {
        return AbstractC15751g.m44431K(hubAndSpokeFragment.m27948G());
    }

    /* JADX INFO: renamed from: H */
    public final C12997x0 m27959H(int popUpToDestinationId, boolean usePopUpTo) {
        if (!usePopUpTo) {
            popUpToDestinationId = -1;
        }
        int i13 = popUpToDestinationId;
        int i14 = AbstractC26660a.f105957b;
        int i15 = AbstractC26660a.f105956a;
        return new C12997x0(true, false, i13, false, false, i14, i15, i14, i15);
    }

    /* JADX INFO: renamed from: I */
    public final Uri m27960I() {
        return Uri.parse(m27947F().isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_HOME_TILE_BEHAVIOR_IMPACTS) ? "android-app://com.whoop/weeklyPlan" : "android-app://com.whoop/coaching?tab=0");
    }

    /* JADX INFO: renamed from: K */
    public final void m27961K(AbstractC12939a0 navController, EnumC21172v dismissalType) {
        AbstractC22676k.m65750j(navController, "navController");
        if (dismissalType == null || !AbstractC9597d.m23114f(navController, dismissalType, null, 2, null)) {
            m27963S();
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m27962R(AbstractC12939a0 navController, EnumC21172v dismissalType, InterfaceC4339a popBackStack) {
        Object objM107888l;
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(popBackStack, "popBackStack");
        Uri uriM27960I = m27960I();
        C12969k0 c12969k0M30854f = AbstractC11478a.m30854f(uriM27960I, "uri", uriM27960I, null, null);
        if (dismissalType != null && AbstractC9597d.m23114f(navController, dismissalType, null, 2, null)) {
            navController.m36404s(c12969k0M30854f);
            return;
        }
        int i13 = navController.m36396k().f44856M;
        try {
            objM107888l = navController.m36392g(i13);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = objM107888l instanceof C23467m;
        boolean z13 = !z4;
        if (z4) {
            for (int i14 = 0; i14 < 2; i14++) {
                popBackStack.invoke();
            }
        }
        navController.m36409x(c12969k0M30854f, m27959H(i13, z13));
    }

    /* JADX INFO: renamed from: S */
    public final void m27963S() {
        C12977n0 c12977n0;
        if (AbstractC28163g0.m85259o(this).m85343i()) {
            return;
        }
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        int i13 = abstractC12939a0M16799z.m36396k().f44856M;
        C12982q c12982qM36393h = abstractC12939a0M16799z.m36393h();
        abstractC12939a0M16799z.m36401p(i13, null, new C12997x0(true, false, (c12982qM36393h == null || (c12977n0 = c12982qM36393h.f44844x) == null) ? i13 : c12977n0.f44819H, true, false, -1, -1, -1, -1));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: pt2.m
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return HubAndSpokeFragment.m27951M(this.f120263w, (Composer) obj, iIntValue);
            }
        }, true, 1744915448));
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
        m27946E().m72377q(new AbstractC24716a.s(m27948G().getCategory(), m27948G().getCarouselPlacement()));
        m27949J().m81595n(AbstractC27131a.d.f108483a);
    }
}
