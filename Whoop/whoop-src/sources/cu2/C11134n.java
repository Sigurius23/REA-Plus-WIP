package cu2;

import androidx.compose.runtime.Composer;
import com.whoop.profile.view.navigation.ProfileNavHostKt;
import com.whoop.weightlifting.AbstractC10757a;
import com.whoop.weightlifting.StrengthTrainerDestination;
import p114eb.C12982q;
import p114eb.C12991u0;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: cu2.n */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11134n implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35539w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f35540x;

    public /* synthetic */ C11134n(C12991u0 c12991u0, int i13) {
        this.f35539w = i13;
        this.f35540x = c12991u0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f35539w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC10757a.m28144H(this.f35540x, (C11121a) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC10757a.m28139C(this.f35540x, (StrengthTrainerDestination.C10743f.a) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return ProfileNavHostKt.ProfileNavHost$lambda$0$0$1(this.f35540x, (C12982q) obj, (Composer) obj2, iIntValue3);
        }
    }
}
