package ai1;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import c31.AbstractC3926j;
import com.whoop.data.local.room.dao.persistent.RawDataDao_Impl;
import com.whoop.data.local.room.dao.wipeable.GpsDao_Impl;
import com.whoop.data.local.room.dao.wipeable.JournalDao_Impl;
import d71.AbstractC11758d;
import dn0.AbstractC12208h;
import e81.AbstractC12836k;
import fg2.AbstractC14472n;
import gb1.AbstractC15673b0;
import h02.AbstractC16563b0;
import id2.AbstractC18424i;
import io2.AbstractC20782s;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import kk1.AbstractC22546g;
import l11.AbstractC23221c;
import n21.AbstractC26194h;
import no0.AbstractC26971s;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p218ic.EnumC18371m0;
import p218ic.EnumC18390x;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p420qc.C30207q;
import p457rc.C31222e;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qy0.AbstractC30773f;
import rk2.C31500d;

/* JADX INFO: renamed from: ai1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0910b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3331w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f3332x;

    public /* synthetic */ C0910b(long j7, int i13) {
        this.f3331w = i13;
        this.f3332x = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i13 = this.f3331w;
        long j7 = this.f3332x;
        switch (i13) {
            case 0:
                return C0912d.m2252l(j7, (InterfaceC33687a) obj);
            case 1:
                return C0912d.m2250j(j7, (InterfaceC33687a) obj);
            case 2:
                return AbstractC3926j.m11936j(j7, (InterfaceC22131e) obj);
            case 3:
                return RawDataDao_Impl.lambda$delete$8(j7, (InterfaceC33687a) obj);
            case 4:
                return GpsDao_Impl.lambda$deleteGpsMeta$8(j7, (InterfaceC33687a) obj);
            case 5:
                return JournalDao_Impl.lambda$getJournalAnswer$1(j7, (InterfaceC33687a) obj);
            case 6:
                return JournalDao_Impl.lambda$getJournalAnswerLiveData$2(j7, (InterfaceC33687a) obj);
            case 7:
                return AbstractC11758d.m31458k(j7, (Modifier) obj);
            case 8:
                return AbstractC11758d.m31460m(j7, (Modifier) obj);
            case 9:
                return AbstractC11758d.m31459l(j7, (InterfaceC22131e) obj);
            case 10:
                return AbstractC11758d.m31461n(j7, (InterfaceC22131e) obj);
            case 11:
                return AbstractC12208h.m33823F(j7, (InterfaceC22131e) obj);
            case 12:
                return AbstractC12208h.m33822E(j7, (InterfaceC22131e) obj);
            case 13:
                return AbstractC12836k.m35984Q(j7, (Modifier) obj);
            case 14:
                return AbstractC14472n.m41305j(j7, (InterfaceC22131e) obj);
            case 15:
                return AbstractC15673b0.m44067v(j7, (InterfaceC22131e) obj);
            case 16:
                return AbstractC16563b0.m46910r(j7, (Modifier) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC18424i.m53034k(j7, (InterfaceC22131e) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC20782s.m57259D(j7, (InterfaceC22129c) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC22546g.m65209O(j7, (InterfaceC22129c) obj);
            case 20:
                return AbstractC23221c.m67192z(j7, (InterfaceC22129c) obj);
            case 21:
                return AbstractC23221c.m67186t(j7, (InterfaceC22129c) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23221c.m67188v(j7, (InterfaceC22129c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC26194h.m77785s(j7, (InterfaceC22131e) obj);
            case 24:
                return AbstractC26194h.m77792z(j7, (InterfaceC22131e) obj);
            case 25:
                return AbstractC26971s.m80776E(j7, (InterfaceC22131e) obj);
            case 26:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    interfaceC33689cMo68212g1.mo5356p(1, j7);
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
                        ArrayList arrayList2 = arrayList;
                        int i14 = iM60658N;
                        EnumC18371m0 enumC18371m0M60407M = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g1.getLong(iM60658N2));
                        String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                        String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                        byte[] blob = interfaceC33689cMo68212g1.getBlob(iM60658N5);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        C18358g c18358gM88543t2 = AbstractC29125c.m88543t(interfaceC33689cMo68212g1.getBlob(iM60658N6));
                        long j13 = interfaceC33689cMo68212g1.getLong(iM60658N7);
                        long j14 = interfaceC33689cMo68212g1.getLong(iM60658N8);
                        long j15 = interfaceC33689cMo68212g1.getLong(iM60658N9);
                        int i15 = (int) interfaceC33689cMo68212g1.getLong(iM60658N10);
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g1.getLong(iM60658N11));
                        long j16 = interfaceC33689cMo68212g1.getLong(iM60658N12);
                        long j17 = interfaceC33689cMo68212g1.getLong(iM60658N13);
                        long j18 = interfaceC33689cMo68212g1.getLong(iM60658N14);
                        int i16 = iM60658N15;
                        long j19 = interfaceC33689cMo68212g1.getLong(i16);
                        int i17 = iM60658N14;
                        int i18 = iM60658N16;
                        boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i18)) != 0;
                        int i19 = iM60658N17;
                        EnumC18363i0 enumC18363i0M60406L = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g1.getLong(i19));
                        int i24 = iM60658N18;
                        int i25 = iM60658N2;
                        int i26 = (int) interfaceC33689cMo68212g1.getLong(i24);
                        int i27 = iM60658N19;
                        int i28 = (int) interfaceC33689cMo68212g1.getLong(i27);
                        long j24 = interfaceC33689cMo68212g1.getLong(iM60658N20);
                        int i29 = iM60658N21;
                        int i34 = (int) interfaceC33689cMo68212g1.getLong(i29);
                        iM60658N21 = i29;
                        iM60658N22 = iM60658N22;
                        int i35 = (int) interfaceC33689cMo68212g1.getLong(iM60658N22);
                        int i36 = iM60658N23;
                        Boolean boolValueOf = null;
                        String strMo5353J3 = interfaceC33689cMo68212g1.isNull(i36) ? null : interfaceC33689cMo68212g1.mo5353J0(i36);
                        int i37 = iM60658N24;
                        Integer numValueOf = interfaceC33689cMo68212g1.isNull(i37) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i37));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        Boolean bool = boolValueOf;
                        int i38 = iM60658N25;
                        EnumC18390x enumC18390xM60405K = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g1.getLong(i38));
                        int i39 = iM60658N26;
                        C31222e c31222eM60434g0 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g1.getBlob(i39));
                        int i44 = iM60658N27;
                        boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i44)) != 0;
                        int i45 = iM60658N28;
                        boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i45)) != 0;
                        int i46 = iM60658N29;
                        boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i46)) != 0;
                        iM60658N29 = i46;
                        int i47 = iM60658N30;
                        int i48 = iM60658N31;
                        int i49 = iM60658N32;
                        iM60658N31 = i48;
                        int i54 = iM60658N33;
                        C30207q c30207q = new C30207q(strMo5353J0, enumC18371m0M60407M, strMo5353J1, strMo5353J2, c18358gM88543t, c18358gM88543t2, j13, j14, j15, new C18354e(c31222eM60434g0, enumC18390xM60405K, z13, z14, z15, ((int) interfaceC33689cMo68212g1.getLong(i47)) != 0, interfaceC33689cMo68212g1.getLong(i48), interfaceC33689cMo68212g1.getLong(i49), AbstractC21478l0.m60442m(interfaceC33689cMo68212g1.getBlob(i54))), i15, enumC18346aM60404J, j16, j17, j18, j19, z4, enumC18363i0M60406L, i26, i28, j24, i34, i35, strMo5353J3, bool);
                        iM60658N33 = i54;
                        iM60658N32 = i49;
                        arrayList = arrayList2;
                        arrayList.add(c30207q);
                        iM60658N30 = i47;
                        iM60658N14 = i17;
                        iM60658N15 = i16;
                        iM60658N16 = i18;
                        iM60658N17 = i19;
                        iM60658N19 = i27;
                        iM60658N23 = i36;
                        iM60658N24 = i37;
                        iM60658N25 = i38;
                        iM60658N26 = i39;
                        iM60658N27 = i44;
                        iM60658N = i14;
                        iM60658N28 = i45;
                        iM60658N2 = i25;
                        iM60658N18 = i24;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 27:
                return AbstractC30773f.m94545s(j7, (InterfaceC22131e) obj);
            case 28:
                return AbstractC30773f.m94546t(j7, (InterfaceC22131e) obj);
            default:
                return C31500d.m97056j(j7, (InterfaceC33687a) obj);
        }
    }
}
