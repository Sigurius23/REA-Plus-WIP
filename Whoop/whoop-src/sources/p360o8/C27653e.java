package p360o8;

import androidx.fragment.app.C1345s1;
import androidx.lifecycle.AbstractC1637w1;
import p002a0.C0024g1;

/* JADX INFO: renamed from: o8.e */
/* JADX INFO: loaded from: classes.dex */
public class C27653e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: y */
    public static final C1345s1 f111264y = new C1345s1(2);

    /* JADX INFO: renamed from: w */
    public final C0024g1 f111265w = new C0024g1((Object) null);

    /* JADX INFO: renamed from: x */
    public boolean f111266x = false;

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        super.onCleared();
        C0024g1 c0024g1 = this.f111265w;
        int iM58g = c0024g1.m58g();
        for (int i13 = 0; i13 < iM58g; i13++) {
            ((C27651c) c0024g1.m59h(i13)).m83609b();
        }
        int i14 = c0024g1.f58z;
        Object[] objArr = c0024g1.f57y;
        for (int i15 = 0; i15 < i14; i15++) {
            objArr[i15] = null;
        }
        c0024g1.f58z = 0;
        c0024g1.f55w = false;
    }
}
