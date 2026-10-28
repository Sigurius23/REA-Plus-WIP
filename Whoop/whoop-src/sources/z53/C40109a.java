package z53;

import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import ud3.C34824k0;
import ud3.C34826l0;

/* JADX INFO: renamed from: z53.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40109a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C40109a f173131x;

    /* JADX INFO: renamed from: y */
    public static final C40109a f173132y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173133w;

    static {
        int i13 = 1;
        f173131x = new C40109a(i13, 0);
        f173132y = new C40109a(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40109a(int i13, int i14) {
        super(i13);
        this.f173133w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f173133w) {
            case 0:
                C34824k0 c34824k0 = (C34824k0) obj;
                AbstractC22676k.m65750j(c34824k0, "$this$null");
                c34824k0.f146620i = false;
                c34824k0.f146621j = false;
                c34824k0.f146617f = true;
                break;
            default:
                C34826l0 it = (C34826l0) obj;
                AbstractC22676k.m65750j(it, "it");
                break;
        }
        return C23454a0.f92919a;
    }
}
