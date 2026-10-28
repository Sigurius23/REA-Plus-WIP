package p41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p41.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C28837h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116726w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28839j f116727x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f116728y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f116729z;

    public /* synthetic */ C28837h(C28839j c28839j, InterfaceC28601c1 interfaceC28601c1, Function1 function1, int i13) {
        this.f116726w = i13;
        this.f116727x = c28839j;
        this.f116728y = interfaceC28601c1;
        this.f116729z = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f116726w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC28838i.m87718h(this.f116727x, this.f116728y, this.f116729z, composer, iIntValue);
            default:
                return AbstractC28838i.m87719i(this.f116727x, this.f116728y, this.f116729z, composer, iIntValue);
        }
    }
}
