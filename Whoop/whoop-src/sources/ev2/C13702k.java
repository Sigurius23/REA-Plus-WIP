package ev2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import dv2.InterfaceC12394e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ev2.k */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13702k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f48545E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48546w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC12394e.b f48547x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f48548y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function3 f48549z;

    public /* synthetic */ C13702k(InterfaceC12394e.b bVar, Function1 function1, Function3 function3, int i13, int i14) {
        this.f48546w = i14;
        this.f48547x = bVar;
        this.f48548y = function1;
        this.f48549z = function3;
        this.f48545E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48546w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13705n.m38702r(this.f48547x, this.f48548y, this.f48549z, this.f48545E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13705n.m38680I(this.f48547x, this.f48548y, this.f48549z, this.f48545E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC13712u.m38738J0(this.f48547x, this.f48548y, this.f48549z, this.f48545E, (Composer) obj, iIntValue3);
        }
    }
}
