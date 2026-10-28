package ir2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: ir2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C20864c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78505w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20863b f78506x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f78507y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f78508z;

    public /* synthetic */ C20864c(C20863b c20863b, boolean z4, int i13, int i14) {
        this.f78505w = i14;
        this.f78506x = c20863b;
        this.f78507y = z4;
        this.f78508z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f78505w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC20865d.m57639n(this.f78506x, this.f78507y, this.f78508z, composer, iIntValue);
            default:
                return AbstractC20867f.m57646g(this.f78506x, this.f78507y, this.f78508z, composer, iIntValue);
        }
    }
}
