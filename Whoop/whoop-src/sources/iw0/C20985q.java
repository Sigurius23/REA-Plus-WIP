package iw0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import pj2.AbstractC29310i;
import s01.C32048d;

/* JADX INFO: renamed from: iw0.q */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20985q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79287w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C32048d f79288x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f79289y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f79290z;

    public /* synthetic */ C20985q(C32048d c32048d, Function1 function1, int i13, int i14) {
        this.f79287w = i14;
        this.f79288x = c32048d;
        this.f79289y = function1;
        this.f79290z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f79287w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC20992x.m58372M1(this.f79288x, this.f79289y, this.f79290z, composer, iIntValue);
            default:
                return AbstractC29310i.m89046i1(this.f79288x, this.f79289y, this.f79290z, composer, iIntValue);
        }
    }
}
