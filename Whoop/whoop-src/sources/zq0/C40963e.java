package zq0;

import c93.InterfaceC4339a;
import p132f0.C13821r1;
import p715kotlin.jvm.internal.C22663d0;

/* JADX INFO: renamed from: zq0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C40963e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176768w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f176769x;

    public /* synthetic */ C40963e(Object obj, int i13) {
        this.f176768w = i13;
        this.f176769x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f176768w) {
            case 0:
                return Boolean.valueOf(AbstractC40965f.m132929A((C13821r1) this.f176769x));
            case 1:
                return Boolean.valueOf(AbstractC40965f.m132934F((C13821r1) this.f176769x));
            default:
                return AbstractC40965f.d.m132994g((C22663d0) this.f176769x);
        }
    }
}
