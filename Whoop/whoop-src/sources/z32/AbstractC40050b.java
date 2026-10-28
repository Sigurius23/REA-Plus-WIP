package z32;

import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.pregnancy.api.PregnancyDueDateSavedScreenDto;
import com.whoop.pregnancy.api.PregnancyOnboardingDto;
import com.whoop.pregnancy.api.PregnancySettingsDto;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: z32.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lz32/b;", "", "<init>", "()V", "a", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "d", "b", "e", "c", "g", "Lz32/b$a;", "Lz32/b$b;", "Lz32/b$c;", "Lz32/b$d;", "Lz32/b$e;", "Lz32/b$f;", "Lz32/b$g;", "Lz32/b$h;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40050b {

    /* JADX INFO: renamed from: z32.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lz32/b$a;", "Lz32/b;", "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;", "onboardingDto", "<init>", "(Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;", "()Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC40050b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PregnancyOnboardingDto onboardingDto;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PregnancyOnboardingDto onboardingDto) {
            super(null);
            AbstractC22676k.m65750j(onboardingDto, "onboardingDto");
            this.onboardingDto = onboardingDto;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PregnancyOnboardingDto getOnboardingDto() {
            return this.onboardingDto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.onboardingDto, ((a) other).onboardingDto);
        }

        public int hashCode() {
            return this.onboardingDto.hashCode();
        }

        public String toString() {
            return "BeginOnboarding(onboardingDto=" + this.onboardingDto + ")";
        }
    }

    /* JADX INFO: renamed from: z32.b$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lz32/b$b;", "Lz32/b;", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "settingsDto", "Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancyEducation", "<init>", "(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "b", "()Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "Lcom/whoop/educationModels/FeatureEducationDto;", "()Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC40050b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PregnancySettingsDto settingsDto;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final FeatureEducationDto pregnancyEducation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PregnancySettingsDto settingsDto, FeatureEducationDto pregnancyEducation) {
            super(null);
            AbstractC22676k.m65750j(settingsDto, "settingsDto");
            AbstractC22676k.m65750j(pregnancyEducation, "pregnancyEducation");
            this.settingsDto = settingsDto;
            this.pregnancyEducation = pregnancyEducation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FeatureEducationDto getPregnancyEducation() {
            return this.pregnancyEducation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PregnancySettingsDto getSettingsDto() {
            return this.settingsDto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.settingsDto, bVar.settingsDto) && AbstractC22676k.m65745e(this.pregnancyEducation, bVar.pregnancyEducation);
        }

        public int hashCode() {
            return this.pregnancyEducation.hashCode() + (this.settingsDto.hashCode() * 31);
        }

        public String toString() {
            return "ExitFlowSuccess(settingsDto=" + this.settingsDto + ", pregnancyEducation=" + this.pregnancyEducation + ")";
        }
    }

    /* JADX INFO: renamed from: z32.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lz32/b$c;", "Lz32/b;", "<init>", "()V", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC40050b {

        /* JADX INFO: renamed from: a */
        public static final c f172783a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: z32.b$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lz32/b$d;", "Lz32/b;", "Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;", "dueDateSavedDto", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "settingsDto", "Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancyEducation", "<init>", "(Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;", "()Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;", "b", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "c", "()Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "Lcom/whoop/educationModels/FeatureEducationDto;", "()Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC40050b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PregnancyDueDateSavedScreenDto dueDateSavedDto;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final PregnancySettingsDto settingsDto;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final FeatureEducationDto pregnancyEducation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PregnancyDueDateSavedScreenDto dueDateSavedDto, PregnancySettingsDto settingsDto, FeatureEducationDto pregnancyEducation) {
            super(null);
            AbstractC22676k.m65750j(dueDateSavedDto, "dueDateSavedDto");
            AbstractC22676k.m65750j(settingsDto, "settingsDto");
            AbstractC22676k.m65750j(pregnancyEducation, "pregnancyEducation");
            this.dueDateSavedDto = dueDateSavedDto;
            this.settingsDto = settingsDto;
            this.pregnancyEducation = pregnancyEducation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PregnancyDueDateSavedScreenDto getDueDateSavedDto() {
            return this.dueDateSavedDto;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FeatureEducationDto getPregnancyEducation() {
            return this.pregnancyEducation;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PregnancySettingsDto getSettingsDto() {
            return this.settingsDto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.dueDateSavedDto, dVar.dueDateSavedDto) && AbstractC22676k.m65745e(this.settingsDto, dVar.settingsDto) && AbstractC22676k.m65745e(this.pregnancyEducation, dVar.pregnancyEducation);
        }

        public int hashCode() {
            return this.pregnancyEducation.hashCode() + ((this.settingsDto.hashCode() + (this.dueDateSavedDto.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "OnboardingDueDateSavedSuccess(dueDateSavedDto=" + this.dueDateSavedDto + ", settingsDto=" + this.settingsDto + ", pregnancyEducation=" + this.pregnancyEducation + ")";
        }
    }

    /* JADX INFO: renamed from: z32.b$e */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lz32/b$e;", "Lz32/b;", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "settingsDto", "Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancyEducation", "<init>", "(Lcom/whoop/pregnancy/api/PregnancySettingsDto;Lcom/whoop/educationModels/FeatureEducationDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "b", "()Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "Lcom/whoop/educationModels/FeatureEducationDto;", "()Lcom/whoop/educationModels/FeatureEducationDto;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC40050b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PregnancySettingsDto settingsDto;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final FeatureEducationDto pregnancyEducation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PregnancySettingsDto settingsDto, FeatureEducationDto pregnancyEducation) {
            super(null);
            AbstractC22676k.m65750j(settingsDto, "settingsDto");
            AbstractC22676k.m65750j(pregnancyEducation, "pregnancyEducation");
            this.settingsDto = settingsDto;
            this.pregnancyEducation = pregnancyEducation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FeatureEducationDto getPregnancyEducation() {
            return this.pregnancyEducation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PregnancySettingsDto getSettingsDto() {
            return this.settingsDto;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.settingsDto, eVar.settingsDto) && AbstractC22676k.m65745e(this.pregnancyEducation, eVar.pregnancyEducation);
        }

        public int hashCode() {
            return this.pregnancyEducation.hashCode() + (this.settingsDto.hashCode() * 31);
        }

        public String toString() {
            return "RefreshSuccess(settingsDto=" + this.settingsDto + ", pregnancyEducation=" + this.pregnancyEducation + ")";
        }
    }

    /* JADX INFO: renamed from: z32.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lz32/b$f;", "Lz32/b;", "<init>", "()V", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC40050b {

        /* JADX INFO: renamed from: a */
        public static final f f172789a = new f();

        private f() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: z32.b$g */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lz32/b$g;", "Lz32/b;", "", "previousDueDate", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC40050b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String previousDueDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String previousDueDate) {
            super(null);
            AbstractC22676k.m65750j(previousDueDate, "previousDueDate");
            this.previousDueDate = previousDueDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPreviousDueDate() {
            return this.previousDueDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.previousDueDate, ((g) other).previousDueDate);
        }

        public int hashCode() {
            return this.previousDueDate.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("UpdateDueDateError(previousDueDate=", this.previousDueDate, ")");
        }
    }

    /* JADX INFO: renamed from: z32.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lz32/b$h;", "Lz32/b;", "<init>", "()V", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC40050b {

        /* JADX INFO: renamed from: a */
        public static final h f172791a = new h();

        private h() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC40050b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40050b() {
    }
}
