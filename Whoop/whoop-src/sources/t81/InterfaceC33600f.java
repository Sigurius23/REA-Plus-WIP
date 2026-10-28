package t81;

import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: t81.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lt81/f;", "", "", "a", "()F", "zoomValue", "b", "Lt81/f$a;", "Lt81/f$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC33600f {

    /* JADX INFO: renamed from: t81.f$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lt81/f$a;", "Lt81/f;", "", "zoomValue", "", "zoomingIn", "isDoubleTap", "<init>", "(FZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Z", "()Z", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC33600f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float zoomValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean zoomingIn;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isDoubleTap;

        public a(float f13, boolean z4, boolean z13) {
            this.zoomValue = f13;
            this.zoomingIn = z4;
            this.isDoubleTap = z13;
        }

        @Override // t81.InterfaceC33600f
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getZoomValue() {
            return this.zoomValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getZoomingIn() {
            return this.zoomingIn;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsDoubleTap() {
            return this.isDoubleTap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.zoomValue, aVar.zoomValue) == 0 && this.zoomingIn == aVar.zoomingIn && this.isDoubleTap == aVar.isDoubleTap;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isDoubleTap) + AbstractC2875y.m8289b(Float.hashCode(this.zoomValue) * 31, 31, this.zoomingIn);
        }

        public String toString() {
            float f13 = this.zoomValue;
            boolean z4 = this.zoomingIn;
            boolean z13 = this.isDoubleTap;
            StringBuilder sb4 = new StringBuilder("DiscreteZoom(zoomValue=");
            sb4.append(f13);
            sb4.append(", zoomingIn=");
            sb4.append(z4);
            sb4.append(", isDoubleTap=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }
    }

    /* JADX INFO: renamed from: t81.f$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lt81/f$b;", "Lt81/f;", "", "zoomValue", "", "zoomingIn", "start", "<init>", "(FZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Z", "c", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC33600f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float zoomValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean zoomingIn;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean start;

        public b(float f13, boolean z4, boolean z13) {
            this.zoomValue = f13;
            this.zoomingIn = z4;
            this.start = z13;
        }

        @Override // t81.InterfaceC33600f
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getZoomValue() {
            return this.zoomValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getZoomingIn() {
            return this.zoomingIn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Float.compare(this.zoomValue, bVar.zoomValue) == 0 && this.zoomingIn == bVar.zoomingIn && this.start == bVar.start;
        }

        public int hashCode() {
            return Boolean.hashCode(this.start) + AbstractC2875y.m8289b(Float.hashCode(this.zoomValue) * 31, 31, this.zoomingIn);
        }

        public String toString() {
            float f13 = this.zoomValue;
            boolean z4 = this.zoomingIn;
            boolean z13 = this.start;
            StringBuilder sb4 = new StringBuilder("Pinch(zoomValue=");
            sb4.append(f13);
            sb4.append(", zoomingIn=");
            sb4.append(z4);
            sb4.append(", start=");
            return AbstractC18489d0.m53372m(sb4, z13, ")");
        }
    }

    /* JADX INFO: renamed from: a */
    float getZoomValue();
}
