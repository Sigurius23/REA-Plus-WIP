package i01;

import androidx.compose.runtime.Composer;
import p291l0.InterfaceC22996s0;
import p291l0.InterfaceC23004v;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: i01.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17842e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69355w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17845h f69356x;

    public /* synthetic */ C17842e(C17845h c17845h, int i13) {
        this.f69355w = i13;
        this.f69356x = c17845h;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f69355w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC17843f.m51288o(this.f69356x, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC17843f.m51289p(this.f69356x, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue2);
        }
    }
}
