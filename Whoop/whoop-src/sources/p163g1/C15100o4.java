package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import hr2.AbstractC17586f;
import hr2.C17581a;
import l83.C23454a0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: g1.o4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15100o4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56559E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56560w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f56561x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f56562y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f56563z;

    public /* synthetic */ C15100o4(Object obj, long j7, long j13, int i13, int i14) {
        this.f56560w = i14;
        this.f56559E = obj;
        this.f56561x = j7;
        this.f56562y = j13;
        this.f56563z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56560w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15170v4.m43203c((Modifier) this.f56559E, this.f56561x, this.f56562y, (Composer) obj, AbstractC28683x.m87244L(this.f56563z | 1));
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17586f.m50084k((C17581a) this.f56559E, this.f56561x, this.f56562y, this.f56563z, (Composer) obj, iIntValue);
        }
    }
}
