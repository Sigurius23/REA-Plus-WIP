package p444r;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p604x4.InterfaceMenuItemC37950a;
import q30.C29934u0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: r.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C30820n implements InterfaceMenuItemC37950a {

    /* JADX INFO: renamed from: A */
    public View f127082A;

    /* JADX INFO: renamed from: B */
    public ActionProviderVisibilityListenerC30821o f127083B;

    /* JADX INFO: renamed from: C */
    public MenuItem.OnActionExpandListener f127084C;

    /* JADX INFO: renamed from: b */
    public final int f127086b;

    /* JADX INFO: renamed from: c */
    public final int f127087c;

    /* JADX INFO: renamed from: d */
    public final int f127088d;

    /* JADX INFO: renamed from: e */
    public final int f127089e;

    /* JADX INFO: renamed from: f */
    public CharSequence f127090f;

    /* JADX INFO: renamed from: g */
    public CharSequence f127091g;

    /* JADX INFO: renamed from: h */
    public Intent f127092h;

    /* JADX INFO: renamed from: i */
    public char f127093i;

    /* JADX INFO: renamed from: k */
    public char f127095k;

    /* JADX INFO: renamed from: m */
    public Drawable f127097m;

    /* JADX INFO: renamed from: o */
    public final MenuC30818l f127099o;

    /* JADX INFO: renamed from: p */
    public SubMenuC30810d0 f127100p;

    /* JADX INFO: renamed from: q */
    public MenuItem.OnMenuItemClickListener f127101q;

    /* JADX INFO: renamed from: r */
    public CharSequence f127102r;

    /* JADX INFO: renamed from: s */
    public CharSequence f127103s;

    /* JADX INFO: renamed from: z */
    public int f127110z;

    /* JADX INFO: renamed from: j */
    public int f127094j = 4096;

    /* JADX INFO: renamed from: l */
    public int f127096l = 4096;

    /* JADX INFO: renamed from: n */
    public int f127098n = 0;

    /* JADX INFO: renamed from: t */
    public ColorStateList f127104t = null;

    /* JADX INFO: renamed from: u */
    public PorterDuff.Mode f127105u = null;

    /* JADX INFO: renamed from: v */
    public boolean f127106v = false;

    /* JADX INFO: renamed from: w */
    public boolean f127107w = false;

    /* JADX INFO: renamed from: x */
    public boolean f127108x = false;

    /* JADX INFO: renamed from: y */
    public int f127109y = 16;

    /* JADX INFO: renamed from: D */
    public boolean f127085D = false;

    public C30820n(MenuC30818l menuC30818l, int i13, int i14, int i15, int i16, CharSequence charSequence, int i17) {
        this.f127099o = menuC30818l;
        this.f127086b = i14;
        this.f127087c = i13;
        this.f127088d = i15;
        this.f127089e = i16;
        this.f127090f = charSequence;
        this.f127110z = i17;
    }

    /* JADX INFO: renamed from: a */
    public static void m94829a(int i13, int i14, String str, StringBuilder sb4) {
        if ((i13 & i14) == i14) {
            sb4.append(str);
        }
    }

    @Override // p604x4.InterfaceMenuItemC37950a
    /* JADX INFO: renamed from: b */
    public final InterfaceMenuItemC37950a mo94779b(ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o) {
        this.f127082A = null;
        this.f127083B = actionProviderVisibilityListenerC30821o;
        this.f127099o.m94820q(true);
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o2 = this.f127083B;
        if (actionProviderVisibilityListenerC30821o2 != null) {
            actionProviderVisibilityListenerC30821o2.f127111a = new C29934u0(this, 6);
            actionProviderVisibilityListenerC30821o2.f127112b.setVisibilityListener(actionProviderVisibilityListenerC30821o2);
        }
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a
    /* JADX INFO: renamed from: c */
    public final ActionProviderVisibilityListenerC30821o mo94780c() {
        return this.f127083B;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f127110z & 8) == 0) {
            return false;
        }
        if (this.f127082A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f127084C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f127099o.mo94796e(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m94830d(Drawable drawable) {
        if (drawable != null && this.f127108x && (this.f127106v || this.f127107w)) {
            drawable = drawable.mutate();
            if (this.f127106v) {
                drawable.setTintList(this.f127104t);
            }
            if (this.f127107w) {
                drawable.setTintMode(this.f127105u);
            }
            this.f127108x = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m94831e() {
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o;
        if ((this.f127110z & 8) != 0) {
            if (this.f127082A == null && (actionProviderVisibilityListenerC30821o = this.f127083B) != null) {
                this.f127082A = actionProviderVisibilityListenerC30821o.f127112b.onCreateActionView(this);
            }
            if (this.f127082A != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m94831e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f127084C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f127099o.mo94798g(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m94832f(boolean z4) {
        if (z4) {
            this.f127109y |= 32;
        } else {
            this.f127109y &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f127082A;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o = this.f127083B;
        if (actionProviderVisibilityListenerC30821o == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC30821o.f127112b.onCreateActionView(this);
        this.f127082A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f127096l;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f127095k;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f127102r;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f127087c;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f127097m;
        if (drawable != null) {
            return m94830d(drawable);
        }
        int i13 = this.f127098n;
        if (i13 == 0) {
            return null;
        }
        Drawable drawableM92133x = AbstractC30060g.m92133x(this.f127099o.f127055b, i13);
        this.f127098n = 0;
        this.f127097m = drawableM92133x;
        return m94830d(drawableM92133x);
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f127104t;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f127105u;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f127092h;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f127086b;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f127094j;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f127093i;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f127088d;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f127100p;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f127090f;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f127091g;
        return charSequence != null ? charSequence : this.f127090f;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f127103s;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f127100p != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f127085D;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f127109y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f127109y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f127109y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o = this.f127083B;
        if (actionProviderVisibilityListenerC30821o == null || !actionProviderVisibilityListenerC30821o.f127112b.overridesItemVisibility()) {
            return (this.f127109y & 8) == 0;
        }
        return (this.f127109y & 8) == 0 && this.f127083B.f127112b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i13;
        this.f127082A = view;
        this.f127083B = null;
        if (view != null && view.getId() == -1 && (i13 = this.f127086b) > 0) {
            view.setId(i13);
        }
        MenuC30818l menuC30818l = this.f127099o;
        menuC30818l.f127065l = true;
        menuC30818l.m94820q(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3) {
        if (this.f127095k == c3) {
            return this;
        }
        this.f127095k = Character.toLowerCase(c3);
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z4) {
        int i13 = this.f127109y;
        int i14 = (z4 ? 1 : 0) | (i13 & (-2));
        this.f127109y = i14;
        if (i13 != i14) {
            this.f127099o.m94820q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z4) {
        int i13 = this.f127109y;
        int i14 = i13 & 4;
        MenuC30818l menuC30818l = this.f127099o;
        if (i14 == 0) {
            int i15 = (i13 & (-3)) | (z4 ? 2 : 0);
            this.f127109y = i15;
            if (i13 != i15) {
                menuC30818l.m94820q(false);
            }
            return this;
        }
        ArrayList arrayList = menuC30818l.f127060g;
        int size = arrayList.size();
        menuC30818l.m94828z();
        for (int i16 = 0; i16 < size; i16++) {
            C30820n c30820n = (C30820n) arrayList.get(i16);
            if (c30820n.f127087c == this.f127087c && (c30820n.f127109y & 4) != 0 && c30820n.isCheckable()) {
                boolean z13 = c30820n == this;
                int i17 = c30820n.f127109y;
                int i18 = (z13 ? 2 : 0) | (i17 & (-3));
                c30820n.f127109y = i18;
                if (i17 != i18) {
                    c30820n.f127099o.m94820q(false);
                }
            }
        }
        menuC30818l.m94827y();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z4) {
        if (z4) {
            this.f127109y |= 16;
        } else {
            this.f127109y &= -17;
        }
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f127098n = 0;
        this.f127097m = drawable;
        this.f127108x = true;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f127104t = colorStateList;
        this.f127106v = true;
        this.f127108x = true;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f127105u = mode;
        this.f127107w = true;
        this.f127108x = true;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f127092h = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3) {
        if (this.f127093i == c3) {
            return this;
        }
        this.f127093i = c3;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f127084C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f127101q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7) {
        this.f127093i = c3;
        this.f127095k = Character.toLowerCase(c7);
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i13) {
        int i14 = i13 & 3;
        if (i14 != 0 && i14 != 1 && i14 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f127110z = i13;
        MenuC30818l menuC30818l = this.f127099o;
        menuC30818l.f127065l = true;
        menuC30818l.m94820q(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i13) {
        setShowAsAction(i13);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f127090f = charSequence;
        this.f127099o.m94820q(false);
        SubMenuC30810d0 subMenuC30810d0 = this.f127100p;
        if (subMenuC30810d0 != null) {
            subMenuC30810d0.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f127091g = charSequence;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z4) {
        int i13 = this.f127109y;
        int i14 = (z4 ? 0 : 8) | (i13 & (-9));
        this.f127109y = i14;
        if (i13 != i14) {
            MenuC30818l menuC30818l = this.f127099o;
            menuC30818l.f127062i = true;
            menuC30818l.m94820q(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f127090f;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final InterfaceMenuItemC37950a setContentDescription(CharSequence charSequence) {
        this.f127102r = charSequence;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final InterfaceMenuItemC37950a setTooltipText(CharSequence charSequence) {
        this.f127103s = charSequence;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c3, int i13) {
        if (this.f127095k == c3 && this.f127096l == i13) {
            return this;
        }
        this.f127095k = Character.toLowerCase(c3);
        this.f127096l = KeyEvent.normalizeMetaState(i13);
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c3, int i13) {
        if (this.f127093i == c3 && this.f127094j == i13) {
            return this;
        }
        this.f127093i = c3;
        this.f127094j = KeyEvent.normalizeMetaState(i13);
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // p604x4.InterfaceMenuItemC37950a, android.view.MenuItem
    public final MenuItem setShortcut(char c3, char c7, int i13, int i14) {
        this.f127093i = c3;
        this.f127094j = KeyEvent.normalizeMetaState(i13);
        this.f127095k = Character.toLowerCase(c7);
        this.f127096l = KeyEvent.normalizeMetaState(i14);
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i13) {
        this.f127097m = null;
        this.f127098n = i13;
        this.f127108x = true;
        this.f127099o.m94820q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i13) {
        setTitle(this.f127099o.f127055b.getString(i13));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i13) {
        int i14;
        MenuC30818l menuC30818l = this.f127099o;
        Context context = menuC30818l.f127055b;
        View viewInflate = LayoutInflater.from(context).inflate(i13, (ViewGroup) new LinearLayout(context), false);
        this.f127082A = viewInflate;
        this.f127083B = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i14 = this.f127086b) > 0) {
            viewInflate.setId(i14);
        }
        menuC30818l.f127065l = true;
        menuC30818l.m94820q(true);
        return this;
    }
}
