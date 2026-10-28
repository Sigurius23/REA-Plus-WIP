package com.whoop.data.local.room.dao.persistent;

import l83.C23454a0;
import p249jc.AbstractC21598x;
import p420qc.C30198h;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.data.local.room.dao.persistent.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6497h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25397w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f25398x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f25399y;

    public /* synthetic */ C6497h(int i13, String str) {
        this.f25397w = 3;
        this.f25399y = i13;
        this.f25398x = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        C30198h c30198h;
        switch (this.f25397w) {
            case 0:
                return RawDataDao_Impl.lambda$getPacketsByRevisionAndCount$3(this.f25398x, this.f25399y, (InterfaceC33687a) obj);
            case 1:
                String str = this.f25398x;
                int i13 = this.f25399y;
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    interfaceC33689cMo68212g1.mo5354L(1, str);
                    interfaceC33689cMo68212g1.mo5356p(2, i13);
                    int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "work_spec_id");
                    int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "generation");
                    int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "system_id");
                    if (interfaceC33689cMo68212g1.mo5355e1()) {
                        c30198h = new C30198h(interfaceC33689cMo68212g1.mo5353J0(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), (int) interfaceC33689cMo68212g1.getLong(iM60658N3));
                        break;
                    } else {
                        c30198h = null;
                    }
                    return c30198h;
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 2:
                String str2 = this.f25398x;
                int i14 = this.f25399y;
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection2.mo68212g1("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    interfaceC33689cMo68212g2.mo5354L(1, str2);
                    interfaceC33689cMo68212g2.mo5356p(2, i14);
                    interfaceC33689cMo68212g2.mo5355e1();
                    return C23454a0.f92919a;
                } finally {
                    interfaceC33689cMo68212g2.close();
                }
            default:
                int i15 = this.f25399y;
                String str3 = this.f25398x;
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g3 = _connection3.mo68212g1("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    interfaceC33689cMo68212g3.mo5356p(1, i15);
                    interfaceC33689cMo68212g3.mo5354L(2, str3);
                    interfaceC33689cMo68212g3.mo5355e1();
                    return C23454a0.f92919a;
                } finally {
                    interfaceC33689cMo68212g3.close();
                }
        }
    }

    public /* synthetic */ C6497h(String str, int i13, int i14) {
        this.f25397w = i14;
        this.f25398x = str;
        this.f25399y = i13;
    }
}
