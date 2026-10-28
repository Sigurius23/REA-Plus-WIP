package p314m;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p408q.AbstractC29658b;
import p408q.C29666j;
import p408q.InterfaceC29657a;
import p444r.InterfaceC30816j;
import p444r.MenuC30818l;
import p474s.C31960h;
import qg3.C30352d;

/* JADX INFO: renamed from: m.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24853m0 extends AbstractC29658b implements InterfaceC30816j {

    /* JADX INFO: renamed from: E */
    public C30352d f97346E;

    /* JADX INFO: renamed from: F */
    public WeakReference f97347F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C24855n0 f97348G;

    /* JADX INFO: renamed from: y */
    public final Context f97349y;

    /* JADX INFO: renamed from: z */
    public final MenuC30818l f97350z;

    public C24853m0(C24855n0 c24855n0, Context context, C30352d c30352d) {
        this.f97348G = c24855n0;
        this.f97349y = context;
        this.f97346E = c30352d;
        MenuC30818l menuC30818l = new MenuC30818l(context);
        menuC30818l.f127066m = 1;
        this.f97350z = menuC30818l;
        menuC30818l.f127059f = this;
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: a */
    public final boolean mo3333a(MenuC30818l menuC30818l, MenuItem menuItem) {
        C30352d c30352d = this.f97346E;
        if (c30352d != null) {
            return ((InterfaceC29657a) c30352d.f124535x).mo91068o(this, menuItem);
        }
        return false;
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: b */
    public final void mo3334b(MenuC30818l menuC30818l) {
        if (this.f97346E == null) {
            return;
        }
        mo72863i();
        C31960h c31960h = this.f97348G.f97358f.f4277z;
        if (c31960h != null) {
            c31960h.m99451l();
        }
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: c */
    public final void mo72857c() {
        C24855n0 c24855n0 = this.f97348G;
        if (c24855n0.f97361i != this) {
            return;
        }
        if (c24855n0.f97368p) {
            c24855n0.f97362j = this;
            c24855n0.f97363k = this.f97346E;
        } else {
            this.f97346E.mo91067D(this);
        }
        this.f97346E = null;
        c24855n0.m72875z(false);
        ActionBarContextView actionBarContextView = c24855n0.f97358f;
        if (actionBarContextView.f4264K == null) {
            actionBarContextView.m3263e();
        }
        c24855n0.f97355c.setHideOnContentScrollEnabled(c24855n0.f97373u);
        c24855n0.f97361i = null;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: d */
    public final View mo72858d() {
        WeakReference weakReference = this.f97347F;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: e */
    public final MenuC30818l mo72859e() {
        return this.f97350z;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: f */
    public final MenuInflater mo72860f() {
        return new C29666j(this.f97349y);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: g */
    public final CharSequence mo72861g() {
        return this.f97348G.f97358f.getSubtitle();
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: h */
    public final CharSequence mo72862h() {
        return this.f97348G.f97358f.getTitle();
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: i */
    public final void mo72863i() {
        if (this.f97348G.f97361i != this) {
            return;
        }
        MenuC30818l menuC30818l = this.f97350z;
        menuC30818l.m94828z();
        try {
            this.f97346E.mo91070z(this, menuC30818l);
        } finally {
            menuC30818l.m94827y();
        }
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: j */
    public final boolean mo72864j() {
        return this.f97348G.f97358f.f4272S;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: k */
    public final void mo72865k(View view) {
        this.f97348G.f97358f.setCustomView(view);
        this.f97347F = new WeakReference(view);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: l */
    public final void mo72866l(int i13) {
        mo72867m(this.f97348G.f97353a.getResources().getString(i13));
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: m */
    public final void mo72867m(CharSequence charSequence) {
        this.f97348G.f97358f.setSubtitle(charSequence);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: n */
    public final void mo72868n(int i13) {
        mo72869o(this.f97348G.f97353a.getResources().getString(i13));
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: o */
    public final void mo72869o(CharSequence charSequence) {
        this.f97348G.f97358f.setTitle(charSequence);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: p */
    public final void mo72870p(boolean z4) {
        this.f121215x = z4;
        this.f97348G.f97358f.setTitleOptional(z4);
    }
}
