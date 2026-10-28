package p291l0;

import android.os.Build;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import p184h5.C16866d1;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;

/* JADX INFO: renamed from: l0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23005v0 extends AbstractC1230l implements Runnable, InterfaceC16915u, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: E */
    public boolean f90730E;

    /* JADX INFO: renamed from: F */
    public boolean f90731F;

    /* JADX INFO: renamed from: G */
    public C16905q1 f90732G;

    /* JADX INFO: renamed from: z */
    public final C22944c2 f90733z;

    public RunnableC23005v0(C22944c2 c22944c2) {
        super(!c22944c2.f90572s ? 1 : 0);
        this.f90733z = c22944c2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: g */
    public final void mo3872g(C16866d1 c16866d1) {
        this.f90730E = false;
        this.f90731F = false;
        C16905q1 c16905q1 = this.f90732G;
        if (c16866d1.f64800a.mo47488a() > 0 && c16905q1 != null) {
            C16899o1 c16899o1 = c16905q1.f64864a;
            C22944c2 c22944c2 = this.f90733z;
            c22944c2.f90571r.m66781f(AbstractC22953f.m66726o(c16899o1.mo47530g(8)));
            c22944c2.f90570q.m66781f(AbstractC22953f.m66726o(c16899o1.mo47530g(8)));
            C22944c2.m66709a(c22944c2, c16905q1);
        }
        this.f90732G = null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: h */
    public final void mo3873h() {
        this.f90730E = true;
        this.f90731F = true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: i */
    public final C16905q1 mo3874i(C16905q1 c16905q1, List list) {
        C22944c2 c22944c2 = this.f90733z;
        C22944c2.m66709a(c22944c2, c16905q1);
        return c22944c2.f90572s ? C16905q1.f64863b : c16905q1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: j */
    public final C20378c mo3875j(C16866d1 c16866d1, C20378c c20378c) {
        this.f90730E = false;
        return c20378c;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public final C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        this.f90732G = c16905q1;
        C22944c2 c22944c2 = this.f90733z;
        C23018z1 c23018z1 = c22944c2.f90570q;
        C16899o1 c16899o1 = c16905q1.f64864a;
        c23018z1.m66781f(AbstractC22953f.m66726o(c16899o1.mo47530g(8)));
        if (this.f90730E) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f90731F) {
            c22944c2.f90571r.m66781f(AbstractC22953f.m66726o(c16899o1.mo47530g(8)));
            C22944c2.m66709a(c22944c2, c16905q1);
        }
        return c22944c2.f90572s ? C16905q1.f64863b : c16905q1;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f90730E) {
            this.f90730E = false;
            this.f90731F = false;
            C16905q1 c16905q1 = this.f90732G;
            if (c16905q1 != null) {
                C22944c2 c22944c2 = this.f90733z;
                c22944c2.f90571r.m66781f(AbstractC22953f.m66726o(c16905q1.f64864a.mo47530g(8)));
                C22944c2.m66709a(c22944c2, c16905q1);
                this.f90732G = null;
            }
        }
    }
}
