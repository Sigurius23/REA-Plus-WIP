package hy2;

import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hy2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lhy2/a;", "", "<init>", "()V", "b", "c", "d", "a", "e", "f", "Lhy2/a$a;", "Lhy2/a$b;", "Lhy2/a$c;", "Lhy2/a$d;", "Lhy2/a$e;", "Lhy2/a$f;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17810a {

    /* JADX INFO: renamed from: hy2.a$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lhy2/a$a;", "Lhy2/a;", "", "questionId", "", "optionKey", "", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Z", "()Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC17810a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String optionKey;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, String optionKey, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(optionKey, "optionKey");
            this.questionId = i13;
            this.optionKey = optionKey;
            this.isSelected = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOptionKey() {
            return this.optionKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.questionId == aVar.questionId && AbstractC22676k.m65745e(this.optionKey, aVar.optionKey) && this.isSelected == aVar.isSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected) + AbstractC11266d.m30450d(Integer.hashCode(this.questionId) * 31, 31, this.optionKey);
        }

        public String toString() {
            int i13 = this.questionId;
            String str = this.optionKey;
            return AbstractC18489d0.m53372m(AbstractC18489d0.m53373n(i13, "CheckOptionToggled(questionId=", ", optionKey=", str, ", isSelected="), this.isSelected, ")");
        }
    }

    /* JADX INFO: renamed from: hy2.a$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lhy2/a$b;", "Lhy2/a;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC17810a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public b(int i13, Integer num) {
            super(null);
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.campaignId == bVar.campaignId && AbstractC22676k.m65745e(this.sessionId, bVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "LoadCampaignScreening(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: hy2.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhy2/a$c;", "Lhy2/a;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC17810a {

        /* JADX INFO: renamed from: a */
        public static final c f69267a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: hy2.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lhy2/a$d;", "Lhy2/a;", "", "questionId", "optionIndex", "", "optionKey", "<init>", "(IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getOptionIndex", "c", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC17810a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int optionIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String optionKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, int i14, String optionKey) {
            super(null);
            AbstractC22676k.m65750j(optionKey, "optionKey");
            this.questionId = i13;
            this.optionIndex = i14;
            this.optionKey = optionKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getOptionKey() {
            return this.optionKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getQuestionId() {
            return this.questionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.questionId == dVar.questionId && this.optionIndex == dVar.optionIndex && AbstractC22676k.m65745e(this.optionKey, dVar.optionKey);
        }

        public int hashCode() {
            return this.optionKey.hashCode() + AbstractC11266d.m30448b(this.optionIndex, Integer.hashCode(this.questionId) * 31, 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.optionKey, ")", AbstractC11266d.m30465s(this.questionId, this.optionIndex, "RadioOptionSelected(questionId=", ", optionIndex=", ", optionKey="));
        }
    }

    /* JADX INFO: renamed from: hy2.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lhy2/a$e;", "Lhy2/a;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC17810a {

        /* JADX INFO: renamed from: a */
        public static final e f69271a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: hy2.a$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lhy2/a$f;", "Lhy2/a;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "screeningSubmissionResponse", "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC17810a {

        /* JADX INFO: renamed from: b */
        public static final int f69272b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ScreeningSubmissionResponse screeningSubmissionResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ScreeningSubmissionResponse screeningSubmissionResponse) {
            super(null);
            AbstractC22676k.m65750j(screeningSubmissionResponse, "screeningSubmissionResponse");
            this.screeningSubmissionResponse = screeningSubmissionResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ScreeningSubmissionResponse getScreeningSubmissionResponse() {
            return this.screeningSubmissionResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.screeningSubmissionResponse, ((f) other).screeningSubmissionResponse);
        }

        public int hashCode() {
            return this.screeningSubmissionResponse.hashCode();
        }

        public String toString() {
            return "SubmittedSuccessfully(screeningSubmissionResponse=" + this.screeningSubmissionResponse + ")";
        }
    }

    public /* synthetic */ AbstractC17810a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17810a() {
    }
}
