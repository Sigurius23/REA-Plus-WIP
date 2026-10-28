package pq1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import vs2.AbstractC36479e;

/* JADX INFO: renamed from: pq1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C29479c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119735w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25312u f119736x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f119737y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f119738z;

    public /* synthetic */ C29479c(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14) {
        this.f119735w = i14;
        this.f119736x = interfaceC25312u;
        this.f119737y = function1;
        this.f119738z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f119735w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC29480d.m90029f(this.f119736x, this.f119737y, this.f119738z, composer, iIntValue);
            case 1:
                return AbstractC36479e.m116862X(this.f119736x, this.f119737y, this.f119738z, composer, iIntValue);
            default:
                return AbstractC36479e.m116840B(this.f119736x, this.f119737y, this.f119738z, composer, iIntValue);
        }
    }
}
