package b30;

import com.whoop.health.domain.models.MenstrualCycleInsightsCardModel;
import dj0.C12066b;
import dj1.AbstractC12090c;
import io.getstream.chat.android.client.internal.state.plugin.logic.querychannels.internal.QueryChannelsLogic;
import io.getstream.chat.android.client.internal.state.sync.internal.SyncManager;
import j93.InterfaceC21493z;
import jb1.C21536b;
import l83.C23454a0;
import lf0.AbstractC23951o0;
import m40.AbstractC25048y;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import re.C31274h0;
import re.C31308y0;
import sy0.AbstractC33085h;
import v90.AbstractC35822n;

/* JADX INFO: renamed from: b30.x4 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2656x4 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10377w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10378x;

    public /* synthetic */ C2656x4(boolean z4, int i13) {
        this.f10377w = i13;
        this.f10378x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f10377w;
        boolean z4 = this.f10378x;
        switch (i13) {
            case 0:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (!z4) {
                    InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                    ((C18030l) semantics).m51772e(AbstractC18039u.f70048o, c23454a0);
                }
                return c23454a0;
            case 1:
                return C12066b.m33277O(z4, (C31274h0) obj);
            case 2:
                return C12066b.m33278P(z4, (C31308y0) obj);
            case 3:
                return AbstractC12090c.m33357C(z4, (C21536b) obj);
            case 4:
                return AbstractC12090c.m33358D(z4, (C23749z0) obj);
            case 5:
                return AbstractC12090c.m33363I(z4, (MenstrualCycleInsightsCardModel) obj);
            case 6:
                return Boolean.valueOf(SyncManager.updateActiveQueryChannels$lambda$56(z4, (QueryChannelsLogic) obj));
            case 7:
                return AbstractC23951o0.m70553h(z4, (InterfaceC18044z) obj);
            case 8:
                AbstractC25048y targetState = (AbstractC25048y) obj;
                AbstractC22676k.m65750j(targetState, "targetState");
                return z4 ? Boolean.TRUE : targetState;
            case 9:
                return AbstractC33085h.m104817g(z4, (InterfaceC18044z) obj);
            case 10:
                C2598p3 c2598p3 = (C2598p3) obj;
                if (c2598p3 != null) {
                    return C2598p3.m7511a(c2598p3, z4);
                }
                return null;
            default:
                return AbstractC35822n.m113624j(z4, (InterfaceC18044z) obj);
        }
    }
}
