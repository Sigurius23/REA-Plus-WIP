package lj2;

import com.whoop.stress.domain.BreathingEvent;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lj2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Llj2/f;", "", "<init>", "()V", "d", "c", "a", "b", "Llj2/f$a;", "Llj2/f$b;", "Llj2/f$c;", "Llj2/f$d;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24480f {

    /* JADX INFO: renamed from: lj2.f$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/f$a;", "Llj2/f;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC24480f {

        /* JADX INFO: renamed from: a */
        public static final a f95498a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.f$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Llj2/f$b;", "Llj2/f;", "", "Lcom/whoop/stress/domain/BreathingEvent;", "breathingEvents", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC24480f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<BreathingEvent> breathingEvents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<BreathingEvent> breathingEvents) {
            super(null);
            AbstractC22676k.m65750j(breathingEvents, "breathingEvents");
            this.breathingEvents = breathingEvents;
        }

        /* JADX INFO: renamed from: a */
        public final List<BreathingEvent> m71253a() {
            return this.breathingEvents;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.breathingEvents, ((b) other).breathingEvents);
        }

        public int hashCode() {
            return this.breathingEvents.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("OnEndSession(breathingEvents=", ")", this.breathingEvents);
        }
    }

    /* JADX INFO: renamed from: lj2.f$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/f$c;", "Llj2/f;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC24480f {

        /* JADX INFO: renamed from: a */
        public static final c f95500a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: lj2.f$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llj2/f$d;", "Llj2/f;", "<init>", "()V", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC24480f {

        /* JADX INFO: renamed from: a */
        public static final d f95501a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC24480f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC24480f() {
    }
}
