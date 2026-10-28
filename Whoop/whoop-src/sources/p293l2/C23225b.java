package p293l2;

import l83.C23454a0;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: l2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C23225b extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C23225b f91962x;

    /* JADX INFO: renamed from: y */
    public static final C23225b f91963y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91964w;

    static {
        int i13 = 1;
        f91962x = new C23225b(i13, 0);
        f91963y = new C23225b(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C23225b(int i13, int i14) {
        super(i13);
        this.f91964w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91964w) {
            case 0:
                break;
            default:
                InterfaceC22131e.m63383i0((InterfaceC22131e) obj, C17919x.f69636m, 0L, 0L, 0.0f, null, 0, 126);
                break;
        }
        return C23454a0.f92919a;
    }
}
