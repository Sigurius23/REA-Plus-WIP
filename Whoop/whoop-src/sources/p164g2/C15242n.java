package p164g2;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: g2.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C15242n extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C15242n f57248x;

    /* JADX INFO: renamed from: y */
    public static final C15242n f57249y;

    /* JADX INFO: renamed from: z */
    public static final C15242n f57250z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57251w;

    static {
        int i13 = 1;
        f57248x = new C15242n(i13, 0);
        f57249y = new C15242n(i13, 1);
        f57250z = new C15242n(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15242n(int i13, int i14) {
        super(i13);
        this.f57251w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f57251w) {
            case 0:
                return C23454a0.f92919a;
            case 1:
                return C23454a0.f92919a;
            case 2:
                return Boolean.valueOf(((C15252x) obj).m43360b1(7));
            default:
                return Boolean.valueOf(((C15252x) obj).m43360b1(7));
        }
    }
}
