package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p474s.AbstractC31967i2;
import p474s.AbstractC31971j2;
import p474s.C31975k2;
import p474s.C31980m;
import p474s.C32008t;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final C31980m mBackgroundTintHelper;
    private boolean mHasLevel;
    private final C32008t mImageHelper;

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null) {
            c32008t.m99559a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C31975k2 c31975k2;
        C32008t c32008t = this.mImageHelper;
        if (c32008t == null || (c31975k2 = c32008t.f132824b) == null) {
            return null;
        }
        return c31975k2.f132743a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C31975k2 c31975k2;
        C32008t c32008t = this.mImageHelper;
        if (c32008t == null || (c31975k2 = c32008t.f132824b) == null) {
            return null;
        }
        return c31975k2.f132744b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f132823a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null) {
            c32008t.m99559a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null && drawable != null && !this.mHasLevel) {
            c32008t.f132825c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        C32008t c32008t2 = this.mImageHelper;
        if (c32008t2 != null) {
            c32008t2.m99559a();
            if (this.mHasLevel) {
                return;
            }
            C32008t c32008t3 = this.mImageHelper;
            ImageView imageView = c32008t3.f132823a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c32008t3.f132825c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i13) {
        super.setImageLevel(i13);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null) {
            c32008t.m99561c(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null) {
            c32008t.m99559a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.mBackgroundTintHelper;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null) {
            if (c32008t.f132824b == null) {
                c32008t.f132824b = new C31975k2();
            }
            C31975k2 c31975k2 = c32008t.f132824b;
            c31975k2.f132743a = colorStateList;
            c31975k2.f132746d = true;
            c32008t.m99559a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C32008t c32008t = this.mImageHelper;
        if (c32008t != null) {
            if (c32008t.f132824b == null) {
                c32008t.f132824b = new C31975k2();
            }
            C31975k2 c31975k2 = c32008t.f132824b;
            c31975k2.f132744b = mode;
            c31975k2.f132745c = true;
            c32008t.m99559a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC31971j2.m99463a(context);
        this.mHasLevel = false;
        AbstractC31967i2.m99459a(getContext(), this);
        C31980m c31980m = new C31980m(this);
        this.mBackgroundTintHelper = c31980m;
        c31980m.m99471d(attributeSet, i13);
        C32008t c32008t = new C32008t(this);
        this.mImageHelper = c32008t;
        c32008t.m99560b(attributeSet, i13);
    }
}
