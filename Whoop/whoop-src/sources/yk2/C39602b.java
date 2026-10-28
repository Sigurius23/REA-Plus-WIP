package yk2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import yn2.AbstractC39677d;
import z51.AbstractC40098i;

/* JADX INFO: renamed from: yk2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C39602b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170355w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f170356x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f170357y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f170358z;

    public /* synthetic */ C39602b(int i13, int i14, int i15, Modifier modifier) {
        this.f170355w = i15;
        this.f170356x = modifier;
        this.f170357y = i13;
        this.f170358z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f170355w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC39603c.m126495c(this.f170356x, this.f170357y, this.f170358z, composer, iIntValue);
            case 1:
                return AbstractC39677d.m126906c(this.f170356x, this.f170357y, this.f170358z, composer, iIntValue);
            default:
                return AbstractC40098i.m128604j(this.f170356x, this.f170357y, this.f170358z, composer, iIntValue);
        }
    }
}
