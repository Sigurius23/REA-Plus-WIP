package lj2;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lj2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llj2/e;", "", "<init>", "()V", "a", "b", "Llj2/e$a;", "Llj2/e$b;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24479e {

    /* JADX INFO: renamed from: lj2.e$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/e$a;", "Llj2/e;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC24479e {

        /* JADX INFO: renamed from: a */
        public static final a f95495a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.e$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Llj2/e$b;", "Llj2/e;", "", "selectedSpeed", "selectedCycle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC24479e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedSpeed;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedCycle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String selectedSpeed, String selectedCycle) {
            super(null);
            AbstractC22676k.m65750j(selectedSpeed, "selectedSpeed");
            AbstractC22676k.m65750j(selectedCycle, "selectedCycle");
            this.selectedSpeed = selectedSpeed;
            this.selectedCycle = selectedCycle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSelectedCycle() {
            return this.selectedCycle;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedSpeed() {
            return this.selectedSpeed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.selectedSpeed, bVar.selectedSpeed) && AbstractC22676k.m65745e(this.selectedCycle, bVar.selectedCycle);
        }

        public int hashCode() {
            return this.selectedCycle.hashCode() + (this.selectedSpeed.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("StartSession(selectedSpeed=", this.selectedSpeed, ", selectedCycle=", this.selectedCycle, ")");
        }
    }

    public /* synthetic */ AbstractC24479e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24479e() {
    }
}
