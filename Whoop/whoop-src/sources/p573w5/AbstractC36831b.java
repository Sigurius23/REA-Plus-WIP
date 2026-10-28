package p573w5;

import ad3.C0783z;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p002a0.AbstractC0064z;
import p002a0.C0024g1;
import p184h5.AbstractC16901p0;
import p184h5.C16858b;
import p211i5.C18093f;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p499t9.C33647p;
import p531uq.C35157b;
import p531uq.C35159d;

/* JADX INFO: renamed from: w5.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36831b extends C16858b {

    /* JADX INFO: renamed from: n */
    public static final Rect f157547n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final C33623c0 f157548o = new C33623c0();

    /* JADX INFO: renamed from: p */
    public static final C33647p f157549p = new C33647p(11);

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f157554h;

    /* JADX INFO: renamed from: i */
    public final Chip f157555i;

    /* JADX INFO: renamed from: j */
    public C36830a f157556j;

    /* JADX INFO: renamed from: d */
    public final Rect f157550d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f157551e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f157552f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f157553g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f157557k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f157558l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f157559m = Integer.MIN_VALUE;

    public AbstractC36831b(Chip chip) {
        this.f157555i = chip;
        this.f157554h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: b */
    public final C0783z mo5302b(View view) {
        if (this.f157556j == null) {
            this.f157556j = new C36830a(this);
        }
        return this.f157556j;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        this.f64777a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C35157b) this).f149169q;
        C35159d c35159d = chip.f20870E;
        accessibilityNodeInfo.setCheckable(c35159d != null && c35159d.f149223r0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c18093f.m51953h(chip.getAccessibilityClassName());
        c18093f.m51957l(chip.getText());
    }

    /* JADX INFO: renamed from: j */
    public final boolean m118065j(int i13) {
        if (this.f157558l != i13) {
            return false;
        }
        this.f157558l = Integer.MIN_VALUE;
        C35157b c35157b = (C35157b) this;
        if (i13 == 1) {
            Chip chip = c35157b.f149169q;
            chip.f20878M = false;
            chip.refreshDrawableState();
        }
        m118070q(i13, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final C18093f m118066k(int i13) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C18093f c18093f = new C18093f(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c18093f.m51953h("android.view.View");
        Rect rect = f157547n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        c18093f.f70318b = -1;
        Chip chip = this.f157555i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo111233o(i13, c18093f);
        if (c18093f.m51952g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f157551e;
        c18093f.m51951f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c18093f.f70319c = i13;
        accessibilityNodeInfoObtain.setSource(chip, i13);
        if (this.f157557k == i13) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c18093f.m51947a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c18093f.m51947a(64);
        }
        boolean z4 = this.f157558l == i13;
        if (z4) {
            c18093f.m51947a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c18093f.m51947a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z4);
        int[] iArr = this.f157553g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.f157550d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c18093f.m51951f(rect3);
            if (c18093f.f70318b != -1) {
                C18093f c18093f2 = new C18093f(AccessibilityNodeInfo.obtain());
                for (int i14 = c18093f.f70318b; i14 != -1; i14 = c18093f2.f70318b) {
                    c18093f2.f70318b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c18093f2.f70317a;
                    accessibilityNodeInfo.setParent(chip, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    mo111233o(i14, c18093f2);
                    c18093f2.m51951f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f157552f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = c18093f.f70317a;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return c18093f;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo111232l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    /* JADX INFO: renamed from: m */
    public final boolean m118067m(int i13, Rect rect) {
        int i14;
        int i15;
        Object obj;
        C18093f c18093f;
        int i16;
        int iM56e;
        int i17;
        Rect rect2;
        int iM58g;
        Rect rect3;
        int i18;
        C18093f c18093f2;
        int i19;
        int iM100058l;
        int iM100060o;
        ArrayList arrayList = new ArrayList();
        mo111232l(arrayList);
        C0024g1 c0024g1 = new C0024g1((Object) null);
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            c0024g1.m57f(((Integer) arrayList.get(i24)).intValue(), m118066k(((Integer) arrayList.get(i24)).intValue()));
        }
        int i25 = this.f157558l;
        C18093f c18093f3 = i25 == Integer.MIN_VALUE ? null : (C18093f) c0024g1.m55d(i25);
        C33623c0 c33623c0 = f157548o;
        C33647p c33647p = f157549p;
        Chip chip = this.f157555i;
        if (i13 == 1 || i13 == 2) {
            i14 = -1;
            i15 = 0;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            boolean z4 = chip.getLayoutDirection() == 1;
            c33647p.getClass();
            int iM58g2 = c0024g1.m58g();
            ArrayList arrayList2 = new ArrayList(iM58g2);
            for (int i26 = 0; i26 < iM58g2; i26++) {
                arrayList2.add((C18093f) c0024g1.m59h(i26));
            }
            Collections.sort(arrayList2, new C36832c(z4, c33623c0));
            if (i13 == 1) {
                int size = arrayList2.size();
                if (c18093f3 != null) {
                    size = arrayList2.indexOf(c18093f3);
                }
                int i27 = size - 1;
                if (i27 >= 0) {
                    obj = arrayList2.get(i27);
                } else {
                    obj = null;
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c18093f3 == null ? -1 : arrayList2.lastIndexOf(c18093f3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            c18093f = (C18093f) obj;
        } else {
            if (i13 != 17 && i13 != 33 && i13 != 66 && i13 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i28 = this.f157558l;
            if (i28 != Integer.MIN_VALUE) {
                m118068n(i28).m51951f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i13 == 17) {
                        i17 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i13 == 33) {
                        i17 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i13 == 66) {
                        i17 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (i13 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i17 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i13 != 17) {
                    i15 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i13 != 33) {
                    i15 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i13 != 66) {
                    i15 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i13 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i15 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                c33647p.getClass();
                iM58g = c0024g1.m58g();
                rect3 = new Rect();
                c18093f = null;
                for (i18 = i15; i18 < iM58g; i18++) {
                    c18093f2 = (C18093f) c0024g1.m59h(i18);
                    if (c18093f2 == c18093f3) {
                        c33623c0.getClass();
                        c18093f2.m51951f(rect3);
                        if (AbstractC32128i.m100056j(i13, rect4, rect3)) {
                            if (AbstractC32128i.m100056j(i13, rect4, rect2) || AbstractC32128i.m100050d(i13, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                c18093f = c18093f2;
                            } else if (AbstractC32128i.m100050d(i13, rect4, rect2, rect3)) {
                                int iM100058l2 = AbstractC32128i.m100058l(i13, rect4, rect3);
                                int iM100060o2 = AbstractC32128i.m100060o(i13, rect4, rect3);
                                i19 = (iM100060o2 * iM100060o2) + (iM100058l2 * 13 * iM100058l2);
                                iM100058l = AbstractC32128i.m100058l(i13, rect4, rect2);
                                iM100060o = AbstractC32128i.m100060o(i13, rect4, rect2);
                                if (i19 < (iM100060o * iM100060o) + (iM100058l * 13 * iM100058l)) {
                                    rect2.set(rect3);
                                    c18093f = c18093f2;
                                }
                            }
                        }
                    }
                }
                i14 = i17;
            }
            i17 = -1;
            rect2 = new Rect(rect4);
            if (i13 != 17) {
                i15 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i13 != 33) {
                i15 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i13 != 66) {
                i15 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i13 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i15 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            c33647p.getClass();
            iM58g = c0024g1.m58g();
            rect3 = new Rect();
            c18093f = null;
            while (i18 < iM58g) {
                c18093f2 = (C18093f) c0024g1.m59h(i18);
                if (c18093f2 == c18093f3) {
                    c33623c0.getClass();
                    c18093f2.m51951f(rect3);
                    if (AbstractC32128i.m100056j(i13, rect4, rect3)) {
                        if (AbstractC32128i.m100056j(i13, rect4, rect2)) {
                            rect2.set(rect3);
                            c18093f = c18093f2;
                        } else if (AbstractC32128i.m100050d(i13, rect4, rect2, rect3)) {
                            int iM100058l3 = AbstractC32128i.m100058l(i13, rect4, rect3);
                            int iM100060o3 = AbstractC32128i.m100060o(i13, rect4, rect3);
                            i19 = (iM100060o3 * iM100060o3) + (iM100058l3 * 13 * iM100058l3);
                            iM100058l = AbstractC32128i.m100058l(i13, rect4, rect2);
                            iM100060o = AbstractC32128i.m100060o(i13, rect4, rect2);
                            if (i19 < (iM100060o * iM100060o) + (iM100058l * 13 * iM100058l)) {
                                rect2.set(rect3);
                                c18093f = c18093f2;
                            }
                        }
                    }
                }
            }
            i14 = i17;
        }
        C18093f c18093f4 = c18093f;
        if (c18093f4 == null) {
            iM56e = Integer.MIN_VALUE;
        } else {
            if (c0024g1.f55w) {
                AbstractC0064z.m159a(c0024g1);
            }
            int i29 = c0024g1.f58z;
            while (true) {
                if (i15 >= i29) {
                    i16 = i14;
                    break;
                }
                if (c0024g1.f57y[i15] == c18093f4) {
                    i16 = i15;
                    break;
                }
                i15++;
            }
            iM56e = c0024g1.m56e(i16);
        }
        return m118069p(iM56e);
    }

    /* JADX INFO: renamed from: n */
    public final C18093f m118068n(int i13) {
        if (i13 != -1) {
            return m118066k(i13);
        }
        Chip chip = this.f157555i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C18093f c18093f = new C18093f(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo111232l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            c18093f.f70317a.addChild(chip, ((Integer) arrayList.get(i14)).intValue());
        }
        return c18093f;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo111233o(int i13, C18093f c18093f);

    /* JADX INFO: renamed from: p */
    public final boolean m118069p(int i13) {
        int i14;
        Chip chip = this.f157555i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i14 = this.f157558l) == i13) {
            return false;
        }
        if (i14 != Integer.MIN_VALUE) {
            m118065j(i14);
        }
        if (i13 == Integer.MIN_VALUE) {
            return false;
        }
        this.f157558l = i13;
        C35157b c35157b = (C35157b) this;
        if (i13 == 1) {
            Chip chip2 = c35157b.f149169q;
            chip2.f20878M = true;
            chip2.refreshDrawableState();
        }
        m118070q(i13, 8);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m118070q(int i13, int i14) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i13 == Integer.MIN_VALUE || !this.f157554h.isEnabled() || (parent = (view = this.f157555i).getParent()) == null) {
            return;
        }
        if (i13 != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i14);
            C18093f c18093fM118068n = m118068n(i13);
            accessibilityEventObtain.getText().add(c18093fM118068n.m51952g());
            AccessibilityNodeInfo accessibilityNodeInfo = c18093fM118068n.f70317a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i13);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i14);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
