package p133f1;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p601x0.InterfaceC37796g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f1.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13997z0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49945w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f49946x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f49947y;

    public /* synthetic */ C13997z0(int i13, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
        this.f49945w = i13;
        this.f49946x = interfaceC4339a;
        this.f49947y = interfaceC4339a2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC37796g interfaceC37796g = (InterfaceC37796g) obj;
        switch (this.f49945w) {
            case 0:
                this.f49946x.invoke();
                InterfaceC4339a interfaceC4339a = this.f49947y;
                if (interfaceC4339a != null ? ((Boolean) interfaceC4339a.invoke()).booleanValue() : true) {
                    interfaceC37796g.close();
                }
                break;
            default:
                this.f49946x.invoke();
                InterfaceC4339a interfaceC4339a2 = this.f49947y;
                if (interfaceC4339a2 != null ? ((Boolean) interfaceC4339a2.invoke()).booleanValue() : true) {
                    interfaceC37796g.close();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
