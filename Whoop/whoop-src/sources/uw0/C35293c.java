package uw0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import km0.C22580d;
import zr1.AbstractC41069c;

/* JADX INFO: renamed from: uw0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35293c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150296w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22580d f150297x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f150298y;

    public /* synthetic */ C35293c(C22580d c22580d, int i13, int i14) {
        this.f150296w = i14;
        this.f150297x = c22580d;
        this.f150298y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f150296w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC35296f.m111991n(this.f150297x, this.f150298y, composer, iIntValue);
            default:
                return AbstractC41069c.m133346n(this.f150297x, this.f150298y, composer, iIntValue);
        }
    }
}
