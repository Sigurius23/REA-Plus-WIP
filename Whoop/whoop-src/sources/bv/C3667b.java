package bv;

import android.os.Handler;
import android.os.Looper;
import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: bv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3667b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C3667b f14919x;

    /* JADX INFO: renamed from: y */
    public static final C3667b f14920y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14921w;

    static {
        int i13 = 0;
        f14919x = new C3667b(i13, 0);
        f14920y = new C3667b(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3667b(int i13, int i14) {
        super(i13);
        this.f14921w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14921w) {
            case 0:
                return new Handler(Looper.getMainLooper());
            default:
                return new Handler(C3668c.f14922i.getLooper());
        }
    }
}
