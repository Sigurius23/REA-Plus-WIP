package ev2;

import androidx.compose.runtime.Composer;
import dv2.InterfaceC12394e;
import p291l0.InterfaceC22996s0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ev2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13696e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48527w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC12394e.b f48528x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function3 f48529y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f48530z;

    public /* synthetic */ C13696e(InterfaceC12394e.b bVar, Function3 function3, Function1 function1, int i13) {
        this.f48527w = i13;
        this.f48528x = bVar;
        this.f48529y = function3;
        this.f48530z = function1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f48527w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC13705n.m38678G(this.f48528x, this.f48529y, this.f48530z, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC13712u.m38726D0(this.f48528x, this.f48529y, this.f48530z, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
