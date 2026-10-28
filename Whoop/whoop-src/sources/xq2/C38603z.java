package xq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: xq2.z */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C38603z implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166086w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f166087x;

    public /* synthetic */ C38603z(Object obj, int i13) {
        this.f166086w = i13;
        this.f166087x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f166086w) {
            case 0:
                return AbstractC38550b0.m123524o((C38553c0) this.f166087x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC38586q0.m123750o((InterfaceC4351m) this.f166087x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
