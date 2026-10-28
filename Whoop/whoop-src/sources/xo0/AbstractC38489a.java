package xo0;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xo0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lxo0/a;", "", "<init>", "()V", "a", "b", "Lxo0/a$a;", "Lxo0/a$b;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38489a {

    /* JADX INFO: renamed from: xo0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lxo0/a$a;", "Lxo0/a;", "", "coachOnboardingKey", "onboardingAnalyticSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC38489a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String coachOnboardingKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String onboardingAnalyticSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String coachOnboardingKey, String str) {
            super(null);
            AbstractC22676k.m65750j(coachOnboardingKey, "coachOnboardingKey");
            this.coachOnboardingKey = coachOnboardingKey;
            this.onboardingAnalyticSource = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCoachOnboardingKey() {
            return this.coachOnboardingKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOnboardingAnalyticSource() {
            return this.onboardingAnalyticSource;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.coachOnboardingKey, aVar.coachOnboardingKey) && AbstractC22676k.m65745e(this.onboardingAnalyticSource, aVar.onboardingAnalyticSource);
        }

        public int hashCode() {
            int iHashCode = this.coachOnboardingKey.hashCode() * 31;
            String str = this.onboardingAnalyticSource;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("Load(coachOnboardingKey=", this.coachOnboardingKey, ", onboardingAnalyticSource=", this.onboardingAnalyticSource, ")");
        }
    }

    /* JADX INFO: renamed from: xo0.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lxo0/a$b;", "Lxo0/a;", "<init>", "()V", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC38489a {

        /* JADX INFO: renamed from: a */
        public static final b f164903a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC38489a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC38489a() {
    }
}
