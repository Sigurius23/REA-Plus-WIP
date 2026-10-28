package p702ch0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import p163g1.C15199y3;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ch0.e0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4615e0 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2994c0 f18605E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15199y3 f18606F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18607w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f18608x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f18609y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f18610z;

    public /* synthetic */ C4615e0(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, int i13) {
        this.f18607w = i13;
        this.f18608x = interfaceC28601c1;
        this.f18609y = interfaceC28601c2;
        this.f18610z = function1;
        this.f18605E = interfaceC2994c0;
        this.f18606F = c15199y3;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f18607w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return Function1.m14399H(this.f18608x, this.f18609y, this.f18610z, this.f18605E, this.f18606F, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return Function1.m14398G(this.f18608x, this.f18609y, this.f18610z, this.f18605E, this.f18606F, (InterfaceC23013y) obj, (Composer) obj2, iIntValue2);
        }
    }
}
