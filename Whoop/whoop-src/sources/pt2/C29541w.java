package pt2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ot2.C28349r;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pt2.w */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C29541w implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f120305E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120306w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28349r f120307x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f120308y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f120309z;

    public /* synthetic */ C29541w(C28349r c28349r, Function1 function1, Function1 function2, int i13, int i14) {
        this.f120306w = i14;
        this.f120307x = c28349r;
        this.f120308y = function1;
        this.f120309z = function2;
        this.f120305E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f120306w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC29543y.m90481q(this.f120307x, this.f120308y, this.f120309z, this.f120305E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC29543y.m90464F(this.f120307x, this.f120308y, this.f120309z, this.f120305E, (Composer) obj, iIntValue2);
        }
    }
}
