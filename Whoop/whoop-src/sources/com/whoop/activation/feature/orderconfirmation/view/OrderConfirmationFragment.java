package com.whoop.activation.feature.orderconfirmation.view;

import a80.AbstractC0549m;
import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p003a1.C0111j;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import x70.C38036a;
import x70.C38038c;
import y70.InterfaceC39265a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/activation/feature/orderconfirmation/view/OrderConfirmationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lx70/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Lx70/c;", "navRouter", "Lx70/a;", "x", "B", "()Lx70/a;", "actionRouter", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class OrderConfirmationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationFragment$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/activation/feature/orderconfirmation/view/OrderConfirmationFragment$a", "Lg/t;", "Ll83/a0;", "d", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C5745a extends AbstractC14917t {
        public C5745a() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            OrderConfirmationFragment.this.m17172C().m121781g(InterfaceC39265a.h.f168843a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5746b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22747w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22748x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22749y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5746b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22747w = componentCallbacks;
            this.f22748x = interfaceC35951a;
            this.f22749y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x70.c] */
        @Override // c93.InterfaceC4339a
        public final C38038c invoke() {
            ComponentCallbacks componentCallbacks = this.f22747w;
            InterfaceC35951a interfaceC35951a = this.f22748x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22749y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38038c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.feature.orderconfirmation.view.OrderConfirmationFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5747c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22750w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22751x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22752y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5747c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22750w = componentCallbacks;
            this.f22751x = interfaceC35951a;
            this.f22752y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x70.a] */
        @Override // c93.InterfaceC4339a
        public final C38036a invoke() {
            ComponentCallbacks componentCallbacks = this.f22750w;
            InterfaceC35951a interfaceC35951a = this.f22751x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22752y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38036a.class), interfaceC35951a);
        }
    }

    public OrderConfirmationFragment() {
        C0111j c0111j = new C0111j(this, 1);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5746b(this, null, c0111j));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5747c(this, null, null));
    }

    /* JADX INFO: renamed from: B */
    private final C38036a m17171B() {
        return (C38036a) this.actionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C38038c m17172C() {
        return (C38038c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C34911a m17173D(OrderConfirmationFragment orderConfirmationFragment) {
        return AbstractC15751g.m44431K(orderConfirmationFragment.requireActivity(), AbstractC5583n.m16799z(orderConfirmationFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m17174E(OrderConfirmationFragment orderConfirmationFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                Bundle arguments = orderConfirmationFragment.getArguments();
                String str = null;
                String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e != null && !AbstractC39414r.m125890i0(strM85315e)) {
                    str = strM85315e;
                }
                objM87133R = str == null ? ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE : str;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC0549m.m1363e(new InterfaceC39265a.k((String) objM87133R), orderConfirmationFragment.m17172C(), orderConfirmationFragment.m17171B(), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C14923z onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.m43015a(viewLifecycleOwner, new C5745a());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 0), true, 142210659));
    }
}
