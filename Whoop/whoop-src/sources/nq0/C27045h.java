package nq0;

import androidx.lifecycle.InterfaceC1633v0;
import com.whoop.data.remote.commons.Resource;

/* JADX INFO: renamed from: nq0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C27045h implements InterfaceC1633v0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107981w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27046i f107982x;

    public /* synthetic */ C27045h(C27046i c27046i, int i13) {
        this.f107981w = i13;
        this.f107982x = c27046i;
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final void onChanged(Object obj) {
        switch (this.f107981w) {
            case 0:
                C27046i.m81173D0(this.f107982x, (Resource) obj);
                break;
            default:
                C27046i.m81197V0(this.f107982x, (Resource) obj);
                break;
        }
    }
}
