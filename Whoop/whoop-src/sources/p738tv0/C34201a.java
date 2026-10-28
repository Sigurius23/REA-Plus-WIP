package p738tv0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import pv0.C29577d;

/* JADX INFO: renamed from: tv0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C34201a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143476w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29577d f143477x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f143478y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f143479z;

    public /* synthetic */ C34201a(C29577d c29577d, Function1 function1, int i13, int i14) {
        this.f143476w = i14;
        this.f143477x = c29577d;
        this.f143478y = function1;
        this.f143479z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f143476w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34202b.m108109g(this.f143477x, this.f143478y, this.f143479z, composer, iIntValue);
            default:
                return AbstractC34202b.m108112j(this.f143477x, this.f143478y, this.f143479z, composer, iIntValue);
        }
    }
}
