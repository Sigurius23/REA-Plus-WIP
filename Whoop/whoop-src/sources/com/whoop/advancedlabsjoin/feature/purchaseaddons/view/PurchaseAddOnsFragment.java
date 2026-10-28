package com.whoop.advancedlabsjoin.feature.purchaseaddons.view;

import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bg0.AbstractC3227i;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21157n0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p003a1.C0111j;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;
import yf0.C39509a;
import yf0.C39511c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/purchaseaddons/view/PurchaseAddOnsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lyf0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lyf0/c;", "navRouter", "Lyf0/a;", "x", "A", "()Lyf0/a;", "actionRouter", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PurchaseAddOnsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.advancedlabsjoin.feature.purchaseaddons.view.PurchaseAddOnsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5912a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23253w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23254x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23255y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5912a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23253w = componentCallbacks;
            this.f23254x = interfaceC35951a;
            this.f23255y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yf0.c] */
        @Override // c93.InterfaceC4339a
        public final C39511c invoke() {
            ComponentCallbacks componentCallbacks = this.f23253w;
            InterfaceC35951a interfaceC35951a = this.f23254x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23255y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39511c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabsjoin.feature.purchaseaddons.view.PurchaseAddOnsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5913b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23256w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23257x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23258y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5913b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23256w = componentCallbacks;
            this.f23257x = interfaceC35951a;
            this.f23258y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yf0.a] */
        @Override // c93.InterfaceC4339a
        public final C39509a invoke() {
            ComponentCallbacks componentCallbacks = this.f23256w;
            InterfaceC35951a interfaceC35951a = this.f23257x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23258y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39509a.class), interfaceC35951a);
        }
    }

    public PurchaseAddOnsFragment() {
        C0111j c0111j = new C0111j(this, 10);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5912a(this, null, c0111j));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5913b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C39509a m17707A() {
        return (C39509a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C39511c m17708B() {
        return (C39511c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m17709C(PurchaseAddOnsFragment purchaseAddOnsFragment) {
        return AbstractC15751g.m44431K(purchaseAddOnsFragment.requireActivity(), AbstractC5583n.m16799z(purchaseAddOnsFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m17710D(PurchaseAddOnsFragment purchaseAddOnsFragment, Composer composer, int i13) {
        Object obj;
        String string;
        String str;
        String str2;
        String string2;
        String strM85315e;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            String str3 = null;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = purchaseAddOnsFragment.getArguments();
                if (arguments == null || (string2 = arguments.getString("source")) == null) {
                    obj = objM87133R;
                    obj = objM87133R;
                    str = null;
                } else {
                    strM85315e = AbstractC28188o1.m85315e(string2);
                }
                if (str == null || AbstractC39414r.m125890i0(str)) {
                    obj = objM87133R;
                    str = strM85315e;
                    str2 = str;
                    obj = objM87133R;
                    str = strM85315e;
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                }
                c28655q.m87172p0(str2);
                obj = str2;
            }
            obj = objM87133R;
            String str4 = (String) obj;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                Bundle arguments2 = purchaseAddOnsFragment.getArguments();
                String strM85315e2 = (arguments2 == null || (string = arguments2.getString("test_count")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e2 != null && !AbstractC39414r.m125890i0(strM85315e2)) {
                    str3 = strM85315e2;
                }
                objM87133R2 = str3 == null ? "" : str3;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC3227i.m9319e(str4, (String) objM87133R2, purchaseAddOnsFragment.m17708B(), purchaseAddOnsFragment.m17707A(), AbstractC21157n0.m59385a(AbstractC21157n0.m59386b(purchaseAddOnsFragment.getArguments())), c28655q, 54, 0);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 16), true, -1725177752));
    }
}
