package p444r;

import android.view.MenuItem;

/* JADX INFO: renamed from: r.r */
/* JADX INFO: loaded from: classes5.dex */
public final class MenuItemOnMenuItemClickListenerC30824r implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final MenuItem.OnMenuItemClickListener f127116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItemC30825s f127117b;

    public MenuItemOnMenuItemClickListenerC30824r(MenuItemC30825s menuItemC30825s, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f127117b = menuItemC30825s;
        this.f127116a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f127116a.onMenuItemClick(this.f127117b.m7264r(menuItem));
    }
}
