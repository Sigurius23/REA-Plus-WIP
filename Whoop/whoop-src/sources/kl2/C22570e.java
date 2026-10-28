package kl2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import nl2.C26816c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kl2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C22570e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88808w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26816c f88809x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f88810y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f88811z;

    public /* synthetic */ C22570e(C26816c c26816c, Function1 function1, int i13, int i14) {
        this.f88808w = i14;
        this.f88809x = c26816c;
        this.f88810y = function1;
        this.f88811z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f88808w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC22576k.m65354Q(this.f88809x, this.f88810y, this.f88811z, composer, iIntValue);
            default:
                return AbstractC22576k.m65356S(this.f88809x, this.f88810y, this.f88811z, composer, iIntValue);
        }
    }
}
