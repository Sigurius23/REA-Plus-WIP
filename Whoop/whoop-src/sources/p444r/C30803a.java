package p444r;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p479s4.AbstractC32122c;
import p604x4.InterfaceMenuItemC37950a;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C30803a implements InterfaceMenuItemC37950a {

    /* JADX INFO: renamed from: b */
    public CharSequence f126970b;

    /* JADX INFO: renamed from: c */
    public CharSequence f126971c;

    /* JADX INFO: renamed from: d */
    public Intent f126972d;

    /* JADX INFO: renamed from: e */
    public char f126973e;

    /* JADX INFO: renamed from: f */
    public int f126974f;

    /* JADX INFO: renamed from: g */
    public char f126975g;

    /* JADX INFO: renamed from: h */
    public int f126976h;

    /* JADX INFO: renamed from: i */
    public Drawable f126977i;

    /* JADX INFO: renamed from: j */
    public Context f126978j;

    /* JADX INFO: renamed from: k */
    public CharSequence f126979k;

    /* JADX INFO: renamed from: l */
    public CharSequence f126980l;

    /* JADX INFO: renamed from: m */
    public ColorStateList f126981m;

    /* JADX INFO: renamed from: n */
    public PorterDuff.Mode f126982n;

    /* JADX INFO: renamed from: o */
    public boolean f126983o;

    /* JADX INFO: renamed from: p */
    public boolean f126984p;

    /* JADX INFO: renamed from: q */
    public int f126985q;

    /* JADX INFO: renamed from: a */
    public final void m94778a() {
        Drawable drawable = this.f126977i;
        if (drawable != null) {
            if (this.f126983o || this.f126984p) {
                this.f126977i = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f126977i = drawableMutate;
                if (this.f126983o) {
                    drawableMutate.setTintList(this.f126981m);
                }
                if (this.f126984p) {
                    this.f126977i.setTintMode(this.f126982n);
                }
            }
        }
    }

    @Override // p604x4.InterfaceMenuItemC37950a
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC37950a mo94779b(ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o) {
        throw new UnsupportedOperationException();
    }

    @Override // p604x4.InterfaceMenuItemC37950a
    /* JADX INFO: renamed from: c */
    public final ActionProviderVisibilityListenerC30821o mo94780c() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f126976h;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f126975g;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f126979k;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f126977i;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f126981m;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f126982n;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f126972d;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f126974f;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f126973e;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f126970b;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f126971c;
        return charSequence != null ? charSequence : this.f126970b;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f126980l;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f126985q & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f126985q & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f126985q & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f126985q & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        this.f126975g = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        this.f126985q = (z4 ? 1 : 0) | (this.f126985q & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        this.f126985q = (z4 ? 2 : 0) | (this.f126985q & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f126979k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        this.f126985q = (z4 ? 16 : 0) | (this.f126985q & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f126977i = drawable;
        m94778a();
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f126981m = colorStateList;
        this.f126983o = true;
        m94778a();
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f126982n = mode;
        this.f126984p = true;
        m94778a();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f126972d = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        this.f126973e = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7) {
        this.f126973e = c3;
        this.f126975g = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i13) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i13) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f126970b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f126971c = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f126980l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        this.f126985q = (this.f126985q & 8) | (z4 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i13) {
        this.f126975g = Character.toLowerCase(c3);
        this.f126976h = KeyEvent.normalizeMetaState(i13);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final InterfaceMenuItemC37950a setContentDescription(CharSequence charSequence) {
        this.f126979k = charSequence;
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i13) {
        this.f126973e = c3;
        this.f126974f = KeyEvent.normalizeMetaState(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i13) {
        this.f126970b = this.f126978j.getResources().getString(i13);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final InterfaceMenuItemC37950a setTooltipText(CharSequence charSequence) {
        this.f126980l = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i13) {
        this.f126977i = AbstractC32122c.getDrawable(this.f126978j, i13);
        m94778a();
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7, int i13, int i14) {
        this.f126973e = c3;
        this.f126974f = KeyEvent.normalizeMetaState(i13);
        this.f126975g = Character.toLowerCase(c7);
        this.f126976h = KeyEvent.normalizeMetaState(i14);
        return this;
    }
}
