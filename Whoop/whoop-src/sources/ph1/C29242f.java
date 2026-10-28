package ph1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import nh1.C26722c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ph1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29242f implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f118326E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118327w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26722c f118328x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f118329y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f118330z;

    public /* synthetic */ C29242f(C26722c c26722c, Function1 function1, int i13, int i14, int i15) {
        this.f118327w = i15;
        this.f118328x = c26722c;
        this.f118329y = function1;
        this.f118330z = i13;
        this.f118326E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f118327w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC29243g.m88772g(this.f118328x, this.f118329y, this.f118330z, this.f118326E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC29247k.m88848l(this.f118328x, this.f118329y, this.f118330z, this.f118326E, (Composer) obj, iIntValue2);
        }
    }
}
