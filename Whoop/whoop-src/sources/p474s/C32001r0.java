package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p027b3.AbstractC2378g1;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;
import p479s4.AbstractC32122c;
import p550vd.AbstractC35902e;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: s.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C32001r0 {

    /* JADX INFO: renamed from: a */
    public final TextView f132804a;

    /* JADX INFO: renamed from: b */
    public C31975k2 f132805b;

    /* JADX INFO: renamed from: c */
    public C31975k2 f132806c;

    /* JADX INFO: renamed from: d */
    public C31975k2 f132807d;

    /* JADX INFO: renamed from: e */
    public C31975k2 f132808e;

    /* JADX INFO: renamed from: f */
    public C31975k2 f132809f;

    /* JADX INFO: renamed from: g */
    public C31975k2 f132810g;

    /* JADX INFO: renamed from: h */
    public C31975k2 f132811h;

    /* JADX INFO: renamed from: i */
    public final C32025x0 f132812i;

    /* JADX INFO: renamed from: j */
    public int f132813j = 0;

    /* JADX INFO: renamed from: k */
    public int f132814k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f132815l;

    /* JADX INFO: renamed from: m */
    public boolean f132816m;

    public C32001r0(TextView textView) {
        this.f132804a = textView;
        this.f132812i = new C32025x0(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C31975k2 m99520c(Context context, C31992p c31992p, int i13) {
        ColorStateList colorStateListM99427f;
        synchronized (c31992p) {
            colorStateListM99427f = c31992p.f132798a.m99427f(context, i13);
        }
        if (colorStateListM99427f == null) {
            return null;
        }
        C31975k2 c31975k2 = new C31975k2();
        c31975k2.f132746d = true;
        c31975k2.f132743a = colorStateListM99427f;
        return c31975k2;
    }

    /* JADX INFO: renamed from: a */
    public final void m99521a(Drawable drawable, C31975k2 c31975k2) {
        if (drawable == null || c31975k2 == null) {
            return;
        }
        C31992p.m99508e(drawable, c31975k2, this.f132804a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m99522b() {
        C31975k2 c31975k2 = this.f132805b;
        TextView textView = this.f132804a;
        if (c31975k2 != null || this.f132806c != null || this.f132807d != null || this.f132808e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m99521a(compoundDrawables[0], this.f132805b);
            m99521a(compoundDrawables[1], this.f132806c);
            m99521a(compoundDrawables[2], this.f132807d);
            m99521a(compoundDrawables[3], this.f132808e);
        }
        if (this.f132809f == null && this.f132810g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m99521a(compoundDrawablesRelative[0], this.f132809f);
        m99521a(compoundDrawablesRelative[2], this.f132810g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m99523d() {
        C31975k2 c31975k2 = this.f132811h;
        if (c31975k2 != null) {
            return c31975k2.f132743a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m99524e() {
        C31975k2 c31975k2 = this.f132811h;
        if (c31975k2 != null) {
            return c31975k2.f132744b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:252:0x043f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0447  */
    /* JADX WARN: Code duplicated, block: B:256:0x0458  */
    /* JADX WARN: Code duplicated, block: B:257:0x045b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0463  */
    /* JADX WARN: Code duplicated, block: B:263:0x0477 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0479  */
    /* JADX WARN: Code duplicated, block: B:266:0x047e  */
    /* JADX WARN: Code duplicated, block: B:268:0x0484  */
    /* JADX WARN: Code duplicated, block: B:270:0x0488  */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m99525f(AttributeSet attributeSet, int i13) {
        boolean z4;
        boolean z13;
        String string;
        String string2;
        int i14;
        float dimensionPixelSize;
        int i15;
        Paint.FontMetricsInt fontMetricsInt;
        int i16;
        ColorStateList colorStateList;
        int resourceId;
        int i17;
        int resourceId2;
        TextView textView = this.f132804a;
        Context context = textView.getContext();
        C31992p c31992pM99505a = C31992p.m99505a();
        int[] iArr = AbstractC22932a.f90515h;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, i13);
        AbstractC16901p0.m47582m(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, i13);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f132805b = m99520c(context, c31992pM99505a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f132806c = m99520c(context, c31992pM99505a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f132807d = m99520c(context, c31992pM99505a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f132808e = m99520c(context, c31992pM99505a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f132809f = m99520c(context, c31992pM99505a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f132810g = m99520c(context, c31992pM99505a, typedArray.getResourceId(6, 0));
        }
        c31983m2M99479q.m99491r();
        boolean z14 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC22932a.f90530w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C31983m2 c31983m2 = new C31983m2(context, typedArrayObtainStyledAttributes);
            if (z14 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z13 = false;
            } else {
                z13 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            m99529j(context, c31983m2);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            c31983m2.m99491r();
        } else {
            z4 = false;
            z13 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i13, 0);
        C31983m2 c31983m3 = new C31983m2(context, typedArrayObtainStyledAttributes2);
        if (!z14 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z13 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        boolean z15 = z13;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m99529j(context, c31983m3);
        c31983m3.m99491r();
        if (!z14 && z4) {
            textView.setAllCaps(z15);
        }
        Typeface typeface = this.f132815l;
        if (typeface != null) {
            if (this.f132814k == -1) {
                textView.setTypeface(typeface, this.f132813j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC31993p0.m99513d(textView, string);
        }
        if (string2 != null) {
            AbstractC31989o0.m99500b(textView, AbstractC31989o0.m99499a(string2));
        }
        C32025x0 c32025x0 = this.f132812i;
        Context context2 = c32025x0.f132892h;
        int[] iArr3 = AbstractC22932a.f90516i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i13, 0);
        TextView textView2 = c32025x0.f132891g;
        AbstractC16901p0.m47582m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i13);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c32025x0.f132885a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i14 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            i14 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i18 = 0; i18 < length; i18++) {
                    iArr4[i18] = typedArrayObtainTypedArray.getDimensionPixelSize(i18, -1);
                }
                int[] iArrM99578a = C32025x0.m99578a(iArr4);
                c32025x0.f132889e = iArrM99578a;
                int length2 = iArrM99578a.length;
                boolean z16 = length2 > 0;
                c32025x0.f132890f = z16;
                if (z16) {
                    c32025x0.f132885a = 1;
                    c32025x0.f132887c = iArrM99578a[0];
                    c32025x0.f132888d = iArrM99578a[length2 - 1];
                    c32025x0.f132886b = -1.0f;
                }
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c32025x0.m99579b()) {
            c32025x0.f132885a = i14;
        } else if (c32025x0.f132885a == 1) {
            if (!c32025x0.f132890f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i17 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i17 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i17, 112.0f, displayMetrics);
                }
                float f13 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (f13 <= dimension2) {
                    throw new IllegalArgumentException(AbstractC31061c.m95638n("Maximum auto-size text size (", f13, "px) is less or equal to minimum auto-size text size (", dimension2, "px)"));
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c32025x0.f132885a = 1;
                c32025x0.f132887c = dimension2;
                c32025x0.f132888d = f13;
                c32025x0.f132886b = dimension;
                c32025x0.f132890f = i14;
            }
            if (c32025x0.m99579b() && c32025x0.f132885a == 1 && (!c32025x0.f132890f || c32025x0.f132889e.length == 0)) {
                int iFloor = ((int) Math.floor((c32025x0.f132888d - c32025x0.f132887c) / c32025x0.f132886b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i19 = 0; i19 < iFloor; i19++) {
                    iArr5[i19] = Math.round((i19 * c32025x0.f132886b) + c32025x0.f132887c);
                }
                c32025x0.f132889e = C32025x0.m99578a(iArr5);
            }
        }
        if (c32025x0.f132885a != 0) {
            int[] iArr6 = c32025x0.f132889e;
            if (iArr6.length > 0) {
                if (AbstractC31993p0.m99510a(textView) != -1.0f) {
                    AbstractC31993p0.m99511b(textView, Math.round(c32025x0.f132887c), Math.round(c32025x0.f132888d), Math.round(c32025x0.f132886b), 0);
                } else {
                    AbstractC31993p0.m99512c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM99509b = resourceId4 != -1 ? c31992pM99505a.m99509b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM99509b2 = resourceId5 != -1 ? c31992pM99505a.m99509b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM99509b3 = resourceId6 != -1 ? c31992pM99505a.m99509b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM99509b4 = resourceId7 != -1 ? c31992pM99505a.m99509b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM99509b5 = resourceId8 != -1 ? c31992pM99505a.m99509b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM99509b6 = resourceId9 != -1 ? c31992pM99505a.m99509b(context, resourceId9) : null;
        if (drawableM99509b5 != null || drawableM99509b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM99509b5 == null) {
                drawableM99509b5 = compoundDrawablesRelative[0];
            }
            if (drawableM99509b2 == null) {
                drawableM99509b2 = compoundDrawablesRelative[1];
            }
            if (drawableM99509b6 == null) {
                drawableM99509b6 = compoundDrawablesRelative[2];
            }
            if (drawableM99509b4 == null) {
                drawableM99509b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM99509b5, drawableM99509b2, drawableM99509b6, drawableM99509b4);
        } else if (drawableM99509b != null || drawableM99509b2 != null || drawableM99509b3 != null || drawableM99509b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM99509b == null) {
                    drawableM99509b = compoundDrawables[0];
                }
                if (drawableM99509b2 == null) {
                    drawableM99509b2 = compoundDrawables[1];
                }
                if (drawableM99509b3 == null) {
                    drawableM99509b3 = compoundDrawables[2];
                }
                if (drawableM99509b4 == null) {
                    drawableM99509b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM99509b, drawableM99509b2, drawableM99509b3, drawableM99509b4);
            } else {
                if (drawableM99509b2 == null) {
                    drawableM99509b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM99509b4 == null) {
                    drawableM99509b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM99509b2, compoundDrawablesRelative2[2], drawableM99509b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC32122c.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC31950e1.m99445c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i24 = typedValuePeekValue.data;
                i15 = i24 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i24);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                AbstractC37056f.m118991n(dimensionPixelSize2);
                textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                AbstractC37056f.m118991n(dimensionPixelSize3);
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i16 = fontMetricsInt.bottom;
                } else {
                    i16 = fontMetricsInt.descent;
                }
                if (dimensionPixelSize3 > Math.abs(i16)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i16);
                }
            }
            if (dimensionPixelSize != -1.0f) {
                if (i15 == -1) {
                    AbstractC35902e.m113958b0(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC2378g1.m7345t(textView, i15, dimensionPixelSize);
                } else {
                    AbstractC35902e.m113958b0(textView, Math.round(TypedValue.applyDimension(i15, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        i15 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            AbstractC37056f.m118991n(dimensionPixelSize2);
            textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            AbstractC37056f.m118991n(dimensionPixelSize3);
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i16 = fontMetricsInt.bottom;
            } else {
                i16 = fontMetricsInt.descent;
            }
            if (dimensionPixelSize3 > Math.abs(i16)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i16);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i15 == -1) {
                AbstractC35902e.m113958b0(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC2378g1.m7345t(textView, i15, dimensionPixelSize);
            } else {
                AbstractC35902e.m113958b0(textView, Math.round(TypedValue.applyDimension(i15, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m99526g(Context context, int i13) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i13, AbstractC22932a.f90530w);
        C31983m2 c31983m2 = new C31983m2(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f132804a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m99529j(context, c31983m2);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC31993p0.m99513d(textView, string);
        }
        c31983m2.m99491r();
        Typeface typeface = this.f132815l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f132813j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m99527h(ColorStateList colorStateList) {
        if (this.f132811h == null) {
            this.f132811h = new C31975k2();
        }
        C31975k2 c31975k2 = this.f132811h;
        c31975k2.f132743a = colorStateList;
        c31975k2.f132746d = colorStateList != null;
        this.f132805b = c31975k2;
        this.f132806c = c31975k2;
        this.f132807d = c31975k2;
        this.f132808e = c31975k2;
        this.f132809f = c31975k2;
        this.f132810g = c31975k2;
    }

    /* JADX INFO: renamed from: i */
    public final void m99528i(PorterDuff.Mode mode) {
        if (this.f132811h == null) {
            this.f132811h = new C31975k2();
        }
        C31975k2 c31975k2 = this.f132811h;
        c31975k2.f132744b = mode;
        c31975k2.f132745c = mode != null;
        this.f132805b = c31975k2;
        this.f132806c = c31975k2;
        this.f132807d = c31975k2;
        this.f132808e = c31975k2;
        this.f132809f = c31975k2;
        this.f132810g = c31975k2;
    }

    /* JADX INFO: renamed from: j */
    public final void m99529j(Context context, C31983m2 c31983m2) {
        String string;
        int i13 = this.f132813j;
        TypedArray typedArray = (TypedArray) c31983m2.f132769x;
        this.f132813j = typedArray.getInt(2, i13);
        int i14 = typedArray.getInt(11, -1);
        this.f132814k = i14;
        if (i14 != -1) {
            this.f132813j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f132816m = false;
                int i15 = typedArray.getInt(1, 1);
                if (i15 == 1) {
                    this.f132815l = Typeface.SANS_SERIF;
                    return;
                } else if (i15 == 2) {
                    this.f132815l = Typeface.SERIF;
                    return;
                } else {
                    if (i15 != 3) {
                        return;
                    }
                    this.f132815l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f132815l = null;
        int i16 = typedArray.hasValue(12) ? 12 : 10;
        int i17 = this.f132814k;
        int i18 = this.f132813j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM99488l = c31983m2.m99488l(i16, this.f132813j, new C31985n0(this, i17, i18, new WeakReference(this.f132804a)));
                if (typefaceM99488l != null) {
                    if (this.f132814k != -1) {
                        this.f132815l = AbstractC31997q0.m99514a(Typeface.create(typefaceM99488l, 0), this.f132814k, (this.f132813j & 2) != 0);
                    } else {
                        this.f132815l = typefaceM99488l;
                    }
                }
                this.f132816m = this.f132815l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f132815l != null || (string = typedArray.getString(i16)) == null) {
            return;
        }
        if (this.f132814k != -1) {
            this.f132815l = AbstractC31997q0.m99514a(Typeface.create(string, 0), this.f132814k, (this.f132813j & 2) != 0);
        } else {
            this.f132815l = Typeface.create(string, this.f132813j);
        }
    }
}
