package com.whoop.membership.familyPlan;

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
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.membership.familyPlan.navigation.AbstractC9113a;
import com.whoop.membership.familyPlan.navigation.C9114b;
import com.whoop.membership.familyPlan.navigation.FamilyPlanNavHostDestination;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import lq0.C24656d;
import mi2.C25592o;
import mw1.C25985a;
import mw1.EnumC25986b;
import o02.InterfaceC27353d;
import or2.AbstractC28163g0;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
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
import tw1.C34220a;
import uf3.C34911a;
import uw1.C35313f;
import vf3.InterfaceC35951a;
import ww1.AbstractC37659e;
import ww1.InterfaceC37657c;
import ww1.InterfaceC37660f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006+²\u0006\f\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Luw1/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Luw1/f;", "viewModel", "Lo02/d;", "x", "D", "()Lo02/d;", "baseNavReducer", "Ltw1/a;", "y", "C", "()Ltw1/a;", "actionRouter", "Lmw1/b;", "z", "E", "()Lmw1/b;", "startDestination", "Lcom/whoop/membership/familyPlan/navigation/b;", "navRouter", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FamilyPlanHubFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9099e(this, null, new C9098d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h baseNavReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h startDestination;

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.FamilyPlanHubFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9095a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27219w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27220x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27221y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9095a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27219w = componentCallbacks;
            this.f27220x = interfaceC35951a;
            this.f27221y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.membership.familyPlan.navigation.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C9114b invoke() {
            ComponentCallbacks componentCallbacks = this.f27219w;
            InterfaceC35951a interfaceC35951a = this.f27220x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27221y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9114b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.FamilyPlanHubFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9096b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27222w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27223x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27224y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9096b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27222w = componentCallbacks;
            this.f27223x = interfaceC35951a;
            this.f27224y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f27222w;
            InterfaceC35951a interfaceC35951a = this.f27223x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27224y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.FamilyPlanHubFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9097c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27225w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27226x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27227y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9097c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27225w = componentCallbacks;
            this.f27226x = interfaceC35951a;
            this.f27227y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tw1.a] */
        @Override // c93.InterfaceC4339a
        public final C34220a invoke() {
            ComponentCallbacks componentCallbacks = this.f27225w;
            InterfaceC35951a interfaceC35951a = this.f27226x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27227y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34220a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.FamilyPlanHubFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9098d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27228w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9098d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27228w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27228w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.FamilyPlanHubFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9099e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27229w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27230x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27231y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27232z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9099e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27229w = componentCallbacks;
            this.f27230x = interfaceC35951a;
            this.f27231y = interfaceC4339a;
            this.f27232z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, uw1.f] */
        @Override // c93.InterfaceC4339a
        public final C35313f invoke() {
            return AbstractC34132o.m107857B(this.f27229w, this.f27230x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35313f.class), this.f27231y, this.f27232z);
        }
    }

    public FamilyPlanHubFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.baseNavReducer = AbstractC30060g.m92087G(enumC23463i, new C9096b(this, null, null));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C9097c(this, null, null));
        this.startDestination = AbstractC30060g.m92088H(new C24117a(this, 17));
    }

    /* JADX INFO: renamed from: C */
    private final C34220a m22713C() {
        return (C34220a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC27353d m22714D() {
        return (InterfaceC27353d) this.baseNavReducer.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final EnumC25986b m22715E() {
        return (EnumC25986b) this.startDestination.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final C35313f m22716F() {
        return (C35313f) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m22717G(FamilyPlanHubFragment familyPlanHubFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("FamilyPlanHubNavHost", null, c28655q, 6, 2);
            boolean zM87157i = c28655q.m87157i(familyPlanHubFragment) | c28655q.m87157i(c12991u0M58963a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C25592o(3, familyPlanHubFragment, c12991u0M58963a);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9095a(familyPlanHubFragment, null, (InterfaceC4339a) objM87133R));
            C35313f c35313fM22716F = familyPlanHubFragment.m22716F();
            InterfaceC1585g0 viewLifecycleOwner = familyPlanHubFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            familyPlanHubFragment.m22715E();
            FamilyPlanNavHostDestination.C9111a c9111a = FamilyPlanNavHostDestination.C9111a.f27233a;
            boolean zM87157i2 = c28655q.m87157i(familyPlanHubFragment) | c28655q.m87157i(interfaceC23462hM92087G);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24656d(17, familyPlanHubFragment, interfaceC23462hM92087G);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC9113a.m22740e(c35313fM22716F, c12991u0M58963a, viewLifecycleOwner, c9111a, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C34911a m22718H(FamilyPlanHubFragment familyPlanHubFragment, C12991u0 c12991u0) {
        return AbstractC15751g.m44431K(AbstractC5583n.m16799z(familyPlanHubFragment), c12991u0, familyPlanHubFragment.m22714D(), familyPlanHubFragment.requireActivity());
    }

    /* JADX INFO: renamed from: I */
    private static final C9114b m22719I(InterfaceC23462h interfaceC23462h) {
        return (C9114b) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m22720J(FamilyPlanHubFragment familyPlanHubFragment, InterfaceC23462h interfaceC23462h, InterfaceC37657c event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC37657c interfaceC37657cM108170c = familyPlanHubFragment.m22713C().m108170c(event);
        if (interfaceC37657cM108170c instanceof InterfaceC37660f) {
            familyPlanHubFragment.m22716F().m112154n((InterfaceC37660f) interfaceC37657cM108170c);
        } else if (interfaceC37657cM108170c instanceof AbstractC37659e) {
            m22719I(interfaceC23462h).m22751d((AbstractC37659e) interfaceC37657cM108170c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002c A[RETURN] */
    /* JADX INFO: renamed from: K */
    public static final EnumC25986b m22721K(FamilyPlanHubFragment familyPlanHubFragment) {
        String string = familyPlanHubFragment.requireArguments().getString("startDestination");
        if (string == null) {
            string = "";
        }
        EnumC25986b enumC25986b = EnumC25986b.FAMILY_PLAN_HUB;
        for (EnumC25986b enumC25986b2 : EnumC25986b.values()) {
            if (AbstractC22676k.m65745e(enumC25986b2.name(), string)) {
                if (enumC25986b2 == null) {
                    return enumC25986b;
                }
                return enumC25986b2;
            }
        }
        enumC25986b2 = null;
        if (enumC25986b2 == null) {
            return enumC25986b;
        }
        return enumC25986b2;
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 0), true, 1831853064));
    }
}
