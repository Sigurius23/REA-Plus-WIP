package v41;

import ih0.AbstractC18489d0;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: v41.m0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lv41/m0;", "", "<init>", "()V", "a", "b", "Lv41/m0$a;", "Lv41/m0$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35679m0 {

    /* JADX INFO: renamed from: a */
    public static final int f151643a = 0;

    /* JADX INFO: renamed from: v41.m0$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lv41/m0$a;", "Lv41/m0;", "", "min", "max", "", "maxInclusive", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "a", "d", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC35679m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer min;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer max;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean maxInclusive;

        public a(Integer num, Integer num2, boolean z4) {
            super(null);
            this.min = num;
            this.max = num2;
            this.maxInclusive = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.min, aVar.min) && AbstractC22676k.m65745e(this.max, aVar.max) && this.maxInclusive == aVar.maxInclusive;
        }

        public int hashCode() {
            Integer num = this.min;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.max;
            return Boolean.hashCode(this.maxInclusive) + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public String toString() {
            Integer num = this.min;
            Integer num2 = this.max;
            return AbstractC18489d0.m53372m(AbstractC36095b.m114684l("Frame(min=", num, ", max=", num2, ", maxInclusive="), this.maxInclusive, ")");
        }
    }

    public /* synthetic */ AbstractC35679m0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC35679m0() {
    }

    /* JADX INFO: renamed from: v41.m0$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, m65681d2 = {"Lv41/m0$b;", "Lv41/m0;", "", "min", "max", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "F", "()F", "c", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC35679m0 {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float min;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float max;

        public b(float f13, float f14) {
            super(null);
            this.min = f13;
            this.max = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Float.compare(this.min, bVar.min) == 0 && Float.compare(this.max, bVar.max) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.max) + (Float.hashCode(this.min) * 31);
        }

        public String toString() {
            return AbstractC31061c.m95638n("Progress(min=", this.min, ", max=", this.max, ")");
        }

        public /* synthetic */ b(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 1.0f : f14);
        }
    }
}
