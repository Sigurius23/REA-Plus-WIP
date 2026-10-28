package p206i0;

import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p077d0.C11368k;
import p180h0.InterfaceC16413k2;
import p390p1.C28633k1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22663d0;

/* JADX INFO: renamed from: i0.h */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17830h implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f69330E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69331w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f69332x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22663d0 f69333y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC16413k2 f69334z;

    public /* synthetic */ C17830h(float f13, C22663d0 c22663d0, InterfaceC16413k2 interfaceC16413k2, Function1 function1, int i13) {
        this.f69331w = i13;
        this.f69332x = f13;
        this.f69333y = c22663d0;
        this.f69334z = interfaceC16413k2;
        this.f69330E = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fMo29373a;
        switch (this.f69331w) {
            case 0:
                C11368k c11368k = (C11368k) obj;
                C28633k1 c28633k1 = c11368k.f36440e;
                float fAbs = Math.abs(((Number) c28633k1.getValue()).floatValue());
                float f13 = this.f69332x;
                float fAbs2 = Math.abs(f13);
                C22663d0 c22663d0 = this.f69333y;
                InterfaceC16413k2 interfaceC16413k2 = this.f69334z;
                Function1 function1 = this.f69330E;
                if (fAbs >= fAbs2) {
                    float fM51267d = AbstractC17833k.m51267d(((Number) c28633k1.getValue()).floatValue(), f13);
                    AbstractC17833k.m51266c(c11368k, interfaceC16413k2, function1, fM51267d - c22663d0.f89331w);
                    c11368k.m30599a();
                    c22663d0.f89331w = fM51267d;
                } else {
                    AbstractC17833k.m51266c(c11368k, interfaceC16413k2, function1, ((Number) c28633k1.getValue()).floatValue() - c22663d0.f89331w);
                    c22663d0.f89331w = ((Number) c28633k1.getValue()).floatValue();
                }
                break;
            default:
                InterfaceC16413k2 interfaceC16413k3 = this.f69334z;
                C11368k c11368k2 = (C11368k) obj;
                float fM51267d2 = AbstractC17833k.m51267d(((Number) c11368k2.f36440e.getValue()).floatValue(), this.f69332x);
                C22663d0 c22663d1 = this.f69333y;
                float f14 = fM51267d2 - c22663d1.f89331w;
                try {
                    fMo29373a = interfaceC16413k3.mo29373a(f14);
                } catch (CancellationException unused) {
                    c11368k2.m30599a();
                    fMo29373a = 0.0f;
                }
                this.f69330E.invoke(Float.valueOf(fMo29373a));
                if (Math.abs(f14 - fMo29373a) > 0.5f || fM51267d2 != ((Number) c11368k2.f36440e.getValue()).floatValue()) {
                    c11368k2.m30599a();
                }
                c22663d1.f89331w += fMo29373a;
                break;
        }
        return C23454a0.f92919a;
    }
}
