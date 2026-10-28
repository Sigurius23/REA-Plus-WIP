package hy0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i91.AbstractC18247a;
import l01.AbstractC23041m;

/* JADX INFO: renamed from: hy0.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C17728c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68912w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC18247a f68913x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f68914y;

    public /* synthetic */ C17728c(AbstractC18247a abstractC18247a, int i13, int i14) {
        this.f68912w = i14;
        this.f68913x = abstractC18247a;
        this.f68914y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f68912w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC17732d.m50820e(this.f68913x, this.f68914y, composer, iIntValue);
            default:
                return AbstractC23041m.m66841D(this.f68913x, this.f68914y, composer, iIntValue);
        }
    }
}
