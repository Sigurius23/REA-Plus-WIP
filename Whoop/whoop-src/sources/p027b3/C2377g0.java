package p027b3;

import android.view.accessibility.AccessibilityEvent;
import l83.C23454a0;
import p005a3.C0271z0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2377g0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9385w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2382h0 f9386x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2377g0(C2382h0 c2382h0, int i13) {
        super(1);
        this.f9385w = i13;
        this.f9386x = c2382h0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9385w) {
            case 0:
                C2382h0 c2382h0 = this.f9386x;
                return Boolean.valueOf(c2382h0.f9408d.getParent().requestSendAccessibilityEvent(c2382h0.f9408d, (AccessibilityEvent) obj));
            default:
                C2454v2 c2454v2 = (C2454v2) obj;
                if (c2454v2.mo432U()) {
                    C2382h0 c2382h1 = this.f9386x;
                    c2382h1.f9408d.getSnapshotObserver().m457a(c2454v2, c2382h1.f9407P, new C0271z0(3, c2454v2, c2382h1));
                }
                return C23454a0.f92919a;
        }
    }
}
