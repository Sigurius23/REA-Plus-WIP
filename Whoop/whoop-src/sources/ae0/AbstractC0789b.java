package ae0;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.advancedlabs.domain.models.FormContent;
import com.whoop.advancedlabs.domain.models.SchedulingFormResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ae0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lae0/b;", "", "<init>", "()V", "j", "d", "b", "a", "f", "e", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "i", "Lae0/b$a;", "Lae0/b$b;", "Lae0/b$c;", "Lae0/b$d;", "Lae0/b$e;", "Lae0/b$f;", "Lae0/b$g;", "Lae0/b$h;", "Lae0/b$i;", "Lae0/b$j;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0789b {

    /* JADX INFO: renamed from: ae0.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lae0/b$a;", "Lae0/b;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC0789b {

        /* JADX INFO: renamed from: a */
        public static final a f2846a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ae0.b$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lae0/b$b;", "Lae0/b;", "", "siteCode", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC0789b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String siteCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String siteCode, String date) {
            super(null);
            AbstractC22676k.m65750j(siteCode, "siteCode");
            AbstractC22676k.m65750j(date, "date");
            this.siteCode = siteCode;
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSiteCode() {
            return this.siteCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.siteCode, bVar.siteCode) && AbstractC22676k.m65745e(this.date, bVar.date);
        }

        public int hashCode() {
            return this.date.hashCode() + (this.siteCode.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("AppointmentSelected(siteCode=", this.siteCode, ", date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: ae0.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lae0/b$c;", "Lae0/b;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC0789b {

        /* JADX INFO: renamed from: a */
        public static final c f2849a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ae0.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lae0/b$d;", "Lae0/b;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC0789b {

        /* JADX INFO: renamed from: a */
        public static final d f2850a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ae0.b$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lae0/b$e;", "Lae0/b;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC0789b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean success;

        public e(boolean z4) {
            super(null);
            this.success = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && this.success == ((e) other).success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SaveCompleted(success=", ")", this.success);
        }
    }

    /* JADX INFO: renamed from: ae0.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lae0/b$f;", "Lae0/b;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC0789b {

        /* JADX INFO: renamed from: a */
        public static final f f2852a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ae0.b$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lae0/b$g;", "Lae0/b;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC0789b {

        /* JADX INFO: renamed from: a */
        public static final g f2853a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ae0.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lae0/b$h;", "Lae0/b;", "Lcom/whoop/advancedlabs/domain/models/FormContent;", "formContent", "<init>", "(Lcom/whoop/advancedlabs/domain/models/FormContent;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/FormContent;", "()Lcom/whoop/advancedlabs/domain/models/FormContent;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC0789b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FormContent formContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FormContent formContent) {
            super(null);
            AbstractC22676k.m65750j(formContent, "formContent");
            this.formContent = formContent;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FormContent getFormContent() {
            return this.formContent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.formContent, ((h) other).formContent);
        }

        public int hashCode() {
            return this.formContent.hashCode();
        }

        public String toString() {
            return "SearchSuccess(formContent=" + this.formContent + ")";
        }
    }

    /* JADX INFO: renamed from: ae0.b$i */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lae0/b$i;", "Lae0/b;", "", "isSearching", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC0789b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isSearching;

        public i(boolean z4) {
            super(null);
            this.isSearching = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsSearching() {
            return this.isSearching;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && this.isSearching == ((i) other).isSearching;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSearching);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SetSearchingState(isSearching=", ")", this.isSearching);
        }
    }

    /* JADX INFO: renamed from: ae0.b$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lae0/b$j;", "Lae0/b;", "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "response", "", "episodeId", "biomarkerTestId", "testType", "<init>", "(Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "c", "()Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;", "b", "Ljava/lang/String;", "d", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC0789b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SchedulingFormResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String episodeId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String biomarkerTestId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String testType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(SchedulingFormResponse response, String str, String str2, String str3) {
            super(null);
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
            this.episodeId = str;
            this.biomarkerTestId = str2;
            this.testType = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkerTestId() {
            return this.biomarkerTestId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEpisodeId() {
            return this.episodeId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final SchedulingFormResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.response, jVar.response) && AbstractC22676k.m65745e(this.episodeId, jVar.episodeId) && AbstractC22676k.m65745e(this.biomarkerTestId, jVar.biomarkerTestId) && AbstractC22676k.m65745e(this.testType, jVar.testType);
        }

        public int hashCode() {
            int iHashCode = this.response.hashCode() * 31;
            String str = this.episodeId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.biomarkerTestId;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.testType;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            SchedulingFormResponse schedulingFormResponse = this.response;
            String str = this.episodeId;
            String str2 = this.biomarkerTestId;
            String str3 = this.testType;
            StringBuilder sb4 = new StringBuilder("Success(response=");
            sb4.append(schedulingFormResponse);
            sb4.append(", episodeId=");
            sb4.append(str);
            sb4.append(", biomarkerTestId=");
            return AbstractC11266d.m30464r(sb4, str2, ", testType=", str3, ")");
        }
    }

    public /* synthetic */ AbstractC0789b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC0789b() {
    }
}
