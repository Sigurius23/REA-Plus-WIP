package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1317l1 implements InterfaceC1313k1 {

    /* JADX INFO: renamed from: a */
    public final String f5665a;

    /* JADX INFO: renamed from: b */
    public final int f5666b;

    /* JADX INFO: renamed from: c */
    public final int f5667c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1329o1 f5668d;

    public C1317l1(AbstractC1329o1 abstractC1329o1, String str, int i13, int i14) {
        this.f5668d = abstractC1329o1;
        this.f5665a = str;
        this.f5666b = i13;
        this.f5667c = i14;
    }

    @Override // androidx.fragment.app.InterfaceC1313k1
    /* JADX INFO: renamed from: a */
    public final boolean mo4041a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5668d.f5697A;
        if (abstractComponentCallbacksC1320m0 != null && this.f5666b < 0 && this.f5665a == null && abstractComponentCallbacksC1320m0.getChildFragmentManager().m4151U(-1, 0)) {
            return false;
        }
        return this.f5668d.m4152V(arrayList, arrayList2, this.f5665a, this.f5666b, this.f5667c);
    }
}
