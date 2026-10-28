package q80;

import a20.C0168h;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaRecorder;
import android.os.Build;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.impl.WorkDatabase;
import b30.C2629t5;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.whoop.advancedlabs.actionplan.view.ActionPlanFragment;
import com.whoop.advancedlabs.testhistory.view.TestHistoryFragment;
import com.whoop.advancedlabsmanagement.view.AdvancedLabsManagementFragment;
import com.whoop.community.presentation.teams.TeamCreateActivity;
import com.whoop.contentsearch.view.ContentSearchFragment;
import com.whoop.debug.experiments.ExperimentsDebugFragment;
import com.whoop.debug.jsonplayground.JsonPlaygroundFragment;
import com.whoop.debug.jsonplayground.JsonPlaygroundResultFragment;
import com.whoop.education.view.EducationFragment;
import com.whoop.journal.model.CurrentCycle;
import com.whoop.realtime.presentation.views.RealTimeStrainDial;
import com.whoop.training.locationsettings.view.LocationSettingsFragment;
import h20.C16622a0;
import h20.C16628b0;
import h20.C16634c0;
import h20.C16671i1;
import h20.C16760x0;
import java.util.LinkedHashMap;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import n83.C26463f;
import p181h2.C16618c;
import p182h3.AbstractC16792h;
import p249jc.C21596v;
import p450r5.RunnableC30928b;
import p461rh.C31424m;
import p475s0.C32036c;
import p479s4.AbstractC32122c;
import p537ux.C35339j0;
import p537ux.C35362x;
import p537ux.C35363y;
import p664yy.C39864i0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q81.AbstractC30043a;
import q81.C30044b;
import qa2.C30114b;
import qm2.C30489f;
import r20.C30866d;
import r20.C30877o;
import ro.C31624i;
import rq0.AbstractC31685o;
import rr1.C31763b;
import s10.C32063e;
import s20.C32077a;
import s23.C32091d;
import s40.C32180t0;
import s40.C32182u0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q80.h */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30036h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122595w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f122596x;

    public /* synthetic */ C30036h(Object obj, int i13) {
        this.f122595w = i13;
        this.f122596x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C16671i1 c16671i1;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i13 = this.f122595w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f122596x;
        switch (i13) {
            case 0:
                return AbstractC30037i.m91963u((C30039k) obj);
            case 1:
                return AbstractC30043a.m91993m((C30044b) obj);
            case 2:
                return C30114b.m92250F((C30114b) obj);
            case 3:
                return TestHistoryFragment.m17601G((TestHistoryFragment) obj);
            case 4:
                return AdvancedLabsManagementFragment.m17728C((AdvancedLabsManagementFragment) obj);
            case 5:
                return LocationSettingsFragment.m26550B((LocationSettingsFragment) obj);
            case 6:
                return Boolean.valueOf(C30489f.m93355Q((C30489f) obj));
            case 7:
                return ExperimentsDebugFragment.m20053C((ExperimentsDebugFragment) obj);
            case 8:
                return (C16618c) obj;
            case 9:
                ((C30866d) obj).m94920c();
                return c23454a0;
            case 10:
                ((C30877o) obj).f127314w.m7515b(C2629t5.f10246b);
                return c23454a0;
            case 11:
                return RealTimeStrainDial.m24167n((RealTimeStrainDial) obj);
            case 12:
                C21596v c21596v = (C21596v) obj;
                WorkDatabase workDatabase = c21596v.f82807c;
                AbstractC22676k.m65749i(workDatabase, "getWorkDatabase(...)");
                workDatabase.runInTransaction(new RunnableC30928b(6, workDatabase, c21596v));
                return c23454a0;
            case 13:
                return EducationFragment.m21367M((EducationFragment) obj);
            case 14:
                return AbstractC37056f.m118958J((C23465k) obj);
            case 15:
                C31624i c31624i = new C31624i(3);
                Context context = ((C31424m) obj).f129291a;
                double d3 = 0.2d;
                try {
                    Object systemService = AbstractC32122c.getSystemService(context, ActivityManager.class);
                    AbstractC22676k.m65747g(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d3 = 0.15d;
                    }
                } catch (Exception unused) {
                }
                c31624i.m97715w(context, d3);
                return c31624i.m97711p();
            case 16:
                return TeamCreateActivity.m19435P((TeamCreateActivity) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC31685o.m98184R((AbstractC31685o) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C31763b.m98616u((CurrentCycle) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ContentSearchFragment.m19652B((ContentSearchFragment) obj);
            case 20:
                return JsonPlaygroundFragment.m20062G((JsonPlaygroundFragment) obj);
            case 21:
                return JsonPlaygroundResultFragment.m20069E((JsonPlaygroundResultFragment) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C32036c c32036c = (C32036c) obj;
                c32036c.f132906m0.invoke(Boolean.valueOf(true ^ c32036c.f132905l0));
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC29840y abstractC29840y = (AbstractC29840y) ((C32063e) obj).f132967b.f132973b.f45200w.getValue();
                if (abstractC29840y instanceof C29822i) {
                    return new C16628b0((C29822i) abstractC29840y);
                }
                if (abstractC29840y instanceof C29818g) {
                    return new C16622a0((C29818g) abstractC29840y);
                }
                if (abstractC29840y instanceof AbstractC29835t) {
                    return new C16634c0((AbstractC29835t) abstractC29840y);
                }
                return null;
            case 24:
                C32077a c32077a = (C32077a) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (c32077a.f133030i.f64186E && (c16671i1 = c32077a.f133026e) != null) {
                    C16760x0 c16760x0 = c16671i1.f64114w;
                    String str7 = c16671i1.f64116y;
                    if (str7 != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.Name, str7);
                    }
                    String str8 = c16671i1.f64115x;
                    if (str8 != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.Email, str8);
                    }
                    String str9 = c16671i1.f64117z;
                    if (str9 != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.Phone, str9);
                    }
                    if (c16760x0 != null && (str6 = c16760x0.f64400y) != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.Line1, str6);
                    }
                    if (c16760x0 != null && (str5 = c16760x0.f64401z) != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.Line2, str5);
                    }
                    if (c16760x0 != null && (str4 = c16760x0.f64398w) != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.City, str4);
                    }
                    if (c16760x0 != null && (str3 = c16760x0.f64397F) != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.State, str3);
                    }
                    if (c16760x0 != null && (str2 = c16760x0.f64396E) != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.PostalCode, str2);
                    }
                    if (c16760x0 != null && (str = c16760x0.f64399x) != null) {
                        IdentifierSpec.Companion.getClass();
                        linkedHashMap.put(IdentifierSpec.Country, str);
                    }
                }
                return AbstractC25247g0.m74001j0(linkedHashMap);
            case 25:
                return Build.VERSION.SDK_INT < 31 ? new MediaRecorder() : AbstractC16792h.m47338a(((C32091d) obj).f133074a);
            case 26:
                Context context2 = (Context) ((C0168h) obj).f500b;
                AbstractC22676k.m65750j(context2, "context");
                C35363y c35363y = C35363y.f150632y;
                if (c35363y == null) {
                    SharedPreferences sharedPreferences = new C35362x(context2).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    C35363y c35363y2 = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y2 == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y2;
                    c35363y = c35363y2;
                }
                return c35363y.f150633w;
            case 27:
                int i14 = PaymentAuthWebViewActivity.f22551E;
                ((C32182u0) obj).f133291g = true;
                return c23454a0;
            case 28:
                C26463f c26463f = new C26463f();
                String str10 = ((C32180t0) obj).f133272w.f172024N;
                if (str10 != null) {
                    c26463f.put("Referer", str10);
                }
                C26463f c26463fM78380b = c26463f.m78380b();
                C39864i0 c39864i0 = new C39864i0();
                String str11 = C35339j0.f150551c;
                return AbstractC25247g0.m73995d0(c39864i0.m127937a(null), c26463fM78380b);
            default:
                return ActionPlanFragment.m17258F((ActionPlanFragment) obj);
        }
    }
}
