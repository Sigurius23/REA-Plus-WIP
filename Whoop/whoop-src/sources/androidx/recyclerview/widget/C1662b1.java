package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1662b1 extends AbstractC1667c1 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1662b1(AbstractC1740u1 abstractC1740u1, int i13) {
        super(abstractC1740u1);
        this.f6581d = i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: b */
    public final int mo5178b(View view) {
        int decoratedRight;
        int i13;
        switch (this.f6581d) {
            case 0:
                C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
                decoratedRight = this.f6588a.getDecoratedRight(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin;
                break;
            default:
                C1744v1 c1744v2 = (C1744v1) view.getLayoutParams();
                decoratedRight = this.f6588a.getDecoratedBottom(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v2).bottomMargin;
                break;
        }
        return decoratedRight + i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: c */
    public final int mo5179c(View view) {
        int decoratedMeasuredWidth;
        int i13;
        switch (this.f6581d) {
            case 0:
                C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f6588a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin;
                i13 = ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin;
                break;
            default:
                C1744v1 c1744v2 = (C1744v1) view.getLayoutParams();
                decoratedMeasuredWidth = this.f6588a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c1744v2).topMargin;
                i13 = ((ViewGroup.MarginLayoutParams) c1744v2).bottomMargin;
                break;
        }
        return decoratedMeasuredWidth + i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: d */
    public final int mo5180d(View view) {
        int decoratedMeasuredHeight;
        int i13;
        switch (this.f6581d) {
            case 0:
                C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f6588a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c1744v1).topMargin;
                i13 = ((ViewGroup.MarginLayoutParams) c1744v1).bottomMargin;
                break;
            default:
                C1744v1 c1744v2 = (C1744v1) view.getLayoutParams();
                decoratedMeasuredHeight = this.f6588a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c1744v2).leftMargin;
                i13 = ((ViewGroup.MarginLayoutParams) c1744v2).rightMargin;
                break;
        }
        return decoratedMeasuredHeight + i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: e */
    public final int mo5181e(View view) {
        int decoratedLeft;
        int i13;
        switch (this.f6581d) {
            case 0:
                C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
                decoratedLeft = this.f6588a.getDecoratedLeft(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin;
                break;
            default:
                C1744v1 c1744v2 = (C1744v1) view.getLayoutParams();
                decoratedLeft = this.f6588a.getDecoratedTop(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v2).topMargin;
                break;
        }
        return decoratedLeft - i13;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: f */
    public final int mo5182f() {
        switch (this.f6581d) {
            case 0:
                return this.f6588a.getWidth();
            default:
                return this.f6588a.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: g */
    public final int mo5183g() {
        int width;
        int paddingRight;
        switch (this.f6581d) {
            case 0:
                AbstractC1740u1 abstractC1740u1 = this.f6588a;
                width = abstractC1740u1.getWidth();
                paddingRight = abstractC1740u1.getPaddingRight();
                break;
            default:
                AbstractC1740u1 abstractC1740u2 = this.f6588a;
                width = abstractC1740u2.getHeight();
                paddingRight = abstractC1740u2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: h */
    public final int mo5184h() {
        switch (this.f6581d) {
            case 0:
                return this.f6588a.getPaddingRight();
            default:
                return this.f6588a.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: i */
    public final int mo5185i() {
        switch (this.f6581d) {
            case 0:
                return this.f6588a.getWidthMode();
            default:
                return this.f6588a.getHeightMode();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: j */
    public final int mo5186j() {
        switch (this.f6581d) {
            case 0:
                return this.f6588a.getHeightMode();
            default:
                return this.f6588a.getWidthMode();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: k */
    public final int mo5187k() {
        switch (this.f6581d) {
            case 0:
                return this.f6588a.getPaddingLeft();
            default:
                return this.f6588a.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: l */
    public final int mo5188l() {
        int width;
        int paddingRight;
        switch (this.f6581d) {
            case 0:
                AbstractC1740u1 abstractC1740u1 = this.f6588a;
                width = abstractC1740u1.getWidth() - abstractC1740u1.getPaddingLeft();
                paddingRight = abstractC1740u1.getPaddingRight();
                break;
            default:
                AbstractC1740u1 abstractC1740u2 = this.f6588a;
                width = abstractC1740u2.getHeight() - abstractC1740u2.getPaddingTop();
                paddingRight = abstractC1740u2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: m */
    public final int mo5189m(View view) {
        switch (this.f6581d) {
            case 0:
                AbstractC1740u1 abstractC1740u1 = this.f6588a;
                Rect rect = this.f6590c;
                abstractC1740u1.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                AbstractC1740u1 abstractC1740u2 = this.f6588a;
                Rect rect2 = this.f6590c;
                abstractC1740u2.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: n */
    public final int mo5190n(View view) {
        switch (this.f6581d) {
            case 0:
                AbstractC1740u1 abstractC1740u1 = this.f6588a;
                Rect rect = this.f6590c;
                abstractC1740u1.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                AbstractC1740u1 abstractC1740u2 = this.f6588a;
                Rect rect2 = this.f6590c;
                abstractC1740u2.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1667c1
    /* JADX INFO: renamed from: o */
    public final void mo5191o(int i13) {
        switch (this.f6581d) {
            case 0:
                this.f6588a.offsetChildrenHorizontal(i13);
                break;
            default:
                this.f6588a.offsetChildrenVertical(i13);
                break;
        }
    }
}
