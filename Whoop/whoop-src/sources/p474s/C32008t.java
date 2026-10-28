package p474s;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;
import q83.AbstractC30060g;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: s.t */
/* JADX INFO: loaded from: classes.dex */
public final class C32008t {

    /* JADX INFO: renamed from: a */
    public final ImageView f132823a;

    /* JADX INFO: renamed from: b */
    public C31975k2 f132824b;

    /* JADX INFO: renamed from: c */
    public int f132825c = 0;

    public C32008t(ImageView imageView) {
        this.f132823a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public final void m99559a() {
        C31975k2 c31975k2;
        ImageView imageView = this.f132823a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC31950e1.m99443a(drawable);
        }
        if (drawable == null || (c31975k2 = this.f132824b) == null) {
            return;
        }
        C31992p.m99508e(drawable, c31975k2, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m99560b(AttributeSet attributeSet, int i13) {
        int resourceId;
        ImageView imageView = this.f132823a;
        Context context = imageView.getContext();
        int[] iArr = AbstractC22932a.f90513f;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, i13);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        AbstractC16901p0.m47582m(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, i13);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC30060g.m92133x(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC31950e1.m99443a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC34924m.m110131M(imageView, c31983m2M99479q.m99484h(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC34924m.m110132N(imageView, AbstractC31950e1.m99445c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c31983m2M99479q.m99491r();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m99561c(int i13) {
        ImageView imageView = this.f132823a;
        if (i13 != 0) {
            Drawable drawableM92133x = AbstractC30060g.m92133x(imageView.getContext(), i13);
            if (drawableM92133x != null) {
                AbstractC31950e1.m99443a(drawableM92133x);
            }
            imageView.setImageDrawable(drawableM92133x);
        } else {
            imageView.setImageDrawable(null);
        }
        m99559a();
    }
}
