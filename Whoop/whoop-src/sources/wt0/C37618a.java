package wt0;

import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import eu0.InterfaceC13640a;
import eu0.InterfaceC13641b;
import j93.InterfaceC21461d;
import java.util.List;
import l83.C23454a0;
import nd1.InterfaceC26584j;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p545v6.C35728q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import qf3.C30330b;
import rf3.C31365d;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import wf3.C37247a;
import xf3.C38266c;
import xt0.C38642a;
import xt0.C38643b;

/* JADX INFO: renamed from: wt0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lwt0/a;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "connectivity-data-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37618a implements InterfaceC26584j {
    /* JADX INFO: renamed from: c */
    private static final C23454a0 m120851c(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C35728q c35728q = new C35728q(20, (byte) 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(InterfaceC13641b.class);
        C35953c c35953c = C37247a.f159360e;
        module.m106774b(AbstractC21598x.m60669Y(orCreateKotlinClass, null, c35953c), new C31365d(new C30330b(c35953c, orCreateKotlinClass, null, c35728q, 1)), false);
        C35728q c35728q2 = new C35728q(21, (byte) 0);
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(InterfaceC13640a.class);
        AbstractC11895b.m31980C(new C30330b(c35953c, orCreateKotlinClass2, null, c35728q2, 1), module, AbstractC21598x.m60669Y(orCreateKotlinClass2, null, c35953c), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC13641b m120852d(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C38643b(((PersistentStrapPacketDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19640i(), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final InterfaceC13640a m120853e(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C38642a(((PersistentStrapPacketDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19639h(), null, 2, 0 == true ? 1 : 0);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m120851c(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ List<InterfaceC26584j> getDependencies() {
        return super.getDependencies();
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
