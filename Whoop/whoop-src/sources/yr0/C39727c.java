package yr0;

import c93.InterfaceC4351m;
import com.whoop.communitymoments.domain.models.MomentCardModel;
import com.whoop.communitymoments.domain.models.MomentStackModel;
import com.whoop.communitymomentscontainer.api.CommunityMomentsContainerApi;
import com.whoop.communitymomentscontainer.domain.model.CommunityMomentsContainerResponse;
import com.whoop.communitymomentscontainer.domain.model.MomentsPagination;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.navigation.models.ApiRequest;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.C25235a0;
import od1.InterfaceC27844g;
import p098dt.AbstractC12350b;
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
import wb3.AbstractC37056f;
import wm0.C37378a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yr0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0010\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0015\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lyr0/c;", "Lod1/g;", "Lyr0/a;", "Lyr0/b;", "Lcom/whoop/communitymomentscontainer/api/CommunityMomentsContainerApi;", "api", "Lwm0/a;", "scopeCoordinator", "", "refreshScope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/communitymomentscontainer/api/CommunityMomentsContainerApi;Lwm0/a;Ljava/lang/String;Ltr2/n;)V", "Lec3/m;", "state", "p", "(Lec3/m;Lyr0/b;Lq83/d;)Ljava/lang/Object;", "path", "", "forceRefresh", "n", "(Lec3/m;Ljava/lang/String;Lyr0/b;ZLq83/d;)Ljava/lang/Object;", "", "frontIndex", "m", "(Lec3/m;ILyr0/b;Lq83/d;)Ljava/lang/Object;", "k", "(Ljava/lang/String;Lyr0/b;Lq83/d;)Ljava/lang/Object;", "l", "(Lyr0/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/communitymomentscontainer/api/CommunityMomentsContainerApi;", "b", "Ljava/lang/String;", "c", "Ltr2/n;", "Lyr0/a$c;", "d", "Lec3/l;", "scopeActions", "community-moments-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39727c implements InterfaceC27844g<AbstractC39725a, C39726b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommunityMomentsContainerApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String refreshScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13058l scopeActions;

    /* JADX INFO: renamed from: yr0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {120}, m100432m = "fetchInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f170989E;

        /* JADX INFO: renamed from: w */
        Object f170990w;

        /* JADX INFO: renamed from: x */
        Object f170991x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f170992y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f170992y = obj;
            this.f170989E |= Integer.MIN_VALUE;
            return C39727c.this.m127114k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: yr0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor$fetchInitial$result$1", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {124}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f170994w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f170996y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f170996y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C39727c.this.new b(this.f170996y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170994w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityMomentsContainerApi communityMomentsContainerApi = C39727c.this.api;
            String str = this.f170996y;
            this.f170994w = 1;
            Object communityMomentsContainer = communityMomentsContainerApi.getCommunityMomentsContainer(str, this);
            return communityMomentsContainer == enumC31071a ? enumC31071a : communityMomentsContainer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityMomentsContainerResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: yr0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {142}, m100432m = "fetchMore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f170997E;

        /* JADX INFO: renamed from: w */
        Object f170998w;

        /* JADX INFO: renamed from: x */
        Object f170999x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171000y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171000y = obj;
            this.f170997E |= Integer.MIN_VALUE;
            return C39727c.this.m127115l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: yr0.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor$fetchMore$result$1", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communitymomentscontainer/domain/model/CommunityMomentsContainerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f171002w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f171004y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f171004y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C39727c.this.new d(this.f171004y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171002w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityMomentsContainerApi communityMomentsContainerApi = C39727c.this.api;
            String str = this.f171004y;
            this.f171002w = 1;
            Object communityMomentsContainer = communityMomentsContainerApi.getCommunityMomentsContainer(str, this);
            return communityMomentsContainer == enumC31071a ? enumC31071a : communityMomentsContainer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityMomentsContainerResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: yr0.c$e */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {110, 111}, m100432m = "handleFrontIndexChanged", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f171005E;

        /* JADX INFO: renamed from: F */
        Object f171006F;

        /* JADX INFO: renamed from: G */
        int f171007G;

        /* JADX INFO: renamed from: H */
        int f171008H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f171009I;

        /* JADX INFO: renamed from: K */
        int f171011K;

        /* JADX INFO: renamed from: w */
        Object f171012w;

        /* JADX INFO: renamed from: x */
        Object f171013x;

        /* JADX INFO: renamed from: y */
        Object f171014y;

        /* JADX INFO: renamed from: z */
        Object f171015z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171009I = obj;
            this.f171011K |= Integer.MIN_VALUE;
            return C39727c.this.m127116m(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: yr0.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {73, 74, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "handleLoadInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f171016E;

        /* JADX INFO: renamed from: F */
        boolean f171017F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f171018G;

        /* JADX INFO: renamed from: I */
        int f171020I;

        /* JADX INFO: renamed from: w */
        Object f171021w;

        /* JADX INFO: renamed from: x */
        Object f171022x;

        /* JADX INFO: renamed from: y */
        Object f171023y;

        /* JADX INFO: renamed from: z */
        Object f171024z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171018G = obj;
            this.f171020I |= Integer.MIN_VALUE;
            return C39727c.this.m127117n(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: yr0.c$g */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor$interact$1", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {30, 32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lyr0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C39727c f171025E;

        /* JADX INFO: renamed from: w */
        Object f171026w;

        /* JADX INFO: renamed from: x */
        int f171027x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f171028y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f171029z;

        /* JADX INFO: renamed from: yr0.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f171030w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39727c f171031x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f171032y;

            /* JADX INFO: renamed from: yr0.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor$interact$1$1", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {34, 35, 36, 38}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42707a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f171033E;

                /* JADX INFO: renamed from: w */
                Object f171034w;

                /* JADX INFO: renamed from: x */
                Object f171035x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f171036y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f171037z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42707a(a<? super T> aVar, InterfaceC30057d<? super C42707a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f171037z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f171036y = obj;
                    this.f171033E |= Integer.MIN_VALUE;
                    return this.f171037z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C39727c c39727c, InterfaceC13062m interfaceC13062m) {
                this.f171030w = c22669g0;
                this.f171031x = c39727c;
                this.f171032y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ed, code lost:
            
                if (r13.emit(r14, r6) == r0) goto L44;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(yr0.AbstractC39725a r13, q83.InterfaceC30057d<? super l83.C23454a0> r14) {
                /*
                    Method dump skipped, instruction units count: 249
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yr0.C39727c.g.a.emit(yr0.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC13058l interfaceC13058l, C39727c c39727c, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171029z = interfaceC13058l;
            this.f171025E = c39727c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(this.f171029z, this.f171025E, interfaceC30057d);
            gVar.f171028y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        
            if (r15.collect(r4, r14) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f171028y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f171027x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r14.f171026w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto L6f
            L18:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L20:
                java.lang.Object r2 = r14.f171026w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r15)
                goto L49
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r15)
                yr0.b r5 = new yr0.b
                r12 = 63
                r13 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                r2.f89336w = r5
                r14.f171028y = r0
                r14.f171026w = r2
                r14.f171027x = r4
                java.lang.Object r15 = r0.emit(r5, r14)
                if (r15 != r1) goto L49
                goto L6e
            L49:
                ec3.l r15 = r14.f171029z
                yr0.c r5 = r14.f171025E
                ec3.l r5 = yr0.C39727c.m127110g(r5)
                ec3.l[] r4 = new ec3.InterfaceC13058l[r4]
                r6 = 0
                r4[r6] = r5
                ec3.l r15 = or2.AbstractC28157e0.m85207a(r15, r4)
                yr0.c$g$a r4 = new yr0.c$g$a
                yr0.c r5 = r14.f171025E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r14.f171028y = r0
                r14.f171026w = r0
                r14.f171027x = r3
                java.lang.Object r15 = r15.collect(r4, r14)
                if (r15 != r1) goto L6f
            L6e:
                return r1
            L6f:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: yr0.C39727c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yr0.c$h */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f171038w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39727c f171039x;

        /* JADX INFO: renamed from: yr0.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f171040w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39727c f171041x;

            /* JADX INFO: renamed from: yr0.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor$special$$inlined$filter$1$2", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42708a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f171043F;

                /* JADX INFO: renamed from: G */
                Object f171044G;

                /* JADX INFO: renamed from: H */
                int f171045H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f171046w;

                /* JADX INFO: renamed from: x */
                int f171047x;

                /* JADX INFO: renamed from: y */
                Object f171048y;

                /* JADX INFO: renamed from: z */
                Object f171049z;

                public C42708a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f171046w = obj;
                    this.f171047x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39727c c39727c) {
                this.f171040w = interfaceC13062m;
                this.f171041x = c39727c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42708a c42708a;
                if (interfaceC30057d instanceof C42708a) {
                    c42708a = (C42708a) interfaceC30057d;
                    int i13 = c42708a.f171047x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42708a.f171047x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42708a = new C42708a(interfaceC30057d);
                    }
                } else {
                    c42708a = new C42708a(interfaceC30057d);
                }
                Object obj2 = c42708a.f171046w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42708a.f171047x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f171040w;
                    String str = (String) obj;
                    String str2 = this.f171041x.refreshScope;
                    if (str2 != null && !AbstractC39414r.m125890i0(str2) && AbstractC22676k.m65745e(str, this.f171041x.refreshScope)) {
                        c42708a.f171048y = null;
                        c42708a.f171049z = null;
                        c42708a.f171043F = null;
                        c42708a.f171044G = null;
                        c42708a.f171045H = 0;
                        c42708a.f171047x = 1;
                        if (interfaceC13062m.emit(obj, c42708a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, C39727c c39727c) {
            this.f171038w = interfaceC13058l;
            this.f171039x = c39727c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f171038w.collect(new a(interfaceC13062m, this.f171039x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yr0.c$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f171050w;

        /* JADX INFO: renamed from: yr0.c$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f171051w;

            /* JADX INFO: renamed from: yr0.c$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.domain.CommunityMomentsContainerInteractor$special$$inlined$map$1$2", m100430f = "CommunityMomentsContainerInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42709a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f171052E;

                /* JADX INFO: renamed from: F */
                Object f171053F;

                /* JADX INFO: renamed from: G */
                Object f171054G;

                /* JADX INFO: renamed from: H */
                int f171055H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f171056w;

                /* JADX INFO: renamed from: x */
                int f171057x;

                /* JADX INFO: renamed from: y */
                Object f171058y;

                public C42709a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f171056w = obj;
                    this.f171057x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f171051w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42709a c42709a;
                if (interfaceC30057d instanceof C42709a) {
                    c42709a = (C42709a) interfaceC30057d;
                    int i13 = c42709a.f171057x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42709a.f171057x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42709a = new C42709a(interfaceC30057d);
                    }
                } else {
                    c42709a = new C42709a(interfaceC30057d);
                }
                Object obj2 = c42709a.f171056w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42709a.f171057x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f171051w;
                    AbstractC39725a.c cVar = AbstractC39725a.c.f170978a;
                    c42709a.f171058y = null;
                    c42709a.f171052E = null;
                    c42709a.f171053F = null;
                    c42709a.f171054G = null;
                    c42709a.f171055H = 0;
                    c42709a.f171057x = 1;
                    if (interfaceC13062m.emit(cVar, c42709a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f171050w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f171050w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C39727c(CommunityMomentsContainerApi api, C37378a scopeCoordinator, String str, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.refreshScope = str;
        this.logger = logger;
        this.scopeActions = new i(new h(scopeCoordinator.getScopeUpdateEvents(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: k */
    public final Object m127114k(String str, C39726b c39726b, InterfaceC30057d<? super C39726b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f170989E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f170989E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f170992y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f170989E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f170990w = null;
            aVar2.f170991x = c39726b;
            aVar2.f170989E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch community moments container", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39726b = (C39726b) aVar2.f170991x;
            AbstractC34132o.m107864I(objM108729b);
        }
        C39726b c39726b2 = c39726b;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C39726b.m127098b(c39726b2, false, false, (CommunityMomentsContainerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, AbstractC39729e.c.f171063a, null, 40, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C39726b.m127098b(c39726b2, false, true, null, null, null, null, 60, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: l */
    public final Object m127115l(C39726b c39726b, String str, InterfaceC30057d<? super C39726b> interfaceC30057d) {
        c cVar;
        C39726b c39726b2;
        String str2 = str;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f170997E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f170997E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f171000y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f170997E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str2, null);
            c39726b2 = c39726b;
            cVar2.f170998w = c39726b2;
            cVar2.f170999x = str2;
            cVar2.f170997E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch next page of community moments container", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) cVar2.f170999x;
            C39726b c39726b3 = (C39726b) cVar2.f170998w;
            AbstractC34132o.m107864I(objM108729b);
            c39726b2 = c39726b3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            CommunityMomentsContainerResponse data = c39726b2.getData();
            return C39726b.m127098b(c39726b2, false, false, data != null ? data.appendPage((CommunityMomentsContainerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()) : null, null, AbstractC39729e.c.f171063a, null, 43, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C39726b.m127098b(c39726b2, false, false, null, null, new AbstractC39729e.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), str2), AbstractC12350b.m34604y(str2, c39726b2.m127102e()), 15, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: m */
    public final Object m127116m(InterfaceC13062m interfaceC13062m, int i13, C39726b c39726b, InterfaceC30057d<? super C39726b> interfaceC30057d) {
        e eVar;
        int i14;
        String str;
        C39726b c39726b2;
        MomentStackModel stack;
        List<DesignSystemModel> items;
        MomentsPagination pagination;
        int i15 = i13;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i16 = eVar.f171011K;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.f171011K = i16 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f171009I;
        Object obj2 = EnumC31071a.f128113w;
        int i17 = eVar.f171011K;
        if (i17 == 0) {
            AbstractC34132o.m107864I(obj);
            CommunityMomentsContainerResponse data = c39726b.getData();
            ApiRequest nextPageRequest = (data == null || (pagination = data.getPagination()) == null) ? null : pagination.getNextPageRequest();
            if (data == null || (stack = data.getStack()) == null || (items = stack.getItems()) == null) {
                i14 = 0;
            } else {
                List<DesignSystemModel> list = items;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i14 = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    i14 = 0;
                    while (it.hasNext()) {
                        if ((DesignSystemModelKt.unwrap((DesignSystemModel) it.next()) instanceof MomentCardModel) && (i14 = i14 + 1) < 0) {
                            AbstractC37056f.m118976c0();
                            throw null;
                        }
                    }
                }
            }
            if (nextPageRequest == null || !AbstractC39728d.m127121a(i15, i14, true)) {
                return c39726b;
            }
            String path = nextPageRequest.getPath();
            if (AbstractC39414r.m125890i0(path)) {
                this.logger.mo85228t("Prefetch: blank next-page path, skipping", new AbstractC30556a.a[0]);
                return c39726b;
            }
            if (c39726b.getPaginationState() instanceof AbstractC39729e.b) {
                this.logger.mo85228t("Prefetch: already fetching, skipping", new AbstractC30556a.a[0]);
                return c39726b;
            }
            if (c39726b.m127102e().contains(path)) {
                this.logger.mo85228t("Prefetch: page already loaded, skipping", new AbstractC30556a.a[0]);
                return c39726b;
            }
            C39726b c39726bM127098b = C39726b.m127098b(c39726b, false, false, null, null, AbstractC39729e.b.f171062a, AbstractC12350b.m34555D(path, c39726b.m127102e()), 15, null);
            eVar.f171012w = null;
            eVar.f171013x = null;
            eVar.f171014y = null;
            eVar.f171015z = null;
            eVar.f171005E = path;
            eVar.f171006F = c39726bM127098b;
            eVar.f171007G = i15;
            eVar.f171008H = i14;
            eVar.f171011K = 1;
            if (interfaceC13062m.emit(c39726bM127098b, eVar) != obj2) {
                str = path;
                c39726b2 = c39726bM127098b;
            }
        }
        if (i17 != 1) {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        int i18 = eVar.f171008H;
        int i19 = eVar.f171007G;
        c39726b2 = (C39726b) eVar.f171006F;
        str = (String) eVar.f171005E;
        AbstractC34132o.m107864I(obj);
        i14 = i18;
        i15 = i19;
        eVar.f171012w = null;
        eVar.f171013x = null;
        eVar.f171014y = null;
        eVar.f171015z = null;
        eVar.f171005E = null;
        eVar.f171006F = null;
        eVar.f171007G = i15;
        eVar.f171008H = i14;
        eVar.f171011K = 2;
        Object objM127115l = m127115l(c39726b2, str, eVar);
        return objM127115l == obj2 ? obj2 : objM127115l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX INFO: renamed from: n */
    public final Object m127117n(InterfaceC13062m interfaceC13062m, String str, C39726b c39726b, boolean z4, InterfaceC30057d<? super C39726b> interfaceC30057d) {
        f fVar;
        Object obj;
        C39726b c39726bM127098b;
        String str2;
        InterfaceC13062m interfaceC13062m2;
        boolean z13;
        C39726b c39726b2;
        InterfaceC13062m interfaceC13062m3 = interfaceC13062m;
        boolean z14 = z4;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f171020I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f171020I = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM127114k = fVar2.f171018G;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = fVar2.f171020I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127114k);
            if (AbstractC39414r.m125890i0(str)) {
                this.logger.mo85228t("LoadInitial: blank path, skipping", new AbstractC30556a.a[0]);
                return C39726b.m127098b(c39726b, false, true, null, null, null, null, 60, null);
            }
            if (!z14 && AbstractC22676k.m65745e(str, c39726b.getInitialPath()) && c39726b.getData() != null && !c39726b.getIsError()) {
                this.logger.mo85228t("LoadInitial: data already loaded for path, skipping fetch", new AbstractC30556a.a[0]);
                return C39726b.m127098b(c39726b, false, false, null, null, AbstractC39729e.c.f171063a, null, 46, null);
            }
            obj = null;
            c39726bM127098b = C39726b.m127098b(c39726b, true, false, null, str, AbstractC39729e.c.f171063a, C25235a0.f99113w, 4, null);
            fVar2.f171021w = interfaceC13062m3;
            fVar2.f171022x = str;
            fVar2.f171023y = null;
            fVar2.f171024z = c39726bM127098b;
            fVar2.f171017F = z14;
            fVar2.f171020I = 1;
            if (interfaceC13062m3.emit(c39726bM127098b, fVar2) != obj2) {
                str2 = str;
            }
        }
        if (i14 == 1) {
            boolean z15 = fVar2.f171017F;
            c39726bM127098b = (C39726b) fVar2.f171024z;
            str2 = (String) fVar2.f171022x;
            InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) fVar2.f171021w;
            AbstractC34132o.m107864I(objM127114k);
            z14 = z15;
            interfaceC13062m3 = interfaceC13062m4;
            obj = null;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM127114k);
                return objM127114k;
            }
            z13 = fVar2.f171017F;
            interfaceC13062m2 = (InterfaceC13062m) fVar2.f171021w;
            AbstractC34132o.m107864I(objM127114k);
            obj = null;
        }
        c39726b2 = (C39726b) objM127114k;
        if (z13 || c39726b2.getIsError()) {
            return c39726b2;
        }
        fVar2.f171021w = obj;
        fVar2.f171022x = obj;
        fVar2.f171023y = obj;
        fVar2.f171024z = obj;
        fVar2.f171016E = obj;
        fVar2.f171017F = z13;
        fVar2.f171020I = 3;
        Object objM127116m = m127116m(interfaceC13062m2, 0, c39726b2, fVar2);
        return objM127116m == obj2 ? obj2 : objM127116m;
        fVar2.f171021w = interfaceC13062m3;
        fVar2.f171022x = obj;
        fVar2.f171023y = obj;
        fVar2.f171024z = obj;
        fVar2.f171017F = z14;
        fVar2.f171020I = 2;
        objM127114k = m127114k(str2, c39726bM127098b, fVar2);
        if (objM127114k != obj2) {
            interfaceC13062m2 = interfaceC13062m3;
            z13 = z14;
            c39726b2 = (C39726b) objM127114k;
            if (z13) {
            }
            return c39726b2;
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Object m127118o(C39727c c39727c, InterfaceC13062m interfaceC13062m, String str, C39726b c39726b, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c39727c.m127117n(interfaceC13062m, str, c39726b, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m127119p(InterfaceC13062m interfaceC13062m, C39726b c39726b, InterfaceC30057d<? super C39726b> interfaceC30057d) {
        String initialPath = c39726b.getInitialPath();
        if (initialPath != null && !AbstractC39414r.m125890i0(initialPath)) {
            return m127117n(interfaceC13062m, initialPath, c39726b, true, interfaceC30057d);
        }
        this.logger.mo85228t("Refresh: no initial path, skipping", new AbstractC30556a.a[0]);
        return c39726b;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new g(upstream, this, null));
    }

    public /* synthetic */ C39727c(CommunityMomentsContainerApi communityMomentsContainerApi, C37378a c37378a, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(communityMomentsContainerApi, c37378a, str, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CommunityMomentsContainerInteractor") : interfaceC34116n);
    }
}
