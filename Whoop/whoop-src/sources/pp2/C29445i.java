package pp2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import np2.C27036c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pp2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29445i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119576w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27036c f119577x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f119578y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f119579z;

    public /* synthetic */ C29445i(C27036c c27036c, Function1 function1, int i13, int i14) {
        this.f119576w = i14;
        this.f119577x = c27036c;
        this.f119578y = function1;
        this.f119579z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f119576w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC29448l.m89886k(this.f119577x, this.f119578y, this.f119579z, composer, iIntValue);
            default:
                return AbstractC29452p.m89919m(this.f119577x, this.f119578y, this.f119579z, composer, iIntValue);
        }
    }
}
