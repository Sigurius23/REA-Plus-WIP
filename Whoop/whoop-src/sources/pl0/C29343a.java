package pl0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.bot.models.conversation.ActivityRecommendationModel;
import com.whoop.bot.models.conversation.AdditionalContextModel;
import com.whoop.bot.models.conversation.ChatMiniArchWidgetModel;
import com.whoop.bot.models.conversation.CommittedWorkoutRecommendationModel;
import com.whoop.bot.models.conversation.FormWidgetModel;
import com.whoop.bot.models.conversation.HpmlBrowserWidgetModel;
import com.whoop.bot.models.conversation.MxmCreateCaseTileModel;
import com.whoop.bot.models.conversation.RecommendationCarouselModel;
import com.whoop.bot.models.conversation.StrengthTrainerWidgetModel;
import com.whoop.bot.models.conversation.SummaryConfirmationWidgetModel;
import com.whoop.design.models.items.IconMarkdownCalloutModel;
import com.whoop.design.models.items.StartTurnButtonModel;
import com.whoop.p057ai.chat.models.ContextDetailsHeaderModel;
import com.whoop.p057ai.chat.models.ContextStatusToggleModel;
import com.whoop.p057ai.chat.models.HealthSnapshotTileModel;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p218ic.EnumC18371m0;
import p218ic.EnumC18390x;
import p249jc.AbstractC21598x;
import p294l3.AbstractC23265l0;
import p294l3.C23254g;
import p294l3.C23283u0;
import p389p0.C28539n0;
import p412q3.C29891y;
import p420qc.C30207q;
import p457rc.C31222e;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q80.EnumC30029a;
import q80.EnumC30041m;
import q80.EnumC30042n;

