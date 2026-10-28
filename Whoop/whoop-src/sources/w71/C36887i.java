package w71;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import yl0.AbstractC39619b;

/* JADX INFO: renamed from: w71.i */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36887i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157797w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Double f157798x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f157799y;

    public /* synthetic */ C36887i(Double d3, Function1 function1) {
        this.f157798x = d3;
        this.f157799y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f157797w) {
            case 0:
                return C36893l.m118401a0(this.f157799y, this.f157798x);
            default:
                return AbstractC39619b.m126616q(this.f157798x, this.f157799y);
        }
    }

    public /* synthetic */ C36887i(Function1 function1, Double d3) {
        this.f157799y = function1;
        this.f157798x = d3;
    }
}
