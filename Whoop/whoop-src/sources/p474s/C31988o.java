package p474s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import p184h5.AbstractC16901p0;
import p290l.AbstractC22932a;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: s.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C31988o {

    /* JADX INFO: renamed from: a */
    public ColorStateList f132790a = null;

    /* JADX INFO: renamed from: b */
    public PorterDuff.Mode f132791b = null;

    /* JADX INFO: renamed from: c */
    public boolean f132792c = false;

    /* JADX INFO: renamed from: d */
    public boolean f132793d = false;

    /* JADX INFO: renamed from: e */
    public boolean f132794e;

    /* JADX INFO: renamed from: f */
    public final TextView f132795f;

    public /* synthetic */ C31988o(TextView textView) {
        this.f132795f = textView;
    }

    /* JADX INFO: renamed from: a */
    public void m99496a() {
        CompoundButton compoundButton = (CompoundButton) this.f132795f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f132792c || this.f132793d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f132792c) {
                    drawableMutate.setTintList(this.f132790a);
                }
                if (this.f132793d) {
                    drawableMutate.setTintMode(this.f132791b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m99497b() {
        C31984n c31984n = (C31984n) this.f132795f;
        Drawable checkMarkDrawable = c31984n.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f132792c || this.f132793d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f132792c) {
                    drawableMutate.setTintList(this.f132790a);
                }
                if (this.f132793d) {
                    drawableMutate.setTintMode(this.f132791b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c31984n.getDrawableState());
                }
                c31984n.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m99498c(AttributeSet attributeSet, int i13) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f132795f;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC22932a.f90520m;
        C31983m2 c31983m2M99479q = C31983m2.m99479q(context, attributeSet, iArr, i13);
        TypedArray typedArray = (TypedArray) c31983m2M99479q.f132769x;
        AbstractC16901p0.m47582m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c31983m2M99479q.f132769x, i13);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC30060g.m92133x(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC30060g.m92133x(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC30060g.m92133x(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(c31983m2M99479q.m99484h(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC31950e1.m99445c(typedArray.getInt(3, -1), null));
            }
        } finally {
            c31983m2M99479q.m99491r();
        }
    }
}
