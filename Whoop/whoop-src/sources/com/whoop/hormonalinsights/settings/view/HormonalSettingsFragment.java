package com.whoop.hormonalinsights.settings.view;

import android.content.ComponentCallbacks;
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
import com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import j93.InterfaceC21467g;
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
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import sp1.AbstractC32871a;
import sp1.C32872b;
import tp1.AbstractC34073m;
import tp1.AbstractC34075o;
import tp1.C34074n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vp1.AbstractC36272h;
import vp1.C36267c;
import vp1.C36273i;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!¨\u0006%²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/view/HormonalSettingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ltp1/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Ltp1/n;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lyn1/b;", "y", "C", "()Lyn1/b;", "analyticsHelper", "Ltp1/o;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HormonalSettingsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8947e(this, null, new C8946d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C8943a extends C22672i implements Function1 {
        public C8943a(Object obj) {
            super(1, 0, C39673b.class, obj, "sendEvent", "sendEvent(Lcom/whoop/hormonalinsights/analytics/HormonalInsightsAnalyticEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m22172a(AbstractC39672a p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C39673b) this.receiver).m126872M(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m22172a((AbstractC39672a) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8944b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26770w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26771x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8944b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26770w = componentCallbacks;
            this.f26771x = interfaceC35951a;
            this.f26772y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26770w;
            InterfaceC35951a interfaceC35951a = this.f26771x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26772y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8945c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26773w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26774x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26775y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8945c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26773w = componentCallbacks;
            this.f26774x = interfaceC35951a;
            this.f26775y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yn1.b] */
        @Override // c93.InterfaceC4339a
        public final C39673b invoke() {
            ComponentCallbacks componentCallbacks = this.f26773w;
            InterfaceC35951a interfaceC35951a = this.f26774x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26775y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39673b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8946d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26776w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8946d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26776w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26776w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.settings.view.HormonalSettingsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8947e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26777w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26778x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26779y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26780z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8947e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26777w = componentCallbacks;
            this.f26778x = interfaceC35951a;
            this.f26779y = interfaceC4339a;
            this.f26780z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, tp1.n] */
        @Override // c93.InterfaceC4339a
        public final C34074n invoke() {
            return AbstractC34132o.m107857B(this.f26777w, this.f26778x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34074n.class), this.f26779y, this.f26780z);
        }
    }

    public HormonalSettingsFragment() {
        C36273i c36273i = new C36273i(this, 1);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8944b(this, null, c36273i));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8945c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C39673b m22163C() {
        return (C39673b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C34074n m22164D() {
        return (C34074n) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m22165E(HormonalSettingsFragment hormonalSettingsFragment) {
        return AbstractC15751g.m44431K(hormonalSettingsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m22166F(HormonalSettingsFragment hormonalSettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(hormonalSettingsFragment.m22164D().getViewState(), AbstractC34075o.b.f142909a, null, c28655q, 48, 2);
            C32872b c32872b = new C32872b(AbstractC5583n.m16799z(hormonalSettingsFragment), hormonalSettingsFragment.getNavigator());
            AbstractC34075o abstractC34075oM22167G = m22167G(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(hormonalSettingsFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C36267c(hormonalSettingsFragment, 0);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c32872b);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C36267c(c32872b, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            C39673b c39673bM22163C = hormonalSettingsFragment.m22163C();
            boolean zM87157i3 = c28655q.m87157i(c39673bM22163C);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C8943a(c39673bM22163C);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC36272h.m115891x0(abstractC34075oM22167G, function1, function2, (Function1) ((InterfaceC21467g) objM87133R3), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final AbstractC34075o m22167G(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC34075o) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m22168H(HormonalSettingsFragment hormonalSettingsFragment, AbstractC34073m it) {
        AbstractC22676k.m65750j(it, "it");
        hormonalSettingsFragment.m22164D().m107726o(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m22169I(C32872b c32872b, AbstractC32871a it) {
        AbstractC22676k.m65750j(it, "it");
        c32872b.m103150a(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: vp1.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return HormonalSettingsFragment.m22166F(this.f155327w, (Composer) obj, iIntValue);
            }
        }, true, 488516130));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m22164D().m107726o(AbstractC34073m.b.f142812a);
    }
}
