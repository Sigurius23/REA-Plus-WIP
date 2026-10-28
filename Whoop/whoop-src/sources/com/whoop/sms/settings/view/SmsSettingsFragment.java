package com.whoop.sms.settings.view;

import a80.C0539c;
import ag2.C0864a;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import kd1.AbstractC22387b0;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p003a1.C0111j;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p739ui0.AbstractC35012n;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qi0.C30406a;
import qi0.C30409d;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/sms/settings/view/SmsSettingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lqi0/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "B", "()Lqi0/d;", "navRouter", "x", "a", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmsSettingsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: x */
    private static final C10224a f30885x = new C10224a(null);

    /* JADX INFO: renamed from: y */
    public static final int f30886y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10225b(this, null, new C0111j(this, 3)));

    /* JADX INFO: renamed from: com.whoop.sms.settings.view.SmsSettingsFragment$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, m65681d2 = {"Lcom/whoop/sms/settings/view/SmsSettingsFragment$a;", "", "<init>", "()V", "", "SETTINGS_BFF_PATH", "Ljava/lang/String;", "METRIC_FEATURE_NAME", "REQUEST_NAME", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10224a {
        public /* synthetic */ C10224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10224a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.sms.settings.view.SmsSettingsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10225b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30888w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30889x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30890y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10225b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30888w = componentCallbacks;
            this.f30889x = interfaceC35951a;
            this.f30890y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qi0.d] */
        @Override // c93.InterfaceC4339a
        public final C30409d invoke() {
            ComponentCallbacks componentCallbacks = this.f30888w;
            InterfaceC35951a interfaceC35951a = this.f30889x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30890y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30409d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: B */
    private final C30409d m25964B() {
        return (C30409d) this.navRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C34911a m25965C(SmsSettingsFragment smsSettingsFragment) {
        return AbstractC15751g.m44431K(smsSettingsFragment.requireActivity(), AbstractC5583n.m16799z(smsSettingsFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m25966D(SmsSettingsFragment smsSettingsFragment, Composer composer, int i13) {
        Object obj;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            ScreenAnalyticEventModel screenAnalyticEventModel = new ScreenAnalyticEventModel((AnalyticEventModel) null, (AnalyticEventModel) null, (AnalyticEventModel) null, 7, (DefaultConstructorMarker) null);
            boolean zM87157i = c28655q.m87157i(screenAnalyticEventModel);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                obj = objM87133R;
                C0864a c0864a = new C0864a(screenAnalyticEventModel, 0);
                c28655q.m87172p0(c0864a);
                obj = c0864a;
            }
            obj = objM87133R;
            AbstractC35012n.m110592n(smsSettingsFragment.m25964B(), (C30406a) AbstractC29125c.m88492A(smsSettingsFragment).m122602a((InterfaceC4339a) obj, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30406a.class), null), new ApiRequest("messaging-service/v1/sms/settings/bff", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), "sms_settings", screenAnalyticEventModel, "sms_settings_request", new CachePolicyModel(false, (String) (false ? 1 : 0), (Set) null, 7, (DefaultConstructorMarker) null), null, null, null, c28655q, 199680 | C30409d.f124801d | (C30406a.f124781d << 3) | (ApiRequest.$stable << 6) | (CachePolicyModel.$stable << 18), 896);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m25967E(ScreenAnalyticEventModel screenAnalyticEventModel) {
        return AbstractC15751g.m44431K(screenAnalyticEventModel);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 2), true, -1699140290));
    }
}
