package wp1;

import com.whoop.hormonalinsights.pregnancyinsights.domain.models.GenericSymptomsScreenResponse;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: wp1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lwp1/b;", "", "<init>", "()V", "b", "a", "c", "Lwp1/b$a;", "Lwp1/b$b;", "Lwp1/b$c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37498b {

    /* JADX INFO: renamed from: wp1.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lwp1/b$a;", "Lwp1/b;", "", "error", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC37498b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String error) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getError() {
            return this.error;
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

    /* JADX INFO: renamed from: wp1.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwp1/b$b;", "Lwp1/b;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37498b {

        /* JADX INFO: renamed from: a */
        public static final b f160385a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wp1.b$c */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lwp1/b$c;", "Lwp1/b;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "response", "", "selectedSegmentId", "<init>", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;Ljava/lang/String;)V", "a", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;Ljava/lang/String;)Lwp1/b$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "c", "()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "b", "Ljava/lang/String;", "d", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC37498b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final GenericSymptomsScreenResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String selectedSegmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GenericSymptomsScreenResponse response, String str) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
            this.selectedSegmentId = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m120184b(c cVar, GenericSymptomsScreenResponse genericSymptomsScreenResponse, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                genericSymptomsScreenResponse = cVar.response;
            }
            if ((i13 & 2) != 0) {
                str = cVar.selectedSegmentId;
            }
            return cVar.m120185a(genericSymptomsScreenResponse, str);
        }

        /* JADX INFO: renamed from: a */
        public final c m120185a(GenericSymptomsScreenResponse response, String selectedSegmentId) {
            AbstractC22676k.m65750j(response, "response");
            return new c(response, selectedSegmentId);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final GenericSymptomsScreenResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSelectedSegmentId() {
            return this.selectedSegmentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.response, cVar.response) && AbstractC22676k.m65745e(this.selectedSegmentId, cVar.selectedSegmentId);
        }

        public int hashCode() {
            int iHashCode = this.response.hashCode() * 31;
            String str = this.selectedSegmentId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Result(response=" + this.response + ", selectedSegmentId=" + this.selectedSegmentId + ")";
        }
    }

    public /* synthetic */ AbstractC37498b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC37498b() {
    }
}
