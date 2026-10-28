package p027b3;

import ae3.C0796d;
import android.os.Handler;
import android.view.Choreographer;
import bc3.AbstractC3076z;
import java.util.ArrayList;
import l83.C23470p;
import m83.C25258m;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: b3.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2353b1 extends AbstractC3076z {

    /* JADX INFO: renamed from: K */
    public static final C23470p f9294K = AbstractC30060g.m92088H(C2422p0.f9480G);

    /* JADX INFO: renamed from: L */
    public static final C0796d f9295L = new C0796d(1);

    /* JADX INFO: renamed from: G */
    public boolean f9298G;

    /* JADX INFO: renamed from: H */
    public boolean f9299H;

    /* JADX INFO: renamed from: J */
    public final C2363d1 f9301J;

    /* JADX INFO: renamed from: w */
    public final Choreographer f9302w;

    /* JADX INFO: renamed from: x */
    public final Handler f9303x;

    /* JADX INFO: renamed from: y */
    public final Object f9304y = new Object();

    /* JADX INFO: renamed from: z */
    public final C25258m f9305z = new C25258m();

    /* JADX INFO: renamed from: E */
    public ArrayList f9296E = new ArrayList();

    /* JADX INFO: renamed from: F */
    public ArrayList f9297F = new ArrayList();

    /* JADX INFO: renamed from: I */
    public final ChoreographerFrameCallbackC2348a1 f9300I = new ChoreographerFrameCallbackC2348a1(this);

    public C2353b1(Choreographer choreographer, Handler handler) {
        this.f9302w = choreographer;
        this.f9303x = handler;
        this.f9301J = new C2363d1(choreographer, this);
    }

    /* JADX INFO: renamed from: s */
    public static final void m7272s(C2353b1 c2353b1) {
        Runnable runnable;
        boolean z4;
        do {
            synchronized (c2353b1.f9304y) {
                runnable = (Runnable) c2353b1.f9305z.m74024q();
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c2353b1.f9304y) {
                    runnable = (Runnable) c2353b1.f9305z.m74024q();
                }
            }
            synchronized (c2353b1.f9304y) {
                if (c2353b1.f9305z.isEmpty()) {
                    z4 = false;
                    c2353b1.f9298G = false;
                } else {
                    z4 = true;
                }
            }
        } while (z4);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        synchronized (this.f9304y) {
            this.f9305z.addLast(runnable);
            if (!this.f9298G) {
                this.f9298G = true;
                this.f9303x.post(this.f9300I);
                if (!this.f9299H) {
                    this.f9299H = true;
                    this.f9302w.postFrameCallback(this.f9300I);
                }
            }
        }
    }
}
