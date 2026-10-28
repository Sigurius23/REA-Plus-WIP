package o52;

import p715kotlin.jvm.functions.Function1;
import p92.C29019h;
import tv.C34199b;

/* JADX INFO: renamed from: o52.r */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27575r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f111016w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27585w f111017x;

    public /* synthetic */ C27575r(C27585w c27585w, int i13) {
        this.f111016w = i13;
        this.f111017x = c27585w;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f111016w) {
            case 0:
                return C27585w.m83331q0(this.f111017x, (C29019h.a) obj);
            case 1:
                return C27585w.m83334t0(this.f111017x, (Float) obj);
            case 2:
                return C27585w.m83337w0(this.f111017x, (Float) obj);
            case 3:
                return C27585w.m83287A0(this.f111017x, (Long) obj);
            case 4:
                return C27585w.m83289C0(this.f111017x, (C29019h) obj);
            default:
                return C27585w.m83323i0(this.f111017x, (C34199b) obj);
        }
    }
}
