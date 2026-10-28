package p408q;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p444r.MenuC30804a0;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C29663g extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f121233a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29658b f121234b;

    public C29663g(Context context, AbstractC29658b abstractC29658b) {
        this.f121233a = context;
        this.f121234b = abstractC29658b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f121234b.mo72857c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f121234b.mo72858d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC30804a0(this.f121233a, this.f121234b.mo72859e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f121234b.mo72860f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f121234b.mo72861g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f121234b.f121214w;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f121234b.mo72862h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f121234b.f121215x;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f121234b.mo72863i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f121234b.mo72864j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f121234b.mo72865k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f121234b.mo72867m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f121234b.f121214w = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f121234b.mo72869o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f121234b.mo72870p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i13) {
        this.f121234b.mo72866l(i13);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i13) {
        this.f121234b.mo72868n(i13);
    }
}
