package p444r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p002a0.C0021f1;
import p027b3.AbstractC2351b;
import p604x4.InterfaceMenuItemC37950a;

/* JADX INFO: renamed from: r.a0 */
/* JADX INFO: loaded from: classes5.dex */
public class MenuC30804a0 extends AbstractC2351b implements Menu {

    /* JADX INFO: renamed from: d */
    public final MenuC30818l f126986d;

    public MenuC30804a0(Context context, MenuC30818l menuC30818l) {
        super(context);
        if (menuC30818l == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f126986d = menuC30818l;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m7264r(this.f126986d.m94812a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i13, int i14, int i15, ComponentName componentName, Intent[] intentArr, Intent intent, int i16, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f126986d.addIntentOptions(i13, i14, i15, componentName, intentArr, intent, i16, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i17 = 0; i17 < length; i17++) {
                menuItemArr[i17] = m7264r(menuItemArr2[i17]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f126986d.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C0021f1 c0021f1 = (C0021f1) this.f9292c;
        if (c0021f1 != null) {
            c0021f1.clear();
        }
        this.f126986d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f126986d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i13) {
        return m7264r(this.f126986d.findItem(i13));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i13) {
        return m7264r(this.f126986d.getItem(i13));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f126986d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i13, KeyEvent keyEvent) {
        return this.f126986d.isShortcutKey(i13, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i13, int i14) {
        return this.f126986d.performIdentifierAction(i13, i14);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i13, KeyEvent keyEvent, int i14) {
        return this.f126986d.performShortcut(i13, keyEvent, i14);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i13) {
        if (((C0021f1) this.f9292c) != null) {
            int i14 = 0;
            while (true) {
                C0021f1 c0021f1 = (C0021f1) this.f9292c;
                if (i14 >= c0021f1.f50y) {
                    break;
                }
                if (((InterfaceMenuItemC37950a) c0021f1.m38g(i14)).getGroupId() == i13) {
                    ((C0021f1) this.f9292c).mo40i(i14);
                    i14--;
                }
                i14++;
            }
        }
        this.f126986d.removeGroup(i13);
    }

    @Override // android.view.Menu
    public final void removeItem(int i13) {
        if (((C0021f1) this.f9292c) != null) {
            int i14 = 0;
            while (true) {
                C0021f1 c0021f1 = (C0021f1) this.f9292c;
                if (i14 >= c0021f1.f50y) {
                    break;
                }
                if (((InterfaceMenuItemC37950a) c0021f1.m38g(i14)).getItemId() == i13) {
                    ((C0021f1) this.f9292c).mo40i(i14);
                    break;
                }
                i14++;
            }
        }
        this.f126986d.removeItem(i13);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i13, boolean z4, boolean z13) {
        this.f126986d.setGroupCheckable(i13, z4, z13);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i13, boolean z4) {
        this.f126986d.setGroupEnabled(i13, z4);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i13, boolean z4) {
        this.f126986d.setGroupVisible(i13, z4);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z4) {
        this.f126986d.setQwertyMode(z4);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f126986d.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13) {
        return this.f126986d.addSubMenu(i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13) {
        return m7264r(this.f126986d.add(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, CharSequence charSequence) {
        return this.f126986d.addSubMenu(i13, i14, i15, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, CharSequence charSequence) {
        return m7264r(this.f126986d.m94812a(i13, i14, i15, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i13, int i14, int i15, int i16) {
        return this.f126986d.addSubMenu(i13, i14, i15, i16);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i13, int i14, int i15, int i16) {
        return m7264r(this.f126986d.add(i13, i14, i15, i16));
    }
}
