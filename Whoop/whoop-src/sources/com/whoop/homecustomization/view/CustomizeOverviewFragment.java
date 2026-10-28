package com.whoop.homecustomization.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bn1.C3498a;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hn1.C17517c;
import hn1.InterfaceC17515a;
import hn1.InterfaceC17516b;
import in1.C18723c;
import in1.InterfaceC18722b;
import in1.InterfaceC18724d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ln1.AbstractC24539q;
import ln1.C24527e;
import ln1.C24528f;
import ln1.C24532j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#¨\u0006'²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lhn1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "G", "(Lhn1/b;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lin1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lin1/c;", "viewModel", "Lhn1/c;", "x", "E", "()Lhn1/c;", "router", "Lbn1/a;", "y", "D", "()Lbn1/a;", "analyticsHelper", "Lin1/d;", "viewState", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CustomizeOverviewFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8863d(this, null, new C8862c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h router;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.CustomizeOverviewFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8860a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26594w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26595x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26596y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8860a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26594w = componentCallbacks;
            this.f26595x = interfaceC35951a;
            this.f26596y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hn1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17517c invoke() {
            ComponentCallbacks componentCallbacks = this.f26594w;
            InterfaceC35951a interfaceC35951a = this.f26595x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26596y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17517c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.CustomizeOverviewFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8861b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26597w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26598x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26599y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8861b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26597w = componentCallbacks;
            this.f26598x = interfaceC35951a;
            this.f26599y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bn1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3498a invoke() {
            ComponentCallbacks componentCallbacks = this.f26597w;
            InterfaceC35951a interfaceC35951a = this.f26598x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26599y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3498a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.CustomizeOverviewFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8862c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26600w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8862c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26600w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26600w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.homecustomization.view.CustomizeOverviewFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8863d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26601w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26602x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26603y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26604z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8863d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26601w = componentCallbacks;
            this.f26602x = interfaceC35951a;
            this.f26603y = interfaceC4339a;
            this.f26604z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, in1.c] */
        @Override // c93.InterfaceC4339a
        public final C18723c invoke() {
            return AbstractC34132o.m107857B(this.f26601w, this.f26602x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18723c.class), this.f26603y, this.f26604z);
        }
    }

    public CustomizeOverviewFragment() {
        C24532j c24532j = new C24532j(this, 1);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.router = AbstractC30060g.m92087G(enumC23463i, new C8860a(this, null, c24532j));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8861b(this, null, null));
    }

    /* JADX INFO: renamed from: D */
    private final C3498a m21895D() {
        return (C3498a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C17517c m21896E() {
        return (C17517c) this.router.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final C18723c m21897F() {
        return (C18723c) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final void m21898G(InterfaceC17516b event) {
        if (!(event instanceof InterfaceC17516b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m21895D().m10328e();
        AbstractC5583n.m16799z(this).m36410z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m21899H(CustomizeOverviewFragment customizeOverviewFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC18724d interfaceC18724dM21900I = m21900I(AbstractC28683x.m87260n(customizeOverviewFragment.m21897F().getViewState(), InterfaceC18724d.b.f73582a, null, c28655q, 48, 2));
            C3498a c3498aM21895D = customizeOverviewFragment.m21895D();
            boolean zM87157i = c28655q.m87157i(customizeOverviewFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C24528f(customizeOverviewFragment, 0);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(customizeOverviewFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24528f(customizeOverviewFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(customizeOverviewFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C24528f(customizeOverviewFragment, 2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC24539q.m71544z(interfaceC18724dM21900I, c3498aM21895D, null, function1, function2, (Function1) objM87133R3, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final InterfaceC18724d m21900I(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC18724d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m21901J(CustomizeOverviewFragment customizeOverviewFragment, InterfaceC18722b it) {
        AbstractC22676k.m65750j(it, "it");
        customizeOverviewFragment.m21897F().m54453n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m21902K(CustomizeOverviewFragment customizeOverviewFragment, InterfaceC17516b it) {
        AbstractC22676k.m65750j(it, "it");
        customizeOverviewFragment.m21898G(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m21903L(CustomizeOverviewFragment customizeOverviewFragment, InterfaceC17515a it) {
        AbstractC22676k.m65750j(it, "it");
        customizeOverviewFragment.m21896E().m49761a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m21904M(CustomizeOverviewFragment customizeOverviewFragment) {
        return AbstractC15751g.m44431K(customizeOverviewFragment.requireActivity());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C24527e(this, 0), true, 1465069870));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        m21897F().m54453n(InterfaceC18722b.c.f73542a);
    }
}
