package qn0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p291l0.InterfaceC23001u;
import re1.AbstractC31326m;

/* JADX INFO: renamed from: qn0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C30509d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125348w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23001u f125349x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f125350y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f125351z;

    public /* synthetic */ C30509d(InterfaceC23001u interfaceC23001u, float f13, int i13, int i14) {
        this.f125348w = i14;
        this.f125349x = interfaceC23001u;
        this.f125350y = f13;
        this.f125351z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f125348w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC30510e.m93438h(this.f125349x, this.f125350y, this.f125351z, composer, iIntValue);
            default:
                return AbstractC31326m.m96414f(this.f125349x, this.f125350y, this.f125351z, composer, iIntValue);
        }
    }
}
