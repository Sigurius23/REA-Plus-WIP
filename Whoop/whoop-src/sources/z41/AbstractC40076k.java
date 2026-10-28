package z41;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: z41.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lz41/k;", "", "<init>", "()V", "a", "b", "Lz41/k$a;", "Lz41/k$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40076k {

    /* JADX INFO: renamed from: z41.k$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lz41/k$a;", "Lz41/k;", "", "x", "y", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC40076k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float y;

        public a(float f13, float f14) {
            super(null);
            this.x = f13;
            this.y = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return Float.compare(this.x, aVar.x) == 0 && Float.compare(this.y, aVar.y) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
        }

        public String toString() {
            return AbstractC31061c.m95638n("Absolute(x=", this.x, ", y=", this.y, ")");
        }
    }

    /* JADX INFO: renamed from: z41.k$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lz41/k$b;", "Lz41/k;", "", "x", "y", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40076k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final double x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final double y;

        public b(double d3, double d14) {
            super(null);
            this.x = d3;
            this.y = d14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final double getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getY() {
            return this.y;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Double.compare(this.x, bVar.x) == 0 && Double.compare(this.y, bVar.y) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.y) + (Double.hashCode(this.x) * 31);
        }

        public String toString() {
            return AbstractC30007c.m91836f(this.y, ")", AbstractC2875y.m8306s("Relative(x=", this.x, ", y="));
        }
    }

    public /* synthetic */ AbstractC40076k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40076k() {
    }
}
