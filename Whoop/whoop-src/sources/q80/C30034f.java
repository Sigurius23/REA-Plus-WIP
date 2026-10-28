package q80;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.circularprogressindicator.CircularProgressIndicatorModel;
import h80.InterfaceC17002b;
import j80.InterfaceC21414b;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import l80.AbstractC23438o;
import l83.C23454a0;
import ob0.AbstractC27789a;
import p097ds.AbstractC12313p;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p218ic.EnumC18371m0;
import p218ic.EnumC18390x;
import p249jc.AbstractC21598x;
import p420qc.C30207q;
import p457rc.C31222e;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import pb0.AbstractC29052c;
import pf.AbstractC29125c;
import q81.C30044b;
import qb0.AbstractC30180b;
import qb1.AbstractC30181a;
import qc3.AbstractC30222a;
import qc3.AbstractC30238f0;
import qc3.AbstractC30284z;
import qc3.C30223a0;
import qc3.C30235e0;
import qc3.C30265p0;
import qc3.C30266q;
import qc3.C30282y;
import qc3.C30283y0;
import qc3.EnumC30263o0;
import qc3.InterfaceC30231d;
import qc3.InterfaceC30258m;
import sc3.C32389c;

/* JADX INFO: renamed from: q80.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C30034f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122583w;

    public /* synthetic */ C30034f(int i13) {
        this.f122583w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f122583w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC30037i.m91956n((InterfaceC21414b) obj);
            case 1:
                return AbstractC30037i.m91957o((AbstractC23438o) obj);
            case 2:
                return AbstractC30037i.m91935A((InterfaceC4339a) obj);
            case 3:
                return AbstractC30037i.m91936B((InterfaceC17002b) obj);
            case 4:
                return EnumC30040l._init_$lambda$0((String) obj);
            case 5:
                return C30044b.m91999b(((Integer) obj).intValue());
            case 6:
                return AbstractC30180b.m92391r((AbstractC27789a) obj);
            case 7:
                return AbstractC30180b.m92392s((AbstractC29052c) obj);
            case 8:
                return AbstractC30180b.m92384k((AbstractC27789a) obj);
            case 9:
                return AbstractC30180b.m92385l((AbstractC29052c) obj);
            case 10:
                return AbstractC30181a.m92396c((C23749z0) obj);
            case 11:
                return AbstractC30181a.m92397d((CircularProgressIndicatorModel) obj);
            case 12:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
                    int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "state");
                    int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "worker_class_name");
                    int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "input_merger_class_name");
                    int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "input");
                    int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "output");
                    int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "initial_delay");
                    int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "interval_duration");
                    int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "flex_duration");
                    int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "run_attempt_count");
                    int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "backoff_policy");
                    int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "backoff_delay_duration");
                    int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "last_enqueue_time");
                    int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "minimum_retention_duration");
                    int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "schedule_requested_at");
                    int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "run_in_foreground");
                    int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "out_of_quota_policy");
                    int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "period_count");
                    int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "generation");
                    int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "next_schedule_time_override");
                    int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "next_schedule_time_override_generation");
                    int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "stop_reason");
                    int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "trace_tag");
                    int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "backoff_on_system_interruptions");
                    int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "required_network_type");
                    int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "required_network_request");
                    int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "requires_charging");
                    int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "requires_device_idle");
                    int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "requires_battery_not_low");
                    int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "requires_storage_not_low");
                    int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "trigger_content_update_delay");
                    int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "trigger_max_content_delay");
                    int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                        int i14 = iM60658N;
                        ArrayList arrayList2 = arrayList;
                        EnumC18371m0 enumC18371m0M60407M = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g1.getLong(iM60658N2));
                        String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                        String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                        byte[] blob = interfaceC33689cMo68212g1.getBlob(iM60658N5);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        C18358g c18358gM88543t2 = AbstractC29125c.m88543t(interfaceC33689cMo68212g1.getBlob(iM60658N6));
                        long j7 = interfaceC33689cMo68212g1.getLong(iM60658N7);
                        long j13 = interfaceC33689cMo68212g1.getLong(iM60658N8);
                        long j14 = interfaceC33689cMo68212g1.getLong(iM60658N9);
                        int i15 = (int) interfaceC33689cMo68212g1.getLong(iM60658N10);
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g1.getLong(iM60658N11));
                        long j15 = interfaceC33689cMo68212g1.getLong(iM60658N12);
                        long j16 = interfaceC33689cMo68212g1.getLong(iM60658N13);
                        long j17 = interfaceC33689cMo68212g1.getLong(iM60658N14);
                        int i16 = iM60658N15;
                        long j18 = interfaceC33689cMo68212g1.getLong(i16);
                        int i17 = iM60658N2;
                        int i18 = iM60658N16;
                        int i19 = iM60658N3;
                        boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i18)) != 0;
                        int i24 = iM60658N17;
                        EnumC18363i0 enumC18363i0M60406L = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g1.getLong(i24));
                        int i25 = iM60658N18;
                        int i26 = iM60658N13;
                        int i27 = (int) interfaceC33689cMo68212g1.getLong(i25);
                        int i28 = iM60658N19;
                        int i29 = (int) interfaceC33689cMo68212g1.getLong(i28);
                        int i34 = iM60658N20;
                        long j19 = interfaceC33689cMo68212g1.getLong(i34);
                        int i35 = iM60658N21;
                        int i36 = (int) interfaceC33689cMo68212g1.getLong(i35);
                        int i37 = iM60658N22;
                        int i38 = (int) interfaceC33689cMo68212g1.getLong(i37);
                        int i39 = iM60658N23;
                        Boolean boolValueOf = null;
                        String strMo5353J3 = interfaceC33689cMo68212g1.isNull(i39) ? null : interfaceC33689cMo68212g1.mo5353J0(i39);
                        int i44 = iM60658N24;
                        Integer numValueOf = interfaceC33689cMo68212g1.isNull(i44) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i44));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i45 = iM60658N25;
                        Boolean bool = boolValueOf;
                        EnumC18390x enumC18390xM60405K = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g1.getLong(i45));
                        int i46 = iM60658N26;
                        C31222e c31222eM60434g0 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g1.getBlob(i46));
                        int i47 = iM60658N27;
                        boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i47)) != 0;
                        int i48 = iM60658N28;
                        boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                        int i49 = iM60658N29;
                        boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i49)) != 0;
                        int i54 = iM60658N30;
                        int i55 = iM60658N31;
                        int i56 = iM60658N32;
                        iM60658N31 = i55;
                        int i57 = iM60658N33;
                        C30207q c30207q = new C30207q(strMo5353J0, enumC18371m0M60407M, strMo5353J1, strMo5353J2, c18358gM88543t, c18358gM88543t2, j7, j13, j14, new C18354e(c31222eM60434g0, enumC18390xM60405K, z13, z14, z15, ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0, interfaceC33689cMo68212g1.getLong(i55), interfaceC33689cMo68212g1.getLong(i56), AbstractC21478l0.m60442m(interfaceC33689cMo68212g1.getBlob(i57))), i15, enumC18346aM60404J, j15, j16, j17, j18, z4, enumC18363i0M60406L, i27, i29, j19, i36, i38, strMo5353J3, bool);
                        iM60658N33 = i57;
                        iM60658N32 = i56;
                        arrayList = arrayList2;
                        arrayList.add(c30207q);
                        iM60658N2 = i17;
                        iM60658N15 = i16;
                        iM60658N25 = i45;
                        iM60658N27 = i47;
                        iM60658N29 = i49;
                        iM60658N30 = i54;
                        iM60658N26 = i46;
                        iM60658N13 = i26;
                        iM60658N18 = i25;
                        iM60658N19 = i28;
                        iM60658N20 = i34;
                        iM60658N21 = i35;
                        iM60658N22 = i37;
                        iM60658N23 = i39;
                        iM60658N24 = i44;
                        iM60658N28 = i48;
                        iM60658N3 = i19;
                        iM60658N16 = i18;
                        iM60658N17 = i24;
                        iM60658N = i14;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 13:
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection2.mo68212g1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC33689cMo68212g2.mo5355e1()) {
                        arrayList3.add(interfaceC33689cMo68212g2.mo5353J0(0));
                    }
                    interfaceC33689cMo68212g2.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g2.close();
                    throw th3;
                }
            case 14:
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g3 = _connection3.mo68212g1("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    return Integer.valueOf(interfaceC33689cMo68212g3.mo5355e1() ? (int) interfaceC33689cMo68212g3.getLong(0) : 0);
                } finally {
                    interfaceC33689cMo68212g3.close();
                }
            case 15:
                C30223a0 build = (C30223a0) obj;
                AbstractC22676k.m65750j(build, "$this$build");
                AbstractC30222a format = (AbstractC30222a) AbstractC30284z.f123844a.getValue();
                C30223a0 c30223a0 = build;
                AbstractC22676k.m65750j(format, "format");
                if (format instanceof C30282y) {
                    c30223a0.mo92504i(((C30282y) format).f123842a);
                }
                AbstractC12313p.m34299q(build, new Function1[]{new C30034f(16)}, new C30034f(17));
                C30235e0 format2 = (C30235e0) AbstractC30238f0.f123780a.getValue();
                AbstractC22676k.m65750j(format2, "format");
                build.mo92502d(format2.f123772a);
                return c23454a0;
            case 16:
                C30223a0 alternativeParsing = (C30223a0) obj;
                AbstractC22676k.m65750j(alternativeParsing, "$this$alternativeParsing");
                AbstractC12313p.m34304v(alternativeParsing, 't');
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C30223a0 alternativeParsing2 = (C30223a0) obj;
                AbstractC22676k.m65750j(alternativeParsing2, "$this$alternativeParsing");
                AbstractC12313p.m34304v(alternativeParsing2, 'T');
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j((InterfaceC30258m) obj, "$this$alternativeParsing");
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                InterfaceC30258m alternativeParsing3 = (InterfaceC30258m) obj;
                AbstractC22676k.m65750j(alternativeParsing3, "$this$alternativeParsing");
                AbstractC12313p.m34304v(alternativeParsing3, ':');
                ((InterfaceC30231d) alternativeParsing3).mo92502d(new C32389c(new C30265p0(EnumC30263o0.f123804w)));
                AbstractC12313p.m34263O(alternativeParsing3, "", new C30034f(20));
                return c23454a0;
            case 20:
                InterfaceC30258m optional = (InterfaceC30258m) obj;
                AbstractC22676k.m65750j(optional, "$this$optional");
                AbstractC12313p.m34304v(optional, '.');
                ((InterfaceC30231d) optional).mo92502d(new C32389c(new C30266q()));
                return c23454a0;
            case 21:
                C30283y0 optional2 = (C30283y0) obj;
                AbstractC22676k.m65750j(optional2, "$this$optional");
                AbstractC12313p.m34304v(optional2, ':');
                C30283y0.m92540l(optional2);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C30283y0 optional3 = (C30283y0) obj;
                AbstractC22676k.m65750j(optional3, "$this$optional");
                C30283y0.m92540l(optional3);
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C30283y0 alternativeParsing4 = (C30283y0) obj;
                AbstractC22676k.m65750j(alternativeParsing4, "$this$alternativeParsing");
                alternativeParsing4.mo92505a("z");
                return c23454a0;
            case 24:
                C30283y0 alternativeParsing5 = (C30283y0) obj;
                AbstractC22676k.m65750j(alternativeParsing5, "$this$alternativeParsing");
                AbstractC12313p.m34263O(alternativeParsing5, "Z", new C30034f(27));
                return c23454a0;
            case 25:
                C30283y0 alternativeParsing6 = (C30283y0) obj;
                AbstractC22676k.m65750j(alternativeParsing6, "$this$alternativeParsing");
                alternativeParsing6.mo92505a("z");
                return c23454a0;
            case 26:
                C30283y0 alternativeParsing7 = (C30283y0) obj;
                AbstractC22676k.m65750j(alternativeParsing7, "$this$alternativeParsing");
                AbstractC12313p.m34263O(alternativeParsing7, "Z", new C30034f(28));
                return c23454a0;
            case 27:
                C30283y0 optional4 = (C30283y0) obj;
                AbstractC22676k.m65750j(optional4, "$this$optional");
                C30283y0.m92538j(optional4);
                AbstractC12313p.m34304v(optional4, ':');
                C30283y0.m92539k(optional4);
                AbstractC12313p.m34263O(optional4, "", new C30034f(21));
                return c23454a0;
            case 28:
                C30283y0 optional5 = (C30283y0) obj;
                AbstractC22676k.m65750j(optional5, "$this$optional");
                C30283y0.m92538j(optional5);
                AbstractC12313p.m34263O(optional5, "", new C30034f(29));
                return c23454a0;
            default:
                C30283y0 optional6 = (C30283y0) obj;
                AbstractC22676k.m65750j(optional6, "$this$optional");
                C30283y0.m92539k(optional6);
                AbstractC12313p.m34263O(optional6, "", new C30034f(22));
                return c23454a0;
        }
    }
}
