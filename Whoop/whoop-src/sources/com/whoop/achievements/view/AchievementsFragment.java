package com.whoop.achievements.view;

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
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import t60.C33548a;
import t60.C33550c;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vv1.C36532c;
import w20.C36727q;
import w60.AbstractC36858f;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/achievements/view/AchievementsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lt60/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lt60/c;", "navRouter", "Lt60/a;", "x", "A", "()Lt60/a;", "actionRouter", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AchievementsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h actionRouter;

    /* JADX INFO: renamed from: com.whoop.achievements.view.AchievementsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5741a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22737x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5741a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22736w = componentCallbacks;
            this.f22737x = interfaceC35951a;
            this.f22738y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t60.c] */
        @Override // c93.InterfaceC4339a
        public final C33550c invoke() {
            ComponentCallbacks componentCallbacks = this.f22736w;
            InterfaceC35951a interfaceC35951a = this.f22737x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22738y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33550c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.view.AchievementsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5742b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22739w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22740x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22741y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5742b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22739w = componentCallbacks;
            this.f22740x = interfaceC35951a;
            this.f22741y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t60.a] */
        @Override // c93.InterfaceC4339a
        public final C33548a invoke() {
            ComponentCallbacks componentCallbacks = this.f22739w;
            InterfaceC35951a interfaceC35951a = this.f22740x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22741y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33548a.class), interfaceC35951a);
        }
    }

    public AchievementsFragment() {
        C36532c c36532c = new C36532c(this, 5);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5741a(this, null, c36532c));
        this.actionRouter = AbstractC30060g.m92087G(enumC23463i, new C5742b(this, null, null));
    }

    /* JADX INFO: renamed from: A */
    private final C33548a m17043A() {
        return (C33548a) this.actionRouter.getValue();
    }

    /* JADX INFO: renamed from: B */
    private final C33550c m17044B() {
        return (C33550c) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m17045C(AchievementsFragment achievementsFragment) {
        return AbstractC15751g.m44431K(achievementsFragment.requireActivity(), AbstractC5583n.m16799z(achievementsFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m17046D(AchievementsFragment achievementsFragment, Composer composer, int i13) {
        Object obj;
        String str;
        String str2;
        String string;
        String strM85315e;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                Bundle arguments = achievementsFragment.getArguments();
                if (arguments == null || (string = arguments.getString("source")) == null) {
                    obj = objM87133R;
                    obj = objM87133R;
                    str = null;
                } else {
                    strM85315e = AbstractC28188o1.m85315e(string);
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
            String str3 = (String) obj;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                Bundle arguments2 = achievementsFragment.getArguments();
                String string2 = arguments2 != null ? arguments2.getString("achievementType") : null;
                objM87133R2 = string2 == null ? "" : string2;
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC36858f.m118193g(str3, (String) objM87133R2, achievementsFragment.m17044B(), achievementsFragment.m17043A(), c28655q, 54);
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 1), true, 340569312));
    }
}
