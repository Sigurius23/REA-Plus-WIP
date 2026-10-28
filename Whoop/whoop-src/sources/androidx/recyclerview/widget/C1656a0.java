package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1656a0 extends AbstractC1760z1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1671d0 f6563a;

    public C1656a0(C1671d0 c1671d0) {
        this.f6563a = c1671d0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1760z1
    public final void onScrolled(RecyclerView recyclerView, int i13, int i14) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C1671d0 c1671d0 = this.f6563a;
        int i15 = c1671d0.f6608a;
        int iComputeVerticalScrollRange = c1671d0.f6626s.computeVerticalScrollRange();
        int i16 = c1671d0.f6625r;
        c1671d0.f6627t = iComputeVerticalScrollRange - i16 > 0 && i16 >= i15;
        int iComputeHorizontalScrollRange = c1671d0.f6626s.computeHorizontalScrollRange();
        int i17 = c1671d0.f6624q;
        boolean z4 = iComputeHorizontalScrollRange - i17 > 0 && i17 >= i15;
        c1671d0.f6628u = z4;
        boolean z13 = c1671d0.f6627t;
        if (!z13 && !z4) {
            if (c1671d0.f6629v != 0) {
                c1671d0.m5226h(0);
                return;
            }
            return;
        }
        if (z13) {
            float f13 = i16;
            c1671d0.f6619l = (int) ((((f13 / 2.0f) + iComputeVerticalScrollOffset) * f13) / iComputeVerticalScrollRange);
            c1671d0.f6618k = Math.min(i16, (i16 * i16) / iComputeVerticalScrollRange);
        }
        if (c1671d0.f6628u) {
            float f14 = iComputeHorizontalScrollOffset;
            float f15 = i17;
            c1671d0.f6622o = (int) ((((f15 / 2.0f) + f14) * f15) / iComputeHorizontalScrollRange);
            c1671d0.f6621n = Math.min(i17, (i17 * i17) / iComputeHorizontalScrollRange);
        }
        int i18 = c1671d0.f6629v;
        if (i18 == 0 || i18 == 1) {
            c1671d0.m5226h(1);
        }
    }
}
