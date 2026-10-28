package ds1;

import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.dto.JournalBounds;
import com.whoop.data.remote.domain.dto.JournalDayInfo;
import com.whoop.data.remote.domain.dto.QuestionType;
import com.whoop.data.remote.domain.response.journal.BehaviorTrackerDestination;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.JournalMagnitude;
import com.whoop.data.remote.domain.response.journal.JournalMagnitudeValue;
import com.whoop.data.remote.domain.response.journal.TextDisplayOption;
import com.whoop.data.remote.domain.response.journal.TrackerInput;
import com.whoop.data.remote.domain.response.journal.WeeklyPlanGoal;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.models.items.AiChatTalkTextModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.journal.interactors.p062v2.datepicker.DateDisplay;
import com.whoop.journal.interactors.p062v2.datepicker.JournalDatePickerEntry;
import com.whoop.journal.interactors.p062v2.datepicker.TodayCta;
import com.whoop.journal.model.CurrentCycle;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.BehaviorImpactsScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.C9600f;
import gz0.EnumC16313m0;
import h11.C16606a;
import h11.C16613h;
import h11.EnumC16612g;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import jb1.C21535a;
import l02.C23050a;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.AbstractC25269w;
import or2.C28205u0;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import p01.C28582b;
import p01.EnumC28588h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import pr1.AbstractC29492c;
import q83.AbstractC30060g;
import sr1.AbstractC32909a;
import sr1.AbstractC32913e;
import sr1.C32910b;
import sr1.C32911c;
import sr1.C32912d;
import sr1.C32915g;
import sr1.C32916h;
import sr1.C32917i;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import tr1.C34098b;
import tr2.InterfaceC34116n;
import tw0.C34215a;
import ur1.C35187d;
import w71.AbstractC36882f0;
import w71.C36873b;
import w71.C36901t;
import w71.C36906y;
import wb3.AbstractC37056f;
import wr1.AbstractC37570d;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yr1.AbstractC39732c;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ds1.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001aBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010(\u001a\u0004\u0018\u00010'2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J3\u0010.\u001a\u0010\u0012\u0004\u0012\u00020+\u0018\u00010*j\u0004\u0018\u0001`,2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020+\u0018\u00010*j\u0004\u0018\u0001`,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J-\u0010;\u001a\u0004\u0018\u00010:2\b\u00106\u001a\u0004\u0018\u0001052\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b;\u0010<J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u0016\u001a\u00020=H\u0002¢\u0006\u0004\b@\u0010AJ)\u0010I\u001a\u00020H2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bI\u0010JJ1\u0010O\u001a\u00020H2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bO\u0010PJ'\u0010Q\u001a\u00020H2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bQ\u0010RJ1\u0010S\u001a\u00020H2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bS\u0010PJ\u001f\u0010U\u001a\u00020T2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bU\u0010VJ)\u0010W\u001a\u00020T2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\b\u0010G\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010[\u001a\u00020Z2\b\u0010Y\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u0006H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00062\u0006\u0010`\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u0010_J'\u0010c\u001a\u00020T2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010b\u001a\u00020DH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020Z2\u0006\u0010e\u001a\u00020%H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bk\u0010lR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b^\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bk\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bc\u0010s\u001a\u0004\bv\u0010uR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bW\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u0010z\u001a\u0004\b{\u0010|R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b;\u0010}\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0080\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010\u0081\u0001¨\u0006\u0082\u0001"}, m65681d2 = {"Lds1/l;", "", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "", "previousCycleEndTime", "previousCycleStartTime", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/journal/model/CurrentCycle;", "currentCycle", "Ltw0/a;", "bottomSheetReducer", "Ljb1/a;", "designItemReducer", "<init>", "(Lor2/u0;Lzr2/a;JJLtr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/journal/model/CurrentCycle;Ltw0/a;Ljb1/a;)V", "Lsr1/e;", "domainState", "Lds1/k;", "s", "(Lsr1/e;)Lds1/k;", "Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;", "destination", "Lcom/whoop/navigation/e;", "t", "(Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)Lcom/whoop/navigation/e;", "Lwr1/d;", "Lds1/f;", "j", "(Lwr1/d;)Lds1/f;", "Lur1/d;", "datePickerDomainState", "", "requestDate", "Lds1/g;", "k", "(Lur1/d;Ljava/lang/String;)Lds1/g;", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "i", "(Lh91/b;)Lh91/b;", "Lsr1/c;", "viewState", "Lds1/c;", "f", "(Lsr1/c;)Lds1/c;", "Lsr1/h;", "type", "Lsr1/b;", "customizeJournalDomainState", "performFuzzySearch", "Lds1/a;", "g", "(Lsr1/h;Lsr1/b;Ljava/lang/String;)Lds1/a;", "Lsr1/e$e;", "", "Lw71/b;", "r", "(Lsr1/e$e;)Ljava/util/List;", "Ltr1/b;", "behaviorTracker", "", "hasDivider", "Lcom/whoop/data/remote/domain/dto/JournalBounds;", "journalBounds", "Lw71/t;", "q", "(Ltr1/b;ZLcom/whoop/data/remote/domain/dto/JournalBounds;)Lw71/t;", "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;", "tracker", "Lcom/whoop/data/remote/domain/response/journal/TrackerInput;", "value", "p", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;ZLcom/whoop/data/remote/domain/dto/JournalBounds;)Lw71/t;", "n", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;Z)Lw71/t;", "m", "Lw71/y;", "o", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;)Lw71/y;", "e", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;Lcom/whoop/data/remote/domain/dto/JournalBounds;)Lw71/y;", "milliseconds", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/Long;)Lcom/whoop/design/util/TextResource;", "startTime", "b", "(J)J", "endTime", "a", "isSubQuestion", "d", "(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;Z)Lw71/y;", "headerText", "l", "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "Lsr1/d;", "exitDialogInfo", "Lds1/d;", "c", "(Lsr1/d;)Lds1/d;", "Lor2/u0;", "getLocalizedDateTimeFormatter", "()Lor2/u0;", "Lzr2/a;", "getDateAndTimeProvider", "()Lzr2/a;", "J", "getPreviousCycleEndTime", "()J", "getPreviousCycleStartTime", "Ltr2/n;", "getLogger", "()Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lcom/whoop/journal/model/CurrentCycle;", "getCurrentCycle", "()Lcom/whoop/journal/model/CurrentCycle;", "Ltw0/a;", "Ljb1/a;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12342l {

    /* JADX INFO: renamed from: j */
    private static final a f41482j = new a(null);

    /* JADX INFO: renamed from: k */
    public static final int f41483k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long previousCycleEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long previousCycleStartTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final CurrentCycle currentCycle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C34215a bottomSheetReducer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: ds1.l$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lds1/l$a;", "", "<init>", "()V", "", "DETAIL_ID", "Ljava/lang/String;", "SOURCE", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ds1.l$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41493a;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.YES_NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.TOGGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.MAGNITUDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuestionType.LEVEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41493a = iArr;
        }
    }

    /* JADX INFO: renamed from: ds1.l$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f41494w;

        public c(List list) {
            this.f41494w = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            WeeklyPlanGoal weeklyPlanGoal;
            T next;
            T next2;
            JournalBehaviorTracker tracker;
            JournalBehaviorTracker tracker2;
            String str = (String) t15;
            Iterator<T> it = this.f41494w.iterator();
            do {
                weeklyPlanGoal = null;
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C34098b) next).getTracker().getCategory(), str));
            C34098b c34098b = next;
            Boolean boolValueOf = Boolean.valueOf(((c34098b == null || (tracker2 = c34098b.getTracker()) == null) ? null : tracker2.getWeeklyPlanGoal()) != null);
            String str2 = (String) t14;
            Iterator<T> it3 = this.f41494w.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = (T) null;
                    break;
                }
                next2 = it3.next();
            } while (!AbstractC22676k.m65745e(((C34098b) next2).getTracker().getCategory(), str2));
            C34098b c34098b2 = next2;
            if (c34098b2 != null && (tracker = c34098b2.getTracker()) != null) {
                weeklyPlanGoal = tracker.getWeeklyPlanGoal();
            }
            return AbstractC30060g.m92127q(boolValueOf, Boolean.valueOf(weeklyPlanGoal != null));
        }
    }

    /* JADX INFO: renamed from: ds1.l$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Comparator f41495w;

        public d(Comparator comparator) {
            this.f41495w = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            int iCompare = this.f41495w.compare(t14, t15);
            return iCompare != 0 ? iCompare : AbstractC30060g.m92127q((String) t14, (String) t15);
        }
    }

    /* JADX INFO: renamed from: ds1.l$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(((C34098b) t14).getTracker().getQuestionText(), ((C34098b) t15).getTracker().getQuestionText());
        }
    }

    public C12342l(C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, long j7, long j13, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, CurrentCycle currentCycle, C34215a bottomSheetReducer, C21535a designItemReducer) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(currentCycle, "currentCycle");
        AbstractC22676k.m65750j(bottomSheetReducer, "bottomSheetReducer");
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.previousCycleEndTime = j7;
        this.previousCycleStartTime = j13;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.currentCycle = currentCycle;
        this.bottomSheetReducer = bottomSheetReducer;
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: a */
    private final long m34485a(long endTime) {
        return endTime == -1 ? new DateTime(this.dateAndTimeProvider.mo133363b()).withTimeAtStartOfDay().getMillis() : endTime;
    }

    /* JADX INFO: renamed from: b */
    private final long m34486b(long startTime) {
        return startTime == -1 ? new DateTime(this.dateAndTimeProvider.mo133363b()).minusDays(1).withTimeAtStartOfDay().getMillis() : startTime;
    }

    /* JADX INFO: renamed from: c */
    private final C12334d m34487c(C32912d exitDialogInfo) {
        return new C12334d(exitDialogInfo.getShouldShowExitConfirmationDialog(), exitDialogInfo.getDoesUserWantToShowExitConfirmationDialog(), new TextResource.C8688b(AbstractC29492c.f119842e, null, 2, null), new TextResource.C8688b(AbstractC29492c.f119839b, null, 2, null), new TextResource.C8688b(AbstractC29492c.f119841d, null, 2, null), new TextResource.C8688b(AbstractC29492c.f119843f, null, 2, null), new TextResource.C8688b(AbstractC29492c.f119840c, null, 2, null));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:77:0x011d  */
    /* JADX INFO: renamed from: d */
    private final C36906y m34488d(JournalBehaviorTracker tracker, TrackerInput value, boolean isSubQuestion) {
        AbstractC36882f0 dVar;
        Float maxInclusive;
        Float minInclusive;
        AbstractC36882f0 eVar;
        JournalMagnitude magnitude;
        String label;
        Integer numValueOf;
        List<JournalMagnitudeValue> stepValues;
        List<JournalMagnitudeValue> stepValues2;
        JournalMagnitudeValue journalMagnitudeValue;
        List<JournalMagnitudeValue> stepValues3;
        Double magnitudeInputValue = value.getMagnitudeInputValue();
        JournalMagnitude magnitude2 = tracker.getMagnitude();
        QuestionType questionType = magnitude2 != null ? magnitude2.getQuestionType() : null;
        int i13 = questionType == null ? -1 : b.f41493a[questionType.ordinal()];
        int iFloatValue = 0;
        if (i13 != 3) {
            if (i13 != 4) {
                dVar = new AbstractC36882f0.b(magnitudeInputValue, null, null, 0, null, 30, null);
            } else {
                JournalMagnitude magnitude3 = tracker.getMagnitude();
                Integer numValueOf2 = (magnitude3 == null || (stepValues3 = magnitude3.getStepValues()) == null) ? null : Integer.valueOf(stepValues3.size());
                JournalMagnitude magnitude4 = tracker.getMagnitude();
                Integer numValueOf3 = (magnitude4 == null || (stepValues2 = magnitude4.getStepValues()) == null || (journalMagnitudeValue = stepValues2.get(0)) == null) ? null : Integer.valueOf((int) journalMagnitudeValue.getValue());
                JournalMagnitude magnitude5 = tracker.getMagnitude();
                if (magnitude5 == null || (stepValues = magnitude5.getStepValues()) == null) {
                    numValueOf = null;
                } else {
                    JournalMagnitudeValue journalMagnitudeValue2 = stepValues.get(numValueOf2 != null ? numValueOf2.intValue() - 1 : 0);
                    if (journalMagnitudeValue2 != null) {
                        numValueOf = Integer.valueOf((int) journalMagnitudeValue2.getValue());
                    } else {
                        numValueOf = null;
                    }
                }
                Integer numValueOf4 = magnitudeInputValue != null ? Integer.valueOf((int) magnitudeInputValue.doubleValue()) : null;
                int iIntValue = numValueOf3 != null ? numValueOf3.intValue() : 0;
                int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
                int iM34505a = AbstractC12343m.m34505a(tracker);
                JournalMagnitude magnitude6 = tracker.getMagnitude();
                eVar = new AbstractC36882f0.e(numValueOf4, iIntValue, iIntValue2, iM34505a, AbstractC12343m.m34506b(magnitude6 != null ? magnitude6.getStepValues() : null, magnitudeInputValue != null ? Integer.valueOf((int) magnitudeInputValue.doubleValue()) : null));
            }
            int id4 = tracker.getId();
            magnitude = tracker.getMagnitude();
            if (magnitude != null || (label = magnitude.getLabel()) == null) {
                label = "";
            }
            return new C36906y(id4, tracker.getTitle(), label, AbstractC12343m.m34507c(tracker.getMagnitude()), isSubQuestion, true, eVar, null, m34504t(tracker.getDestination()), null, 640, null);
        }
        Integer numValueOf5 = magnitudeInputValue != null ? Integer.valueOf((int) magnitudeInputValue.doubleValue()) : null;
        JournalMagnitude magnitude7 = tracker.getMagnitude();
        int iFloatValue2 = (magnitude7 == null || (minInclusive = magnitude7.getMinInclusive()) == null) ? 0 : (int) minInclusive.floatValue();
        JournalMagnitude magnitude8 = tracker.getMagnitude();
        if (magnitude8 != null && (maxInclusive = magnitude8.getMaxInclusive()) != null) {
            iFloatValue = (int) maxInclusive.floatValue();
        }
        dVar = new AbstractC36882f0.d(numValueOf5, iFloatValue2, iFloatValue);
        eVar = dVar;
        int id5 = tracker.getId();
        magnitude = tracker.getMagnitude();
        if (magnitude != null) {
            label = "";
        } else {
            label = "";
        }
        return new C36906y(id5, tracker.getTitle(), label, AbstractC12343m.m34507c(tracker.getMagnitude()), isSubQuestion, true, eVar, null, m34504t(tracker.getDestination()), null, 640, null);
    }

    /* JADX INFO: renamed from: e */
    private final C36906y m34489e(JournalBehaviorTracker tracker, TrackerInput value, JournalBounds journalBounds) {
        long jM34485a;
        String currentCycleSleepLower;
        long jM34486b = (journalBounds == null || (currentCycleSleepLower = journalBounds.getCurrentCycleSleepLower()) == null) ? m34486b(this.previousCycleStartTime) : new DateTime(currentCycleSleepLower).getMillis();
        if (journalBounds != null) {
            String nextCycleSleepLower = journalBounds.getNextCycleSleepLower();
            jM34485a = nextCycleSleepLower != null ? new DateTime(nextCycleSleepLower).getMillis() : DateTime.now().getMillis();
        } else {
            jM34485a = m34485a(this.previousCycleEndTime);
        }
        long j7 = jM34485a;
        TextResource textResourceM34492h = m34492h(value.getTimeInputValue());
        Long timeInputValue = value.getTimeInputValue();
        AbstractC36882f0.g gVar = new AbstractC36882f0.g(textResourceM34492h, jM34486b, j7, timeInputValue != null ? timeInputValue.longValue() : 0L);
        int id4 = tracker.getId();
        String timeLabel = tracker.getTimeLabel();
        String str = timeLabel == null ? "" : timeLabel;
        String timeContextLabel = tracker.getTimeContextLabel();
        return new C36906y(id4, null, str, timeContextLabel == null ? "" : timeContextLabel, true, true, gVar, null, m34504t(tracker.getDestination()), null, 642, null);
    }

    /* JADX INFO: renamed from: f */
    private final C12333c m34490f(C32911c viewState) {
        return new C12333c(viewState.getIsDefaultAnswerToggleVisible(), viewState.getIsDefaultAnswerToggleEnabled());
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC12331a m34491g(C32916h type, C32910b customizeJournalDomainState, String performFuzzySearch) {
        if (type == null) {
            return null;
        }
        AbstractC32909a componentToShow = type.getComponentToShow();
        if (componentToShow instanceof AbstractC32909a.c) {
            return new AbstractC12331a.c(((AbstractC32909a.c) type.getComponentToShow()).getTime().length() > 0 ? new LocalTime(Long.parseLong(((AbstractC32909a.c) type.getComponentToShow()).getTime())) : new LocalTime(this.previousCycleEndTime), this.localizedDateTimeFormatter.m85383l());
        }
        if (componentToShow instanceof AbstractC32909a.b) {
            String title = type.getTitle();
            String str = title == null ? "" : title;
            String questionTitle = type.getQuestionTitle();
            return new AbstractC12331a.b(str, questionTitle == null ? "" : questionTitle, ((AbstractC32909a.b) type.getComponentToShow()).getValue() != 0.0d ? String.valueOf(((AbstractC32909a.b) type.getComponentToShow()).getValue()) : "", ((AbstractC32909a.b) type.getComponentToShow()).getMin(), ((AbstractC32909a.b) type.getComponentToShow()).getMax(), ((AbstractC32909a.b) type.getComponentToShow()).getUnit());
        }
        if (!(componentToShow instanceof AbstractC32909a.a)) {
            return null;
        }
        C33050g bottomSheet = customizeJournalDomainState.getBottomSheet();
        C33050g c33050g = bottomSheet == null ? new C33050g(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null) : bottomSheet;
        boolean isLoading = customizeJournalDomainState.getIsLoading();
        boolean isError = customizeJournalDomainState.getIsError();
        List<String> listM104636k = c33050g.m104636k();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM104636k.iterator();
        while (it.hasNext()) {
            Integer numM125932Q = AbstractC39421y.m125932Q((String) it.next());
            if (numM125932Q != null) {
                arrayList.add(numM125932Q);
            }
        }
        List<C33052i> listM104635j = c33050g.m104635j();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = listM104635j.iterator();
        while (it3.hasNext()) {
            AbstractC25265s.m74141p0(arrayList2, ((C33052i) it3.next()).m104651f());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((C33053j) obj).getIsSelected()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((C33053j) it4.next()).getId());
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            Integer numM125932Q2 = AbstractC39421y.m125932Q((String) it5.next());
            if (numM125932Q2 != null) {
                arrayList5.add(numM125932Q2);
            }
        }
        C34215a c34215a = this.bottomSheetReducer;
        return new AbstractC12331a.a(isLoading, isError, performFuzzySearch, arrayList, arrayList5, C34215a.m108144f(c34215a, c33050g, c34215a.m108145b(c33050g), this.bottomSheetReducer.m108146c(c33050g), null, null, 24, null));
    }

    /* JADX INFO: renamed from: h */
    private final TextResource m34492h(Long milliseconds) {
        TextResource textResourceM21278l;
        long j7 = this.previousCycleStartTime;
        if (milliseconds != null && milliseconds.longValue() == j7) {
            return new TextResource.C8688b(AbstractC29492c.f119857t, new TextResource.AbstractC8690d.a(C28205u0.m85378i(this.localizedDateTimeFormatter, AbstractC39732c.m127141b(milliseconds.longValue()), false, 2, null)));
        }
        return (milliseconds == null || (textResourceM21278l = AbstractC8693b.m21278l(C28205u0.m85378i(this.localizedDateTimeFormatter, AbstractC39732c.m127141b(milliseconds.longValue()), false, 2, null))) == null) ? AbstractC8693b.m21267a() : textResourceM21278l;
    }

    /* JADX INFO: renamed from: i */
    private final C17027b<CalendarDateModel> m34493i(C17027b<CalendarDateModel> calendarDomainState) {
        return calendarDomainState;
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC12336f m34494j(AbstractC37570d domainState) {
        AbstractC37570d.c cVar;
        EnumC12338h enumC12338h;
        EnumC16612g enumC16612gM34476a;
        if (domainState == null) {
            return null;
        }
        if (domainState.equals(AbstractC37570d.a.f160655a)) {
            return AbstractC12336f.a.f41453a;
        }
        if (domainState.equals(AbstractC37570d.b.f160656a)) {
            return AbstractC12336f.b.f41454a;
        }
        if (!(domainState instanceof AbstractC37570d.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC37570d.c cVar2 = (AbstractC37570d.c) domainState;
        TodayCta todayCta = cVar2.getAccumulator().getResponse().getTodayCta();
        C12346p c12346p = todayCta != null ? new C12346p(todayCta.getText(), todayCta.getDate()) : null;
        EnumC16313m0 leftCalendarDisplayIcon = cVar2.getAccumulator().getResponse().getLeftCalendarDisplayIcon();
        EnumC16313m0 rightCalendarDisplayIcon = cVar2.getAccumulator().getResponse().getRightCalendarDisplayIcon();
        boolean shouldAnimate = cVar2.getAccumulator().getShouldAnimate();
        List<JournalDatePickerEntry> items = cVar2.getAccumulator().getResponse().getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (JournalDatePickerEntry journalDatePickerEntry : items) {
            C16606a c16606a = new C16606a(journalDatePickerEntry.getDateDisplay().getDay(), String.valueOf(journalDatePickerEntry.getDateDisplay().getDate()));
            DateDisplay multiDayCycleDateDisplay = journalDatePickerEntry.getMultiDayCycleDateDisplay();
            C16606a c16606a2 = multiDayCycleDateDisplay != null ? new C16606a(multiDayCycleDateDisplay.getDay(), String.valueOf(multiDayCycleDateDisplay.getDate())) : null;
            boolean zM65745e = AbstractC22676k.m65745e(journalDatePickerEntry.getDate(), cVar2.getAccumulator().getSelectedDate());
            if (AbstractC22676k.m65745e(cVar2.getAccumulator().m120593c().get(journalDatePickerEntry.getDate()), Boolean.TRUE)) {
                enumC16612gM34476a = EnumC16612g.COMPLETED_JOURNAL;
                cVar = cVar2;
            } else {
                String upperCase = journalDatePickerEntry.getJournalEntryStatus().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                EnumC12338h enumC12338h2 = EnumC12338h.INVALID;
                EnumC12338h[] enumC12338hArrValues = EnumC12338h.values();
                int length = enumC12338hArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        cVar = cVar2;
                        enumC12338h = null;
                        break;
                    }
                    enumC12338h = enumC12338hArrValues[i13];
                    cVar = cVar2;
                    if (AbstractC22676k.m65745e(enumC12338h.name(), upperCase)) {
                        break;
                    }
                    i13++;
                    cVar2 = cVar;
                }
                if (enumC12338h != null) {
                    enumC12338h2 = enumC12338h;
                }
                enumC16612gM34476a = AbstractC12339i.m34476a(enumC12338h2);
            }
            arrayList.add(new C16613h(c16606a, c16606a2, zM65745e, enumC16612gM34476a, journalDatePickerEntry.getDate(), journalDatePickerEntry.getCycleId(), null, true, !AbstractC22676k.m65745e(journalDatePickerEntry.getDate(), cVar.getAccumulator().getSelectedDate()) && AbstractC22676k.m65745e(journalDatePickerEntry.getDate(), cVar.getAccumulator().getResponse().getTodayDate()), null, null, null, false, null, 15872, null));
            cVar2 = cVar;
        }
        return new AbstractC12336f.c(c12346p, leftCalendarDisplayIcon, rightCalendarDisplayIcon, arrayList, shouldAnimate);
    }

    /* JADX INFO: renamed from: k */
    private final C12337g m34495k(C35187d datePickerDomainState, String requestDate) {
        String date;
        String date2;
        if (datePickerDomainState == null) {
            return null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(datePickerDomainState.getTitle());
        boolean z4 = false;
        if (datePickerDomainState.getPreviousDay() != null) {
            z4 = true;
        }
        JournalDayInfo previousDay = datePickerDomainState.getPreviousDay();
        String str = "";
        if (previousDay == null || (date = previousDay.getDate()) == null) {
            date = "";
        }
        JournalDayInfo previousDay2 = datePickerDomainState.getPreviousDay();
        Long cycleId = previousDay2 != null ? previousDay2.getCycleId() : null;
        z4 = datePickerDomainState.getNextDay() != null;
        JournalDayInfo nextDay = datePickerDomainState.getNextDay();
        if (nextDay != null && (date2 = nextDay.getDate()) != null) {
            str = date2;
        }
        JournalDayInfo nextDay2 = datePickerDomainState.getNextDay();
        return new C12337g(null, textResourceM21278l, z4, date, cycleId, z4, str, nextDay2 != null ? nextDay2.getCycleId() : null, datePickerDomainState.getIsLoading(), requestDate, 1, null);
    }

    /* JADX INFO: renamed from: l */
    private final TextResource m34496l(String headerText) {
        return new TextResource.C8691e(headerText);
    }

    /* JADX INFO: renamed from: m */
    private final C36901t m34497m(JournalBehaviorTracker tracker, TrackerInput value, boolean hasDivider, JournalBounds journalBounds) {
        boolean z4 = false;
        C36906y c36906yM34488d = m34488d(tracker, value, false);
        List listM118958J = AbstractC37056f.m118958J(m34489e(tracker, value, journalBounds));
        if (value.getMagnitudeInputValue() != null && !listM118958J.isEmpty()) {
            z4 = true;
        }
        return new C36901t(c36906yM34488d, null, z4, false, hasDivider, null, null, 106, null);
    }

    /* JADX INFO: renamed from: n */
    private final C36901t m34498n(JournalBehaviorTracker tracker, TrackerInput value, boolean hasDivider) {
        int id4 = tracker.getId();
        String title = tracker.getTitle();
        String questionText = tracker.getQuestionText();
        if (questionText == null) {
            questionText = "";
        }
        return new C36901t(new C36906y(id4, title, questionText, "", false, true, new AbstractC36882f0.h(value.getAnsweredYes()), null, m34504t(tracker.getDestination()), null, 640, null), null, false, false, hasDivider, null, null, 110, null);
    }

    /* JADX INFO: renamed from: o */
    private final C36906y m34499o(JournalBehaviorTracker tracker, TrackerInput value) {
        Boolean boolValueOf;
        C28582b c28582b;
        CircularProgressIndicator circularProgressIndicator;
        CurrentProgressSteps currentProgressSteps;
        Object next;
        Object next2;
        CircularProgressStyle style;
        int id4 = tracker.getId();
        String questionText = tracker.getQuestionText();
        if (questionText == null) {
            questionText = "";
        }
        String str = questionText;
        String title = tracker.getTitle();
        Boolean answeredYes = value.getAnsweredYes();
        Boolean boolValueOf2 = null;
        if (answeredYes != null) {
            boolean zBooleanValue = answeredYes.booleanValue();
            WeeklyPlanGoal weeklyPlanGoal = tracker.getWeeklyPlanGoal();
            boolValueOf = Boolean.valueOf(zBooleanValue ^ (weeklyPlanGoal != null ? weeklyPlanGoal.isAvoided() : false));
        } else {
            boolValueOf = null;
        }
        AbstractC36882f0.i iVar = new AbstractC36882f0.i(boolValueOf);
        WeeklyPlanGoal weeklyPlanGoal2 = tracker.getWeeklyPlanGoal();
        if (weeklyPlanGoal2 == null || (circularProgressIndicator = weeklyPlanGoal2.getCircularProgressIndicator()) == null || (currentProgressSteps = circularProgressIndicator.getCurrentProgressSteps()) == null) {
            c28582b = null;
        } else {
            int currentStep = currentProgressSteps.getCurrentStep();
            int totalSteps = currentProgressSteps.getTotalSteps();
            Iterator<T> it = currentProgressSteps.getTextDisplayOptions().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((TextDisplayOption) next).getValue() != currentProgressSteps.getCurrentStep());
            TextDisplayOption textDisplayOption = (TextDisplayOption) next;
            String label = textDisplayOption != null ? textDisplayOption.getLabel() : null;
            Iterator<T> it3 = currentProgressSteps.getTextDisplayOptions().iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((TextDisplayOption) next2).getValue() != currentProgressSteps.getCurrentStep());
            TextDisplayOption textDisplayOption2 = (TextDisplayOption) next2;
            if (textDisplayOption2 != null && (style = textDisplayOption2.getStyle()) != null) {
                boolValueOf2 = Boolean.valueOf(style == CircularProgressStyle.WEEKLY_PLAN_COMPLETE);
            }
            c28582b = new C28582b(totalSteps, currentStep, 0.0f, label, null, null, boolValueOf2, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.STEPS, null, 786356, null);
        }
        return new C36906y(id4, title, str, "", false, true, iVar, c28582b, m34504t(tracker.getDestination()), null, 512, null);
    }

    /* JADX INFO: renamed from: p */
    private final C36901t m34500p(JournalBehaviorTracker tracker, TrackerInput value, boolean hasDivider, JournalBounds journalBounds) {
        C36906y c36906yM34499o = m34499o(tracker, value);
        ArrayList arrayList = new ArrayList();
        if (tracker.getMagnitude() != null) {
            arrayList.add(m34488d(tracker, value, true));
        }
        if (tracker.getTimeLabel() != null) {
            arrayList.add(m34489e(tracker, value, journalBounds));
        }
        return new C36901t(c36906yM34499o, arrayList, AbstractC22676k.m65745e(value.getAnsweredYes(), Boolean.TRUE) && !arrayList.isEmpty(), false, hasDivider, null, null, 104, null);
    }

    /* JADX INFO: renamed from: q */
    private final C36901t m34501q(C34098b behaviorTracker, boolean hasDivider, JournalBounds journalBounds) {
        JournalBehaviorTracker tracker = behaviorTracker.getTracker();
        TrackerInput value = behaviorTracker.getValue();
        QuestionType questionType = tracker.getQuestionType();
        int i13 = questionType == null ? -1 : b.f41493a[questionType.ordinal()];
        if (i13 != 1) {
            return i13 != 2 ? m34497m(tracker, value, hasDivider, journalBounds) : m34498n(tracker, value, hasDivider);
        }
        return m34500p(tracker, value, hasDivider, journalBounds);
    }

    /* JADX INFO: renamed from: r */
    private final List<C36873b> m34502r(AbstractC32913e.e domainState) {
        List<C34098b> listM103335c = domainState.m103335c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C34098b c34098b : listM103335c) {
            if (linkedHashMap.containsKey(c34098b.getTracker().getCategory())) {
                List list = (List) linkedHashMap.get(c34098b.getTracker().getCategory());
                if (list != null) {
                    list.add(c34098b);
                }
            } else {
                linkedHashMap.put(c34098b.getTracker().getCategory(), AbstractC37056f.m118964P(c34098b));
            }
        }
        TreeMap treeMapM74006o0 = AbstractC25247g0.m74006o0(linkedHashMap, new d(new c(listM103335c)));
        Iterator it = treeMapM74006o0.entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            AbstractC22676k.m65749i(value, "<get-value>(...)");
            List list2 = (List) value;
            if (list2.size() > 1) {
                AbstractC25269w.m74166l0(list2, new e());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMapM74006o0.entrySet()) {
            String str = (String) entry.getKey();
            List list3 = (List) entry.getValue();
            AbstractC22676k.m65747g(list3);
            List list4 = list3;
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
            int i13 = 0;
            for (Object obj : list4) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                arrayList2.add(m34501q((C34098b) obj, i13 > 0, domainState.getJournalBounds()));
                i13 = i14;
            }
            AbstractC22676k.m65747g(str);
            arrayList.add(new C36873b(arrayList2, str));
        }
        return AbstractC25265s.m74093D1(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public final C12341k m34503s(AbstractC32913e domainState) {
        C12332b c12332b;
        EnumC16313m0 enumC16313m0;
        String autoSaveInstructionText;
        AiChatTalkTextModel widget;
        String title;
        Integer questionId;
        String questionTitle;
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState instanceof AbstractC32913e.a) {
            AbstractC32913e.a aVar = (AbstractC32913e.a) domainState;
            return new C12341k(false, new C12340j(aVar.getError(), aVar.getErrorType()), false, false, false, null, 48, null);
        }
        if (domainState instanceof AbstractC32913e.b) {
            return new C12341k(true, null, false, false, false, null, 62, null);
        }
        if (domainState instanceof AbstractC32913e.d) {
            return new C12341k(false, null, true, false, false, null, 59, null);
        }
        if (domainState instanceof AbstractC32913e.c) {
            return new C12341k(false, null, false, true, false, null, 55, null);
        }
        if (!(domainState instanceof AbstractC32913e.e)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC32913e.e eVar = (AbstractC32913e.e) domainState;
        AbstractC12336f abstractC12336fM34494j = m34494j(eVar.getDatePickerV2DomainState());
        C12344n c12344n = null;
        if (abstractC12336fM34494j instanceof AbstractC12336f.a) {
            return new C12341k(false, new C12340j(null, null, 3, null), false, false, false, null, 48, null);
        }
        AbstractC12331a abstractC12331aM34491g = m34491g(eVar.getBottomSheetInfo(), eVar.getCustomizeJournalDomainState(), eVar.getCustomizeJournalDomainState().getPerformFuzzySearch());
        boolean showGradient = eVar.getShowGradient();
        C12333c c12333cM34490f = m34490f(eVar.getDefaultAnswers());
        List<C36873b> listM34502r = m34502r(eVar);
        String notes = eVar.getNotes();
        TextResource textResourceM34496l = m34496l(eVar.getHeaderText());
        if (abstractC12331aM34491g != null) {
            C32916h bottomSheetInfo = eVar.getBottomSheetInfo();
            String str = "";
            if (bottomSheetInfo == null || (title = bottomSheetInfo.getTitle()) == null) {
                title = "";
            }
            C32916h bottomSheetInfo2 = eVar.getBottomSheetInfo();
            if (bottomSheetInfo2 != null && (questionTitle = bottomSheetInfo2.getQuestionTitle()) != null) {
                str = questionTitle;
            }
            C32916h bottomSheetInfo3 = eVar.getBottomSheetInfo();
            c12332b = new C12332b(abstractC12331aM34491g, title, str, (bottomSheetInfo3 == null || (questionId = bottomSheetInfo3.getQuestionId()) == null) ? -1 : questionId.intValue(), null, 16, null);
        } else {
            c12332b = null;
        }
        boolean hasUserEditJournal = eVar.getHasUserEditJournal();
        C12334d c12334dM34487c = m34487c(eVar.getShouldShowExitDialogConfirmation());
        boolean shouldExitNow = eVar.getShouldExitNow();
        C12337g c12337gM34495k = m34495k(eVar.getDatePickerDomainState(), eVar.getRequestDate());
        C17027b<CalendarDateModel> c17027bM34493i = m34493i(eVar.m103337e());
        boolean shouldUpdateDatePicker = eVar.getShouldUpdateDatePicker();
        boolean shouldRefresh = eVar.getShouldRefresh();
        C32917i talkTextWidget = eVar.getTalkTextWidget();
        InterfaceC25312u interfaceC25312uM60544l = (talkTextWidget == null || (widget = talkTextWidget.getWidget()) == null) ? null : this.designItemReducer.m60544l(widget);
        C32917i talkTextWidget2 = eVar.getTalkTextWidget();
        boolean autoSaveEnabled = talkTextWidget2 != null ? talkTextWidget2.getAutoSaveEnabled() : false;
        C32917i talkTextWidget3 = eVar.getTalkTextWidget();
        String bottomButtonText = talkTextWidget3 != null ? talkTextWidget3.getBottomButtonText() : null;
        C32917i talkTextWidget4 = eVar.getTalkTextWidget();
        AiAction aiAction = talkTextWidget4 != null ? talkTextWidget4.getAiAction() : null;
        C32917i talkTextWidget5 = eVar.getTalkTextWidget();
        String str2 = (talkTextWidget5 == null || (autoSaveInstructionText = talkTextWidget5.getAutoSaveInstructionText()) == null || AbstractC39414r.m125890i0(autoSaveInstructionText)) ? null : autoSaveInstructionText;
        C32915g navigationButton = eVar.getNavigationButton();
        if (navigationButton != null) {
            String icon = navigationButton.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.SETTINGS;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                int i14 = length;
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13++;
                length = i14;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            int whoopIcon = enumC16313m1.toWhoopIcon();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(navigationButton.getTitleDisplay());
            AppScreen.Companion companion = AppScreen.INSTANCE;
            c12344n = new C12344n(whoopIcon, textResourceM21278l, new C9598e(AppScreen.Companion.m23028b(companion, navigationButton.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), null, 2, null), new C9600f(new C23050a(null, 1, null)).m23135a(AppScreen.Companion.m23028b(companion, navigationButton.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), null, 2, null), null), null, 4, null));
        }
        return new C12341k(false, null, false, false, showGradient, new C12335e(c12333cM34490f, listM34502r, notes, textResourceM34496l, c12332b, c12334dM34487c, true, hasUserEditJournal, shouldExitNow, null, c12337gM34495k, c17027bM34493i, c12344n, abstractC12336fM34494j, shouldUpdateDatePicker, shouldRefresh, interfaceC25312uM60544l, autoSaveEnabled, bottomButtonText, aiAction, str2, eVar.getOnSaveNavigation()), 15, null);
    }

    /* JADX INFO: renamed from: t */
    public final C9598e m34504t(BehaviorTrackerDestination destination) {
        if (destination == null) {
            return null;
        }
        AppScreen.C9265a1 c9265a1 = AppScreen.C9265a1.f27467w;
        Object obj = destination.getParameters().get("detail_id");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        Object obj2 = destination.getParameters().get("source");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        return new C9598e(c9265a1, new BehaviorImpactsScreenModel(str, str2 != null ? str2 : ""), null, 4, null);
    }

    public /* synthetic */ C12342l(C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, long j7, long j13, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, CurrentCycle currentCycle, C34215a c34215a, C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28205u0, interfaceC41070a, j7, j13, interfaceC34116n, featureFlagChecker, currentCycle, c34215a, (i13 & 256) != 0 ? new C21535a(null, null, 3, null) : c21535a);
    }
}
