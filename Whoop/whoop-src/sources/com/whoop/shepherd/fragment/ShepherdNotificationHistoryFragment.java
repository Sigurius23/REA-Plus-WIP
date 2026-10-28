package com.whoop.shepherd.fragment;

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
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no0.C26944e0;
import no0.C26954j0;
import nr0.C27072e;
import o02.InterfaceC27353d;
import oe2.C27878c;
import or2.AbstractC28163g0;
import p114eb.AbstractC12939a0;
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
import pe2.AbstractC29117a;
import pe2.C29118b;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import xd2.C38213i;
import xd2.InterfaceC38212h;
import xd2.InterfaceC38214j;
import yd2.AbstractC39469k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/shepherd/fragment/ShepherdNotificationHistoryFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lxd2/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Lxd2/i;", "viewModel", "Lfi0/a;", "x", "C", "()Lfi0/a;", "analytics", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "z", "getNavigatorReducer", "()Lo02/d;", "navigatorReducer", "Lxd2/j;", "viewState", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ShepherdNotificationHistoryFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10193e(this, null, new C10192d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigatorReducer;

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10189a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30790w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30791x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30792y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10189a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30790w = componentCallbacks;
            this.f30791x = interfaceC35951a;
            this.f30792y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f30790w;
            InterfaceC35951a interfaceC35951a = this.f30791x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30792y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10190b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30793w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30794x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30795y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10190b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30793w = componentCallbacks;
            this.f30794x = interfaceC35951a;
            this.f30795y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30793w;
            InterfaceC35951a interfaceC35951a = this.f30794x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30795y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10191c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30796w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30797x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30798y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10191c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30796w = componentCallbacks;
            this.f30797x = interfaceC35951a;
            this.f30798y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f30796w;
            InterfaceC35951a interfaceC35951a = this.f30797x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30798y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10192d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30799w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10192d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30799w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30799w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.shepherd.fragment.ShepherdNotificationHistoryFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10193e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30800w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30801x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30802y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30803z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10193e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30800w = componentCallbacks;
            this.f30801x = interfaceC35951a;
            this.f30802y = interfaceC4339a;
            this.f30803z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, xd2.i] */
        @Override // c93.InterfaceC4339a
        public final C38213i invoke() {
            return AbstractC34132o.m107857B(this.f30800w, this.f30801x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38213i.class), this.f30802y, this.f30803z);
        }
    }

    public ShepherdNotificationHistoryFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10189a(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10190b(this, null, new C27072e(this, 13)));
        this.navigatorReducer = AbstractC30060g.m92087G(enumC23463i, new C10191c(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final InterfaceC14515a m25862C() {
        return (InterfaceC14515a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C38213i m25863D() {
        return (C38213i) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m25864E(ShepherdNotificationHistoryFragment shepherdNotificationHistoryFragment) {
        return AbstractC15751g.m44431K(shepherdNotificationHistoryFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m25865F(ShepherdNotificationHistoryFragment shepherdNotificationHistoryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(shepherdNotificationHistoryFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C29118b(abstractC12939a0, (InterfaceC14515a) AbstractC29125c.m88492A(shepherdNotificationHistoryFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null), shepherdNotificationHistoryFragment.getNavigator());
                c28655q.m87172p0(objM87133R2);
            }
            C29118b c29118b = (C29118b) objM87133R2;
            InterfaceC38214j interfaceC38214jM25866G = m25866G(AbstractC28683x.m87260n(shepherdNotificationHistoryFragment.m25863D().getViewState(), InterfaceC38214j.a.INSTANCE.m122462d(), null, c28655q, 0, 2));
            boolean zM87157i = c28655q.m87157i(abstractC12939a0) | c28655q.m87157i(shepherdNotificationHistoryFragment) | c28655q.m87157i(c29118b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C26954j0(abstractC12939a0, shepherdNotificationHistoryFragment, c29118b, 5);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i2 = c28655q.m87157i(shepherdNotificationHistoryFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C26944e0(shepherdNotificationHistoryFragment, 16);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC39469k.m126076N(interfaceC38214jM25866G, function1, (Function1) objM87133R4, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final InterfaceC38214j m25866G(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC38214j) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m25867H(AbstractC12939a0 abstractC12939a0, ShepherdNotificationHistoryFragment shepherdNotificationHistoryFragment, C29118b c29118b, InterfaceC38212h.l navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (navEvent.equals(InterfaceC38212h.d.f163731a)) {
            abstractC12939a0.m36410z();
        } else if (navEvent instanceof InterfaceC38212h.i) {
            shepherdNotificationHistoryFragment.m25862C().mo41424f("ANF", "Open", "ANF Education", "ANF");
            c29118b.m88488a(new AbstractC29117a.a(((InterfaceC38212h.i) navEvent).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String()));
        } else if (navEvent instanceof InterfaceC38212h.j) {
            c29118b.m88488a(new AbstractC29117a.b(((InterfaceC38212h.j) navEvent).getHistoryDate()));
        } else {
            if (!(navEvent instanceof InterfaceC38212h.k)) {
                throw new NoWhenBranchMatchedException();
            }
            c29118b.m88488a(AbstractC29117a.i.f117876a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m25868I(ShepherdNotificationHistoryFragment shepherdNotificationHistoryFragment, InterfaceC38212h.p viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        shepherdNotificationHistoryFragment.m25863D().m122445o(viewEvent);
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
    public void onStart() {
        super.onStart();
        m25863D().m122445o(InterfaceC38212h.m.f163740a);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 0), true, 1348324722));
    }
}
