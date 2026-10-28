package p444r;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import p027b3.AbstractC2351b;
import p604x4.InterfaceMenuItemC37950a;

/* JADX INFO: renamed from: r.s */
/* JADX INFO: loaded from: classes5.dex */
public final class MenuItemC30825s extends AbstractC2351b implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final InterfaceMenuItemC37950a f127118d;

    /* JADX INFO: renamed from: e */
    public Method f127119e;

    public MenuItemC30825s(Context context, InterfaceMenuItemC37950a interfaceMenuItemC37950a) {
        super(context);
        if (interfaceMenuItemC37950a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f127118d = interfaceMenuItemC37950a;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f127118d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f127118d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821oMo94780c = this.f127118d.mo94780c();
        if (actionProviderVisibilityListenerC30821oMo94780c != null) {
            return actionProviderVisibilityListenerC30821oMo94780c.f127112b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f127118d.getActionView();
        return actionView instanceof C30822p ? (View) ((C30822p) actionView).f127113w : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f127118d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f127118d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f127118d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f127118d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f127118d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f127118d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f127118d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f127118d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f127118d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f127118d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f127118d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f127118d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f127118d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f127118d.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f127118d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f127118d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f127118d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f127118d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f127118d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f127118d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f127118d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f127118d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f127118d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o = new ActionProviderVisibilityListenerC30821o(this, actionProvider);
        if (actionProvider == null) {
            actionProviderVisibilityListenerC30821o = null;
        }
        this.f127118d.mo94779b(actionProviderVisibilityListenerC30821o);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C30822p(view);
        }
        this.f127118d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f127118d.setAlphabeticShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f127118d.setCheckable(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f127118d.setChecked(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f127118d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f127118d.setEnabled(z4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f127118d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f127118d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f127118d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f127118d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f127118d.setNumericShortcut(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f127118d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC30823q(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f127118d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC30824r(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7) {
        this.f127118d.setShortcut(c3, c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i13) {
        this.f127118d.setShowAsAction(i13);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i13) {
        this.f127118d.setShowAsActionFlags(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f127118d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f127118d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f127118d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        return this.f127118d.setVisible(z4);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i13) {
        this.f127118d.setAlphabeticShortcut(c3, i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i13) {
        this.f127118d.setIcon(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i13) {
        this.f127118d.setNumericShortcut(c3, i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7, int i13, int i14) {
        this.f127118d.setShortcut(c3, c7, i13, i14);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i13) {
        this.f127118d.setTitle(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i13) {
        InterfaceMenuItemC37950a interfaceMenuItemC37950a = this.f127118d;
        interfaceMenuItemC37950a.setActionView(i13);
        View actionView = interfaceMenuItemC37950a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC37950a.setActionView(new C30822p(actionView));
        }
        return this;
    }
}
