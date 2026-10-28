package pr0;

import android.net.Uri;
import c93.InterfaceC4351m;
import com.whoop.communityhighlightscontainer.api.CommunityHighlightsContainerApi;
import com.whoop.communityhighlightscontainer.domain.model.CommunityHighlightsContainerResponse;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hc3.AbstractC17176i;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: pr0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 22\u00020\u0001:\u0001(B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0016\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001a\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020.0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, m65681d2 = {"Lpr0/c;", "", "Lcom/whoop/communityhighlightscontainer/api/CommunityHighlightsContainerApi;", "api", "Lwm0/a;", "scopeCoordinator", "", "refreshScope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/communityhighlightscontainer/api/CommunityHighlightsContainerApi;Lwm0/a;Ljava/lang/String;Ltr2/n;)V", "Lec3/m;", "Lpr0/b;", "state", "p", "(Lec3/m;Lpr0/b;Lq83/d;)Ljava/lang/Object;", "l", "(Lpr0/b;)Lpr0/b;", "path", "", "forceRefresh", "m", "(Lec3/m;Ljava/lang/String;Lpr0/b;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "o", "(Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lpr0/b;Lq83/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;Lpr0/b;Lq83/d;)Ljava/lang/Object;", "r", "(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/String;", "nextPagePath", "k", "(Lpr0/b;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lpr0/a;", "upstream", "q", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/communityhighlightscontainer/api/CommunityHighlightsContainerApi;", "b", "Ljava/lang/String;", "c", "Ltr2/n;", "Lpr0/a$d;", "d", "Lec3/l;", "scopeActions", "e", "community-highlights-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29488c {

    /* JADX INFO: renamed from: f */
    public static final int f119755f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommunityHighlightsContainerApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String refreshScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13058l scopeActions;

    /* JADX INFO: renamed from: pr0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {113}, m100432m = "fetchInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f119760E;

        /* JADX INFO: renamed from: w */
        Object f119761w;

        /* JADX INFO: renamed from: x */
        Object f119762x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f119763y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119763y = obj;
            this.f119760E |= Integer.MIN_VALUE;
            return C29488c.this.m90087j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pr0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor$fetchInitial$result$1", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f119765w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119767y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f119767y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29488c.this.new c(this.f119767y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119765w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityHighlightsContainerApi communityHighlightsContainerApi = C29488c.this.api;
            String str = this.f119767y;
            this.f119765w = 1;
            Object communityHighlightsContainer = communityHighlightsContainerApi.getCommunityHighlightsContainer(str, this);
            return communityHighlightsContainer == enumC31071a ? enumC31071a : communityHighlightsContainer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityHighlightsContainerResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: pr0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {138}, m100432m = "fetchMore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f119769F;

        /* JADX INFO: renamed from: w */
        Object f119770w;

        /* JADX INFO: renamed from: x */
        Object f119771x;

        /* JADX INFO: renamed from: y */
        Object f119772y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f119773z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119773z = obj;
            this.f119769F |= Integer.MIN_VALUE;
            return C29488c.this.m90088k(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: pr0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor$fetchMore$result$1", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {142}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f119774w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f119776y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29488c.this.new e(this.f119776y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119774w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityHighlightsContainerApi communityHighlightsContainerApi = C29488c.this.api;
            String str = this.f119776y;
            this.f119774w = 1;
            Object communityHighlightsContainer = communityHighlightsContainerApi.getCommunityHighlightsContainer(str, this);
            return communityHighlightsContainer == enumC31071a ? enumC31071a : communityHighlightsContainer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityHighlightsContainerResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: pr0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "handleLoadInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f119777E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f119778F;

        /* JADX INFO: renamed from: H */
        int f119780H;

        /* JADX INFO: renamed from: w */
        Object f119781w;

        /* JADX INFO: renamed from: x */
        Object f119782x;

        /* JADX INFO: renamed from: y */
        Object f119783y;

        /* JADX INFO: renamed from: z */
        Object f119784z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119778F = obj;
            this.f119780H |= Integer.MIN_VALUE;
            return C29488c.this.m90090m(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: pr0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {97, 98, 103, 104}, m100432m = "handleLoadPage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f119785E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f119786F;

        /* JADX INFO: renamed from: H */
        int f119788H;

        /* JADX INFO: renamed from: w */
        Object f119789w;

        /* JADX INFO: renamed from: x */
        Object f119790x;

        /* JADX INFO: renamed from: y */
        Object f119791y;

        /* JADX INFO: renamed from: z */
        Object f119792z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f119786F = obj;
            this.f119788H |= Integer.MIN_VALUE;
            return C29488c.this.m90092o(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: pr0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor$interact$1", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {34, 36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpr0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C29488c f119793E;

        /* JADX INFO: renamed from: w */
        Object f119794w;

        /* JADX INFO: renamed from: x */
        int f119795x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f119796y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f119797z;

        /* JADX INFO: renamed from: pr0.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f119798w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29488c f119799x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f119800y;

            /* JADX INFO: renamed from: pr0.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor$interact$1$1", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {38, 39, 41, 43}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42182a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f119801E;

                /* JADX INFO: renamed from: w */
                Object f119802w;

                /* JADX INFO: renamed from: x */
                Object f119803x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f119804y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f119805z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42182a(a<? super T> aVar, InterfaceC30057d<? super C42182a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f119805z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119804y = obj;
                    this.f119801E |= Integer.MIN_VALUE;
                    return this.f119805z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C29488c c29488c, InterfaceC13062m interfaceC13062m) {
                this.f119798w = c22669g0;
                this.f119799x = c29488c;
                this.f119800y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0101, code lost:
            
                if (r13.emit(r14, r6) == r0) goto L48;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(pr0.AbstractC29486a r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
                /*
                    Method dump skipped, instruction units count: 269
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pr0.C29488c.h.a.emit(pr0.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC13058l interfaceC13058l, C29488c c29488c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119797z = interfaceC13058l;
            this.f119793E = c29488c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f119797z, this.f119793E, interfaceC30057d);
            hVar.f119796y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        
            if (r14.collect(r4, r13) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f119796y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r13.f119795x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r13.f119794w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L6e
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.lang.Object r2 = r13.f119794w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r14)
                goto L48
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r14)
                pr0.b r5 = new pr0.b
                r11 = 31
                r12 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                r2.f89336w = r5
                r13.f119796y = r0
                r13.f119794w = r2
                r13.f119795x = r4
                java.lang.Object r14 = r0.emit(r5, r13)
                if (r14 != r1) goto L48
                goto L6d
            L48:
                ec3.l r14 = r13.f119797z
                pr0.c r5 = r13.f119793E
                ec3.l r5 = pr0.C29488c.m90082e(r5)
                ec3.l[] r4 = new ec3.InterfaceC13058l[r4]
                r6 = 0
                r4[r6] = r5
                ec3.l r14 = or2.AbstractC28157e0.m85207a(r14, r4)
                pr0.c$h$a r4 = new pr0.c$h$a
                pr0.c r5 = r13.f119793E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r13.f119796y = r0
                r13.f119794w = r0
                r13.f119795x = r3
                java.lang.Object r14 = r14.collect(r4, r13)
                if (r14 != r1) goto L6e
            L6d:
                return r1
            L6e:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: pr0.C29488c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: pr0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119806w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29488c f119807x;

        /* JADX INFO: renamed from: pr0.c$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119808w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29488c f119809x;

            /* JADX INFO: renamed from: pr0.c$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor$special$$inlined$filter$1$2", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42183a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f119811F;

                /* JADX INFO: renamed from: G */
                Object f119812G;

                /* JADX INFO: renamed from: H */
                int f119813H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119814w;

                /* JADX INFO: renamed from: x */
                int f119815x;

                /* JADX INFO: renamed from: y */
                Object f119816y;

                /* JADX INFO: renamed from: z */
                Object f119817z;

                public C42183a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119814w = obj;
                    this.f119815x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29488c c29488c) {
                this.f119808w = interfaceC13062m;
                this.f119809x = c29488c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42183a c42183a;
                if (interfaceC30057d instanceof C42183a) {
                    c42183a = (C42183a) interfaceC30057d;
                    int i13 = c42183a.f119815x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42183a.f119815x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42183a = new C42183a(interfaceC30057d);
                    }
                } else {
                    c42183a = new C42183a(interfaceC30057d);
                }
                Object obj2 = c42183a.f119814w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42183a.f119815x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119808w;
                    if (AbstractC22676k.m65745e((String) obj, this.f119809x.refreshScope)) {
                        c42183a.f119816y = null;
                        c42183a.f119817z = null;
                        c42183a.f119811F = null;
                        c42183a.f119812G = null;
                        c42183a.f119813H = 0;
                        c42183a.f119815x = 1;
                        if (interfaceC13062m.emit(obj, c42183a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l, C29488c c29488c) {
            this.f119806w = interfaceC13058l;
            this.f119807x = c29488c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119806w.collect(new a(interfaceC13062m, this.f119807x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pr0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119818w;

        /* JADX INFO: renamed from: pr0.c$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119819w;

            /* JADX INFO: renamed from: pr0.c$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityhighlightscontainer.domain.CommunityHighlightsContainerInteractor$special$$inlined$map$1$2", m100430f = "CommunityHighlightsContainerInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42184a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119820E;

                /* JADX INFO: renamed from: F */
                Object f119821F;

                /* JADX INFO: renamed from: G */
                Object f119822G;

                /* JADX INFO: renamed from: H */
                int f119823H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119824w;

                /* JADX INFO: renamed from: x */
                int f119825x;

                /* JADX INFO: renamed from: y */
                Object f119826y;

                public C42184a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119824w = obj;
                    this.f119825x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f119819w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42184a c42184a;
                if (interfaceC30057d instanceof C42184a) {
                    c42184a = (C42184a) interfaceC30057d;
                    int i13 = c42184a.f119825x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42184a.f119825x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42184a = new C42184a(interfaceC30057d);
                    }
                } else {
                    c42184a = new C42184a(interfaceC30057d);
                }
                Object obj2 = c42184a.f119824w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42184a.f119825x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119819w;
                    AbstractC29486a.d dVar = AbstractC29486a.d.f119748a;
                    c42184a.f119826y = null;
                    c42184a.f119820E = null;
                    c42184a.f119821F = null;
                    c42184a.f119822G = null;
                    c42184a.f119823H = 0;
                    c42184a.f119825x = 1;
                    if (interfaceC13062m.emit(dVar, c42184a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l) {
            this.f119818w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119818w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C29488c(CommunityHighlightsContainerApi api, C37378a scopeCoordinator, String str, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.refreshScope = str;
        this.logger = logger;
        this.scopeActions = new j(new i(scopeCoordinator.getScopeUpdateEvents(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m90087j(String str, C29487b c29487b, InterfaceC30057d<? super C29487b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f119760E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f119760E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f119763y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f119760E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, null);
            bVar2.f119761w = null;
            bVar2.f119762x = c29487b;
            bVar2.f119760E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch community highlights container", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29487b = (C29487b) bVar2.f119762x;
            AbstractC34132o.m107864I(objM108729b);
        }
        C29487b c29487b2 = c29487b;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C29487b.m90071b(c29487b2, false, false, (CommunityHighlightsContainerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, AbstractC29489d.c.f119831a, 8, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C29487b.m90071b(c29487b2, false, true, null, null, null, 28, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m90088k(C29487b c29487b, String str, Action action, InterfaceC30057d<? super C29487b> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f119769F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f119769F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f119773z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f119769F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str, null);
            dVar2.f119770w = c29487b;
            dVar2.f119771x = null;
            dVar2.f119772y = action;
            dVar2.f119769F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch next page of community highlights container", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            action = (Action) dVar2.f119772y;
            c29487b = (C29487b) dVar2.f119770w;
            AbstractC34132o.m107864I(objM108729b);
        }
        C29487b c29487b2 = c29487b;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            CommunityHighlightsContainerResponse data = c29487b2.getData();
            return C29487b.m90071b(c29487b2, false, false, data != null ? data.appendPage((CommunityHighlightsContainerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()) : null, null, AbstractC29489d.c.f119831a, 11, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C29487b.m90071b(c29487b2, false, false, null, null, new AbstractC29489d.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), action), 15, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C29487b m90089l(C29487b state) {
        return C29487b.m90071b(state, false, false, null, null, AbstractC29489d.c.f119831a, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: m */
    public final Object m90090m(InterfaceC13062m interfaceC13062m, String str, C29487b c29487b, boolean z4, InterfaceC30057d<? super C29487b> interfaceC30057d) {
        f fVar;
        C29487b c29487bM90071b;
        String str2;
        boolean z13;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f119780H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f119780H = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f119778F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = fVar2.f119780H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (AbstractC39414r.m125890i0(str)) {
                this.logger.mo85228t("LoadInitial: blank path, skipping", new AbstractC30556a.a[0]);
                return C29487b.m90071b(c29487b, false, true, null, null, null, 28, null);
            }
            if (!z4 && AbstractC22676k.m65745e(str, c29487b.getInitialPath()) && c29487b.getData() != null && !c29487b.getIsError()) {
                this.logger.mo85228t("LoadInitial: data already loaded for path, skipping fetch", new AbstractC30556a.a[0]);
                return C29487b.m90071b(c29487b, false, false, null, null, AbstractC29489d.c.f119831a, 14, null);
            }
            c29487bM90071b = C29487b.m90071b(c29487b, true, false, null, str, null, 20, null);
            fVar2.f119781w = null;
            fVar2.f119782x = str;
            fVar2.f119783y = null;
            fVar2.f119784z = c29487bM90071b;
            fVar2.f119777E = z4;
            fVar2.f119780H = 1;
            if (interfaceC13062m.emit(c29487bM90071b, fVar2) != obj2) {
                str2 = str;
                z13 = z4;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        z13 = fVar2.f119777E;
        c29487bM90071b = (C29487b) fVar2.f119784z;
        str2 = (String) fVar2.f119782x;
        AbstractC34132o.m107864I(obj);
        fVar2.f119781w = null;
        fVar2.f119782x = null;
        fVar2.f119783y = null;
        fVar2.f119784z = null;
        fVar2.f119777E = z13;
        fVar2.f119780H = 2;
        Object objM90087j = m90087j(str2, c29487bM90071b, fVar2);
        return objM90087j == obj2 ? obj2 : objM90087j;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Object m90091n(C29488c c29488c, InterfaceC13062m interfaceC13062m, String str, C29487b c29487b, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c29488c.m90090m(interfaceC13062m, str, c29487b, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: o */
    public final Object m90092o(InterfaceC13062m interfaceC13062m, Action action, C29487b c29487b, InterfaceC30057d<? super C29487b> interfaceC30057d) {
        g gVar;
        String str;
        C29487b c29487b2;
        C29487b c29487b3;
        String str2;
        Object objM90087j;
        Object objM90088k;
        Action action2 = action;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f119788H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f119788H = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f119786F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar.f119788H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String strM90094r = m90094r(action2);
            if (strM90094r == null || AbstractC39414r.m125890i0(strM90094r)) {
                this.logger.mo85228t("LoadPage: no GET path, skipping fetch", new AbstractC30556a.a[0]);
                return c29487b;
            }
            if (c29487b.getData() == null) {
                this.logger.mo85228t("LoadPage: no data loaded, skipping fetch", new AbstractC30556a.a[0]);
                return c29487b;
            }
            if (Uri.parse(strM90094r).getQueryParameter("nextToken") == null) {
                C29487b c29487bM90071b = C29487b.m90071b(c29487b, true, false, null, strM90094r, AbstractC29489d.c.f119831a, 4, null);
                gVar.f119789w = null;
                gVar.f119790x = null;
                gVar.f119791y = null;
                gVar.f119792z = strM90094r;
                gVar.f119785E = c29487bM90071b;
                gVar.f119788H = 1;
                if (interfaceC13062m.emit(c29487bM90071b, gVar) != obj2) {
                    c29487b3 = c29487bM90071b;
                    str2 = strM90094r;
                    gVar.f119789w = null;
                    gVar.f119790x = null;
                    gVar.f119791y = null;
                    gVar.f119792z = null;
                    gVar.f119785E = null;
                    gVar.f119788H = 2;
                    objM90087j = m90087j(str2, c29487b3, gVar);
                    if (objM90087j == obj2) {
                        return objM90087j;
                    }
                }
            } else {
                str = strM90094r;
                C29487b c29487bM90071b2 = C29487b.m90071b(c29487b, false, false, null, null, AbstractC29489d.b.f119830a, 15, null);
                gVar.f119789w = null;
                gVar.f119790x = action2;
                gVar.f119791y = null;
                gVar.f119792z = str;
                gVar.f119785E = c29487bM90071b2;
                gVar.f119788H = 3;
                if (interfaceC13062m.emit(c29487bM90071b2, gVar) != obj2) {
                    c29487b2 = c29487bM90071b2;
                    gVar.f119789w = null;
                    gVar.f119790x = null;
                    gVar.f119791y = null;
                    gVar.f119792z = null;
                    gVar.f119785E = null;
                    gVar.f119788H = 4;
                    objM90088k = m90088k(c29487b2, str, action2, gVar);
                    if (objM90088k == obj2) {
                        return objM90088k;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        c29487b2 = (C29487b) gVar.f119785E;
                        String str3 = (String) gVar.f119792z;
                        Action action3 = (Action) gVar.f119790x;
                        AbstractC34132o.m107864I(obj);
                        str = str3;
                        action2 = action3;
                        gVar.f119789w = null;
                        gVar.f119790x = null;
                        gVar.f119791y = null;
                        gVar.f119792z = null;
                        gVar.f119785E = null;
                        gVar.f119788H = 4;
                        objM90088k = m90088k(c29487b2, str, action2, gVar);
                        if (objM90088k == obj2) {
                            return objM90088k;
                        }
                    } else if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            c29487b3 = (C29487b) gVar.f119785E;
            str2 = (String) gVar.f119792z;
            AbstractC34132o.m107864I(obj);
            gVar.f119789w = null;
            gVar.f119790x = null;
            gVar.f119791y = null;
            gVar.f119792z = null;
            gVar.f119785E = null;
            gVar.f119788H = 2;
            objM90087j = m90087j(str2, c29487b3, gVar);
            if (objM90087j == obj2) {
                return objM90087j;
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m90093p(InterfaceC13062m interfaceC13062m, C29487b c29487b, InterfaceC30057d<? super C29487b> interfaceC30057d) {
        String initialPath = c29487b.getInitialPath();
        if (initialPath != null && !AbstractC39414r.m125890i0(initialPath)) {
            return m90090m(interfaceC13062m, initialPath, c29487b, true, interfaceC30057d);
        }
        this.logger.mo85228t("Refresh: no initial path, skipping", new AbstractC30556a.a[0]);
        return c29487b;
    }

    /* JADX INFO: renamed from: r */
    private final String m90094r(Action action) {
        Request request;
        UpdateAction updateAction = action instanceof UpdateAction ? (UpdateAction) action : null;
        if (updateAction != null && (request = updateAction.getRequest()) != null) {
            if (!AbstractC17176i.m48520v(request.getMethod(), Locale.ROOT, "toUpperCase(...)", "GET")) {
                request = null;
            }
            if (request != null) {
                return request.getPath();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m90095q(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new h(upstream, this, null));
    }

    public /* synthetic */ C29488c(CommunityHighlightsContainerApi communityHighlightsContainerApi, C37378a c37378a, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(communityHighlightsContainerApi, c37378a, str, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CommunityHighlightsContainerInteractor") : interfaceC34116n);
    }
}
