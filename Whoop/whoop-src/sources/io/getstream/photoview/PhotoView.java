package io.getstream.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import c23.InterfaceC3897c;
import c23.InterfaceC3898d;
import c23.InterfaceC3899e;
import c23.InterfaceC3900f;
import c23.InterfaceC3901g;
import c23.InterfaceC3902h;
import c23.InterfaceC3903i;
import c23.ViewOnTouchListenerC3909o;
import p088dc.AbstractC11894a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u000105¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020\u0017¢\u0006\u0004\b9\u0010\u001aJ\u0017\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\n2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\n2\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010ER$\u0010G\u001a\u00020$2\u0006\u0010F\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010'R\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010N\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\"R$\u0010R\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010P\"\u0004\bT\u0010\"R$\u0010U\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010P\"\u0004\bW\u0010\"R$\u0010X\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010P\"\u0004\bZ\u0010\"¨\u0006["}, m65681d2 = {"Lio/getstream/photoview/PhotoView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/widget/ImageView$ScaleType;", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "Landroid/graphics/Matrix;", "getImageMatrix", "()Landroid/graphics/Matrix;", "Landroid/view/View$OnLongClickListener;", "l", "Ll83/a0;", "setOnLongClickListener", "(Landroid/view/View$OnLongClickListener;)V", "Landroid/view/View$OnClickListener;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "scaleType", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "resId", "setImageResource", "(I)V", "Landroid/net/Uri;", "uri", "setImageURI", "(Landroid/net/Uri;)V", "", "rotationDegree", "setRotationTo", "(F)V", "setRotationBy", "", "allow", "setAllowParentInterceptOnEdge", "(Z)V", "Lc23/c;", "listener", "setOnMatrixChangeListener", "(Lc23/c;)V", "Lc23/e;", "setOnPhotoTapListener", "(Lc23/e;)V", "Lc23/d;", "setOnOutsidePhotoTapListener", "(Lc23/d;)V", "Lc23/i;", "setOnViewTapListener", "(Lc23/i;)V", "Lc23/h;", "setOnViewDragListener", "(Lc23/h;)V", "milliseconds", "setZoomTransitionDuration", "Landroid/view/GestureDetector$OnDoubleTapListener;", "onDoubleTapListener", "setOnDoubleTapListener", "(Landroid/view/GestureDetector$OnDoubleTapListener;)V", "Lc23/f;", "onScaleChangedListener", "setOnScaleChangeListener", "(Lc23/f;)V", "Lc23/g;", "onSingleFlingListener", "setOnSingleFlingListener", "(Lc23/g;)V", "zoomable", "isZoomable", "()Z", "setZoomable", "Landroid/graphics/RectF;", "getDisplayRect", "()Landroid/graphics/RectF;", "displayRect", "minimumScale", "getMinimumScale", "()F", "setMinimumScale", "mediumScale", "getMediumScale", "setMediumScale", "maximumScale", "getMaximumScale", "setMaximumScale", "scale", "getScale", "setScale", "photoview_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: w */
    public final ViewOnTouchListenerC3909o f74900w;

    /* JADX INFO: renamed from: x */
    public ImageView.ScaleType f74901x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        AbstractC22676k.m65750j(context, "context");
    }

    public final RectF getDisplayRect() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        viewOnTouchListenerC3909o.m11891b();
        Matrix matrixM11892c = viewOnTouchListenerC3909o.m11892c();
        RectF rectF = viewOnTouchListenerC3909o.f15976N;
        Drawable drawable = viewOnTouchListenerC3909o.f15987w.getDrawable();
        if (drawable == null) {
            return null;
        }
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrixM11892c.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            return viewOnTouchListenerC3909o.f15974L;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final float getMaximumScale() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            return viewOnTouchListenerC3909o.f15968F;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final float getMediumScale() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            return viewOnTouchListenerC3909o.f15967E;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final float getMinimumScale() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            return viewOnTouchListenerC3909o.f15990z;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final float getScale() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            return viewOnTouchListenerC3909o.m11893d();
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            return viewOnTouchListenerC3909o.f15985W;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setAllowParentInterceptOnEdge(boolean allow) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.f15969G = allow;
        } else {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i13, int i14, int i15, int i16) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o;
        boolean frame = super.setFrame(i13, i14, i15, i16);
        if (!frame || (viewOnTouchListenerC3909o = this.f74900w) == null) {
            return frame;
        }
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.m11895f();
            return frame;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            if (viewOnTouchListenerC3909o != null) {
                viewOnTouchListenerC3909o.m11895f();
            } else {
                AbstractC22676k.m65757q("attacher");
                throw null;
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            if (viewOnTouchListenerC3909o != null) {
                viewOnTouchListenerC3909o.m11895f();
            } else {
                AbstractC22676k.m65757q("attacher");
                throw null;
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            if (viewOnTouchListenerC3909o != null) {
                viewOnTouchListenerC3909o.m11895f();
            } else {
                AbstractC22676k.m65757q("attacher");
                throw null;
            }
        }
    }

    public final void setMaximumScale(float f13) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        AbstractC11894a.m31964m(viewOnTouchListenerC3909o.f15990z, viewOnTouchListenerC3909o.f15967E, f13);
        viewOnTouchListenerC3909o.f15968F = f13;
    }

    public final void setMediumScale(float f13) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        AbstractC11894a.m31964m(viewOnTouchListenerC3909o.f15990z, f13, viewOnTouchListenerC3909o.f15968F);
        viewOnTouchListenerC3909o.f15967E = f13;
    }

    public final void setMinimumScale(float f13) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        AbstractC11894a.m31964m(f13, viewOnTouchListenerC3909o.f15967E, viewOnTouchListenerC3909o.f15968F);
        viewOnTouchListenerC3909o.f15990z = f13;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l7) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.f15978P = l7;
        } else {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
    }

    public final void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.f15971I.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener l7) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.f15979Q = l7;
        } else {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
    }

    public final void setOnMatrixChangeListener(InterfaceC3897c listener) {
        if (this.f74900w != null) {
            return;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setOnOutsidePhotoTapListener(InterfaceC3898d listener) {
        if (this.f74900w != null) {
            return;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setOnPhotoTapListener(InterfaceC3899e listener) {
        if (this.f74900w != null) {
            return;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setOnScaleChangeListener(InterfaceC3900f onScaleChangedListener) {
        if (this.f74900w != null) {
            return;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setOnSingleFlingListener(InterfaceC3901g onSingleFlingListener) {
        if (this.f74900w != null) {
            return;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setOnViewDragListener(InterfaceC3902h listener) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.f15980R = listener;
        } else {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
    }

    public final void setOnViewTapListener(InterfaceC3903i listener) {
        if (this.f74900w != null) {
            return;
        }
        AbstractC22676k.m65757q("attacher");
        throw null;
    }

    public final void setRotationBy(float rotationDegree) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        viewOnTouchListenerC3909o.f15975M.postRotate(rotationDegree % 360);
        viewOnTouchListenerC3909o.m11890a();
    }

    public final void setRotationTo(float rotationDegree) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        viewOnTouchListenerC3909o.f15975M.setRotate(rotationDegree % 360);
        viewOnTouchListenerC3909o.m11890a();
    }

    public final void setScale(float f13) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        PhotoView photoView = viewOnTouchListenerC3909o.f15987w;
        viewOnTouchListenerC3909o.m11894e(f13, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o;
        AbstractC22676k.m65750j(scaleType, "scaleType");
        if (getDrawable() == null || (viewOnTouchListenerC3909o = this.f74900w) == null) {
            this.f74901x = scaleType;
            return;
        }
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        if (scaleType == ImageView.ScaleType.MATRIX) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != viewOnTouchListenerC3909o.f15985W) {
            viewOnTouchListenerC3909o.f15985W = scaleType;
            viewOnTouchListenerC3909o.m11895f();
        }
    }

    public final void setZoomTransitionDuration(int milliseconds) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o != null) {
            viewOnTouchListenerC3909o.f15989y = milliseconds;
        } else {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
    }

    public final void setZoomable(boolean z4) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f74900w;
        if (viewOnTouchListenerC3909o == null) {
            AbstractC22676k.m65757q("attacher");
            throw null;
        }
        viewOnTouchListenerC3909o.f15984V = z4;
        viewOnTouchListenerC3909o.m11895f();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PhotoView(Context context, AttributeSet attributeSet, int i13) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        AbstractC22676k.m65750j(context, "context");
        super(context, attributeSet, 0);
        this.f74900w = new ViewOnTouchListenerC3909o(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f74901x;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f74901x = null;
        }
    }
}
