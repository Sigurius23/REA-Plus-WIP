package pf;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import b30.C2550j3;
import b30.C2600p5;
import bc3.InterfaceC3056s0;
import bg.InterfaceC3212g;
import com.whoop.advancedlabs.testhistory.view.TestHistoryFragment;
import com.whoop.aiinsights.AiInsightsFragment;
import com.whoop.challengedetails.view.ChallengeDetailsFragment;
import com.whoop.community.presentation.teams.TeamCreateActivity;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.C10535e;
import com.whoop.realtime.presentation.views.RealTimeStrainDial;
import com.whoop.realtime.presentation.views.StrainCoachGoalPicker;
import com.whoop.stress.view.StressMonitorFragment;
import d30.C11570x;
import e93.AbstractC12889b;
import f41.C14063a;
import ii0.AbstractC18533a;
import iq1.InterfaceC20850c;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import ln0.C24521a;
import ln0.InterfaceC24522b;
import m83.AbstractC25247g0;
import mg.InterfaceC25526h;
import mj0.EnumC25613b;
import mn0.InterfaceC25707a;
import mq1.C25886a;
import ne0.AbstractC26596a;
import ne0.C26597b;
import nk0.InterfaceC26794a;
import ou1.C28376a;
import p002a0.C0022g;
import p040c0.InterfaceC3770q;
import p180h0.InterfaceC16413k2;
import p208i2.InterfaceC17906q0;
import p209i3.InterfaceC18044z;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18371m0;
import p270k2.InterfaceC22131e;
import p329n0.InterfaceC26064q;
import p409q0.AbstractC29701y;
import p409q0.C29681e0;
import p420qc.C30206p;
import p420qc.C30211u;
import p459rf.C31346q;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.AbstractC30593b;
import p741vn1.EnumC36205i;
import pq1.AbstractC29482f;
import q80.C30036h;
import q81.AbstractC30049g;
import q92.AbstractC30072d;
import qj0.AbstractC30426h;
import qj0.C30419a;
import qm2.AbstractC30495l;
import qm2.C30489f;
import qm2.C30502s;
import qx0.AbstractC30751g;
import qx0.C30753i;
import r20.C30871i;
import r20.C30873k;
import r20.C30877o;
import r71.AbstractC31052b;
import r71.C31053c;
import rf2.C31361c;
import rk2.C31500d;
import rm1.AbstractC31592f;
import rm2.AbstractC31605e;
import rq0.AbstractC31685o;
import rq0.C31707z;
import uh0.AbstractC34963a;
import uh0.C34964b;
import w20.C36715e;
import w20.C36735y;
import w20.InterfaceC36716f;

