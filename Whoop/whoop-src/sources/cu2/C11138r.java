package cu2;

import androidx.lifecycle.C1593i0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.healthconnect.view.HealthConnectFragment;
import com.whoop.weightlifting.AbstractC10757a;
import l83.InterfaceC23462h;
import p390p1.InterfaceC28601c1;
import p439qv.C30648e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.AbstractC31917f;
import p743vy1.Function1;
import uy1.C35381e;

/* JADX INFO: renamed from: cu2.r */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11138r implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35576w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f35577x;

    public /* synthetic */ C11138r(Object obj, int i13) {
        this.f35576w = i13;
        this.f35577x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        switch (this.f35576w) {
            case 0:
                AbstractC10757a.m28176x((InterfaceC23462h) this.f35577x, interfaceC1585g0, event);
                break;
            case 1:
                C30648e c30648e = (C30648e) this.f35577x;
                AbstractC22676k.m65750j(interfaceC1585g0, "<anonymous parameter 0>");
                AbstractC22676k.m65750j(event, "event");
                C1593i0 c1593i0 = c30648e.f126066x;
                boolean z4 = c1593i0.f6250d.compareTo(EnumC1635w.f6327y) >= 0;
                if (c30648e.f126067y || (z4 && event == EnumC1632v.ON_DESTROY)) {
                    c1593i0.m4991g(event);
                }
                break;
            case 2:
                AbstractC31917f.m99353k((InterfaceC28601c1) this.f35577x, interfaceC1585g0, event);
                break;
            case 3:
                HealthConnectFragment.m21557K((HealthConnectFragment) this.f35577x, interfaceC1585g0, event);
                break;
            default:
                Function1.m117539A((C35381e) this.f35577x, interfaceC1585g0, event);
                break;
        }
    }
}
