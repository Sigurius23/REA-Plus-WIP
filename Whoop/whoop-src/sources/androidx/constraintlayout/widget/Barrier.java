package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import p319m4.C25013b;
import p319m4.C25016e;

/* JADX INFO: loaded from: classes5.dex */
public class Barrier extends AbstractC1139b {

    /* JADX INFO: renamed from: H */
    public int f4993H;

    /* JADX INFO: renamed from: I */
    public int f4994I;

    /* JADX INFO: renamed from: J */
    public C25013b f4995J;

    public Barrier(Context context) {
        super(context);
        this.f5007w = new int[32];
        this.f5006G = new HashMap();
        this.f5009y = context;
        mo3606h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f4995J.f97852u0;
    }

    public int getMargin() {
        return this.f4995J.f97853v0;
    }

    public int getType() {
        return this.f4993H;
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: h */
    public final void mo3606h(AttributeSet attributeSet) {
        super.mo3606h(attributeSet);
        this.f4995J = new C25013b();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1156s.f5224b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i13 = 0; i13 < indexCount; i13++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i13);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f4995J.f97852u0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f4995J.f97853v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5010z = this.f4995J;
        m3621k();
    }

    @Override // androidx.constraintlayout.widget.AbstractC1139b
    /* JADX INFO: renamed from: i */
    public final void mo3607i(C25016e c25016e, boolean z4) {
        int i13 = this.f4993H;
        this.f4994I = i13;
        if (z4) {
            if (i13 == 5) {
                this.f4994I = 1;
            } else if (i13 == 6) {
                this.f4994I = 0;
            }
        } else if (i13 == 5) {
            this.f4994I = 0;
        } else if (i13 == 6) {
            this.f4994I = 1;
        }
        if (c25016e instanceof C25013b) {
            ((C25013b) c25016e).f97851t0 = this.f4994I;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f4995J.f97852u0 = z4;
    }

    public void setDpMargin(int i13) {
        this.f4995J.f97853v0 = (int) ((i13 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i13) {
        this.f4995J.f97853v0 = i13;
    }

    public void setType(int i13) {
        this.f4993H = i13;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
