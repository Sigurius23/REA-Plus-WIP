package com.whoop.onboardingpersonalization.dayzero;

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
import com.whoop.navigation.models.ChatHeaderMetadata;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p734sl0.C32645n0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r12.C30856a;
import r12.C30857b;
import r12.EnumC30858c;
import s12.C32068a;
import vf3.InterfaceC35951a;
import y12.AbstractC39070c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "onResume", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Ls12/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "D", "()Ls12/a;", "analytics", "Lcom/whoop/onboardingpersonalization/dayzero/a;", "x", "E", "()Lcom/whoop/onboardingpersonalization/dayzero/a;", "args", "onboarding-personalization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DayZeroPersonalizationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h analytics = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C9616a(this, null, null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h args = AbstractC30060g.m92088H(new C30857b(this, 0));

    /* JADX INFO: renamed from: com.whoop.onboardingpersonalization.dayzero.DayZeroPersonalizationFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9616a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28209w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28210x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28211y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9616a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28209w = componentCallbacks;
            this.f28210x = interfaceC35951a;
            this.f28211y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s12.a] */
        @Override // c93.InterfaceC4339a
        public final C32068a invoke() {
            ComponentCallbacks componentCallbacks = this.f28209w;
            InterfaceC35951a interfaceC35951a = this.f28210x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f28211y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32068a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C9617a m23162C(DayZeroPersonalizationFragment dayZeroPersonalizationFragment) {
        return C9617a.INSTANCE.m23176a(dayZeroPersonalizationFragment.getArguments());
    }

    /* JADX INFO: renamed from: D */
    private final C32068a m23163D() {
        return (C32068a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final C9617a m23164E() {
        return (C9617a) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m23165F(DayZeroPersonalizationFragment dayZeroPersonalizationFragment, Composer composer, int i13) {
        InterfaceC4339a interfaceC4339a;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C32645n0 c32645n0 = dayZeroPersonalizationFragment.m23164E().getLive.hms.video.sdk.models.enums.HMSMessageType.CHAT java.lang.String();
            ChatHeaderMetadata headerMetaData = dayZeroPersonalizationFragment.m23164E().getHeaderMetaData();
            boolean dismissible = dayZeroPersonalizationFragment.m23164E().getDismissible();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (dismissible) {
                c28655q.m87150e0(1194177668);
                boolean zM87157i = c28655q.m87157i(dayZeroPersonalizationFragment);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C30857b(dayZeroPersonalizationFragment, 1);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1194252006);
                c28655q.m87173q(false);
                interfaceC4339a = null;
            }
            InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
            boolean zM87157i2 = c28655q.m87157i(dayZeroPersonalizationFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30857b(dayZeroPersonalizationFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC39070c.m124603l(c32645n0, null, headerMetaData, interfaceC4339a2, (InterfaceC4339a) objM87133R2, null, c28655q, C32645n0.f135304t | (ChatHeaderMetadata.$stable << 6), 34);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m23166G(DayZeroPersonalizationFragment dayZeroPersonalizationFragment) {
        AbstractC5583n.m16799z(dayZeroPersonalizationFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m23167H(DayZeroPersonalizationFragment dayZeroPersonalizationFragment) {
        AbstractC5583n.m16799z(dayZeroPersonalizationFragment).m36410z();
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
        m23163D().m99657a(m23164E().getLive.hms.video.sdk.models.enums.HMSMessageType.CHAT java.lang.String().getSource());
        EnumC30858c headerMetaDataFailure = m23164E().getHeaderMetaDataFailure();
        if (headerMetaDataFailure != null) {
            m23163D().m99658b(headerMetaDataFailure);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C30856a(this, 0), true, 1570771800));
    }
}
