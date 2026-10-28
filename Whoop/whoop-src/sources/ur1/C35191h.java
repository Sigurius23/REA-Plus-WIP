package ur1;

import com.mapbox.common.HttpHeaders;
import com.whoop.data.interactor.JournalNewQuestionState;
import com.whoop.data.interactor.JournalNewQuestionsInteractor;
import com.whoop.data.remote.domain.request.JournalTrackerInput;
import com.whoop.data.remote.domain.request.JournalTrackerRequest;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h91.C17027b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25267u;
import od1.AbstractC27845h;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr1.AbstractC32913e;
import sr1.C32911c;
import sr1.EnumC32914f;
import tr1.AbstractC34099c;
import tr1.C34098b;
import tr1.InterfaceC34101e;
import tr1.InterfaceC34102f;
import tr2.InterfaceC34116n;
import vr1.AbstractC36305c;
import vr1.C36306d;
import wr1.AbstractC37568b;
import wr1.AbstractC37570d;
import wr1.C37567a;
import wr1.C37569c;
import wr1.C37571e;
import yr1.AbstractC39732c;

/* JADX INFO: renamed from: ur1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Ba\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010&\u001a\u00020%2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010+\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00032\u0006\u0010)\u001a\u00020-2\u0006\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\b.\u0010/J#\u00104\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0002¢\u0006\u0004\b4\u00105J#\u00107\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020600H\u0002¢\u0006\u0004\b7\u00105J#\u00109\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020800H\u0002¢\u0006\u0004\b9\u00105J#\u0010;\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020:00H\u0002¢\u0006\u0004\b;\u00105J#\u0010=\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020<00H\u0002¢\u0006\u0004\b=\u00105J#\u0010?\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020>00H\u0002¢\u0006\u0004\b?\u00105J#\u0010A\u001a\b\u0012\u0004\u0012\u000203002\f\u00102\u001a\b\u0012\u0004\u0012\u00020@00H\u0002¢\u0006\u0004\bA\u00105J#\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0003002\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016¢\u0006\u0004\bB\u00105J)\u0010G\u001a\u00020E2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010D\u001a\u00020C2\b\b\u0002\u0010F\u001a\u00020EH\u0000¢\u0006\u0004\bG\u0010HJ#\u0010L\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010K\u001a\u00020\u0012H\u0000¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010bR\u0014\u0010d\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010c¨\u0006e"}, m65681d2 = {"Lur1/h;", "Lod1/g;", "Lur1/g;", "Lsr1/e;", "Lur1/m;", "fetchInteractor", "Lur1/j;", "editEntryInteractor", "Lur1/f;", "configInteractor", "Lvr1/d;", "calendarInteractor", "Lur1/c;", "customizeJournalInteractor", "Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;", "journalNewQuestionsInteractor", "Lwr1/e;", "datePickerInteractor", "", "requestDate", "", "cycleId", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lur1/m;Lur1/j;Lur1/f;Lvr1/d;Lur1/c;Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;Lwr1/e;Ljava/lang/String;JLtr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lsr1/e$e;", "successState", "Lsr1/e$d;", "t", "(Lsr1/e$e;)Lsr1/e$d;", "", "Ltr1/b;", "behaviors", "notes", "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "s", "(Ljava/util/List;Ljava/lang/String;)Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "Lur1/n$j;", "internalAction", "currentState", "q", "(Lur1/n$j;Lsr1/e$e;)Lsr1/e;", "Lur1/n$w;", "r", "(Lur1/n$w;Lsr1/e$e;)Lsr1/e;", "Lec3/l;", "Lur1/l;", "upstream", "Lur1/n;", "p", "(Lec3/l;)Lec3/l;", "Lur1/i;", "o", "Lur1/e;", "l", "Lvr1/c;", "k", "Lur1/b;", "m", "Lcom/whoop/data/interactor/JournalNewQuestionState;", "v", "Lwr1/b;", "n", "interact", "Lsr1/c;", "newDefaultAnswers", "", "autoSaveEnabled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lsr1/e;Lsr1/c;Z)Z", "Lwr1/d;", "datePickerState", HttpHeaders.DATE, "u", "(Lwr1/d;Ljava/lang/String;)Lwr1/d;", "a", "Lur1/m;", "b", "Lur1/j;", "c", "Lur1/f;", "d", "Lvr1/d;", "e", "Lur1/c;", "f", "Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;", "g", "Lwr1/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/lang/String;", "i", "J", "j", "Ltr2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lsr1/e;", "initial", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35191h implements InterfaceC27844g<InterfaceC35190g, AbstractC32913e> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C35196m fetchInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35193j editEntryInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35189f configInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36306d calendarInteractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C35186c customizeJournalInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final JournalNewQuestionsInteractor journalNewQuestionsInteractor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37571e datePickerInteractor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String requestDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long cycleId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AbstractC32913e initial;

    /* JADX INFO: renamed from: ur1.h$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149434w;

        /* JADX INFO: renamed from: ur1.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42495a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149435w;

            /* JADX INFO: renamed from: ur1.h$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$calendarInteractor$$inlined$map$1$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42496a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149436E;

                /* JADX INFO: renamed from: F */
                Object f149437F;

                /* JADX INFO: renamed from: G */
                Object f149438G;

                /* JADX INFO: renamed from: H */
                int f149439H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149440w;

                /* JADX INFO: renamed from: x */
                int f149441x;

                /* JADX INFO: renamed from: y */
                Object f149442y;

                public C42496a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149440w = obj;
                    this.f149441x |= Integer.MIN_VALUE;
                    return C42495a.this.emit(null, this);
                }
            }

            public C42495a(InterfaceC13062m interfaceC13062m) {
                this.f149435w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42496a c42496a;
                if (interfaceC30057d instanceof C42496a) {
                    c42496a = (C42496a) interfaceC30057d;
                    int i13 = c42496a.f149441x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42496a.f149441x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42496a = new C42496a(interfaceC30057d);
                    }
                } else {
                    c42496a = new C42496a(interfaceC30057d);
                }
                Object obj2 = c42496a.f149440w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42496a.f149441x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149435w;
                    AbstractC35197n.x xVar = new AbstractC35197n.x((C17027b) obj);
                    c42496a.f149442y = null;
                    c42496a.f149436E = null;
                    c42496a.f149437F = null;
                    c42496a.f149438G = null;
                    c42496a.f149439H = 0;
                    c42496a.f149441x = 1;
                    if (interfaceC13062m.emit(xVar, c42496a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f149434w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149434w.collect(new C42495a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149444w;

        /* JADX INFO: renamed from: ur1.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149445w;

            /* JADX INFO: renamed from: ur1.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$datePickerInteractor$$inlined$map$1$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42497a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149446E;

                /* JADX INFO: renamed from: F */
                Object f149447F;

                /* JADX INFO: renamed from: G */
                Object f149448G;

                /* JADX INFO: renamed from: H */
                int f149449H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149450w;

                /* JADX INFO: renamed from: x */
                int f149451x;

                /* JADX INFO: renamed from: y */
                Object f149452y;

                public C42497a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149450w = obj;
                    this.f149451x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149445w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42497a c42497a;
                if (interfaceC30057d instanceof C42497a) {
                    c42497a = (C42497a) interfaceC30057d;
                    int i13 = c42497a.f149451x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42497a.f149451x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42497a = new C42497a(interfaceC30057d);
                    }
                } else {
                    c42497a = new C42497a(interfaceC30057d);
                }
                Object obj2 = c42497a.f149450w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42497a.f149451x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149445w;
                    AbstractC35197n.y yVar = new AbstractC35197n.y(((C37569c) obj).getResult());
                    c42497a.f149452y = null;
                    c42497a.f149446E = null;
                    c42497a.f149447F = null;
                    c42497a.f149448G = null;
                    c42497a.f149449H = 0;
                    c42497a.f149451x = 1;
                    if (interfaceC13062m.emit(yVar, c42497a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f149444w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149444w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149454w;

        /* JADX INFO: renamed from: ur1.h$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149455w;

            /* JADX INFO: renamed from: ur1.h$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$$inlined$filterIsInstance$1$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42498a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149457F;

                /* JADX INFO: renamed from: G */
                Object f149458G;

                /* JADX INFO: renamed from: H */
                int f149459H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149460w;

                /* JADX INFO: renamed from: x */
                int f149461x;

                /* JADX INFO: renamed from: y */
                Object f149462y;

                /* JADX INFO: renamed from: z */
                Object f149463z;

                public C42498a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149460w = obj;
                    this.f149461x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149455w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42498a c42498a;
                if (interfaceC30057d instanceof C42498a) {
                    c42498a = (C42498a) interfaceC30057d;
                    int i13 = c42498a.f149461x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42498a.f149461x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42498a = new C42498a(interfaceC30057d);
                    }
                } else {
                    c42498a = new C42498a(interfaceC30057d);
                }
                Object obj2 = c42498a.f149460w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42498a.f149461x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149455w;
                    if (obj instanceof AbstractC35195l) {
                        c42498a.f149462y = null;
                        c42498a.f149463z = null;
                        c42498a.f149457F = null;
                        c42498a.f149458G = null;
                        c42498a.f149459H = 0;
                        c42498a.f149461x = 1;
                        if (interfaceC13062m.emit(obj, c42498a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f149454w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149454w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149464w;

        /* JADX INFO: renamed from: ur1.h$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149465w;

            /* JADX INFO: renamed from: ur1.h$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$$inlined$filterIsInstance$2$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42499a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149467F;

                /* JADX INFO: renamed from: G */
                Object f149468G;

                /* JADX INFO: renamed from: H */
                int f149469H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149470w;

                /* JADX INFO: renamed from: x */
                int f149471x;

                /* JADX INFO: renamed from: y */
                Object f149472y;

                /* JADX INFO: renamed from: z */
                Object f149473z;

                public C42499a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149470w = obj;
                    this.f149471x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149465w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42499a c42499a;
                if (interfaceC30057d instanceof C42499a) {
                    c42499a = (C42499a) interfaceC30057d;
                    int i13 = c42499a.f149471x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42499a.f149471x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42499a = new C42499a(interfaceC30057d);
                    }
                } else {
                    c42499a = new C42499a(interfaceC30057d);
                }
                Object obj2 = c42499a.f149470w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42499a.f149471x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149465w;
                    if (obj instanceof AbstractC35192i) {
                        c42499a.f149472y = null;
                        c42499a.f149473z = null;
                        c42499a.f149467F = null;
                        c42499a.f149468G = null;
                        c42499a.f149469H = 0;
                        c42499a.f149471x = 1;
                        if (interfaceC13062m.emit(obj, c42499a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f149464w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149464w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149474w;

        /* JADX INFO: renamed from: ur1.h$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149475w;

            /* JADX INFO: renamed from: ur1.h$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$$inlined$filterIsInstance$3$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42500a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149477F;

                /* JADX INFO: renamed from: G */
                Object f149478G;

                /* JADX INFO: renamed from: H */
                int f149479H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149480w;

                /* JADX INFO: renamed from: x */
                int f149481x;

                /* JADX INFO: renamed from: y */
                Object f149482y;

                /* JADX INFO: renamed from: z */
                Object f149483z;

                public C42500a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149480w = obj;
                    this.f149481x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149475w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42500a c42500a;
                if (interfaceC30057d instanceof C42500a) {
                    c42500a = (C42500a) interfaceC30057d;
                    int i13 = c42500a.f149481x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42500a.f149481x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42500a = new C42500a(interfaceC30057d);
                    }
                } else {
                    c42500a = new C42500a(interfaceC30057d);
                }
                Object obj2 = c42500a.f149480w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42500a.f149481x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149475w;
                    if (obj instanceof AbstractC35188e) {
                        c42500a.f149482y = null;
                        c42500a.f149483z = null;
                        c42500a.f149477F = null;
                        c42500a.f149478G = null;
                        c42500a.f149479H = 0;
                        c42500a.f149481x = 1;
                        if (interfaceC13062m.emit(obj, c42500a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC13058l interfaceC13058l) {
            this.f149474w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149474w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149484w;

        /* JADX INFO: renamed from: ur1.h$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149485w;

            /* JADX INFO: renamed from: ur1.h$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$$inlined$filterIsInstance$4$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42501a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149487F;

                /* JADX INFO: renamed from: G */
                Object f149488G;

                /* JADX INFO: renamed from: H */
                int f149489H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149490w;

                /* JADX INFO: renamed from: x */
                int f149491x;

                /* JADX INFO: renamed from: y */
                Object f149492y;

                /* JADX INFO: renamed from: z */
                Object f149493z;

                public C42501a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149490w = obj;
                    this.f149491x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149485w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42501a c42501a;
                if (interfaceC30057d instanceof C42501a) {
                    c42501a = (C42501a) interfaceC30057d;
                    int i13 = c42501a.f149491x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42501a.f149491x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42501a = new C42501a(interfaceC30057d);
                    }
                } else {
                    c42501a = new C42501a(interfaceC30057d);
                }
                Object obj2 = c42501a.f149490w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42501a.f149491x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149485w;
                    if (obj instanceof AbstractC36305c) {
                        c42501a.f149492y = null;
                        c42501a.f149493z = null;
                        c42501a.f149487F = null;
                        c42501a.f149488G = null;
                        c42501a.f149489H = 0;
                        c42501a.f149491x = 1;
                        if (interfaceC13062m.emit(obj, c42501a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC13058l interfaceC13058l) {
            this.f149484w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149484w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149494w;

        /* JADX INFO: renamed from: ur1.h$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149495w;

            /* JADX INFO: renamed from: ur1.h$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$$inlined$filterIsInstance$5$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42502a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149497F;

                /* JADX INFO: renamed from: G */
                Object f149498G;

                /* JADX INFO: renamed from: H */
                int f149499H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149500w;

                /* JADX INFO: renamed from: x */
                int f149501x;

                /* JADX INFO: renamed from: y */
                Object f149502y;

                /* JADX INFO: renamed from: z */
                Object f149503z;

                public C42502a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149500w = obj;
                    this.f149501x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149495w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42502a c42502a;
                if (interfaceC30057d instanceof C42502a) {
                    c42502a = (C42502a) interfaceC30057d;
                    int i13 = c42502a.f149501x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42502a.f149501x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42502a = new C42502a(interfaceC30057d);
                    }
                } else {
                    c42502a = new C42502a(interfaceC30057d);
                }
                Object obj2 = c42502a.f149500w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42502a.f149501x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149495w;
                    if (obj instanceof AbstractC35185b) {
                        c42502a.f149502y = null;
                        c42502a.f149503z = null;
                        c42502a.f149497F = null;
                        c42502a.f149498G = null;
                        c42502a.f149499H = 0;
                        c42502a.f149501x = 1;
                        if (interfaceC13062m.emit(obj, c42502a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public g(InterfaceC13058l interfaceC13058l) {
            this.f149494w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149494w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149504w;

        /* JADX INFO: renamed from: ur1.h$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149505w;

            /* JADX INFO: renamed from: ur1.h$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$$inlined$filterIsInstance$6$2", m100430f = "JournalDomainCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42503a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f149507F;

                /* JADX INFO: renamed from: G */
                Object f149508G;

                /* JADX INFO: renamed from: H */
                int f149509H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149510w;

                /* JADX INFO: renamed from: x */
                int f149511x;

                /* JADX INFO: renamed from: y */
                Object f149512y;

                /* JADX INFO: renamed from: z */
                Object f149513z;

                public C42503a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149510w = obj;
                    this.f149511x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f149505w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42503a c42503a;
                if (interfaceC30057d instanceof C42503a) {
                    c42503a = (C42503a) interfaceC30057d;
                    int i13 = c42503a.f149511x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42503a.f149511x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42503a = new C42503a(interfaceC30057d);
                    }
                } else {
                    c42503a = new C42503a(interfaceC30057d);
                }
                Object obj2 = c42503a.f149510w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42503a.f149511x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149505w;
                    if (obj instanceof AbstractC37568b) {
                        c42503a.f149512y = null;
                        c42503a.f149513z = null;
                        c42503a.f149507F = null;
                        c42503a.f149508G = null;
                        c42503a.f149509H = 0;
                        c42503a.f149511x = 1;
                        if (interfaceC13062m.emit(obj, c42503a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public h(InterfaceC13058l interfaceC13058l) {
            this.f149504w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149504w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.h$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$interact$1", m100430f = "JournalDomainCombiner.kt", m100431l = {156, 205}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lsr1/e;", "currentState", "Lur1/n;", "internalAction", "<anonymous>", "(Lsr1/e;Lur1/n;)Lsr1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f149514w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f149515x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f149516y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC32913e abstractC32913e, AbstractC35197n abstractC35197n, InterfaceC30057d<? super AbstractC32913e> interfaceC30057d) {
            i iVar = C35191h.this.new i(interfaceC30057d);
            iVar.f149515x = abstractC32913e;
            iVar.f149516y = abstractC35197n;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:128:0x02ef, code lost:
        
            if (r4.m111480E(r6, r46) == r3) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
        
            if (r1 == r3) goto L129;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r47) {
            /*
                Method dump skipped, instruction units count: 1873
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.C35191h.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ur1.h$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalDomainCombiner$newQuestionsInteractor$$inlined$flatMapLatest$1", m100430f = "JournalDomainCombiner.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f149518w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f149519x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f149520y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35191h f149521z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30057d interfaceC30057d, C35191h c35191h) {
            super(3, interfaceC30057d);
            this.f149521z = c35191h;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, JournalNewQuestionState journalNewQuestionState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d, this.f149521z);
            jVar.f149519x = interfaceC13062m;
            jVar.f149520y = journalNewQuestionState;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149518w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f149519x;
                if (!(((JournalNewQuestionState) this.f149520y) instanceof JournalNewQuestionState.NewQuestionsPresent)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C0456u(new AbstractC35195l.d(this.f149521z.requestDate, this.f149521z.cycleId, false, null, null, false, false, null, 252, null), 1), this.f149521z.fetchInteractor);
                this.f149519x = null;
                this.f149520y = null;
                this.f149518w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM83945a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (JournalNewQuestionState) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C35191h(C35196m fetchInteractor, C35193j editEntryInteractor, C35189f configInteractor, C36306d calendarInteractor, C35186c customizeJournalInteractor, JournalNewQuestionsInteractor journalNewQuestionsInteractor, C37571e datePickerInteractor, String requestDate, long j7, InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(fetchInteractor, "fetchInteractor");
        AbstractC22676k.m65750j(editEntryInteractor, "editEntryInteractor");
        AbstractC22676k.m65750j(configInteractor, "configInteractor");
        AbstractC22676k.m65750j(calendarInteractor, "calendarInteractor");
        AbstractC22676k.m65750j(customizeJournalInteractor, "customizeJournalInteractor");
        AbstractC22676k.m65750j(journalNewQuestionsInteractor, "journalNewQuestionsInteractor");
        AbstractC22676k.m65750j(datePickerInteractor, "datePickerInteractor");
        AbstractC22676k.m65750j(requestDate, "requestDate");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.fetchInteractor = fetchInteractor;
        this.editEntryInteractor = editEntryInteractor;
        this.configInteractor = configInteractor;
        this.calendarInteractor = calendarInteractor;
        this.customizeJournalInteractor = customizeJournalInteractor;
        this.journalNewQuestionsInteractor = journalNewQuestionsInteractor;
        this.datePickerInteractor = datePickerInteractor;
        this.requestDate = requestDate;
        this.cycleId = j7;
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.initial = new AbstractC32913e.b(null, 1, null);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC13058l m111410k(InterfaceC13058l upstream) {
        return new a(AbstractC27845h.m83945a(upstream, this.calendarInteractor));
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m111411l(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(upstream, this.configInteractor);
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC13058l m111412m(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(upstream, this.customizeJournalInteractor);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m111413n(InterfaceC13058l upstream) {
        return new b(AbstractC27845h.m83945a(upstream, this.datePickerInteractor));
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m111414o(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(upstream, this.editEntryInteractor);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m111415p(InterfaceC13058l upstream) {
        return AbstractC27845h.m83945a(upstream, this.fetchInteractor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC32913e m111416q(AbstractC35197n.j internalAction, AbstractC32913e.e currentState) {
        if (internalAction.getActionType() instanceof InterfaceC34101e) {
            return AbstractC32913e.e.m103333b(currentState, null, null, null, this.editEntryInteractor.m111435e((InterfaceC34101e) internalAction.getActionType(), currentState.m103335c()), null, null, false, false, null, null, null, 0L, false, null, null, null, null, null, null, false, false, null, null, 8388599, null);
        }
        this.logger.mo85228t("Trying to show bottom sheet from an invalid internal action type: " + internalAction.getActionType(), new AbstractC30556a.a[0]);
        return new AbstractC32913e.a(AbstractC8693b.m21278l("There's been an error"), EnumC32914f.COULD_NOT_LOAD_ENTRIES, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC32913e m111417r(AbstractC35197n.w internalAction, AbstractC32913e.e currentState) {
        if (internalAction.getActionType() instanceof AbstractC34099c.f) {
            return AbstractC32913e.e.m103333b(currentState, null, null, ((AbstractC34099c.f) internalAction.getActionType()).getNotes(), null, null, null, false, false, null, null, null, 0L, true, null, null, null, null, null, null, false, false, null, null, 8384507, null);
        }
        if (internalAction.getActionType() instanceof InterfaceC34102f) {
            return AbstractC32913e.e.m103333b(currentState, this.editEntryInteractor.m111438k((InterfaceC34102f) internalAction.getActionType(), currentState.m103335c()), null, null, null, null, null, false, false, null, null, null, 0L, true, null, null, null, null, null, null, false, false, null, null, 8384502, null);
        }
        this.logger.mo85228t("Trying to show bottom sheet from an invalid internal action type: " + internalAction.getActionType(), new AbstractC30556a.a[0]);
        return new AbstractC32913e.a(AbstractC8693b.m21278l("There's been an error"), EnumC32914f.COULD_NOT_LOAD_ENTRIES, null, 4, null);
    }

    /* JADX INFO: renamed from: s */
    private final JournalTrackerRequest m111418s(List<C34098b> behaviors, String notes) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_IN_JOURNAL_NON_ONBOARDING);
        List<C34098b> list = behaviors;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C34098b c34098b : list) {
            int id4 = c34098b.getTracker().getId();
            Boolean answeredYes = c34098b.getValue().getAnsweredYes();
            if (!zIsFeatureEnabled) {
                answeredYes = Boolean.valueOf(answeredYes != null ? answeredYes.booleanValue() : false);
            }
            Boolean bool = answeredYes;
            String magnitudeInputLabel = c34098b.getValue().getMagnitudeInputLabel();
            Double magnitudeInputValue = c34098b.getValue().getMagnitudeInputValue();
            Long lValueOf = null;
            Float fValueOf = magnitudeInputValue != null ? Float.valueOf((float) magnitudeInputValue.doubleValue()) : null;
            String strValueOf = String.valueOf(c34098b.getValue().getTimeInputLabel());
            Long timeInputValue = c34098b.getValue().getTimeInputValue();
            if (timeInputValue != null) {
                lValueOf = Long.valueOf(AbstractC39732c.m127141b(timeInputValue.longValue()).getMillis());
            }
            arrayList.add(new JournalTrackerInput(bool, id4, magnitudeInputLabel, fValueOf, strValueOf, lValueOf, c34098b.getTracker().getQuestionType()));
        }
        return new JournalTrackerRequest(notes, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC32913e.d m111419t(AbstractC32913e.e successState) {
        return new AbstractC32913e.d(m111418s(successState.m103335c(), successState.getNotes()), successState.getDefaultAnswers().getIsDefaultAnswerToggleEnabled(), successState.getDefaultAnswers().getIsDefaultAnswerToggleVisible(), successState.getRequestDate(), successState.getCycleId());
    }

    /* JADX INFO: renamed from: v */
    private final InterfaceC13058l m111420v(InterfaceC13058l upstream) {
        return AbstractC13091v.m36590P(upstream, new j(null, this));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initial, AbstractC13091v.m36584J(m111415p(new c(upstream)), m111414o(new d(upstream)), m111411l(new e(upstream)), m111410k(new f(upstream)), m111412m(new g(upstream)), m111420v(this.journalNewQuestionsInteractor.getJournalNewQuestionFlow()), m111413n(new h(upstream))), new i(null));
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC37570d m111421u(AbstractC37570d datePickerState, String date) {
        AbstractC22676k.m65750j(date, "date");
        AbstractC37570d.c cVar = datePickerState instanceof AbstractC37570d.c ? (AbstractC37570d.c) datePickerState : null;
        if (cVar == null) {
            return datePickerState;
        }
        C37567a accumulator = cVar.getAccumulator();
        Map<String, Boolean> mapM120593c = cVar.getAccumulator().m120593c();
        mapM120593c.put(date, Boolean.TRUE);
        return new AbstractC37570d.c(C37567a.m120591b(accumulator, null, null, mapM120593c, false, 11, null));
    }

    /* JADX INFO: renamed from: w */
    public final boolean m111422w(AbstractC32913e currentState, C32911c newDefaultAnswers, boolean autoSaveEnabled) {
        C32911c defaultAnswers;
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC22676k.m65750j(newDefaultAnswers, "newDefaultAnswers");
        if (autoSaveEnabled) {
            return false;
        }
        AbstractC32913e.e eVar = currentState instanceof AbstractC32913e.e ? (AbstractC32913e.e) currentState : null;
        return (((eVar == null || (defaultAnswers = eVar.getDefaultAnswers()) == null) ? false : defaultAnswers.getIsDefaultAnswerToggleEnabled()) || newDefaultAnswers.getIsDefaultAnswerToggleEnabled()) && newDefaultAnswers.getIsDefaultAnswerToggleVisible();
    }

    public /* synthetic */ C35191h(C35196m c35196m, C35193j c35193j, C35189f c35189f, C36306d c36306d, C35186c c35186c, JournalNewQuestionsInteractor journalNewQuestionsInteractor, C37571e c37571e, String str, long j7, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c35196m, c35193j, c35189f, c36306d, c35186c, journalNewQuestionsInteractor, c37571e, str, j7, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("JournalDomainCombiner") : interfaceC34116n, featureFlagChecker);
    }
}
