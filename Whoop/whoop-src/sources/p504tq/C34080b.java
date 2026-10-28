package p504tq;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import ar.C1913a;
import ar.C1916d;
import cc.AbstractC4398e;
import cc.C4395b;
import cc.C4397d;
import cc.C4399f;
import com.whoop.android.R;
import cr.AbstractC11075m;
import fr.C14692c;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC11266d;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;
import p474s.C31983m2;
import p513u4.AbstractC34523k;
import p715kotlin.jvm.internal.AbstractC22674j;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: tq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34080b extends AppCompatCheckBox {

    /* JADX INFO: renamed from: b0 */
    public static final int[] f142917b0 = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: c0 */
    public static final int[] f142918c0 = {R.attr.state_error};

    /* JADX INFO: renamed from: d0 */
    public static final int[][] f142919d0 = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: e0 */
    public static final int f142920e0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: E */
    public final LinkedHashSet f142921E;

    /* JADX INFO: renamed from: F */
    public final LinkedHashSet f142922F;

    /* JADX INFO: renamed from: G */
    public ColorStateList f142923G;

    /* JADX INFO: renamed from: H */
    public boolean f142924H;

    /* JADX INFO: renamed from: I */
    public boolean f142925I;

    /* JADX INFO: renamed from: J */
    public boolean f142926J;

    /* JADX INFO: renamed from: K */
    public CharSequence f142927K;

    /* JADX INFO: renamed from: L */
    public Drawable f142928L;

    /* JADX INFO: renamed from: M */
    public Drawable f142929M;

    /* JADX INFO: renamed from: N */
    public boolean f142930N;

    /* JADX INFO: renamed from: O */
    public ColorStateList f142931O;

    /* JADX INFO: renamed from: P */
    public ColorStateList f142932P;

    /* JADX INFO: renamed from: Q */
    public PorterDuff.Mode f142933Q;

    /* JADX INFO: renamed from: R */
    public int f142934R;

    /* JADX INFO: renamed from: S */
    public int[] f142935S;

    /* JADX INFO: renamed from: T */
    public boolean f142936T;

    /* JADX INFO: renamed from: U */
    public CharSequence f142937U;

    /* JADX INFO: renamed from: V */
    public CompoundButton.OnCheckedChangeListener f142938V;

    /* JADX INFO: renamed from: W */
    public final C4399f f142939W;

    /* JADX INFO: renamed from: a0 */
    public final C14692c f142940a0;

    public C34080b(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f142921E = new LinkedHashSet();
        this.f142922F = new LinkedHashSet();
        Context context2 = getContext();
        C4399f c4399f = new C4399f(context2, 0);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC34523k.f145117a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        drawable.setCallback(c4399f.f17751F);
        new C1913a(drawable.getConstantState(), 1);
        c4399f.f17755w = drawable;
        this.f142939W = c4399f;
        this.f142940a0 = new C14692c(this, 2);
        Context context3 = getContext();
        this.f142928L = getButtonDrawable();
        this.f142931O = getSuperButtonTintList();
        setSupportButtonTintList(null);
        AbstractC11075m.m29867a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = AbstractC21885a.f84565y;
        AbstractC11075m.m29868b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C31983m2 c31983m2 = new C31983m2(context3, typedArrayObtainStyledAttributes);
        this.f142929M = c31983m2.m99486j(2);
        if (this.f142928L != null && AbstractC20301a.m56324W(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f142920e0 && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f142928L = AbstractC30060g.m92133x(context3, R.drawable.mtrl_checkbox_button);
                this.f142930N = true;
                if (this.f142929M == null) {
                    this.f142929M = AbstractC30060g.m92133x(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f142932P = AbstractC22674j.m65694B(context3, c31983m2, 3);
        this.f142933Q = AbstractC11075m.m29874h(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f142924H = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f142925I = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f142926J = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.f142927K = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        c31983m2.m99491r();
        m107733a();
    }

    private String getButtonStateDescription() {
        int i13 = this.f142934R;
        if (i13 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i13 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f142923G == null) {
            int iM96969u = AbstractC31484o.m96969u(this, R.attr.colorControlActivated);
            int iM96969u2 = AbstractC31484o.m96969u(this, R.attr.colorError);
            int iM96969u3 = AbstractC31484o.m96969u(this, R.attr.colorSurface);
            int iM96969u4 = AbstractC31484o.m96969u(this, R.attr.colorOnSurface);
            this.f142923G = new ColorStateList(f142919d0, new int[]{AbstractC31484o.m96972x(1.0f, iM96969u3, iM96969u2), AbstractC31484o.m96972x(1.0f, iM96969u3, iM96969u), AbstractC31484o.m96972x(0.54f, iM96969u3, iM96969u4), AbstractC31484o.m96972x(0.38f, iM96969u3, iM96969u4), AbstractC31484o.m96972x(0.38f, iM96969u3, iM96969u4)});
        }
        return this.f142923G;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f142931O;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: a */
    public final void m107733a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1916d c1916d;
        Drawable drawableMutate = this.f142928L;
        ColorStateList colorStateList3 = this.f142931O;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (buttonTintMode != null) {
                drawableMutate.setTintMode(buttonTintMode);
            }
        }
        this.f142928L = drawableMutate;
        Drawable drawableMutate2 = this.f142929M;
        ColorStateList colorStateList4 = this.f142932P;
        PorterDuff.Mode mode = this.f142933Q;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
        }
        this.f142929M = drawableMutate2;
        if (this.f142930N) {
            C4399f c4399f = this.f142939W;
            if (c4399f != null) {
                C4397d c4397d = c4399f.f17752x;
                C14692c c14692c = this.f142940a0;
                if (c14692c != null) {
                    Drawable drawable = c4399f.f17755w;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (c14692c.f54298a == null) {
                            c14692c.f54298a = new C4395b(c14692c);
                        }
                        AbstractC4398e.m13818c(animatedVectorDrawable, c14692c.f54298a);
                    }
                    ArrayList arrayList = c4399f.f17750E;
                    if (arrayList != null) {
                        arrayList.remove(c14692c);
                        if (c4399f.f17750E.size() == 0 && (c1916d = c4399f.f17754z) != null) {
                            c4397d.f17747b.removeListener(c1916d);
                            c4399f.f17754z = null;
                        }
                    }
                }
                if (c14692c != null) {
                    Drawable drawable2 = c4399f.f17755w;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        if (c14692c.f54298a == null) {
                            c14692c.f54298a = new C4395b(c14692c);
                        }
                        AbstractC4398e.m13817b(animatedVectorDrawable2, c14692c.f54298a);
                    } else {
                        if (c4399f.f17750E == null) {
                            c4399f.f17750E = new ArrayList();
                        }
                        if (!c4399f.f17750E.contains(c14692c)) {
                            c4399f.f17750E.add(c14692c);
                            if (c4399f.f17754z == null) {
                                c4399f.f17754z = new C1916d(c4399f, 2);
                            }
                            c4397d.f17747b.addListener(c4399f.f17754z);
                        }
                    }
                }
            }
            Drawable drawable3 = this.f142928L;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c4399f != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c4399f, false);
                ((AnimatedStateListDrawable) this.f142928L).addTransition(R.id.indeterminate, R.id.unchecked, c4399f, false);
            }
        }
        Drawable drawable4 = this.f142928L;
        if (drawable4 != null && (colorStateList2 = this.f142931O) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f142929M;
        if (drawable5 != null && (colorStateList = this.f142932P) != null) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f142928L;
        Drawable drawable7 = this.f142929M;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f13 = intrinsicWidth / intrinsicHeight;
                if (f13 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f13);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f13 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f142928L;
    }

    public Drawable getButtonIconDrawable() {
        return this.f142929M;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f142932P;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f142933Q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f142931O;
    }

    public int getCheckedState() {
        return this.f142934R;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f142927K;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f142934R == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f142924H && this.f142931O == null && this.f142932P == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i13 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f142917b0);
        }
        if (this.f142926J) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f142918c0);
        }
        for (int i14 = 0; i14 < iArrOnCreateDrawableState.length; i14++) {
            int i15 = iArrOnCreateDrawableState[i14];
            if (i15 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i15 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i14] = 16842912;
            }
            this.f142935S = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f142935S = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f142925I || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (AbstractC11075m.m29872f(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f142926J) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f142927K));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C34079a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C34079a c34079a = (C34079a) parcelable;
        super.onRestoreInstanceState(c34079a.getSuperState());
        setCheckedState(c34079a.f142916w);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C34079a c34079a = new C34079a(super.onSaveInstanceState());
        c34079a.f142916w = getCheckedState();
        return c34079a;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i13) {
        setButtonDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f142929M = drawable;
        m107733a();
    }

    public void setButtonIconDrawableResource(int i13) {
        setButtonIconDrawable(AbstractC30060g.m92133x(getContext(), i13));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f142932P == colorStateList) {
            return;
        }
        this.f142932P = colorStateList;
        m107733a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f142933Q == mode) {
            return;
        }
        this.f142933Q = mode;
        m107733a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f142931O == colorStateList) {
            return;
        }
        this.f142931O = colorStateList;
        m107733a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m107733a();
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f142925I = z4;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z4) {
        setCheckedState(z4 ? 1 : 0);
    }

    public void setCheckedState(int i13) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f142934R != i13) {
            this.f142934R = i13;
            super.setChecked(i13 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f142937U == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f142936T) {
                return;
            }
            this.f142936T = true;
            LinkedHashSet linkedHashSet = this.f142922F;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw AbstractC11266d.m30454h(it);
                }
            }
            if (this.f142934R != 2 && (onCheckedChangeListener = this.f142938V) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f142936T = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f142927K = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i13) {
        setErrorAccessibilityLabel(i13 != 0 ? getResources().getText(i13) : null);
    }

    public void setErrorShown(boolean z4) {
        if (this.f142926J == z4) {
            return;
        }
        this.f142926J = z4;
        refreshDrawableState();
        Iterator it = this.f142921E.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f142938V = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f142937U = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f142924H = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f142928L = drawable;
        this.f142930N = false;
        m107733a();
    }
}
