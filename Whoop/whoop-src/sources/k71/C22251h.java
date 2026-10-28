package k71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import w11.AbstractC36695b;

/* JADX INFO: renamed from: k71.h */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22251h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f86754E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f86755F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86756w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f86757x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f86758y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f86759z;

    public /* synthetic */ C22251h(long j7, long j13, int i13, boolean z4, int i14, int i15) {
        this.f86756w = i15;
        this.f86757x = j7;
        this.f86758y = j13;
        this.f86759z = i13;
        this.f86754E = z4;
        this.f86755F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f86756w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22253j.m63848r(this.f86757x, this.f86758y, this.f86759z, this.f86754E, this.f86755F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36695b.m117776m(this.f86757x, this.f86758y, this.f86759z, this.f86754E, this.f86755F, (Composer) obj, iIntValue2);
        }
    }
}
