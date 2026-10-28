package yw1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import uw1.C35310c;

/* JADX INFO: renamed from: yw1.f */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39819f implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171588w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35310c f171589x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f171590y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f171591z;

    public /* synthetic */ C39819f(C35310c c35310c, Function1 function1, int i13, int i14) {
        this.f171588w = i14;
        this.f171589x = c35310c;
        this.f171590y = function1;
        this.f171591z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f171588w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC39821h.m127675k(this.f171589x, this.f171590y, this.f171591z, composer, iIntValue);
            default:
                return AbstractC39822i.m127683H(this.f171589x, this.f171590y, this.f171591z, composer, iIntValue);
        }
    }
}
