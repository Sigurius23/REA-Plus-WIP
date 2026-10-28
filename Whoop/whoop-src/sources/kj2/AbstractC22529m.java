package kj2;

import com.whoop.stress.domain.BreathingEvent;
import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: kj2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lkj2/m;", "", "<init>", "()V", "b", "d", "a", "c", "Lkj2/m$a;", "Lkj2/m$b;", "Lkj2/m$c;", "Lkj2/m$d;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22529m {

    /* JADX INFO: renamed from: kj2.m$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lkj2/m$a;", "Lkj2/m;", "", "Lcom/whoop/stress/domain/BreathingEvent;", "breathingEvents", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC22529m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<BreathingEvent> breathingEvents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<BreathingEvent> breathingEvents) {
            super(null);
            AbstractC22676k.m65750j(breathingEvents, "breathingEvents");
            this.breathingEvents = breathingEvents;
        }

        /* JADX INFO: renamed from: a */
        public final List<BreathingEvent> m65100a() {
            return this.breathingEvents;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.breathingEvents, ((a) other).breathingEvents);
        }

        public int hashCode() {
            return this.breathingEvents.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("EndAndSaveSession(breathingEvents=", ")", this.breathingEvents);
        }
    }

    /* JADX INFO: renamed from: kj2.m$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj2/m$b;", "Lkj2/m;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22529m {

        /* JADX INFO: renamed from: a */
        public static final b f88475a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kj2.m$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkj2/m$c;", "Lkj2/m;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC22529m {

        /* JADX INFO: renamed from: a */
        public static final c f88476a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: kj2.m$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lkj2/m$d;", "Lkj2/m;", "", "selectedCycle", "selectedSpeed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC22529m {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String selectedCycle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedSpeed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String selectedCycle, String selectedSpeed) {
            super(null);
            AbstractC22676k.m65750j(selectedCycle, "selectedCycle");
            AbstractC22676k.m65750j(selectedSpeed, "selectedSpeed");
            this.selectedCycle = selectedCycle;
            this.selectedSpeed = selectedSpeed;
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
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.selectedCycle, dVar.selectedCycle) && AbstractC22676k.m65745e(this.selectedSpeed, dVar.selectedSpeed);
        }

        public int hashCode() {
            return this.selectedSpeed.hashCode() + (this.selectedCycle.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("StartSession(selectedCycle=", this.selectedCycle, ", selectedSpeed=", this.selectedSpeed, ")");
        }
    }

    public /* synthetic */ AbstractC22529m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22529m() {
    }
}
