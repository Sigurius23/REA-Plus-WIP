package o52;

import m52.AbstractC25083c;
import p715kotlin.jvm.functions.Function1;
import p92.C29019h;

/* JADX INFO: renamed from: o52.b0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27544b0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110879w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C27548d0 f110880x;

    public /* synthetic */ C27544b0(C27548d0 c27548d0, int i13) {
        this.f110879w = i13;
        this.f110880x = c27548d0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110879w) {
            case 0:
                return C27548d0.m83129d0(this.f110880x, ((Float) obj).floatValue());
            case 1:
                return C27548d0.m83126a0(this.f110880x, (Long) obj);
            case 2:
                return C27548d0.m83116Q(this.f110880x, (AbstractC25083c) obj);
            case 3:
                return C27548d0.m83133h0(this.f110880x, (C29019h) obj);
            default:
                return C27548d0.m83123X(this.f110880x, (C27551f) obj);
        }
    }
}
