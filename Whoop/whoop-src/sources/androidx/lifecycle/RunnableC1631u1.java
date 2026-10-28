package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import mr.C25900f;
import p184h5.AbstractC16901p0;
import p573w5.C36833d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.u1 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1631u1 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6317w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f6318x;

    /* JADX INFO: renamed from: y */
    public final Object f6319y;

    /* JADX INFO: renamed from: z */
    public final Object f6320z;

    public RunnableC1631u1(C1593i0 registry, EnumC1632v event) {
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(event, "event");
        this.f6319y = registry;
        this.f6320z = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25900f c25900f;
        int i13 = this.f6317w;
        Object obj = this.f6320z;
        Object obj2 = this.f6319y;
        switch (i13) {
            case 0:
                if (!this.f6318x) {
                    ((C1593i0) obj2).m4991g((EnumC1632v) obj);
                    this.f6318x = true;
                }
                break;
            default:
                View view = (View) obj2;
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                C36833d c36833d = swipeDismissBehavior.f20765a;
                if (c36833d != null && c36833d.m118076f()) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    view.postOnAnimation(this);
                    break;
                } else if (this.f6318x && (c25900f = swipeDismissBehavior.f20766b) != null) {
                    c25900f.m76607a(view);
                    break;
                }
                break;
        }
    }

    public RunnableC1631u1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z4) {
        this.f6320z = swipeDismissBehavior;
        this.f6319y = view;
        this.f6318x = z4;
    }
}
