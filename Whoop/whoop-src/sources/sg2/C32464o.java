package sg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import mj0.C25616e;
import p390p1.AbstractC28683x;
import p460rg.AbstractC31366a;
import p477s2.AbstractC32072d;
import p478s3.AbstractC32098d;
import p715kotlin.jvm.functions.Function1;
import p734sl0.AbstractC32681u2;
import p736sz0.AbstractC33174e;
import p736sz0.C33183h;
import rg2.AbstractC31402n;
import tj1.AbstractC33867b;
import tp1.C34065e;
import vp1.AbstractC36268d;
import vt1.C36491e;
import vx0.AbstractC36555c;
import wb0.C37032c;
import x30.C37877c;
import x30.C37897i1;
import x30.C37912n1;
import yb0.AbstractC39384g;

/* JADX INFO: renamed from: sg2.o */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32464o implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f134448E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134449w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f134450x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f134451y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f134452z;

    public /* synthetic */ C32464o(Object obj, boolean z4, Object obj2, int i13, int i14) {
        this.f134449w = i14;
        this.f134452z = obj;
        this.f134450x = z4;
        this.f134448E = obj2;
        this.f134451y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f134449w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC32465p.m101388i((AbstractC31402n) this.f134452z, this.f134450x, (Modifier) this.f134448E, this.f134451y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32681u2.m102489y((String) this.f134452z, this.f134450x, (Function1) this.f134448E, this.f134451y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC33174e.m105109p((C33183h) this.f134452z, this.f134450x, (Function1) this.f134448E, this.f134451y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC33867b.m107094e(this.f134450x, (Function1) this.f134452z, (Function1) this.f134448E, this.f134451y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC36268d.m115727f((C34065e) this.f134452z, this.f134450x, (InterfaceC4339a) this.f134448E, this.f134451y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC36555c.m117235o((C25616e) this.f134452z, this.f134450x, (InterfaceC4339a) this.f134448E, this.f134451y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return p744wt1.Function1.m120860G((C36491e) this.f134452z, this.f134450x, (InterfaceC4339a) this.f134448E, this.f134451y, (Composer) obj, iIntValue7);
            case 7:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f134451y | 1);
                AbstractC31366a.m96461a(this.f134450x, (C37877c) this.f134452z, (Modifier) this.f134448E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 8:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(this.f134451y | 1);
                AbstractC32072d.m99700i(this.f134450x, (C37897i1) this.f134452z, (Modifier) this.f134448E, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
            case 9:
                ((Integer) obj2).getClass();
                int iM87244L3 = AbstractC28683x.m87244L(this.f134451y | 1);
                AbstractC32098d.m99837c(this.f134450x, (C37912n1) this.f134452z, (Modifier) this.f134448E, (Composer) obj, iM87244L3);
                return C23454a0.f92919a;
            default:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC39384g.m125615S((C37032c) this.f134452z, this.f134450x, (InterfaceC4339a) this.f134448E, this.f134451y, (Composer) obj, iIntValue8);
        }
    }

    public /* synthetic */ C32464o(boolean z4, Object obj, Object obj2, int i13, int i14) {
        this.f134449w = i14;
        this.f134450x = z4;
        this.f134452z = obj;
        this.f134448E = obj2;
        this.f134451y = i13;
    }
}
