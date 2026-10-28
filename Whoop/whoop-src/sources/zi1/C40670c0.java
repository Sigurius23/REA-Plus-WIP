package zi1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p208i2.InterfaceC17869a1;
import p715kotlin.jvm.functions.Function1;
import tk2.C33885c;
import tk2.C33896n;
import tk2.C33897o;
import vm2.C36159d;
import w41.C36806f;
import xo2.C38497c;
import yi1.C39582p;
import zk2.AbstractC40848i;
import zk2.AbstractC40854o;
import zk2.AbstractC40864y;
import zm1.AbstractC40894e;
import zm1.C40895f;
import zm2.AbstractC40896a;
import zo2.AbstractC40936g;
import zq0.AbstractC40960c0;
import zq0.AbstractC40979t;
import zq0.C40962d0;
import zq0.C40980u;
import zy0.AbstractC41218f;
import zz0.AbstractC41246g;
import zz0.C41247h;

/* JADX INFO: renamed from: zi1.c0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C40670c0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f175585E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f175586w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f175587x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f175588y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f175589z;

    public /* synthetic */ C40670c0(Object obj, int i13, Object obj2, int i14, int i15) {
        this.f175586w = i15;
        this.f175589z = obj;
        this.f175585E = obj2;
        this.f175587x = i13;
        this.f175588y = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f175586w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC40672d0.m132029h((C39582p) this.f175589z, (Function1) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC40848i.m132381d((C33885c) this.f175589z, (Modifier) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40848i.m132383f((C33896n) this.f175589z, (Modifier) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC40854o.m132404l((C36806f) this.f175589z, (Modifier) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC40864y.m132452c((C33897o) this.f175589z, (Modifier) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC40894e.m132542s((C40895f) this.f175589z, (Function1) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC40896a.m132553e((C36159d) this.f175589z, (Modifier) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC40936g.m132836m((C38497c) this.f175589z, (Function1) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC40979t.m133061c((Modifier) this.f175589z, (C40980u) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC40960c0.m132920k((Modifier) this.f175589z, (C40962d0) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue10);
            case 10:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC41218f.m133902e((Modifier) this.f175589z, (InterfaceC17869a1) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue11);
            default:
                int iIntValue12 = ((Integer) obj2).intValue();
                return AbstractC41246g.m133966C((Modifier) this.f175589z, (C41247h) this.f175585E, this.f175587x, this.f175588y, (Composer) obj, iIntValue12);
        }
    }
}
