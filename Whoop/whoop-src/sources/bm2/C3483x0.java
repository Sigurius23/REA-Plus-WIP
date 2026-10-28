package bm2;

import androidx.compose.runtime.Composer;
import com.whoop.startactivity.goals.AbstractC10237a;
import java.util.List;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC23013y;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: bm2.x0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3483x0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13671w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f13672x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f13673y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f13674z;

    public /* synthetic */ C3483x0(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f13673y = list;
        this.f13674z = function1;
        this.f13672x = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f13671w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC3487z0.m10259h0(this.f13673y, this.f13674z, this.f13672x, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC10237a.m26004n(this.f13672x, this.f13673y, this.f13674z, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C3483x0(InterfaceC28601c1 interfaceC28601c1, List list, Function1 function1) {
        this.f13672x = interfaceC28601c1;
        this.f13673y = list;
        this.f13674z = function1;
    }
}
