package v61;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import w61.AbstractC36862b;
import y61.C39260a;

/* JADX INFO: renamed from: v61.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C35737b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f151991E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151992w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39260a f151993x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f151994y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f151995z;

    public /* synthetic */ C35737b(C39260a c39260a, Function1 function1, int i13, int i14, int i15) {
        this.f151992w = i15;
        this.f151993x = c39260a;
        this.f151994y = function1;
        this.f151995z = i13;
        this.f151991E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f151992w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC35738c.m113207e(this.f151993x, this.f151994y, this.f151995z, this.f151991E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC36862b.m118227g(this.f151993x, this.f151994y, this.f151995z, this.f151991E, (Composer) obj, iIntValue2);
        }
    }
}
