package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13037f2;
import f11.AbstractC14004d;
import f11.C14005e;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p81.AbstractC28970b;
import p81.C28971c;
import vy0.AbstractC36588p;

/* JADX INFO: renamed from: b30.f5 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2520f5 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f9806E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9807w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f9808x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f9809y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f9810z;

    public /* synthetic */ C2520f5(InterfaceC13037f2 interfaceC13037f2, boolean z4, int i13, int i14, int i15) {
        this.f9807w = 0;
        this.f9806E = interfaceC13037f2;
        this.f9808x = z4;
        this.f9809y = i13;
        this.f9810z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9807w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC2592o5.m7504b((InterfaceC13037f2) this.f9806E, this.f9808x, this.f9809y, this.f9810z, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14004d.m39860i((C14005e) this.f9806E, this.f9808x, this.f9809y, this.f9810z, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC28970b.m87984g((C28971c) this.f9806E, this.f9808x, this.f9809y, this.f9810z, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC36588p.m117426Y0((InterfaceC4339a) this.f9806E, this.f9808x, this.f9809y, this.f9810z, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C2520f5(Object obj, boolean z4, int i13, int i14, int i15) {
        this.f9807w = i15;
        this.f9806E = obj;
        this.f9808x = z4;
        this.f9809y = i13;
        this.f9810z = i14;
    }
}
