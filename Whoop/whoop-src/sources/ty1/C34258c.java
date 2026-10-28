package ty1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ty1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34258c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f143687E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f143688F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f143689G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143690w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34266k f143691x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f143692y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f143693z;

    public /* synthetic */ C34258c(C34266k c34266k, String str, Function1 function1, Modifier modifier, int i13, int i14, int i15) {
        this.f143690w = i15;
        this.f143691x = c34266k;
        this.f143692y = str;
        this.f143693z = function1;
        this.f143687E = modifier;
        this.f143688F = i13;
        this.f143689G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f143690w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC34264i.m108363g0(this.f143691x, this.f143692y, this.f143693z, this.f143687E, this.f143688F, this.f143689G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC34264i.m108342S(this.f143691x, this.f143692y, this.f143693z, this.f143687E, this.f143688F, this.f143689G, (Composer) obj, iIntValue2);
        }
    }
}
