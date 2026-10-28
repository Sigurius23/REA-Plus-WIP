package j00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: j00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21089a implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C21089a f79951x = new C21089a(0);

    /* JADX INFO: renamed from: y */
    public static final C21089a f79952y = new C21089a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79953w;

    public /* synthetic */ C21089a(int i13) {
        this.f79953w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f79953w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC34924m.m110142c(AbstractC21114q.f80107a, composer, 6);
                    }
                } else {
                    AbstractC34924m.m110142c(AbstractC21114q.f80107a, composer, 6);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC34924m.m110142c(AbstractC21114q.f80107a, composer2, 6);
                    }
                } else {
                    AbstractC34924m.m110142c(AbstractC21114q.f80107a, composer2, 6);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
