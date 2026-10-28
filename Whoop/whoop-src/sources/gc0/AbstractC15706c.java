package gc0;

import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextResponse;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: gc0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lgc0/c;", "", "<init>", "()V", "b", "d", "a", "f", "e", "c", "Lgc0/c$a;", "Lgc0/c$b;", "Lgc0/c$c;", "Lgc0/c$d;", "Lgc0/c$e;", "Lgc0/c$f;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15706c {

    /* JADX INFO: renamed from: gc0.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lgc0/c$a;", "Lgc0/c;", "", "testId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTestId", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC15706c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String testId;

        public a(String str) {
            super(null);
            this.testId = str;
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
            return AbstractC11895b.m31996o("Error(testId=", this.testId, ")");
        }
    }

    /* JADX INFO: renamed from: gc0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgc0/c$b;", "Lgc0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC15706c {

        /* JADX INFO: renamed from: a */
        public static final b f59044a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gc0.c$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lgc0/c$c;", "Lgc0/c;", "Lgc0/e;", "progressResult", "Lgc0/b;", "saveRequest", "<init>", "(Lgc0/e;Lgc0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgc0/e;", "()Lgc0/e;", "b", "Lgc0/b;", "()Lgc0/b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC15706c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C15708e progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15705b saveRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15708e progressResult, C15705b saveRequest) {
            super(null);
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15708e getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C15705b getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.progressResult, cVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, cVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "SaveError(progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    /* JADX INFO: renamed from: gc0.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgc0/c$d;", "Lgc0/c;", "Lgc0/e;", "progressResult", "<init>", "(Lgc0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgc0/e;", "()Lgc0/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC15706c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C15708e progressResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15708e progressResult) {
            super(null);
            AbstractC22676k.m65750j(progressResult, "progressResult");
            this.progressResult = progressResult;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15708e getProgressResult() {
            return this.progressResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.progressResult, ((d) other).progressResult);
        }

        public int hashCode() {
            return this.progressResult.hashCode();
        }

        public String toString() {
            return "SaveSuccess(progressResult=" + this.progressResult + ")";
        }
    }

    /* JADX INFO: renamed from: gc0.c$e */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lgc0/c$e;", "Lgc0/c;", "Lgc0/e;", "progressResult", "Lgc0/b;", "saveRequest", "<init>", "(Lgc0/e;Lgc0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgc0/e;", "()Lgc0/e;", "b", "Lgc0/b;", "()Lgc0/b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC15706c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C15708e progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15705b saveRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15708e progressResult, C15705b saveRequest) {
            super(null);
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C15708e getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C15705b getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.progressResult, eVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, eVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "Saving(progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    public /* synthetic */ AbstractC15706c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15706c() {
    }

    /* JADX INFO: renamed from: gc0.c$f */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lgc0/c$f;", "Lgc0/c;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;", "response", "Lgc0/e;", "progressResult", "Lgc0/b;", "saveRequest", "", "shouldExit", "<init>", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;Z)V", "a", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;Lgc0/e;Lgc0/b;Z)Lgc0/c$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;", "d", "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;", "b", "Lgc0/e;", "c", "()Lgc0/e;", "Lgc0/b;", "e", "()Lgc0/b;", "Z", "f", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC15706c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final HormonalContextResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C15708e progressResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C15705b saveRequest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean shouldExit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HormonalContextResponse response, C15708e progressResult, C15705b saveRequest, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.response = response;
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
            this.shouldExit = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ f m44198b(f fVar, HormonalContextResponse hormonalContextResponse, C15708e c15708e, C15705b c15705b, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                hormonalContextResponse = fVar.response;
            }
            if ((i13 & 2) != 0) {
                c15708e = fVar.progressResult;
            }
            if ((i13 & 4) != 0) {
                c15705b = fVar.saveRequest;
            }
            if ((i13 & 8) != 0) {
                z4 = fVar.shouldExit;
            }
            return fVar.m44199a(hormonalContextResponse, c15708e, c15705b, z4);
        }

        /* JADX INFO: renamed from: a */
        public final f m44199a(HormonalContextResponse response, C15708e progressResult, C15705b saveRequest, boolean shouldExit) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            return new f(response, progressResult, saveRequest, shouldExit);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C15708e getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final HormonalContextResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C15705b getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.response, fVar.response) && AbstractC22676k.m65745e(this.progressResult, fVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, fVar.saveRequest) && this.shouldExit == fVar.shouldExit;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShouldExit() {
            return this.shouldExit;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldExit) + ((this.saveRequest.hashCode() + ((this.progressResult.hashCode() + (this.response.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Success(response=" + this.response + ", progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ", shouldExit=" + this.shouldExit + ")";
        }

        public /* synthetic */ f(HormonalContextResponse hormonalContextResponse, C15708e c15708e, C15705b c15705b, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(hormonalContextResponse, (i13 & 2) != 0 ? new C15708e(null, null, 3, null) : c15708e, (i13 & 4) != 0 ? new C15705b(null, null, null, null, null, null, 63, null) : c15705b, (i13 & 8) != 0 ? false : z4);
        }
    }
}
