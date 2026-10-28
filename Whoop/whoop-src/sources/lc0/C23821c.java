package lc0;

import ad3.C0764g;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsFragment;
import com.whoop.advancedlabs.feature.hormonalcontext.view.HormonalContextFragment;
import com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment;
import com.whoop.clinicianintheloop.view.ClinicianSchedulingConfirmationFragment;
import com.whoop.p069ui.drawer.debug.DebugFeatureFlagSettingsFragment;
import com.whoop.pairing.p066ui.view.PairingFragment;
import com.whoop.privacyconsent.view.PrivacyConsentFragment;
import com.whoop.stories.OnboardingStoriesDebugFragment;
import com.whoop.strava.view.StravaFragment;
import hms.webrtc.RendererCommon;
import i93.C18279e;
import ie0.AbstractC18441a;
import j22.AbstractC21257f;
import j22.C21259h;
import java.util.Map;
import ji2.InterfaceC21730i;
import jx1.EnumC22034x;
import k22.InterfaceC22165e;
import kb0.AbstractC22319a;
import kb0.C22320b;
import kd0.InterfaceC22381a;
import l42.AbstractC23333a;
import l42.C23334b;
import l83.C23454a0;
import l83.C23465k;
import live.hms.videoview.HMSVideoView;
import live.hms.videoview.textureview.HMSTextureRenderer;
import lo0.C24590l;
import lo0.InterfaceC24586j;
import lu2.C24754d;
import m83.AbstractC25234a;
import m83.AbstractC25244f;
import m92.C25327j;
import mx1.AbstractC26012r;
import mx2.AbstractC26019f;
import mx2.C26021h;
import n71.AbstractC26434o;
import no0.AbstractC26951i;
import no0.AbstractC26971s;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0240p2;
import p025b1.C2214e;
import p134f2.C14015d;
import p209i3.AbstractC18041w;
import p209i3.C18026h;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.InterfaceC23013y;
import p292l1.C23203x4;
import p316m1.C24895c0;
import p316m1.InterfaceC24926x;
import p329n0.C26058k;
import p329n0.InterfaceC26064q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24684p;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: lc0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23821c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94226w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f94227x;

    public /* synthetic */ C23821c(Object obj, int i13) {
        this.f94226w = i13;
        this.f94227x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f94226w) {
            case 0:
                return HormonalContextFragment.m17450G((HormonalContextFragment) this.f94227x, (String) obj);
            case 1:
                return SchedulingStepFragment.m17590T((SchedulingStepFragment) this.f94227x, (AbstractC18441a) obj);
            case 2:
                return OnboardingStoriesDebugFragment.m26130S((OnboardingStoriesDebugFragment) this.f94227x, (InterfaceC26064q) obj);
            case 3:
                return StravaFragment.m26334N((StravaFragment) this.f94227x, (InterfaceC21730i) obj);
            case 4:
                return HMSVideoView.videoTrackManager_delegate$lambda$4$lambda$1((HMSVideoView) this.f94227x, (RendererCommon.RendererEvents) obj);
            case 5:
                return HMSTextureRenderer.videoTrackManager_delegate$lambda$4$lambda$1((HMSTextureRenderer) this.f94227x, (RendererCommon.RendererEvents) obj);
            case 6:
                return C24684p.m72148o((C24684p.a.C41970a) this.f94227x, (C14015d) obj);
            case 7:
                return C24754d.m72485c((InterfaceC41070a) this.f94227x, (C0764g) obj);
            case 8:
                return new C2214e((C23203x4) this.f94227x, 7);
            case 9:
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) this.f94227x;
                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) obj;
                AbstractC22676k.m65748h(interfaceC0240p2, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                C24895c0 c24895c0 = (C24895c0) interfaceC0240p2;
                c24895c0.f97521P = true;
                c24895c0.f97520O.invoke(interfaceC18044z);
                AbstractC0201g.m510j(c24895c0);
                return Boolean.FALSE;
            case 10:
                return PairingFragment.m23214S((PairingFragment) this.f94227x, (InterfaceC22165e) obj);
            case 11:
                return PairingFragment.m23215T((C21259h) this.f94227x, (AbstractC21257f) obj);
            case 12:
                return obj == ((AbstractC25234a) this.f94227x) ? "(this Collection)" : String.valueOf(obj);
            case 13:
                AbstractC25244f abstractC25244f = (AbstractC25244f) this.f94227x;
                Map.Entry it = (Map.Entry) obj;
                AbstractC22676k.m65750j(it, "it");
                StringBuilder sb4 = new StringBuilder();
                Object key = it.getKey();
                sb4.append(key == abstractC25244f ? "(this Map)" : String.valueOf(key));
                sb4.append('=');
                Object value = it.getValue();
                sb4.append(value != abstractC25244f ? String.valueOf(value) : "(this Map)");
                return sb4.toString();
            case 14:
                return C25327j.m74398t((C25327j) this.f94227x, (String) obj);
            case 15:
                return AbstractC26012r.m77302k((EnumC22034x) this.f94227x, (InterfaceC22131e) obj);
            case 16:
                return C26021h.m77370r((C26021h.b.h) this.f94227x, (AbstractC26019f.a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C26021h.m77371s((C26021h.b.m) this.f94227x, (AbstractC26019f.a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C26021h.m77372t((C26021h.b.k) this.f94227x, (AbstractC26019f.a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C26021h.m77374v((C26021h.b.c) this.f94227x, (AbstractC26019f.a) obj);
            case 20:
                C26058k c26058k = (C26058k) this.f94227x;
                return c26058k.m77534Q(((Integer) obj).intValue(), c26058k.f103138E);
            case 21:
                InterfaceC24926x interfaceC24926x = (InterfaceC24926x) this.f94227x;
                InterfaceC18044z interfaceC18044z2 = (InterfaceC18044z) obj;
                if (interfaceC24926x.invoke() > 0.0f) {
                    AbstractC18041w.m51809h(interfaceC18044z2, new C18026h(interfaceC24926x.invoke(), new C18279e(0.0f, 1.0f), 0));
                }
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PrivacyConsentFragment.m23342J((C23334b) this.f94227x, (AbstractC23333a) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26434o.m78204C((C23465k[]) this.f94227x, (InterfaceC22129c) obj);
            case 24:
                return ClinicalInsightsFragment.m17331I((ClinicalInsightsFragment) this.f94227x, (InterfaceC22381a.c) obj);
            case 25:
                return ClinicalInsightsFragment.m17332J((C22320b) this.f94227x, (AbstractC22319a) obj);
            case 26:
                return DebugFeatureFlagSettingsFragment.m26857S((DebugFeatureFlagSettingsFragment) this.f94227x, obj);
            case 27:
                return AbstractC26951i.m80541v((InterfaceC23013y) this.f94227x, (Modifier) obj);
            case 28:
                return ClinicianSchedulingConfirmationFragment.m18483E((ClinicianSchedulingConfirmationFragment) this.f94227x, (InterfaceC24586j) obj);
            default:
                return AbstractC26971s.m80802z((C24590l) this.f94227x, (InterfaceC26064q) obj);
        }
    }
}
