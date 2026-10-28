package br2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import kq2.AbstractC22776b;
import z71.AbstractC40154m;

/* JADX INFO: renamed from: br2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3569k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f14441E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14442w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f14443x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f14444y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f14445z;

    public /* synthetic */ C3569k(Modifier modifier, TextResource textResource, TextResource textResource2, int i13, int i14) {
        this.f14442w = i14;
        this.f14443x = modifier;
        this.f14444y = textResource;
        this.f14445z = textResource2;
        this.f14441E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14442w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3570l.m10720c(this.f14443x, this.f14444y, this.f14445z, this.f14441E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22776b.m65991c(this.f14443x, this.f14444y, this.f14445z, this.f14441E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC40154m.m128771c(this.f14443x, this.f14444y, this.f14445z, this.f14441E, (Composer) obj, iIntValue3);
        }
    }
}
