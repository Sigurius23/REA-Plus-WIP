package p444r;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: r.l */
/* JADX INFO: loaded from: classes5.dex */
public class MenuC30818l implements Menu {

    /* JADX INFO: renamed from: z */
    public static final int[] f127054z = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: b */
    public final Context f127055b;

    /* JADX INFO: renamed from: c */
    public final Resources f127056c;

    /* JADX INFO: renamed from: d */
    public boolean f127057d;

    /* JADX INFO: renamed from: e */
    public final boolean f127058e;

    /* JADX INFO: renamed from: f */
    public InterfaceC30816j f127059f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f127060g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f127061h;

    /* JADX INFO: renamed from: i */
    public boolean f127062i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f127063j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f127064k;

    /* JADX INFO: renamed from: l */
    public boolean f127065l;

    /* JADX INFO: renamed from: n */
    public CharSequence f127067n;

    /* JADX INFO: renamed from: o */
    public Drawable f127068o;

    /* JADX INFO: renamed from: p */
    public View f127069p;

    /* JADX INFO: renamed from: w */
    public C30820n f127076w;

    /* JADX INFO: renamed from: y */
    public boolean f127078y;

    /* JADX INFO: renamed from: m */
    public int f127066m = 0;

    /* JADX INFO: renamed from: q */
    public boolean f127070q = false;

    /* JADX INFO: renamed from: r */
    public boolean f127071r = false;

    /* JADX INFO: renamed from: s */
    public boolean f127072s = false;

    /* JADX INFO: renamed from: t */
    public boolean f127073t = false;

    /* JADX INFO: renamed from: u */
    public final ArrayList f127074u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public final CopyOnWriteArrayList f127075v = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: x */
    public boolean f127077x = false;

