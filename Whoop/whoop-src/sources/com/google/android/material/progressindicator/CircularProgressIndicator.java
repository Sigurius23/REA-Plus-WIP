package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import cc.C4409p;
import com.whoop.android.R;
import cr.AbstractC11075m;
import fr.AbstractC14693d;
import fr.AbstractC14694e;
import fr.C14695f;
import fr.C14697h;
import fr.C14698i;
import fr.C14700k;
import fr.C14705p;
import p257jq.AbstractC21885a;
import p513u4.AbstractC34514b;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: loaded from: classes6.dex */
public class CircularProgressIndicator extends AbstractC14693d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        C14698i c14698i = (C14698i) this.f54308w;
        C14695f c14695f = new C14695f(c14698i);
        Context context2 = getContext();
        C14705p c14705p = new C14705p(context2, c14698i, c14695f, new C14697h(c14698i));
        Resources resources = context2.getResources();
        C4409p c4409p = new C4409p();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        c4409p.f17755w = AbstractC34514b.m109070f(resources, R.drawable.indeterminate_static, null);
        c14705p.f54368N = c4409p;
        setIndeterminateDrawable(c14705p);
        setProgressDrawable(new C14700k(getContext(), c14698i, c14695f));
    }

    @Override // fr.AbstractC14693d
    /* JADX INFO: renamed from: a */
    public final AbstractC14694e mo15773a(Context context, AttributeSet attributeSet) {
        C14698i c14698i = new C14698i(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        AbstractC11075m.m29867a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = AbstractC21885a.f84549i;
        AbstractC11075m.m29868b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        c14698i.f54339h = Math.max(AbstractC22674j.m65697E(context, typedArrayObtainStyledAttributes, 2, dimensionPixelSize), c14698i.f54312a * 2);
        c14698i.f54340i = AbstractC22674j.m65697E(context, typedArrayObtainStyledAttributes, 1, dimensionPixelSize2);
        c14698i.f54341j = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c14698i.mo42130a();
        return c14698i;
    }

    public int getIndicatorDirection() {
        return ((C14698i) this.f54308w).f54341j;
    }

    public int getIndicatorInset() {
        return ((C14698i) this.f54308w).f54340i;
    }

    public int getIndicatorSize() {
        return ((C14698i) this.f54308w).f54339h;
    }

    public void setIndicatorDirection(int i13) {
        ((C14698i) this.f54308w).f54341j = i13;
        invalidate();
    }

    public void setIndicatorInset(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (((C14698i) abstractC14694e).f54340i != i13) {
            ((C14698i) abstractC14694e).f54340i = i13;
            invalidate();
        }
    }

    public void setIndicatorSize(int i13) {
        int iMax = Math.max(i13, getTrackThickness() * 2);
        AbstractC14694e abstractC14694e = this.f54308w;
        if (((C14698i) abstractC14694e).f54339h != iMax) {
            ((C14698i) abstractC14694e).f54339h = iMax;
            ((C14698i) abstractC14694e).mo42130a();
            requestLayout();
            invalidate();
        }
    }

    @Override // fr.AbstractC14693d
    public void setTrackThickness(int i13) {
        super.setTrackThickness(i13);
        ((C14698i) this.f54308w).mo42130a();
    }
}
