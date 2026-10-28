package qn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import mn0.C25709c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qn0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C30508c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f125342E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f125343F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125344w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25709c f125345x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f125346y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f125347z;

    public /* synthetic */ C30508c(C25709c c25709c, String str, Function1 function1, Function1 function2, int i13, int i14) {
        this.f125344w = i14;
        this.f125345x = c25709c;
        this.f125346y = str;
        this.f125347z = function1;
        this.f125342E = function2;
        this.f125343F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f125344w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC30510e.m93436f(this.f125345x, this.f125346y, this.f125347z, this.f125342E, this.f125343F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30512g.m93453c(this.f125345x, this.f125346y, this.f125347z, this.f125342E, this.f125343F, (Composer) obj, iIntValue2);
        }
    }
}
