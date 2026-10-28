package mm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.p069ui.debug.IterableToolDebugFragment;

/* JADX INFO: renamed from: mm2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C25699b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101202w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ IterableToolDebugFragment f101203x;

    public /* synthetic */ C25699b(IterableToolDebugFragment iterableToolDebugFragment, int i13) {
        this.f101202w = i13;
        this.f101203x = iterableToolDebugFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f101202w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IterableToolDebugFragment.m26756O(this.f101203x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IterableToolDebugFragment.m26757P(this.f101203x, (Composer) obj, iIntValue2);
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return IterableToolDebugFragment.m26758Q(this.f101203x, (String) obj, zBooleanValue);
        }
    }
}
