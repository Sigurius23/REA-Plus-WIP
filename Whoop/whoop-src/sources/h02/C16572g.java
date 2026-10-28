package h02;

import androidx.compose.runtime.Composer;
import ao2.C1877b;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import uz1.AbstractC35430h;

/* JADX INFO: renamed from: h02.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16572g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63787w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1877b f63788x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63789y;

    public /* synthetic */ C16572g(C1877b c1877b, Function1 function1, int i13) {
        this.f63787w = i13;
        this.f63788x = c1877b;
        this.f63789y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f63787w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC16578j.m47013l(this.f63788x, this.f63789y, composer, iIntValue);
            default:
                return AbstractC35430h.m112451s(this.f63788x, this.f63789y, composer, iIntValue);
        }
    }
}
