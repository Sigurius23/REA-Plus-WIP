package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.whoop.android.R;
import cr.AbstractC11075m;
import fr.AbstractC14693d;
import fr.AbstractC14694e;
import fr.C14700k;
import fr.C14705p;
import fr.C14706q;
import fr.C14707r;
import fr.C14709t;
import fr.C14710u;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;

/* JADX INFO: loaded from: classes6.dex */
public class LinearProgressIndicator extends AbstractC14693d {
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        C14710u c14710u = (C14710u) this.f54308w;
        C14706q c14706q = new C14706q(c14710u);
        c14706q.f54369b = 300.0f;
        Context context2 = getContext();
        setIndeterminateDrawable(new C14705p(context2, c14710u, c14706q, c14710u.f54394h == 0 ? new C14707r(c14710u) : new C14709t(context2, c14710u)));
        setProgressDrawable(new C14700k(getContext(), c14710u, c14706q));
    }

    @Override // fr.AbstractC14693d
    /* JADX INFO: renamed from: a */
    public final AbstractC14694e mo15773a(Context context, AttributeSet attributeSet) {
        C14710u c14710u = new C14710u(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        AbstractC11075m.m29867a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = AbstractC21885a.f84558r;
        AbstractC11075m.m29868b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        c14710u.f54394h = typedArrayObtainStyledAttributes.getInt(0, 1);
        c14710u.f54395i = typedArrayObtainStyledAttributes.getInt(1, 0);
        c14710u.f54397k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), c14710u.f54312a);
        typedArrayObtainStyledAttributes.recycle();
        c14710u.mo42130a();
        c14710u.f54396j = c14710u.f54395i == 1;
        return c14710u;
    }

    @Override // fr.AbstractC14693d
    /* JADX INFO: renamed from: b */
    public final void mo15774b(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (abstractC14694e != null && ((C14710u) abstractC14694e).f54394h == 0 && isIndeterminate()) {
            return;
        }
        super.mo15774b(i13);
    }

    public int getIndeterminateAnimationType() {
        return ((C14710u) this.f54308w).f54394h;
    }

    public int getIndicatorDirection() {
        return ((C14710u) this.f54308w).f54395i;
    }

    public int getTrackStopIndicatorSize() {
        return ((C14710u) this.f54308w).f54397k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        AbstractC14694e abstractC14694e = this.f54308w;
        C14710u c14710u = (C14710u) abstractC14694e;
        boolean z13 = true;
        if (((C14710u) abstractC14694e).f54395i != 1) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if ((getLayoutDirection() != 1 || ((C14710u) abstractC14694e).f54395i != 2) && (getLayoutDirection() != 0 || ((C14710u) abstractC14694e).f54395i != 3)) {
                z13 = false;
            }
        }
        c14710u.f54396j = z13;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int paddingRight = i13 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i14 - (getPaddingBottom() + getPaddingTop());
        C14705p indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        C14700k progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (((C14710u) abstractC14694e).f54394h == i13) {
            return;
        }
        if (m42129c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((C14710u) abstractC14694e).f54394h = i13;
        ((C14710u) abstractC14694e).mo42130a();
        if (i13 == 0) {
            C14705p indeterminateDrawable = getIndeterminateDrawable();
            C14707r c14707r = new C14707r((C14710u) abstractC14694e);
            indeterminateDrawable.f54367M = c14707r;
            c14707r.f9291b = indeterminateDrawable;
        } else {
            C14705p indeterminateDrawable2 = getIndeterminateDrawable();
            C14709t c14709t = new C14709t(getContext(), (C14710u) abstractC14694e);
            indeterminateDrawable2.f54367M = c14709t;
            c14709t.f9291b = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // fr.AbstractC14693d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((C14710u) this.f54308w).mo42130a();
    }

    public void setIndicatorDirection(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        ((C14710u) abstractC14694e).f54395i = i13;
        C14710u c14710u = (C14710u) abstractC14694e;
        boolean z4 = true;
        if (i13 != 1) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            if ((getLayoutDirection() != 1 || ((C14710u) abstractC14694e).f54395i != 2) && (getLayoutDirection() != 0 || i13 != 3)) {
                z4 = false;
            }
        }
        c14710u.f54396j = z4;
        invalidate();
    }

    @Override // fr.AbstractC14693d
    public void setTrackCornerRadius(int i13) {
        super.setTrackCornerRadius(i13);
        ((C14710u) this.f54308w).mo42130a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i13) {
        AbstractC14694e abstractC14694e = this.f54308w;
        if (((C14710u) abstractC14694e).f54397k != i13) {
            ((C14710u) abstractC14694e).f54397k = Math.min(i13, ((C14710u) abstractC14694e).f54312a);
            ((C14710u) abstractC14694e).mo42130a();
            invalidate();
        }
    }
}
