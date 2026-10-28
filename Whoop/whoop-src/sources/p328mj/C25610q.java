package p328mj;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: mj.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C25610q extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C25610q f100472x;

    /* JADX INFO: renamed from: y */
    public static final C25610q f100473y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100474w;

    static {
        int i13 = 0;
        f100472x = new C25610q(i13, 0);
        f100473y = new C25610q(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25610q(int i13, int i14) {
        super(i13);
        this.f100474w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f100474w) {
            case 0:
                throw new IllegalStateException("No AmplitudeEngagement instance provided");
            default:
                throw new IllegalStateException("No NudgeViewManager instance provided");
        }
    }
}
