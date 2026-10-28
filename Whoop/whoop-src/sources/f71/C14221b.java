package f71;

import h02.AbstractC16575h0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: f71.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14221b implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f51947E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f51948w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f51949x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f51950y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f51951z;

    public /* synthetic */ C14221b(float f13, float f14, float f15, long j7) {
        this.f51949x = f13;
        this.f51950y = f14;
        this.f51951z = f15;
        this.f51947E = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f51948w) {
            case 0:
                return AbstractC14223d.m40678h(this.f51949x, this.f51950y, this.f51947E, this.f51951z, (InterfaceC22131e) obj);
            default:
                return AbstractC16575h0.m46964D(this.f51949x, this.f51950y, this.f51951z, this.f51947E, (InterfaceC22129c) obj);
        }
    }

    public /* synthetic */ C14221b(float f13, float f14, long j7, float f15) {
        this.f51949x = f13;
        this.f51950y = f14;
        this.f51947E = j7;
        this.f51951z = f15;
    }
}
