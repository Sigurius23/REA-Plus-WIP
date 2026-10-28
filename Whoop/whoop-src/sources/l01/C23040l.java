package l01;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l01.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C23040l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90817w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23042n f90818x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f90819y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f90820z;

    public /* synthetic */ C23040l(C23042n c23042n, Function1 function1, int i13, int i14) {
        this.f90817w = i14;
        this.f90818x = c23042n;
        this.f90819y = function1;
        this.f90820z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f90817w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC23041m.m66854Q(this.f90818x, this.f90819y, this.f90820z, composer, iIntValue);
            case 1:
                return AbstractC23041m.m66858U(this.f90818x, this.f90819y, this.f90820z, composer, iIntValue);
            default:
                return AbstractC23041m.m66863Z(this.f90818x, this.f90819y, this.f90820z, composer, iIntValue);
        }
    }
}
