package wo1;

import p715kotlin.jvm.functions.Function1;
import so1.C32806c;

/* JADX INFO: renamed from: wo1.c0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37441c0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160258w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f160259x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32806c f160260y;

    public /* synthetic */ C37441c0(C32806c c32806c, Function1 function1) {
        this.f160258w = 2;
        this.f160260y = c32806c;
        this.f160259x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f160258w) {
            case 0:
                return C37443d0.m119878j(this.f160259x, this.f160260y, (String) obj);
            case 1:
                return C37443d0.m119879k(this.f160259x, this.f160260y, (String) obj);
            default:
                return AbstractC37447f0.m119918p(this.f160260y, this.f160259x, ((Integer) obj).intValue());
        }
    }

    public /* synthetic */ C37441c0(C32806c c32806c, Function1 function1, int i13) {
        this.f160258w = i13;
        this.f160259x = function1;
        this.f160260y = c32806c;
    }
}
