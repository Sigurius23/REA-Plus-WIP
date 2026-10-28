package p005a3;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0213j extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C0213j f710x;

    /* JADX INFO: renamed from: y */
    public static final C0213j f711y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f712w;

    static {
        int i13 = 0;
        f710x = new C0213j(i13, 0);
        f711y = new C0213j(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0213j(int i13, int i14) {
        super(i13);
        this.f712w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f712w) {
            case 0:
                return new C0230n0(2);
            default:
                return new C0230n0(3);
        }
    }
}
