package ej1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import cj1.C4753i;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ej1.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13248k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45883w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4753i.d f45884x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f45885y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f45886z;

    public /* synthetic */ C13248k(C4753i.d dVar, Function1 function1, int i13, int i14) {
        this.f45883w = i14;
        this.f45884x = dVar;
        this.f45885y = function1;
        this.f45886z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f45883w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC13250m.m37237i(this.f45884x, this.f45885y, this.f45886z, composer, iIntValue);
            default:
                return AbstractC13252o.m37254q(this.f45884x, this.f45885y, this.f45886z, composer, iIntValue);
        }
    }
}
