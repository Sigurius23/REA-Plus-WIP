package ej1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import km2.AbstractC22592c;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import zi1.AbstractC40692v;

/* JADX INFO: renamed from: ej1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13253p implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f45891E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f45892F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f45893w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f45894x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC25312u f45895y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f45896z;

    public /* synthetic */ C13253p(int i13, int i14, int i15, Modifier modifier, Function1 function1, InterfaceC25312u interfaceC25312u) {
        this.f45893w = i15;
        this.f45894x = modifier;
        this.f45895y = interfaceC25312u;
        this.f45896z = function1;
        this.f45891E = i13;
        this.f45892F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45893w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13254q.m37261g(this.f45894x, this.f45895y, this.f45896z, this.f45891E, this.f45892F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22592c.m65502m(this.f45894x, this.f45895y, this.f45896z, this.f45891E, this.f45892F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Modifier modifier = this.f45894x;
                return AbstractC40692v.m132142g(this.f45895y, this.f45896z, modifier, this.f45891E, this.f45892F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C13253p(InterfaceC25312u interfaceC25312u, Function1 function1, Modifier modifier, int i13, int i14) {
        this.f45893w = 2;
        this.f45895y = interfaceC25312u;
        this.f45896z = function1;
        this.f45894x = modifier;
        this.f45891E = i13;
        this.f45892F = i14;
    }
}
