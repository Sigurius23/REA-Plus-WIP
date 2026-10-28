package p444r;

import android.view.MenuItem;

/* JADX INFO: renamed from: r.q */
/* JADX INFO: loaded from: classes5.dex */
public final class MenuItemOnActionExpandListenerC30823q implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnActionExpandListener f127114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC30825s f127115b;

    public MenuItemOnActionExpandListenerC30823q(MenuItemC30825s menuItemC30825s, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f127115b = menuItemC30825s;
        this.f127114a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f127114a.onMenuItemActionCollapse(this.f127115b.m7264r(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f127114a.onMenuItemActionExpand(this.f127115b.m7264r(menuItem));
    }
}
