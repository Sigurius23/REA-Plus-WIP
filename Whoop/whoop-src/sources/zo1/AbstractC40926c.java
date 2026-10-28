package zo1;

import c13.AbstractC3855a;
import com.mapbox.common.HttpHeaders;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyDueDateSavedScreenDto;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciPregnancyOnboardingDto;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingResponse;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zo1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Lzo1/c;", "", "<init>", "()V", "e", "i", "g", "b", "d", "k", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "c", "a", "Lzo1/c$a;", "Lzo1/c$b;", "Lzo1/c$c;", "Lzo1/c$d;", "Lzo1/c$e;", "Lzo1/c$f;", "Lzo1/c$g;", "Lzo1/c$h;", "Lzo1/c$i;", "Lzo1/c$j;", "Lzo1/c$k;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40926c {

    /* JADX INFO: renamed from: zo1.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzo1/c$a;", "Lzo1/c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC40926c {

        /* JADX INFO: renamed from: a */
        public static final a f176520a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: zo1.c$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzo1/c$b;", "Lzo1/c;", "", HttpHeaders.DATE, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String date) {
            super(null);
            AbstractC22676k.m65750j(date, "date");
            this.date = date;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.date, ((b) other).date);
        }

        public int hashCode() {
            return this.date.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DueDateError(date=", this.date, ")");
        }
    }

    /* JADX INFO: renamed from: zo1.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzo1/c$c;", "Lzo1/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;", "dueDateSavedScreenDto", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateSavedScreenDto;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MciPregnancyDueDateSavedScreenDto dueDateSavedScreenDto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MciPregnancyDueDateSavedScreenDto dueDateSavedScreenDto) {
            super(null);
            AbstractC22676k.m65750j(dueDateSavedScreenDto, "dueDateSavedScreenDto");
            this.dueDateSavedScreenDto = dueDateSavedScreenDto;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MciPregnancyDueDateSavedScreenDto getDueDateSavedScreenDto() {
            return this.dueDateSavedScreenDto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.dueDateSavedScreenDto, ((c) other).dueDateSavedScreenDto);
        }

        public int hashCode() {
            return this.dueDateSavedScreenDto.hashCode();
        }

        public String toString() {
            return "DueDateSaved(dueDateSavedScreenDto=" + this.dueDateSavedScreenDto + ")";
        }
    }

    /* JADX INFO: renamed from: zo1.c$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lzo1/c$d;", "Lzo1/c;", "", "feature", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String feature;

        public d(String str) {
            super(null);
            this.feature = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFeature() {
            return this.feature;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.feature, ((d) other).feature);
        }

        public int hashCode() {
            String str = this.feature;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Error(feature=", this.feature, ")");
        }
    }

    /* JADX INFO: renamed from: zo1.c$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzo1/c$e;", "Lzo1/c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC40926c {

        /* JADX INFO: renamed from: a */
        public static final e f176524a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: zo1.c$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzo1/c$f;", "Lzo1/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "pregnancyOnboardingDto", "", "isInitialScreen", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyOnboardingDto;", "b", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MciPregnancyOnboardingDto pregnancyOnboardingDto;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isInitialScreen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MciPregnancyOnboardingDto pregnancyOnboardingDto, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(pregnancyOnboardingDto, "pregnancyOnboardingDto");
            this.pregnancyOnboardingDto = pregnancyOnboardingDto;
            this.isInitialScreen = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final MciPregnancyOnboardingDto getPregnancyOnboardingDto() {
            return this.pregnancyOnboardingDto;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsInitialScreen() {
            return this.isInitialScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.pregnancyOnboardingDto, fVar.pregnancyOnboardingDto) && this.isInitialScreen == fVar.isInitialScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInitialScreen) + (this.pregnancyOnboardingDto.hashCode() * 31);
        }

        public String toString() {
            return "MciPregnancyOnboarding(pregnancyOnboardingDto=" + this.pregnancyOnboardingDto + ", isInitialScreen=" + this.isInitialScreen + ")";
        }
    }

    /* JADX INFO: renamed from: zo1.c$g */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lzo1/c$g;", "Lzo1/c;", "", "isInitialScreen", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isInitialScreen;

        public g(boolean z4) {
            super(null);
            this.isInitialScreen = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsInitialScreen() {
            return this.isInitialScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && this.isInitialScreen == ((g) other).isInitialScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isInitialScreen);
        }

        public String toString() {
            return AbstractC3855a.m11827k("PregnancyOnboardingError(isInitialScreen=", ")", this.isInitialScreen);
        }
    }

    /* JADX INFO: renamed from: zo1.c$h */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lzo1/c$h;", "Lzo1/c;", "Lzo1/f;", "progressResult", "Lzo1/b;", "saveRequest", "<init>", "(Lzo1/f;Lzo1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzo1/f;", "()Lzo1/f;", "b", "Lzo1/b;", "()Lzo1/b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40929f progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C40925b saveRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C40929f progressResult, C40925b saveRequest) {
            super(null);
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C40929f getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C40925b getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.progressResult, hVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, hVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "SaveError(progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    /* JADX INFO: renamed from: zo1.c$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lzo1/c$i;", "Lzo1/c;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC40926c {

        /* JADX INFO: renamed from: a */
        public static final i f176530a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: zo1.c$j */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lzo1/c$j;", "Lzo1/c;", "Lzo1/f;", "progressResult", "Lzo1/b;", "saveRequest", "<init>", "(Lzo1/f;Lzo1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzo1/f;", "()Lzo1/f;", "b", "Lzo1/b;", "()Lzo1/b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40929f progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C40925b saveRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C40929f progressResult, C40925b saveRequest) {
            super(null);
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C40929f getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C40925b getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.progressResult, jVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, jVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "Saving(progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    public /* synthetic */ AbstractC40926c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40926c() {
    }

    /* JADX INFO: renamed from: zo1.c$k */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lzo1/c$k;", "Lzo1/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;", "response", "Lzo1/f;", "progressResult", "Lzo1/b;", "saveRequest", "", "shouldExit", "<init>", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)V", "a", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;Lzo1/f;Lzo1/b;Z)Lzo1/c$k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;", "d", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;", "b", "Lzo1/f;", "c", "()Lzo1/f;", "Lzo1/b;", "e", "()Lzo1/b;", "Z", "f", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC40926c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MciOnboardingResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C40929f progressResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C40925b saveRequest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean shouldExit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MciOnboardingResponse response, C40929f progressResult, C40925b saveRequest, boolean z4) {
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
        public static /* synthetic */ k m132755b(k kVar, MciOnboardingResponse mciOnboardingResponse, C40929f c40929f, C40925b c40925b, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                mciOnboardingResponse = kVar.response;
            }
            if ((i13 & 2) != 0) {
                c40929f = kVar.progressResult;
            }
            if ((i13 & 4) != 0) {
                c40925b = kVar.saveRequest;
            }
            if ((i13 & 8) != 0) {
                z4 = kVar.shouldExit;
            }
            return kVar.m132756a(mciOnboardingResponse, c40929f, c40925b, z4);
        }

        /* JADX INFO: renamed from: a */
        public final k m132756a(MciOnboardingResponse response, C40929f progressResult, C40925b saveRequest, boolean shouldExit) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            return new k(response, progressResult, saveRequest, shouldExit);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C40929f getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final MciOnboardingResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C40925b getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.response, kVar.response) && AbstractC22676k.m65745e(this.progressResult, kVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, kVar.saveRequest) && this.shouldExit == kVar.shouldExit;
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

        public /* synthetic */ k(MciOnboardingResponse mciOnboardingResponse, C40929f c40929f, C40925b c40925b, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(mciOnboardingResponse, (i13 & 2) != 0 ? new C40929f(null, null, 3, null) : c40929f, (i13 & 4) != 0 ? new C40925b(null, null, null, null, null, null, null, 127, null) : c40925b, (i13 & 8) != 0 ? false : z4);
        }
    }
}
