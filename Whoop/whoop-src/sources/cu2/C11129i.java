package cu2;

import c93.InterfaceC4339a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import p114eb.C12982q;

/* JADX INFO: renamed from: cu2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11129i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35528w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12982q f35529x;

    public /* synthetic */ C11129i(C12982q c12982q, int i13) {
        this.f35528w = i13;
        this.f35529x = c12982q;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35528w) {
            case 0:
                return StrengthTrainerDestination.C10738a.m28021j(this.f35529x);
            default:
                return StrengthTrainerDestination.C10741d.m28055k(this.f35529x);
        }
    }
}
