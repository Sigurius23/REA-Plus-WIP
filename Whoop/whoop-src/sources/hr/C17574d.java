package hr;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p079d2.AbstractC11480b;
import p257jq.AbstractC21885a;
import p477s2.AbstractC32073e;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: hr.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17574d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f68091a;

    /* JADX INFO: renamed from: b */
    public final String f68092b;

    /* JADX INFO: renamed from: c */
    public final int f68093c;

    /* JADX INFO: renamed from: d */
    public final int f68094d;

    /* JADX INFO: renamed from: e */
    public final float f68095e;

    /* JADX INFO: renamed from: f */
    public final float f68096f;

    /* JADX INFO: renamed from: g */
    public final float f68097g;

    /* JADX INFO: renamed from: h */
    public final boolean f68098h;

    /* JADX INFO: renamed from: i */
    public final float f68099i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f68100j;

    /* JADX INFO: renamed from: k */
    public float f68101k;

    /* JADX INFO: renamed from: l */
    public final int f68102l;

    /* JADX INFO: renamed from: m */
    public boolean f68103m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f68104n;

    public C17574d(Context context, int i13) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i13, AbstractC21885a.f84537N);
        this.f68101k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f68100j = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 3);
        AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 4);
        AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 5);
        this.f68093c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f68094d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i14 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f68102l = typedArrayObtainStyledAttributes.getResourceId(i14, 0);
        this.f68092b = typedArrayObtainStyledAttributes.getString(i14);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f68091a = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 6);
        this.f68095e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f68096f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f68097g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i13, AbstractC21885a.f84525B);
        this.f68098h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f68099i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m50022a() {
        String str;
        Typeface typeface = this.f68104n;
        int i13 = this.f68093c;
        if (typeface == null && (str = this.f68092b) != null) {
            this.f68104n = Typeface.create(str, i13);
        }
        if (this.f68104n == null) {
            int i14 = this.f68094d;
            if (i14 == 1) {
                this.f68104n = Typeface.SANS_SERIF;
            } else if (i14 == 2) {
                this.f68104n = Typeface.SERIF;
            } else if (i14 != 3) {
                this.f68104n = Typeface.DEFAULT;
            } else {
                this.f68104n = Typeface.MONOSPACE;
            }
            this.f68104n = Typeface.create(this.f68104n, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m50023b(Context context) {
        if (this.f68103m) {
            return this.f68104n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM109098b = AbstractC34523k.m109098b(context, this.f68102l);
                this.f68104n = typefaceM109098b;
                if (typefaceM109098b != null) {
                    this.f68104n = Typeface.create(typefaceM109098b, this.f68093c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                Log.d("TextAppearance", "Error loading font " + this.f68092b, e5);
            }
        }
        m50022a();
        this.f68103m = true;
        return this.f68104n;
    }

    /* JADX INFO: renamed from: c */
    public final void m50024c(Context context, AbstractC32073e abstractC32073e) {
        if (m50025d(context)) {
            m50023b(context);
        } else {
            m50022a();
        }
        int i13 = this.f68102l;
        if (i13 == 0) {
            this.f68103m = true;
        }
        if (this.f68103m) {
            abstractC32073e.mo29863R(this.f68104n, true);
            return;
        }
        try {
            C17572b c17572b = new C17572b(this, abstractC32073e);
            ThreadLocal threadLocal = AbstractC34523k.f145117a;
            if (context.isRestricted()) {
                c17572b.m109079a(-4);
            } else {
                AbstractC34523k.m109099c(context, i13, new TypedValue(), 0, c17572b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f68103m = true;
            abstractC32073e.mo29862Q(1);
        } catch (Exception e5) {
            Log.d("TextAppearance", "Error loading font " + this.f68092b, e5);
            this.f68103m = true;
            abstractC32073e.mo29862Q(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m50025d(Context context) {
        Typeface typefaceM109099c = null;
        int i13 = this.f68102l;
        if (i13 != 0) {
            ThreadLocal threadLocal = AbstractC34523k.f145117a;
            if (!context.isRestricted()) {
                typefaceM109099c = AbstractC34523k.m109099c(context, i13, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM109099c != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m50026e(Context context, TextPaint textPaint, AbstractC32073e abstractC32073e) {
        m50027f(context, textPaint, abstractC32073e);
        ColorStateList colorStateList = this.f68100j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f68091a;
        textPaint.setShadowLayer(this.f68097g, this.f68095e, this.f68096f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m50027f(Context context, TextPaint textPaint, AbstractC32073e abstractC32073e) {
        if (m50025d(context)) {
            m50028g(context, textPaint, m50023b(context));
            return;
        }
        m50022a();
        m50028g(context, textPaint, this.f68104n);
        m50024c(context, new C17573c(this, context, textPaint, abstractC32073e));
    }

    /* JADX INFO: renamed from: g */
    public final void m50028g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM30886l = AbstractC11480b.m30886l(context.getResources().getConfiguration(), typeface);
        if (typefaceM30886l != null) {
            typeface = typefaceM30886l;
        }
        textPaint.setTypeface(typeface);
        int i13 = (~typeface.getStyle()) & this.f68093c;
        textPaint.setFakeBoldText((i13 & 1) != 0);
        textPaint.setTextSkewX((i13 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f68101k);
        if (this.f68098h) {
            textPaint.setLetterSpacing(this.f68099i);
        }
    }
}
