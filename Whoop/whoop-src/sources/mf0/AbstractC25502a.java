package mf0;

import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mf0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lmf0/a;", "", "<init>", "()V", "a", "b", "Lmf0/a$a;", "Lmf0/a$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25502a {

    /* JADX INFO: renamed from: mf0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmf0/a$a;", "Lmf0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC25502a {

        /* JADX INFO: renamed from: a */
        public static final a f99859a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mf0.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lmf0/a$b;", "Lmf0/a;", "", "testName", "Lorg/joda/time/LocalDateTime;", "localDateTime", "<init>", "(Ljava/lang/String;Lorg/joda/time/LocalDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lorg/joda/time/LocalDateTime;", "()Lorg/joda/time/LocalDateTime;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25502a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LocalDateTime localDateTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String testName, LocalDateTime localDateTime) {
            super(null);
            AbstractC22676k.m65750j(testName, "testName");
            AbstractC22676k.m65750j(localDateTime, "localDateTime");
            this.testName = testName;
            this.localDateTime = localDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDateTime getLocalDateTime() {
            return this.localDateTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return AbstractC22676k.m65745e(this.testName, bVar.testName) && AbstractC22676k.m65745e(this.localDateTime, bVar.localDateTime);
        }

        public int hashCode() {
            return this.localDateTime.hashCode() + (this.testName.hashCode() * 31);
        }

        public String toString() {
            return "Submit(testName=" + this.testName + ", localDateTime=" + this.localDateTime + ")";
        }
    }

    public /* synthetic */ AbstractC25502a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25502a() {
    }
}
