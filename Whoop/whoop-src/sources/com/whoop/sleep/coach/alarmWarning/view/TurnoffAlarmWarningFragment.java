package com.whoop.sleep.coach.alarmWarning.view;

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
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
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
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import re2.AbstractC31327a;
import re2.C31328b;
import sc0.C32355c;
import te2.C33752a;
import te2.InterfaceC33753b;
import tx0.C34238a;
import ue2.C34863c;
import ue2.InterfaceC34861a;
import um0.C35076b;
import uo1.C35141b;
import ve2.AbstractC35929b;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 ¨\u0006$²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lue2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lue2/c;", "viewModel", "", "x", "C", "()Ljava/lang/String;", "notificationId", "Lre2/b;", "y", "D", "()Lre2/b;", "turnoffAlarmWarningAnalyticHelper", "Lue2/a;", "viewState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TurnoffAlarmWarningFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10209c(this, null, new C10208b(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h notificationId = AbstractC30060g.m92088H(new C32355c(this, 27));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h turnoffAlarmWarningAnalyticHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10207a(this, null, null));

    /* JADX INFO: renamed from: com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10207a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30855w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30856x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30857y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10207a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30855w = componentCallbacks;
            this.f30856x = interfaceC35951a;
            this.f30857y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, re2.b] */
        @Override // c93.InterfaceC4339a
        public final C31328b invoke() {
            ComponentCallbacks componentCallbacks = this.f30855w;
            InterfaceC35951a interfaceC35951a = this.f30856x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30857y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31328b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10208b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30858w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10208b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30858w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30858w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10209c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30859w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30860x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30861y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30862z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10209c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30859w = componentCallbacks;
            this.f30860x = interfaceC35951a;
            this.f30861y = interfaceC4339a;
            this.f30862z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ue2.c] */
        @Override // c93.InterfaceC4339a
        public final C34863c invoke() {
            return AbstractC34132o.m107857B(this.f30859w, this.f30860x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34863c.class), this.f30861y, this.f30862z);
        }
    }

    /* JADX INFO: renamed from: C */
    private final String m25914C() {
        return (String) this.notificationId.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C31328b m25915D() {
        return (C31328b) this.turnoffAlarmWarningAnalyticHelper.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C34863c m25916E() {
        return (C34863c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m25917F(TurnoffAlarmWarningFragment turnoffAlarmWarningFragment) {
        return turnoffAlarmWarningFragment.requireArguments().getString("notificationTileId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m25918G(TurnoffAlarmWarningFragment turnoffAlarmWarningFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(turnoffAlarmWarningFragment.m25916E().getViewState(), new InterfaceC34861a.b(null, null, null, null, 15, null), null, c28655q, TextResource.$stable << 3, 2);
            C33752a c33752a = new C33752a(AbstractC5583n.m16799z(turnoffAlarmWarningFragment));
            InterfaceC34861a interfaceC34861aM25919H = m25919H(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(c33752a) | c28655q.m87157i(turnoffAlarmWarningFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C35076b(6, c33752a, turnoffAlarmWarningFragment);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(turnoffAlarmWarningFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C35141b(turnoffAlarmWarningFragment, 8);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35929b.m114170g(interfaceC34861aM25919H, function1, (Function1) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final InterfaceC34861a m25919H(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC34861a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m25920I(C33752a c33752a, TurnoffAlarmWarningFragment turnoffAlarmWarningFragment, InterfaceC33753b it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC33753b.a) {
            c33752a.m106724a((InterfaceC33753b.a) it);
        } else {
            if (!(it instanceof InterfaceC33753b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            turnoffAlarmWarningFragment.m25916E().m109964o((InterfaceC33753b.b) it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m25921J(TurnoffAlarmWarningFragment turnoffAlarmWarningFragment, AbstractC31327a.a it) {
        AbstractC22676k.m65750j(it, "it");
        turnoffAlarmWarningFragment.m25915D().m96419a(it);
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
        m25916E().m109964o(new InterfaceC33753b.b.C42385b(m25914C()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 20), true, 1154754336));
    }
}
