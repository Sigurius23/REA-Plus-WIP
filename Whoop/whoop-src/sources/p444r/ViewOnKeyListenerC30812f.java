package p444r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whoop.android.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p319m4.AbstractC25012a;
import p439qv.ViewOnAttachStateChangeListenerC30647d;
import p474s.AbstractC32026x1;
import p474s.AbstractC32030y1;
import p474s.C31935a2;
import p474s.C31974k1;
import p474s.C32016v;
import q30.C29934u0;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnKeyListenerC30812f extends AbstractC30826t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: E */
    public final boolean f127015E;

    /* JADX INFO: renamed from: F */
    public final Handler f127016F;

    /* JADX INFO: renamed from: N */
    public View f127024N;

    /* JADX INFO: renamed from: O */
    public View f127025O;

    /* JADX INFO: renamed from: P */
    public int f127026P;

    /* JADX INFO: renamed from: Q */
    public boolean f127027Q;

    /* JADX INFO: renamed from: R */
    public boolean f127028R;

    /* JADX INFO: renamed from: S */
    public int f127029S;

    /* JADX INFO: renamed from: T */
    public int f127030T;

    /* JADX INFO: renamed from: V */
    public boolean f127032V;

    /* JADX INFO: renamed from: W */
    public InterfaceC30829w f127033W;

    /* JADX INFO: renamed from: X */
    public ViewTreeObserver f127034X;

    /* JADX INFO: renamed from: Y */
    public PopupWindow.OnDismissListener f127035Y;

    /* JADX INFO: renamed from: Z */
    public boolean f127036Z;

    /* JADX INFO: renamed from: x */
    public final Context f127037x;

    /* JADX INFO: renamed from: y */
    public final int f127038y;

    /* JADX INFO: renamed from: z */
    public final int f127039z;

    /* JADX INFO: renamed from: G */
    public final ArrayList f127017G = new ArrayList();

    /* JADX INFO: renamed from: H */
    public final ArrayList f127018H = new ArrayList();

    /* JADX INFO: renamed from: I */
    public final ViewTreeObserverOnGlobalLayoutListenerC30809d f127019I = new ViewTreeObserverOnGlobalLayoutListenerC30809d(this, 0);

    /* JADX INFO: renamed from: J */
    public final ViewOnAttachStateChangeListenerC30647d f127020J = new ViewOnAttachStateChangeListenerC30647d(this, 1);

    /* JADX INFO: renamed from: K */
    public final C29934u0 f127021K = new C29934u0(this, 5);

    /* JADX INFO: renamed from: L */
    public int f127022L = 0;

    /* JADX INFO: renamed from: M */
    public int f127023M = 0;

    /* JADX INFO: renamed from: U */
    public boolean f127031U = false;

    public ViewOnKeyListenerC30812f(Context context, View view, int i13, boolean z4) {
        this.f127037x = context;
        this.f127024N = view;
        this.f127039z = i13;
        this.f127015E = z4;
        this.f127026P = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f127038y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f127016F = new Handler();
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: a */
    public final boolean mo94784a() {
        ArrayList arrayList = this.f127018H;
        return arrayList.size() > 0 && ((C30811e) arrayList.get(0)).f127012a.f132871Z.isShowing();
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: c */
    public final void mo94785c() {
        if (mo94784a()) {
            return;
        }
        ArrayList arrayList = this.f127017G;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m94805u((MenuC30818l) it.next());
        }
        arrayList.clear();
        View view = this.f127024N;
        this.f127025O = view;
        if (view != null) {
            boolean z4 = this.f127034X == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f127034X = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f127019I);
            }
            this.f127025O.addOnAttachStateChangeListener(this.f127020J);
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: d */
    public final void mo3336d() {
        Iterator it = this.f127018H.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C30811e) it.next()).f127012a.f132874y.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C30815i) adapter).notifyDataSetChanged();
        }
    }

    @Override // p444r.InterfaceC30806b0
    public final void dismiss() {
        ArrayList arrayList = this.f127018H;
        int size = arrayList.size();
        if (size > 0) {
            C30811e[] c30811eArr = (C30811e[]) arrayList.toArray(new C30811e[size]);
            for (int i13 = size - 1; i13 >= 0; i13--) {
                C30811e c30811e = c30811eArr[i13];
                if (c30811e.f127012a.f132871Z.isShowing()) {
                    c30811e.f127012a.dismiss();
                }
            }
        }
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: g */
    public final void mo3339g(MenuC30818l menuC30818l, boolean z4) {
        ArrayList arrayList = this.f127018H;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (menuC30818l == ((C30811e) arrayList.get(i13)).f127013b) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 < 0) {
            return;
        }
        int i14 = i13 + 1;
        if (i14 < arrayList.size()) {
            ((C30811e) arrayList.get(i14)).f127013b.m94815d(false);
        }
        C30811e c30811e = (C30811e) arrayList.remove(i13);
        MenuC30818l menuC30818l2 = c30811e.f127013b;
        C31935a2 c31935a2 = c30811e.f127012a;
        C32016v c32016v = c31935a2.f132871Z;
        menuC30818l2.m94822s(this);
        if (this.f127036Z) {
            AbstractC32026x1.m99581b(c32016v, null);
            c32016v.setAnimationStyle(0);
        }
        c31935a2.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f127026P = ((C30811e) arrayList.get(size2 - 1)).f127014c;
        } else {
            this.f127026P = this.f127024N.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((C30811e) arrayList.get(0)).f127013b.m94815d(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC30829w interfaceC30829w = this.f127033W;
        if (interfaceC30829w != null) {
            interfaceC30829w.mo16445g(menuC30818l, true);
        }
        ViewTreeObserver viewTreeObserver = this.f127034X;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f127034X.removeGlobalOnLayoutListener(this.f127019I);
            }
            this.f127034X = null;
        }
        this.f127025O.removeOnAttachStateChangeListener(this.f127020J);
        this.f127035Y.onDismiss();
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: h */
    public final void mo94787h(InterfaceC30829w interfaceC30829w) {
        this.f127033W = interfaceC30829w;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: i */
    public final boolean mo3340i() {
        return false;
    }

    @Override // p444r.InterfaceC30830x
    /* JADX INFO: renamed from: j */
    public final boolean mo3341j(SubMenuC30810d0 subMenuC30810d0) {
        for (C30811e c30811e : this.f127018H) {
            if (subMenuC30810d0 == c30811e.f127013b) {
                c30811e.f127012a.f132874y.requestFocus();
                return true;
            }
        }
        if (!subMenuC30810d0.hasVisibleItems()) {
            return false;
        }
        mo94788k(subMenuC30810d0);
        InterfaceC30829w interfaceC30829w = this.f127033W;
        if (interfaceC30829w != null) {
            interfaceC30829w.mo16448s(subMenuC30810d0);
        }
        return true;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: k */
    public final void mo94788k(MenuC30818l menuC30818l) {
        menuC30818l.m94814c(this, this.f127037x);
        if (mo94784a()) {
            m94805u(menuC30818l);
        } else {
            this.f127017G.add(menuC30818l);
        }
    }

    @Override // p444r.InterfaceC30806b0
    /* JADX INFO: renamed from: m */
    public final C31974k1 mo94786m() {
        ArrayList arrayList = this.f127018H;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C30811e) AbstractC25012a.m73371d(arrayList, 1)).f127012a.f132874y;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: n */
    public final void mo94789n(View view) {
        if (this.f127024N != view) {
            this.f127024N = view;
            this.f127023M = Gravity.getAbsoluteGravity(this.f127022L, view.getLayoutDirection());
        }
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: o */
    public final void mo94790o(boolean z4) {
        this.f127031U = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C30811e c30811e;
        ArrayList arrayList = this.f127018H;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                c30811e = null;
                break;
            }
            c30811e = (C30811e) arrayList.get(i13);
            if (!c30811e.f127012a.f132871Z.isShowing()) {
                break;
            } else {
                i13++;
            }
        }
        if (c30811e != null) {
            c30811e.f127013b.m94815d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i13, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i13 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: p */
    public final void mo94791p(int i13) {
        if (this.f127022L != i13) {
            this.f127022L = i13;
            this.f127023M = Gravity.getAbsoluteGravity(i13, this.f127024N.getLayoutDirection());
        }
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: q */
    public final void mo94792q(int i13) {
        this.f127027Q = true;
        this.f127029S = i13;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: r */
    public final void mo94793r(PopupWindow.OnDismissListener onDismissListener) {
        this.f127035Y = onDismissListener;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: s */
    public final void mo94794s(boolean z4) {
        this.f127032V = z4;
    }

    @Override // p444r.AbstractC30826t
    /* JADX INFO: renamed from: t */
    public final void mo94795t(int i13) {
        this.f127028R = true;
        this.f127030T = i13;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0161  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:73:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    /* JADX INFO: renamed from: u */
    public final void m94805u(MenuC30818l menuC30818l) {
        boolean z4;
        int i13;
        C30811e c30811e;
        View childAt;
        Rect rect;
        Rect rect2;
        int i14;
        C32016v c32016v;
        C31974k1 c31974k1;
        int[] iArr;
        Rect rect3;
        int i15;
        int i16;
        boolean z13;
        Method method;
        MenuItem item;
        C30815i c30815i;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f127037x;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C30815i c30815i2 = new C30815i(menuC30818l, layoutInflaterFrom, this.f127015E, R.layout.abc_cascading_menu_item_layout);
        if (!mo94784a() && this.f127031U) {
            c30815i2.f127050c = true;
        } else if (mo94784a()) {
            int size = menuC30818l.f127060g.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item2 = menuC30818l.getItem(i17);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i17++;
            }
            c30815i2.f127050c = z4;
        }
        int iM94833l = AbstractC30826t.m94833l(c30815i2, context, this.f127038y);
        C31935a2 c31935a2 = new C31935a2(context, null, this.f127039z, 0);
        c31935a2.f132630c0 = this.f127021K;
        c31935a2.f132861P = this;
        c31935a2.f132871Z.setOnDismissListener(this);
        c31935a2.f132860O = this.f127024N;
        c31935a2.f132857L = this.f127023M;
        c31935a2.f132870Y = true;
        c31935a2.f132871Z.setFocusable(true);
        c31935a2.f132871Z.setInputMethodMode(2);
        c31935a2.mo99441l(c30815i2);
        c31935a2.m99573p(iM94833l);
        c31935a2.f132857L = this.f127023M;
        ArrayList arrayList = this.f127018H;
        if (arrayList.size() > 0) {
            c30811e = (C30811e) AbstractC25012a.m73371d(arrayList, 1);
            MenuC30818l menuC30818l2 = c30811e.f127013b;
            int size2 = menuC30818l2.f127060g.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    item = null;
                    break;
                }
                item = menuC30818l2.getItem(i18);
                if (item.hasSubMenu() && menuC30818l == item.getSubMenu()) {
                    break;
                } else {
                    i18++;
                }
            }
            if (item == null) {
                i13 = 1;
                childAt = null;
            } else {
                C31974k1 c31974k2 = c30811e.f127012a.f132874y;
                ListAdapter adapter = c31974k2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c30815i = (C30815i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c30815i = (C30815i) adapter;
                    headersCount = 0;
                }
                int count = c30815i.getCount();
                i13 = 1;
                int i19 = 0;
                while (true) {
                    if (i19 >= count) {
                        i19 = -1;
                        break;
                    } else if (item == c30815i.getItem(i19)) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i19 != -1 && (firstVisiblePosition = (i19 + headersCount) - c31974k2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c31974k2.getChildCount()) {
                    childAt = c31974k2.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                i14 = Build.VERSION.SDK_INT;
                c32016v = c31935a2.f132871Z;
                if (i14 <= 28) {
                    method = C31935a2.f132629d0;
                    if (method != null) {
                        try {
                            method.invoke(c32016v, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    AbstractC32030y1.m99583a(c32016v, false);
                }
                AbstractC32026x1.m99580a(c31935a2.f132871Z, null);
                c31974k1 = ((C30811e) arrayList.get(arrayList.size() - 1)).f127012a.f132874y;
                iArr = new int[2];
                c31974k1.getLocationOnScreen(iArr);
                rect3 = new Rect();
                this.f127025O.getWindowVisibleDisplayFrame(rect3);
                if (this.f127026P == i13) {
                    if (c31974k1.getWidth() + iArr[0] + iM94833l > rect3.right) {
                        i16 = 0;
                        i15 = 1;
                    } else {
                        i15 = 1;
                        i16 = 1;
                    }
                } else if (iArr[0] - iM94833l < 0) {
                    i15 = 1;
                    i16 = 1;
                } else {
                    i16 = 0;
                    i15 = 1;
                }
                if (i16 == i15) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f127026P = i16;
                c31935a2.f132860O = childAt;
                if ((this.f127023M & 5) == 5) {
                    if (!z13) {
                        iM94833l = 0 - childAt.getWidth();
                    }
                } else if (z13) {
                    iM94833l = childAt.getWidth();
                } else {
                    iM94833l = 0 - iM94833l;
                }
                c31935a2.f132851F = iM94833l;
                c31935a2.f132856K = true;
                c31935a2.f132855J = true;
                c31935a2.m99570h(0);
            } else {
                if (this.f127027Q) {
                    c31935a2.f132851F = this.f127029S;
                }
                if (this.f127028R) {
                    c31935a2.m99570h(this.f127030T);
                }
                rect = this.f127120w;
                if (rect != null) {
                    rect2 = new Rect(rect);
                } else {
                    rect2 = null;
                }
                c31935a2.f132869X = rect2;
            }
            arrayList.add(new C30811e(c31935a2, menuC30818l, this.f127026P));
            c31935a2.mo94785c();
            C31974k1 c31974k3 = c31935a2.f132874y;
            c31974k3.setOnKeyListener(this);
            if (c30811e == null || !this.f127032V || menuC30818l.f127067n == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c31974k3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC30818l.f127067n);
            c31974k3.addHeaderView(frameLayout, null, false);
            c31935a2.mo94785c();
            return;
        }
        i13 = 1;
        c30811e = null;
        childAt = null;
        if (childAt != null) {
            i14 = Build.VERSION.SDK_INT;
            c32016v = c31935a2.f132871Z;
            if (i14 <= 28) {
                method = C31935a2.f132629d0;
                if (method != null) {
                    method.invoke(c32016v, Boolean.FALSE);
                }
            } else {
                AbstractC32030y1.m99583a(c32016v, false);
            }
            AbstractC32026x1.m99580a(c31935a2.f132871Z, null);
            c31974k1 = ((C30811e) arrayList.get(arrayList.size() - 1)).f127012a.f132874y;
            iArr = new int[2];
            c31974k1.getLocationOnScreen(iArr);
            rect3 = new Rect();
            this.f127025O.getWindowVisibleDisplayFrame(rect3);
            if (this.f127026P == i13) {
                if (c31974k1.getWidth() + iArr[0] + iM94833l > rect3.right) {
                    i16 = 0;
                    i15 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else if (iArr[0] - iM94833l < 0) {
                i15 = 1;
                i16 = 1;
            } else {
                i16 = 0;
                i15 = 1;
            }
            if (i16 == i15) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f127026P = i16;
            c31935a2.f132860O = childAt;
            if ((this.f127023M & 5) == 5) {
                if (!z13) {
                    iM94833l = 0 - childAt.getWidth();
                }
            } else if (z13) {
                iM94833l = childAt.getWidth();
            } else {
                iM94833l = 0 - iM94833l;
            }
            c31935a2.f132851F = iM94833l;
            c31935a2.f132856K = true;
            c31935a2.f132855J = true;
            c31935a2.m99570h(0);
        } else {
            if (this.f127027Q) {
                c31935a2.f132851F = this.f127029S;
            }
            if (this.f127028R) {
                c31935a2.m99570h(this.f127030T);
            }
            rect = this.f127120w;
            if (rect != null) {
                rect2 = new Rect(rect);
            } else {
                rect2 = null;
            }
            c31935a2.f132869X = rect2;
        }
        arrayList.add(new C30811e(c31935a2, menuC30818l, this.f127026P));
        c31935a2.mo94785c();
        C31974k1 c31974k4 = c31935a2.f132874y;
        c31974k4.setOnKeyListener(this);
        if (c30811e == null) {
        }
    }
}
