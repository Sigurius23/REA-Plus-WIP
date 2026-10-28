package yw1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import uw1.C35311d;

/* JADX INFO: renamed from: yw1.l */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39825l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171625w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35311d f171626x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f171627y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f171628z;

    public /* synthetic */ C39825l(C35311d c35311d, Function1 function1, int i13, int i14) {
        this.f171625w = i14;
        this.f171626x = c35311d;
        this.f171627y = function1;
        this.f171628z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f171625w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC39826m.m127748n(this.f171626x, this.f171627y, this.f171628z, composer, iIntValue);
            default:
                return AbstractC39828o.m127769n(this.f171626x, this.f171627y, this.f171628z, composer, iIntValue);
        }
    }
}
