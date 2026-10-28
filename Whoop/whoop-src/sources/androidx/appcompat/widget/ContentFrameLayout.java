package androidx.appcompat.widget;

import ad3.C0783z;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p184h5.C16913t0;
import p314m.LayoutInflaterFactory2C24829a0;
import p444r.MenuC30818l;
import p474s.InterfaceC31934a1;
import p474s.InterfaceC32032z0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: E */
    public TypedValue f4340E;

    /* JADX INFO: renamed from: F */
    public TypedValue f4341F;

    /* JADX INFO: renamed from: G */
    public final Rect f4342G;

    /* JADX INFO: renamed from: H */
    public InterfaceC32032z0 f4343H;

    /* JADX INFO: renamed from: w */
    public TypedValue f4344w;

    /* JADX INFO: renamed from: x */
    public TypedValue f4345x;

    /* JADX INFO: renamed from: y */
    public TypedValue f4346y;

    /* JADX INFO: renamed from: z */
    public TypedValue f4347z;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4342G = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4340E == null) {
            this.f4340E = new TypedValue();
        }
        return this.f4340E;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4341F == null) {
            this.f4341F = new TypedValue();
        }
        return this.f4341F;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4346y == null) {
            this.f4346y = new TypedValue();
        }
        return this.f4346y;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4347z == null) {
            this.f4347z = new TypedValue();
        }
        return this.f4347z;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4344w == null) {
            this.f4344w = new TypedValue();
        }
        return this.f4344w;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4345x == null) {
            this.f4345x = new TypedValue();
        }
        return this.f4345x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC32032z0 interfaceC32032z0 = this.f4343H;
        if (interfaceC32032z0 != null) {
            interfaceC32032z0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC32032z0 interfaceC32032z0 = this.f4343H;
        if (interfaceC32032z0 != null) {
            LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) ((C0783z) interfaceC32032z0).f2818x;
            InterfaceC31934a1 interfaceC31934a1 = layoutInflaterFactory2C24829a0.f97216R;
            if (interfaceC31934a1 != null) {
                ((ActionBarOverlayLayout) interfaceC31934a1).m3271f();
            }
            if (layoutInflaterFactory2C24829a0.f97221W != null) {
                layoutInflaterFactory2C24829a0.f97210L.getDecorView().removeCallbacks(layoutInflaterFactory2C24829a0.f97222X);
                if (layoutInflaterFactory2C24829a0.f97221W.isShowing()) {
                    try {
                        layoutInflaterFactory2C24829a0.f97221W.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C24829a0.f97221W = null;
            }
            C16913t0 c16913t0 = layoutInflaterFactory2C24829a0.f97223Y;
            if (c16913t0 != null) {
                c16913t0.m47608b();
            }
            MenuC30818l menuC30818l = layoutInflaterFactory2C24829a0.m72786D(0).f97407h;
            if (menuC30818l != null) {
                menuC30818l.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int iMakeMeasureSpec;
        boolean z4;
        int iMakeMeasureSpec2;
        int i15;
        int i16;
        float fraction;
        int i17;
        int i18;
        float fraction2;
        int i19;
        int i24;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z13 = true;
        boolean z14 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        Rect rect = this.f4342G;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i13;
            z4 = false;
        } else {
            TypedValue typedValue = z14 ? this.f4347z : this.f4346y;
            if (typedValue == null || (i19 = typedValue.type) == 0) {
                iMakeMeasureSpec = i13;
                z4 = false;
            } else {
                if (i19 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i19 == 6) {
                        int i25 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i25, i25);
                    } else {
                        i24 = 0;
                    }
                    if (i24 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i24 - (rect.left + rect.right), View.MeasureSpec.getSize(i13)), 1073741824);
                        z4 = true;
                    } else {
                        iMakeMeasureSpec = i13;
                        z4 = false;
                    }
                }
                i24 = (int) fraction3;
                if (i24 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i24 - (rect.left + rect.right), View.MeasureSpec.getSize(i13)), 1073741824);
                    z4 = true;
                } else {
                    iMakeMeasureSpec = i13;
                    z4 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i14;
        } else {
            TypedValue typedValue2 = z14 ? this.f4340E : this.f4341F;
            if (typedValue2 == null || (i17 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i14;
            } else {
                if (i17 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i17 == 6) {
                        int i26 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i26, i26);
                    } else {
                        i18 = 0;
                    }
                    if (i18 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i14)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i14;
                    }
                }
                i18 = (int) fraction2;
                if (i18 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i14)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i14;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z4 || mode != Integer.MIN_VALUE) {
            z13 = false;
        } else {
            TypedValue typedValue3 = z14 ? this.f4345x : this.f4344w;
            if (typedValue3 == null || (i15 = typedValue3.type) == 0) {
                z13 = false;
            } else {
                if (i15 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i27 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i27, i27);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        i16 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i16) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                    } else {
                        z13 = false;
                    }
                }
                i16 = (int) fraction;
                if (i16 > 0) {
                    i16 -= rect.left + rect.right;
                }
                if (measuredWidth < i16) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                } else {
                    z13 = false;
                }
            }
        }
        if (z13) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(InterfaceC32032z0 interfaceC32032z0) {
        this.f4343H = interfaceC32032z0;
    }
}
