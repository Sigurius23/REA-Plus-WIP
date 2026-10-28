package uo1;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import be.C3150c;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import com.whoop.advancedlabs.testresults.view.TestResultsFragment;
import com.whoop.debug.share.ShareDebugFragment;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarFragment;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.MciCyclesFragment;
import com.whoop.impacts.impacts.view.BehaviorImpactFragment;
import com.whoop.nativestore.home.view.NativeStoreFragment;
import com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment;
import com.whoop.streaks.view.StreaksFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kb1.C22325e;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import ls2.AbstractC24716a;
import ls2.C24717b;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import org.json.JSONObject;
import p161g.AbstractC14917t;
import p163g1.EnumC15209z3;
import p208i2.InterfaceC17886g0;
import p329n0.C26068u;
import p478s3.AbstractC32098d;
import p500tb.InterfaceC33687a;
import p537ux.C35329e0;
import p537ux.C35357s0;
import p547v8.AbstractC35785b;
import p579wc.C37074c;
import p579wc.C37105m0;
import p581we.AbstractC37197m;
import p581we.C37187g;
import p599wz.C37735m;
import p599wz.C37770y;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p743vy1.InterfaceC36601c;
import re2.AbstractC31327a;
import ro1.AbstractC31629a;
import ro1.C31630b;
import s40.C32132a;
import s40.C32141d;
import se0.AbstractC32419a;
import se0.C32420b;
import si2.C32547a;
import si2.InterfaceC32548b;
import to1.AbstractC34008a;
import tq1.AbstractC34082a;
import tq1.C34083b;
import uq1.AbstractC35161a;
import us1.C35219b;
import uy1.C35381e;
import v20.C35572l;
import v30.C35599h;
import v30.C35604m;
import v30.InterfaceC35601j;
import v51.AbstractC35703b;
import v51.C35704c;
import vh2.C36050e;
import vn2.C36218c;
import vs2.AbstractC36479e;
import vt2.AbstractC36497f;
import wb3.AbstractC37056f;
import x30.C37895i;
import x30.C37901k;
import x30.C37917p0;
import x30.C37928t;
import x30.C37934w;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: uo1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C35141b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149125w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f149126x;

    public /* synthetic */ C35141b(Object obj, int i13) {
        this.f149125w = i13;
        this.f149126x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f149125w;
        boolean z4 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f149126x;
        switch (i13) {
            case 0:
                return AbstractC35142c.m111142c((C35140a) obj2, (C22325e) obj);
            case 1:
                return ((C35219b) obj2).m111580s((InterfaceC33687a) obj);
            case 2:
                C32132a host = (C32132a) obj;
                AbstractC22676k.m65750j(host, "host");
                ((C35357s0) obj2).getClass();
                return new C35329e0(host);
            case 3:
                return ShareDebugFragment.m20090D((ShareDebugFragment) obj2, (String) obj);
            case 4:
                return NativeStoreFragment.m22943O((NativeStoreFragment) obj2, obj);
            case 5:
                AbstractC14917t addCallback = (AbstractC14917t) obj;
                int i14 = BacsMandateConfirmationActivity.f22387y;
                AbstractC22676k.m65750j(addCallback, "$this$addCallback");
                ((BacsMandateConfirmationActivity) obj2).m16865o().m112770g(C35572l.f151305a);
                return c23454a0;
            case 6:
                return AbstractC35703b.m113158m((C35704c) obj2, (Modifier) obj);
            case 7:
                return TestResultsFragment.m17622O((C32420b) obj2, (AbstractC32419a) obj);
            case 8:
                return TurnoffAlarmWarningFragment.m25921J((TurnoffAlarmWarningFragment) obj2, (AbstractC31327a.a) obj);
            case 9:
                return C36050e.m114466s((C36050e) obj2, (Throwable) obj);
            case 10:
                return C36218c.m115288c((C36218c) obj2, (String) obj);
            case 11:
                return LogCalendarFragment.m21994M((LogCalendarFragment) obj2, (AbstractC34008a) obj);
            case 12:
                return MciCyclesFragment.m22006H((C31630b) obj2, (AbstractC31629a) obj);
            case 13:
                return AbstractC36479e.m116864Z((C26068u) obj2, (InterfaceC17886g0) obj);
            case 14:
                return AbstractC36497f.m116959E((C24717b) obj2, (AbstractC24716a) obj);
            case 15:
                return p743vy1.Function1.m117541C((C35381e) obj2, (InterfaceC36601c) obj);
            case 16:
                C37074c c37074c = (C37074c) obj2;
                C3150c ImdsClient = (C3150c) obj;
                AbstractC22676k.m65750j(ImdsClient, "$this$ImdsClient");
                ImdsClient.m9052b(c37074c.f158606w);
                ImdsClient.m9051a(c37074c.f158608y);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C37105m0 c37105m0 = (C37105m0) obj2;
                C3150c ImdsClient2 = (C3150c) obj;
                AbstractC22676k.m65750j(ImdsClient2, "$this$ImdsClient");
                ImdsClient2.m9052b(c37105m0.f158732x);
                ImdsClient2.m9051a(c37105m0.f158733y);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C37187g c37187g = (C37187g) obj2;
                Map.Entry it = (Map.Entry) obj;
                AbstractC22676k.m65750j(it, "it");
                String str = (String) it.getKey();
                Set set = AbstractC37197m.f159033a;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                if (!set.contains(lowerCase) && ((Boolean) c37187g.f159006e.invoke(str)).booleanValue()) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return StreaksFragment.m26361M((C32547a) obj2, (InterfaceC32548b) obj);
            case 20:
                return BehaviorImpactFragment.m22220J((BehaviorImpactFragment) obj2, (AbstractC35161a) obj);
            case 21:
                return BehaviorImpactFragment.m22221K((C34083b) obj2, (AbstractC34082a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String str2 = (String) obj;
                return new C23465k(str2, ((JSONObject) obj2).get(str2).toString());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC14917t addCallback2 = (AbstractC14917t) obj;
                int i15 = LinkActivity.f22192E;
                AbstractC22676k.m65750j(addCallback2, "$this$addCallback");
                C37770y c37770y = ((LinkActivity) obj2).f22194x;
                if (c37770y != null) {
                    c37770y.m121169l(new C37735m(AbstractC32098d.m99844j(c37770y.f161780x)));
                }
                return c23454a0;
            case 24:
                AbstractC22676k.m65750j((EnumC15209z3) obj, "it");
                return Boolean.valueOf(((C37770y) obj2).f161779w.m11599a().f161694a);
            case 25:
                C23328a entry = (C23328a) obj;
                AbstractC22676k.m65750j(entry, "entry");
                return AbstractC37056f.m118958J(new C23465k(((C37895i) obj2).f162258e, entry));
            case 26:
                String textFieldValue = (String) obj;
                AbstractC22676k.m65750j(textFieldValue, "textFieldValue");
                List list = ((C37901k) obj2).f162281b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (AbstractC39421y.m125930O(textFieldValue, ((C32141d) obj3).f133178w, false)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C32141d) it3.next()).f133179x);
                }
                return (String) AbstractC25265s.m74100H0(arrayList2);
            case 27:
                C37928t c37928t = (C37928t) obj2;
                InterfaceC35601j result = (InterfaceC35601j) obj;
                AbstractC22676k.m65750j(result, "result");
                C35599h c35599h = result instanceof C35599h ? (C35599h) result : null;
                if (c35599h != null) {
                    C35604m c35604m = c35599h.f151372a;
                    Integer num = c35604m.f151376b;
                    Integer num2 = c35604m.f151377c;
                    String str3 = "";
                    c37928t.f162386d.f162235c.mo43573s("");
                    c37928t.f162385c.f162419c.mo43573s(c35604m.f151375a);
                    if (num != null && num2 != null && AbstractC35785b.m113386I(num.intValue(), num2.intValue())) {
                        str3 = num + "/" + (num2.intValue() % 100);
                    }
                    c37928t.f162387e.f57610c.mo43573s(str3);
                }
                return c23454a0;
            case 28:
                C37934w c37934w = (C37934w) obj2;
                InterfaceC35601j it4 = (InterfaceC35601j) obj;
                AbstractC22676k.m65750j(it4, "it");
                c37934w.getClass();
                c37934w.f162399b.f162396c.f162388f.invoke(it4);
                return c23454a0;
            default:
                String it5 = (String) obj;
                AbstractC22676k.m65750j(it5, "it");
                ((C37917p0) obj2).f162347b.getClass();
                return it5;
        }
    }
}
