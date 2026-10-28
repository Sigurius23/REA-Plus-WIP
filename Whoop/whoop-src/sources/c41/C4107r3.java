package c41;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import kz2.AbstractC22926c;

/* JADX INFO: renamed from: c41.r3 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4107r3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16664w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f16665x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f16666y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16667z;

    public /* synthetic */ C4107r3(int i13, TextResource textResource, int i14) {
        this.f16666y = i13;
        this.f16665x = textResource;
        this.f16667z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f16664w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC4128u3.m12746k(this.f16666y, this.f16665x, this.f16667z, composer, iIntValue);
            default:
                return AbstractC22926c.m66684w(this.f16665x, this.f16666y, this.f16667z, composer, iIntValue);
        }
    }

    public /* synthetic */ C4107r3(TextResource textResource, int i13, int i14) {
        this.f16665x = textResource;
        this.f16666y = i13;
        this.f16667z = i14;
    }
}
