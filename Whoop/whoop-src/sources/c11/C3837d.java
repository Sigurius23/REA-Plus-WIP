package c11;

import c41.AbstractC4039h5;
import ht2.AbstractC17633e;
import k11.AbstractC22121d;
import km1.AbstractC22585b;
import l01.AbstractC23041m;
import lf0.AbstractC23938l;
import ny0.C27256h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: c11.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3837d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15704w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f15705x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27256h f15706y;

    public /* synthetic */ C3837d(Function1 function1, C27256h c27256h) {
        this.f15704w = 3;
        this.f15706y = c27256h;
        this.f15705x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15704w) {
            case 0:
                return AbstractC3841h.m11707M(this.f15705x, this.f15706y, obj);
            case 1:
                return AbstractC4039h5.m12315k(this.f15705x, this.f15706y, obj);
            case 2:
                return AbstractC17633e.m50202J(this.f15705x, this.f15706y, obj);
            case 3:
                return AbstractC22121d.m63336m(this.f15706y, this.f15705x, obj);
            case 4:
                return AbstractC22585b.m65454m(this.f15705x, this.f15706y, obj);
            case 5:
                return AbstractC23041m.m66851N(this.f15705x, this.f15706y, obj);
            case 6:
                return AbstractC23041m.m66853P(this.f15705x, this.f15706y, obj);
            case 7:
                return AbstractC23041m.m66857T(this.f15705x, this.f15706y, obj);
            default:
                return AbstractC23938l.m70470r(this.f15705x, this.f15706y, obj);
        }
    }

    public /* synthetic */ C3837d(Function1 function1, C27256h c27256h, int i13) {
        this.f15704w = i13;
        this.f15705x = function1;
        this.f15706y = c27256h;
    }
}
