package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import cr.AbstractC11075m;
import java.util.WeakHashMap;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p435qr.AbstractC30554a;
import p463rj.AbstractC31484o;
import p657yq.C39707a;

/* JADX INFO: loaded from: classes6.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: A0 */
    public static final int[][] f21047A0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: w0 */
    public final C39707a f21048w0;

    /* JADX INFO: renamed from: x0 */
    public ColorStateList f21049x0;

    /* JADX INFO: renamed from: y0 */
    public ColorStateList f21050y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f21051z0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(AbstractC30554a.m93706a(context, attributeSet, com.whoop.android.R.attr.switchStyle, com.whoop.android.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.f21048w0 = new C39707a(context2);
        AbstractC11075m.m29867a(context2, attributeSet, com.whoop.android.R.attr.switchStyle, com.whoop.android.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = AbstractC21885a.f84534K;
        AbstractC11075m.m29868b(context2, attributeSet, iArr, com.whoop.android.R.attr.switchStyle, com.whoop.android.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.whoop.android.R.attr.switchStyle, com.whoop.android.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f21051z0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f21049x0 == null) {
            int iM96969u = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorSurface);
            int iM96969u2 = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.whoop.android.R.dimen.mtrl_switch_thumb_elevation);
            C39707a c39707a = this.f21048w0;
            if (c39707a.f170935a) {
                float fM47510e = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    fM47510e += AbstractC16877h0.m47510e((View) parent);
                }
                dimension += fM47510e;
            }
            int iM127046a = c39707a.m127046a(dimension, iM96969u);
            this.f21049x0 = new ColorStateList(f21047A0, new int[]{AbstractC31484o.m96972x(1.0f, iM96969u, iM96969u2), iM127046a, AbstractC31484o.m96972x(0.38f, iM96969u, iM96969u2), iM127046a});
        }
        return this.f21049x0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f21050y0 == null) {
            int iM96969u = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorSurface);
            int iM96969u2 = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorControlActivated);
            int iM96969u3 = AbstractC31484o.m96969u(this, com.whoop.android.R.attr.colorOnSurface);
            this.f21050y0 = new ColorStateList(f21047A0, new int[]{AbstractC31484o.m96972x(0.54f, iM96969u, iM96969u2), AbstractC31484o.m96972x(0.32f, iM96969u, iM96969u3), AbstractC31484o.m96972x(0.12f, iM96969u, iM96969u2), AbstractC31484o.m96972x(0.12f, iM96969u, iM96969u3)});
        }
        return this.f21050y0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21051z0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f21051z0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f21051z0 = z4;
        if (z4) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
