package vv1;

import ad3.C0775r;
import android.content.Context;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.attestation.AttestationActivity;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.whoop.achievements.view.AchievementsFragment;
import com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment;
import com.whoop.community.CommunityFragment;
import com.whoop.community.CommunityManageTeamFragment;
import com.whoop.debug.whoopble.WhoopBleDebugFragment;
import com.whoop.entitlements.p060ui.NotFoundFragment;
import com.whoop.feedbacksurvey.view.FeedbackSurveyFragment;
import com.whoop.impacts.impacts.view.BehaviorImpactFragment;
import com.whoop.membership.dunning.DunningBottomSheetFragment;
import com.whoop.streaks.view.StreaksFragment;
import j93.InterfaceC21456a0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p048ce.C4469j;
import p114eb.C12953f;
import p132f0.C13774c;
import p319m4.AbstractC25012a;
import p564vx.C36549a;
import p564vx.C36550b;
import p564vx.InterfaceC36551c;
import p579wc.C37111p0;
import p579wc.C37124w;
import p580wd.C37160m;
import p581we.C37193j;
import p597wx.C37678g;
import p599wz.AbstractC37713e1;
import p599wz.AbstractC37740n1;
import p599wz.C37770y;
import p605x6.C37999d;
import p664yy.AbstractC39851c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22667f0;
import p715kotlin.time.Duration;
import q30.C29938w0;
import q83.InterfaceC30057d;
import ug.C34913b;
import ug.EnumC34931t;
import ve.C35920e;
import vv2.AbstractC36539e;
import vv2.C36535a;
import w01.AbstractC36682g;
import w01.C36683h;
import w40.AbstractC36799b;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import y40.C39204a;
import z10.AbstractC39982e;

