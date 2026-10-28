package eg2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import dg2.C12009a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eg2.g */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C13174g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f45658E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45659w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12009a f45660x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f45661y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f45662z;

    public /* synthetic */ C13174g(C12009a c12009a, Function1 function1, int i13, int i14, int i15) {
        this.f45659w = i15;
        this.f45660x = c12009a;
        this.f45661y = function1;
        this.f45662z = i13;
        this.f45658E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45659w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13176i.m36945C(this.f45660x, this.f45661y, this.f45662z, this.f45658E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13177j.m37011S(this.f45660x, this.f45661y, this.f45662z, this.f45658E, (Composer) obj, iIntValue2);
        }
    }
}
