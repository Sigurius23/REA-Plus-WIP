package ss2;

import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ss2.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lss2/c;", "", "<init>", "()V", "b", "a", "c", "Lss2/c$a;", "Lss2/c$b;", "Lss2/c$c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32952c {

    /* JADX INFO: renamed from: ss2.c$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lss2/c$a;", "Lss2/c;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getError", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC32952c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.error, ((a) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(error=", this.error, ")");
        }
    }

    /* JADX INFO: renamed from: ss2.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lss2/c$b;", "Lss2/c;", "<init>", "()V", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32952c {

        /* JADX INFO: renamed from: a */
        public static final b f137255a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ss2.c$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lss2/c$c;", "Lss2/c;", "Lss2/a;", "result", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "aiContextMetadata", "<init>", "(Lss2/a;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lss2/a;", "b", "()Lss2/a;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC32952c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C32950a result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AiContextMetadata aiContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C32950a result, AiContextMetadata aiContextMetadata) {
            super(null);
            AbstractC22676k.m65750j(result, "result");
            this.result = result;
            this.aiContextMetadata = aiContextMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AiContextMetadata getAiContextMetadata() {
            return this.aiContextMetadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C32950a getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.result, cVar.result) && AbstractC22676k.m65745e(this.aiContextMetadata, cVar.aiContextMetadata);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            AiContextMetadata aiContextMetadata = this.aiContextMetadata;
            return iHashCode + (aiContextMetadata == null ? 0 : aiContextMetadata.hashCode());
        }

        public String toString() {
            return "Success(result=" + this.result + ", aiContextMetadata=" + this.aiContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC32952c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC32952c() {
    }
}
