package p182h3;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C16786b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C16786b f64527x;

    /* JADX INFO: renamed from: y */
    public static final C16786b f64528y;

    /* JADX INFO: renamed from: z */
    public static final C16786b f64529z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64530w;

    static {
        int i13 = 1;
        f64527x = new C16786b(i13, 0);
        f64528y = new C16786b(i13, 1);
        f64529z = new C16786b(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16786b(int i13, int i14) {
        super(i13);
        this.f64530w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f64530w) {
            case 0:
                ((Number) obj).longValue();
                return C23454a0.f92919a;
            case 1:
                return Integer.valueOf(((C16795k) obj).f64549b);
            default:
                return Integer.valueOf(((C16795k) obj).f64550c.m124796a());
        }
    }
}
