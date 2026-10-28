package hr2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: hr2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17583c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68130w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17582b f68131x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f68132y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f68133z;

    public /* synthetic */ C17583c(C17582b c17582b, boolean z4, int i13, int i14) {
        this.f68130w = i14;
        this.f68131x = c17582b;
        this.f68132y = z4;
        this.f68133z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f68130w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC17585e.m50071f(this.f68131x, this.f68132y, this.f68133z, composer, iIntValue);
            default:
                return AbstractC17586f.m50079f(this.f68131x, this.f68132y, this.f68133z, composer, iIntValue);
        }
    }
}
