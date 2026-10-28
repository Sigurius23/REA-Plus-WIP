package com.whoop.advancedlabs.feature.marketingconsent.view;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lr.RunnableC24693e;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pc0.C29064a;
import pc0.C29066c;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r12.C30856a;
import sc0.AbstractC32360h;
import sc0.C32355c;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/marketingconsent/view/MarketingConsentFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/app/Activity;", "activity", "D", "(Landroid/app/Activity;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lpc0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C", "()Lpc0/c;", "navRouter", "Lpc0/a;", "x", "B", "()Lpc0/a;", "actionRouter", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MarketingConsentFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.marketingconsent.view.MarketingConsentFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5832a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23003w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23004x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23005y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5832a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23003w = componentCallbacks;
            this.f23004x = interfaceC35951a;
            this.f23005y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pc0.c] */
        @Override // c93.InterfaceC4339a
        public final C29066c invoke() {
            ComponentCallbacks componentCallbacks = this.f23003w;
            InterfaceC35951a interfaceC35951a = this.f23004x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23005y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29066c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.marketingconsent.view.MarketingConsentFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5833b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23006w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23007x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23008y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5833b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23006w = componentCallbacks;
            this.f23007x = interfaceC35951a;
            this.f23008y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, pc0.a] */
        @Override // c93.InterfaceC4339a
        public final C29064a invoke() {
            ComponentCallbacks componentCallbacks = this.f23006w;
            InterfaceC35951a interfaceC35951a = this.f23007x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23008y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29064a.class), interfaceC35951a);
        }
    }

    public MarketingConsentFragment() {
        C32355c c32355c = new C32355c(this, 0);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5832a(this, null, c32355c));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5833b(this, null, null));
    }

    /* JADX INFO: renamed from: B */
    private final C29064a m17457B() {
        return (C29064a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: C */
    private final C29066c m17458C() {
        return (C29066c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m17459E(MarketingConsentFragment marketingConsentFragment) {
        return AbstractC15751g.m44431K(marketingConsentFragment.requireActivity(), AbstractC5583n.m16799z(marketingConsentFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m17460F(MarketingConsentFragment marketingConsentFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                Bundle arguments = marketingConsentFragment.getArguments();
                String str = null;
                String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e != null && !AbstractC39414r.m125890i0(strM85315e)) {
                    str = strM85315e;
                }
                objM87133R = str == null ? "global_prompt" : str;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32360h.m100768g((String) objM87133R, marketingConsentFragment.m17458C(), marketingConsentFragment.m17457B(), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m17461G(MarketingConsentFragment marketingConsentFragment) {
        marketingConsentFragment.m17464D(marketingConsentFragment.getActivity());
    }

    /* JADX INFO: renamed from: D */
    public final void m17464D(Activity activity) {
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m17464D(getActivity());
        AbstractC28163g0.m85256l(this);
        View view = getView();
        if (view != null) {
            view.post(new RunnableC24693e(this, 19));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 20), true, -1283298478));
    }
}
