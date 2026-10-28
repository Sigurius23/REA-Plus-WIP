package com.whoop.advancedlabsmanagement.view;

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
import j02.AbstractC21157n0;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ng0.C26679a;
import ng0.C26681c;
import oe2.C27878c;
import og0.InterfaceC27915a;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q80.C30036h;
import q83.AbstractC30060g;
import qg0.AbstractC30344e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/advancedlabsmanagement/view/AdvancedLabsManagementFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lng0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lng0/c;", "navRouter", "Lng0/a;", "x", "A", "()Lng0/a;", "actionRouter", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AdvancedLabsManagementFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.advancedlabsmanagement.view.AdvancedLabsManagementFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5916a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23270w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23271x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23272y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5916a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23270w = componentCallbacks;
            this.f23271x = interfaceC35951a;
            this.f23272y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ng0.c] */
        @Override // c93.InterfaceC4339a
        public final C26681c invoke() {
            ComponentCallbacks componentCallbacks = this.f23270w;
            InterfaceC35951a interfaceC35951a = this.f23271x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23272y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26681c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabsmanagement.view.AdvancedLabsManagementFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5917b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23273w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23274x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23275y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5917b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23273w = componentCallbacks;
            this.f23274x = interfaceC35951a;
            this.f23275y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ng0.a] */
        @Override // c93.InterfaceC4339a
        public final C26679a invoke() {
            ComponentCallbacks componentCallbacks = this.f23273w;
            InterfaceC35951a interfaceC35951a = this.f23274x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23275y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26679a.class), interfaceC35951a);
        }
    }

    public AdvancedLabsManagementFragment() {
        C30036h c30036h = new C30036h(this, 4);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5916a(this, null, c30036h));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5917b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C26679a m17726A() {
        return (C26679a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C26681c m17727B() {
        return (C26681c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m17728C(AdvancedLabsManagementFragment advancedLabsManagementFragment) {
        return AbstractC15751g.m44431K(advancedLabsManagementFragment.requireActivity(), AbstractC5583n.m16799z(advancedLabsManagementFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m17729D(AdvancedLabsManagementFragment advancedLabsManagementFragment, Composer composer, int i13) {
        String string;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = advancedLabsManagementFragment.getArguments();
            String str = null;
            String strM85315e = (arguments == null || (string = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string);
            if (strM85315e != null && !AbstractC39414r.m125890i0(strM85315e)) {
                str = strM85315e;
            }
            if (str == null) {
                str = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            }
            AbstractC30344e.m92732e(new InterfaceC27915a.a(str), advancedLabsManagementFragment.m17727B(), advancedLabsManagementFragment.m17726A(), AbstractC21157n0.m59385a(AbstractC21157n0.m59386b(advancedLabsManagementFragment.getArguments())), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 25), true, -1219801767));
    }
}
