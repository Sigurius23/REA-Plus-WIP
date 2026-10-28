package p412q3;

import l83.C23454a0;
import p208i2.C17896l0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: q3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C29864c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C29864c f122063x;

    /* JADX INFO: renamed from: y */
    public static final C29864c f122064y;

    /* JADX INFO: renamed from: z */
    public static final C29864c f122065z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122066w;

    static {
        int i13 = 1;
        f122063x = new C29864c(i13, 0);
        f122064y = new C29864c(i13, 1);
        f122065z = new C29864c(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29864c(int i13, int i14) {
        super(i13);
        this.f122066w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f122066w) {
            case 0:
                float[] fArr = ((C17896l0) obj).f69598a;
                break;
            case 1:
                break;
            default:
                int i13 = ((C29877k) obj).f122097a;
                break;
        }
        return C23454a0.f92919a;
    }
}
