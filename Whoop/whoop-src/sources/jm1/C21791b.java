package jm1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: jm1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21791b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83936w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21793d f83937x;

    public /* synthetic */ C21791b(C21793d c21793d, int i13) {
        this.f83936w = i13;
        this.f83937x = c21793d;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f83936w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21792c.m61660j(this.f83937x, composer, iIntValue);
            default:
                return AbstractC21792c.m61659i(this.f83937x, composer, iIntValue);
        }
    }
}
