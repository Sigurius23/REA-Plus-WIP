package p487sq;

import com.google.android.material.carousel.CarouselLayoutManager;
import p010a9.AbstractC0576a;

/* JADX INFO: renamed from: sq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32879b extends AbstractC0576a {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f137026y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ CarouselLayoutManager f137027z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32879b(CarouselLayoutManager carouselLayoutManager, int i13) {
        super(1, 2);
        this.f137026y = i13;
        switch (i13) {
            case 1:
                this.f137027z = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.f137027z = carouselLayoutManager;
                break;
        }
    }

    @Override // p010a9.AbstractC0576a
    /* JADX INFO: renamed from: g */
    public final int mo1497g() {
        switch (this.f137026y) {
            case 0:
                return this.f137027z.getHeight();
            default:
                CarouselLayoutManager carouselLayoutManager = this.f137027z;
                return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
        }
    }

    @Override // p010a9.AbstractC0576a
    /* JADX INFO: renamed from: i */
    public final int mo1498i() {
        switch (this.f137026y) {
            case 0:
                return this.f137027z.getPaddingLeft();
            default:
                return 0;
        }
    }

    @Override // p010a9.AbstractC0576a
    /* JADX INFO: renamed from: k */
    public final int mo1499k() {
        switch (this.f137026y) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f137027z;
                return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
            default:
                return this.f137027z.getWidth();
        }
    }

    @Override // p010a9.AbstractC0576a
    /* JADX INFO: renamed from: l */
    public final int mo1500l() {
        switch (this.f137026y) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f137027z;
                if (carouselLayoutManager.m15727e()) {
                    return carouselLayoutManager.getWidth();
                }
                return 0;
        }
    }

    @Override // p010a9.AbstractC0576a
    /* JADX INFO: renamed from: m */
    public final int mo1501m() {
        switch (this.f137026y) {
            case 0:
                return 0;
            default:
                return this.f137027z.getPaddingTop();
        }
    }
}
