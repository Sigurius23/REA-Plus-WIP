package p444r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: r.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class SubMenuC30810d0 extends MenuC30818l implements SubMenu {

    /* JADX INFO: renamed from: A */
    public final MenuC30818l f127010A;

    /* JADX INFO: renamed from: B */
    public final C30820n f127011B;

    public SubMenuC30810d0(Context context, MenuC30818l menuC30818l, C30820n c30820n) {
        super(context);
        this.f127010A = menuC30818l;
        this.f127011B = c30820n;
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: e */
    public final boolean mo94796e(C30820n c30820n) {
        return this.f127010A.mo94796e(c30820n);
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: f */
    public final boolean mo94797f(MenuC30818l menuC30818l, MenuItem menuItem) {
        return super.mo94797f(menuC30818l, menuItem) || this.f127010A.mo94797f(menuC30818l, menuItem);
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: g */
    public final boolean mo94798g(C30820n c30820n) {
        return this.f127010A.mo94798g(c30820n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f127011B;
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: k */
    public final String mo94799k() {
        C30820n c30820n = this.f127011B;
        int i13 = c30820n != null ? c30820n.f127086b : 0;
        if (i13 == 0) {
            return null;
        }
        return AbstractC2875y.m8295h(i13, "android:menu:actionviewstates:");
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: l */
    public final MenuC30818l mo94800l() {
        return this.f127010A.mo94800l();
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: n */
    public final boolean mo94801n() {
        return this.f127010A.mo94801n();
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: o */
    public final boolean mo94802o() {
        return this.f127010A.mo94802o();
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: p */
    public final boolean mo94803p() {
        return this.f127010A.mo94803p();
    }

    @Override // p444r.MenuC30818l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z4) {
        this.f127010A.setGroupDividerEnabled(z4);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m94825w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m94825w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m94825w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f127011B.setIcon(drawable);
        return this;
    }

    @Override // p444r.MenuC30818l, android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f127010A.setQwertyMode(z4);
    }

    @Override // p444r.MenuC30818l
    /* JADX INFO: renamed from: v */
    public final void mo94804v(InterfaceC30816j interfaceC30816j) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i13) {
        m94825w(0, null, i13, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i13) {
        m94825w(i13, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i13) {
        this.f127011B.setIcon(i13);
        return this;
    }
}
