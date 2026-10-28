package p007a6;

import ad3.C0764g;
import androidx.room.C1807l1;
import bp0.AbstractC3531s;
import bp0.C3513a;
import cd3.C4452d;
import com.whoop.design.json.AbstractC6728b;
import com.whoop.home.view.HomeFragment;
import dc3.C11923h;
import dc3.C11930o;
import dp0.InterfaceC12251g;
import ep0.C13404j;
import fm1.C14597a;
import fm1.C14600d;
import fm1.EnumC14603g;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import ld1.AbstractC23864c;
import m83.AbstractC25247g0;
import p002a0.C0022g;
import p002a0.C0057v0;
import p040c0.C3740g;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18371m0;
import p218ic.EnumC18390x;
import p249jc.AbstractC21598x;
import p291l0.C23016z;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p420qc.C30197g;
import p420qc.C30206p;
import p457rc.C31222e;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p634y1.C39031d;
import p634y1.C39036i;
import p692zt.C41113q;
import p710im1.AbstractC18658b;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import um1.AbstractC35086d;

/* JADX INFO: renamed from: a6.z0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0467z0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1593w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f1594x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1595y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f1596z;

    public /* synthetic */ C0467z0(Object obj, Object obj2, Object obj3, int i13) {
        this.f1593w = i13;
        this.f1594x = obj;
        this.f1595y = obj2;
        this.f1596z = obj3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        int i17 = this.f1593w;
        int i18 = 1;
        Object obj2 = this.f1596z;
        Object obj3 = this.f1595y;
        Object obj4 = this.f1594x;
        switch (i17) {
            case 0:
                C0431j c0431j = (C0431j) obj2;
                Throwable th3 = (Throwable) obj;
                ((C0428i) obj4).invoke(th3);
                C11923h c11923h = (C11923h) ((C41113q) obj3).f177226z;
                c11923h.m32207h(th3, false);
                while (true) {
                    Object objM32226a = C11930o.m32226a(c11923h.mo32205f());
                    if (objM32226a == null) {
                        return C23454a0.f92919a;
                    }
                    c0431j.invoke(objM32226a, th3);
                }
                break;
            case 1:
                return AbstractC3531s.m10515s0((C3513a) obj4, (C13404j) obj3, (InterfaceC12251g) obj2, (String) obj);
            case 2:
                return AbstractC6728b.m20382g((C4452d) obj4, (C4452d) obj3, (C4452d) obj2, (C0764g) obj);
            case 3:
                return AbstractC18658b.m54126k((C18665d0) obj4, (C14597a) obj3, (C14600d) obj2, obj);
            case 4:
                return HomeFragment.m21839m2((HomeFragment) obj4, (EnumC14603g) obj3, (InterfaceC28601c1) obj2, ((Integer) obj).intValue());
            case 5:
                C1807l1 c1807l1 = (C1807l1) obj3;
                C30197g c30197g = (C30197g) obj2;
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1((String) obj4);
                try {
                    c1807l1.f7111a.invoke(interfaceC33689cMo68212g1);
                    int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "id");
                    int iM60700s = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "state");
                    int iM60700s2 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "output");
                    int iM60700s3 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "initial_delay");
                    int iM60700s4 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "interval_duration");
                    int iM60700s5 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "flex_duration");
                    int iM60700s6 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "run_attempt_count");
                    int iM60700s7 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "backoff_policy");
                    int iM60700s8 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "backoff_delay_duration");
                    int iM60700s9 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "last_enqueue_time");
                    int iM60700s10 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "period_count");
                    int iM60700s11 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "generation");
                    String str = "getValue(...)";
                    int iM60700s12 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "next_schedule_time_override");
                    int iM60700s13 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "stop_reason");
                    int iM60700s14 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "required_network_type");
                    int iM60700s15 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "required_network_request");
                    int iM60700s16 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "requires_charging");
                    int iM60700s17 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "requires_device_idle");
                    int iM60700s18 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "requires_battery_not_low");
                    int iM60700s19 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "requires_storage_not_low");
                    int iM60700s20 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "trigger_content_update_delay");
                    int iM60700s21 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "trigger_max_content_delay");
                    int iM60700s22 = AbstractC21598x.m60700s(interfaceC33689cMo68212g1, "content_uri_triggers");
                    int i19 = iM60700s11;
                    C0022g c0022g = new C0022g(0);
                    int i24 = iM60700s10;
                    C0022g c0022g2 = new C0022g(0);
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60657M);
                        if (!c0022g.containsKey(strMo5353J0)) {
                            c0022g.put(strMo5353J0, new ArrayList());
                        }
                        String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60657M);
                        if (!c0022g2.containsKey(strMo5353J1)) {
                            c0022g2.put(strMo5353J1, new ArrayList());
                        }
                        iM60700s9 = iM60700s9;
                    }
                    int i25 = iM60700s9;
                    interfaceC33689cMo68212g1.reset();
                    c30197g.m92420b(_connection, c0022g);
                    c30197g.m92419a(_connection, c0022g2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        if (iM60657M == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                        }
                        String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60657M);
                        if (iM60700s == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                        }
                        EnumC18371m0 enumC18371m0M60407M = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g1.getLong(iM60700s));
                        if (iM60700s2 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                        }
                        byte[] blob = interfaceC33689cMo68212g1.getBlob(iM60700s2);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        long j7 = iM60700s3 == -1 ? 0L : interfaceC33689cMo68212g1.getLong(iM60700s3);
                        long j13 = iM60700s4 == -1 ? 0L : interfaceC33689cMo68212g1.getLong(iM60700s4);
                        long j14 = iM60700s5 == -1 ? 0L : interfaceC33689cMo68212g1.getLong(iM60700s5);
                        int i26 = iM60700s6 == -1 ? 0 : (int) interfaceC33689cMo68212g1.getLong(iM60700s6);
                        if (iM60700s7 == -1) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                        }
                        C0022g c0022g3 = c0022g;
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g1.getLong(iM60700s7));
                        long j15 = iM60700s8 == -1 ? 0L : interfaceC33689cMo68212g1.getLong(iM60700s8);
                        int i27 = i25;
                        long j16 = i27 == -1 ? 0L : interfaceC33689cMo68212g1.getLong(i27);
                        i25 = i27;
                        int i28 = i24;
                        int i29 = i28 == -1 ? 0 : (int) interfaceC33689cMo68212g1.getLong(i28);
                        int i34 = i19;
                        if (i34 == -1) {
                            i14 = -1;
                            i13 = 0;
                        } else {
                            i13 = (int) interfaceC33689cMo68212g1.getLong(i34);
                            i14 = -1;
                        }
                        int i35 = iM60700s12;
                        long j17 = i35 == i14 ? 0L : interfaceC33689cMo68212g1.getLong(i35);
                        int i36 = iM60700s13;
                        if (i36 == i14) {
                            i15 = 0;
                            i16 = i14;
                        } else {
                            i15 = (int) interfaceC33689cMo68212g1.getLong(i36);
                            i16 = -1;
                        }
                        int i37 = iM60700s14;
                        if (i37 == i16) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                        }
                        EnumC18390x enumC18390xM60405K = AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g1.getLong(i37));
                        int i38 = iM60700s15;
                        if (i38 == i16) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                        }
                        C31222e c31222eM60434g0 = AbstractC21478l0.m60434g0(interfaceC33689cMo68212g1.getBlob(i38));
                        int i39 = iM60700s16;
                        if (i39 == i16) {
                            z4 = false;
                        } else {
                            z4 = ((int) interfaceC33689cMo68212g1.getLong(i39)) != 0;
                        }
                        int i44 = iM60700s17;
                        if (i44 == i16) {
                            z13 = false;
                        } else {
                            z13 = ((int) interfaceC33689cMo68212g1.getLong(i44)) != 0;
                        }
                        int i45 = iM60700s18;
                        if (i45 == i16) {
                            z14 = false;
                        } else {
                            z14 = ((int) interfaceC33689cMo68212g1.getLong(i45)) != 0;
                        }
                        int i46 = iM60700s19;
                        if (i46 == i16) {
                            z15 = false;
                        } else {
                            z15 = ((int) interfaceC33689cMo68212g1.getLong(i46)) != 0;
                        }
                        int i47 = iM60700s20;
                        long j18 = i47 == i16 ? 0L : interfaceC33689cMo68212g1.getLong(i47);
                        int i48 = iM60700s21;
                        long j19 = i48 == i16 ? 0L : interfaceC33689cMo68212g1.getLong(i48);
                        iM60700s20 = i47;
                        int i49 = iM60700s22;
                        if (i49 == i16) {
                            throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                        }
                        C18354e c18354e = new C18354e(c31222eM60434g0, enumC18390xM60405K, z4, z13, z14, z15, j18, j19, AbstractC21478l0.m60442m(interfaceC33689cMo68212g1.getBlob(i49)));
                        iM60700s22 = i49;
                        iM60657M = iM60657M;
                        iM60700s21 = i48;
                        Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60657M), c0022g3);
                        String str2 = str;
                        AbstractC22676k.m65749i(objM73986U, str2);
                        List list = (List) objM73986U;
                        Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(iM60657M), c0022g2);
                        AbstractC22676k.m65749i(objM73986U2, str2);
                        arrayList.add(new C30206p(strMo5353J2, enumC18371m0M60407M, c18358gM88543t, j7, j13, j14, c18354e, i26, enumC18346aM60404J, j15, j16, i29, i13, j17, i15, list, (List) objM73986U2));
                        str = str2;
                        c0022g = c0022g3;
                        iM60700s12 = i35;
                        iM60700s13 = i36;
                        iM60700s14 = i37;
                        iM60700s16 = i39;
                        iM60700s17 = i44;
                        i24 = i28;
                        iM60700s19 = i46;
                        i19 = i34;
                        iM60700s15 = i38;
                        iM60700s18 = i45;
                    }
                    interfaceC33689cMo68212g1.close();
                    return arrayList;
                } catch (Throwable th4) {
                    interfaceC33689cMo68212g1.close();
                    throw th4;
                }
            case 6:
                return AbstractC35086d.m110966v((Function1) obj4, (AbstractC23864c) obj3, C23016z.f90757a, (InterfaceC28670t2) obj2, obj);
            default:
                C39031d c39031d = (C39031d) obj4;
                C39036i c39036i = (C39036i) obj2;
                C0057v0 c0057v0 = c39031d.f167998x;
                if (c0057v0.m124b(obj3)) {
                    throw new IllegalArgumentException(AbstractC18489d0.m53369j(obj3, "Key ", " was used multiple times ").toString());
                }
                c39031d.f167997w.remove(obj3);
                c0057v0.m135m(obj3, c39036i);
                return new C3740g(c39031d, obj3, c39036i, i18);
        }
    }
}
