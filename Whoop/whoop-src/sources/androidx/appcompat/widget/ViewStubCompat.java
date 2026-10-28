package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p290l.AbstractC22932a;
import p474s.InterfaceC32023w2;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: w */
    public int f4442w;

    /* JADX INFO: renamed from: x */
    public int f4443x;

    /* JADX INFO: renamed from: y */
    public WeakReference f4444y;

    /* JADX INFO: renamed from: z */
    public LayoutInflater f4445z;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4442w = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC22932a.f90507A, 0, 0);
        this.f4443x = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f4442w = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: a */
    public final View m3332a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f4442w == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f4445z;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f4442w, viewGroup, false);
        int i13 = this.f4443x;
        if (i13 != -1) {
            viewInflate.setId(i13);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f4444y = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4443x;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4445z;
    }

    public int getLayoutResource() {
        return this.f4442w;
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i13) {
        this.f4443x = i13;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4445z = layoutInflater;
    }

    public void setLayoutResource(int i13) {
        this.f4442w = i13;
    }

    public void setOnInflateListener(InterfaceC32023w2 interfaceC32023w2) {
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        WeakReference weakReference = this.f4444y;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i13);
            return;
        }
        super.setVisibility(i13);
        if (i13 == 0 || i13 == 4) {
            m3332a();
        }
    }
}
