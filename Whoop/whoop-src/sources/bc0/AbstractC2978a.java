package bc0;

import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bc0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lbc0/a;", "", "<init>", "()V", "a", "b", "Lbc0/a$a;", "Lbc0/a$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2978a {

    /* JADX INFO: renamed from: bc0.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lbc0/a$a;", "Lbc0/a;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC2978a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testId;

        public a(String str) {
            super(null);
            this.testId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.testId, ((a) other).testId);
        }

        public int hashCode() {
            String str = this.testId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("LoadData(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: bc0.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lbc0/a$b;", "Lbc0/a;", "", "testId", "testName", "Lorg/joda/time/LocalDateTime;", "testDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC2978a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final LocalDateTime testDateTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String testId, String testName, LocalDateTime testDateTime) {
            super(null);
            AbstractC22676k.m65750j(testId, "testId");
            AbstractC22676k.m65750j(testName, "testName");
            AbstractC22676k.m65750j(testDateTime, "testDateTime");
            this.testId = testId;
            this.testName = testName;
            this.testDateTime = testDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getTestDateTime() {
            return this.testDateTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTestName() {
            return this.testName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.testId, bVar.testId) && AbstractC22676k.m65745e(this.testName, bVar.testName) && AbstractC22676k.m65745e(this.testDateTime, bVar.testDateTime);
        }

        public int hashCode() {
            return this.testDateTime.hashCode() + AbstractC11266d.m30450d(this.testId.hashCode() * 31, 31, this.testName);
        }

        public String toString() {
            String str = this.testId;
            String str2 = this.testName;
            LocalDateTime localDateTime = this.testDateTime;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("SaveData(testId=", str, ", testName=", str2, ", testDateTime=");
            sbM32001t.append(localDateTime);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public /* synthetic */ AbstractC2978a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC2978a() {
    }
}
