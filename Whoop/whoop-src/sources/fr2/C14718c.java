package fr2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: fr2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14718c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54456w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14717b f54457x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f54458y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f54459z;

    public /* synthetic */ C14718c(C14717b c14717b, boolean z4, int i13, int i14) {
        this.f54456w = i14;
        this.f54457x = c14717b;
        this.f54458y = z4;
        this.f54459z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f54456w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC14719d.m42213e(this.f54457x, this.f54458y, this.f54459z, composer, iIntValue);
            default:
                return AbstractC14721f.m42220g(this.f54457x, this.f54458y, this.f54459z, composer, iIntValue);
        }
    }
}
