package com.whoop.gifting.feature.gifted.view;

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
import fh1.C14488a;
import fh1.C14490c;
import ge3.AbstractC15751g;
import h02.C16587n0;
import ih1.AbstractC18525i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p708hb2.C17098f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifted/view/GiftedFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lfh1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lfh1/c;", "navRouter", "Lfh1/a;", "x", "A", "()Lfh1/a;", "actionRouter", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GiftedFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.gifting.feature.gifted.view.GiftedFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8760a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26097w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26098x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26099y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8760a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26097w = componentCallbacks;
            this.f26098x = interfaceC35951a;
            this.f26099y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fh1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14490c invoke() {
            ComponentCallbacks componentCallbacks = this.f26097w;
            InterfaceC35951a interfaceC35951a = this.f26098x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26099y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14490c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gifting.feature.gifted.view.GiftedFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8761b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26100w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26101x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8761b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26100w = componentCallbacks;
            this.f26101x = interfaceC35951a;
            this.f26102y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fh1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14488a invoke() {
            ComponentCallbacks componentCallbacks = this.f26100w;
            InterfaceC35951a interfaceC35951a = this.f26101x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26102y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14488a.class), interfaceC35951a);
        }
    }

    public GiftedFragment() {
        C16587n0 c16587n0 = new C16587n0(this, 20);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C8760a(this, null, c16587n0));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C8761b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C14488a m21450A() {
        return (C14488a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C14490c m21451B() {
        return (C14490c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m21452C(GiftedFragment giftedFragment) {
        return AbstractC15751g.m44431K(giftedFragment.requireActivity(), AbstractC5583n.m16799z(giftedFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m21453D(GiftedFragment giftedFragment, Composer composer, int i13) {
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
                Bundle arguments = giftedFragment.getArguments();
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
                Bundle arguments2 = giftedFragment.getArguments();
                String strM85315e2 = (arguments2 == null || (string = arguments2.getString("giftCode")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e2 != null && !AbstractC39414r.m125890i0(strM85315e2)) {
                    str3 = strM85315e2;
                }
                objM87133R2 = str3 == null ? "" : str3;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC18525i.m53691f(str4, giftedFragment.m21451B(), giftedFragment.m21450A(), (String) objM87133R2, c28655q, 3078);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 11), true, 2069845161));
    }
}
