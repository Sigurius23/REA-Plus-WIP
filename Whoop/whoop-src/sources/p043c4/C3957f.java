package p043c4;

import c93.InterfaceC4339a;
import java.util.UUID;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C3957f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C3957f f16123x;

    /* JADX INFO: renamed from: y */
    public static final C3957f f16124y;

    /* JADX INFO: renamed from: z */
    public static final C3957f f16125z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16126w;

    static {
        int i13 = 0;
        f16123x = new C3957f(i13, 0);
        f16124y = new C3957f(i13, 1);
        f16125z = new C3957f(i13, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3957f(int i13, int i14) {
        super(i13);
        this.f16126w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16126w) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
