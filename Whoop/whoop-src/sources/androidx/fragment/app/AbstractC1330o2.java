package androidx.fragment.app;

import android.view.ViewGroup;
import p161g.C14894a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.o2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1330o2 {

    /* JADX INFO: renamed from: a */
    public boolean f5741a;

    /* JADX INFO: renamed from: b */
    public boolean f5742b;

    /* JADX INFO: renamed from: a */
    public final void m4196a(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        if (!this.f5742b) {
            mo4081c(container);
        }
        this.f5742b = true;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo4197b() {
        return this instanceof C1303i;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo4081c(ViewGroup viewGroup);

    /* JADX INFO: renamed from: d */
    public abstract void mo4082d(ViewGroup viewGroup);

    /* JADX INFO: renamed from: e */
    public void mo4086e(C14894a c14894a, ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
    }

    /* JADX INFO: renamed from: f */
    public void mo4087f(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
    }

    /* JADX INFO: renamed from: g */
    public final void m4198g(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        if (!this.f5741a) {
            mo4087f(container);
        }
        this.f5741a = true;
    }
}
