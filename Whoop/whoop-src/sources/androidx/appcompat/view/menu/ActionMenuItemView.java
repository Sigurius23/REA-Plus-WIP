package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import p290l.AbstractC22932a;
import p444r.AbstractC30807c;
import p444r.C30805b;
import p444r.C30820n;
import p444r.InterfaceC30817k;
import p444r.InterfaceC30831y;
import p444r.MenuC30818l;
import p474s.AbstractC32015u2;
import p474s.InterfaceC31964i;

/* JADX INFO: loaded from: classes5.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC30831y, View.OnClickListener, InterfaceC31964i {

    /* JADX INFO: renamed from: E */
    public C30805b f4219E;

    /* JADX INFO: renamed from: F */
    public AbstractC30807c f4220F;

    /* JADX INFO: renamed from: G */
    public boolean f4221G;

    /* JADX INFO: renamed from: H */
    public boolean f4222H;

    /* JADX INFO: renamed from: I */
    public final int f4223I;

    /* JADX INFO: renamed from: J */
    public int f4224J;

    /* JADX INFO: renamed from: K */
    public final int f4225K;

    /* JADX INFO: renamed from: w */
    public C30820n f4226w;

    /* JADX INFO: renamed from: x */
    public CharSequence f4227x;

    /* JADX INFO: renamed from: y */
    public Drawable f4228y;

    /* JADX INFO: renamed from: z */
    public InterfaceC30817k f4229z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f4221G = m3253d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90510c, 0, 0);
        this.f4223I = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4225K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4224J = -1;
        setSaveEnabled(false);
    }

    @Override // p474s.InterfaceC31964i
    /* JADX INFO: renamed from: a */
    public final boolean mo3250a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p474s.InterfaceC31964i
    /* JADX INFO: renamed from: b */
    public final boolean mo3251b() {
        return !TextUtils.isEmpty(getText()) && this.f4226w.getIcon() == null;
    }

    @Override // p444r.InterfaceC30831y
    /* JADX INFO: renamed from: c */
    public final void mo3252c(C30820n c30820n) {
        this.f4226w = c30820n;
        setIcon(c30820n.getIcon());
        setTitle(c30820n.getTitleCondensed());
        setId(c30820n.f127086b);
        setVisibility(c30820n.isVisible() ? 0 : 8);
        setEnabled(c30820n.isEnabled());
        if (c30820n.hasSubMenu() && this.f4219E == null) {
            this.f4219E = new C30805b(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3253d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i13 = configuration.screenWidthDp;
        int i14 = configuration.screenHeightDp;
        if (i13 < 480) {
            return (i13 >= 640 && i14 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m3254e() {
        boolean z4 = true;
        boolean z13 = !TextUtils.isEmpty(this.f4227x);
        if (this.f4228y != null && ((this.f4226w.f127110z & 4) != 4 || (!this.f4221G && !this.f4222H))) {
            z4 = false;
        }
        boolean z14 = z13 & z4;
        setText(z14 ? this.f4227x : null);
        CharSequence charSequence = this.f4226w.f127102r;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z14 ? null : this.f4226w.f127090f);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f4226w.f127103s;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC32015u2.m99566a(this, z14 ? null : this.f4226w.f127090f);
        } else {
            AbstractC32015u2.m99566a(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p444r.InterfaceC30831y
    public C30820n getItemData() {
        return this.f4226w;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC30817k interfaceC30817k = this.f4229z;
        if (interfaceC30817k != null) {
            interfaceC30817k.mo3255a(this.f4226w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4221G = m3253d();
        m3254e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i15 = this.f4224J) >= 0) {
            super.setPadding(i15, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i13, i14);
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int measuredWidth = getMeasuredWidth();
        int i16 = this.f4223I;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i16) : i16;
        if (mode != 1073741824 && i16 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i14);
        }
        if (!zIsEmpty || this.f4228y == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4228y.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C30805b c30805b;
        if (this.f4226w.hasSubMenu() && (c30805b = this.f4219E) != null && c30805b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z4) {
    }

    public void setChecked(boolean z4) {
    }

    public void setExpandedFormat(boolean z4) {
        if (this.f4222H != z4) {
            this.f4222H = z4;
            C30820n c30820n = this.f4226w;
            if (c30820n != null) {
                MenuC30818l menuC30818l = c30820n.f127099o;
                menuC30818l.f127065l = true;
                menuC30818l.m94820q(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4228y = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i13 = this.f4225K;
            if (intrinsicWidth > i13) {
                intrinsicHeight = (int) (intrinsicHeight * (i13 / intrinsicWidth));
                intrinsicWidth = i13;
            }
            if (intrinsicHeight > i13) {
                intrinsicWidth = (int) (intrinsicWidth * (i13 / intrinsicHeight));
            } else {
                i13 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i13);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3254e();
    }

    public void setItemInvoker(InterfaceC30817k interfaceC30817k) {
        this.f4229z = interfaceC30817k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i13, int i14, int i15, int i16) {
        this.f4224J = i13;
        super.setPadding(i13, i14, i15, i16);
    }

    public void setPopupCallback(AbstractC30807c abstractC30807c) {
        this.f4220F = abstractC30807c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4227x = charSequence;
        m3254e();
    }
}
