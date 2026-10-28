package p700bd1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p704dk2.AbstractC12123j;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: bd1.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3091i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12131w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f12132x;

    public /* synthetic */ C3091i(int i13, Function3 function3) {
        this.f12131w = i13;
        this.f12132x = function3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f12131w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return Function1.m8864d(this.f12132x, composer, iIntValue);
            case 1:
                return AbstractC42782p.m8886d(this.f12132x, composer, iIntValue);
            default:
                return AbstractC12123j.m33557q(this.f12132x, composer, iIntValue);
        }
    }
}
