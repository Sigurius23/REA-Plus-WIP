package p184h5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: h5.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C16903q {

    /* JADX INFO: renamed from: a */
    public ViewParent f64857a;

    /* JADX INFO: renamed from: b */
    public ViewParent f64858b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f64859c;

    /* JADX INFO: renamed from: d */
    public boolean f64860d;

    /* JADX INFO: renamed from: e */
    public int[] f64861e;

    public C16903q(ViewGroup viewGroup) {
        this.f64859c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m47588a(float f13, float f14, boolean z4) {
        ViewParent viewParentM47592e;
        if (this.f64860d && (viewParentM47592e = m47592e(0)) != null) {
            try {
                return viewParentM47592e.onNestedFling(this.f64859c, f13, f14, z4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM47592e + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47589b(float f13, float f14) {
        ViewParent viewParentM47592e;
        if (this.f64860d && (viewParentM47592e = m47592e(0)) != null) {
            try {
                return viewParentM47592e.onNestedPreFling(this.f64859c, f13, f14);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM47592e + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m47590c(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        ViewParent viewParentM47592e;
        int i16;
        int i17;
        if (!this.f64860d || (viewParentM47592e = m47592e(i15)) == null) {
            return false;
        }
        if (i13 == 0 && i14 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f64859c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i16 = iArr2[0];
            i17 = iArr2[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr == null) {
            if (this.f64861e == null) {
                this.f64861e = new int[2];
            }
            iArr = this.f64861e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM47592e instanceof InterfaceC16906r) {
            ((InterfaceC16906r) viewParentM47592e).mo3269d(viewGroup, i13, i14, iArr3, i15);
        } else if (i15 == 0) {
            try {
                viewParentM47592e.onNestedPreScroll(viewGroup, i13, i14, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM47592e + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i16;
            iArr2[1] = iArr2[1] - i17;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m47591d(int i13, int i14, int i15, int i16, int[] iArr, int i17, int[] iArr2) {
        ViewParent viewParentM47592e;
        int i18;
        int i19;
        int[] iArr3;
        if (this.f64860d && (viewParentM47592e = m47592e(i17)) != null) {
            if (i13 != 0 || i14 != 0 || i15 != 0 || i16 != 0) {
                ViewGroup viewGroup = this.f64859c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i18 = iArr[0];
                    i19 = iArr[1];
                } else {
                    i18 = 0;
                    i19 = 0;
                }
                if (iArr2 == null) {
                    if (this.f64861e == null) {
                        this.f64861e = new int[2];
                    }
                    int[] iArr4 = this.f64861e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM47592e instanceof InterfaceC16909s) {
                    ((InterfaceC16909s) viewParentM47592e).mo3272g(viewGroup, i13, i14, i15, i16, i17, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i15;
                    iArr3[1] = iArr3[1] + i16;
                    if (viewParentM47592e instanceof InterfaceC16906r) {
                        ((InterfaceC16906r) viewParentM47592e).mo3273h(viewGroup, i13, i14, i15, i16, i17);
                    } else if (i17 == 0) {
                        try {
                            viewParentM47592e.onNestedScroll(viewGroup, i13, i14, i15, i16);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM47592e + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i18;
                    iArr[1] = iArr[1] - i19;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final ViewParent m47592e(int i13) {
        if (i13 == 0) {
            return this.f64857a;
        }
        if (i13 != 1) {
            return null;
        }
        return this.f64858b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m47593f(int i13, int i14) {
        boolean zOnStartNestedScroll;
        if (m47592e(i14) != null) {
            return true;
        }
        if (this.f64860d) {
            View view = this.f64859c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z4 = parent instanceof InterfaceC16906r;
                if (z4) {
                    zOnStartNestedScroll = ((InterfaceC16906r) parent).mo3274i(view2, view, i13, i14);
                } else if (i14 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i13);
                    } catch (AbstractMethodError e5) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e5);
                        zOnStartNestedScroll = false;
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i14 == 0) {
                        this.f64857a = parent;
                    } else if (i14 == 1) {
                        this.f64858b = parent;
                    }
                    if (z4) {
                        ((InterfaceC16906r) parent).mo3267b(view2, view, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i13);
                        } catch (AbstractMethodError e13) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e13);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m47594g(int i13) {
        ViewParent viewParentM47592e = m47592e(i13);
        if (viewParentM47592e != null) {
            boolean z4 = viewParentM47592e instanceof InterfaceC16906r;
            ViewGroup viewGroup = this.f64859c;
            if (z4) {
                ((InterfaceC16906r) viewParentM47592e).mo3268c(viewGroup, i13);
            } else if (i13 == 0) {
                try {
                    viewParentM47592e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM47592e + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i13 == 0) {
                this.f64857a = null;
            } else {
                if (i13 != 1) {
                    return;
                }
                this.f64858b = null;
            }
        }
    }
}
