package zo0;

import ap0.C1881a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.coacheverywherecommon.models.CoachEntryData;
import dp0.AbstractC12249e;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ep0.AbstractC13397c;
import ep0.C13404j;
import ep0.EnumC13400f;
import ep0.EnumC13401g;
import ep0.InterfaceC13399e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import po0.C29397a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ro0.InterfaceC31627a;
import ro0.InterfaceC31628b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import so0.C32801a;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zo0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001:\u0002HFB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J%\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012J2\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b&\u0010'J2\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010*\u001a\u00020\"H\u0086@¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010*\u001a\u00020\"¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0012J\r\u00100\u001a\u00020\u0010¢\u0006\u0004\b0\u0010\u0012J1\u00104\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u00102\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u000101¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010AJ\u0013\u0010D\u001a\u00020C*\u00020BH\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020B0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010SR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00160Z8\u0006¢\u0006\f\n\u0004\b/\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00160Z8\u0006¢\u0006\f\n\u0004\b0\u0010[\u001a\u0004\b_\u0010]R\u001f\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010Z8\u0006¢\u0006\f\n\u0004\b4\u0010[\u001a\u0004\ba\u0010]R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00140Z8\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\bc\u0010]R\u0011\u0010g\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010j\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006k"}, m65681d2 = {"Lzo0/f;", "", "Lso0/a;", "interactor", "Lzo0/h;", "viewStateReducer", "Lap0/a;", "conversationUuidGenerator", "Lzo0/d;", "latencyTracker", "Lpo0/a;", "coachEverywhereAnalyticHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lso0/a;Lzo0/h;Lap0/a;Lzo0/d;Lpo0/a;Lbc3/c0;)V", "Ll83/a0;", "t", "()V", "A", "Lep0/e;", "state", "", "isBottomSheetVisible", "isBffScreen", "l", "(Lep0/e;ZZ)V", "Lep0/j;", "context", "Lzo0/f$a;", "z", "(Lep0/j;)Lzo0/f$a;", "y", "x", "", "previewText", "messageId", "currentContext", "u", "(Ljava/lang/String;Ljava/lang/String;Lep0/j;ZLq83/d;)Ljava/lang/Object;", "conversationId", "fingerprint", "screenIdentifier", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;Ljava/lang/String;)V", "i", "j", "", "ttfmtMs", "ttpiaMs", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "C", "(Lep0/j;)Z", "enabled", "B", "(Z)V", "accumulated", "Lro0/b;", "domainResult", "g", "(Lep0/e;Lro0/b;)Lep0/e;", "s", "(Lep0/e;)V", "Lzo0/g;", "Lro0/a;", "D", "(Lzo0/g;)Lro0/a;", "a", "Lso0/a;", "b", "Lzo0/h;", "c", "Lap0/a;", "d", "Lzo0/d;", "e", "Lpo0/a;", "f", "Lbc3/c0;", "Lec3/o1;", "Lec3/o1;", "eventFlow", "Lec3/p1;", "Lzo0/f$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/p1;", "prefetchState", "Lec3/f2;", "Lec3/f2;", "p", "()Lec3/f2;", "isPrefetchEnabled", "q", "isPreviewCollapsed", "o", "ttfmtStartTimeMs", "m", "animationState", "n", "()Lep0/e;", "currentAnimationState", "r", "()Z", "isProactivePreviewExpanded", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40918f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32801a interactor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40920h viewStateReducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C1881a conversationUuidGenerator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C40916d latencyTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C29397a coachEverywhereAnalyticHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC13075p1 prefetchState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13037f2 isPrefetchEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13037f2 isPreviewCollapsed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13037f2 ttfmtStartTimeMs;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC13037f2 animationState;

    /* JADX INFO: renamed from: zo0.f$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lzo0/f$a;", "", "a", "b", "Lzo0/f$a$a;", "Lzo0/f$a$b;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: zo0.f$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzo0/f$a$a;", "Lzo0/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42766a implements a {

            /* JADX INFO: renamed from: a */
            public static final C42766a f176398a = new C42766a();

            private C42766a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C42766a);
            }

            public int hashCode() {
                return -1893482607;
            }

            public String toString() {
                return "None";
            }
        }

        /* JADX INFO: renamed from: zo0.f$a$b */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzo0/f$a$b;", "Lzo0/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f176399a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 97391518;
            }

            public String toString() {
                return "Triggered";
            }
        }
    }

    /* JADX INFO: renamed from: zo0.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22656a implements Function3 {
        public c(Object obj) {
            super(3, 4, C40918f.class, obj, "accumulate", "accumulate(Lcom/whoop/coacheverywherecommon/models/ProactiveAnimationState;Lcom/whoop/coacheverywhere/domain/ProactiveResult;)Lcom/whoop/coacheverywherecommon/models/ProactiveAnimationState;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13399e interfaceC13399e, InterfaceC31628b interfaceC31628b, InterfaceC30057d<? super InterfaceC13399e> interfaceC30057d) {
            return C40918f.m132669h((C40918f) this.receiver, interfaceC13399e, interfaceC31628b, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: zo0.f$d */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$animationState$4", m100430f = "ProactiveCoordinator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lep0/e;", "state", "Ll83/a0;", "<anonymous>", "(Lep0/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176406w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176407x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C40918f.this.new d(interfaceC30057d);
            dVar.f176407x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13399e interfaceC13399e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13399e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13399e interfaceC13399e = (InterfaceC13399e) this.f176407x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f176406w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C40918f.this.m132670s(interfaceC13399e);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zo0.f$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$emitMarkMessageAsSeen$1", m100430f = "ProactiveCoordinator.kt", m100431l = {267}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Long f176409E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Long f176410F;

        /* JADX INFO: renamed from: w */
        int f176411w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f176413y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f176414z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Long l7, Long l12, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176413y = str;
            this.f176414z = str2;
            this.f176409E = l7;
            this.f176410F = l12;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40918f.this.new e(this.f176413y, this.f176414z, this.f176409E, this.f176410F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176411w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40918f.this.eventFlow;
                InterfaceC40919g.d dVar = new InterfaceC40919g.d(this.f176413y, this.f176414z, this.f176409E, this.f176410F);
                this.f176411w = 1;
                if (interfaceC13072o1.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zo0.f$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator", m100430f = "ProactiveCoordinator.kt", m100431l = {172}, m100432m = "onContentLoaded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f176415E;

        /* JADX INFO: renamed from: F */
        int f176416F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f176417G;

        /* JADX INFO: renamed from: I */
        int f176419I;

        /* JADX INFO: renamed from: w */
        Object f176420w;

        /* JADX INFO: renamed from: x */
        Object f176421x;

        /* JADX INFO: renamed from: y */
        Object f176422y;

        /* JADX INFO: renamed from: z */
        Object f176423z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176417G = obj;
            this.f176419I |= Integer.MIN_VALUE;
            return C40918f.this.m132685u(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: zo0.f$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator", m100430f = "ProactiveCoordinator.kt", m100431l = {205}, m100432m = "onDismissPreview", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f176424E;

        /* JADX INFO: renamed from: G */
        int f176426G;

        /* JADX INFO: renamed from: w */
        Object f176427w;

        /* JADX INFO: renamed from: x */
        Object f176428x;

        /* JADX INFO: renamed from: y */
        Object f176429y;

        /* JADX INFO: renamed from: z */
        Object f176430z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176424E = obj;
            this.f176426G |= Integer.MIN_VALUE;
            return C40918f.this.m132686v(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: zo0.f$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$onInsightPreviewDismissed$1", m100430f = "ProactiveCoordinator.kt", m100431l = {242}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176431w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f176433y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f176434z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176433y = str;
            this.f176434z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40918f.this.new h(this.f176433y, this.f176434z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176431w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C32801a c32801a = C40918f.this.interactor;
                String str = this.f176433y;
                String str2 = this.f176434z;
                this.f176431w = 1;
                if (c32801a.m102881l(str, str2, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zo0.f$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$onScreenRegistered$2", m100430f = "ProactiveCoordinator.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176435w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC13400f f176437y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC13401g f176438z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(EnumC13400f enumC13400f, EnumC13401g enumC13401g, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176437y = enumC13400f;
            this.f176438z = enumC13401g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40918f.this.new i(this.f176437y, this.f176438z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176435w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40918f.this.eventFlow;
                InterfaceC40919g.f fVar = new InterfaceC40919g.f(this.f176437y, this.f176438z);
                this.f176435w = 1;
                if (interfaceC13072o1.emit(fVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zo0.f$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$onScreenRegistered$3", m100430f = "ProactiveCoordinator.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176439w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f176441y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f176442z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176441y = str;
            this.f176442z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40918f.this.new j(this.f176441y, this.f176442z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176439w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40918f.this.eventFlow;
                InterfaceC40919g.b bVar = new InterfaceC40919g.b(this.f176441y, this.f176442z);
                this.f176439w = 1;
                if (interfaceC13072o1.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: zo0.f$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$onScreenRegistered$4", m100430f = "ProactiveCoordinator.kt", m100431l = {139}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f176443E;

        /* JADX INFO: renamed from: w */
        Object f176444w;

        /* JADX INFO: renamed from: x */
        int f176445x;

        /* JADX INFO: renamed from: y */
        int f176446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176443E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40918f.this.new k(this.f176443E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176446y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM132632c = C40918f.this.latencyTracker.m132632c();
                if (strM132632c != null) {
                    C40918f c40918f = C40918f.this;
                    String str = this.f176443E;
                    InterfaceC13072o1 interfaceC13072o1 = c40918f.eventFlow;
                    InterfaceC40919g.c cVar = new InterfaceC40919g.c(str, strM132632c);
                    this.f176444w = null;
                    this.f176445x = 0;
                    this.f176446y = 1;
                    if (interfaceC13072o1.emit(cVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: zo0.f$l */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176448w;

        /* JADX INFO: renamed from: zo0.f$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176449w;

            /* JADX INFO: renamed from: zo0.f$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$special$$inlined$map$1$2", m100430f = "ProactiveCoordinator.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42767a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176450E;

                /* JADX INFO: renamed from: F */
                Object f176451F;

                /* JADX INFO: renamed from: G */
                Object f176452G;

                /* JADX INFO: renamed from: H */
                int f176453H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176454w;

                /* JADX INFO: renamed from: x */
                int f176455x;

                /* JADX INFO: renamed from: y */
                Object f176456y;

                public C42767a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176454w = obj;
                    this.f176455x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f176449w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42767a c42767a;
                if (interfaceC30057d instanceof C42767a) {
                    c42767a = (C42767a) interfaceC30057d;
                    int i13 = c42767a.f176455x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42767a.f176455x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42767a = new C42767a(interfaceC30057d);
                    }
                } else {
                    c42767a = new C42767a(interfaceC30057d);
                }
                Object obj2 = c42767a.f176454w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42767a.f176455x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176449w;
                    Boolean boolValueOf = Boolean.valueOf(((b) obj).getIsPrefetchEnabled());
                    c42767a.f176456y = null;
                    c42767a.f176450E = null;
                    c42767a.f176451F = null;
                    c42767a.f176452G = null;
                    c42767a.f176453H = 0;
                    c42767a.f176455x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42767a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l) {
            this.f176448w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176448w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zo0.f$m */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176458w;

        /* JADX INFO: renamed from: zo0.f$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176459w;

            /* JADX INFO: renamed from: zo0.f$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$special$$inlined$map$2$2", m100430f = "ProactiveCoordinator.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42768a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176460E;

                /* JADX INFO: renamed from: F */
                Object f176461F;

                /* JADX INFO: renamed from: G */
                Object f176462G;

                /* JADX INFO: renamed from: H */
                int f176463H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176464w;

                /* JADX INFO: renamed from: x */
                int f176465x;

                /* JADX INFO: renamed from: y */
                Object f176466y;

                public C42768a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176464w = obj;
                    this.f176465x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f176459w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42768a c42768a;
                if (interfaceC30057d instanceof C42768a) {
                    c42768a = (C42768a) interfaceC30057d;
                    int i13 = c42768a.f176465x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42768a.f176465x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42768a = new C42768a(interfaceC30057d);
                    }
                } else {
                    c42768a = new C42768a(interfaceC30057d);
                }
                Object obj2 = c42768a.f176464w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42768a.f176465x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176459w;
                    Boolean boolValueOf = Boolean.valueOf(((b) obj).getIsPreviewCollapsed());
                    c42768a.f176466y = null;
                    c42768a.f176460E = null;
                    c42768a.f176461F = null;
                    c42768a.f176462G = null;
                    c42768a.f176463H = 0;
                    c42768a.f176465x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42768a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f176458w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176458w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zo0.f$n */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176468w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40918f f176469x;

        /* JADX INFO: renamed from: zo0.f$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176470w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40918f f176471x;

            /* JADX INFO: renamed from: zo0.f$n$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes7.dex */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.presentation.ProactiveCoordinator$special$$inlined$map$3$2", m100430f = "ProactiveCoordinator.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42769a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176472E;

                /* JADX INFO: renamed from: F */
                Object f176473F;

                /* JADX INFO: renamed from: G */
                Object f176474G;

                /* JADX INFO: renamed from: H */
                int f176475H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176476w;

                /* JADX INFO: renamed from: x */
                int f176477x;

                /* JADX INFO: renamed from: y */
                Object f176478y;

                public C42769a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176476w = obj;
                    this.f176477x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40918f c40918f) {
                this.f176470w = interfaceC13062m;
                this.f176471x = c40918f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42769a c42769a;
                if (interfaceC30057d instanceof C42769a) {
                    c42769a = (C42769a) interfaceC30057d;
                    int i13 = c42769a.f176477x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42769a.f176477x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42769a = new C42769a(interfaceC30057d);
                    }
                } else {
                    c42769a = new C42769a(interfaceC30057d);
                }
                Object obj2 = c42769a.f176476w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42769a.f176477x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176470w;
                    InterfaceC31627a interfaceC31627aM132661D = this.f176471x.m132661D((InterfaceC40919g) obj);
                    c42769a.f176478y = null;
                    c42769a.f176472E = null;
                    c42769a.f176473F = null;
                    c42769a.f176474G = null;
                    c42769a.f176475H = 0;
                    c42769a.f176477x = 1;
                    if (interfaceC13062m.emit(interfaceC31627aM132661D, c42769a) == enumC31071a) {
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

        public n(InterfaceC13058l interfaceC13058l, C40918f c40918f) {
            this.f176468w = interfaceC13058l;
            this.f176469x = c40918f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176468w.collect(new a(interfaceC13062m, this.f176469x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C40918f(C32801a interactor, C40920h viewStateReducer, C1881a conversationUuidGenerator, C40916d latencyTracker, C29397a coachEverywhereAnalyticHelper, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(conversationUuidGenerator, "conversationUuidGenerator");
        AbstractC22676k.m65750j(latencyTracker, "latencyTracker");
        AbstractC22676k.m65750j(coachEverywhereAnalyticHelper, "coachEverywhereAnalyticHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.conversationUuidGenerator = conversationUuidGenerator;
        this.latencyTracker = latencyTracker;
        this.coachEverywhereAnalyticHelper = coachEverywhereAnalyticHelper;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new b(false, null, false, null, false, null, 63, null));
        this.prefetchState = c13045h2M36593c;
        l lVar = new l(c13045h2M36593c);
        Boolean bool = Boolean.FALSE;
        C13021b2 c13021b2 = C13105z1.f45288a;
        this.isPrefetchEnabled = AbstractC13091v.m36587M(lVar, coroutineScope, c13021b2, bool);
        this.isPreviewCollapsed = AbstractC13091v.m36587M(new m(c13045h2M36593c), coroutineScope, c13021b2, bool);
        this.ttfmtStartTimeMs = latencyTracker.getTtfmtStartTimeMs();
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(new n(c13096w1M36592b, this));
        InterfaceC13399e.d dVar = InterfaceC13399e.d.f46941a;
        this.animationState = AbstractC13091v.m36587M(new C13052j1(new C13060l1(dVar, interfaceC13058lInteract, new c(this)), new d(null), 0), coroutineScope, c13021b2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC31627a m132661D(InterfaceC40919g interfaceC40919g) {
        if (interfaceC40919g instanceof InterfaceC40919g.c) {
            InterfaceC40919g.c cVar = (InterfaceC40919g.c) interfaceC40919g;
            return new InterfaceC31627a.c(cVar.getScreenName(), cVar.getConversationId());
        }
        if (interfaceC40919g instanceof InterfaceC40919g.b) {
            InterfaceC40919g.b bVar = (InterfaceC40919g.b) interfaceC40919g;
            return new InterfaceC31627a.b(bVar.getFingerprint(), bVar.getScreenName());
        }
        if (interfaceC40919g instanceof InterfaceC40919g.f) {
            InterfaceC40919g.f fVar = (InterfaceC40919g.f) interfaceC40919g;
            return new InterfaceC31627a.f(fVar.getOnLoadStyle(), fVar.getLoadStyle());
        }
        if (interfaceC40919g instanceof InterfaceC40919g.e) {
            return new InterfaceC31627a.e(((InterfaceC40919g.e) interfaceC40919g).getPreviewText());
        }
        if (interfaceC40919g instanceof InterfaceC40919g.d) {
            InterfaceC40919g.d dVar = (InterfaceC40919g.d) interfaceC40919g;
            return new InterfaceC31627a.d(dVar.getConversationId(), dVar.getMessageId(), dVar.getTtfmtMs(), dVar.getTtpiaMs());
        }
        if (!(interfaceC40919g instanceof InterfaceC40919g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC40919g.a aVar = (InterfaceC40919g.a) interfaceC40919g;
        return new InterfaceC31627a.a(aVar.getConversationId(), aVar.getMessageId(), aVar.getFingerprint());
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC13399e m132668g(InterfaceC13399e accumulated, InterfaceC31628b domainResult) {
        if (!(domainResult instanceof InterfaceC31628b.a)) {
            return this.viewStateReducer.m132715a(domainResult);
        }
        if (!(accumulated instanceof InterfaceC13399e.e)) {
            return accumulated instanceof InterfaceC13399e.a ? InterfaceC13399e.a.m37832b((InterfaceC13399e.a) accumulated, null, null, ((InterfaceC31628b.a) domainResult).getPreviewText(), null, null, false, 59, null) : accumulated;
        }
        InterfaceC13399e.e eVar = (InterfaceC13399e.e) accumulated;
        return new InterfaceC13399e.a(eVar.getOnLoadStyle(), eVar.getLoadStyle(), ((InterfaceC31628b.a) domainResult).getPreviewText(), this.latencyTracker.m132633d(), this.latencyTracker.m132632c(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ Object m132669h(C40918f c40918f, InterfaceC13399e interfaceC13399e, InterfaceC31628b interfaceC31628b, InterfaceC30057d interfaceC30057d) {
        return c40918f.m132668g(interfaceC13399e, interfaceC31628b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final void m132670s(InterfaceC13399e state) {
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            b bVar = (b) value;
            InterfaceC13399e interfaceC13399e = state;
            if (c13045h2.m36569i(value, b.m132691b(bVar, ((state instanceof InterfaceC13399e.e) && bVar.getCurrentContextSupportsPrefetch() && !bVar.getIsPrefetchEnabled()) ? true : bVar.getIsPrefetchEnabled(), interfaceC13399e, false, null, false, null, 60, null).m132698h(bVar.getCurrentFingerprint()))) {
                return;
            } else {
                state = interfaceC13399e;
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m132671A() {
        this.latencyTracker.m132637h();
    }

    /* JADX INFO: renamed from: B */
    public final void m132672B(boolean enabled) {
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        while (true) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Object value = c13045h2.getValue();
            boolean z4 = enabled;
            if (c13045h2.m36569i(value, b.m132691b((b) value, z4, null, false, null, false, null, 62, null))) {
                return;
            } else {
                enabled = z4;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m132673C(C13404j currentContext) {
        boolean z4;
        String fingerprint = currentContext != null ? currentContext.getFingerprint() : null;
        boolean z13 = fingerprint == null || fingerprint.length() == 0;
        InterfaceC13399e currentAnimationState = ((b) ((C13045h2) this.prefetchState).getValue()).getCurrentAnimationState();
        if (z13) {
            z4 = currentAnimationState instanceof InterfaceC13399e.e;
        } else {
            z4 = (currentAnimationState instanceof InterfaceC13399e.e) || (currentAnimationState instanceof InterfaceC13399e.a);
        }
        if (z4) {
            if (currentContext != null ? AbstractC22676k.m65745e(currentContext.getIsWcePrefetch(), Boolean.TRUE) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m132674i() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, b.m132691b((b) value, false, InterfaceC13399e.d.f46941a, false, null, false, null, 12, null)));
        this.latencyTracker.m132637h();
    }

    /* JADX INFO: renamed from: j */
    public final void m132675j() {
        C13045h2 c13045h2;
        Object value;
        b bVar;
        if (m132679n() instanceof InterfaceC13399e.a) {
            InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
                bVar = (b) value;
            } while (!c13045h2.m36569i(value, b.m132691b(bVar, false, null, false, null, true, bVar.getCurrentFingerprint(), 15, null)));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m132676k(String conversationId, String messageId, Long ttfmtMs, Long ttpiaMs) {
        AbstractC22676k.m65750j(conversationId, "conversationId");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new e(conversationId, messageId, ttfmtMs, ttpiaMs, null), 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m132677l(InterfaceC13399e state, boolean isBottomSheetVisible, boolean isBffScreen) {
        AbstractC22676k.m65750j(state, "state");
        C40916d.b bVarM132631b = this.latencyTracker.m132631b(state, isBottomSheetVisible, isBffScreen);
        if (bVarM132631b != null) {
            m132676k(bVarM132631b.getConversationUuid(), bVarM132631b.getMessageId(), bVarM132631b.getTtfmtMs(), bVarM132631b.getTtpiaMs());
        }
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final InterfaceC13037f2 getAnimationState() {
        return this.animationState;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13399e m132679n() {
        return ((b) ((C13045h2) this.prefetchState).getValue()).getCurrentAnimationState();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13037f2 getTtfmtStartTimeMs() {
        return this.ttfmtStartTimeMs;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13037f2 getIsPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final InterfaceC13037f2 getIsPreviewCollapsed() {
        return this.isPreviewCollapsed;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m132683r() {
        b bVar = (b) ((C13045h2) this.prefetchState).getValue();
        InterfaceC13399e currentAnimationState = bVar.getCurrentAnimationState();
        InterfaceC13399e.a aVar = currentAnimationState instanceof InterfaceC13399e.a ? (InterfaceC13399e.a) currentAnimationState : null;
        return (aVar == null || !bVar.getIsPrefetchEnabled() || bVar.getIsPreviewCollapsed() || aVar.getOnLoadStyle() != EnumC13400f.PREVIEW || AbstractC39414r.m125890i0(aVar.getPreviewText())) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public final void m132684t() {
        this.latencyTracker.m132640k();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m132685u(String str, String str2, C13404j c13404j, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        f fVar;
        Boolean isWcePrefetch;
        int i13;
        int i14;
        Boolean bool;
        C40916d.b bVarM132630a;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i15 = fVar.f176419I;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f176419I = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f176417G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = fVar.f176419I;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            this.latencyTracker.m132635f(str2);
            isWcePrefetch = c13404j != null ? c13404j.getIsWcePrefetch() : null;
            String fingerprint = c13404j != null ? c13404j.getFingerprint() : null;
            i13 = ((fingerprint == null || fingerprint.length() == 0) ? 1 : 0) ^ 1;
            if (AbstractC22676k.m65745e(isWcePrefetch, Boolean.TRUE)) {
                InterfaceC13072o1 interfaceC13072o1 = this.eventFlow;
                InterfaceC40919g.e eVar = new InterfaceC40919g.e(str, str2);
                fVar.f176420w = null;
                fVar.f176421x = null;
                fVar.f176422y = null;
                fVar.f176423z = isWcePrefetch;
                fVar.f176415E = z4;
                fVar.f176416F = i13;
                fVar.f176419I = 1;
                if (interfaceC13072o1.emit(eVar, fVar) == enumC31071a) {
                    return enumC31071a;
                }
                i14 = i13;
                bool = isWcePrefetch;
            }
            if (this.latencyTracker.m132639j(i13 != 0, isWcePrefetch, z4) && (bVarM132630a = this.latencyTracker.m132630a()) != null) {
                m132676k(bVarM132630a.getConversationUuid(), bVarM132630a.getMessageId(), bVarM132630a.getTtfmtMs(), bVarM132630a.getTtpiaMs());
            }
            return C23454a0.f92919a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i14 = fVar.f176416F;
        z4 = fVar.f176415E;
        bool = (Boolean) fVar.f176423z;
        AbstractC34132o.m107864I(obj);
        i13 = i14;
        isWcePrefetch = bool;
        if (this.latencyTracker.m132639j(i13 != 0, isWcePrefetch, z4)) {
            m132676k(bVarM132630a.getConversationUuid(), bVarM132630a.getMessageId(), bVarM132630a.getTtfmtMs(), bVarM132630a.getTtpiaMs());
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m132686v(String str, String str2, String str3, String str4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        C13045h2 c13045h2;
        Object value;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f176426G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f176426G = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f176424E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f176426G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.coachEverywhereAnalyticHelper.m89575k(new AbstractC12249e.d(str4, "preview", "insight_dismiss"));
            InterfaceC13072o1 interfaceC13072o1 = this.eventFlow;
            InterfaceC40919g.a aVar = new InterfaceC40919g.a(str, str2, str3);
            gVar.f176427w = null;
            gVar.f176428x = null;
            gVar.f176429y = null;
            gVar.f176430z = null;
            gVar.f176426G = 1;
            if (interfaceC13072o1.emit(aVar, gVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, b.m132691b((b) value, false, InterfaceC13399e.d.f46941a, false, null, false, null, 12, null)));
        this.latencyTracker.m132637h();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public final void m132687w(String fingerprint, String screenIdentifier) {
        String messageId;
        AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
        InterfaceC13399e interfaceC13399eM132679n = m132679n();
        InterfaceC13399e.a aVar = interfaceC13399eM132679n instanceof InterfaceC13399e.a ? (InterfaceC13399e.a) interfaceC13399eM132679n : null;
        if (aVar == null || (messageId = aVar.getMessageId()) == null) {
            return;
        }
        this.coachEverywhereAnalyticHelper.m89575k(new AbstractC12249e.d(screenIdentifier, "preview", "insight_dismiss"));
        if (fingerprint != null) {
            if (AbstractC39414r.m125890i0(fingerprint)) {
                fingerprint = null;
            }
            if (fingerprint == null) {
                return;
            }
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new h(fingerprint, messageId, null), 3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m132688x() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, b.m132691b((b) value, false, null, false, null, false, null, 7, null)));
    }

    /* JADX INFO: renamed from: y */
    public final void m132689y() {
        C13045h2 c13045h2;
        Object value;
        this.latencyTracker.m132637h();
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, b.m132691b((b) value, false, null, false, null, false, null, 62, null)));
    }

    /* JADX INFO: renamed from: z */
    public final a m132690z(C13404j context) {
        C13045h2 c13045h2;
        Object value;
        b bVarM132698h;
        Boolean isWcePrefetch;
        CoachEntryData data;
        CoachEntry coachEntry;
        String fingerprint;
        this.latencyTracker.m132637h();
        String str = (context == null || (fingerprint = context.getFingerprint()) == null || fingerprint.length() <= 0) ? null : fingerprint;
        InterfaceC13075p1 interfaceC13075p1 = this.prefetchState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            b bVarM132691b = b.m132691b((b) value, false, null, context != null ? AbstractC22676k.m65745e(context.getIsWcePrefetch(), Boolean.TRUE) : false, str, false, null, 51, null);
            if (context == null || (coachEntry = context.getCoachEntry()) == null || !coachEntry.getStartsCollapsed() || str == null) {
                bVarM132698h = bVarM132691b.m132698h(str);
            } else {
                String str2 = str;
                bVarM132698h = b.m132691b(bVarM132691b, false, null, false, null, true, str2, 15, null);
                str = str2;
            }
        } while (!c13045h2.m36569i(value, bVarM132698h));
        if (context == null || (isWcePrefetch = context.getIsWcePrefetch()) == null) {
            return a.C42766a.f176398a;
        }
        boolean zBooleanValue = isWcePrefetch.booleanValue();
        String conversationSeedId = context.getConversationSeedId();
        String screenName = context.getScreenName();
        if (conversationSeedId != null) {
            this.latencyTracker.m132638i(this.conversationUuidGenerator.m5658a(conversationSeedId, context));
        }
        if (zBooleanValue && screenName.length() != 0) {
            if (conversationSeedId == null && str == null) {
                return a.C42766a.f176398a;
            }
            this.latencyTracker.m132636g();
            EnumC13400f enumC13400fM37824a = AbstractC13397c.m37824a(context.getCoachEntry());
            CoachEntry coachEntry2 = context.getCoachEntry();
            EnumC13401g loadStyle = (coachEntry2 == null || (data = coachEntry2.getData()) == null) ? null : data.getLoadStyle();
            if (str != null && enumC13400fM37824a != null && loadStyle != null) {
                AbstractC3006f0.m8732z(this.coroutineScope, null, null, new i(enumC13400fM37824a, loadStyle, null), 3);
            } else if (str != null) {
                AbstractC3006f0.m8732z(this.coroutineScope, null, null, new j(str, screenName, null), 3);
            } else {
                AbstractC3006f0.m8732z(this.coroutineScope, null, null, new k(screenName, null), 3);
            }
            return a.b.f176399a;
        }
        return a.C42766a.f176398a;
    }

    /* JADX INFO: renamed from: zo0.f$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJP\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b%\u0010\u0013¨\u0006&"}, m65681d2 = {"Lzo0/f$b;", "", "", "isPrefetchEnabled", "Lep0/e;", "currentAnimationState", "currentContextSupportsPrefetch", "", "currentFingerprint", "isPreviewCollapsed", "collapsedFingerprint", "<init>", "(ZLep0/e;ZLjava/lang/String;ZLjava/lang/String;)V", "fingerprint", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lzo0/f$b;", "a", "(ZLep0/e;ZLjava/lang/String;ZLjava/lang/String;)Lzo0/f$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Lep0/e;", "c", "()Lep0/e;", "d", "Ljava/lang/String;", "e", "g", "getCollapsedFingerprint", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isPrefetchEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC13399e currentAnimationState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean currentContextSupportsPrefetch;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String currentFingerprint;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean isPreviewCollapsed;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String collapsedFingerprint;

        public b(boolean z4, InterfaceC13399e currentAnimationState, boolean z13, String str, boolean z14, String str2) {
            AbstractC22676k.m65750j(currentAnimationState, "currentAnimationState");
            this.isPrefetchEnabled = z4;
            this.currentAnimationState = currentAnimationState;
            this.currentContextSupportsPrefetch = z13;
            this.currentFingerprint = str;
            this.isPreviewCollapsed = z14;
            this.collapsedFingerprint = str2;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m132691b(b bVar, boolean z4, InterfaceC13399e interfaceC13399e, boolean z13, String str, boolean z14, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = bVar.isPrefetchEnabled;
            }
            if ((i13 & 2) != 0) {
                interfaceC13399e = bVar.currentAnimationState;
            }
            if ((i13 & 4) != 0) {
                z13 = bVar.currentContextSupportsPrefetch;
            }
            if ((i13 & 8) != 0) {
                str = bVar.currentFingerprint;
            }
            if ((i13 & 16) != 0) {
                z14 = bVar.isPreviewCollapsed;
            }
            if ((i13 & 32) != 0) {
                str2 = bVar.collapsedFingerprint;
            }
            boolean z15 = z14;
            String str3 = str2;
            return bVar.m132692a(z4, interfaceC13399e, z13, str, z15, str3);
        }

        /* JADX INFO: renamed from: a */
        public final b m132692a(boolean isPrefetchEnabled, InterfaceC13399e currentAnimationState, boolean currentContextSupportsPrefetch, String currentFingerprint, boolean isPreviewCollapsed, String collapsedFingerprint) {
            AbstractC22676k.m65750j(currentAnimationState, "currentAnimationState");
            return new b(isPrefetchEnabled, currentAnimationState, currentContextSupportsPrefetch, currentFingerprint, isPreviewCollapsed, collapsedFingerprint);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC13399e getCurrentAnimationState() {
            return this.currentAnimationState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getCurrentContextSupportsPrefetch() {
            return this.currentContextSupportsPrefetch;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCurrentFingerprint() {
            return this.currentFingerprint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.isPrefetchEnabled == bVar.isPrefetchEnabled && AbstractC22676k.m65745e(this.currentAnimationState, bVar.currentAnimationState) && this.currentContextSupportsPrefetch == bVar.currentContextSupportsPrefetch && AbstractC22676k.m65745e(this.currentFingerprint, bVar.currentFingerprint) && this.isPreviewCollapsed == bVar.isPreviewCollapsed && AbstractC22676k.m65745e(this.collapsedFingerprint, bVar.collapsedFingerprint);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsPrefetchEnabled() {
            return this.isPrefetchEnabled;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getIsPreviewCollapsed() {
            return this.isPreviewCollapsed;
        }

        /* JADX INFO: renamed from: h */
        public final b m132698h(String fingerprint) {
            String str = this.collapsedFingerprint;
            boolean z4 = str != null && AbstractC22676k.m65745e(str, fingerprint);
            String str2 = this.collapsedFingerprint;
            if (!z4) {
                str2 = null;
            }
            return m132691b(this, false, null, false, null, z4, str2, 15, null);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.currentAnimationState.hashCode() + (Boolean.hashCode(this.isPrefetchEnabled) * 31)) * 31, 31, this.currentContextSupportsPrefetch);
            String str = this.currentFingerprint;
            int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.isPreviewCollapsed);
            String str2 = this.collapsedFingerprint;
            return iM8289b2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            boolean z4 = this.isPrefetchEnabled;
            InterfaceC13399e interfaceC13399e = this.currentAnimationState;
            boolean z13 = this.currentContextSupportsPrefetch;
            String str = this.currentFingerprint;
            boolean z14 = this.isPreviewCollapsed;
            String str2 = this.collapsedFingerprint;
            StringBuilder sb4 = new StringBuilder("PrefetchState(isPrefetchEnabled=");
            sb4.append(z4);
            sb4.append(", currentAnimationState=");
            sb4.append(interfaceC13399e);
            sb4.append(", currentContextSupportsPrefetch=");
            AbstractC38963t7.m124391u(sb4, z13, ", currentFingerprint=", str, ", isPreviewCollapsed=");
            return AbstractC21702c.m61139j(sb4, z14, ", collapsedFingerprint=", str2, ")");
        }

        public /* synthetic */ b(boolean z4, InterfaceC13399e interfaceC13399e, boolean z13, String str, boolean z14, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? InterfaceC13399e.d.f46941a : interfaceC13399e, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? null : str2);
        }
    }
}
