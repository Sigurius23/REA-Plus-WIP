package com.whoop.payments.feature.paymentmethodmanagement.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
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
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p664yy.C39850b0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import w20.C36727q;
import w22.C36740a;
import w22.C36742c;
import yb3.AbstractC39414r;
import z22.AbstractC40030i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lw22/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lw22/c;", "navRouter", "Lw22/a;", "x", "A", "()Lw22/a;", "actionRouter", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PaymentMethodManagementFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9647a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28277w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28278x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28279y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9647a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28277w = componentCallbacks;
            this.f28278x = interfaceC35951a;
            this.f28279y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w22.c] */
        @Override // c93.InterfaceC4339a
        public final C36742c invoke() {
            ComponentCallbacks componentCallbacks = this.f28277w;
            InterfaceC35951a interfaceC35951a = this.f28278x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28279y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36742c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.payments.feature.paymentmethodmanagement.view.PaymentMethodManagementFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9648b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28280w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28281x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28282y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9648b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28280w = componentCallbacks;
            this.f28281x = interfaceC35951a;
            this.f28282y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w22.a] */
        @Override // c93.InterfaceC4339a
        public final C36740a invoke() {
            ComponentCallbacks componentCallbacks = this.f28280w;
            InterfaceC35951a interfaceC35951a = this.f28281x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28282y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36740a.class), interfaceC35951a);
        }
    }

    public PaymentMethodManagementFragment() {
        C39850b0 c39850b0 = new C39850b0(this, 4);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C9647a(this, null, c39850b0));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C9648b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C36740a m23229A() {
        return (C36740a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C36742c m23230B() {
        return (C36742c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m23231C(PaymentMethodManagementFragment paymentMethodManagementFragment) {
        return AbstractC15751g.m44431K(paymentMethodManagementFragment.requireActivity(), AbstractC5583n.m16799z(paymentMethodManagementFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m23232D(PaymentMethodManagementFragment paymentMethodManagementFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                Bundle arguments = paymentMethodManagementFragment.getArguments();
                String str = null;
                String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e != null && !AbstractC39414r.m125890i0(strM85315e)) {
                    str = strM85315e;
                }
                objM87133R = str == null ? ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE : str;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC40030i.m128350e((String) objM87133R, paymentMethodManagementFragment.m23230B(), paymentMethodManagementFragment.m23229A(), c28655q, 6);
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
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 21), true, -1962561915));
    }
}
