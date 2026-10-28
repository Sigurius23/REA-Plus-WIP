package io.getstream.chat.android.p226ui.viewmodel.typing;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import az2.C2174a;
import by2.C3701a;
import c93.InterfaceC4339a;
import com.whoop.achievements.celebration.AchievementCelebrationDialogFragment;
import com.whoop.achievements.celebration.InterfaceC5737b;
import com.whoop.design.models.items.TextInputModel;
import com.whoop.healthspan.view.HealthspanFragment;
import com.whoop.navigation.C9598e;
import com.whoop.sage.onboarding.view.SageOnboardingFragment;
import com.whoop.weightlifting.data.domain.WorkoutSessionState;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import cz2.InterfaceC11265a;
import dk1.AbstractC12112a;
import ec3.C13045h2;
import hk1.AbstractC17387a;
import hk1.C17389c;
import hy2.AbstractC17810a;
import i72.AbstractC18206a;
import i72.C18207b;
import ik1.AbstractC18609f;
import ik1.C18610g;
import io.getstream.chat.android.p226ui.widgets.typing.TypingIndicatorView;
import iu2.C20938b;
import iz0.AbstractC21048g;
import iz2.C21060a;
import j00.AbstractC21106i0;
import j00.C21103h;
import j00.C21108k;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import java.util.List;
import jp1.C21851c;
import jx2.AbstractC22042f;
import kb1.AbstractC22328h;
import kb1.C22325e;
import kb1.C22326f;
import kc2.C22356f;
import kk1.AbstractC22543d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import kr2.AbstractC22813b;
import kr2.EnumC22817f;
import kr2.EnumC22818g;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.sdk.managers.ReconnectPeerListManager;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSRemotePeer;
import lx2.AbstractC24796a;
import ly2.C24803a;
import n00.EnumC26076d;
import ny2.AbstractC27299a;
import p005a3.AbstractC0201g;
import p025b1.C2214e;
import p031b9.C2817b;
import p077d0.C11344e;
import p132f0.C13821r1;
import p134f2.C14015d;
import p181h2.C16618c;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17920x0;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17886g0;
import p208i2.InterfaceC17910s0;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p292l1.AbstractC23141n2;
import p292l1.AbstractC23160q3;
import p292l1.C23154p3;
import p292l1.C23176t1;
import p292l1.DialogC23087e2;
import p309lo.C24560r;
import p354o1.AbstractC27374m;
import p446r1.C30849c;
import p635y2.InterfaceC39130s0;
import p636y3.C39174f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22683n0;
import p716lb1.AbstractC23717t4;
import qx2.C30761a;
import rx2.AbstractC31904a;
import uy2.C35386a;
import vx2.C36560a;
import wx2.AbstractC37687a;
import wy2.AbstractC37698a;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.typing.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19962a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74895w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74896x;

    public /* synthetic */ C19962a(Object obj, int i13) {
        this.f74895w = i13;
        this.f74896x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        C21108k c21108k;
        AbstractC21106i0 abstractC21106i0M58927l;
        String strM65779a;
        switch (this.f74895w) {
            case 0:
                TypingIndicatorViewModelBinding.bindView$lambda$0((TypingIndicatorView) this.f74896x, (List) obj);
                return C23454a0.f92919a;
            case 1:
                return C20938b.m58168E((ActiveWorkout) this.f74896x, (WorkoutSessionState) obj);
            case 2:
                return AbstractC21048g.m58848n0((C13821r1) this.f74896x, (Modifier) obj);
            case 3:
                C21103h c21103h = (C21103h) this.f74896x;
                EnumC26076d signUpState = (EnumC26076d) obj;
                AbstractC22676k.m65750j(signUpState, "signUpState");
                c21103h.f80026S.m36570j(null);
                C13045h2 c13045h2 = c21103h.f80015H;
                do {
                    value = c13045h2.getValue();
                    c21108k = (C21108k) value;
                    int iOrdinal = signUpState.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        abstractC21106i0M58927l = c21108k.f80044a;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractC21106i0M58927l = c21103h.m58927l((String) ((InterfaceC4339a) c21103h.f80023P.f104635y).invoke(), (String) ((InterfaceC4339a) c21103h.f80024Q.f104635y).invoke(), (String) ((InterfaceC4339a) c21103h.f80025R.f104635y).invoke(), c21108k.f80055l);
                    }
                } while (!c13045h2.m36569i(value, C21108k.m58928a(c21108k, abstractC21106i0M58927l, false, false, signUpState, 3070)));
                return C23454a0.f92919a;
            case 4:
                return Boolean.valueOf(ReconnectPeerListManager.manage$lambda$0((HMSNotifications.PeerList) this.f74896x, (HMSRemotePeer) obj));
            case 5:
                return AbstractC22042f.m63051c0((C30761a) this.f74896x, (AbstractC24796a) obj);
            case 6:
                return AbstractC22042f.m63073n0((C24803a) this.f74896x, (AbstractC17810a) obj);
            case 7:
                return AbstractC22042f.m63032M((C21060a) this.f74896x, (InterfaceC11265a) obj);
            case 8:
                return AbstractC22042f.m63035P((C3701a) this.f74896x, (AbstractC37687a) obj);
            case 9:
                return AbstractC22042f.m63081r0((C35386a) this.f74896x, (AbstractC27299a) obj);
            case 10:
                return AbstractC22042f.m63089v0((C2174a) this.f74896x, (AbstractC37698a) obj);
            case 11:
                return AbstractC22042f.m63065j0((C36560a) this.f74896x, (AbstractC31904a) obj);
            case 12:
                return AbstractC22328h.m64211d((C22326f) this.f74896x, (C22325e) obj);
            case 13:
                return C22356f.m64257G((C22356f) this.f74896x, (C9598e) obj);
            case 14:
                return HealthspanFragment.m21656O((C17389c) this.f74896x, (AbstractC17387a) obj);
            case 15:
                return HealthspanFragment.m21657P((HealthspanFragment) this.f74896x, (AbstractC12112a) obj);
            case 16:
                return AbstractC22543d.m65158C((C18610g) this.f74896x, (AbstractC18609f) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C22683n0 c22683n0 = (C22683n0) this.f74896x;
                C21462d0 it = (C21462d0) obj;
                AbstractC22676k.m65750j(it, "it");
                c22683n0.getClass();
                EnumC21464e0 enumC21464e0 = it.f82424a;
                InterfaceC21456a0 interfaceC21456a0 = it.f82425b;
                if (enumC21464e0 == null) {
                    return "*";
                }
                C22683n0 c22683n1 = interfaceC21456a0 instanceof C22683n0 ? (C22683n0) interfaceC21456a0 : null;
                String strValueOf = (c22683n1 == null || (strM65779a = c22683n1.m65779a(true)) == null) ? String.valueOf(interfaceC21456a0) : strM65779a;
                int iOrdinal2 = enumC21464e0.ordinal();
                if (iOrdinal2 == 0) {
                    return strValueOf;
                }
                if (iOrdinal2 == 1) {
                    return "in ".concat(strValueOf);
                }
                if (iOrdinal2 == 2) {
                    return "out ".concat(strValueOf);
                }
                throw new NoWhenBranchMatchedException();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return PluginGeneratedSerialDescriptorKt.toStringImpl$lambda$2((InterfaceC39443g) this.f74896x, ((Integer) obj).intValue());
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Integer.valueOf(AbstractC22813b.m66095v((EnumC22818g) this.f74896x, ((Integer) obj).intValue()));
            case 20:
                return Integer.valueOf(AbstractC22813b.m66091r((EnumC22817f) this.f74896x, ((Integer) obj).intValue()));
            case 21:
                C30849c c30849c = (C30849c) this.f74896x;
                Object[] objArr = c30849c.f127227w;
                int i13 = c30849c.f127229y;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((InterfaceC39130s0) objArr[i14]).mo777b();
                }
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC18041w.m51806e((String) ((C23465k) this.f74896x).f92937w, (InterfaceC18044z) obj);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C23176t1 c23176t1 = (C23176t1) this.f74896x;
                C14015d c14015d = (C14015d) obj;
                float density = c14015d.getDensity() * ((C39174f) c23176t1.f91686Z.m30549e()).f168413w;
                C17891j c17891jM51478a = AbstractC17897m.m51478a();
                InterfaceC17869a1 interfaceC17869a1M67129a = c23176t1.f91685Y;
                if (interfaceC17869a1M67129a == null) {
                    interfaceC17869a1M67129a = AbstractC23160q3.m67129a((C23154p3) AbstractC0201g.m506f(c23176t1, AbstractC23160q3.f91608a), AbstractC27374m.f109923d);
                }
                AbstractC17918w0.m51526n(c17891jM51478a, interfaceC17869a1M67129a.mo39171a(c14015d.f50036w.mo468d(), c14015d.f50036w.getLayoutDirection(), c14015d));
                C17891j c17891jM51478a2 = AbstractC17897m.m51478a();
                InterfaceC17910s0.m51495a(c17891jM51478a2, new C16618c(0.0f, Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() & 4294967295L)) - density, Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() >> 32)), Float.intBitsToFloat((int) (c14015d.f50036w.mo468d() & 4294967295L))));
                C17891j c17891jM51478a3 = AbstractC17897m.m51478a();
                c17891jM51478a3.m51463j(c17891jM51478a2, c17891jM51478a, 1);
                return c14015d.m39910a(new C21851c(18, c17891jM51478a3, c23176t1));
            case 24:
                InterfaceC17886g0 interfaceC17886g0 = (InterfaceC17886g0) obj;
                float fFloatValue = ((Number) ((C11344e) this.f74896x).m30549e()).floatValue();
                float fM67123e = AbstractC23141n2.m67123e(fFloatValue, interfaceC17886g0);
                float fM67124f = AbstractC23141n2.m67124f(fFloatValue, interfaceC17886g0);
                C17920x0 c17920x0 = (C17920x0) interfaceC17886g0;
                c17920x0.m51561r(fM67124f == 0.0f ? 1.0f : fM67123e / fM67124f);
                c17920x0.m51565y(AbstractC23141n2.f91512c);
                return C23454a0.f92919a;
            case 25:
                DialogC23087e2 dialogC23087e2 = (DialogC23087e2) this.f74896x;
                dialogC23087e2.show();
                return new C2214e(dialogC23087e2, 6);
            case 26:
                C2817b this$0 = (C2817b) this.f74896x;
                ((Integer) obj).intValue();
                AbstractC22676k.m65750j(this$0, "this$0");
                ((C24560r) this$0.f11024y).getClass();
                return C23454a0.f92919a;
            case 27:
                return AchievementCelebrationDialogFragment.m17011W((AchievementCelebrationDialogFragment) this.f74896x, (InterfaceC5737b) obj);
            case 28:
                return SageOnboardingFragment.m24424N((C18207b) this.f74896x, (AbstractC18206a) obj);
            default:
                return AbstractC23717t4.m69438h((TextInputModel) this.f74896x, (String) obj);
        }
    }
}
