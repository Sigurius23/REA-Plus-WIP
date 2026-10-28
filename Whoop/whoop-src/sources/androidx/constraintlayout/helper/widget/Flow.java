package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC1156s;
import androidx.constraintlayout.widget.AbstractC1158u;
import p319m4.AbstractC25023l;
import p319m4.C25016e;
import p319m4.C25019h;

/* JADX INFO: loaded from: classes5.dex */
public class Flow extends AbstractC1158u {

    /* JADX INFO: renamed from: J */
    public C25019h f4992J;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1158u, androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: h */
    public final void mo3606h(AttributeSet attributeSet) {
        super.mo3606h(attributeSet);
        this.f4992J = new C25019h();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1156s.f5224b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == 0) {
                    this.f4992J.f98008W0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C25019h c25019h = this.f4992J;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c25019h.f98028t0 = dimensionPixelSize;
                    c25019h.f98029u0 = dimensionPixelSize;
                    c25019h.f98030v0 = dimensionPixelSize;
                    c25019h.f98031w0 = dimensionPixelSize;
                } else if (index == 18) {
                    C25019h c25019h2 = this.f4992J;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c25019h2.f98030v0 = dimensionPixelSize2;
                    c25019h2.f98032x0 = dimensionPixelSize2;
                    c25019h2.f98033y0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f4992J.f98031w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4992J.f98032x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4992J.f98028t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4992J.f98033y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4992J.f98029u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f4992J.f98006U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f4992J.f97990E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f4992J.f97991F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f4992J.f97992G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f4992J.f97994I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f4992J.f97993H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f4992J.f97995J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f4992J.f97996K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f4992J.f97998M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f4992J.f98000O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f4992J.f97999N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f4992J.f98001P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f4992J.f97997L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f4992J.f98004S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f4992J.f98005T0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f4992J.f98002Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f4992J.f98003R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f4992J.f98007V0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5010z = this.f4992J;
        m3621k();
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: i */
    public final void mo3607i(C25016e c25016e, boolean z4) {
        C25019h c25019h = this.f4992J;
        int i13 = c25019h.f98030v0;
        if (i13 > 0 || c25019h.f98031w0 > 0) {
            if (z4) {
                c25019h.f98032x0 = c25019h.f98031w0;
                c25019h.f98033y0 = i13;
            } else {
                c25019h.f98032x0 = i13;
                c25019h.f98033y0 = c25019h.f98031w0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC1158u
    /* JADX INFO: renamed from: l */
    public final void mo3608l(AbstractC25023l abstractC25023l, int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (abstractC25023l == null) {
            setMeasuredDimension(0, 0);
        } else {
            abstractC25023l.mo67542Y(mode, size, mode2, size2);
            setMeasuredDimension(abstractC25023l.f98024A0, abstractC25023l.f98025B0);
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b, android.view.View
    public final void onMeasure(int i13, int i14) {
        mo3608l(this.f4992J, i13, i14);
    }

    public void setFirstHorizontalBias(float f13) {
        this.f4992J.f97998M0 = f13;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i13) {
        this.f4992J.f97992G0 = i13;
        requestLayout();
    }

    public void setFirstVerticalBias(float f13) {
        this.f4992J.f97999N0 = f13;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i13) {
        this.f4992J.f97993H0 = i13;
        requestLayout();
    }

    public void setHorizontalAlign(int i13) {
        this.f4992J.f98004S0 = i13;
        requestLayout();
    }

    public void setHorizontalBias(float f13) {
        this.f4992J.f97996K0 = f13;
        requestLayout();
    }

    public void setHorizontalGap(int i13) {
        this.f4992J.f98002Q0 = i13;
        requestLayout();
    }

    public void setHorizontalStyle(int i13) {
        this.f4992J.f97990E0 = i13;
        requestLayout();
    }

    public void setLastHorizontalBias(float f13) {
        this.f4992J.f98000O0 = f13;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i13) {
        this.f4992J.f97994I0 = i13;
        requestLayout();
    }

    public void setLastVerticalBias(float f13) {
        this.f4992J.f98001P0 = f13;
        requestLayout();
    }

    public void setLastVerticalStyle(int i13) {
        this.f4992J.f97995J0 = i13;
        requestLayout();
    }

    public void setMaxElementsWrap(int i13) {
        this.f4992J.f98007V0 = i13;
        requestLayout();
    }

    public void setOrientation(int i13) {
        this.f4992J.f98008W0 = i13;
        requestLayout();
    }

    public void setPadding(int i13) {
        C25019h c25019h = this.f4992J;
        c25019h.f98028t0 = i13;
        c25019h.f98029u0 = i13;
        c25019h.f98030v0 = i13;
        c25019h.f98031w0 = i13;
        requestLayout();
    }

    public void setPaddingBottom(int i13) {
        this.f4992J.f98029u0 = i13;
        requestLayout();
    }

    public void setPaddingLeft(int i13) {
        this.f4992J.f98032x0 = i13;
        requestLayout();
    }

    public void setPaddingRight(int i13) {
        this.f4992J.f98033y0 = i13;
        requestLayout();
    }

    public void setPaddingTop(int i13) {
        this.f4992J.f98028t0 = i13;
        requestLayout();
    }

    public void setVerticalAlign(int i13) {
        this.f4992J.f98005T0 = i13;
        requestLayout();
    }

    public void setVerticalBias(float f13) {
        this.f4992J.f97997L0 = f13;
        requestLayout();
    }

    public void setVerticalGap(int i13) {
        this.f4992J.f98003R0 = i13;
        requestLayout();
    }

    public void setVerticalStyle(int i13) {
        this.f4992J.f97991F0 = i13;
        requestLayout();
    }

    public void setWrapMode(int i13) {
        this.f4992J.f98006U0 = i13;
        requestLayout();
    }
}
