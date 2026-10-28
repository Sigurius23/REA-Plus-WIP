package ur1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.domain.dto.DatePickerInfo;
import com.whoop.data.remote.domain.dto.JournalBounds;
import com.whoop.data.remote.domain.dto.NavigationButton;
import com.whoop.data.remote.domain.dto.QuestionType;
import com.whoop.data.remote.domain.dto.SubtitleCallout;
import com.whoop.data.remote.domain.request.JournalTrackerInput;
import com.whoop.data.remote.domain.request.JournalTrackerRequest;
import com.whoop.data.remote.domain.request.PartialEntryTrackerInput;
import com.whoop.data.remote.domain.request.PartialJournalEntryRequest;
import com.whoop.data.remote.domain.request.TrackerInputEgg;
import com.whoop.data.remote.domain.response.journal.JournalBehaviorTracker;
import com.whoop.data.remote.domain.response.journal.JournalBehaviourTrackerHistory;
import com.whoop.data.remote.domain.response.journal.JournalEntry;
import com.whoop.data.remote.domain.response.journal.JournalEntryWrapper;
import com.whoop.data.remote.domain.response.journal.TrackedBehavior;
import com.whoop.data.remote.domain.response.journal.TrackerInput;
import com.whoop.data.remote.domain.response.journal.TrackerValue;
import com.whoop.data.remote.domain.response.journal.UserSelectedJournalWithHistory;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.JournalRepository;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.util.TextResource;
import com.whoop.journal.api.JournalApi;
import com.whoop.journal.api.SaveJournalBehaviorsResponse;
import com.whoop.journal.api.TalkTextWidgetResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import or2.AbstractC28190p0;
import or2.C28204u;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import pr1.AbstractC29492c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sr1.AbstractC32913e;
import sr1.C32911c;
import sr1.C32915g;
import sr1.C32917i;
import sr1.EnumC32914f;
import tr1.C34097a;
import tr1.C34098b;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yr1.C39730a;
import yr1.EnumC39731b;

