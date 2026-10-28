package w23;

import d33.C11602h1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import t23.C33392g2;

/* JADX INFO: renamed from: w23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C36743a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C36743a f157260x;

    /* JADX INFO: renamed from: y */
    public static final C36743a f157261y;

    /* JADX INFO: renamed from: z */
    public static final C36743a f157262z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157263w;

    static {
        int i13 = 1;
        f157260x = new C36743a(i13, 0);
        f157261y = new C36743a(i13, 1);
        f157262z = new C36743a(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36743a(int i13, int i14) {
        super(i13);
        this.f157263w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f157263w) {
            case 0:
                C33392g2 c33392g2 = (C33392g2) obj;
                if (c33392g2 != null) {
                    return c33392g2.f139422a;
                }
                return null;
            case 1:
                C11602h1 it = (C11602h1) obj;
                AbstractC22676k.m65750j(it, "it");
                return it.f37421A;
            default:
                C11602h1 it3 = (C11602h1) obj;
                AbstractC22676k.m65750j(it3, "it");
                return it3.f37464z;
        }
    }
}
