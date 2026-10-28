package lj2;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lj2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Llj2/d;", "", "<init>", "()V", "a", "Llj2/d$a;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24478d {

    /* JADX INFO: renamed from: lj2.d$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0018"}, m65681d2 = {"Llj2/d$a;", "Llj2/d;", "", "hasDisclaimer", "", "selectedSpeed", "selectedCycle", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC24478d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean hasDisclaimer;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedSpeed;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String selectedCycle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, String selectedSpeed, String selectedCycle) {
            super(null);
            AbstractC22676k.m65750j(selectedSpeed, "selectedSpeed");
            AbstractC22676k.m65750j(selectedCycle, "selectedCycle");
            this.hasDisclaimer = z4;
            this.selectedSpeed = selectedSpeed;
            this.selectedCycle = selectedCycle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasDisclaimer() {
            return this.hasDisclaimer;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSelectedCycle() {
            return this.selectedCycle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSelectedSpeed() {
            return this.selectedSpeed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.hasDisclaimer == aVar.hasDisclaimer && AbstractC22676k.m65745e(this.selectedSpeed, aVar.selectedSpeed) && AbstractC22676k.m65745e(this.selectedCycle, aVar.selectedCycle);
        }

        public int hashCode() {
            return this.selectedCycle.hashCode() + AbstractC11266d.m30450d(Boolean.hashCode(this.hasDisclaimer) * 31, 31, this.selectedSpeed);
        }

        public String toString() {
            boolean z4 = this.hasDisclaimer;
            return AbstractC25012a.m73376i(this.selectedCycle, ")", AbstractC13673n.m38567n("StartSession(hasDisclaimer=", ", selectedSpeed=", this.selectedSpeed, ", selectedCycle=", z4));
        }
    }

    public /* synthetic */ AbstractC24478d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24478d() {
    }
}