/* JADX INFO: renamed from: ur1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002¢\u0006\u0004\b'\u0010(JH\u00102\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010.\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010)2\b\u00101\u001a\u0004\u0018\u000100H\u0082@¢\u0006\u0004\b2\u00103J\u001d\u00107\u001a\u00020\u001f2\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0002¢\u0006\u0004\b7\u00108J&\u0010;\u001a\b\u0012\u0004\u0012\u00020:042\u0006\u0010,\u001a\u00020+2\u0006\u00109\u001a\u00020)H\u0082@¢\u0006\u0004\b;\u0010<J\u001e\u0010=\u001a\b\u0012\u0004\u0012\u000205042\u0006\u0010*\u001a\u00020)H\u0082@¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0002¢\u0006\u0004\b?\u0010(J#\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020)H\u0002¢\u0006\u0004\bF\u0010GJ1\u0010M\u001a\u00020L2\u0006\u0010H\u001a\u00020:2\b\u0010I\u001a\u0004\u0018\u00010\u001f2\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020\u001fH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u000205H\u0002¢\u0006\u0004\bQ\u0010RJ*\u0010V\u001a\u0004\u0018\u00010U2\u0006\u00109\u001a\u00020)2\u0006\u0010S\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020\u001fH\u0082@¢\u0006\u0004\bV\u0010WJE\u0010]\u001a\u00020\\2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020P2\b\b\u0002\u0010Z\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010UH\u0002¢\u0006\u0004\b]\u0010^J\u0019\u0010`\u001a\u00020A*\b\u0012\u0004\u0012\u00020_0@H\u0002¢\u0006\u0004\b`\u0010aJ\u0019\u0010c\u001a\u00020A*\b\u0012\u0004\u0012\u00020b0@H\u0002¢\u0006\u0004\bc\u0010aJ\u0013\u0010f\u001a\u00020e*\u00020dH\u0002¢\u0006\u0004\bf\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010s¨\u0006t"}, m65681d2 = {"Lur1/m;", "Lod1/g;", "Lur1/l;", "Lur1/n;", "Lcom/whoop/data/repositories/JournalRepository;", "journalRepository", "Lyr1/a;", "analytics", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "Lcom/whoop/journal/api/JournalApi;", "journalApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/JournalRepository;Lyr1/a;Lbc3/c0;Ltr2/n;Lcom/whoop/journal/api/JournalApi;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "Lsr1/e$d;", "currentState", "Lsr1/e;", "C", "(Lsr1/e$d;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "u", "(Lsr1/e$d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "", "enabled", "E", "(ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/NavigationButton;", "Lsr1/g;", "G", "(Lcom/whoop/data/remote/domain/dto/NavigationButton;)Lsr1/g;", "x", "()Lec3/l;", "", "requestDate", "", "cycleId", "isAutoPop", "source", "label", "Lyr1/b;", "dateNavigationType", "v", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lyr1/b;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;", "journalEntryResponse", "q", "(Lcom/whoop/data/remote/commons/Resource;)Z", HttpHeaders.DATE, "Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;", "o", "(JLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "r", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "p", "", "", "selectedItems", "D", "(Ljava/util/List;)Lec3/l;", "searchTerm", "B", "(Ljava/lang/String;)Lec3/l;", "history", "isToday", "userHasAnsweredJournalForTheDay", "savedToggleEnabled", "Lur1/a;", "z", "(Lcom/whoop/data/remote/domain/response/journal/UserSelectedJournalWithHistory;Ljava/lang/Boolean;ZZ)Lur1/a;", "journalEntryWrapper", "Lur1/o;", "y", "(Lcom/whoop/data/remote/domain/response/journal/JournalEntryWrapper;)Lur1/o;", "isIntraday", "autopop", "Lsr1/i;", "t", "(Ljava/lang/String;ZZLq83/d;)Ljava/lang/Object;", "behaviorTrackers", "journalEntry", "weightEqually", "talkTextWidget", "Lur1/n$r;", "A", "(Lur1/a;Lur1/o;ZLjava/lang/String;JLsr1/i;)Lur1/n$r;", "Ltr1/b;", "s", "(Ljava/util/List;)I", "Lcom/whoop/data/remote/domain/request/JournalTrackerInput;", "n", "Lcom/whoop/data/remote/domain/dto/DatePickerInfo;", "Lur1/d;", "F", "(Lcom/whoop/data/remote/domain/dto/DatePickerInfo;)Lur1/d;", "a", "Lcom/whoop/data/repositories/JournalRepository;", "b", "Lyr1/a;", "c", "Lbc3/c0;", "d", "Ltr2/n;", "e", "Lcom/whoop/journal/api/JournalApi;", "f", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35196m implements InterfaceC27844g<AbstractC35195l, AbstractC35197n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final JournalRepository journalRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39730a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final JournalApi journalApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: ur1.m$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$getBehaviorsBottomSheet$1", m100430f = "JournalFetchInteractor.kt", m100431l = {275, 277, 280, 284}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lur1/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f149555w;

        /* JADX INFO: renamed from: x */
        int f149556x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f149557y;

        /* JADX INFO: renamed from: ur1.m$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$getBehaviorsBottomSheet$1$response$1", m100430f = "JournalFetchInteractor.kt", m100431l = {277}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42506a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f149559w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35196m f149560x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42506a(C35196m c35196m, InterfaceC30057d<? super C42506a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f149560x = c35196m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42506a(this.f149560x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f149559w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                JournalApi journalApi = this.f149560x.journalApi;
                this.f149559w = 1;
                Object journalBehaviors = journalApi.getJournalBehaviors(this);
                return journalBehaviors == enumC31071a ? enumC31071a : journalBehaviors;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super CustomizeBottomSheetSelectorModel> interfaceC30057d) {
                return ((C42506a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C35196m.this.new a(interfaceC30057d);
            aVar.f149557y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:25:0x0083  */
        /* JADX WARN: Code duplicated, block: B:27:0x0087  */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f149557y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f149556x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f149555w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L96
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L63
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L43
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                ur1.n$l r0 = ur1.AbstractC35197n.l.f149651a
                r13.f149557y = r8
                r13.f149556x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L43
                goto L95
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                ur1.m r2 = ur1.C35196m.this
                tr2.n r2 = ur1.C35196m.m111462h(r2)
                ur1.m$a$a r4 = new ur1.m$a$a
                ur1.m r3 = ur1.C35196m.this
                r4.<init>(r3, r12)
                r13.f149557y = r8
                r13.f149556x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L63
                goto L95
            L63:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L83
                ur1.n$m r1 = new ur1.n$m
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.design.models.items.CustomizeBottomSheetSelectorModel r0 = (com.whoop.design.models.items.CustomizeBottomSheetSelectorModel) r0
                r1.<init>(r0)
                r13.f149557y = r12
                r13.f149555w = r12
                r13.f149556x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L96
                goto L95
            L83:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L99
                ur1.n$k r0 = ur1.AbstractC35197n.k.f149650a
                r13.f149557y = r12
                r13.f149555w = r12
                r13.f149556x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L96
            L95:
                return r9
            L96:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L99:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.C35196m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ur1.m$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor", m100430f = "JournalFetchInteractor.kt", m100431l = {407}, m100432m = "getTalkTextWidget", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f149562F;

        /* JADX INFO: renamed from: w */
        Object f149563w;

        /* JADX INFO: renamed from: x */
        boolean f149564x;

        /* JADX INFO: renamed from: y */
        boolean f149565y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f149566z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149566z = obj;
            this.f149562F |= Integer.MIN_VALUE;
            return C35196m.this.m111474t(null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: ur1.m$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$getTalkTextWidget$response$1", m100430f = "JournalFetchInteractor.kt", m100431l = {407}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/journal/api/TalkTextWidgetResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f149567E;

        /* JADX INFO: renamed from: w */
        int f149568w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f149570y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f149571z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z4, boolean z13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f149570y = str;
            this.f149571z = z4;
            this.f149567E = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35196m.this.new c(this.f149570y, this.f149571z, this.f149567E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149568w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JournalApi journalApi = C35196m.this.journalApi;
            String str = this.f149570y;
            boolean z4 = this.f149571z;
            boolean z13 = this.f149567E;
            this.f149568w = 1;
            Object talkTextWidget = journalApi.getTalkTextWidget(str, z4, z13, this);
            return talkTextWidget == enumC31071a ? enumC31071a : talkTextWidget;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TalkTextWidgetResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ur1.m$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$handleAsyncSave$1", m100430f = "JournalFetchInteractor.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35196m f149572E;

        /* JADX INFO: renamed from: w */
        Object f149573w;

        /* JADX INFO: renamed from: x */
        int f149574x;

        /* JADX INFO: renamed from: y */
        int f149575y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC32913e.d f149576z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC32913e.d dVar, C35196m c35196m, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149576z = dVar;
            this.f149572E = c35196m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f149576z, this.f149572E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149575y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC32913e.d dVar = this.f149576z;
                JournalRepository journalRepository = this.f149572E.journalRepository;
                JournalTrackerRequest journalTrackerRequest = dVar.getJournalTrackerRequest();
                String requestDate = dVar.getRequestDate();
                this.f149573w = null;
                this.f149574x = 0;
                this.f149575y = 1;
                if (journalRepository.saveJournalTrackerInputs(journalTrackerRequest, requestDate, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: ur1.m$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor", m100430f = "JournalFetchInteractor.kt", m100431l = {206, 207, 209, 219}, m100432m = "handleFetch", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f149577E;

        /* JADX INFO: renamed from: F */
        Object f149578F;

        /* JADX INFO: renamed from: G */
        Object f149579G;

        /* JADX INFO: renamed from: H */
        Object f149580H;

        /* JADX INFO: renamed from: I */
        Object f149581I;

        /* JADX INFO: renamed from: J */
        long f149582J;

        /* JADX INFO: renamed from: K */
        boolean f149583K;

        /* JADX INFO: renamed from: L */
        boolean f149584L;

        /* JADX INFO: renamed from: M */
        int f149585M;

        /* JADX INFO: renamed from: N */
        /* synthetic */ Object f149586N;

        /* JADX INFO: renamed from: P */
        int f149588P;

        /* JADX INFO: renamed from: w */
        Object f149589w;

        /* JADX INFO: renamed from: x */
        Object f149590x;

        /* JADX INFO: renamed from: y */
        Object f149591y;

        /* JADX INFO: renamed from: z */
        Object f149592z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f149586N = obj;
            this.f149588P |= Integer.MIN_VALUE;
            return C35196m.this.m111475v(null, 0L, false, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ur1.m$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$handlePartialAutoSave$1", m100430f = "JournalFetchInteractor.kt", m100431l = {177}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f149593w;

        /* JADX INFO: renamed from: x */
        int f149594x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC32913e.d f149595y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35196m f149596z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC32913e.d dVar, C35196m c35196m, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149595y = dVar;
            this.f149596z = c35196m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f149595y, this.f149596z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149594x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String requestDate = this.f149595y.getRequestDate();
                List<JournalTrackerInput> trackerInputs = this.f149595y.getJournalTrackerRequest().getTrackerInputs();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(trackerInputs, 10));
                for (JournalTrackerInput journalTrackerInput : trackerInputs) {
                    Boolean answered = journalTrackerInput.getAnswered();
                    int trackerId = journalTrackerInput.getTrackerId();
                    Long timeInputValue = journalTrackerInput.getTimeInputValue();
                    String timeInputLabel = journalTrackerInput.getTimeInputLabel();
                    String magnitudeInputLabel = journalTrackerInput.getMagnitudeInputLabel();
                    Float magnitudeInputValue = journalTrackerInput.getMagnitudeInputValue();
                    arrayList.add(new TrackerInputEgg(answered, trackerId, timeInputValue, timeInputLabel, magnitudeInputLabel, magnitudeInputValue != null ? new Double(magnitudeInputValue.floatValue()) : null));
                }
                PartialJournalEntryRequest partialJournalEntryRequest = new PartialJournalEntryRequest(AbstractC25247g0.m73989X(new C23465k(requestDate, new PartialEntryTrackerInput(arrayList))));
                JournalRepository journalRepository = this.f149596z.journalRepository;
                this.f149593w = null;
                this.f149594x = 1;
                obj = journalRepository.savePartialJournalEntry(partialJournalEntryRequest, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f149596z.logger.mo85222m(AbstractC11266d.m30461o("Partial auto save failed for date ", this.f149595y.getRequestDate()), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ur1.m$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$interact$$inlined$flatMapLatest$1", m100430f = "JournalFetchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f149597w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f149598x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f149599y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35196m f149600z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C35196m c35196m) {
            super(3, interfaceC30057d);
            this.f149600z = c35196m;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC35195l abstractC35195l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f149600z);
            gVar.f149598x = interfaceC13062m;
            gVar.f149599y = abstractC35195l;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM36590P;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149597w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f149598x;
                AbstractC35195l abstractC35195l = (AbstractC35195l) this.f149599y;
                if (abstractC35195l instanceof AbstractC35195l.d) {
                    interfaceC13058lM36590P = new C13084s1(new h(abstractC35195l, this.f149600z, null));
                } else if (abstractC35195l instanceof AbstractC35195l.e) {
                    interfaceC13058lM36590P = this.f149600z.m111476x();
                } else if (abstractC35195l instanceof AbstractC35195l.a) {
                    interfaceC13058lM36590P = new C13084s1(new i(null));
                } else if (abstractC35195l instanceof AbstractC35195l.b) {
                    interfaceC13058lM36590P = this.f149600z.m111470p();
                } else if (abstractC35195l instanceof AbstractC35195l.f) {
                    interfaceC13058lM36590P = this.f149600z.m111455D(((AbstractC35195l.f) abstractC35195l).m111452a());
                } else {
                    if (!(abstractC35195l instanceof AbstractC35195l.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM36590P = AbstractC13091v.m36590P(AbstractC13091v.m36608r(new C0456u(abstractC35195l, 1), 300L), new j(null, this.f149600z));
                }
                this.f149598x = null;
                this.f149599y = null;
                this.f149597w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36590P, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC35195l) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ur1.m$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$interact$1$1", m100430f = "JournalFetchInteractor.kt", m100431l = {69, 72, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lur1/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35196m f149601E;

        /* JADX INFO: renamed from: w */
        Object f149602w;

        /* JADX INFO: renamed from: x */
        int f149603x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f149604y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35195l f149605z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC35195l abstractC35195l, C35196m c35196m, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149605z = abstractC35195l;
            this.f149601E = c35196m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f149605z, this.f149601E, interfaceC30057d);
            hVar.f149604y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x006a  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b0 A[PHI: r0 r9
          0x00b0: PHI (r0v14 java.lang.Object) = (r0v13 java.lang.Object), (r0v18 java.lang.Object) binds: [B:25:0x00ad, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x00b0: PHI (r9v2 ec3.m) = (r9v1 ec3.m), (r9v4 ec3.m) binds: [B:25:0x00ad, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
        
            if (r9.emit(r0, r14) == r10) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f149604y
                r9 = r0
                ec3.m r9 = (ec3.InterfaceC13062m) r9
                r83.a r10 = r83.EnumC31071a.f128113w
                int r0 = r14.f149603x
                r11 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                r12 = 0
                if (r0 == 0) goto L38
                if (r0 == r3) goto L34
                if (r0 == r2) goto L30
                if (r0 == r1) goto L25
                if (r0 != r11) goto L1d
                p505ts.AbstractC34132o.m107864I(r15)
                goto Lbd
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.Object r0 = r14.f149602w
                r9 = r0
                ec3.m r9 = (ec3.InterfaceC13062m) r9
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto Lb0
            L30:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L6a
            L34:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L53
            L38:
                p505ts.AbstractC34132o.m107864I(r15)
                ur1.l r0 = r14.f149605z
                ur1.l$d r0 = (ur1.AbstractC35195l.d) r0
                boolean r0 = r0.getShouldSaveCurrentEntryFirst()
                if (r0 == 0) goto L53
                ur1.n$d r0 = ur1.AbstractC35197n.d.f149642a
                r14.f149604y = r9
                r14.f149603x = r3
                java.lang.Object r0 = r9.emit(r0, r14)
                if (r0 != r10) goto L53
                goto Lbc
            L53:
                ur1.l r0 = r14.f149605z
                ur1.l$d r0 = (ur1.AbstractC35195l.d) r0
                boolean r0 = r0.getShouldShowDateSelectorLoader()
                if (r0 == 0) goto L6a
                ur1.n$o r0 = ur1.AbstractC35197n.o.f149655a
                r14.f149604y = r9
                r14.f149603x = r2
                java.lang.Object r0 = r9.emit(r0, r14)
                if (r0 != r10) goto L6a
                goto Lbc
            L6a:
                ur1.m r0 = r14.f149601E
                ur1.l r2 = r14.f149605z
                ur1.l$d r2 = (ur1.AbstractC35195l.d) r2
                java.lang.String r2 = r2.getRequestDate()
                ur1.l r3 = r14.f149605z
                ur1.l$d r3 = (ur1.AbstractC35195l.d) r3
                long r3 = r3.getCycleId()
                ur1.l r5 = r14.f149605z
                ur1.l$d r5 = (ur1.AbstractC35195l.d) r5
                boolean r5 = r5.getIsAutoPop()
                ur1.l r6 = r14.f149605z
                ur1.l$d r6 = (ur1.AbstractC35195l.d) r6
                java.lang.String r6 = r6.getSource()
                ur1.l r7 = r14.f149605z
                ur1.l$d r7 = (ur1.AbstractC35195l.d) r7
                java.lang.String r7 = r7.getLabel()
                ur1.l r13 = r14.f149605z
                ur1.l$d r13 = (ur1.AbstractC35195l.d) r13
                yr1.b r13 = r13.getJournalDateNavigationType()
                r14.f149604y = r12
                r14.f149602w = r9
                r14.f149603x = r1
                r8 = r14
                r1 = r2
                r2 = r3
                r4 = r5
                r5 = r6
                r6 = r7
                r7 = r13
                java.lang.Object r0 = ur1.C35196m.m111464j(r0, r1, r2, r4, r5, r6, r7, r8)
                if (r0 != r10) goto Lb0
                goto Lbc
            Lb0:
                r14.f149604y = r12
                r14.f149602w = r12
                r14.f149603x = r11
                java.lang.Object r0 = r9.emit(r0, r14)
                if (r0 != r10) goto Lbd
            Lbc:
                return r10
            Lbd:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.C35196m.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ur1.m$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$interact$1$2", m100430f = "JournalFetchInteractor.kt", m100431l = {90, 91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lur1/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f149606w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f149607x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f149607x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f149607x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f149606w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3e
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                r6.f149607x = r0
                r6.f149606w = r4
                r4 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                if (r7 != r1) goto L30
                goto L3d
            L30:
                ur1.n$e r7 = ur1.AbstractC35197n.e.f149643a
                r2 = 0
                r6.f149607x = r2
                r6.f149606w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.C35196m.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ur1.m$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "JournalFetchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f149608w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f149609x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f149610y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35196m f149611z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC30057d interfaceC30057d, C35196m c35196m) {
            super(3, interfaceC30057d);
            this.f149611z = c35196m;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC35195l.c cVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d, this.f149611z);
            jVar.f149609x = interfaceC13062m;
            jVar.f149610y = cVar;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f149608w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f149609x;
                InterfaceC13058l interfaceC13058lM111454B = this.f149611z.m111454B(((AbstractC35195l.c) this.f149610y).getSearchTerm());
                this.f149609x = null;
                this.f149610y = null;
                this.f149608w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM111454B, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC35195l.c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ur1.m$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$performFuzzySearch$1", m100430f = "JournalFetchInteractor.kt", m100431l = {309, 312, 316}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lur1/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f149612E;

        /* JADX INFO: renamed from: w */
        Object f149613w;

        /* JADX INFO: renamed from: x */
        int f149614x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f149615y;

        /* JADX INFO: renamed from: ur1.m$k$a */
        @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$performFuzzySearch$1$response$1", m100430f = "JournalFetchInteractor.kt", m100431l = {309}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f149617w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35196m f149618x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f149619y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35196m c35196m, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f149618x = c35196m;
                this.f149619y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f149618x, this.f149619y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f149617w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                JournalApi journalApi = this.f149618x.journalApi;
                String str = this.f149619y;
                this.f149617w = 1;
                Object relatedBehaviorTrackerIds = journalApi.getRelatedBehaviorTrackerIds(str, this);
                return relatedBehaviorTrackerIds == enumC31071a ? enumC31071a : relatedBehaviorTrackerIds;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super List<Integer>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149612E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = C35196m.this.new k(this.f149612E, interfaceC30057d);
            kVar.f149615y = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f149615y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f149614x
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L26
                if (r0 == r11) goto L1e
                if (r0 != r10) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r13.f149613w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L88
            L26:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L50
            L2b:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                ur1.m r2 = ur1.C35196m.this
                tr2.n r2 = ur1.C35196m.m111462h(r2)
                ur1.m$k$a r4 = new ur1.m$k$a
                ur1.m r3 = ur1.C35196m.this
                java.lang.String r6 = r13.f149612E
                r4.<init>(r3, r6, r12)
                r13.f149615y = r8
                r13.f149614x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L50
                goto L87
            L50:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L70
                ur1.n$a r1 = new ur1.n$a
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                java.util.List r0 = (java.util.List) r0
                r1.<init>(r0)
                r13.f149615y = r12
                r13.f149613w = r12
                r13.f149614x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L88
                goto L87
            L70:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L8b
                ur1.n$a r0 = new ur1.n$a
                m83.y r1 = m83.C25271y.f99162w
                r0.<init>(r1)
                r13.f149615y = r12
                r13.f149613w = r12
                r13.f149614x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L88
            L87:
                return r9
            L88:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L8b:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.C35196m.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ur1.m$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$save$2", m100430f = "JournalFetchInteractor.kt", m100431l = {119, 122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lsr1/e;", "<anonymous>", "(Lbc3/c0;)Lsr1/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        boolean f149620E;

        /* JADX INFO: renamed from: F */
        boolean f149621F;

        /* JADX INFO: renamed from: G */
        boolean f149622G;

        /* JADX INFO: renamed from: H */
        int f149623H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ AbstractC32913e.d f149624I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C35196m f149625J;

        /* JADX INFO: renamed from: w */
        Object f149626w;

        /* JADX INFO: renamed from: x */
        Object f149627x;

        /* JADX INFO: renamed from: y */
        Object f149628y;

        /* JADX INFO: renamed from: z */
        int f149629z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractC32913e.d dVar, C35196m c35196m, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149624I = dVar;
            this.f149625J = c35196m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f149624I, this.f149625J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC32913e> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:28:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ed  */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x00ed, please report this as an issue */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objSaveJournalTrackerInputs;
            AbstractC32913e.d dVar;
            C35196m c35196m;
            AbstractC32913e.d dVar2;
            int i13;
            AbstractC32913e.d dVar3;
            boolean z4;
            boolean z13;
            boolean z14;
            String notes;
            boolean z15;
            boolean z16;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f149623H;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC32913e.d dVar4 = this.f149624I;
                C35196m c35196m2 = this.f149625J;
                JournalRepository journalRepository = c35196m2.journalRepository;
                JournalTrackerRequest journalTrackerRequest = dVar4.getJournalTrackerRequest();
                String requestDate = dVar4.getRequestDate();
                this.f149626w = c35196m2;
                this.f149627x = dVar4;
                this.f149628y = dVar4;
                this.f149629z = 0;
                this.f149623H = 1;
                objSaveJournalTrackerInputs = journalRepository.saveJournalTrackerInputs(journalTrackerRequest, requestDate, this);
                if (objSaveJournalTrackerInputs != enumC31071a) {
                    dVar = dVar4;
                    c35196m = c35196m2;
                    dVar2 = dVar;
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                i13 = this.f149629z;
                dVar2 = (AbstractC32913e.d) this.f149628y;
                AbstractC32913e.d dVar5 = (AbstractC32913e.d) this.f149627x;
                C35196m c35196m3 = (C35196m) this.f149626w;
                AbstractC34132o.m107864I(obj);
                c35196m = c35196m3;
                dVar = dVar5;
                objSaveJournalTrackerInputs = obj;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z17 = this.f149622G;
                boolean z18 = this.f149621F;
                z4 = this.f149620E;
                dVar3 = (AbstractC32913e.d) this.f149628y;
                dVar = (AbstractC32913e.d) this.f149627x;
                c35196m = (C35196m) this.f149626w;
                AbstractC34132o.m107864I(obj);
                z14 = z17;
                z13 = z18;
            }
            C39730a c39730a = c35196m.analytics;
            String requestDate2 = dVar.getRequestDate();
            notes = dVar.getJournalTrackerRequest().getNotes();
            if (notes != null) {
                if (notes.length() > 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z15 = z16;
            } else {
                z15 = false;
            }
            c39730a.m127136o(requestDate2, z13, z15, dVar.getJournalTrackerRequest().getTrackerInputs().size(), c35196m.m111468n(dVar.getJournalTrackerRequest().getTrackerInputs()), C28204u.INSTANCE.m85369l(dVar.getRequestDate(), c35196m.logger), z14);
            if (z4) {
                return new AbstractC32913e.c(true);
            }
            c35196m.logger.mo85222m("Saving journal entry for " + dVar3.getCycleId() + " and payload " + dVar3.getJournalTrackerRequest() + " failed", new AbstractC30556a.a[0]);
            return new AbstractC32913e.a(new TextResource.C8688b(AbstractC29492c.f119845h, null, 2, null), EnumC32914f.COULD_NOT_SAVE, null, 4, null);
            boolean zBooleanValue = ((Boolean) objSaveJournalTrackerInputs).booleanValue();
            boolean isDefaultAnswerToggleEnabled = dVar2.getIsDefaultAnswerToggleEnabled();
            boolean isDefaultAnswerToggleVisible = dVar2.getIsDefaultAnswerToggleVisible();
            JournalRepository journalRepository2 = c35196m.journalRepository;
            this.f149626w = c35196m;
            this.f149627x = dVar;
            this.f149628y = dVar2;
            this.f149629z = i13;
            this.f149620E = zBooleanValue;
            this.f149621F = isDefaultAnswerToggleEnabled;
            this.f149622G = isDefaultAnswerToggleVisible;
            this.f149623H = 2;
            if (journalRepository2.setStateOfUsersLastDefaultToggle(isDefaultAnswerToggleEnabled, this) != enumC31071a) {
                dVar3 = dVar2;
                z4 = zBooleanValue;
                z13 = isDefaultAnswerToggleEnabled;
                z14 = isDefaultAnswerToggleVisible;
                C39730a c39730a2 = c35196m.analytics;
                String requestDate3 = dVar.getRequestDate();
                notes = dVar.getJournalTrackerRequest().getNotes();
                if (notes != null) {
                    if (notes.length() > 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z15 = z16;
                } else {
                    z15 = false;
                }
                c39730a2.m127136o(requestDate3, z13, z15, dVar.getJournalTrackerRequest().getTrackerInputs().size(), c35196m.m111468n(dVar.getJournalTrackerRequest().getTrackerInputs()), C28204u.INSTANCE.m85369l(dVar.getRequestDate(), c35196m.logger), z14);
                if (z4) {
                    return new AbstractC32913e.c(true);
                }
                c35196m.logger.mo85222m("Saving journal entry for " + dVar3.getCycleId() + " and payload " + dVar3.getJournalTrackerRequest() + " failed", new AbstractC30556a.a[0]);
                return new AbstractC32913e.a(new TextResource.C8688b(AbstractC29492c.f119845h, null, 2, null), EnumC32914f.COULD_NOT_SAVE, null, 4, null);
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: ur1.m$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$saveCustomizeJournal$1", m100430f = "JournalFetchInteractor.kt", m100431l = {290, 292, 295, 303}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lur1/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ List<Integer> f149630E;

        /* JADX INFO: renamed from: w */
        Object f149631w;

        /* JADX INFO: renamed from: x */
        int f149632x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f149633y;

        /* JADX INFO: renamed from: ur1.m$m$a */
        @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.JournalFetchInteractor$saveCustomizeJournal$1$response$1", m100430f = "JournalFetchInteractor.kt", m100431l = {292}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/journal/api/SaveJournalBehaviorsResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f149635w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35196m f149636x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ List<Integer> f149637y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35196m c35196m, List<Integer> list, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f149636x = c35196m;
                this.f149637y = list;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f149636x, this.f149637y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f149635w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                JournalApi journalApi = this.f149636x.journalApi;
                List<Integer> list = this.f149637y;
                this.f149635w = 1;
                Object objUpdateUserSelectedJournalBehaviors = journalApi.updateUserSelectedJournalBehaviors(list, this);
                return objUpdateUserSelectedJournalBehaviors == enumC31071a ? enumC31071a : objUpdateUserSelectedJournalBehaviors;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<SaveJournalBehaviorsResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List<Integer> list, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f149630E = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            m mVar = C35196m.this.new m(this.f149630E, interfaceC30057d);
            mVar.f149633y = obj;
            return mVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:24:0x007b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0080  */
        /* JADX WARN: Code duplicated, block: B:29:0x0091  */
        /* JADX WARN: Code duplicated, block: B:31:0x0095  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f149633y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f149632x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f149631w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto La4
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L65
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L43
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                ur1.n$h r0 = ur1.AbstractC35197n.h.f149646a
                r13.f149633y = r8
                r13.f149632x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L43
                goto La3
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                ur1.m r2 = ur1.C35196m.this
                tr2.n r2 = ur1.C35196m.m111462h(r2)
                ur1.m$m$a r4 = new ur1.m$m$a
                ur1.m r3 = ur1.C35196m.this
                java.util.List<java.lang.Integer> r6 = r13.f149630E
                r4.<init>(r3, r6, r12)
                r13.f149633y = r8
                r13.f149632x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L65
                goto La3
            L65:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L91
                ur1.n$i r1 = new ur1.n$i
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                pg3.v0 r0 = (pg3.C29218v0) r0
                java.lang.Object r0 = r0.f118270b
                com.whoop.journal.api.SaveJournalBehaviorsResponse r0 = (com.whoop.journal.api.SaveJournalBehaviorsResponse) r0
                if (r0 == 0) goto L80
                com.whoop.navigation.e r0 = r0.getDestination()
                goto L81
            L80:
                r0 = r12
            L81:
                r1.<init>(r0)
                r13.f149633y = r12
                r13.f149631w = r12
                r13.f149632x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto La4
                goto La3
            L91:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto La7
                ur1.n$g r0 = ur1.AbstractC35197n.g.f149645a
                r13.f149633y = r12
                r13.f149631w = r12
                r13.f149632x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto La4
            La3:
                return r9
            La4:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            La7:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ur1.C35196m.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C35196m(JournalRepository journalRepository, C39730a analytics, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, JournalApi journalApi, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(journalRepository, "journalRepository");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(journalApi, "journalApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.journalRepository = journalRepository;
        this.analytics = analytics;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.journalApi = journalApi;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: A */
    private final AbstractC35197n.r m111453A(C35184a behaviorTrackers, C35198o journalEntry, boolean weightEqually, String requestDate, long cycleId, C32917i talkTextWidget) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C34098b c34098b : behaviorTrackers.m111385a()) {
            linkedHashMap.put(Integer.valueOf(c34098b.getTracker().getId()), c34098b);
        }
        ArrayList arrayList = new ArrayList();
        for (C34098b c34098b2 : journalEntry.m111511a()) {
            C34098b c34098b3 = (C34098b) linkedHashMap.get(Integer.valueOf(c34098b2.getTracker().getId()));
            if (c34098b3 != null) {
                arrayList.add(new C34098b(c34098b3.getTracker(), c34098b2.getValue(), false, 4, null));
            } else if (weightEqually) {
                arrayList.add(new C34098b(c34098b2.getTracker(), c34098b2.getValue(), false, 4, null));
            }
            linkedHashMap.remove(Integer.valueOf(c34098b2.getTracker().getId()));
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C34098b c34098b4 = (C34098b) ((Map.Entry) it.next()).getValue();
            arrayList.add(new C34098b(c34098b4.getTracker(), c34098b4.getValue(), false, 4, null));
        }
        return new AbstractC35197n.r(arrayList, journalEntry.getNotes(), null, behaviorTrackers.getDefaultAnswers(), false, journalEntry.getIsOnToday(), journalEntry.getHeaderText(), journalEntry.getJournalBounds(), requestDate, cycleId, journalEntry.getSubtitleCallout(), journalEntry.getDatePickerDomainState(), journalEntry.getNavigationButton(), talkTextWidget, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final InterfaceC13058l m111454B(String searchTerm) {
        return new C13084s1(new k(searchTerm, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC13058l m111455D(List<Integer> selectedItems) {
        return new C13084s1(new m(selectedItems, null));
    }

    /* JADX INFO: renamed from: F */
    private final C35187d m111456F(DatePickerInfo datePickerInfo) {
        return new C35187d(datePickerInfo.getTitle(), datePickerInfo.getNextDay(), datePickerInfo.getPreviousDay(), false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final int m111468n(List<JournalTrackerInput> list) {
        Iterator<T> it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((JournalTrackerInput) it.next()).getQuestionType() == QuestionType.TOGGLE) {
                i13++;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: o */
    private final Object m111469o(long j7, String str, InterfaceC30057d<? super Resource<UserSelectedJournalWithHistory>> interfaceC30057d) {
        return this.journalRepository.fetchUserSelectedJournalQuestions(j7, str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m111470p() {
        return new C13084s1(new a(null));
    }

    /* JADX INFO: renamed from: q */
    private final boolean m111471q(Resource<JournalEntryWrapper> journalEntryResponse) {
        JournalEntry journalEntry;
        List<TrackedBehavior> trackedBehaviors;
        TrackerInput trackerInput;
        JournalEntryWrapper data = journalEntryResponse.getData();
        if (data != null && (journalEntry = data.getJournalEntry()) != null && (trackedBehaviors = journalEntry.getTrackedBehaviors()) != null) {
            List<TrackedBehavior> list = trackedBehaviors;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (TrackedBehavior trackedBehavior : list) {
                if (trackedBehavior.getBehaviorTracker() != null && (trackerInput = trackedBehavior.getTrackerInput()) != null && trackerInput.hasAnswer()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    private final Object m111472r(String str, InterfaceC30057d<? super Resource<JournalEntryWrapper>> interfaceC30057d) {
        return this.journalRepository.fetchUserJournalEntryForDate(str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: s */
    private final int m111473s(List<C34098b> list) {
        Iterator<T> it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            if (((C34098b) it.next()).getTracker().getQuestionType() == QuestionType.TOGGLE) {
                i13++;
            }
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: t */
    public final Object m111474t(String str, boolean z4, boolean z13, InterfaceC30057d<? super C32917i> interfaceC30057d) {
        b bVar;
        String str2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f149562F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f149562F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f149566z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f149562F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (!this.featureFlagChecker.isFeatureEnabled("journal-talk-text-widget-mobile")) {
                return null;
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, z4, z13, null);
            bVar2.f149563w = str;
            bVar2.f149564x = z4;
            bVar2.f149565y = z13;
            bVar2.f149562F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            str2 = str;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) bVar2.f149563w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar2 = (InterfaceC34385a.c) interfaceC34385a;
            return new C32917i(((TalkTextWidgetResponse) cVar2.m108735a()).getWidget(), ((TalkTextWidgetResponse) cVar2.m108735a()).getAiAction(), ((TalkTextWidgetResponse) cVar2.m108735a()).getAutoSaveEnabled(), ((TalkTextWidgetResponse) cVar2.m108735a()).getBottomButtonText(), ((TalkTextWidgetResponse) cVar2.m108735a()).getAutoSaveInstructionText());
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(AbstractC11266d.m30461o("Fetching Talk/Text widget for date: ", str2), new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0131  */
    /* JADX WARN: Code duplicated, block: B:36:0x014e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0165  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0, types: [ur1.m] */
    /* JADX INFO: renamed from: v */
    public final Object m111475v(String str, long j7, boolean z4, String str2, String str3, EnumC39731b enumC39731b, InterfaceC30057d<? super AbstractC35197n> interfaceC30057d) {
        e eVar;
        String str4;
        String str5;
        EnumC39731b enumC39731b2;
        boolean z13;
        String str6;
        Object obj;
        Resource resource;
        boolean z14;
        String str7;
        String str8;
        String str9;
        Resource resource2;
        ?? r10;
        Object objM111474t;
        EnumC39731b enumC39731b3;
        String str10;
        String str11;
        String str12;
        boolean z15;
        Resource resource3;
        ?? r14;
        long j13;
        Boolean bool;
        boolean z16;
        EnumC39731b enumC39731b4;
        C35198o c35198o;
        String str13;
        String str14;
        C32917i c32917i;
        boolean z17;
        long j14;
        Resource resource4;
        long j15 = j7;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f149588P;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f149588P = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj2 = eVar.f149586N;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f149588P;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            eVar.f149589w = str;
            str4 = str2;
            eVar.f149590x = str4;
            str5 = str3;
            eVar.f149591y = str5;
            enumC39731b2 = enumC39731b;
            eVar.f149592z = enumC39731b2;
            eVar.f149582J = j15;
            z13 = z4;
            eVar.f149583K = z13;
            eVar.f149588P = 1;
            Object objM111469o = m111469o(j15, str, eVar);
            if (objM111469o != enumC31071a) {
                str6 = str;
                obj = objM111469o;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            boolean z18 = eVar.f149583K;
            j15 = eVar.f149582J;
            EnumC39731b enumC39731b5 = (EnumC39731b) eVar.f149592z;
            String str15 = (String) eVar.f149591y;
            String str16 = (String) eVar.f149590x;
            str6 = (String) eVar.f149589w;
            AbstractC34132o.m107864I(obj2);
            z13 = z18;
            obj = obj2;
            str4 = str16;
            enumC39731b2 = enumC39731b5;
            str5 = str15;
        } else {
            if (i14 == 2) {
                z14 = eVar.f149583K;
                j15 = eVar.f149582J;
                resource = (Resource) eVar.f149577E;
                enumC39731b2 = (EnumC39731b) eVar.f149592z;
                str7 = (String) eVar.f149591y;
                str8 = (String) eVar.f149590x;
                str9 = (String) eVar.f149589w;
                AbstractC34132o.m107864I(obj2);
                resource2 = (Resource) obj2;
                if (C28204u.INSTANCE.m85369l(str9, this.logger) || z14) {
                    r10 = 0;
                } else {
                    r10 = 1;
                }
                eVar.f149589w = str9;
                eVar.f149590x = str8;
                eVar.f149591y = str7;
                eVar.f149592z = enumC39731b2;
                eVar.f149577E = resource;
                eVar.f149578F = resource2;
                eVar.f149582J = j15;
                eVar.f149583K = z14;
                eVar.f149585M = r10;
                eVar.f149588P = 3;
                objM111474t = m111474t(str9, r10, z14, eVar);
                if (objM111474t != enumC31071a) {
                    String str17 = str7;
                    enumC39731b3 = enumC39731b2;
                    str10 = str9;
                    str11 = str8;
                    str12 = str17;
                    long j16 = j15;
                    z15 = z14;
                    resource3 = resource2;
                    obj2 = objM111474t;
                    r14 = r10;
                    j13 = j16;
                    C32917i c32917i2 = (C32917i) obj2;
                    if (resource.getSuccess()) {
                    }
                    this.analytics.m127131i(z15);
                    return new AbstractC35197n.q(new TextResource.C8688b(AbstractC29492c.f119852o, null, 2, null), EnumC32914f.COULD_NOT_LOAD_ENTRIES);
                }
                return enumC31071a;
            }
            if (i14 == 3) {
                int i15 = eVar.f149585M;
                z15 = eVar.f149583K;
                j13 = eVar.f149582J;
                resource3 = (Resource) eVar.f149578F;
                resource = (Resource) eVar.f149577E;
                enumC39731b3 = (EnumC39731b) eVar.f149592z;
                str12 = (String) eVar.f149591y;
                str11 = (String) eVar.f149590x;
                str10 = (String) eVar.f149589w;
                AbstractC34132o.m107864I(obj2);
                r14 = i15;
                C32917i c32917i3 = (C32917i) obj2;
                if (resource.getSuccess() || !resource3.getSuccess()) {
                    this.analytics.m127131i(z15);
                    return new AbstractC35197n.q(new TextResource.C8688b(AbstractC29492c.f119852o, null, 2, null), EnumC32914f.COULD_NOT_LOAD_ENTRIES);
                }
                boolean zM111471q = m111471q(resource3);
                JournalEntryWrapper journalEntryWrapper = (JournalEntryWrapper) resource3.getData();
                C35198o c35198oM111477y = journalEntryWrapper != null ? m111477y(journalEntryWrapper) : null;
                Boolean boolValueOf = c35198oM111477y != null ? Boolean.valueOf(c35198oM111477y.getIsOnToday()) : null;
                JournalRepository journalRepository = this.journalRepository;
                eVar.f149589w = str10;
                eVar.f149590x = str11;
                eVar.f149591y = str12;
                eVar.f149592z = enumC39731b3;
                eVar.f149577E = resource;
                Resource resource5 = resource;
                eVar.f149578F = null;
                eVar.f149579G = c32917i3;
                eVar.f149580H = c35198oM111477y;
                bool = boolValueOf;
                eVar.f149581I = bool;
                eVar.f149582J = j13;
                eVar.f149583K = z15;
                eVar.f149585M = r14;
                eVar.f149584L = zM111471q;
                eVar.f149588P = 4;
                Object lastStateOfUsersLastDefaultToggle = journalRepository.getLastStateOfUsersLastDefaultToggle(eVar);
                if (lastStateOfUsersLastDefaultToggle != enumC31071a) {
                    C35198o c35198o2 = c35198oM111477y;
                    z16 = z15;
                    enumC39731b4 = enumC39731b3;
                    c35198o = c35198o2;
                    str13 = str10;
                    str14 = str12;
                    c32917i = c32917i3;
                    obj2 = lastStateOfUsersLastDefaultToggle;
                    z17 = zM111471q;
                    j14 = j13;
                    resource4 = resource5;
                }
                return enumC31071a;
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z17 = eVar.f149584L;
            boolean z19 = eVar.f149583K;
            long j17 = eVar.f149582J;
            Boolean bool2 = (Boolean) eVar.f149581I;
            C35198o c35198o3 = (C35198o) eVar.f149580H;
            C32917i c32917i4 = (C32917i) eVar.f149579G;
            resource4 = (Resource) eVar.f149577E;
            EnumC39731b enumC39731b6 = (EnumC39731b) eVar.f149592z;
            String str18 = (String) eVar.f149591y;
            str11 = (String) eVar.f149590x;
            str13 = (String) eVar.f149589w;
            AbstractC34132o.m107864I(obj2);
            j14 = j17;
            str14 = str18;
            bool = bool2;
            c32917i = c32917i4;
            z16 = z19;
            enumC39731b4 = enumC39731b6;
            c35198o = c35198o3;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        UserSelectedJournalWithHistory userSelectedJournalWithHistory = (UserSelectedJournalWithHistory) resource4.getData();
        C35184a c35184aM111478z = userSelectedJournalWithHistory != null ? m111478z(userSelectedJournalWithHistory, bool, z17, zBooleanValue) : null;
        if (enumC39731b4 == EnumC39731b.CAROUSEL_DATE_SELECTION || enumC39731b4 == EnumC39731b.DATE_SELECTION) {
            this.analytics.m127130f(enumC39731b4, str13, Boolean.valueOf(z17));
        }
        if (c35184aM111478z == null || c35198o == null) {
            this.analytics.m127131i(z16);
            return new AbstractC35197n.q(new TextResource.C8688b(AbstractC29492c.f119852o, null, 2, null), EnumC32914f.COULD_NOT_LOAD_ENTRIES);
        }
        String str19 = str13;
        this.analytics.m127127c(z16, str19, str11, str14, c35184aM111478z.m111385a().size(), m111473s(c35184aM111478z.m111385a()), c35198o.getIsOnToday(), c35184aM111478z.getDefaultAnswers().getIsDefaultAnswerToggleVisible());
        return m111453A(c35184aM111478z, c35198o, this.featureFlagChecker.isFeatureEnabled("journal-show-untracked-behaviors"), str19, j14, c32917i);
        Resource resource6 = (Resource) obj;
        eVar.f149589w = str6;
        eVar.f149590x = str4;
        eVar.f149591y = str5;
        eVar.f149592z = enumC39731b2;
        eVar.f149577E = resource6;
        eVar.f149582J = j15;
        eVar.f149583K = z13;
        eVar.f149588P = 2;
        Object objM111472r = m111472r(str6, eVar);
        if (objM111472r != enumC31071a) {
            String str20 = str5;
            resource = resource6;
            z14 = z13;
            str7 = str20;
            String str21 = str6;
            str8 = str4;
            obj2 = objM111472r;
            str9 = str21;
            resource2 = (Resource) obj2;
            if (C28204u.INSTANCE.m85369l(str9, this.logger)) {
                r10 = 0;
            } else {
                r10 = 0;
            }
            eVar.f149589w = str9;
            eVar.f149590x = str8;
            eVar.f149591y = str7;
            eVar.f149592z = enumC39731b2;
            eVar.f149577E = resource;
            eVar.f149578F = resource2;
            eVar.f149582J = j15;
            eVar.f149583K = z14;
            eVar.f149585M = r10;
            eVar.f149588P = 3;
            objM111474t = m111474t(str9, r10, z14, eVar);
            if (objM111474t != enumC31071a) {
                String str110 = str7;
                enumC39731b3 = enumC39731b2;
                str10 = str9;
                str11 = str8;
                str12 = str110;
                long j18 = j15;
                z15 = z14;
                resource3 = resource2;
                obj2 = objM111474t;
                r14 = r10;
                j13 = j18;
                C32917i c32917i5 = (C32917i) obj2;
                if (resource.getSuccess()) {
                }
                this.analytics.m127131i(z15);
                return new AbstractC35197n.q(new TextResource.C8688b(AbstractC29492c.f119852o, null, 2, null), EnumC32914f.COULD_NOT_LOAD_ENTRIES);
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m111476x() {
        return new C3383g(new AbstractC35197n[]{AbstractC35197n.t.f149676a, AbstractC35197n.v.f149678a}, 3);
    }

    /* JADX INFO: renamed from: y */
    private final C35198o m111477y(JournalEntryWrapper journalEntryWrapper) {
        String notes;
        List<TrackedBehavior> trackedBehaviors;
        ArrayList arrayList = new ArrayList();
        JournalEntry journalEntry = journalEntryWrapper.getJournalEntry();
        if (journalEntry != null && (trackedBehaviors = journalEntry.getTrackedBehaviors()) != null) {
            for (TrackedBehavior trackedBehavior : trackedBehaviors) {
                JournalBehaviorTracker behaviorTracker = trackedBehavior.getBehaviorTracker();
                TrackerInput trackerInput = trackedBehavior.getTrackerInput();
                if (behaviorTracker != null && trackerInput != null) {
                    arrayList.add(new C34098b(behaviorTracker, trackerInput, false, 4, null));
                }
            }
        }
        JournalEntry journalEntry2 = journalEntryWrapper.getJournalEntry();
        if (journalEntry2 == null || (notes = journalEntry2.getNotes()) == null) {
            notes = "";
        }
        boolean showGradient = journalEntryWrapper.getMetadata().getShowGradient();
        String headerText = journalEntryWrapper.getMetadata().getHeaderText();
        JournalBounds journalBounds = journalEntryWrapper.getMetadata().getJournalBounds();
        SubtitleCallout subtitleCallout = journalEntryWrapper.getMetadata().getSubtitleCallout();
        DatePickerInfo datePickerInfo = journalEntryWrapper.getMetadata().getDatePickerInfo();
        C35187d c35187dM111456F = datePickerInfo != null ? m111456F(datePickerInfo) : null;
        NavigationButton navigationButton = journalEntryWrapper.getMetadata().getNavigationButton();
        return new C35198o(arrayList, notes, showGradient, headerText, journalBounds, subtitleCallout, c35187dM111456F, navigationButton != null ? m111481G(navigationButton) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private final C35184a m111478z(UserSelectedJournalWithHistory history, Boolean isToday, boolean userHasAnsweredJournalForTheDay, boolean savedToggleEnabled) {
        List<JournalBehaviourTrackerHistory> trackerHistoryList = history.getTrackerHistoryList();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(trackerHistoryList, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (JournalBehaviourTrackerHistory journalBehaviourTrackerHistory : trackerHistoryList) {
            linkedHashMap.put(Integer.valueOf(journalBehaviourTrackerHistory.getBehaviorTrackerId()), journalBehaviourTrackerHistory.getTrackerValue());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (JournalBehaviorTracker journalBehaviorTracker : history.getTrackerList()) {
            if (linkedHashMap.containsKey(Integer.valueOf(journalBehaviorTracker.getId()))) {
                TrackerValue trackerValue = (TrackerValue) linkedHashMap.get(Integer.valueOf(journalBehaviorTracker.getId()));
                if (journalBehaviorTracker.getQuestionType() == QuestionType.TOGGLE) {
                    arrayList.add(new C34098b(journalBehaviorTracker, new TrackerInput(trackerValue != null ? Boolean.valueOf(trackerValue.getAnswered()) : null, journalBehaviorTracker.getId(), null, null, null, null, null, null, null, null, 1020, null), false, 4, null));
                } else {
                    arrayList.add(new C34098b(journalBehaviorTracker, new TrackerInput(null, journalBehaviorTracker.getId(), null, null, null, null, null, null, null, null, 1021, null), false, 4, null));
                    arrayList2.add(new C34097a(journalBehaviorTracker.getId(), new TrackerInput(trackerValue != null ? Boolean.valueOf(trackerValue.getAnswered()) : null, journalBehaviorTracker.getId(), null, null, null, null, trackerValue != null ? trackerValue.getMagnitudeInputValue() : null, null, trackerValue != null ? trackerValue.getTimeInputValue() : null, null, 700, null)));
                }
            } else {
                arrayList.add(new C34098b(journalBehaviorTracker, new TrackerInput(null, journalBehaviorTracker.getId(), null, null, null, null, null, null, null, null, 1021, null), false, 4, null));
            }
        }
        return new C35184a(new C32911c((arrayList2.isEmpty() || userHasAnsweredJournalForTheDay || !AbstractC22676k.m65745e(isToday, Boolean.FALSE)) ? false : true, savedToggleEnabled, AbstractC25265s.m74093D1(arrayList2)), AbstractC25265s.m74093D1(arrayList));
    }

    /* JADX INFO: renamed from: C */
    public final Object m111479C(AbstractC32913e.d dVar, InterfaceC30057d<? super AbstractC32913e> interfaceC30057d) {
        return AbstractC28190p0.m85321a(500L, new l(dVar, this, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: E */
    public final Object m111480E(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object stateOfUsersLastDefaultToggle = this.journalRepository.setStateOfUsersLastDefaultToggle(z4, interfaceC30057d);
        return stateOfUsersLastDefaultToggle == EnumC31071a.f128113w ? stateOfUsersLastDefaultToggle : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public final C32915g m111481G(NavigationButton navigationButton) {
        AbstractC22676k.m65750j(navigationButton, "<this>");
        return new C32915g(navigationButton.getTitleDisplay(), navigationButton.getDestination().getScreen(), navigationButton.getIcon());
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new g(null, this));
    }

    /* JADX INFO: renamed from: u */
    public final void m111482u(AbstractC32913e.d currentState) {
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(currentState, this, null), 3);
    }

    /* JADX INFO: renamed from: w */
    public final void m111483w(AbstractC32913e.d currentState) {
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new f(currentState, this, null), 3);
    }

    public /* synthetic */ C35196m(JournalRepository journalRepository, C39730a c39730a, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, JournalApi journalApi, FeatureFlagChecker featureFlagChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(journalRepository, c39730a, interfaceC2994c0, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("JournalFetchInteractor") : interfaceC34116n, journalApi, featureFlagChecker);
    }
}
