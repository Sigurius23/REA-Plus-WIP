package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import p077d0.C11421z1;
import p390p1.AbstractC28683x;
import y11.AbstractC39058k;

/* JADX INFO: renamed from: g40.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15428u0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f57990E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f57991F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57992w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f57993x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f57994y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f57995z;

    public /* synthetic */ C15428u0(long j7, C11421z1 c11421z1, List list, C23465k c23465k, boolean z4) {
        this.f57995z = c11421z1;
        this.f57990E = list;
        this.f57993x = j7;
        this.f57994y = z4;
        this.f57991F = c23465k;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57992w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC15448y0.m43611b((String) this.f57995z, this.f57994y, this.f57993x, (Modifier) this.f57990E, (InterfaceC4339a) this.f57991F, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC39058k.m124520l((C11421z1) this.f57995z, (List) this.f57990E, this.f57993x, this.f57994y, (C23465k) this.f57991F, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C15428u0(String str, boolean z4, long j7, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13) {
        this.f57995z = str;
        this.f57994y = z4;
        this.f57993x = j7;
        this.f57990E = modifier;
        this.f57991F = interfaceC4339a;
    }
}
