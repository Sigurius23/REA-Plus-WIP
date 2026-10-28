package m40;

import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p291l0.InterfaceC23004v;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C25024a implements Function3 {

    /* JADX INFO: renamed from: x */
    public static final C25024a f98035x = new C25024a(0);

    /* JADX INFO: renamed from: y */
    public static final C25024a f98036y = new C25024a(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98037w;

    public /* synthetic */ C25024a(int i13) {
        this.f98037w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f98037w) {
            case 0:
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j((InterfaceC23004v) obj, "<this>");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j((InterfaceC23004v) obj, "<this>");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    }
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