/* JADX INFO: renamed from: pl0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C29343a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118905w;

    public /* synthetic */ C29343a(int i13) {
        this.f118905w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        switch (this.f118905w) {
            case 0:
                return AbstractC29345c.m89355M((MarkdownTextWidget) obj);
            case 1:
                return AbstractC29345c.m89356N((SummaryConfirmationWidgetModel) obj);
            case 2:
                return AbstractC29345c.m89357O((StrengthTrainerWidgetModel) obj);
            case 3:
                return AbstractC29345c.m89358P((AdditionalContextModel) obj);
            case 4:
                return AbstractC29345c.m89359Q((ActivityRecommendationModel) obj);
            case 5:
                return AbstractC29345c.m89360R((RecommendationCarouselModel) obj);
            case 6:
                return AbstractC29345c.m89361S((CommittedWorkoutRecommendationModel) obj);
            case 7:
                return AbstractC29345c.m89362T((MxmCreateCaseTileModel) obj);
            case 8:
                return AbstractC29345c.m89346D((IconMarkdownCalloutModel) obj);
            case 9:
                return AbstractC29345c.m89347E((HpmlBrowserWidgetModel) obj);
            case 10:
                return AbstractC29345c.m89348F((ContextDetailsHeaderModel) obj);
            case 11:
                return AbstractC29345c.m89349G((HealthSnapshotTileModel) obj);
            case 12:
                return AbstractC29345c.m89350H((ContextStatusToggleModel) obj);
            case 13:
                return AbstractC29345c.m89351I((StartTurnButtonModel) obj);
            case 14:
                return AbstractC29345c.m89352J((ChatMiniArchWidgetModel) obj);
            case 15:
                return AbstractC29345c.m89353K((FormWidgetModel) obj);
            case 16:
                AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                C28539n0 c28539n0 = AbstractC23265l0.f92165a;
                Boolean bool = Boolean.FALSE;
                C23254g c23254g = (AbstractC22676k.m65745e(obj2, bool) || obj2 == null) ? null : (C23254g) ((Function1) c28539n0.f115463y).invoke(obj2);
                AbstractC22676k.m65747g(c23254g);
                Object obj3 = list.get(1);
                int i13 = C23283u0.f92252c;
                C23283u0 c23283u0 = (AbstractC22676k.m65745e(obj3, bool) || obj3 == null) ? null : (C23283u0) ((Function1) AbstractC23265l0.f92180p.f115463y).invoke(obj3);
                AbstractC22676k.m65747g(c23283u0);
                return new C29891y(c23254g, c23283u0.f92253a, (C23283u0) null);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return EnumC30029a._init_$lambda$0((String) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return EnumC30041m._init_$lambda$0((String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return EnumC30041m._init_$lambda$1((String) obj);
            case 20:
                return EnumC30041m._init_$lambda$2((String) obj);
            case 21:
                return EnumC30042n._init_$lambda$0((String) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return EnumC30042n._init_$lambda$1((String) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        arrayList.add(interfaceC33689cMo68212g1.mo5353J0(0));
                    }
                    interfaceC33689cMo68212g1.close();
                    return arrayList;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g1.close();
                    throw th3;
                }
            case 24:
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection2.mo68212g1("DELETE FROM WorkProgress");
                try {
                    interfaceC33689cMo68212g2.mo5355e1();
                    return C23454a0.f92919a;
                } finally {
                    interfaceC33689cMo68212g2.close();
                }
            case 25:
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g3 = _connection3.mo68212g1("SELECT * FROM workspec WHERE state=1");
                try {
                    int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "id");
                    int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "state");
                    int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "worker_class_name");
                    int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "input_merger_class_name");
                    int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "input");
                    int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "output");
                    int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "initial_delay");
                    int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "interval_duration");
                    int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "flex_duration");
                    int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "run_attempt_count");
                    int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "backoff_policy");
                    int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "backoff_delay_duration");
                    int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "last_enqueue_time");
                    int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "minimum_retention_duration");
                    int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "schedule_requested_at");
                    int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "run_in_foreground");
                    int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "out_of_quota_policy");
                    int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "period_count");
                    int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "generation");
                    int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "next_schedule_time_override");
                    int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "next_schedule_time_override_generation");
                    int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "stop_reason");
                    int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "trace_tag");
                    int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "backoff_on_system_interruptions");
                    int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "required_network_type");
                    int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "required_network_request");
                    int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "requires_charging");
                    int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "requires_device_idle");
                    int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "requires_battery_not_low");
                    int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "requires_storage_not_low");
                    int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "trigger_content_update_delay");
                    int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "trigger_max_content_delay");
                    int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g3, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC33689cMo68212g3.mo5355e1()) {
                        String strMo5353J0 = interfaceC33689cMo68212g3.mo5353J0(iM60658N);
                        int i14 = iM60658N14;
                        ArrayList arrayList3 = arrayList2;
                        EnumC18371m0 enumC18371m0M60407M = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g3.getLong(iM60658N2));
                        String strMo5353J1 = interfaceC33689cMo68212g3.mo5353J0(iM60658N3);
                        String strMo5353J2 = interfaceC33689cMo68212g3.mo5353J0(iM60658N4);
                        byte[] blob = interfaceC33689cMo68212g3.getBlob(iM60658N5);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        C18358g c18358gM88543t2 = AbstractC29125c.m88543t(interfaceC33689cMo68212g3.getBlob(iM60658N6));
                        long j7 = interfaceC33689cMo68212g3.getLong(iM60658N7);
                        long j13 = interfaceC33689cMo68212g3.getLong(iM60658N8);
                        long j14 = interfaceC33689cMo68212g3.getLong(iM60658N9);
                        int i15 = (int) interfaceC33689cMo68212g3.getLong(iM60658N10);
                        int i16 = iM60658N3;
                        int i17 = iM60658N5;
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g3.getLong(iM60658N11));
                        long j15 = interfaceC33689cMo68212g3.getLong(iM60658N12);
                        long j16 = interfaceC33689cMo68212g3.getLong(iM60658N13);
                        long j17 = interfaceC33689cMo68212g3.getLong(i14);
                        int i18 = iM60658N15;
                        long j18 = interfaceC33689cMo68212g3.getLong(i18);
                        int i19 = iM60658N4;
                        int i24 = iM60658N16;
                        boolean z4 = ((int) interfaceC33689cMo68212g3.getLong(i24)) != 0;
                        int i25 = iM60658N17;
                        int i26 = iM60658N2;
                        EnumC18363i0 enumC18363i0M60406L = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g3.getLong(i25));
                        int i27 = iM60658N18;
                        int i28 = (int) interfaceC33689cMo68212g3.getLong(i27);
                        int i29 = iM60658N19;
                        int i34 = (int) interfaceC33689cMo68212g3.getLong(i29);
                        int i35 = iM60658N20;
                        long j19 = interfaceC33689cMo68212g3.getLong(i35);
                        int i36 = iM60658N21;
                        int i37 = (int) interfaceC33689cMo68212g3.getLong(i36);
                        iM60658N21 = i36;
                        iM60658N22 = iM60658N22;
                        int i38 = (int) interfaceC33689cMo68212g3.getLong(iM60658N22);
                        iM60658N23 = iM60658N23;
                        String strMo5353J3 = interfaceC33689cMo68212g3.isNull(iM60658N23) ? null : interfaceC33689cMo68212g3.mo5353J0(iM60658N23);
                        int i39 = iM60658N24;
                        Integer numValueOf = interfaceC33689cMo68212g3.isNull(i39) ? null : Integer.valueOf((int) interfaceC33689cMo68212g3.getLong(i39));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i44 = iM60658N25;
                        EnumC18390x enumC18390xM60405K = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g3.getLong(i44));
                        int i45 = iM60658N26;
                        C31222e c31222eM60434g0 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g3.getBlob(i45));
                        int i46 = iM60658N27;
                        boolean z13 = ((int) interfaceC33689cMo68212g3.getLong(i46)) != 0;
                        int i47 = iM60658N28;
                        boolean z14 = ((int) interfaceC33689cMo68212g3.getLong(i47)) != 0;
                        int i48 = iM60658N29;
                        boolean z15 = ((int) interfaceC33689cMo68212g3.getLong(i48)) != 0;
                        iM60658N29 = i48;
                        int i49 = iM60658N30;
                        int i54 = iM60658N31;
                        int i55 = iM60658N32;
                        iM60658N31 = i54;
                        int i56 = iM60658N33;
                        iM60658N33 = i56;
                        arrayList3.add(new C30207q(strMo5353J0, enumC18371m0M60407M, strMo5353J1, strMo5353J2, c18358gM88543t, c18358gM88543t2, j7, j13, j14, new C18354e(c31222eM60434g0, enumC18390xM60405K, z13, z14, z15, ((int) interfaceC33689cMo68212g3.getLong(i49)) != 0, interfaceC33689cMo68212g3.getLong(i54), interfaceC33689cMo68212g3.getLong(i55), AbstractC21478l0.m60442m(interfaceC33689cMo68212g3.getBlob(i56))), i15, enumC18346aM60404J, j15, j16, j17, j18, z4, enumC18363i0M60406L, i28, i34, j19, i37, i38, strMo5353J3, boolValueOf));
                        arrayList2 = arrayList3;
                        iM60658N3 = i16;
                        iM60658N28 = i47;
                        iM60658N2 = i26;
                        iM60658N17 = i25;
                        iM60658N18 = i27;
                        iM60658N19 = i29;
                        iM60658N20 = i35;
                        iM60658N24 = i39;
                        iM60658N25 = i44;
                        iM60658N26 = i45;
                        iM60658N27 = i46;
                        iM60658N32 = i55;
                        iM60658N30 = i49;
                        iM60658N14 = i14;
                        iM60658N5 = i17;
                        iM60658N4 = i19;
                        iM60658N15 = i18;
                        iM60658N16 = i24;
                        break;
                    }
                    return arrayList2;
                } finally {
                    interfaceC33689cMo68212g3.close();
                }
            case 26:
                InterfaceC33687a _connection4 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection4, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g4 = _connection4.mo68212g1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int iM60658N34 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "id");
                    int iM60658N35 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "state");
                    int iM60658N36 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "worker_class_name");
                    int iM60658N37 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "input_merger_class_name");
                    int iM60658N38 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "input");
                    int iM60658N39 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "output");
                    int iM60658N40 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "initial_delay");
                    int iM60658N41 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "interval_duration");
                    int iM60658N42 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "flex_duration");
                    int iM60658N43 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "run_attempt_count");
                    int iM60658N44 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "backoff_policy");
                    int iM60658N45 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "backoff_delay_duration");
                    int iM60658N46 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "last_enqueue_time");
                    int iM60658N47 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "minimum_retention_duration");
                    int iM60658N48 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "schedule_requested_at");
                    int iM60658N49 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "run_in_foreground");
                    int iM60658N50 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "out_of_quota_policy");
                    int iM60658N51 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "period_count");
                    int iM60658N52 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "generation");
                    int iM60658N53 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "next_schedule_time_override");
                    int iM60658N54 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "next_schedule_time_override_generation");
                    int iM60658N55 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "stop_reason");
                    int iM60658N56 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "trace_tag");
                    int iM60658N57 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "backoff_on_system_interruptions");
                    int iM60658N58 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "required_network_type");
                    int iM60658N59 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "required_network_request");
                    int iM60658N60 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "requires_charging");
                    int iM60658N61 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "requires_device_idle");
                    int iM60658N62 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "requires_battery_not_low");
                    int iM60658N63 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "requires_storage_not_low");
                    int iM60658N64 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "trigger_content_update_delay");
                    int iM60658N65 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "trigger_max_content_delay");
                    int iM60658N66 = AbstractC21598x.m60658N(interfaceC33689cMo68212g4, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (interfaceC33689cMo68212g4.mo5355e1()) {
                        String strMo5353J4 = interfaceC33689cMo68212g4.mo5353J0(iM60658N34);
                        int i57 = iM60658N47;
                        ArrayList arrayList5 = arrayList4;
                        EnumC18371m0 enumC18371m0M60407M2 = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g4.getLong(iM60658N35));
                        String strMo5353J5 = interfaceC33689cMo68212g4.mo5353J0(iM60658N36);
                        String strMo5353J6 = interfaceC33689cMo68212g4.mo5353J0(iM60658N37);
                        byte[] blob2 = interfaceC33689cMo68212g4.getBlob(iM60658N38);
                        C18358g c18358g2 = C18358g.f71479b;
                        C18358g c18358gM88543t3 = AbstractC29125c.m88543t(blob2);
                        C18358g c18358gM88543t4 = AbstractC29125c.m88543t(interfaceC33689cMo68212g4.getBlob(iM60658N39));
                        long j24 = interfaceC33689cMo68212g4.getLong(iM60658N40);
                        long j25 = interfaceC33689cMo68212g4.getLong(iM60658N41);
                        long j26 = interfaceC33689cMo68212g4.getLong(iM60658N42);
                        int i58 = (int) interfaceC33689cMo68212g4.getLong(iM60658N43);
                        int i59 = iM60658N36;
                        int i64 = iM60658N38;
                        EnumC18346a enumC18346aM60404J2 = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g4.getLong(iM60658N44));
                        long j27 = interfaceC33689cMo68212g4.getLong(iM60658N45);
                        long j28 = interfaceC33689cMo68212g4.getLong(iM60658N46);
                        long j29 = interfaceC33689cMo68212g4.getLong(i57);
                        int i65 = iM60658N48;
                        long j34 = interfaceC33689cMo68212g4.getLong(i65);
                        iM60658N48 = i65;
                        int i66 = iM60658N49;
                        boolean z16 = ((int) interfaceC33689cMo68212g4.getLong(i66)) != 0;
                        int i67 = iM60658N37;
                        int i68 = iM60658N50;
                        EnumC18363i0 enumC18363i0M60406L2 = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g4.getLong(i68));
                        int i69 = iM60658N51;
                        int i74 = iM60658N35;
                        int i75 = (int) interfaceC33689cMo68212g4.getLong(i69);
                        iM60658N50 = i68;
                        int i76 = iM60658N52;
                        int i77 = (int) interfaceC33689cMo68212g4.getLong(i76);
                        long j35 = interfaceC33689cMo68212g4.getLong(iM60658N53);
                        int i78 = iM60658N54;
                        int i79 = (int) interfaceC33689cMo68212g4.getLong(i78);
                        iM60658N54 = i78;
                        iM60658N55 = iM60658N55;
                        int i83 = (int) interfaceC33689cMo68212g4.getLong(iM60658N55);
                        iM60658N56 = iM60658N56;
                        String strMo5353J7 = interfaceC33689cMo68212g4.isNull(iM60658N56) ? null : interfaceC33689cMo68212g4.mo5353J0(iM60658N56);
                        int i84 = iM60658N57;
                        Integer numValueOf2 = interfaceC33689cMo68212g4.isNull(i84) ? null : Integer.valueOf((int) interfaceC33689cMo68212g4.getLong(i84));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i85 = iM60658N58;
                        EnumC18390x enumC18390xM60405K2 = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g4.getLong(i85));
                        int i86 = iM60658N59;
                        C31222e c31222eM60434g1 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g4.getBlob(i86));
                        int i87 = iM60658N60;
                        boolean z17 = ((int) interfaceC33689cMo68212g4.getLong(i87)) != 0;
                        int i88 = iM60658N61;
                        boolean z18 = ((int) interfaceC33689cMo68212g4.getLong(i88)) != 0;
                        int i89 = iM60658N62;
                        boolean z19 = ((int) interfaceC33689cMo68212g4.getLong(i89)) != 0;
                        iM60658N62 = i89;
                        int i94 = iM60658N63;
                        int i95 = iM60658N64;
                        int i96 = iM60658N65;
                        iM60658N64 = i95;
                        int i97 = iM60658N66;
                        iM60658N66 = i97;
                        arrayList5.add(new C30207q(strMo5353J4, enumC18371m0M60407M2, strMo5353J5, strMo5353J6, c18358gM88543t3, c18358gM88543t4, j24, j25, j26, new C18354e(c31222eM60434g1, enumC18390xM60405K2, z17, z18, z19, ((int) interfaceC33689cMo68212g4.getLong(i94)) != 0, interfaceC33689cMo68212g4.getLong(i95), interfaceC33689cMo68212g4.getLong(i96), AbstractC21478l0.m60442m(interfaceC33689cMo68212g4.getBlob(i97))), i58, enumC18346aM60404J2, j27, j28, j29, j34, z16, enumC18363i0M60406L2, i75, i77, j35, i79, i83, strMo5353J7, boolValueOf2));
                        iM60658N61 = i88;
                        iM60658N35 = i74;
                        iM60658N51 = i69;
                        iM60658N52 = i76;
                        iM60658N57 = i84;
                        iM60658N58 = i85;
                        iM60658N59 = i86;
                        iM60658N60 = i87;
                        iM60658N65 = i96;
                        iM60658N63 = i94;
                        iM60658N37 = i67;
                        iM60658N47 = i57;
                        iM60658N38 = i64;
                        iM60658N49 = i66;
                        arrayList4 = arrayList5;
                        iM60658N36 = i59;
                        break;
                    }
                    return arrayList4;
                } finally {
                    interfaceC33689cMo68212g4.close();
                }
            case 27:
                InterfaceC33687a _connection5 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection5, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g5 = _connection5.mo68212g1("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    return Boolean.valueOf(interfaceC33689cMo68212g5.mo5355e1() && ((int) interfaceC33689cMo68212g5.getLong(0)) != 0);
                } finally {
                    interfaceC33689cMo68212g5.close();
                }
            case 28:
                InterfaceC33687a _connection6 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection6, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g6 = _connection6.mo68212g1("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    interfaceC33689cMo68212g6.mo5356p(1, 200);
                    int iM60658N67 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "id");
                    int iM60658N68 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "state");
                    int iM60658N69 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "worker_class_name");
                    int iM60658N70 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "input_merger_class_name");
                    int iM60658N71 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "input");
                    int iM60658N72 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "output");
                    int iM60658N73 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "initial_delay");
                    int iM60658N74 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "interval_duration");
                    int iM60658N75 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "flex_duration");
                    int iM60658N76 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "run_attempt_count");
                    int iM60658N77 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "backoff_policy");
                    int iM60658N78 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "backoff_delay_duration");
                    int iM60658N79 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "last_enqueue_time");
                    int iM60658N80 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "minimum_retention_duration");
                    int iM60658N81 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "schedule_requested_at");
                    int iM60658N82 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "run_in_foreground");
                    int iM60658N83 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "out_of_quota_policy");
                    int iM60658N84 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "period_count");
                    int iM60658N85 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "generation");
                    int iM60658N86 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "next_schedule_time_override");
                    int iM60658N87 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "next_schedule_time_override_generation");
                    int iM60658N88 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "stop_reason");
                    int iM60658N89 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "trace_tag");
                    int iM60658N90 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "backoff_on_system_interruptions");
                    int iM60658N91 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "required_network_type");
                    int iM60658N92 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "required_network_request");
                    int iM60658N93 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "requires_charging");
                    int iM60658N94 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "requires_device_idle");
                    int iM60658N95 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "requires_battery_not_low");
                    int iM60658N96 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "requires_storage_not_low");
                    int iM60658N97 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "trigger_content_update_delay");
                    int iM60658N98 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "trigger_max_content_delay");
                    int iM60658N99 = AbstractC21598x.m60658N(interfaceC33689cMo68212g6, "content_uri_triggers");
                    ArrayList arrayList6 = new ArrayList();
                    while (interfaceC33689cMo68212g6.mo5355e1()) {
                        String strMo5353J8 = interfaceC33689cMo68212g6.mo5353J0(iM60658N67);
                        int i98 = iM60658N80;
                        ArrayList arrayList7 = arrayList6;
                        EnumC18371m0 enumC18371m0M60407M3 = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g6.getLong(iM60658N68));
                        String strMo5353J9 = interfaceC33689cMo68212g6.mo5353J0(iM60658N69);
                        String strMo5353J10 = interfaceC33689cMo68212g6.mo5353J0(iM60658N70);
                        byte[] blob3 = interfaceC33689cMo68212g6.getBlob(iM60658N71);
                        C18358g c18358g3 = C18358g.f71479b;
                        C18358g c18358gM88543t5 = AbstractC29125c.m88543t(blob3);
                        C18358g c18358gM88543t6 = AbstractC29125c.m88543t(interfaceC33689cMo68212g6.getBlob(iM60658N72));
                        long j36 = interfaceC33689cMo68212g6.getLong(iM60658N73);
                        long j37 = interfaceC33689cMo68212g6.getLong(iM60658N74);
                        long j38 = interfaceC33689cMo68212g6.getLong(iM60658N75);
                        int i99 = (int) interfaceC33689cMo68212g6.getLong(iM60658N76);
                        int i100 = iM60658N69;
                        int i101 = iM60658N71;
                        EnumC18346a enumC18346aM60404J3 = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g6.getLong(iM60658N77));
                        long j39 = interfaceC33689cMo68212g6.getLong(iM60658N78);
                        long j44 = interfaceC33689cMo68212g6.getLong(iM60658N79);
                        long j45 = interfaceC33689cMo68212g6.getLong(i98);
                        int i102 = iM60658N81;
                        long j46 = interfaceC33689cMo68212g6.getLong(i102);
                        iM60658N81 = i102;
                        int i103 = iM60658N82;
                        boolean z24 = ((int) interfaceC33689cMo68212g6.getLong(i103)) != 0;
                        int i104 = iM60658N70;
                        int i105 = iM60658N83;
                        EnumC18363i0 enumC18363i0M60406L3 = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g6.getLong(i105));
                        int i106 = iM60658N84;
                        int i107 = iM60658N68;
                        int i108 = (int) interfaceC33689cMo68212g6.getLong(i106);
                        iM60658N83 = i105;
                        int i109 = iM60658N85;
                        int i110 = (int) interfaceC33689cMo68212g6.getLong(i109);
                        long j47 = interfaceC33689cMo68212g6.getLong(iM60658N86);
                        int i111 = iM60658N87;
                        int i112 = (int) interfaceC33689cMo68212g6.getLong(i111);
                        iM60658N87 = i111;
                        iM60658N88 = iM60658N88;
                        int i113 = (int) interfaceC33689cMo68212g6.getLong(iM60658N88);
                        iM60658N89 = iM60658N89;
                        String strMo5353J11 = interfaceC33689cMo68212g6.isNull(iM60658N89) ? null : interfaceC33689cMo68212g6.mo5353J0(iM60658N89);
                        int i114 = iM60658N90;
                        Integer numValueOf3 = interfaceC33689cMo68212g6.isNull(i114) ? null : Integer.valueOf((int) interfaceC33689cMo68212g6.getLong(i114));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i115 = iM60658N91;
                        EnumC18390x enumC18390xM60405K3 = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g6.getLong(i115));
                        int i116 = iM60658N92;
                        C31222e c31222eM60434g2 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g6.getBlob(i116));
                        int i117 = iM60658N93;
                        boolean z25 = ((int) interfaceC33689cMo68212g6.getLong(i117)) != 0;
                        int i118 = iM60658N94;
                        boolean z26 = ((int) interfaceC33689cMo68212g6.getLong(i118)) != 0;
                        int i119 = iM60658N95;
                        boolean z27 = ((int) interfaceC33689cMo68212g6.getLong(i119)) != 0;
                        iM60658N95 = i119;
                        int i120 = iM60658N96;
                        int i121 = iM60658N97;
                        int i122 = iM60658N98;
                        iM60658N97 = i121;
                        int i123 = iM60658N99;
                        iM60658N99 = i123;
                        arrayList7.add(new C30207q(strMo5353J8, enumC18371m0M60407M3, strMo5353J9, strMo5353J10, c18358gM88543t5, c18358gM88543t6, j36, j37, j38, new C18354e(c31222eM60434g2, enumC18390xM60405K3, z25, z26, z27, ((int) interfaceC33689cMo68212g6.getLong(i120)) != 0, interfaceC33689cMo68212g6.getLong(i121), interfaceC33689cMo68212g6.getLong(i122), AbstractC21478l0.m60442m(interfaceC33689cMo68212g6.getBlob(i123))), i99, enumC18346aM60404J3, j39, j44, j45, j46, z24, enumC18363i0M60406L3, i108, i110, j47, i112, i113, strMo5353J11, boolValueOf3));
                        iM60658N94 = i118;
                        iM60658N68 = i107;
                        iM60658N84 = i106;
                        iM60658N85 = i109;
                        iM60658N90 = i114;
                        iM60658N91 = i115;
                        iM60658N92 = i116;
                        iM60658N93 = i117;
                        iM60658N98 = i122;
                        iM60658N96 = i120;
                        iM60658N70 = i104;
                        iM60658N80 = i98;
                        iM60658N71 = i101;
                        iM60658N82 = i103;
                        arrayList6 = arrayList7;
                        iM60658N69 = i100;
                        break;
                    }
                    return arrayList6;
                } finally {
                    interfaceC33689cMo68212g6.close();
                }
            default:
                InterfaceC33687a _connection7 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection7, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g7 = _connection7.mo68212g1("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    interfaceC33689cMo68212g7.mo5355e1();
                    return Integer.valueOf(AbstractC21478l0.m60402H(_connection7));
                } finally {
                    interfaceC33689cMo68212g7.close();
                }
        }
    }
}
