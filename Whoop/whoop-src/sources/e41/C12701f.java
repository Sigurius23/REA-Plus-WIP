package e41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.startactivity.goals.AbstractC10237a;
import ih2.AbstractC18527b;
import p715kotlin.jvm.functions.Function1;
import sg2.AbstractC32453d;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: e41.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C12701f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43432w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f43433x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f43434y;

    public /* synthetic */ C12701f(boolean z4, Function1 function1, int i13) {
        this.f43432w = i13;
        this.f43433x = z4;
        this.f43434y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f43432w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC12702g.m35522n(this.f43433x, this.f43434y, composer, iIntValue);
            case 1:
                return AbstractC18527b.m53710K(this.f43433x, this.f43434y, composer, iIntValue);
            case 2:
                return AbstractC10237a.m26008r(this.f43433x, this.f43434y, composer, iIntValue);
            case 3:
                return AbstractC32453d.m101347g(this.f43433x, this.f43434y, composer, iIntValue);
            default:
                return AbstractC36272h.m115882u0(this.f43433x, this.f43434y, composer, iIntValue);
        }
    }
}
