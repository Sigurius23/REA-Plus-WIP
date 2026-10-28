package q30;

import android.util.Log;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: q30.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29922o0 extends AbstractC37926s0 {

    /* JADX INFO: renamed from: c */
    public static final C29922o0 f122220c = new C29922o0(0);

    /* JADX INFO: renamed from: d */
    public static final C29922o0 f122221d = new C29922o0(1);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f122222b;

    public /* synthetic */ C29922o0(int i13) {
        this.f122222b = i13;
    }

    /* JADX INFO: renamed from: O */
    private final void m91518O(String str, Throwable th3) {
    }

    /* JADX INFO: renamed from: P */
    private final void m91519P() {
    }

    @Override // x30.AbstractC37926s0
    /* JADX INFO: renamed from: o */
    public final void mo91520o(String str, Throwable th3) {
        switch (this.f122222b) {
            case 0:
                break;
            default:
                Log.e("StripeSdk", str, th3);
                break;
        }
    }

    @Override // x30.AbstractC37926s0
    /* JADX INFO: renamed from: s */
    public final void mo91521s() {
        switch (this.f122222b) {
            case 0:
                break;
            default:
                Log.i("StripeSdk", "Make initial challenge request.");
                break;
        }
    }
}
