package e61;

import androidx.health.platform.client.proto.C1533u;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import jx0.C22002e;
import l83.C23454a0;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p218ic.EnumC18371m0;
import p249jc.AbstractC21598x;
import p420qc.C30205o;
import p420qc.C30207q;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import t61.AbstractC33553c;
import tr2.C34109g;
import w61.AbstractC36861a;

/* JADX INFO: renamed from: e61.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12764g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43668w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f43669x;

    public /* synthetic */ C12764g(String str, int i13) {
        this.f43668w = i13;
        this.f43669x = str;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c1  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        C30207q c30207q;
        EnumC18371m0 enumC18371m0M60407M;
        int i13 = this.f43668w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String str = this.f43669x;
        switch (i13) {
            case 0:
                return AbstractC12765h.m35739u(str, (InterfaceC18044z) obj);
            case 1:
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                AbstractC18041w.m51806e(str, interfaceC18044z);
                AbstractC18041w.m51810i(interfaceC18044z, 5);
                return c23454a0;
            case 2:
                InterfaceC18044z interfaceC18044z2 = (InterfaceC18044z) obj;
                AbstractC18041w.m51806e(str, interfaceC18044z2);
                AbstractC18041w.m51810i(interfaceC18044z2, 5);
                return c23454a0;
            case 3:
                return C22002e.m62873n(str, (InterfaceC33687a) obj);
            case 4:
                InterfaceC18044z interfaceC18044z3 = (InterfaceC18044z) obj;
                AbstractC18041w.m51806e(str, interfaceC18044z3);
                AbstractC18041w.m51810i(interfaceC18044z3, 5);
                return c23454a0;
            case 5:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    interfaceC33689cMo68212g1.mo5354L(1, str);
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
            case 6:
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection2.mo68212g1("SELECT long_value FROM Preference where `key`=?");
                try {
                    interfaceC33689cMo68212g2.mo5354L(1, str);
                    if (interfaceC33689cMo68212g2.mo5355e1() && !interfaceC33689cMo68212g2.isNull(0)) {
                        lValueOf = Long.valueOf(interfaceC33689cMo68212g2.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    interfaceC33689cMo68212g2.close();
                }
            case 7:
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g3 = _connection3.mo68212g1("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    interfaceC33689cMo68212g3.mo5354L(1, str);
                    interfaceC33689cMo68212g3.mo5355e1();
                    return c23454a0;
                } finally {
                    interfaceC33689cMo68212g3.close();
                }
            case 8:
                InterfaceC33687a _connection4 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection4, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g4 = _connection4.mo68212g1("DELETE from WorkProgress where work_spec_id=?");
                try {
                    interfaceC33689cMo68212g4.mo5354L(1, str);
                    interfaceC33689cMo68212g4.mo5355e1();
                    return c23454a0;
                } finally {
                    interfaceC33689cMo68212g4.close();
                }
            case 9:
                InterfaceC33687a _connection5 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection5, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g5 = _connection5.mo68212g1("SELECT * FROM workspec WHERE id=?");
                try {
                    interfaceC33689cMo68212g5.mo5354L(1, str);
                    int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "id");
                    int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "state");
                    int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "worker_class_name");
                    int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "input_merger_class_name");
                    int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "input");
                    int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "output");
                    int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "initial_delay");
                    int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "interval_duration");
                    int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "flex_duration");
                    int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "run_attempt_count");
                    int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "backoff_policy");
                    int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "backoff_delay_duration");
                    int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "last_enqueue_time");
                    int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "minimum_retention_duration");
                    int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "schedule_requested_at");
                    int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "run_in_foreground");
                    int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "out_of_quota_policy");
                    int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "period_count");
                    int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "generation");
                    int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "next_schedule_time_override");
                    int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "next_schedule_time_override_generation");
                    int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "stop_reason");
                    int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "trace_tag");
                    int iM60658N24 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "backoff_on_system_interruptions");
                    int iM60658N25 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "required_network_type");
                    int iM60658N26 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "required_network_request");
                    int iM60658N27 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "requires_charging");
                    int iM60658N28 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "requires_device_idle");
                    int iM60658N29 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "requires_battery_not_low");
                    int iM60658N30 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "requires_storage_not_low");
                    int iM60658N31 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "trigger_content_update_delay");
                    int iM60658N32 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "trigger_max_content_delay");
                    int iM60658N33 = AbstractC21598x.m60658N(interfaceC33689cMo68212g5, "content_uri_triggers");
                    if (interfaceC33689cMo68212g5.mo5355e1()) {
                        String strMo5353J0 = interfaceC33689cMo68212g5.mo5353J0(iM60658N);
                        EnumC18371m0 enumC18371m0M60407M2 = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g5.getLong(iM60658N2));
                        String strMo5353J1 = interfaceC33689cMo68212g5.mo5353J0(iM60658N3);
                        String strMo5353J2 = interfaceC33689cMo68212g5.mo5353J0(iM60658N4);
                        byte[] blob = interfaceC33689cMo68212g5.getBlob(iM60658N5);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        C18358g c18358gM88543t2 = AbstractC29125c.m88543t(interfaceC33689cMo68212g5.getBlob(iM60658N6));
                        long j7 = interfaceC33689cMo68212g5.getLong(iM60658N7);
                        long j13 = interfaceC33689cMo68212g5.getLong(iM60658N8);
                        long j14 = interfaceC33689cMo68212g5.getLong(iM60658N9);
                        int i14 = (int) interfaceC33689cMo68212g5.getLong(iM60658N10);
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g5.getLong(iM60658N11));
                        long j15 = interfaceC33689cMo68212g5.getLong(iM60658N12);
                        long j16 = interfaceC33689cMo68212g5.getLong(iM60658N13);
                        long j17 = interfaceC33689cMo68212g5.getLong(iM60658N14);
                        long j18 = interfaceC33689cMo68212g5.getLong(iM60658N15);
                        boolean z4 = ((int) interfaceC33689cMo68212g5.getLong(iM60658N16)) != 0;
                        EnumC18363i0 enumC18363i0M60406L = AbstractC21478l0.m60406L((int) interfaceC33689cMo68212g5.getLong(iM60658N17));
                        int i15 = (int) interfaceC33689cMo68212g5.getLong(iM60658N18);
                        int i16 = (int) interfaceC33689cMo68212g5.getLong(iM60658N19);
                        long j19 = interfaceC33689cMo68212g5.getLong(iM60658N20);
                        int i17 = (int) interfaceC33689cMo68212g5.getLong(iM60658N21);
                        int i18 = (int) interfaceC33689cMo68212g5.getLong(iM60658N22);
                        String strMo5353J3 = interfaceC33689cMo68212g5.isNull(iM60658N23) ? null : interfaceC33689cMo68212g5.mo5353J0(iM60658N23);
                        Integer numValueOf = interfaceC33689cMo68212g5.isNull(iM60658N24) ? null : Integer.valueOf((int) interfaceC33689cMo68212g5.getLong(iM60658N24));
                        c30207q = new C30207q(strMo5353J0, enumC18371m0M60407M2, strMo5353J1, strMo5353J2, c18358gM88543t, c18358gM88543t2, j7, j13, j14, new C18354e(AbstractC21478l0.m60434g0(interfaceC33689cMo68212g5.getBlob(iM60658N26)), AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g5.getLong(iM60658N25)), ((int) interfaceC33689cMo68212g5.getLong(iM60658N27)) != 0, ((int) interfaceC33689cMo68212g5.getLong(iM60658N28)) != 0, ((int) interfaceC33689cMo68212g5.getLong(iM60658N29)) != 0, ((int) interfaceC33689cMo68212g5.getLong(iM60658N30)) != 0, interfaceC33689cMo68212g5.getLong(iM60658N31), interfaceC33689cMo68212g5.getLong(iM60658N32), AbstractC21478l0.m60442m(interfaceC33689cMo68212g5.getBlob(iM60658N33))), i14, enumC18346aM60404J, j15, j16, j17, j18, z4, enumC18363i0M60406L, i15, i16, j19, i17, i18, strMo5353J3, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        c30207q = null;
                    }
                    return c30207q;
                } finally {
                    interfaceC33689cMo68212g5.close();
                }
            case 10:
                InterfaceC33687a _connection6 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection6, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g6 = _connection6.mo68212g1("SELECT state FROM workspec WHERE id=?");
                try {
                    interfaceC33689cMo68212g6.mo5354L(1, str);
                    if (interfaceC33689cMo68212g6.mo5355e1()) {
                        Integer numValueOf2 = interfaceC33689cMo68212g6.isNull(0) ? null : Integer.valueOf((int) interfaceC33689cMo68212g6.getLong(0));
                        if (numValueOf2 != null) {
                            enumC18371m0M60407M = AbstractC21478l0.m60407M(numValueOf2.intValue());
                        } else {
                            enumC18371m0M60407M = null;
                        }
                        break;
                    } else {
                        enumC18371m0M60407M = null;
                    }
                    return enumC18371m0M60407M;
                } finally {
                    interfaceC33689cMo68212g6.close();
                }
            case 11:
                InterfaceC33687a _connection7 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection7, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g7 = _connection7.mo68212g1("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC33689cMo68212g7.mo5354L(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC33689cMo68212g7.mo5355e1()) {
                        arrayList2.add(interfaceC33689cMo68212g7.mo5353J0(0));
                    }
                    interfaceC33689cMo68212g7.close();
                    return arrayList2;
                } catch (Throwable th4) {
                    interfaceC33689cMo68212g7.close();
                    throw th4;
                }
            case 12:
                InterfaceC33687a _connection8 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection8, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g8 = _connection8.mo68212g1("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    interfaceC33689cMo68212g8.mo5354L(1, str);
                    interfaceC33689cMo68212g8.mo5355e1();
                    return Integer.valueOf(AbstractC21478l0.m60402H(_connection8));
                } finally {
                    interfaceC33689cMo68212g8.close();
                }
            case 13:
                InterfaceC33687a _connection9 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection9, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g9 = _connection9.mo68212g1("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    interfaceC33689cMo68212g9.mo5354L(1, str);
                    interfaceC33689cMo68212g9.mo5355e1();
                    return c23454a0;
                } finally {
                    interfaceC33689cMo68212g9.close();
                }
            case 14:
                InterfaceC33687a _connection10 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection10, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g10 = _connection10.mo68212g1("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    interfaceC33689cMo68212g10.mo5354L(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (interfaceC33689cMo68212g10.mo5355e1()) {
                        byte[] blob2 = interfaceC33689cMo68212g10.getBlob(0);
                        C18358g c18358g2 = C18358g.f71479b;
                        arrayList3.add(AbstractC29125c.m88543t(blob2));
                    }
                    interfaceC33689cMo68212g10.close();
                    return arrayList3;
                } catch (Throwable th5) {
                    interfaceC33689cMo68212g10.close();
                    throw th5;
                }
            case 15:
                InterfaceC33687a _connection11 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection11, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g11 = _connection11.mo68212g1("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    interfaceC33689cMo68212g11.mo5354L(1, str);
                    interfaceC33689cMo68212g11.mo5355e1();
                    return Integer.valueOf(AbstractC21478l0.m60402H(_connection11));
                } finally {
                    interfaceC33689cMo68212g11.close();
                }
            case 16:
                InterfaceC33687a _connection12 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection12, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g12 = _connection12.mo68212g1("DELETE FROM workspec WHERE id=?");
                try {
                    interfaceC33689cMo68212g12.mo5354L(1, str);
                    interfaceC33689cMo68212g12.mo5355e1();
                    return c23454a0;
                } finally {
                    interfaceC33689cMo68212g12.close();
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC33687a _connection13 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection13, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g13 = _connection13.mo68212g1("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC33689cMo68212g13.mo5354L(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (interfaceC33689cMo68212g13.mo5355e1()) {
                        String id4 = interfaceC33689cMo68212g13.mo5353J0(0);
                        EnumC18371m0 enumC18371m0M60407M3 = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g13.getLong(1));
                        AbstractC22676k.m65750j(id4, "id");
                        C30205o c30205o = new C30205o();
                        c30205o.f123613a = id4;
                        c30205o.f123614b = enumC18371m0M60407M3;
                        arrayList4.add(c30205o);
                    }
                    interfaceC33689cMo68212g13.close();
                    return arrayList4;
                } catch (Throwable th6) {
                    interfaceC33689cMo68212g13.close();
                    throw th6;
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC33687a _connection14 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection14, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g14 = _connection14.mo68212g1("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    interfaceC33689cMo68212g14.mo5354L(1, str);
                    ArrayList arrayList5 = new ArrayList();
                    while (interfaceC33689cMo68212g14.mo5355e1()) {
                        arrayList5.add(interfaceC33689cMo68212g14.mo5353J0(0));
                    }
                    interfaceC33689cMo68212g14.close();
                    return arrayList5;
                } catch (Throwable th7) {
                    interfaceC33689cMo68212g14.close();
                    throw th7;
                }
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                InterfaceC33687a _connection15 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection15, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g15 = _connection15.mo68212g1("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    interfaceC33689cMo68212g15.mo5354L(1, str);
                    interfaceC33689cMo68212g15.mo5355e1();
                    return c23454a0;
                } finally {
                    interfaceC33689cMo68212g15.close();
                }
            case 20:
                return AbstractC33553c.m105960d(str, (InterfaceC18044z) obj);
            case 21:
                return C34109g.m107826t(str, (InterfaceC33687a) obj);
            default:
                return AbstractC36861a.m118218d(str, (InterfaceC18044z) obj);
        }
    }
}
