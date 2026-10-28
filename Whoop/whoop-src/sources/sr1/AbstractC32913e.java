package sr1;

import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.JournalBounds;
import com.whoop.data.remote.domain.dto.SubtitleCallout;
import com.whoop.data.remote.domain.request.JournalTrackerRequest;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr1.C34098b;
import ur1.C35187d;
import wr1.AbstractC37570d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sr1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lsr1/e;", "", "<init>", "()V", "b", "a", "d", "c", "e", "Lsr1/e$a;", "Lsr1/e$b;", "Lsr1/e$c;", "Lsr1/e$d;", "Lsr1/e$e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32913e {

    /* JADX INFO: renamed from: sr1.e$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsr1/e$c;", "Lsr1/e;", "", "success", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getSuccess", "()Z", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC32913e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean success;

        public c(boolean z4) {
            super(null);
            this.success = z4;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.success == ((c) other).success;
        }

        public int hashCode() {
            return Boolean.hashCode(this.success);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SaveJournalEntrySuccess(success=", ")", this.success);
        }
    }

    /* JADX INFO: renamed from: sr1.e$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Lsr1/e$d;", "Lsr1/e;", "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "journalTrackerRequest", "", "isDefaultAnswerToggleEnabled", "isDefaultAnswerToggleVisible", "", "requestDate", "", "cycleId", "<init>", "(Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;ZZLjava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "b", "()Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "Z", "d", "()Z", "c", "e", "Ljava/lang/String;", "J", "()J", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC32913e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final JournalTrackerRequest journalTrackerRequest;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isDefaultAnswerToggleEnabled;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isDefaultAnswerToggleVisible;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String requestDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JournalTrackerRequest journalTrackerRequest, boolean z4, boolean z13, String requestDate, long j7) {
            super(null);
            AbstractC22676k.m65750j(journalTrackerRequest, "journalTrackerRequest");
            AbstractC22676k.m65750j(requestDate, "requestDate");
            this.journalTrackerRequest = journalTrackerRequest;
            this.isDefaultAnswerToggleEnabled = z4;
            this.isDefaultAnswerToggleVisible = z13;
            this.requestDate = requestDate;
            this.cycleId = j7;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final JournalTrackerRequest getJournalTrackerRequest() {
            return this.journalTrackerRequest;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsDefaultAnswerToggleEnabled() {
            return this.isDefaultAnswerToggleEnabled;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsDefaultAnswerToggleVisible() {
            return this.isDefaultAnswerToggleVisible;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.journalTrackerRequest, dVar.journalTrackerRequest) && this.isDefaultAnswerToggleEnabled == dVar.isDefaultAnswerToggleEnabled && this.isDefaultAnswerToggleVisible == dVar.isDefaultAnswerToggleVisible && AbstractC22676k.m65745e(this.requestDate, dVar.requestDate) && this.cycleId == dVar.cycleId;
        }

        public int hashCode() {
            return Long.hashCode(this.cycleId) + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.journalTrackerRequest.hashCode() * 31, 31, this.isDefaultAnswerToggleEnabled), 31, this.isDefaultAnswerToggleVisible), 31, this.requestDate);
        }

        public String toString() {
            JournalTrackerRequest journalTrackerRequest = this.journalTrackerRequest;
            boolean z4 = this.isDefaultAnswerToggleEnabled;
            boolean z13 = this.isDefaultAnswerToggleVisible;
            String str = this.requestDate;
            long j7 = this.cycleId;
            StringBuilder sb4 = new StringBuilder("SavingV2(journalTrackerRequest=");
            sb4.append(journalTrackerRequest);
            sb4.append(", isDefaultAnswerToggleEnabled=");
            sb4.append(z4);
            sb4.append(", isDefaultAnswerToggleVisible=");
            AbstractC38963t7.m124391u(sb4, z13, ", requestDate=", str, ", cycleId=");
            return AbstractC11266d.m30457k(j7, ")", sb4);
        }
    }

    public /* synthetic */ AbstractC32913e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: sr1.e$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lsr1/e$b;", "Lsr1/e;", "Lwr1/d;", "datePickerV2DomainState", "<init>", "(Lwr1/d;)V", "a", "(Lwr1/d;)Lsr1/e$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lwr1/d;", "b", "()Lwr1/d;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC32913e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC37570d datePickerV2DomainState;

        public b(AbstractC37570d abstractC37570d) {
            super(null);
            this.datePickerV2DomainState = abstractC37570d;
        }

        /* JADX INFO: renamed from: a */
        public final b m103326a(AbstractC37570d datePickerV2DomainState) {
            return new b(datePickerV2DomainState);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AbstractC37570d getDatePickerV2DomainState() {
            return this.datePickerV2DomainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.datePickerV2DomainState, ((b) other).datePickerV2DomainState);
        }

        public int hashCode() {
            AbstractC37570d abstractC37570d = this.datePickerV2DomainState;
            if (abstractC37570d == null) {
                return 0;
            }
            return abstractC37570d.hashCode();
        }

        public String toString() {
            return "Loading(datePickerV2DomainState=" + this.datePickerV2DomainState + ")";
        }

        public /* synthetic */ b(AbstractC37570d abstractC37570d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : abstractC37570d);
        }
    }

    private AbstractC32913e() {
    }

    /* JADX INFO: renamed from: sr1.e$a */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, m65681d2 = {"Lsr1/e$a;", "Lsr1/e;", "Lcom/whoop/design/util/TextResource;", "error", "Lsr1/f;", "errorType", "Lwr1/d;", "datePickerV2DomainState", "<init>", "(Lcom/whoop/design/util/TextResource;Lsr1/f;Lwr1/d;)V", "a", "(Lcom/whoop/design/util/TextResource;Lsr1/f;Lwr1/d;)Lsr1/e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Lsr1/f;", "e", "()Lsr1/f;", "c", "Lwr1/d;", "()Lwr1/d;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC32913e {

        /* JADX INFO: renamed from: d */
        public static final int f137147d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource error;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC32914f errorType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC37570d datePickerV2DomainState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource error, EnumC32914f errorType, AbstractC37570d abstractC37570d) {
            super(null);
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(errorType, "errorType");
            this.error = error;
            this.errorType = errorType;
            this.datePickerV2DomainState = abstractC37570d;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m103321b(a aVar, TextResource textResource, EnumC32914f enumC32914f, AbstractC37570d abstractC37570d, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = aVar.error;
            }
            if ((i13 & 2) != 0) {
                enumC32914f = aVar.errorType;
            }
            if ((i13 & 4) != 0) {
                abstractC37570d = aVar.datePickerV2DomainState;
            }
            return aVar.m103322a(textResource, enumC32914f, abstractC37570d);
        }

        /* JADX INFO: renamed from: a */
        public final a m103322a(TextResource error, EnumC32914f errorType, AbstractC37570d datePickerV2DomainState) {
            AbstractC22676k.m65750j(error, "error");
            AbstractC22676k.m65750j(errorType, "errorType");
            return new a(error, errorType, datePickerV2DomainState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC37570d getDatePickerV2DomainState() {
            return this.datePickerV2DomainState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC32914f getErrorType() {
            return this.errorType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.error, aVar.error) && this.errorType == aVar.errorType && AbstractC22676k.m65745e(this.datePickerV2DomainState, aVar.datePickerV2DomainState);
        }

        public int hashCode() {
            int iHashCode = (this.errorType.hashCode() + (this.error.hashCode() * 31)) * 31;
            AbstractC37570d abstractC37570d = this.datePickerV2DomainState;
            return iHashCode + (abstractC37570d == null ? 0 : abstractC37570d.hashCode());
        }

        public String toString() {
            return "Error(error=" + this.error + ", errorType=" + this.errorType + ", datePickerV2DomainState=" + this.datePickerV2DomainState + ")";
        }

        public /* synthetic */ a(TextResource textResource, EnumC32914f enumC32914f, AbstractC37570d abstractC37570d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, enumC32914f, (i13 & 4) != 0 ? null : abstractC37570d);
        }
    }

    /* JADX INFO: renamed from: sr1.e$e */
    @Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u000e\u0012\b\b\u0002\u0010'\u001a\u00020\u000e\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J \u0002\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u000e2\b\b\u0002\u0010'\u001a\u00020\u000e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b?\u00101R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bR\u00101R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bE\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u00101R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bR\u0010X\u001a\u0004\bK\u0010YR\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bV\u0010NR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b?\u0010^\u001a\u0004\bO\u0010_R%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0004\u0018\u0001`\u001e8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bC\u0010bR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b=\u0010c\u001a\u0004\bZ\u0010dR\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bW\u0010e\u001a\u0004\bG\u0010fR\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\bM\u0010g\u001a\u0004\bQ\u0010hR\u0017\u0010&\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bi\u0010L\u001a\u0004\bj\u0010NR\u0017\u0010'\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bI\u0010L\u001a\u0004\bi\u0010NR\u0019\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\bP\u0010n\u001a\u0004\b`\u0010o¨\u0006p"}, m65681d2 = {"Lsr1/e$e;", "Lsr1/e;", "", "Ltr1/b;", "behaviors", "originalListOfBehaviors", "", "notes", "Lsr1/h;", "bottomSheetInfo", "Lsr1/c;", "defaultAnswers", "Lsr1/d;", "shouldShowExitDialogConfirmation", "", "shouldExitNow", "showGradient", "headerText", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "journalBounds", "requestDate", "", "cycleId", "hasUserEditJournal", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "subtitleCallout", "Lur1/d;", "datePickerDomainState", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "Lsr1/g;", "navigationButton", "Lsr1/b;", "customizeJournalDomainState", "Lwr1/d;", "datePickerV2DomainState", "shouldUpdateDatePicker", "shouldRefresh", "Lsr1/i;", "talkTextWidget", "Lcom/whoop/navigation/e;", "onSaveNavigation", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;)V", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lsr1/h;Lsr1/c;Lsr1/d;ZZLjava/lang/String;Lcom/whoop/data/remote/domain/dto/JournalBounds;Ljava/lang/String;JZLcom/whoop/data/remote/domain/dto/SubtitleCallout;Lur1/d;Lh91/b;Lsr1/g;Lsr1/b;Lwr1/d;ZZLsr1/i;Lcom/whoop/navigation/e;)Lsr1/e$e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "q", "Ljava/lang/String;", "o", "d", "Lsr1/h;", "()Lsr1/h;", "e", "Lsr1/c;", "j", "()Lsr1/c;", "f", "Lsr1/d;", "u", "()Lsr1/d;", "g", "Z", "s", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "i", "l", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "m", "()Lcom/whoop/data/remote/domain/dto/JournalBounds;", "k", "r", "J", "()J", "n", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "getSubtitleCallout", "()Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "Lur1/d;", "()Lur1/d;", "p", "Lh91/b;", "()Lh91/b;", "Lsr1/g;", "()Lsr1/g;", "Lsr1/b;", "()Lsr1/b;", "Lwr1/d;", "()Lwr1/d;", "t", "v", "Lsr1/i;", "x", "()Lsr1/i;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC32913e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C34098b> behaviors;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<C34098b> originalListOfBehaviors;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String notes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C32916h bottomSheetInfo;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C32911c defaultAnswers;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C32912d shouldShowExitDialogConfirmation;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final boolean shouldExitNow;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final boolean showGradient;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String headerText;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final JournalBounds journalBounds;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String requestDate;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final long cycleId;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final boolean hasUserEditJournal;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final SubtitleCallout subtitleCallout;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final C35187d datePickerDomainState;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final C17027b<CalendarDateModel> calendarDomainState;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final C32915g navigationButton;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        private final C32910b customizeJournalDomainState;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        private final AbstractC37570d datePickerV2DomainState;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        private final boolean shouldUpdateDatePicker;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        private final boolean shouldRefresh;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        private final C32917i talkTextWidget;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final C9598e onSaveNavigation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<C34098b> behaviors, List<C34098b> originalListOfBehaviors, String notes, C32916h c32916h, C32911c defaultAnswers, C32912d shouldShowExitDialogConfirmation, boolean z4, boolean z13, String headerText, JournalBounds journalBounds, String requestDate, long j7, boolean z14, SubtitleCallout subtitleCallout, C35187d c35187d, C17027b<CalendarDateModel> c17027b, C32915g c32915g, C32910b customizeJournalDomainState, AbstractC37570d abstractC37570d, boolean z15, boolean z16, C32917i c32917i, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(behaviors, "behaviors");
            AbstractC22676k.m65750j(originalListOfBehaviors, "originalListOfBehaviors");
            AbstractC22676k.m65750j(notes, "notes");
            AbstractC22676k.m65750j(defaultAnswers, "defaultAnswers");
            AbstractC22676k.m65750j(shouldShowExitDialogConfirmation, "shouldShowExitDialogConfirmation");
            AbstractC22676k.m65750j(headerText, "headerText");
            AbstractC22676k.m65750j(requestDate, "requestDate");
            AbstractC22676k.m65750j(customizeJournalDomainState, "customizeJournalDomainState");
            this.behaviors = behaviors;
            this.originalListOfBehaviors = originalListOfBehaviors;
            this.notes = notes;
            this.bottomSheetInfo = c32916h;
            this.defaultAnswers = defaultAnswers;
            this.shouldShowExitDialogConfirmation = shouldShowExitDialogConfirmation;
            this.shouldExitNow = z4;
            this.showGradient = z13;
            this.headerText = headerText;
            this.journalBounds = journalBounds;
            this.requestDate = requestDate;
            this.cycleId = j7;
            this.hasUserEditJournal = z14;
            this.subtitleCallout = subtitleCallout;
            this.datePickerDomainState = c35187d;
            this.calendarDomainState = c17027b;
            this.navigationButton = c32915g;
            this.customizeJournalDomainState = customizeJournalDomainState;
            this.datePickerV2DomainState = abstractC37570d;
            this.shouldUpdateDatePicker = z15;
            this.shouldRefresh = z16;
            this.talkTextWidget = c32917i;
            this.onSaveNavigation = c9598e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ e m103333b(e eVar, List list, List list2, String str, C32916h c32916h, C32911c c32911c, C32912d c32912d, boolean z4, boolean z13, String str2, JournalBounds journalBounds, String str3, long j7, boolean z14, SubtitleCallout subtitleCallout, C35187d c35187d, C17027b c17027b, C32915g c32915g, C32910b c32910b, AbstractC37570d abstractC37570d, boolean z15, boolean z16, C32917i c32917i, C9598e c9598e, int i13, Object obj) {
            C9598e c9598e2;
            C32917i c32917i2;
            List list3 = (i13 & 1) != 0 ? eVar.behaviors : list;
            List list4 = (i13 & 2) != 0 ? eVar.originalListOfBehaviors : list2;
            String str4 = (i13 & 4) != 0 ? eVar.notes : str;
            C32916h c32916h2 = (i13 & 8) != 0 ? eVar.bottomSheetInfo : c32916h;
            C32911c c32911c2 = (i13 & 16) != 0 ? eVar.defaultAnswers : c32911c;
            C32912d c32912d2 = (i13 & 32) != 0 ? eVar.shouldShowExitDialogConfirmation : c32912d;
            boolean z17 = (i13 & 64) != 0 ? eVar.shouldExitNow : z4;
            boolean z18 = (i13 & 128) != 0 ? eVar.showGradient : z13;
            String str5 = (i13 & 256) != 0 ? eVar.headerText : str2;
            JournalBounds journalBounds2 = (i13 & 512) != 0 ? eVar.journalBounds : journalBounds;
            String str6 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? eVar.requestDate : str3;
            long j13 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? eVar.cycleId : j7;
            boolean z19 = (i13 & 4096) != 0 ? eVar.hasUserEditJournal : z14;
            List list5 = list3;
            SubtitleCallout subtitleCallout2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? eVar.subtitleCallout : subtitleCallout;
            C35187d c35187d2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? eVar.datePickerDomainState : c35187d;
            C17027b c17027b2 = (i13 & 32768) != 0 ? eVar.calendarDomainState : c17027b;
            C32915g c32915g2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? eVar.navigationButton : c32915g;
            C32910b c32910b2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? eVar.customizeJournalDomainState : c32910b;
            AbstractC37570d abstractC37570d2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? eVar.datePickerV2DomainState : abstractC37570d;
            boolean z24 = (i13 & 524288) != 0 ? eVar.shouldUpdateDatePicker : z15;
            boolean z25 = (i13 & 1048576) != 0 ? eVar.shouldRefresh : z16;
            C32917i c32917i3 = (i13 & 2097152) != 0 ? eVar.talkTextWidget : c32917i;
            if ((i13 & 4194304) != 0) {
                c32917i2 = c32917i3;
                c9598e2 = eVar.onSaveNavigation;
            } else {
                c9598e2 = c9598e;
                c32917i2 = c32917i3;
            }
            return eVar.m103334a(list5, list4, str4, c32916h2, c32911c2, c32912d2, z17, z18, str5, journalBounds2, str6, j13, z19, subtitleCallout2, c35187d2, c17027b2, c32915g2, c32910b2, abstractC37570d2, z24, z25, c32917i2, c9598e2);
        }

        /* JADX INFO: renamed from: a */
        public final e m103334a(List<C34098b> behaviors, List<C34098b> originalListOfBehaviors, String notes, C32916h bottomSheetInfo, C32911c defaultAnswers, C32912d shouldShowExitDialogConfirmation, boolean shouldExitNow, boolean showGradient, String headerText, JournalBounds journalBounds, String requestDate, long cycleId, boolean hasUserEditJournal, SubtitleCallout subtitleCallout, C35187d datePickerDomainState, C17027b<CalendarDateModel> calendarDomainState, C32915g navigationButton, C32910b customizeJournalDomainState, AbstractC37570d datePickerV2DomainState, boolean shouldUpdateDatePicker, boolean shouldRefresh, C32917i talkTextWidget, C9598e onSaveNavigation) {
            AbstractC22676k.m65750j(behaviors, "behaviors");
            AbstractC22676k.m65750j(originalListOfBehaviors, "originalListOfBehaviors");
            AbstractC22676k.m65750j(notes, "notes");
            AbstractC22676k.m65750j(defaultAnswers, "defaultAnswers");
            AbstractC22676k.m65750j(shouldShowExitDialogConfirmation, "shouldShowExitDialogConfirmation");
            AbstractC22676k.m65750j(headerText, "headerText");
            AbstractC22676k.m65750j(requestDate, "requestDate");
            AbstractC22676k.m65750j(customizeJournalDomainState, "customizeJournalDomainState");
            return new e(behaviors, originalListOfBehaviors, notes, bottomSheetInfo, defaultAnswers, shouldShowExitDialogConfirmation, shouldExitNow, showGradient, headerText, journalBounds, requestDate, cycleId, hasUserEditJournal, subtitleCallout, datePickerDomainState, calendarDomainState, navigationButton, customizeJournalDomainState, datePickerV2DomainState, shouldUpdateDatePicker, shouldRefresh, talkTextWidget, onSaveNavigation);
        }

        /* JADX INFO: renamed from: c */
        public final List<C34098b> m103335c() {
            return this.behaviors;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C32916h getBottomSheetInfo() {
            return this.bottomSheetInfo;
        }

        /* JADX INFO: renamed from: e */
        public final C17027b<CalendarDateModel> m103337e() {
            return this.calendarDomainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.behaviors, eVar.behaviors) && AbstractC22676k.m65745e(this.originalListOfBehaviors, eVar.originalListOfBehaviors) && AbstractC22676k.m65745e(this.notes, eVar.notes) && AbstractC22676k.m65745e(this.bottomSheetInfo, eVar.bottomSheetInfo) && AbstractC22676k.m65745e(this.defaultAnswers, eVar.defaultAnswers) && AbstractC22676k.m65745e(this.shouldShowExitDialogConfirmation, eVar.shouldShowExitDialogConfirmation) && this.shouldExitNow == eVar.shouldExitNow && this.showGradient == eVar.showGradient && AbstractC22676k.m65745e(this.headerText, eVar.headerText) && AbstractC22676k.m65745e(this.journalBounds, eVar.journalBounds) && AbstractC22676k.m65745e(this.requestDate, eVar.requestDate) && this.cycleId == eVar.cycleId && this.hasUserEditJournal == eVar.hasUserEditJournal && AbstractC22676k.m65745e(this.subtitleCallout, eVar.subtitleCallout) && AbstractC22676k.m65745e(this.datePickerDomainState, eVar.datePickerDomainState) && AbstractC22676k.m65745e(this.calendarDomainState, eVar.calendarDomainState) && AbstractC22676k.m65745e(this.navigationButton, eVar.navigationButton) && AbstractC22676k.m65745e(this.customizeJournalDomainState, eVar.customizeJournalDomainState) && AbstractC22676k.m65745e(this.datePickerV2DomainState, eVar.datePickerV2DomainState) && this.shouldUpdateDatePicker == eVar.shouldUpdateDatePicker && this.shouldRefresh == eVar.shouldRefresh && AbstractC22676k.m65745e(this.talkTextWidget, eVar.talkTextWidget) && AbstractC22676k.m65745e(this.onSaveNavigation, eVar.onSaveNavigation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C32910b getCustomizeJournalDomainState() {
            return this.customizeJournalDomainState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getCycleId() {
            return this.cycleId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C35187d getDatePickerDomainState() {
            return this.datePickerDomainState;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.behaviors.hashCode() * 31, 31, this.originalListOfBehaviors), 31, this.notes);
            C32916h c32916h = this.bottomSheetInfo;
            int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.shouldShowExitDialogConfirmation.hashCode() + ((this.defaultAnswers.hashCode() + ((iM30450d + (c32916h == null ? 0 : c32916h.hashCode())) * 31)) * 31)) * 31, 31, this.shouldExitNow), 31, this.showGradient), 31, this.headerText);
            JournalBounds journalBounds = this.journalBounds;
            int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30450d((iM30450d2 + (journalBounds == null ? 0 : journalBounds.hashCode())) * 31, 31, this.requestDate), this.cycleId, 31), 31, this.hasUserEditJournal);
            SubtitleCallout subtitleCallout = this.subtitleCallout;
            int iHashCode = (iM8289b + (subtitleCallout == null ? 0 : subtitleCallout.hashCode())) * 31;
            C35187d c35187d = this.datePickerDomainState;
            int iHashCode2 = (iHashCode + (c35187d == null ? 0 : c35187d.hashCode())) * 31;
            C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
            int iHashCode3 = (iHashCode2 + (c17027b == null ? 0 : c17027b.hashCode())) * 31;
            C32915g c32915g = this.navigationButton;
            int iHashCode4 = (this.customizeJournalDomainState.hashCode() + ((iHashCode3 + (c32915g == null ? 0 : c32915g.hashCode())) * 31)) * 31;
            AbstractC37570d abstractC37570d = this.datePickerV2DomainState;
            int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (abstractC37570d == null ? 0 : abstractC37570d.hashCode())) * 31, 31, this.shouldUpdateDatePicker), 31, this.shouldRefresh);
            C32917i c32917i = this.talkTextWidget;
            int iHashCode5 = (iM8289b2 + (c32917i == null ? 0 : c32917i.hashCode())) * 31;
            C9598e c9598e = this.onSaveNavigation;
            return iHashCode5 + (c9598e != null ? c9598e.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AbstractC37570d getDatePickerV2DomainState() {
            return this.datePickerV2DomainState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C32911c getDefaultAnswers() {
            return this.defaultAnswers;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getHasUserEditJournal() {
            return this.hasUserEditJournal;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final JournalBounds getJournalBounds() {
            return this.journalBounds;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final C32915g getNavigationButton() {
            return this.navigationButton;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final C9598e getOnSaveNavigation() {
            return this.onSaveNavigation;
        }

        /* JADX INFO: renamed from: q */
        public final List<C34098b> m103349q() {
            return this.originalListOfBehaviors;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getRequestDate() {
            return this.requestDate;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getShouldExitNow() {
            return this.shouldExitNow;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        public String toString() {
            List<C34098b> list = this.behaviors;
            List<C34098b> list2 = this.originalListOfBehaviors;
            String str = this.notes;
            C32916h c32916h = this.bottomSheetInfo;
            C32911c c32911c = this.defaultAnswers;
            C32912d c32912d = this.shouldShowExitDialogConfirmation;
            boolean z4 = this.shouldExitNow;
            boolean z13 = this.showGradient;
            String str2 = this.headerText;
            JournalBounds journalBounds = this.journalBounds;
            String str3 = this.requestDate;
            long j7 = this.cycleId;
            boolean z14 = this.hasUserEditJournal;
            SubtitleCallout subtitleCallout = this.subtitleCallout;
            C35187d c35187d = this.datePickerDomainState;
            C17027b<CalendarDateModel> c17027b = this.calendarDomainState;
            C32915g c32915g = this.navigationButton;
            C32910b c32910b = this.customizeJournalDomainState;
            AbstractC37570d abstractC37570d = this.datePickerV2DomainState;
            boolean z15 = this.shouldUpdateDatePicker;
            boolean z16 = this.shouldRefresh;
            C32917i c32917i = this.talkTextWidget;
            C9598e c9598e = this.onSaveNavigation;
            StringBuilder sbM124380j = AbstractC38963t7.m124380j("Success(behaviors=", ", originalListOfBehaviors=", list, ", notes=", list2);
            sbM124380j.append(str);
            sbM124380j.append(", bottomSheetInfo=");
            sbM124380j.append(c32916h);
            sbM124380j.append(", defaultAnswers=");
            sbM124380j.append(c32911c);
            sbM124380j.append(", shouldShowExitDialogConfirmation=");
            sbM124380j.append(c32912d);
            sbM124380j.append(", shouldExitNow=");
            AbstractC38963t7.m124392v(sbM124380j, z4, ", showGradient=", z13, ", headerText=");
            sbM124380j.append(str2);
            sbM124380j.append(", journalBounds=");
            sbM124380j.append(journalBounds);
            sbM124380j.append(", requestDate=");
            sbM124380j.append(str3);
            sbM124380j.append(", cycleId=");
            sbM124380j.append(j7);
            sbM124380j.append(", hasUserEditJournal=");
            sbM124380j.append(z14);
            sbM124380j.append(", subtitleCallout=");
            sbM124380j.append(subtitleCallout);
            sbM124380j.append(", datePickerDomainState=");
            sbM124380j.append(c35187d);
            sbM124380j.append(", calendarDomainState=");
            sbM124380j.append(c17027b);
            sbM124380j.append(", navigationButton=");
            sbM124380j.append(c32915g);
            sbM124380j.append(", customizeJournalDomainState=");
            sbM124380j.append(c32910b);
            sbM124380j.append(", datePickerV2DomainState=");
            sbM124380j.append(abstractC37570d);
            sbM124380j.append(", shouldUpdateDatePicker=");
            sbM124380j.append(z15);
            sbM124380j.append(", shouldRefresh=");
            sbM124380j.append(z16);
            sbM124380j.append(", talkTextWidget=");
            sbM124380j.append(c32917i);
            sbM124380j.append(", onSaveNavigation=");
            sbM124380j.append(c9598e);
            sbM124380j.append(")");
            return sbM124380j.toString();
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final C32912d getShouldShowExitDialogConfirmation() {
            return this.shouldShowExitDialogConfirmation;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final boolean getShouldUpdateDatePicker() {
            return this.shouldUpdateDatePicker;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final boolean getShowGradient() {
            return this.showGradient;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final C32917i getTalkTextWidget() {
            return this.talkTextWidget;
        }

        public /* synthetic */ e(List list, List list2, String str, C32916h c32916h, C32911c c32911c, C32912d c32912d, boolean z4, boolean z13, String str2, JournalBounds journalBounds, String str3, long j7, boolean z14, SubtitleCallout subtitleCallout, C35187d c35187d, C17027b c17027b, C32915g c32915g, C32910b c32910b, AbstractC37570d abstractC37570d, boolean z15, boolean z16, C32917i c32917i, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i13 & 2) != 0 ? C25271y.f99162w : list2, str, (i13 & 8) != 0 ? null : c32916h, (i13 & 16) != 0 ? new C32911c(false, false, null, 7, null) : c32911c, (i13 & 32) != 0 ? new C32912d(false, false, 3, null) : c32912d, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? "" : str2, (i13 & 512) != 0 ? null : journalBounds, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? "" : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? -1L : j7, (i13 & 4096) != 0 ? false : z14, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : subtitleCallout, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c35187d, (32768 & i13) != 0 ? null : c17027b, (65536 & i13) != 0 ? null : c32915g, (131072 & i13) != 0 ? new C32910b(false, false, null, null, 15, null) : c32910b, (262144 & i13) != 0 ? null : abstractC37570d, (524288 & i13) != 0 ? false : z15, (1048576 & i13) != 0 ? false : z16, (2097152 & i13) != 0 ? null : c32917i, (i13 & 4194304) != 0 ? null : c9598e);
        }
    }
}
