package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.whoop.android.R;
import p474s.AbstractC31967i2;
import p474s.AbstractC31971j2;
import p474s.C31975k2;
import p474s.C31980m;
import p474s.C32008t;

/* JADX INFO: loaded from: classes5.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: w */
    public final C31980m f4334w;

    /* JADX INFO: renamed from: x */
    public final C32008t f4335x;

    /* JADX INFO: renamed from: y */
    public boolean f4336y;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            c31980m.m99468a();
        }
        C32008t c32008t = this.f4335x;
        if (c32008t != null) {
            c32008t.m99559a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            return c31980m.m99469b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            return c31980m.m99470c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C31975k2 c31975k2;
        C32008t c32008t = this.f4335x;
        if (c32008t == null || (c31975k2 = c32008t.f132824b) == null) {
            return null;
        }
        return c31975k2.f132743a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C31975k2 c31975k2;
        C32008t c32008t = this.f4335x;
        if (c32008t == null || (c31975k2 = c32008t.f132824b) == null) {
            return null;
        }
        return c31975k2.f132744b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f4335x.f132823a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            c31980m.m99472e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i13) {
        super.setBackgroundResource(i13);
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            c31980m.m99473f(i13);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C32008t c32008t = this.f4335x;
        if (c32008t != null) {
            c32008t.m99559a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C32008t c32008t = this.f4335x;
        if (c32008t != null && drawable != null && !this.f4336y) {
            c32008t.f132825c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c32008t != null) {
            c32008t.m99559a();
            if (this.f4336y) {
                return;
            }
            ImageView imageView = c32008t.f132823a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c32008t.f132825c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i13) {
        super.setImageLevel(i13);
        this.f4336y = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i13) {
        this.f4335x.m99561c(i13);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C32008t c32008t = this.f4335x;
        if (c32008t != null) {
            c32008t.m99559a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            c31980m.m99475h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C31980m c31980m = this.f4334w;
        if (c31980m != null) {
            c31980m.m99476i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C32008t c32008t = this.f4335x;
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
        C32008t c32008t = this.f4335x;
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
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC31971j2.m99463a(context);
        this.f4336y = false;
        AbstractC31967i2.m99459a(getContext(), this);
        C31980m c31980m = new C31980m(this);
        this.f4334w = c31980m;
        c31980m.m99471d(attributeSet, i13);
        C32008t c32008t = new C32008t(this);
        this.f4335x = c32008t;
        c32008t.m99560b(attributeSet, i13);
    }
}