/* JADX INFO: renamed from: vv1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36532c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156407w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f156408x;

    public /* synthetic */ C36532c(Object obj, int i13) {
        this.f156407w = i13;
        this.f156408x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f156407w) {
            case 0:
                return DunningBottomSheetFragment.m22625L((DunningBottomSheetFragment) this.f156408x);
            case 1:
                return AbstractC36539e.m117092B((C36535a) this.f156408x);
            case 2:
                C1601k1 c1601k1 = (C1601k1) this.f156408x;
                InterfaceC36551c interfaceC36551c = (InterfaceC36551c) c1601k1.m5001b("STRIPE_ANALYTICS_LOCAL_SESSION");
                if (interfaceC36551c != null) {
                    if (interfaceC36551c instanceof C36550b) {
                        UUID uuidRandomUUID = UUID.randomUUID();
                        UUID uuid = AbstractC39851c.f172106g;
                        AbstractC22676k.m65747g(uuidRandomUUID);
                        AbstractC39851c.f172106g = uuidRandomUUID;
                        String string = uuidRandomUUID.toString();
                        AbstractC22676k.m65749i(string, "toString(...)");
                        c1601k1.m5004e(new C36550b(string), "STRIPE_ANALYTICS_LOCAL_SESSION");
                    } else if (!(interfaceC36551c instanceof C36549a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return C23454a0.f92919a;
            case 3:
                return WhoopBleDebugFragment.m20095C((WhoopBleDebugFragment) this.f156408x);
            case 4:
                return AbstractC36682g.m117715C((C36683h) this.f156408x);
            case 5:
                return AchievementsFragment.m17045C((AchievementsFragment) this.f156408x);
            case 6:
                C35920e c35920e = (C35920e) this.f156408x;
                StringBuilder sb4 = new StringBuilder("obtained credentials from container metadata service; expiration=");
                C34913b c34913bM114099a = c35920e.m114099a();
                sb4.append(c34913bM114099a != null ? c34913bM114099a.m110113b(EnumC34931t.f147048w) : null);
                return sb4.toString();
            case 7:
                return AbstractC25012a.m73377j(new StringBuilder("Attempting to load token using token provider for login-session: `"), ((C37124w) this.f156408x).f158821w, '`');
            case 8:
                return AbstractC25012a.m73377j(new StringBuilder("Loading credentials from profile `"), ((C4469j) this.f156408x).m13961a().f17994a, '`');
            case 9:
                return "Assuming role `" + ((C37160m) this.f156408x).m119083b() + '`';
            case 10:
                return AbstractC25012a.m73377j(new StringBuilder("Attempting to load token using token provider for sso-session: `"), ((C37111p0) this.f156408x).f158755E, '`');
            case 11:
                return ((InterfaceC21456a0) ((ArrayList) this.f156408x).get(0)).getClassifier();
            case 12:
                return "Canonical request:\n" + ((C37193j) this.f156408x).m119190b();
            case 13:
                return StreaksFragment.m26357I((StreaksFragment) this.f156408x);
            case 14:
                return BehaviorImpactFragment.m22217G((BehaviorImpactFragment) this.f156408x);
            case 15:
                return ((AttestationActivity) this.f156408x).f22139w;
            case 16:
                return ((C37678g) this.f156408x).f161430w;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC37713e1 abstractC37713e1 = (AbstractC37713e1) this.f156408x;
                List list = abstractC37713e1.f161581b;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C12953f) it.next()).f44731a);
                }
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Object obj : arrayList) {
                    linkedHashMap.put(obj, "{" + ((String) obj) + "}");
                }
                return AbstractC37740n1.m121154c(abstractC37713e1.f161580a, linkedHashMap);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C37770y) this.f156408x).m121170n();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((AbstractC39982e) this.f156408x).mo128209i();
            case 20:
                C37999d c37999d = (C37999d) this.f156408x;
                long jLongValue = ((Number) c37999d.f162779x.invoke()).longValue();
                C22667f0 c22667f0 = new C22667f0();
                C22667f0 c22667f1 = new C22667f0();
                synchronized (c37999d.f162781z) {
                    c22667f0.f89335w = jLongValue - c37999d.f162776F;
                    c22667f1.f89335w = 1000000000 / ((long) c37999d.f162775E);
                }
                AbstractC3006f0.m8732z(c37999d.f162778w, null, null, new C13774c(c22667f0, c22667f1, c37999d, jLongValue, (InterfaceC30057d) null), 3);
                return C23454a0.f92919a;
            case 21:
                return InsightsDeepDiveFragment.m17470F((InsightsDeepDiveFragment) this.f156408x);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CommunityFragment.m18845E0((CommunityFragment) this.f156408x);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CommunityManageTeamFragment.m19048V0((CommunityManageTeamFragment) this.f156408x);
            case 24:
                Context context = ((C39204a) this.f156408x).f168488w;
                try {
                    ArrayListSerializer arrayListSerializerM122333a = AbstractC38195a.m122333a(StringSerializer.INSTANCE);
                    ArrayList arrayListM124887a = C39204a.m124887a(context.getPackageName(), context.getPackageCodePath());
                    C0775r c0775r = AbstractC36799b.f157426a;
                    return AbstractC36799b.f157426a.m1833d(arrayListSerializerM122333a, arrayListM124887a);
                } catch (IOException unused) {
                    Log.d("JSDI", "Cannot build debugInfo");
                    return "[]";
                }
            case 25:
                HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) this.f156408x;
                InterfaceC37138c serializer = HCaptchaConfig.Companion.serializer();
                C0775r c0775r2 = AbstractC36799b.f157426a;
                AbstractC22676k.m65750j(serializer, "serializer");
                return AbstractC36799b.f157426a.m1833d(serializer, hCaptchaConfig);
            case 26:
                return "applying clock skew " + ((Object) Duration.m134302toStringimpl(((Duration) this.f156408x).getRawValue())) + " to client";
            case 27:
                return NotFoundFragment.m21403F((NotFoundFragment) this.f156408x);
            case 28:
                return FeedbackSurveyFragment.m21419C((FeedbackSurveyFragment) this.f156408x);
            default:
                return ((Context) ((C29938w0) this.f156408x).f122260x).getSharedPreferences("StripeAnalyticsRequestV2Storage", 0);
        }
    }
}
