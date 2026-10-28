package js2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import fs2.InterfaceC14760m;
import hs2.C17611e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: js2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21926d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f84683E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f84684F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84685w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17611e.d f84686x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC14760m f84687y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f84688z;

    public /* synthetic */ C21926d(C17611e.d dVar, InterfaceC14760m interfaceC14760m, Function1 function1, int i13, int i14, int i15) {
        this.f84685w = i15;
        this.f84686x = dVar;
        this.f84687y = interfaceC14760m;
        this.f84688z = function1;
        this.f84683E = i13;
        this.f84684F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f84685w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC21928f.m62431D(this.f84686x, this.f84687y, this.f84688z, this.f84683E, this.f84684F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21928f.m62452r(this.f84686x, this.f84687y, this.f84688z, this.f84683E, this.f84684F, (Composer) obj, iIntValue2);
        }
    }
}
