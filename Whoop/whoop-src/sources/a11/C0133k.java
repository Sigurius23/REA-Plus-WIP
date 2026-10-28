package a11;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import ky2.AbstractC22899h;

/* JADX INFO: renamed from: a11.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0133k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f395w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f396x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f397y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f398z;

    public /* synthetic */ C0133k(int i13, int i14, InterfaceC4339a interfaceC4339a, TextResource textResource) {
        this.f395w = i14;
        this.f396x = textResource;
        this.f397y = interfaceC4339a;
        this.f398z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f395w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC0139q.m337y(this.f396x, this.f397y, this.f398z, composer, iIntValue);
            default:
                return AbstractC22899h.m66623e(this.f396x, this.f397y, this.f398z, composer, iIntValue);
        }
    }
}
