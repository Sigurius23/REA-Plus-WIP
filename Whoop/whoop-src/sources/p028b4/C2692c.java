package p028b4;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2692c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C2692c f10591E;

    /* JADX INFO: renamed from: x */
    public static final C2692c f10592x;

    /* JADX INFO: renamed from: y */
    public static final C2692c f10593y;

    /* JADX INFO: renamed from: z */
    public static final C2692c f10594z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10595w;

    static {
        int i13 = 1;
        f10592x = new C2692c(i13, 0);
        f10593y = new C2692c(i13, 1);
        f10594z = new C2692c(i13, 2);
        f10591E = new C2692c(i13, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2692c(int i13, int i14) {
        super(i13);
        this.f10595w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10595w) {
            case 0:
                AbstractC2701l abstractC2701l = (AbstractC2701l) obj;
                abstractC2701l.getHandler().post(new RunnableC2690a(abstractC2701l.f10633Q, 1));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return C23454a0.f92919a;
    }
}
