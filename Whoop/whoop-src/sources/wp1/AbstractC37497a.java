package wp1;

import c13.AbstractC3855a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wp1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lwp1/a;", "", "<init>", "()V", "a", "b", "Lwp1/a$a;", "Lwp1/a$b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37497a {

    /* JADX INFO: renamed from: wp1.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lwp1/a$a;", "Lwp1/a;", "", "useMenstrualEndpoint", "", "pregnancyId", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37497a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean useMenstrualEndpoint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String pregnancyId;

        public a(boolean z4, String str) {
            super(null);
            this.useMenstrualEndpoint = z4;
            this.pregnancyId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPregnancyId() {
            return this.pregnancyId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getUseMenstrualEndpoint() {
            return this.useMenstrualEndpoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.useMenstrualEndpoint == aVar.useMenstrualEndpoint && AbstractC22676k.m65745e(this.pregnancyId, aVar.pregnancyId);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.useMenstrualEndpoint) * 31;
            String str = this.pregnancyId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC3855a.m11825i("Load(useMenstrualEndpoint=", ", pregnancyId=", this.pregnancyId, ")", this.useMenstrualEndpoint);
        }
    }

    /* JADX INFO: renamed from: wp1.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwp1/a$b;", "Lwp1/a;", "", "segmentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC37497a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String segmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String segmentId) {
            super(null);
            AbstractC22676k.m65750j(segmentId, "segmentId");
            this.segmentId = segmentId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSegmentId() {
            return this.segmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.segmentId, ((b) other).segmentId);
        }

        public int hashCode() {
            return this.segmentId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("SelectSegment(segmentId=", this.segmentId, ")");
        }
    }

    public /* synthetic */ AbstractC37497a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37497a() {
    }
}