/* JADX INFO: renamed from: pf.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C29124b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117889w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f117890x;

    public /* synthetic */ C29124b(Object obj, int i13) {
        this.f117889w = i13;
        this.f117890x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i13 = this.f117889w;
        int i14 = 10;
        int i15 = 1;
        int i16 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f117890x;
        switch (i13) {
            case 0:
                ((InterfaceC3056s0) obj2).dispose();
                return c23454a0;
            case 1:
                ((AbstractC29128f) obj2).shutdown();
                return c23454a0;
            case 2:
                AbstractC29131i abstractC29131i = (AbstractC29131i) obj2;
                InterfaceC29129g interfaceC29129g = (InterfaceC29129g) obj;
                AbstractC22676k.m65750j(interfaceC29129g, "<this>");
                AbstractC29130h abstractC29130h = (AbstractC29130h) interfaceC29129g;
                abstractC29130h.f117901a = abstractC29131i.f117910a;
                abstractC29130h.f117902b = abstractC29131i.f117911b;
                abstractC29130h.f117903c = abstractC29131i.f117912c;
                abstractC29130h.f117904d = abstractC29131i.f117913d;
                abstractC29130h.f117905e = abstractC29131i.f117914e;
                abstractC29130h.f117906f = abstractC29131i.f117915f;
                InterfaceC29142t interfaceC29142t = abstractC29131i.f117916g;
                AbstractC22676k.m65750j(interfaceC29142t, "<set-?>");
                abstractC29130h.f117907g = interfaceC29142t;
                InterfaceC3212g interfaceC3212g = abstractC29131i.f117917h;
                AbstractC22676k.m65750j(interfaceC3212g, "<set-?>");
                abstractC29130h.f117908h = interfaceC3212g;
                C29144v c29144v = abstractC29131i.f117918i;
                AbstractC22676k.m65750j(c29144v, "<set-?>");
                abstractC29130h.f117909i = c29144v;
                InterfaceC25526h interfaceC25526h = abstractC29131i.f117919j;
                AbstractC22676k.m65750j(interfaceC25526h, "<set-?>");
                ((C31346q) interfaceC29129g).f128982k = interfaceC25526h;
                return c23454a0;
            case 3:
                return AiInsightsFragment.m17852T((C34964b) obj2, (AbstractC34963a) obj);
            case 4:
                return StressMonitorFragment.m26419U((StressMonitorFragment) obj2, ((Integer) obj).intValue());
            case 5:
                return ChallengeDetailsFragment.m18408I((ChallengeDetailsFragment) obj2, (InterfaceC25707a) obj);
            case 6:
                return ChallengeDetailsFragment.m18409J((C24521a) obj2, (InterfaceC24522b) obj);
            case 7:
                return AbstractC29482f.m90044j((C25886a) obj2, (InterfaceC20850c) obj);
            case 8:
                float fFloatValue = ((Float) obj).floatValue();
                AbstractC29701y abstractC29701y = ((C29681e0) obj2).f121311b;
                abstractC29701y.f121448s.m87025y(abstractC29701y.m91161j(abstractC29701y.m91162k() + AbstractC12889b.m36258X(abstractC29701y.m91165o() != 0 ? fFloatValue / abstractC29701y.m91165o() : 0.0f)));
                return c23454a0;
            case 9:
                return AbstractC30049g.m92050s((InterfaceC17906q0) obj2, (InterfaceC22131e) obj);
            case 10:
                return AbstractC30072d.m92177x((InterfaceC26794a.a) obj2, ((Byte) obj).byteValue());
            case 11:
                C30211u c30211u = (C30211u) obj2;
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                String str = "getValue(...)";
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    interfaceC33689cMo68212g1.mo5354L(1, "SavingWorkoutInBackgroundWorker");
                    C0022g c0022g = new C0022g(0);
                    C0022g c0022g2 = new C0022g(0);
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(0);
                        if (!c0022g.containsKey(strMo5353J0)) {
                            c0022g.put(strMo5353J0, new ArrayList());
                        }
                        String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(0);
                        if (!c0022g2.containsKey(strMo5353J1)) {
                            c0022g2.put(strMo5353J1, new ArrayList());
                        }
                    }
                    interfaceC33689cMo68212g1.reset();
                    c30211u.m92431b(_connection, c0022g);
                    c30211u.m92430a(_connection, c0022g2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                        EnumC18371m0 enumC18371m0M60407M = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g1.getLong(i15));
                        byte[] blob = interfaceC33689cMo68212g1.getBlob(2);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        int i17 = (int) interfaceC33689cMo68212g1.getLong(3);
                        ArrayList arrayList2 = arrayList;
                        int i18 = (int) interfaceC33689cMo68212g1.getLong(4);
                        long j7 = interfaceC33689cMo68212g1.getLong(14);
                        long j13 = interfaceC33689cMo68212g1.getLong(15);
                        long j14 = interfaceC33689cMo68212g1.getLong(16);
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g1.getLong(17));
                        long j15 = interfaceC33689cMo68212g1.getLong(18);
                        long j16 = interfaceC33689cMo68212g1.getLong(19);
                        int i19 = (int) interfaceC33689cMo68212g1.getLong(20);
                        long j17 = interfaceC33689cMo68212g1.getLong(21);
                        int i24 = (int) interfaceC33689cMo68212g1.getLong(22);
                        String str2 = str;
                        C18354e c18354e = new C18354e(AbstractC21478l0.m60434g0(interfaceC33689cMo68212g1.getBlob(6)), AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g1.getLong(5)), ((int) interfaceC33689cMo68212g1.getLong(7)) != 0, ((int) interfaceC33689cMo68212g1.getLong(8)) != 0, ((int) interfaceC33689cMo68212g1.getLong(9)) != 0, ((int) interfaceC33689cMo68212g1.getLong(10)) != 0, interfaceC33689cMo68212g1.getLong(11), interfaceC33689cMo68212g1.getLong(12), AbstractC21478l0.m60442m(interfaceC33689cMo68212g1.getBlob(13)));
                        Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(0), c0022g);
                        AbstractC22676k.m65749i(objM73986U, str2);
                        List list = (List) objM73986U;
                        Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(0), c0022g2);
                        AbstractC22676k.m65749i(objM73986U2, str2);
                        arrayList2.add(new C30206p(strMo5353J2, enumC18371m0M60407M, c18358gM88543t, j7, j13, j14, c18354e, i17, enumC18346aM60404J, j15, j16, i19, i18, j17, i24, list, (List) objM73986U2));
                        i16 = 0;
                        str = str2;
                        i15 = 1;
                        arrayList = arrayList2;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 12:
                return TestHistoryFragment.m17604J((C26597b) obj2, (AbstractC26596a) obj);
            case 13:
                return C30419a.m92986c((AbstractC30426h) obj2, (EnumC25613b) obj);
            case 14:
                return C30489f.m93360i0((C30489f) obj2, (C30502s) obj);
            case 15:
                return C10535e.m27148B((C10535e) obj2, (AbstractC30495l) obj);
            case 16:
                return AbstractC30593b.m93842f((C14063a) obj2, (InterfaceC26064q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC30751g.m94460o((C30753i) obj2, (InterfaceC26064q) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC36716f complete = (InterfaceC36716f) obj;
                AbstractC22676k.m65750j(complete, "complete");
                return new C2550j3(((C36735y) ((C30871i) obj2).f127294w.f157193c.f45200w.getValue()).f157237b, false, complete instanceof C36715e, new C28376a(7));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C11570x state = (C11570x) obj;
                AbstractC22676k.m65750j(state, "state");
                return state.m31000b(((C30873k) obj2).f127304w);
            case 20:
                C30877o c30877o = (C30877o) obj2;
                C2600p5 state2 = (C2600p5) obj;
                AbstractC22676k.m65750j(state2, "state");
                boolean z4 = c30877o.f127314w.f10140m;
                boolean z13 = state2.f10121c;
                return new C2550j3(!z4, state2.f10123e, z13, new C30036h(c30877o, i14));
            case 21:
                return RealTimeStrainDial.m24166m((RealTimeStrainDial) obj2, ((Float) obj).floatValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return StrainCoachGoalPicker.m24186C((StrainCoachGoalPicker) obj2, ((Float) obj).floatValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC31052b.m95586m((C31053c) obj2, (InterfaceC18044z) obj);
            case 24:
                return ((C31361c) obj2).m96453u((InterfaceC33687a) obj);
            case 25:
                return ((C31500d) obj2).m97057k((InterfaceC33687a) obj);
            case 26:
                return AbstractC31592f.m97393q((EnumC36205i) obj2, (InterfaceC3770q) obj);
            case 27:
                return AbstractC31605e.m97579U((AbstractC18533a) obj2, (Context) obj);
            case 28:
                return TeamCreateActivity.m19433K((TeamCreateActivity) obj2, (C31707z) obj);
            default:
                return AbstractC31685o.m98183M((AbstractC31685o) obj2, (C31707z) obj);
        }
    }

    public /* synthetic */ C29124b(C29681e0 c29681e0, InterfaceC16413k2 interfaceC16413k2) {
        this.f117889w = 8;
        this.f117890x = c29681e0;
    }
}
