package j22;

import androidx.compose.runtime.Composer;
import k22.C22164d;
import p114eb.C12982q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: j22.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21254c implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81130w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f81131x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f81132y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C22164d f81133z;

    public /* synthetic */ C21254c(int i13, C22164d c22164d, Function1 function1, Function1 function2) {
        this.f81130w = i13;
        this.f81133z = c22164d;
        this.f81131x = function1;
        this.f81132y = function2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f81130w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC21256e.m59613P(this.f81133z, this.f81131x, this.f81132y, (C12982q) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                C22164d c22164d = this.f81133z;
                return AbstractC21256e.m59616S(this.f81131x, this.f81132y, c22164d, (C12982q) obj, (Composer) obj2, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC21256e.m59625a0(this.f81133z, this.f81131x, this.f81132y, (C12982q) obj, (Composer) obj2, iIntValue3);
        }
    }

    public /* synthetic */ C21254c(Function1 function1, Function1 function2, C22164d c22164d) {
        this.f81130w = 1;
        this.f81131x = function1;
        this.f81132y = function2;
        this.f81133z = c22164d;
    }
}
