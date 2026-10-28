package g40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import gr1.C16102i;
import hy0.AbstractC17795v0;
import java.util.List;
import jr1.AbstractC21893a;
import l83.C23454a0;
import p294l3.C23285v0;
import p316m1.InterfaceC24926x;
import p330n1.AbstractC26108h;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import p730qt2.AbstractC30600f;
import p730qt2.C30597d;
import qm1.AbstractC30483e;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: g40.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15348f0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57679w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f57680x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f57681y;

    public /* synthetic */ C15348f0(long j7, Object obj, int i13) {
        this.f57679w = i13;
        this.f57680x = j7;
        this.f57681y = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57679w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC37978j.m121647h(this.f57680x, (String) this.f57681y, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17795v0.m51135r((Integer) this.f57681y, this.f57680x, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17795v0.m51136s((TextResource) this.f57681y, this.f57680x, (Composer) obj, iIntValue2);
            case 3:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(1);
                AbstractC34870c0.m110019u((C23285v0) this.f57681y, this.f57680x, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
            case 4:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC21893a.m62163g((C16102i) this.f57681y, this.f57680x, (Composer) obj, iIntValue3);
            case 5:
                ((Integer) obj2).getClass();
                int iM87244L3 = AbstractC28683x.m87244L(1);
                AbstractC26108h.m77670a((InterfaceC24926x) this.f57681y, this.f57680x, (Composer) obj, iM87244L3);
                return C23454a0.f92919a;
            case 6:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC30483e.m93334q(this.f57680x, (List) this.f57681y, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC30600f.m93881j(this.f57680x, (C30597d) this.f57681y, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C15348f0(Object obj, long j7, int i13) {
        this.f57679w = i13;
        this.f57681y = obj;
        this.f57680x = j7;
    }

    public /* synthetic */ C15348f0(Object obj, long j7, int i13, int i14) {
        this.f57679w = i14;
        this.f57681y = obj;
        this.f57680x = j7;
    }
}
