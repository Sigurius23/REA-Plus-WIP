package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p319m4.AbstractC25023l;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1158u extends AbstractC1139b {

    /* JADX INFO: renamed from: H */
    public boolean f5233H;

    /* JADX INFO: renamed from: I */
    public boolean f5234I;

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: f */
    public final void mo3611f(ConstraintLayout constraintLayout) {
        m3619e(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: h */
    public void mo3606h(AttributeSet attributeSet) {
        super.mo3606h(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1156s.f5224b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == 6) {
                    this.f5233H = true;
                } else if (index == 22) {
                    this.f5234I = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo3608l(AbstractC25023l abstractC25023l, int i13, int i14);

    @Override // androidx.constraintlayout.widget.AbstractC1139b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5233H || this.f5234I) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i13 = 0; i13 < this.f5008x; i13++) {
                    View viewById = constraintLayout.getViewById(this.f5007w[i13]);
                    if (viewById != null) {
                        if (this.f5233H) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f5234I && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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
