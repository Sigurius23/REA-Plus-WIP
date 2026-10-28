package uu2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: uu2.j */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35257j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149978w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35258j0 f149979x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f149980y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f149981z;

    public /* synthetic */ C35257j(C35258j0 c35258j0, Function1 function1, int i13, int i14) {
        this.f149978w = i14;
        this.f149979x = c35258j0;
        this.f149980y = function1;
        this.f149981z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f149978w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC35261l.m111785b0(this.f149979x, this.f149980y, this.f149981z, composer, iIntValue);
            default:
                return AbstractC35272w.m111874I(this.f149979x, this.f149980y, this.f149981z, composer, iIntValue);
        }
    }
}
