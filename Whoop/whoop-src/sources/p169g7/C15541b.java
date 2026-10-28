package p169g7;

import androidx.health.platform.client.proto.C1439b0;
import androidx.health.platform.client.proto.C1556z;
import p322m7.C25132b1;
import p322m7.C25157l;
import p322m7.C25166p0;
import p322m7.C25183y;
import p322m7.C25186z0;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C15541b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C15541b f58271E;

    /* JADX INFO: renamed from: F */
    public static final C15541b f58272F;

    /* JADX INFO: renamed from: x */
    public static final C15541b f58273x;

    /* JADX INFO: renamed from: y */
    public static final C15541b f58274y;

    /* JADX INFO: renamed from: z */
    public static final C15541b f58275z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58276w;

    static {
        int i13 = 1;
        f58273x = new C15541b(i13, 0);
        f58274y = new C15541b(i13, 1);
        f58275z = new C15541b(i13, 2);
        f58271E = new C15541b(i13, 3);
        f58272F = new C15541b(i13, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15541b(int i13, int i14) {
        super(i13);
        this.f58276w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58276w) {
            case 0:
                C25157l sample = (C25157l) obj;
                AbstractC22676k.m65750j(sample, "sample");
                C1556z c1556zM4572t = C1439b0.m4572t();
                c1556zM4572t.m4947d(AbstractC36259c.m115668D(sample.f98650b), "rpm");
                c1556zM4572t.m4948e(sample.f98649a.toEpochMilli());
                return (C1439b0) c1556zM4572t.m4813a();
            case 1:
                C25183y sample2 = (C25183y) obj;
                AbstractC22676k.m65750j(sample2, "sample");
                C1556z c1556zM4572t2 = C1439b0.m4572t();
                c1556zM4572t2.m4947d(AbstractC36259c.m115693h0(sample2.f98812b), "bpm");
                c1556zM4572t2.m4948e(sample2.f98811a.toEpochMilli());
                return (C1439b0) c1556zM4572t2.m4813a();
            case 2:
                C25166p0 sample3 = (C25166p0) obj;
                AbstractC22676k.m65750j(sample3, "sample");
                C1556z c1556zM4572t3 = C1439b0.m4572t();
                c1556zM4572t3.m4947d(AbstractC36259c.m115668D(sample3.f98742b.m95551a()), "power");
                c1556zM4572t3.m4948e(sample3.f98741a.toEpochMilli());
                return (C1439b0) c1556zM4572t3.m4813a();
            case 3:
                C25186z0 sample4 = (C25186z0) obj;
                AbstractC22676k.m65750j(sample4, "sample");
                C1556z c1556zM4572t4 = C1439b0.m4572t();
                c1556zM4572t4.m4947d(AbstractC36259c.m115668D(sample4.f98828b.m95561a()), "speed");
                c1556zM4572t4.m4948e(sample4.f98827a.toEpochMilli());
                return (C1439b0) c1556zM4572t4.m4813a();
            default:
                C25132b1 sample5 = (C25132b1) obj;
                AbstractC22676k.m65750j(sample5, "sample");
                C1556z c1556zM4572t5 = C1439b0.m4572t();
                c1556zM4572t5.m4947d(AbstractC36259c.m115668D(sample5.f98518b), "rate");
                c1556zM4572t5.m4948e(sample5.f98517a.toEpochMilli());
                return (C1439b0) c1556zM4572t5.m4813a();
        }
    }
}
