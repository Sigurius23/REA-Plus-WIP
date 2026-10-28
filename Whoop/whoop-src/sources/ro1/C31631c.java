package ro1;

import p715kotlin.jvm.functions.Function1;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: renamed from: ro1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C31631c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130691w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39673b f130692x;

    public /* synthetic */ C31631c(C39673b c39673b, int i13) {
        this.f130691w = i13;
        this.f130692x = c39673b;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130691w) {
            case 0:
                return AbstractC31634f.m97760w(this.f130692x, (AbstractC39672a) obj);
            default:
                return AbstractC31634f.m97755r(this.f130692x, (AbstractC39672a) obj);
        }
    }
}
