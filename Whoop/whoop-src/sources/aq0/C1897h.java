package aq0;

import android.view.View;
import eq0.AbstractC13502n0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: aq0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1897h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7451w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC13502n0 f7452x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1906q f7453y;

    public /* synthetic */ C1897h(C1906q c1906q, AbstractC13502n0 abstractC13502n0) {
        this.f7453y = c1906q;
        this.f7452x = abstractC13502n0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7451w) {
            case 0:
                return C1906q.m5754Y1(this.f7453y, this.f7452x, (View) obj);
            default:
                return C1906q.m5757Z1(this.f7452x, this.f7453y, (View) obj);
        }
    }

    public /* synthetic */ C1897h(AbstractC13502n0 abstractC13502n0, C1906q c1906q) {
        this.f7452x = abstractC13502n0;
        this.f7453y = c1906q;
    }
}
