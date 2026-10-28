package p355o2;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: o2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C27432f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C27432f f110558x;

    /* JADX INFO: renamed from: y */
    public static final C27432f f110559y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110560w;

    static {
        int i13 = 0;
        f110558x = new C27432f(i13, 0);
        f110559y = new C27432f(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27432f(int i13, int i14) {
        super(i13);
        this.f110560w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f110560w) {
            case 0:
                return AbstractC34870c0.m110016r();
            default:
                return C23454a0.f92919a;
        }
    }
}
