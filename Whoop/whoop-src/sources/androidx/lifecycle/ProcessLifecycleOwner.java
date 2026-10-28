package androidx.lifecycle;

import android.os.Handler;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/g0;", "<init>", "()V", "androidx/lifecycle/a1", "lifecycle-process_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ProcessLifecycleOwner implements InterfaceC1585g0 {

    /* JADX INFO: renamed from: I */
    public static final ProcessLifecycleOwner f6173I = new ProcessLifecycleOwner();

    /* JADX INFO: renamed from: E */
    public Handler f6174E;

    /* JADX INFO: renamed from: w */
    public int f6178w;

    /* JADX INFO: renamed from: x */
    public int f6179x;

    /* JADX INFO: renamed from: y */
    public boolean f6180y = true;

    /* JADX INFO: renamed from: z */
    public boolean f6181z = true;

    /* JADX INFO: renamed from: F */
    public final C1593i0 f6175F = new C1593i0(this);

    /* JADX INFO: renamed from: G */
    public final RunnableC1645z0 f6176G = new RunnableC1645z0(this, 0);

    /* JADX INFO: renamed from: H */
    public final C1575d2 f6177H = new C1575d2(this);

    private ProcessLifecycleOwner() {
    }

    /* JADX INFO: renamed from: a */
    public final void m4968a() {
        int i13 = this.f6179x + 1;
        this.f6179x = i13;
        if (i13 == 1) {
            if (this.f6180y) {
                this.f6175F.m4991g(EnumC1632v.ON_RESUME);
                this.f6180y = false;
            } else {
                Handler handler = this.f6174E;
                AbstractC22676k.m65747g(handler);
                handler.removeCallbacks(this.f6176G);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1585g0
    public final AbstractC1638x getLifecycle() {
        return this.f6175F;
    }
}
