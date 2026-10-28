package m41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import n41.C26273d;
import n41.C26275f;
import n41.C26276g;

/* JADX INFO: renamed from: m41.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C25051c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C26276g f98145E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f98146F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f98147G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98148w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f98149x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26275f f98150y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26273d f98151z;

    public /* synthetic */ C25051c(Modifier modifier, C26275f c26275f, C26273d c26273d, C26276g c26276g, int i13, int i14, int i15) {
        this.f98148w = i15;
        this.f98149x = modifier;
        this.f98150y = c26275f;
        this.f98151z = c26273d;
        this.f98145E = c26276g;
        this.f98146F = i13;
        this.f98147G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98148w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC25053e.m73519u(this.f98149x, this.f98150y, this.f98151z, this.f98145E, this.f98146F, this.f98147G, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC25053e.m73523y(this.f98149x, this.f98150y, this.f98151z, this.f98145E, this.f98146F, this.f98147G, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC25053e.m73517s(this.f98149x, this.f98150y, this.f98151z, this.f98145E, this.f98146F, this.f98147G, (Composer) obj, iIntValue3);
        }
    }
}
