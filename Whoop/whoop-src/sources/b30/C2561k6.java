package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import cw2.AbstractC11163d;
import km1.AbstractC22585b;
import l83.C23454a0;
import lf0.AbstractC23917f2;
import p390p1.AbstractC28683x;
import p522uf.AbstractC34870c0;
import se.AbstractC32410a;
import yb0.AbstractC39388k;
import zv2.AbstractC41172h;

/* JADX INFO: renamed from: b30.k6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2561k6 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f9949E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f9950F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9951w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f9952x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f9953y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f9954z;

    public /* synthetic */ C2561k6(Modifier modifier, String str, String str2, int i13, int i14, int i15) {
        this.f9951w = i15;
        this.f9954z = modifier;
        this.f9952x = str;
        this.f9953y = str2;
        this.f9949E = i13;
        this.f9950F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9951w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC34870c0.m109990a(this.f9954z, this.f9952x, this.f9953y, (Composer) obj, AbstractC28683x.m87244L(this.f9949E | 1), this.f9950F);
                return C23454a0.f92919a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f9954z;
                return AbstractC11163d.m30262n(this.f9952x, this.f9953y, modifier, this.f9949E, this.f9950F, (Composer) obj, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22585b.m65459r(this.f9954z, this.f9952x, this.f9953y, this.f9949E, this.f9950F, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC23917f2.m70320L(this.f9954z, this.f9952x, this.f9953y, this.f9949E, this.f9950F, (Composer) obj, iIntValue3);
            case 4:
                ((Integer) obj2).getClass();
                AbstractC32410a.m101026e(this.f9954z, this.f9952x, this.f9953y, (Composer) obj, this.f9949E, AbstractC28683x.m87244L(this.f9950F | 1));
                return C23454a0.f92919a;
            case 5:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f9954z;
                return AbstractC39388k.m125713g0(this.f9952x, this.f9953y, modifier2, this.f9949E, this.f9950F, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC41172h.m133786G(this.f9954z, this.f9952x, this.f9953y, this.f9949E, this.f9950F, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C2561k6(String str, String str2, Modifier modifier, int i13, int i14, int i15) {
        this.f9951w = i15;
        this.f9952x = str;
        this.f9953y = str2;
        this.f9954z = modifier;
        this.f9949E = i13;
        this.f9950F = i14;
    }
}
