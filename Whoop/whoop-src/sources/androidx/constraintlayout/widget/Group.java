package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes5.dex */
public class Group extends AbstractC1139b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: f */
    public final void mo3611f(ConstraintLayout constraintLayout) {
        m3619e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: j */
    public final void mo3612j() {
        C1141d c1141d = (C1141d) getLayoutParams();
        c1141d.f5069p0.m73429S(0);
        c1141d.f5069p0.m73424N(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3618d();
    }

    @Override // android.view.View
    public void setElevation(float f13) {
        super.setElevation(f13);
        m3618d();
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        m3618d();
    }
}
