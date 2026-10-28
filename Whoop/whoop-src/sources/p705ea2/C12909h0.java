package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import he1.AbstractC17212a;
import u11.AbstractC34443i;

/* JADX INFO: renamed from: ea2.h0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12909h0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f44423E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44424w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f44425x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f44426y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f44427z;

    public /* synthetic */ C12909h0(String str, String str2, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f44424w = i14;
        this.f44425x = str;
        this.f44426y = str2;
        this.f44427z = interfaceC4339a;
        this.f44423E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44424w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC12911i0.m36317i(this.f44425x, this.f44426y, this.f44427z, this.f44423E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17212a.m48643r(this.f44425x, this.f44426y, this.f44427z, this.f44423E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC34443i.m108863k0(this.f44425x, this.f44426y, this.f44427z, this.f44423E, (Composer) obj, iIntValue3);
        }
    }
}
