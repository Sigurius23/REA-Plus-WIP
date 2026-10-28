package h02;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h02.g0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16573g0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63790w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16577i0 f63791x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63792y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f63793z;

    public /* synthetic */ C16573g0(C16577i0 c16577i0, Function1 function1, int i13, int i14) {
        this.f63790w = i14;
        this.f63791x = c16577i0;
        this.f63792y = function1;
        this.f63793z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f63790w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC16575h0.m46989y(this.f63791x, this.f63792y, this.f63793z, composer, iIntValue);
            default:
                return AbstractC16575h0.m46962B(this.f63791x, this.f63792y, this.f63793z, composer, iIntValue);
        }
    }
}
