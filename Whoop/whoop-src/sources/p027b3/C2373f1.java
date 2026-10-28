package p027b3;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: b3.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2373f1 implements InterfaceC2395j3 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f9359a;

    public C2373f1(ViewConfiguration viewConfiguration) {
        this.f9359a = viewConfiguration;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: a */
    public final long getDoubleTapTimeoutMillis() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: b */
    public final long getDoubleTapMinTimeMillis() {
        return 40L;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: c */
    public final long getLongPressTimeoutMillis() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: d */
    public final float mo7303d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2378g1.m7333h(this.f9359a);
        }
        return 2.0f;
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: f */
    public final float mo7304f() {
        return this.f9359a.getScaledMaximumFlingVelocity();
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: g */
    public final float getTouchSlop() {
        return this.f9359a.getScaledTouchSlop();
    }

    @Override // p027b3.InterfaceC2395j3
    /* JADX INFO: renamed from: h */
    public final float mo7305h() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC2378g1.m7332g(this.f9359a);
        }
        return 16.0f;
    }
}
