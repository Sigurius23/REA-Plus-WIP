package t23;

import c93.InterfaceC4339a;
import l83.C23454a0;
import org.webrtc.EglBase;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t23.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C33424n extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C33424n f139550x;

    /* JADX INFO: renamed from: y */
    public static final C33424n f139551y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139552w;

    static {
        int i13 = 0;
        f139550x = new C33424n(i13, 0);
        f139551y = new C33424n(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33424n(int i13, int i14) {
        super(i13);
        this.f139552w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f139552w) {
            case 0:
                return EglBase.create();
            default:
                return C23454a0.f92919a;
        }
    }
}
