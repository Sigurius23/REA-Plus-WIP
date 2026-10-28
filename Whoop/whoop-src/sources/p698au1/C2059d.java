package p698au1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bm2.AbstractC3442g0;
import bm2.AbstractC3459m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import f02.AbstractC13916b;
import hv2.AbstractC17687i;
import hy0.AbstractC17726b1;
import id2.AbstractC18435t;
import p710im1.Function0;
import p748zc1.AbstractC40455r7;
import sg2.AbstractC32461l;

/* JADX INFO: renamed from: au1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2059d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f8181E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8182w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f8183x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f8184y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f8185z;

    public /* synthetic */ C2059d(Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f8182w = i15;
        this.f8183x = modifier;
        this.f8184y = interfaceC4339a;
        this.f8185z = i13;
        this.f8181E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8182w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2060e.m6489g(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC3459m.m10148p(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC3442g0.m10063s(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                Modifier modifier = this.f8183x;
                return AbstractC13916b.m39657n(this.f8184y, modifier, this.f8185z, this.f8181E, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC17687i.m50478U(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC17726b1.m50791i(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue6);
            case 6:
                int iIntValue7 = ((Integer) obj2).intValue();
                Modifier modifier2 = this.f8183x;
                return AbstractC18435t.m53079D(this.f8184y, modifier2, this.f8185z, this.f8181E, (Composer) obj, iIntValue7);
            case 7:
                int iIntValue8 = ((Integer) obj2).intValue();
                Modifier modifier3 = this.f8183x;
                return Function0.m54148c(this.f8184y, modifier3, this.f8185z, this.f8181E, (Composer) obj, iIntValue8);
            case 8:
                int iIntValue9 = ((Integer) obj2).intValue();
                Modifier modifier4 = this.f8183x;
                return AbstractC32461l.m101373m(this.f8184y, modifier4, this.f8185z, this.f8181E, (Composer) obj, iIntValue9);
            case 9:
                int iIntValue10 = ((Integer) obj2).intValue();
                return AbstractC40455r7.m130779g(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue10);
            default:
                int iIntValue11 = ((Integer) obj2).intValue();
                return AbstractC40455r7.m130782j(this.f8183x, this.f8184y, this.f8185z, this.f8181E, (Composer) obj, iIntValue11);
        }
    }

    public /* synthetic */ C2059d(InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, int i15) {
        this.f8182w = i15;
        this.f8184y = interfaceC4339a;
        this.f8183x = modifier;
        this.f8185z = i13;
        this.f8181E = i14;
    }
}