    public MenuC30818l(Context context) {
        boolean z4 = false;
        this.f127055b = context;
        Resources resources = context.getResources();
        this.f127056c = resources;
        this.f127060g = new ArrayList();
        this.f127061h = new ArrayList();
        this.f127062i = true;
        this.f127063j = new ArrayList();
        this.f127064k = new ArrayList();
        this.f127065l = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(context).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z4 = true;
        }
        this.f127058e = z4;
    }

    /* JADX INFO: renamed from: a */
    public final C30820n m94812a(int i13, int i14, int i15, CharSequence charSequence) {
        int i16;
        int i17 = ((-65536) & i15) >> 16;
        if (i17 < 0 || i17 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i18 = (f127054z[i17] << 16) | (65535 & i15);
        C30820n c30820n = new C30820n(this, i13, i14, i15, i18, charSequence, this.f127066m);
        ArrayList arrayList = this.f127060g;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C30820n) arrayList.get(size)).f127089e <= i18) {
                i16 = size + 1;
                arrayList.add(i16, c30820n);
                m94820q(true);
                return c30820n;
            }
        }
        i16 = 0;
        arrayList.add(i16, c30820n);
        m94820q(true);
        return c30820n;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m94812a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i13, int i14, int i15, ComponentName componentName, Intent[] intentArr, Intent intent, int i16, MenuItem[] menuItemArr) {
        int i17;
        PackageManager packageManager = this.f127055b.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i16 & 1) == 0) {
            removeGroup(i13);
        }
        for (int i18 = 0; i18 < size; i18++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i18);
            int i19 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i19 < 0 ? intent : intentArr[i19]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C30820n c30820nM94812a = m94812a(i13, i14, i15, resolveInfo.loadLabel(packageManager));
            c30820nM94812a.setIcon(resolveInfo.loadIcon(packageManager));
            c30820nM94812a.f127092h = intent2;
            if (menuItemArr != null && (i17 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i17] = c30820nM94812a;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public final void m94813b(InterfaceC30830x interfaceC30830x) {
        m94814c(interfaceC30830x, this.f127055b);
    }

    /* JADX INFO: renamed from: c */
    public final void m94814c(InterfaceC30830x interfaceC30830x, Context context) {
        this.f127075v.add(new WeakReference(interfaceC30830x));
        interfaceC30830x.mo3338f(context, this);
        this.f127065l = true;
    }

    @Override // android.view.Menu
    public final void clear() {
        C30820n c30820n = this.f127076w;
        if (c30820n != null) {
            mo94796e(c30820n);
        }
        this.f127060g.clear();
        m94820q(true);
    }

    public final void clearHeader() {
        this.f127068o = null;
        this.f127067n = null;
        this.f127069p = null;
        m94820q(false);
    }

    @Override // android.view.Menu
    public final void close() {
        m94815d(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m94815d(boolean z4) {
        if (this.f127073t) {
            return;
        }
        this.f127073t = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f127075v;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC30830x interfaceC30830x = (InterfaceC30830x) weakReference.get();
            if (interfaceC30830x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC30830x.mo3339g(this, z4);
            }
        }
        this.f127073t = false;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo94796e(C30820n c30820n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f127075v;
        boolean zMo3337e = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f127076w == c30820n) {
            m94828z();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC30830x interfaceC30830x = (InterfaceC30830x) weakReference.get();
                if (interfaceC30830x != null) {
                    zMo3337e = interfaceC30830x.mo3337e(c30820n);
                    if (zMo3337e) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            m94827y();
            if (zMo3337e) {
                this.f127076w = null;
            }
        }
        return zMo3337e;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo94797f(MenuC30818l menuC30818l, MenuItem menuItem) {
        InterfaceC30816j interfaceC30816j = this.f127059f;
        return interfaceC30816j != null && interfaceC30816j.mo3333a(menuC30818l, menuItem);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i13) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C30820n c30820n = (C30820n) arrayList.get(i14);
            if (c30820n.f127086b == i13) {
                return c30820n;
            }
            if (c30820n.hasSubMenu() && (menuItemFindItem = c30820n.f127100p.findItem(i13)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo94798g(C30820n c30820n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f127075v;
        boolean zMo3335b = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        m94828z();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC30830x interfaceC30830x = (InterfaceC30830x) weakReference.get();
            if (interfaceC30830x != null) {
                zMo3335b = interfaceC30830x.mo3335b(c30820n);
                if (zMo3335b) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        m94827y();
        if (zMo3335b) {
            this.f127076w = c30820n;
        }
        return zMo3335b;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i13) {
        return (MenuItem) this.f127060g.get(i13);
    }

    /* JADX INFO: renamed from: h */
    public final C30820n m94816h(int i13, KeyEvent keyEvent) {
        ArrayList arrayList = this.f127074u;
        arrayList.clear();
        m94817i(arrayList, i13, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C30820n) arrayList.get(0);
        }
        boolean zMo94802o = mo94802o();
        for (int i14 = 0; i14 < size; i14++) {
            C30820n c30820n = (C30820n) arrayList.get(i14);
            char c3 = zMo94802o ? c30820n.f127095k : c30820n.f127093i;
            char[] cArr = keyData.meta;
            if ((c3 == cArr[0] && (metaState & 2) == 0) || ((c3 == cArr[2] && (metaState & 2) != 0) || (zMo94802o && c3 == '\b' && i13 == 67))) {
                return c30820n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f127078y) {
            return true;
        }
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((C30820n) arrayList.get(i13)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m94817i(List list, int i13, KeyEvent keyEvent) {
        boolean zMo94802o = mo94802o();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i13 == 67) {
            ArrayList arrayList = this.f127060g;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                C30820n c30820n = (C30820n) arrayList.get(i14);
                if (c30820n.hasSubMenu()) {
                    c30820n.f127100p.m94817i(list, i13, keyEvent);
                }
                char c3 = zMo94802o ? c30820n.f127095k : c30820n.f127093i;
                if ((modifiers & 69647) == ((zMo94802o ? c30820n.f127096l : c30820n.f127094j) & 69647) && c3 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c3 == cArr[0] || c3 == cArr[2] || (zMo94802o && c3 == '\b' && i13 == 67)) && c30820n.isEnabled()) {
                        list.add(c30820n);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i13, KeyEvent keyEvent) {
        return m94816h(i13, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public final void m94818j() {
        ArrayList arrayListM94819m = m94819m();
        if (this.f127065l) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f127075v;
            boolean zMo3340i = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                InterfaceC30830x interfaceC30830x = (InterfaceC30830x) weakReference.get();
                if (interfaceC30830x == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zMo3340i |= interfaceC30830x.mo3340i();
                }
            }
            ArrayList arrayList = this.f127063j;
            ArrayList arrayList2 = this.f127064k;
            if (zMo3340i) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListM94819m.size();
                for (int i13 = 0; i13 < size; i13++) {
                    C30820n c30820n = (C30820n) arrayListM94819m.get(i13);
                    if ((c30820n.f127109y & 32) == 32) {
                        arrayList.add(c30820n);
                    } else {
                        arrayList2.add(c30820n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(m94819m());
            }
            this.f127065l = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public String mo94799k() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: l */
    public MenuC30818l mo94800l() {
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final ArrayList m94819m() {
        boolean z4 = this.f127062i;
        ArrayList arrayList = this.f127061h;
        if (!z4) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f127060g;
        int size = arrayList2.size();
        for (int i13 = 0; i13 < size; i13++) {
            C30820n c30820n = (C30820n) arrayList2.get(i13);
            if (c30820n.isVisible()) {
                arrayList.add(c30820n);
            }
        }
        this.f127062i = false;
        this.f127065l = true;
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo94801n() {
        return this.f127077x;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo94802o() {
        return this.f127057d;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo94803p() {
        return this.f127058e;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i13, int i14) {
        return m94821r(findItem(i13), null, i14);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i13, KeyEvent keyEvent, int i14) {
        C30820n c30820nM94816h = m94816h(i13, keyEvent);
        boolean zM94821r = c30820nM94816h != null ? m94821r(c30820nM94816h, null, i14) : false;
        if ((i14 & 2) != 0) {
            m94815d(true);
        }
        return zM94821r;
    }

    /* JADX INFO: renamed from: q */
    public final void m94820q(boolean z4) {
        if (this.f127070q) {
            this.f127071r = true;
            if (z4) {
                this.f127072s = true;
                return;
            }
            return;
        }
        if (z4) {
            this.f127062i = true;
            this.f127065l = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f127075v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        m94828z();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC30830x interfaceC30830x = (InterfaceC30830x) weakReference.get();
            if (interfaceC30830x == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC30830x.mo3336d();
            }
        }
        m94827y();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final boolean m94821r(MenuItem menuItem, InterfaceC30830x interfaceC30830x, int i13) {
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC30821o actionProviderVisibilityListenerC30821o2;
        boolean z4;
        SubMenuC30810d0 subMenuC30810d0;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        InterfaceC30830x interfaceC30830x2;
        C30820n c30820n = (C30820n) menuItem;
        boolean zMo3341j = false;
        if (c30820n == null || !c30820n.isEnabled()) {
            return false;
        }
        MenuC30818l menuC30818l = c30820n.f127099o;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c30820n.f127101q;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c30820n)) && !menuC30818l.mo94797f(menuC30818l, c30820n)) {
            Intent intent = c30820n.f127092h;
            if (intent != null) {
                try {
                    menuC30818l.f127055b.startActivity(intent);
                } catch (ActivityNotFoundException e5) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e5);
                    actionProviderVisibilityListenerC30821o = c30820n.f127083B;
                    if (actionProviderVisibilityListenerC30821o == null) {
                    }
                    zExpandActionView = false;
                    actionProviderVisibilityListenerC30821o2 = c30820n.f127083B;
                    if (actionProviderVisibilityListenerC30821o2 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (c30820n.m94831e()) {
                        zExpandActionView |= c30820n.expandActionView();
                        if (zExpandActionView) {
                            m94815d(true);
                        }
                    } else if (c30820n.hasSubMenu()) {
                        if ((i13 & 4) == 0) {
                            m94815d(false);
                        }
                        if (!c30820n.hasSubMenu()) {
                            SubMenuC30810d0 subMenuC30810d1 = new SubMenuC30810d0(this.f127055b, this, c30820n);
                            c30820n.f127100p = subMenuC30810d1;
                            subMenuC30810d1.setHeaderTitle(c30820n.f127090f);
                        }
                        subMenuC30810d0 = c30820n.f127100p;
                        if (z4) {
                            actionProviderVisibilityListenerC30821o2.f127112b.onPrepareSubMenu(subMenuC30810d0);
                        }
                        copyOnWriteArrayList = this.f127075v;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (interfaceC30830x != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                interfaceC30830x2 = (InterfaceC30830x) weakReference.get();
                                if (interfaceC30830x2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo3341j) {
                                    zMo3341j = interfaceC30830x2.mo3341j(subMenuC30810d0);
                                }
                            }
                        }
                        zExpandActionView |= zMo3341j;
                        if (!zExpandActionView) {
                            m94815d(true);
                        }
                    } else {
                        if ((i13 & 4) == 0) {
                            m94815d(false);
                        }
                        if (!c30820n.hasSubMenu()) {
                            SubMenuC30810d0 subMenuC30810d2 = new SubMenuC30810d0(this.f127055b, this, c30820n);
                            c30820n.f127100p = subMenuC30810d2;
                            subMenuC30810d2.setHeaderTitle(c30820n.f127090f);
                        }
                        subMenuC30810d0 = c30820n.f127100p;
                        if (z4) {
                            actionProviderVisibilityListenerC30821o2.f127112b.onPrepareSubMenu(subMenuC30810d0);
                        }
                        copyOnWriteArrayList = this.f127075v;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zMo3341j = interfaceC30830x != null ? interfaceC30830x.mo3341j(subMenuC30810d0) : false;
                            while (r8.hasNext()) {
                                interfaceC30830x2 = (InterfaceC30830x) weakReference.get();
                                if (interfaceC30830x2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zMo3341j) {
                                    zMo3341j = interfaceC30830x2.mo3341j(subMenuC30810d0);
                                }
                            }
                        }
                        zExpandActionView |= zMo3341j;
                        if (!zExpandActionView) {
                            m94815d(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                actionProviderVisibilityListenerC30821o = c30820n.f127083B;
                if (actionProviderVisibilityListenerC30821o == null && actionProviderVisibilityListenerC30821o.f127112b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC30821o2 = c30820n.f127083B;
        if (actionProviderVisibilityListenerC30821o2 == null && actionProviderVisibilityListenerC30821o2.f127112b.hasSubMenu()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c30820n.m94831e()) {
            zExpandActionView |= c30820n.expandActionView();
            if (zExpandActionView) {
                m94815d(true);
            }
        } else if (c30820n.hasSubMenu() || z4) {
            if ((i13 & 4) == 0) {
                m94815d(false);
            }
            if (!c30820n.hasSubMenu()) {
                SubMenuC30810d0 subMenuC30810d3 = new SubMenuC30810d0(this.f127055b, this, c30820n);
                c30820n.f127100p = subMenuC30810d3;
                subMenuC30810d3.setHeaderTitle(c30820n.f127090f);
            }
            subMenuC30810d0 = c30820n.f127100p;
            if (z4) {
                actionProviderVisibilityListenerC30821o2.f127112b.onPrepareSubMenu(subMenuC30810d0);
            }
            copyOnWriteArrayList = this.f127075v;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (interfaceC30830x != null) {
                }
                while (r8.hasNext()) {
                    interfaceC30830x2 = (InterfaceC30830x) weakReference.get();
                    if (interfaceC30830x2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zMo3341j) {
                        zMo3341j = interfaceC30830x2.mo3341j(subMenuC30810d0);
                    }
                }
            }
            zExpandActionView |= zMo3341j;
            if (!zExpandActionView) {
                m94815d(true);
            }
        } else if ((i13 & 1) == 0) {
            m94815d(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i13) {
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                i15 = -1;
                break;
            } else if (((C30820n) arrayList.get(i15)).f127087c == i13) {
                break;
            } else {
                i15++;
            }
        }
        if (i15 >= 0) {
            int size2 = arrayList.size() - i15;
            while (true) {
                int i16 = i14 + 1;
                if (i14 >= size2 || ((C30820n) arrayList.get(i15)).f127087c != i13) {
                    break;
                }
                if (i15 >= 0 && i15 < arrayList.size()) {
                    arrayList.remove(i15);
                }
                i14 = i16;
            }
            m94820q(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i13) {
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                i14 = -1;
                break;
            } else if (((C30820n) arrayList.get(i14)).f127086b == i13) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 < 0 || i14 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i14);
        m94820q(true);
    }

    /* JADX INFO: renamed from: s */
    public final void m94822s(InterfaceC30830x interfaceC30830x) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f127075v;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            InterfaceC30830x interfaceC30830x2 = (InterfaceC30830x) weakReference.get();
            if (interfaceC30830x2 == null || interfaceC30830x2 == interfaceC30830x) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i13, boolean z4, boolean z13) {
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C30820n c30820n = (C30820n) arrayList.get(i14);
            if (c30820n.f127087c == i13) {
                c30820n.f127109y = (c30820n.f127109y & (-5)) | (z13 ? 4 : 0);
                c30820n.setCheckable(z4);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z4) {
        this.f127077x = z4;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i13, boolean z4) {
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C30820n c30820n = (C30820n) arrayList.get(i14);
            if (c30820n.f127087c == i13) {
                c30820n.setEnabled(z4);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i13, boolean z4) {
        ArrayList arrayList = this.f127060g;
        int size = arrayList.size();
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C30820n c30820n = (C30820n) arrayList.get(i14);
            if (c30820n.f127087c == i13) {
                int i15 = c30820n.f127109y;
                int i16 = (i15 & (-9)) | (z4 ? 0 : 8);
                c30820n.f127109y = i16;
                if (i15 != i16) {
                    z13 = true;
                }
            }
        }
        if (z13) {
            m94820q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z4) {
        this.f127057d = z4;
        m94820q(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f127060g.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m94823t(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo94799k());
        int size = this.f127060g.size();
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = getItem(i13);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC30810d0) item.getSubMenu()).m94823t(bundle);
            }
        }
        int i14 = bundle.getInt("android:menu:expandedactionview");
        if (i14 <= 0 || (menuItemFindItem = findItem(i14)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: u */
    public final void m94824u(Bundle bundle) {
        int size = this.f127060g.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i13 = 0; i13 < size; i13++) {
            MenuItem item = getItem(i13);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC30810d0) item.getSubMenu()).m94824u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo94799k(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo94804v(InterfaceC30816j interfaceC30816j) {
        this.f127059f = interfaceC30816j;
    }

    /* JADX INFO: renamed from: w */
    public final void m94825w(int i13, CharSequence charSequence, int i14, Drawable drawable, View view) {
        if (view != null) {
            this.f127069p = view;
            this.f127067n = null;
            this.f127068o = null;
        } else {
            if (i13 > 0) {
                this.f127067n = this.f127056c.getText(i13);
            } else if (charSequence != null) {
                this.f127067n = charSequence;
            }
            if (i14 > 0) {
                this.f127068o = AbstractC32122c.getDrawable(this.f127055b, i14);
            } else if (drawable != null) {
                this.f127068o = drawable;
            }
            this.f127069p = null;
        }
        m94820q(false);
    }

    /* JADX INFO: renamed from: x */
    public final void m94826x(boolean z4) {
        this.f127078y = z4;
    }

    /* JADX INFO: renamed from: y */
    public final void m94827y() {
        this.f127070q = false;
        if (this.f127071r) {
            this.f127071r = false;
            m94820q(this.f127072s);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m94828z() {
        if (this.f127070q) {
            return;
        }
        this.f127070q = true;
        this.f127071r = false;
        this.f127072s = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13) {
        return m94812a(0, 0, 0, this.f127056c.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13) {
        return addSubMenu(0, 0, 0, this.f127056c.getString(i13));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, CharSequence charSequence) {
        return m94812a(i13, i14, i15, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        C30820n c30820nM94812a = m94812a(i13, i14, i15, charSequence);
        SubMenuC30810d0 subMenuC30810d0 = new SubMenuC30810d0(this.f127055b, this, c30820nM94812a);
        c30820nM94812a.f127100p = subMenuC30810d0;
        subMenuC30810d0.setHeaderTitle(c30820nM94812a.f127090f);
        return subMenuC30810d0;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, int i16) {
        return m94812a(i13, i14, i15, this.f127056c.getString(i16));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, int i16) {
        return addSubMenu(i13, i14, i15, this.f127056c.getString(i16));
    }
}
