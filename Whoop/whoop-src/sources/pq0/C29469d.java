package pq0;

import android.view.View;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pq0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C29469d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f119662w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29470e f119663x;

    public /* synthetic */ C29469d(C29470e c29470e, int i13) {
        this.f119662w = i13;
        this.f119663x = c29470e;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f119662w) {
            case 0:
                return C29470e.m89972e0(this.f119663x, (C29474i) obj);
            case 1:
                return C29470e.m89965X(this.f119663x, (View) obj);
            case 2:
                return C29470e.m89966Y(this.f119663x, (View) obj);
            default:
                return C29470e.m89967Z(this.f119663x, (View) obj);
        }
    }
}
