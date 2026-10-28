package gb;

import p040c0.AbstractC3788w0;
import p077d0.AbstractC11348f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C15662w extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C15662w f58779x;

    /* JADX INFO: renamed from: y */
    public static final C15662w f58780y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58781w;

    static {
        int i13 = 1;
        f58779x = new C15662w(i13, 0);
        f58780y = new C15662w(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15662w(int i13, int i14) {
        super(i13);
        this.f58781w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f58781w) {
            case 0:
                return AbstractC3788w0.m11577e(AbstractC11348f.m30574v(700, 0, null, 6), 2);
            default:
                return AbstractC3788w0.m11578f(AbstractC11348f.m30574v(700, 0, null, 6), 2);
        }
    }
}
