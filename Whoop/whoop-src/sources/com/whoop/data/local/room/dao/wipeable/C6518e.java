package com.whoop.data.local.room.dao.wipeable;

import j93.AbstractC21478l0;
import java.util.ArrayList;
import mu0.C25953e;
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
import pf.AbstractC29125c;
import tr2.C34109g;
import yt0.C39764c;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.wipeable.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6518e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25413w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f25414x;

    public /* synthetic */ C6518e(int i13, int i14) {
        this.f25413w = i14;
        this.f25414x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i13 = this.f25413w;
        int i14 = this.f25414x;
        switch (i13) {
            case 0:
                return TeamsDao_Impl.lambda$getTeamCount$5(i14, (InterfaceC33687a) obj);
            case 1:
                return C25953e.m76802A(i14, (InterfaceC33687a) obj);
            case 2:
                return C25953e.m76822x(i14, (InterfaceC33687a) obj);
            case 3:
                return C25953e.m76806E(i14, (InterfaceC33687a) obj);
            case 4:
                return C25953e.m76824z(i14, (InterfaceC33687a) obj);
            case 5:
                return C25953e.m76807F(i14, (InterfaceC33687a) obj);
            case 6:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    interfaceC33689cMo68212g1.mo5356p(1, i14);
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
                        int i15 = iM60658N;
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
                        int i16 = (int) interfaceC33689cMo68212g1.getLong(iM60658N10);
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g1.getLong(iM60658N11));
                        long j15 = interfaceC33689cMo68212g1.getLong(iM60658N12);
                        long j16 = interfaceC33689cMo68212g1.getLong(iM60658N13);
                        long j17 = interfaceC33689cMo68212g1.getLong(iM60658N14);
                        int i17 = iM60658N15;
                        long j18 = interfaceC33689cMo68212g1.getLong(i17);
                        int i18 = iM60658N14;
                        int i19 = iM60658N16;
                        boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(i19)) != 0;
                        int i24 = iM60658N17;
                        EnumC18363i0 enumC18363i0M60406L = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g1.getLong(i24));
                        int i25 = iM60658N2;
                        int i26 = iM60658N18;
                        int i27 = iM60658N3;
                        int i28 = (int) interfaceC33689cMo68212g1.getLong(i26);
                        int i29 = iM60658N19;
                        int i34 = (int) interfaceC33689cMo68212g1.getLong(i29);
                        int i35 = iM60658N20;
                        long j19 = interfaceC33689cMo68212g1.getLong(i35);
                        int i36 = iM60658N21;
                        int i37 = (int) interfaceC33689cMo68212g1.getLong(i36);
                        int i38 = iM60658N22;
                        int i39 = (int) interfaceC33689cMo68212g1.getLong(i38);
                        int i44 = iM60658N23;
                        Boolean boolValueOf = null;
                        String strMo5353J3 = interfaceC33689cMo68212g1.isNull(i44) ? null : interfaceC33689cMo68212g1.mo5353J0(i44);
                        int i45 = iM60658N24;
                        Integer numValueOf = interfaceC33689cMo68212g1.isNull(i45) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i45));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        int i46 = iM60658N25;
                        Boolean bool = boolValueOf;
                        EnumC18390x enumC18390xM60405K = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g1.getLong(i46));
                        int i47 = iM60658N26;
                        C31222e c31222eM60434g0 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g1.getBlob(i47));
                        int i48 = iM60658N27;
                        boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(i48)) != 0;
                        int i49 = iM60658N28;
                        boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(i49)) != 0;
                        int i54 = iM60658N29;
                        boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(i54)) != 0;
                        iM60658N29 = i54;
                        int i55 = iM60658N30;
                        int i56 = iM60658N31;
                        int i57 = iM60658N32;
                        iM60658N31 = i56;
                        int i58 = iM60658N33;
                        C30207q c30207q = new C30207q(strMo5353J0, enumC18371m0M60407M, strMo5353J1, strMo5353J2, c18358gM88543t, c18358gM88543t2, j7, j13, j14, new C18354e(c31222eM60434g0, enumC18390xM60405K, z13, z14, z15, ((int) interfaceC33689cMo68212g1.getLong(i55)) != 0, interfaceC33689cMo68212g1.getLong(i56), interfaceC33689cMo68212g1.getLong(i57), AbstractC21478l0.m60442m(interfaceC33689cMo68212g1.getBlob(i58))), i16, enumC18346aM60404J, j15, j16, j17, j18, z4, enumC18363i0M60406L, i28, i34, j19, i37, i39, strMo5353J3, bool);
                        iM60658N33 = i58;
                        iM60658N32 = i57;
                        arrayList = arrayList2;
                        arrayList.add(c30207q);
                        iM60658N30 = i55;
                        iM60658N14 = i18;
                        iM60658N15 = i17;
                        iM60658N16 = i19;
                        iM60658N17 = i24;
                        iM60658N2 = i25;
                        iM60658N20 = i35;
                        iM60658N21 = i36;
                        iM60658N22 = i38;
                        iM60658N23 = i44;
                        iM60658N24 = i45;
                        iM60658N25 = i46;
                        iM60658N19 = i29;
                        iM60658N27 = i48;
                        iM60658N26 = i47;
                        iM60658N28 = i49;
                        iM60658N3 = i27;
                        iM60658N = i15;
                        iM60658N18 = i26;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 7:
                return C34109g.m107830x(i14, (InterfaceC33687a) obj);
            default:
                return C39764c.m127290p(i14, (InterfaceC33687a) obj);
        }
    }
}
