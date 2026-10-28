package hr2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import sq2.AbstractC32884a;

/* JADX INFO: renamed from: hr2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17584d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68134w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f68135x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f68136y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f68137z;

    public /* synthetic */ C17584d(Object obj, long j7, int i13, int i14) {
        this.f68134w = i14;
        this.f68137z = obj;
        this.f68135x = j7;
        this.f68136y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f68134w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC17585e.m50073h((C17581a) this.f68137z, this.f68135x, this.f68136y, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32884a.m103223e((List) this.f68137z, this.f68135x, this.f68136y, (Composer) obj, iIntValue2);
        }
    }
}
