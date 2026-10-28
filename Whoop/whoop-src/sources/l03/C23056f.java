package l03;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: l03.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C23056f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90920w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Integer f90921x;

    public /* synthetic */ C23056f(int i13, Integer num) {
        this.f90920w = i13;
        this.f90921x = num;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f90920w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return C23058h.m67017J(this.f90921x, composer, iIntValue);
            default:
                return C23058h.m67022O(this.f90921x, composer, iIntValue);
        }
    }
}
