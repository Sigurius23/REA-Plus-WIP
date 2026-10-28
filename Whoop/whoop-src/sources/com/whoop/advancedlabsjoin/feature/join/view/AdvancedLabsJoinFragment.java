package com.whoop.advancedlabsjoin.feature.join.view;

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
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import rf0.C31354a;
import rf0.C31356c;
import sc0.C32355c;
import tx0.C34238a;
import uf0.AbstractC34907h;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/join/view/AdvancedLabsJoinFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lrf0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lrf0/c;", "navRouter", "Lrf0/a;", "x", "A", "()Lrf0/a;", "actionRouter", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AdvancedLabsJoinFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.advancedlabsjoin.feature.join.view.AdvancedLabsJoinFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5910a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23245w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23246x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23247y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5910a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23245w = componentCallbacks;
            this.f23246x = interfaceC35951a;
            this.f23247y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rf0.c] */
        @Override // c93.InterfaceC4339a
        public final C31356c invoke() {
            ComponentCallbacks componentCallbacks = this.f23245w;
            InterfaceC35951a interfaceC35951a = this.f23246x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23247y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31356c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabsjoin.feature.join.view.AdvancedLabsJoinFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5911b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23248w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23249x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23250y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5911b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23248w = componentCallbacks;
            this.f23249x = interfaceC35951a;
            this.f23250y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rf0.a] */
        @Override // c93.InterfaceC4339a
        public final C31354a invoke() {
            ComponentCallbacks componentCallbacks = this.f23248w;
            InterfaceC35951a interfaceC35951a = this.f23249x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23250y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31354a.class), interfaceC35951a);
        }
    }

    public AdvancedLabsJoinFragment() {
        C32355c c32355c = new C32355c(this, 20);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5910a(this, null, c32355c));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5911b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C31354a m17697A() {
        return (C31354a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C31356c m17698B() {
        return (C31356c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m17699C(AdvancedLabsJoinFragment advancedLabsJoinFragment) {
        return AbstractC15751g.m44431K(advancedLabsJoinFragment.requireActivity(), AbstractC5583n.m16799z(advancedLabsJoinFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m17700D(AdvancedLabsJoinFragment advancedLabsJoinFragment, Composer composer, int i13) {
        String string;
        String string2;
        String string3;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Bundle arguments = advancedLabsJoinFragment.getArguments();
            String str = null;
            String strM85315e = (arguments == null || (string3 = arguments.getString("source")) == null) ? null : AbstractC28188o1.m85315e(string3);
            if (strM85315e == null || AbstractC39414r.m125890i0(strM85315e)) {
                strM85315e = null;
            }
            if (strM85315e == null) {
                strM85315e = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
            }
            String str2 = strM85315e;
            Bundle arguments2 = advancedLabsJoinFragment.getArguments();
            String strM85315e2 = (arguments2 == null || (string2 = arguments2.getString("test_count")) == null) ? null : AbstractC28188o1.m85315e(string2);
            if (strM85315e2 == null || AbstractC39414r.m125890i0(strM85315e2)) {
                strM85315e2 = null;
            }
            String str3 = strM85315e2 == null ? "" : strM85315e2;
            Bundle arguments3 = advancedLabsJoinFragment.getArguments();
            String strM85315e3 = (arguments3 == null || (string = arguments3.getString("initially_selected_segment_id")) == null) ? null : AbstractC28188o1.m85315e(string);
            if (strM85315e3 != null && !AbstractC39414r.m125890i0(strM85315e3)) {
                str = strM85315e3;
            }
            AbstractC34907h.m110086e(str2, str3, str == null ? "" : str, advancedLabsJoinFragment.m17698B(), advancedLabsJoinFragment.m17697A(), c28655q, 0, 0);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 9), true, -48824802));
    }
}
