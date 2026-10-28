package u51;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: u51.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34543b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f145238w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34545d f145239x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f145240y;

    public /* synthetic */ C34543b(C34545d c34545d, int i13, int i14) {
        this.f145238w = i14;
        this.f145239x = c34545d;
        this.f145240y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f145238w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34544c.m109168l(this.f145239x, this.f145240y, composer, iIntValue);
            default:
                return AbstractC34544c.m109174r(this.f145239x, this.f145240y, composer, iIntValue);
        }
    }
}
