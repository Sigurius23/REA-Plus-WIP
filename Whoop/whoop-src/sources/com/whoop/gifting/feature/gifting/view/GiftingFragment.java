package com.whoop.gifting.feature.gifting.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.gifting.feature.gifting.view.GiftingFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mh1.C25558a;
import mh1.C25560c;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import ph1.AbstractC29247k;
import ph1.C29246j;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/gifting/feature/gifting/view/GiftingFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lmh1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lmh1/c;", "navRouter", "Lmh1/a;", "x", "A", "()Lmh1/a;", "actionRouter", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GiftingFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.gifting.feature.gifting.view.GiftingFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8762a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26106w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26107x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26108y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8762a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26106w = componentCallbacks;
            this.f26107x = interfaceC35951a;
            this.f26108y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mh1.c] */
        @Override // c93.InterfaceC4339a
        public final C25560c invoke() {
            ComponentCallbacks componentCallbacks = this.f26106w;
            InterfaceC35951a interfaceC35951a = this.f26107x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26108y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25560c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.gifting.feature.gifting.view.GiftingFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8763b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26109w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26110x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26111y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8763b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26109w = componentCallbacks;
            this.f26110x = interfaceC35951a;
            this.f26111y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mh1.a] */
        @Override // c93.InterfaceC4339a
        public final C25558a invoke() {
            ComponentCallbacks componentCallbacks = this.f26109w;
            InterfaceC35951a interfaceC35951a = this.f26110x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26111y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25558a.class), interfaceC35951a);
        }
    }

    public GiftingFragment() {
        C29246j c29246j = new C29246j(this, 1);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C8762a(this, null, c29246j));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C8763b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C25558a m21462A() {
        return (C25558a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C25560c m21463B() {
        return (C25560c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m21464C(GiftingFragment giftingFragment) {
        return AbstractC15751g.m44431K(giftingFragment.requireActivity(), AbstractC5583n.m16799z(giftingFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m21465D(GiftingFragment giftingFragment, Composer composer, int i13) {
        Object obj;
        String string;
        String str;
        String str2;
        String string2;
        String strM85315e;
        String str3;
        String str4;
        String string3;
        String strM85315e2;
        String str5;
        String str6;
        String string4;
        String strM85315e3;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            String str7 = null;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = giftingFragment.getArguments();
                if (arguments == null || (string4 = arguments.getString("source")) == null) {
                    obj = objM87133R;
                    obj = objM87133R;
                    str5 = null;
                } else {
                    strM85315e3 = AbstractC28188o1.m85315e(string4);
                }
                if (str5 == null || AbstractC39414r.m125890i0(str5)) {
                    obj = objM87133R;
                    str5 = strM85315e3;
                    str6 = str5;
                    obj = objM87133R;
                    str5 = strM85315e3;
                    str6 = null;
                }
                if (str6 == null) {
                    str6 = ProfileAnalyticsKt.PROFILE_UNKNOWN_SOURCE;
                }
                c28655q.m87172p0(str6);
                obj = str6;
            }
            obj = objM87133R;
            String str8 = (String) obj;
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                Bundle arguments2 = giftingFragment.getArguments();
                if (arguments2 == null || (string3 = arguments2.getString("giftType")) == null) {
                    str3 = null;
                } else {
                    strM85315e2 = AbstractC28188o1.m85315e(string3);
                }
                if (str3 == null || AbstractC39414r.m125890i0(str3)) {
                    str3 = strM85315e2;
                    str4 = str3;
                    str3 = strM85315e2;
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "";
                }
                c28655q.m87172p0(str4);
                obj2 = str4;
            }
            String str9 = (String) obj2;
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                Bundle arguments3 = giftingFragment.getArguments();
                if (arguments3 == null || (string2 = arguments3.getString("test_count")) == null) {
                    str = null;
                } else {
                    strM85315e = AbstractC28188o1.m85315e(string2);
                }
                if (str == null || AbstractC39414r.m125890i0(str)) {
                    str = strM85315e;
                    str2 = str;
                    str = strM85315e;
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                c28655q.m87172p0(str2);
                obj3 = str2;
            }
            String str10 = (String) obj3;
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                Bundle arguments4 = giftingFragment.getArguments();
                String strM85315e4 = (arguments4 == null || (string = arguments4.getString("selected_tier")) == null) ? null : AbstractC28188o1.m85315e(string);
                if (strM85315e4 != null && !AbstractC39414r.m125890i0(strM85315e4)) {
                    str7 = strM85315e4;
                }
                String str11 = str7 != null ? str7 : "";
                c28655q.m87172p0(str11);
                objM87133R4 = str11;
            }
            AbstractC29247k.m88841e(str8, str9, str10, (String) objM87133R4, giftingFragment.m21463B(), giftingFragment.m21462A(), c28655q, 3510);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new InterfaceC4351m() { // from class: ph1.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return GiftingFragment.m21465D(this.f118322w, (Composer) obj, iIntValue);
            }
        }, true, -1473171008));
    }
}
