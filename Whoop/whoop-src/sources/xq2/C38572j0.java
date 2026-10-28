package xq2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import kd1.AbstractC22403o;
import p720m91.C25307p;
import s51.C32212i;

/* JADX INFO: renamed from: xq2.j0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38572j0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166005w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f166006x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f166007y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f166008z;

    public /* synthetic */ C38572j0(Object obj, Object obj2, int i13, int i14) {
        this.f166005w = i14;
        this.f166007y = obj;
        this.f166008z = obj2;
        this.f166006x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f166005w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC38576l0.m123694s((AbstractC22403o) this.f166007y, (C32212i) this.f166008z, this.f166006x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC38576l0.m123697v((List) this.f166007y, (C25307p) this.f166008z, this.f166006x, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC38554c1.m123571Y((Modifier) this.f166007y, (C38599x) this.f166008z, this.f166006x, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC38554c1.m123569W((TextResource) this.f166007y, (TextResource) this.f166008z, this.f166006x, (Composer) obj, iIntValue4);
        }
    }
}
