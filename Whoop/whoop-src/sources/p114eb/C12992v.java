package p114eb;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C12992v extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C12992v f44875E;

    /* JADX INFO: renamed from: F */
    public static final C12992v f44876F;

    /* JADX INFO: renamed from: G */
    public static final C12992v f44877G;

    /* JADX INFO: renamed from: H */
    public static final C12992v f44878H;

    /* JADX INFO: renamed from: x */
    public static final C12992v f44879x;

    /* JADX INFO: renamed from: y */
    public static final C12992v f44880y;

    /* JADX INFO: renamed from: z */
    public static final C12992v f44881z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44882w;

    static {
        int i13 = 1;
        f44879x = new C12992v(i13, 0);
        f44880y = new C12992v(i13, 1);
        f44881z = new C12992v(i13, 2);
        f44875E = new C12992v(i13, 3);
        f44876F = new C12992v(i13, 4);
        f44877G = new C12992v(i13, 5);
        f44878H = new C12992v(i13, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12992v(int i13, int i14) {
        super(i13);
        this.f44882w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f44882w) {
            case 0:
                C12999y0 navOptions = (C12999y0) obj;
                AbstractC22676k.m65750j(navOptions, "$this$navOptions");
                navOptions.f44916c = true;
                return C23454a0.f92919a;
            case 1:
                C12977n0 destination = (C12977n0) obj;
                AbstractC22676k.m65750j(destination, "destination");
                C12985r0 c12985r0 = destination.f44823x;
                if (c12985r0 == null || c12985r0.f44856M != destination.f44819H) {
                    return null;
                }
                return c12985r0;
            case 2:
                C12977n0 destination2 = (C12977n0) obj;
                AbstractC22676k.m65750j(destination2, "destination");
                C12985r0 c12985r1 = destination2.f44823x;
                if (c12985r1 == null || c12985r1.f44856M != destination2.f44819H) {
                    return null;
                }
                return c12985r1;
            case 3:
                C12977n0 it = (C12977n0) obj;
                AbstractC22676k.m65750j(it, "it");
                return Integer.valueOf(it.f44819H);
            case 4:
                C12977n0 it3 = (C12977n0) obj;
                AbstractC22676k.m65750j(it3, "it");
                if (!(it3 instanceof C12985r0)) {
                    return null;
                }
                C12985r0 c12985r2 = (C12985r0) it3;
                return c12985r2.m36486r(c12985r2.f44856M, c12985r2, null, false);
            case 5:
                AbstractC22676k.m65750j((C12970k1) obj, "$this$null");
                return C23454a0.f92919a;
            default:
                C12999y0 navOptions2 = (C12999y0) obj;
                AbstractC22676k.m65750j(navOptions2, "$this$navOptions");
                navOptions2.f44915b = true;
                return C23454a0.f92919a;
        }
    }
}
