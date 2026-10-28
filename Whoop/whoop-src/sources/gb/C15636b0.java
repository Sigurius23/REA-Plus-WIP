package gb;

import p040c0.AbstractC3788w0;
import p077d0.AbstractC11348f;
import p114eb.C12982q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15636b0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C15636b0 f58683x;

    /* JADX INFO: renamed from: y */
    public static final C15636b0 f58684y;

    /* JADX INFO: renamed from: z */
    public static final C15636b0 f58685z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58686w;

    static {
        int i13 = 1;
        f58683x = new C15636b0(i13, 0);
        f58684y = new C15636b0(i13, 1);
        f58685z = new C15636b0(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15636b0(int i13, int i14) {
        super(i13);
        this.f58686w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58686w) {
            case 0:
                return ((C12982q) obj).f44835F;
            case 1:
                return AbstractC3788w0.m11577e(AbstractC11348f.m30574v(700, 0, null, 6), 2);
            default:
                return AbstractC3788w0.m11578f(AbstractC11348f.m30574v(700, 0, null, 6), 2);
        }
    }
}
