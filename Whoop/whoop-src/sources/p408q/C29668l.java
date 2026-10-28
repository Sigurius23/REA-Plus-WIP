package p408q;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p184h5.C16913t0;
import p184h5.InterfaceC16916u0;

/* JADX INFO: renamed from: q.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C29668l {

    /* JADX INFO: renamed from: c */
    public Interpolator f121281c;

    /* JADX INFO: renamed from: d */
    public InterfaceC16916u0 f121282d;

    /* JADX INFO: renamed from: e */
    public boolean f121283e;

    /* JADX INFO: renamed from: b */
    public long f121280b = -1;

    /* JADX INFO: renamed from: f */
    public final C29667k f121284f = new C29667k(this);

    /* JADX INFO: renamed from: a */
    public final ArrayList f121279a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m91142a() {
        if (this.f121283e) {
            Iterator it = this.f121279a.iterator();
            while (it.hasNext()) {
                ((C16913t0) it.next()).m47608b();
            }
            this.f121283e = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m91143b() {
        View view;
        if (this.f121283e) {
            return;
        }
        for (C16913t0 c16913t0 : this.f121279a) {
            long j7 = this.f121280b;
            if (j7 >= 0) {
                c16913t0.m47609c(j7);
            }
            Interpolator interpolator = this.f121281c;
            if (interpolator != null && (view = (View) c16913t0.f64874a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f121282d != null) {
                c16913t0.m47610d(this.f121284f);
            }
            View view2 = (View) c16913t0.f64874a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f121283e = true;
    }
}
