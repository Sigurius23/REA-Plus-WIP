package vt2;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: vt2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lvt2/g;", "", "<init>", "()V", "a", "b", "d", "e", "c", "Lvt2/g$a;", "Lvt2/g$b;", "Lvt2/g$c;", "Lvt2/g$d;", "Lvt2/g$e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36498g {

    /* JADX INFO: renamed from: vt2.g$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvt2/g$a;", "Lvt2/g;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC36498g {

        /* JADX INFO: renamed from: a */
        public static final a f155924a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vt2.g$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvt2/g$b;", "Lvt2/g;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC36498g {

        /* JADX INFO: renamed from: a */
        public static final b f155925a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: vt2.g$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lvt2/g$c;", "Lvt2/g;", "", "planState", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getPlanState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC36498g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String planState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String planState) {
            super(null);
            AbstractC22676k.m65750j(planState, "planState");
            this.planState = planState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.planState, ((c) other).planState);
        }

        public int hashCode() {
            return this.planState.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Presets(planState=", this.planState, ")");
        }
    }

    /* JADX INFO: renamed from: vt2.g$d */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m65681d2 = {"Lvt2/g$d;", "Lvt2/g;", "", "numberOfGoals", "", "planId", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC36498g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int numberOfGoals;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String planId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, String planId) {
            super(null);
            AbstractC22676k.m65750j(planId, "planId");
            this.numberOfGoals = i13;
            this.planId = planId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getNumberOfGoals() {
            return this.numberOfGoals;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.numberOfGoals == dVar.numberOfGoals && AbstractC22676k.m65745e(this.planId, dVar.planId);
        }

        public int hashCode() {
            return this.planId.hashCode() + (Integer.hashCode(this.numberOfGoals) * 31);
        }

        public String toString() {
            return AbstractC30007c.m91838h(this.numberOfGoals, "Summary(numberOfGoals=", ", planId=", this.planId, ")");
        }
    }

    /* JADX INFO: renamed from: vt2.g$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvt2/g$e;", "Lvt2/g;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC36498g {

        /* JADX INFO: renamed from: a */
        public static final e f155929a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC36498g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC36498g() {
    }
}
