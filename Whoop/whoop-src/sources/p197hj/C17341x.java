package p197hj;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: hj.x */
/* JADX INFO: loaded from: classes.dex */
public final class C17341x extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C17341x f67153E;

    /* JADX INFO: renamed from: x */
    public static final C17341x f67154x;

    /* JADX INFO: renamed from: y */
    public static final C17341x f67155y;

    /* JADX INFO: renamed from: z */
    public static final C17341x f67156z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67157w;

    static {
        int i13 = 1;
        f67154x = new C17341x(i13, 0);
        f67155y = new C17341x(i13, 1);
        f67156z = new C17341x(i13, 2);
        f67153E = new C17341x(i13, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17341x(int i13, int i14) {
        super(i13);
        this.f67157w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f67157w) {
            case 0:
                AbstractC22676k.m65750j(it, "it");
                break;
            case 1:
                AbstractC22676k.m65750j(it, "it");
                break;
            case 2:
                AbstractC22676k.m65750j(it, "it");
                break;
            default:
                AbstractC22676k.m65750j(it, "it");
                break;
        }
        return it.toString();
    }
}
