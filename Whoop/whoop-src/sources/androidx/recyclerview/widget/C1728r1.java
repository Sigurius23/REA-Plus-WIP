package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.recyclerview.widget.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1728r1 implements InterfaceC1757y2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1740u1 f6837b;

    public /* synthetic */ C1728r1(AbstractC1740u1 abstractC1740u1, int i13) {
        this.f6836a = i13;
        this.f6837b = abstractC1740u1;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1757y2
    /* JADX INFO: renamed from: a */
    public final int mo5316a(View view) {
        int decoratedLeft;
        int i13;
        switch (this.f6836a) {
            case 0:
                C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
                decoratedLeft = this.f6837b.getDecoratedLeft(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v1).leftMargin;
                break;
            default:
                C1744v1 c1744v2 = (C1744v1) view.getLayoutParams();
                decoratedLeft = this.f6837b.getDecoratedTop(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v2).topMargin;
                break;
        }
        return decoratedLeft - i13;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1757y2
    /* JADX INFO: renamed from: b */
    public final int mo5317b() {
        switch (this.f6836a) {
            case 0:
                return this.f6837b.getPaddingLeft();
            default:
                return this.f6837b.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC1757y2
    /* JADX INFO: renamed from: c */
    public final int mo5318c() {
        int width;
        int paddingRight;
        switch (this.f6836a) {
            case 0:
                AbstractC1740u1 abstractC1740u1 = this.f6837b;
                width = abstractC1740u1.getWidth();
                paddingRight = abstractC1740u1.getPaddingRight();
                break;
            default:
                AbstractC1740u1 abstractC1740u2 = this.f6837b;
                width = abstractC1740u2.getHeight();
                paddingRight = abstractC1740u2.getPaddingBottom();
                break;
        }
        return width - paddingRight;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1757y2
    /* JADX INFO: renamed from: d */
    public final View mo5319d(int i13) {
        switch (this.f6836a) {
            case 0:
                break;
        }
        return this.f6837b.getChildAt(i13);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1757y2
    /* JADX INFO: renamed from: e */
    public final int mo5320e(View view) {
        int decoratedRight;
        int i13;
        switch (this.f6836a) {
            case 0:
                C1744v1 c1744v1 = (C1744v1) view.getLayoutParams();
                decoratedRight = this.f6837b.getDecoratedRight(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v1).rightMargin;
                break;
            default:
                C1744v1 c1744v2 = (C1744v1) view.getLayoutParams();
                decoratedRight = this.f6837b.getDecoratedBottom(view);
                i13 = ((ViewGroup.MarginLayoutParams) c1744v2).bottomMargin;
                break;
        }
        return decoratedRight + i13;
    }
}
