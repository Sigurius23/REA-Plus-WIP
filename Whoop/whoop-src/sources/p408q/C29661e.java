package p408q;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p444r.InterfaceC30816j;
import p444r.MenuC30818l;
import p474s.C31960h;
import qg3.C30352d;

/* JADX INFO: renamed from: q.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C29661e extends AbstractC29658b implements InterfaceC30816j {

    /* JADX INFO: renamed from: E */
    public final C30352d f121222E;

    /* JADX INFO: renamed from: F */
    public WeakReference f121223F;

    /* JADX INFO: renamed from: G */
    public boolean f121224G;

    /* JADX INFO: renamed from: H */
    public final MenuC30818l f121225H;

    /* JADX INFO: renamed from: y */
    public final Context f121226y;

    /* JADX INFO: renamed from: z */
    public final ActionBarContextView f121227z;

    public C29661e(Context context, ActionBarContextView actionBarContextView, C30352d c30352d) {
        this.f121226y = context;
        this.f121227z = actionBarContextView;
        this.f121222E = c30352d;
        MenuC30818l menuC30818l = new MenuC30818l(actionBarContextView.getContext());
        menuC30818l.f127066m = 1;
        this.f121225H = menuC30818l;
        menuC30818l.f127059f = this;
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: a */
    public final boolean mo3333a(MenuC30818l menuC30818l, MenuItem menuItem) {
        return ((InterfaceC29657a) this.f121222E.f124535x).mo91068o(this, menuItem);
    }

    @Override // p444r.InterfaceC30816j
    /* JADX INFO: renamed from: b */
    public final void mo3334b(MenuC30818l menuC30818l) {
        mo72863i();
        C31960h c31960h = this.f121227z.f4277z;
        if (c31960h != null) {
            c31960h.m99451l();
        }
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: c */
    public final void mo72857c() {
        if (this.f121224G) {
            return;
        }
        this.f121224G = true;
        this.f121222E.mo91067D(this);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: d */
    public final View mo72858d() {
        WeakReference weakReference = this.f121223F;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: e */
    public final MenuC30818l mo72859e() {
        return this.f121225H;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: f */
    public final MenuInflater mo72860f() {
        return new C29666j(this.f121227z.getContext());
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: g */
    public final CharSequence mo72861g() {
        return this.f121227z.getSubtitle();
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: h */
    public final CharSequence mo72862h() {
        return this.f121227z.getTitle();
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: i */
    public final void mo72863i() {
        this.f121222E.mo91070z(this, this.f121225H);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: j */
    public final boolean mo72864j() {
        return this.f121227z.f4272S;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: k */
    public final void mo72865k(View view) {
        this.f121227z.setCustomView(view);
        this.f121223F = view != null ? new WeakReference(view) : null;
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: l */
    public final void mo72866l(int i13) {
        mo72867m(this.f121226y.getString(i13));
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: m */
    public final void mo72867m(CharSequence charSequence) {
        this.f121227z.setSubtitle(charSequence);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: n */
    public final void mo72868n(int i13) {
        mo72869o(this.f121226y.getString(i13));
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: o */
    public final void mo72869o(CharSequence charSequence) {
        this.f121227z.setTitle(charSequence);
    }

    @Override // p408q.AbstractC29658b
    /* JADX INFO: renamed from: p */
    public final void mo72870p(boolean z4) {
        this.f121215x = z4;
        this.f121227z.setTitleOptional(z4);
    }
}
