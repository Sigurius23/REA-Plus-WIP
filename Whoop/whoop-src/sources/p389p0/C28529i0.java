package p389p0;

import java.util.ArrayList;
import p031b9.C2817b;

/* JADX INFO: renamed from: p0.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28529i0 {

    /* JADX INFO: renamed from: a */
    public final int f115439a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f115440b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28535l0 f115441c;

    public C28529i0(C28535l0 c28535l0, int i13) {
        this.f115441c = c28535l0;
        this.f115439a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final int m86829a() {
        return this.f115439a;
    }

    /* JADX INFO: renamed from: b */
    public final void m86830b(int i13) {
        C28535l0 c28535l0 = this.f115441c;
        C2817b c2817b = c28535l0.f115449c;
        if (c2817b == null) {
            return;
        }
        this.f115440b.add(new C28561y0(c2817b, i13, c28535l0.f115448b, null));
    }
}
