package gr;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import cr.AbstractC11075m;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;
import p474s.C32024x;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: gr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16085a extends C32024x {

    /* JADX INFO: renamed from: G */
    public static final int[][] f60871G = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: E */
    public ColorStateList f60872E;

    /* JADX INFO: renamed from: F */
    public boolean f60873F;

    public C16085a(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, com.whoop.android.R.attr.radioButtonStyle, com.whoop.android.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayM29873g = AbstractC11075m.m29873g(context2, attributeSet, AbstractC21885a.f84566z, com.whoop.android.R.attr.radioButtonStyle, com.whoop.android.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM29873g.hasValue(0)) {
            setButtonTintList(AbstractC22674j.m65695C(typedArrayM29873g, context2, 0));
        }
        this.f60873F = typedArrayM29873g.getBoolean(1, false);
        typedArrayM29873g.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f60872E == null) {
            int iM96969u = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorControlActivated);
            int iM96969u2 = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorOnSurface);
            int iM96969u3 = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorSurface);
            this.f60872E = new ColorStateList(f60871G, new int[]{AbstractC31484o.m96972x(1.0f, iM96969u3, iM96969u), AbstractC31484o.m96972x(0.54f, iM96969u3, iM96969u2), AbstractC31484o.m96972x(0.38f, iM96969u3, iM96969u2), AbstractC31484o.m96972x(0.38f, iM96969u3, iM96969u2)});
        }
        return this.f60872E;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f60873F && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f60873F = z4;
        if (z4) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
