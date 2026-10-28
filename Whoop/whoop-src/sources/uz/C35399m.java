package uz;

import androidx.fragment.app.AbstractActivityC1340r0;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: uz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C35399m implements InterfaceC13058l {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f150824E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC13058l f150825w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35401o f150826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractActivityC1340r0 f150827y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f150828z;

    public C35399m(C13045h2 c13045h2, C35401o c35401o, AbstractActivityC1340r0 abstractActivityC1340r0, String str, String str2) {
        this.f150825w = c13045h2;
        this.f150826x = c35401o;
        this.f150827y = abstractActivityC1340r0;
        this.f150828z = str;
        this.f150824E = str2;
    }

    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        Object objCollect = this.f150825w.collect(new C35398l(interfaceC13062m, this.f150826x, this.f150827y, this.f150828z, this.f150824E), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }
}
