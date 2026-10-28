package hv2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: hv2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17683e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68584w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17689k.c f68585x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f68586y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f68587z;

    public /* synthetic */ C17683e(C17689k.c cVar, Function1 function1, int i13, int i14) {
        this.f68584w = i14;
        this.f68585x = cVar;
        this.f68586y = function1;
        this.f68587z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f68584w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC17687i.m50456E0(this.f68585x, this.f68586y, this.f68587z, composer, iIntValue);
            case 1:
                return AbstractC17687i.m50489c0(this.f68585x, this.f68586y, this.f68587z, composer, iIntValue);
            case 2:
                return AbstractC17687i.m50464I0(this.f68585x, this.f68586y, this.f68587z, composer, iIntValue);
            default:
                return AbstractC17687i.m50485a0(this.f68585x, this.f68586y, this.f68587z, composer, iIntValue);
        }
    }
}
