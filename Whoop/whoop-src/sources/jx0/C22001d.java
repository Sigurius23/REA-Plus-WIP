package jx0;

import j93.AbstractC21478l0;
import l83.C23454a0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jx0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22001d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85244w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f85245x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f85246y;

    public /* synthetic */ C22001d(int i13, String str, long j7) {
        this.f85244w = i13;
        this.f85245x = j7;
        this.f85246y = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.f85244w) {
            case 0:
                return C22002e.m62872m(this.f85246y, this.f85245x, (InterfaceC33687a) obj);
            case 1:
                long j7 = this.f85245x;
                String str = this.f85246y;
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    interfaceC33689cMo68212g1.mo5356p(1, j7);
                    interfaceC33689cMo68212g1.mo5354L(2, str);
                    interfaceC33689cMo68212g1.mo5355e1();
                    return Integer.valueOf(AbstractC21478l0.m60402H(_connection));
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            default:
                long j13 = this.f85245x;
                String str2 = this.f85246y;
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection2.mo68212g1("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    interfaceC33689cMo68212g2.mo5356p(1, j13);
                    interfaceC33689cMo68212g2.mo5354L(2, str2);
                    interfaceC33689cMo68212g2.mo5355e1();
                    return C23454a0.f92919a;
                } finally {
                    interfaceC33689cMo68212g2.close();
                }
        }
    }

    public /* synthetic */ C22001d(String str, long j7) {
        this.f85244w = 0;
        this.f85246y = str;
        this.f85245x = j7;
    }
}
