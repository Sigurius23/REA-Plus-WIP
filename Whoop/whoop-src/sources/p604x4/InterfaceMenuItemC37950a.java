package p604x4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p444r.ActionProviderVisibilityListenerC30821o;

/* JADX INFO: renamed from: x4.a */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceMenuItemC37950a extends MenuItem {
    /* JADX INFO: renamed from: b */
    InterfaceMenuItemC37950a mo94779b(ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o);

    /* JADX INFO: renamed from: c */
    ActionProviderVisibilityListenerC30821o mo94780c();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c3, int i13);

    @Override // android.view.MenuItem
    InterfaceMenuItemC37950a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c3, int i13);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c3, char c7, int i13, int i14);

    @Override // android.view.MenuItem
    InterfaceMenuItemC37950a setTooltipText(CharSequence charSequence);
}
