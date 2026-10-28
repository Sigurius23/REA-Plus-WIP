package gc0;

import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenId;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gc0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lgc0/a;", "", "<init>", "()V", "e", "b", "a", "f", "c", "d", "Lgc0/a$a;", "Lgc0/a$b;", "Lgc0/a$c;", "Lgc0/a$d;", "Lgc0/a$e;", "Lgc0/a$f;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15704a {

    /* JADX INFO: renamed from: gc0.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgc0/a$a;", "Lgc0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC15704a {

        /* JADX INFO: renamed from: a */
        public static final a f59030a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gc0.a$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lgc0/a$b;", "Lgc0/a;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "nextScreenId", "Lgc0/b;", "content", "<init>", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Lgc0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "b", "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "Lgc0/b;", "()Lgc0/b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC15704a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HormonalContextScreenId nextScreenId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15705b content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HormonalContextScreenId hormonalContextScreenId, C15705b content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.nextScreenId = hormonalContextScreenId;
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15705b getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final HormonalContextScreenId getNextScreenId() {
            return this.nextScreenId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.nextScreenId == bVar.nextScreenId && AbstractC22676k.m65745e(this.content, bVar.content);
        }

        public int hashCode() {
            HormonalContextScreenId hormonalContextScreenId = this.nextScreenId;
            return this.content.hashCode() + ((hormonalContextScreenId == null ? 0 : hormonalContextScreenId.hashCode()) * 31);
        }

        public String toString() {
            return "Forward(nextScreenId=" + this.nextScreenId + ", content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: gc0.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgc0/a$c;", "Lgc0/a;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC15704a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String testId) {
            super(null);
            AbstractC22676k.m65750j(testId, "testId");
            this.testId = testId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTestId() {
            return this.testId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.testId, ((c) other).testId);
        }

        public int hashCode() {
            return this.testId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Initialize(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: gc0.a$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgc0/a$d;", "Lgc0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC15704a {

        /* JADX INFO: renamed from: a */
        public static final d f59034a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gc0.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgc0/a$e;", "Lgc0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC15704a {

        /* JADX INFO: renamed from: a */
        public static final e f59035a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gc0.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgc0/a$f;", "Lgc0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC15704a {

        /* JADX INFO: renamed from: a */
        public static final f f59036a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC15704a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15704a() {
    }
}
