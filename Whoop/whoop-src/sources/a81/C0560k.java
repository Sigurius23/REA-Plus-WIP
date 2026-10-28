package a81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import e81.AbstractC12836k;
import gz2.AbstractC16336c;
import java.util.List;
import kh0.AbstractC22479f;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import se.AbstractC32411b;

/* JADX INFO: renamed from: a81.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0560k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f1943E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f1944F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1945w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f1946x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f1947y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f1948z;

    public /* synthetic */ C0560k(Modifier modifier, List list, Function1 function1, int i13, int i14, int i15) {
        this.f1945w = i15;
        this.f1948z = modifier;
        this.f1946x = list;
        this.f1947y = function1;
        this.f1943E = i13;
        this.f1944F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1945w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f1948z;
                return AbstractC0564o.m1435z(this.f1946x, this.f1947y, modifier, this.f1943E, this.f1944F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f1948z;
                return AbstractC0564o.m1380B(this.f1946x, this.f1947y, modifier2, this.f1943E, this.f1944F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC12836k.m35999c0(this.f1948z, this.f1946x, this.f1947y, this.f1943E, this.f1944F, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier3 = this.f1948z;
                return AbstractC16336c.m46536e(this.f1946x, this.f1947y, modifier3, this.f1943E, this.f1944F, (Composer) obj, iIntValue4);
            case 4:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f1943E | 1);
                AbstractC32411b.m101100l(this.f1948z, this.f1946x, this.f1947y, iM87244L, (Composer) obj, this.f1944F);
                return C23454a0.f92919a;
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                Modifier modifier4 = this.f1948z;
                return AbstractC22479f.m64938e(this.f1946x, modifier4, this.f1947y, this.f1943E, this.f1944F, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C0560k(List list, Modifier modifier, Function1 function1, int i13, int i14) {
        this.f1945w = 5;
        this.f1946x = list;
        this.f1948z = modifier;
        this.f1947y = function1;
        this.f1943E = i13;
        this.f1944F = i14;
    }

    public /* synthetic */ C0560k(List list, Function1 function1, Modifier modifier, int i13, int i14, int i15) {
        this.f1945w = i15;
        this.f1946x = list;
        this.f1947y = function1;
        this.f1948z = modifier;
        this.f1943E = i13;
        this.f1944F = i14;
    }
}
