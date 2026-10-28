package p408q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import ih0.AbstractC18489d0;
import java.lang.reflect.Constructor;
import p444r.ActionProviderVisibilityListenerC30821o;
import p444r.C30820n;
import p444r.MenuItemC30825s;
import p604x4.InterfaceMenuItemC37950a;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C29665i {

    /* JADX INFO: renamed from: A */
    public CharSequence f121238A;

    /* JADX INFO: renamed from: B */
    public CharSequence f121239B;

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C29666j f121242E;

    /* JADX INFO: renamed from: a */
    public final Menu f121243a;

    /* JADX INFO: renamed from: h */
    public boolean f121250h;

    /* JADX INFO: renamed from: i */
    public int f121251i;

    /* JADX INFO: renamed from: j */
    public int f121252j;

    /* JADX INFO: renamed from: k */
    public CharSequence f121253k;

    /* JADX INFO: renamed from: l */
    public CharSequence f121254l;

    /* JADX INFO: renamed from: m */
    public int f121255m;

    /* JADX INFO: renamed from: n */
    public char f121256n;

    /* JADX INFO: renamed from: o */
    public int f121257o;

    /* JADX INFO: renamed from: p */
    public char f121258p;

    /* JADX INFO: renamed from: q */
    public int f121259q;

    /* JADX INFO: renamed from: r */
    public int f121260r;

    /* JADX INFO: renamed from: s */
    public boolean f121261s;

    /* JADX INFO: renamed from: t */
    public boolean f121262t;

    /* JADX INFO: renamed from: u */
    public boolean f121263u;

    /* JADX INFO: renamed from: v */
    public int f121264v;

    /* JADX INFO: renamed from: w */
    public int f121265w;

    /* JADX INFO: renamed from: x */
    public String f121266x;

    /* JADX INFO: renamed from: y */
    public String f121267y;

    /* JADX INFO: renamed from: z */
    public ActionProviderVisibilityListenerC30821o f121268z;

    /* JADX INFO: renamed from: C */
    public ColorStateList f121240C = null;

    /* JADX INFO: renamed from: D */
    public PorterDuff.Mode f121241D = null;

    /* JADX INFO: renamed from: b */
    public int f121244b = 0;

    /* JADX INFO: renamed from: c */
    public int f121245c = 0;

    /* JADX INFO: renamed from: d */
    public int f121246d = 0;

    /* JADX INFO: renamed from: e */
    public int f121247e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f121248f = true;

    /* JADX INFO: renamed from: g */
    public boolean f121249g = true;

    public C29665i(C29666j c29666j, Menu menu) {
        this.f121242E = c29666j;
        this.f121243a = menu;
    }

    /* JADX INFO: renamed from: a */
    public final Object m91138a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f121242E.f121273c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m91139b(MenuItem menuItem) {
        C29666j c29666j = this.f121242E;
        Context context = c29666j.f121273c;
        boolean z4 = false;
        menuItem.setChecked(this.f121261s).setVisible(this.f121262t).setEnabled(this.f121263u).setCheckable(this.f121260r >= 1).setTitleCondensed(this.f121254l).setIcon(this.f121255m);
        int i13 = this.f121264v;
        if (i13 >= 0) {
            menuItem.setShowAsAction(i13);
        }
        if (this.f121267y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (c29666j.f121274d == null) {
                c29666j.f121274d = C29666j.m91140a(context);
            }
            Object obj = c29666j.f121274d;
            String str = this.f121267y;
            MenuItemOnMenuItemClickListenerC29664h menuItemOnMenuItemClickListenerC29664h = new MenuItemOnMenuItemClickListenerC29664h();
            menuItemOnMenuItemClickListenerC29664h.f121236a = obj;
            Class<?> cls = obj.getClass();
            try {
                menuItemOnMenuItemClickListenerC29664h.f121237b = cls.getMethod(str, MenuItemOnMenuItemClickListenerC29664h.f121235c);
                menuItem.setOnMenuItemClickListener(menuItemOnMenuItemClickListenerC29664h);
            } catch (Exception e5) {
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM53375p.append(cls.getName());
                InflateException inflateException = new InflateException(sbM53375p.toString());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f121260r >= 2) {
            if (menuItem instanceof C30820n) {
                C30820n c30820n = (C30820n) menuItem;
                c30820n.f127109y = (c30820n.f127109y & (-5)) | 4;
            } else if (menuItem instanceof MenuItemC30825s) {
                MenuItemC30825s menuItemC30825s = (MenuItemC30825s) menuItem;
                InterfaceMenuItemC37950a interfaceMenuItemC37950a = menuItemC30825s.f127118d;
                try {
                    if (menuItemC30825s.f127119e == null) {
                        menuItemC30825s.f127119e = interfaceMenuItemC37950a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    menuItemC30825s.f127119e.invoke(interfaceMenuItemC37950a, Boolean.TRUE);
                } catch (Exception e13) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e13);
                }
            }
        }
        String str2 = this.f121266x;
        if (str2 != null) {
            menuItem.setActionView((View) m91138a(str2, C29666j.f121269e, c29666j.f121271a));
            z4 = true;
        }
        int i14 = this.f121265w;
        if (i14 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i14);
            }
        }
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o = this.f121268z;
        if (actionProviderVisibilityListenerC30821o != null) {
            if (menuItem instanceof InterfaceMenuItemC37950a) {
                ((InterfaceMenuItemC37950a) menuItem).mo94779b(actionProviderVisibilityListenerC30821o);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f121238A;
        boolean z13 = menuItem instanceof InterfaceMenuItemC37950a;
        if (z13) {
            ((InterfaceMenuItemC37950a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f121239B;
        if (z13) {
            ((InterfaceMenuItemC37950a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c3 = this.f121256n;
        int i15 = this.f121257o;
        if (z13) {
            ((InterfaceMenuItemC37950a) menuItem).setAlphabeticShortcut(c3, i15);
        } else {
            menuItem.setAlphabeticShortcut(c3, i15);
        }
        char c7 = this.f121258p;
        int i16 = this.f121259q;
        if (z13) {
            ((InterfaceMenuItemC37950a) menuItem).setNumericShortcut(c7, i16);
        } else {
            menuItem.setNumericShortcut(c7, i16);
        }
        PorterDuff.Mode mode = this.f121241D;
        if (mode != null) {
            if (z13) {
                ((InterfaceMenuItemC37950a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.f121240C;
        if (colorStateList != null) {
            if (z13) {
                ((InterfaceMenuItemC37950a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
