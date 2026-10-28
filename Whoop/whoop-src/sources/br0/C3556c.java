package br0;

import android.net.Uri;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.communityfollowercontainer.api.CommunityFollowerContainerApi;
import com.whoop.communityfollowercontainer.domain.model.CommunityFollowerContainerResponse;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
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

/* JADX INFO: renamed from: br0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 =2\u00020\u0001:\u00011B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0011\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001d\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010!\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b!\u0010\"J2\u0010#\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b'\u0010(J(\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u0002090,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, m65681d2 = {"Lbr0/c;", "", "Lcom/whoop/communityfollowercontainer/api/CommunityFollowerContainerApi;", "api", "Lwm0/a;", "scopeCoordinator", "Lfi0/a;", "analytics", "", "refreshScope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/communityfollowercontainer/api/CommunityFollowerContainerApi;Lwm0/a;Lfi0/a;Ljava/lang/String;Ltr2/n;)V", "Lec3/m;", "Lbr0/b;", "state", "s", "(Lec3/m;Lbr0/b;Lq83/d;)Ljava/lang/Object;", "o", "(Lbr0/b;)Lbr0/b;", "basePath", "period", "sortBy", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "path", "", "forceRefresh", "p", "(Lec3/m;Ljava/lang/String;Lbr0/b;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "r", "(Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lbr0/b;Lq83/d;)Ljava/lang/Object;", "n", "(Lec3/m;Ljava/lang/String;Ljava/lang/String;Lbr0/b;Lq83/d;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Lbr0/b;Lq83/d;)Ljava/lang/Object;", "u", "(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/String;", "nextPagePath", "m", "(Lbr0/b;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lbr0/a;", "upstream", "t", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/communityfollowercontainer/api/CommunityFollowerContainerApi;", "b", "Lfi0/a;", "c", "Ljava/lang/String;", "d", "Ltr2/n;", "Lbr0/a$f;", "e", "Lec3/l;", "scopeActions", "f", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3556c {

    /* JADX INFO: renamed from: g */
    public static final int f14306g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommunityFollowerContainerApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String refreshScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l scopeActions;

    /* JADX INFO: renamed from: br0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {160}, m100432m = "fetchInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f14312E;

        /* JADX INFO: renamed from: w */
        Object f14313w;

        /* JADX INFO: renamed from: x */
        Object f14314x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f14315y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f14315y = obj;
            this.f14312E |= Integer.MIN_VALUE;
            return C3556c.this.m10628l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: br0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$fetchInitial$result$1", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {164}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f14317w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f14319y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f14319y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C3556c.this.new c(this.f14319y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14317w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityFollowerContainerApi communityFollowerContainerApi = C3556c.this.api;
            String str = this.f14319y;
            this.f14317w = 1;
            Object communityFollowerContainer = communityFollowerContainerApi.getCommunityFollowerContainer(str, this);
            return communityFollowerContainer == enumC31071a ? enumC31071a : communityFollowerContainer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityFollowerContainerResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: br0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {185}, m100432m = "fetchMore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f14321F;

        /* JADX INFO: renamed from: w */
        Object f14322w;

        /* JADX INFO: renamed from: x */
        Object f14323x;

        /* JADX INFO: renamed from: y */
        Object f14324y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f14325z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f14325z = obj;
            this.f14321F |= Integer.MIN_VALUE;
            return C3556c.this.m10629m(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: br0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$fetchMore$result$1", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityfollowercontainer/domain/model/CommunityFollowerContainerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f14326w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f14328y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f14328y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C3556c.this.new e(this.f14328y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f14326w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityFollowerContainerApi communityFollowerContainerApi = C3556c.this.api;
            String str = this.f14328y;
            this.f14326w = 1;
            Object communityFollowerContainer = communityFollowerContainerApi.getCommunityFollowerContainer(str, this);
            return communityFollowerContainer == enumC31071a ? enumC31071a : communityFollowerContainer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityFollowerContainerResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: br0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {152, 153}, m100432m = "handleApplyFilter", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f14329E;

        /* JADX INFO: renamed from: F */
        Object f14330F;

        /* JADX INFO: renamed from: G */
        Object f14331G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f14332H;

        /* JADX INFO: renamed from: J */
        int f14334J;

        /* JADX INFO: renamed from: w */
        Object f14335w;

        /* JADX INFO: renamed from: x */
        Object f14336x;

        /* JADX INFO: renamed from: y */
        Object f14337y;

        /* JADX INFO: renamed from: z */
        Object f14338z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f14332H = obj;
            this.f14334J |= Integer.MIN_VALUE;
            return C3556c.this.m10630n(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: br0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {98, LogPriority.NONE}, m100432m = "handleLoadInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f14339E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f14340F;

        /* JADX INFO: renamed from: H */
        int f14342H;

        /* JADX INFO: renamed from: w */
        Object f14343w;

        /* JADX INFO: renamed from: x */
        Object f14344x;

        /* JADX INFO: renamed from: y */
        Object f14345y;

        /* JADX INFO: renamed from: z */
        Object f14346z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f14340F = obj;
            this.f14342H |= Integer.MIN_VALUE;
            return C3556c.this.m10632p(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: br0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {121, 122, 127, 128}, m100432m = "handleLoadPage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f14347E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f14348F;

        /* JADX INFO: renamed from: H */
        int f14350H;

        /* JADX INFO: renamed from: w */
        Object f14351w;

        /* JADX INFO: renamed from: x */
        Object f14352x;

        /* JADX INFO: renamed from: y */
        Object f14353y;

        /* JADX INFO: renamed from: z */
        Object f14354z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f14348F = obj;
            this.f14350H |= Integer.MIN_VALUE;
            return C3556c.this.m10634r(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: br0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$interact$1", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {39, 41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lbr0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C3556c f14355E;

        /* JADX INFO: renamed from: w */
        Object f14356w;

        /* JADX INFO: renamed from: x */
        int f14357x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f14358y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f14359z;

        /* JADX INFO: renamed from: br0.c$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f14360w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3556c f14361x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f14362y;

            /* JADX INFO: renamed from: br0.c$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$interact$1$1", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {43, 44, 45, 49, 51}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41320a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f14363E;

                /* JADX INFO: renamed from: w */
                Object f14364w;

                /* JADX INFO: renamed from: x */
                Object f14365x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f14366y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f14367z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41320a(a<? super T> aVar, InterfaceC30057d<? super C41320a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f14367z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14366y = obj;
                    this.f14363E |= Integer.MIN_VALUE;
                    return this.f14367z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C3556c c3556c, InterfaceC13062m interfaceC13062m) {
                this.f14360w = c22669g0;
                this.f14361x = c3556c;
                this.f14362y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x018c, code lost:
            
                if (r1.emit(r2, r9) == r3) goto L63;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(br0.AbstractC3554a r25, q83.InterfaceC30057d<? super l83.C23454a0> r26) {
                /*
                    Method dump skipped, instruction units count: 408
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: br0.C3556c.i.a.emit(br0.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC13058l interfaceC13058l, C3556c c3556c, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f14359z = interfaceC13058l;
            this.f14355E = c3556c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f14359z, this.f14355E, interfaceC30057d);
            iVar.f14358y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
                java.lang.Object r0 = r14.f14358y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f14357x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r14.f14356w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r15)
                goto L6f
            L18:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L20:
                java.lang.Object r2 = r14.f14356w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r15)
                goto L49
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r15)
                br0.b r5 = new br0.b
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
                r14.f14358y = r0
                r14.f14356w = r2
                r14.f14357x = r4
                java.lang.Object r15 = r0.emit(r5, r14)
                if (r15 != r1) goto L49
                goto L6e
            L49:
                ec3.l r15 = r14.f14359z
                br0.c r5 = r14.f14355E
                ec3.l r5 = br0.C3556c.m10621e(r5)
                ec3.l[] r4 = new ec3.InterfaceC13058l[r4]
                r6 = 0
                r4[r6] = r5
                ec3.l r15 = or2.AbstractC28157e0.m85207a(r15, r4)
                br0.c$i$a r4 = new br0.c$i$a
                br0.c r5 = r14.f14355E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r14.f14358y = r0
                r14.f14356w = r0
                r14.f14357x = r3
                java.lang.Object r15 = r15.collect(r4, r14)
                if (r15 != r1) goto L6f
            L6e:
                return r1
            L6f:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: br0.C3556c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: br0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f14368w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3556c f14369x;

        /* JADX INFO: renamed from: br0.c$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f14370w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3556c f14371x;

            /* JADX INFO: renamed from: br0.c$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$special$$inlined$filter$1$2", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41321a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f14373F;

                /* JADX INFO: renamed from: G */
                Object f14374G;

                /* JADX INFO: renamed from: H */
                int f14375H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f14376w;

                /* JADX INFO: renamed from: x */
                int f14377x;

                /* JADX INFO: renamed from: y */
                Object f14378y;

                /* JADX INFO: renamed from: z */
                Object f14379z;

                public C41321a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14376w = obj;
                    this.f14377x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3556c c3556c) {
                this.f14370w = interfaceC13062m;
                this.f14371x = c3556c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41321a c41321a;
                if (interfaceC30057d instanceof C41321a) {
                    c41321a = (C41321a) interfaceC30057d;
                    int i13 = c41321a.f14377x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41321a.f14377x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41321a = new C41321a(interfaceC30057d);
                    }
                } else {
                    c41321a = new C41321a(interfaceC30057d);
                }
                Object obj2 = c41321a.f14376w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41321a.f14377x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f14370w;
                    String str = (String) obj;
                    if (AbstractC22676k.m65745e(str, "CommunityFollowerRefreshScope") || AbstractC22676k.m65745e(str, this.f14371x.refreshScope)) {
                        c41321a.f14378y = null;
                        c41321a.f14379z = null;
                        c41321a.f14373F = null;
                        c41321a.f14374G = null;
                        c41321a.f14375H = 0;
                        c41321a.f14377x = 1;
                        if (interfaceC13062m.emit(obj, c41321a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l, C3556c c3556c) {
            this.f14368w = interfaceC13058l;
            this.f14369x = c3556c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f14368w.collect(new a(interfaceC13062m, this.f14369x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: br0.c$k */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f14380w;

        /* JADX INFO: renamed from: br0.c$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f14381w;

            /* JADX INFO: renamed from: br0.c$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.domain.CommunityFollowerContainerInteractor$special$$inlined$map$1$2", m100430f = "CommunityFollowerContainerInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41322a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f14382E;

                /* JADX INFO: renamed from: F */
                Object f14383F;

                /* JADX INFO: renamed from: G */
                Object f14384G;

                /* JADX INFO: renamed from: H */
                int f14385H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f14386w;

                /* JADX INFO: renamed from: x */
                int f14387x;

                /* JADX INFO: renamed from: y */
                Object f14388y;

                public C41322a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f14386w = obj;
                    this.f14387x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f14381w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41322a c41322a;
                if (interfaceC30057d instanceof C41322a) {
                    c41322a = (C41322a) interfaceC30057d;
                    int i13 = c41322a.f14387x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41322a.f14387x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41322a = new C41322a(interfaceC30057d);
                    }
                } else {
                    c41322a = new C41322a(interfaceC30057d);
                }
                Object obj2 = c41322a.f14386w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41322a.f14387x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f14381w;
                    AbstractC3554a.f fVar = AbstractC3554a.f.f14297a;
                    c41322a.f14388y = null;
                    c41322a.f14382E = null;
                    c41322a.f14383F = null;
                    c41322a.f14384G = null;
                    c41322a.f14385H = 0;
                    c41322a.f14387x = 1;
                    if (interfaceC13062m.emit(fVar, c41322a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l) {
            this.f14380w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f14380w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C3556c(CommunityFollowerContainerApi api, C37378a scopeCoordinator, InterfaceC14515a analytics, String str, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.analytics = analytics;
        this.refreshScope = str;
        this.logger = logger;
        this.scopeActions = new k(new j(scopeCoordinator.getScopeUpdateEvents(), this));
    }

    /* JADX INFO: renamed from: k */
    private final String m10627k(String basePath, String period, String sortBy) {
        Uri uri = Uri.parse(basePath);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        AbstractC22676k.m65749i(queryParameterNames, "getQueryParameterNames(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : queryParameterNames) {
            String str = (String) obj;
            if (!AbstractC22676k.m65745e(str, "period") && !AbstractC22676k.m65745e(str, "sortBy") && !AbstractC22676k.m65745e(str, "nextToken")) {
                arrayList.add(obj);
            }
        }
        for (String str2 : arrayList) {
            String queryParameter = uri.getQueryParameter(str2);
            if (queryParameter != null) {
                builderClearQuery.appendQueryParameter(str2, queryParameter);
            }
        }
        String string = builderClearQuery.appendQueryParameter("period", period).appendQueryParameter("sortBy", sortBy).build().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m10628l(String str, C3555b c3555b, InterfaceC30057d<? super C3555b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f14312E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f14312E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f14315y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f14312E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, null);
            bVar2.f14313w = null;
            bVar2.f14314x = c3555b;
            bVar2.f14312E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch community follower container", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3555b = (C3555b) bVar2.f14314x;
            AbstractC34132o.m107864I(objM108729b);
        }
        C3555b c3555b2 = c3555b;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C3555b.m10609b(c3555b2, false, false, (CommunityFollowerContainerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, AbstractC3557d.c.f14393a, false, 40, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C3555b.m10609b(c3555b2, false, true, null, null, null, false, 60, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: m */
    public final Object m10629m(C3555b c3555b, String str, Action action, InterfaceC30057d<? super C3555b> interfaceC30057d) {
        d dVar;
        C3555b c3555b2;
        Action action2;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f14321F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f14321F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f14325z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f14321F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str, null);
            c3555b2 = c3555b;
            dVar2.f14322w = c3555b2;
            dVar2.f14323x = null;
            action2 = action;
            dVar2.f14324y = action2;
            dVar2.f14321F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch next page of community follower container", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Action action3 = (Action) dVar2.f14324y;
            C3555b c3555b3 = (C3555b) dVar2.f14322w;
            AbstractC34132o.m107864I(objM108729b);
            action2 = action3;
            c3555b2 = c3555b3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            CommunityFollowerContainerResponse data = c3555b2.getData();
            return C3555b.m10609b(c3555b2, false, false, data != null ? CommunityFollowerContainerResponse.copy$default(data, null, null, null, AbstractC25265s.m74129g1(c3555b2.getData().getContentItems(), ((CommunityFollowerContainerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getItems()), 7, null) : null, null, AbstractC3557d.c.f14393a, false, 43, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C3555b.m10609b(c3555b2, false, false, null, null, new AbstractC3557d.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), action2), false, 47, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: n */
    public final Object m10630n(InterfaceC13062m interfaceC13062m, String str, String str2, C3555b c3555b, InterfaceC30057d<? super C3555b> interfaceC30057d) {
        f fVar;
        C3555b c3555bM10609b;
        String str3;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f14334J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f14334J = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f14332H;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = fVar.f14334J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.analytics.mo41426h("Community", "apply_new_filter", str, "Community", str2);
            String initialPath = c3555b.getInitialPath();
            if (initialPath == null || AbstractC39414r.m125890i0(initialPath)) {
                this.logger.mo85228t("ApplyFilter: no initial path, skipping", new AbstractC30556a.a[0]);
                return C3555b.m10609b(c3555b, false, false, null, null, null, false, 31, null);
            }
            String strM10627k = m10627k(initialPath, str, str2);
            c3555bM10609b = C3555b.m10609b(c3555b, true, false, null, null, null, false, 28, null);
            fVar.f14335w = null;
            fVar.f14336x = null;
            fVar.f14337y = null;
            fVar.f14338z = null;
            fVar.f14329E = null;
            fVar.f14330F = strM10627k;
            fVar.f14331G = c3555bM10609b;
            fVar.f14334J = 1;
            if (interfaceC13062m.emit(c3555bM10609b, fVar) != obj2) {
                str3 = strM10627k;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        c3555bM10609b = (C3555b) fVar.f14331G;
        str3 = (String) fVar.f14330F;
        AbstractC34132o.m107864I(obj);
        fVar.f14335w = null;
        fVar.f14336x = null;
        fVar.f14337y = null;
        fVar.f14338z = null;
        fVar.f14329E = null;
        fVar.f14330F = null;
        fVar.f14331G = null;
        fVar.f14334J = 2;
        Object objM10628l = m10628l(str3, c3555bM10609b, fVar);
        return objM10628l == obj2 ? obj2 : objM10628l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final C3555b m10631o(C3555b state) {
        return C3555b.m10609b(state, false, false, null, null, AbstractC3557d.c.f14393a, false, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: p */
    public final Object m10632p(InterfaceC13062m interfaceC13062m, String str, C3555b c3555b, boolean z4, InterfaceC30057d<? super C3555b> interfaceC30057d) {
        g gVar;
        C3555b c3555bM10609b;
        String str2;
        boolean z13 = z4;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f14342H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f14342H = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f14340F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar2.f14342H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (AbstractC39414r.m125890i0(str)) {
                this.logger.mo85228t("LoadInitial: blank path, skipping", new AbstractC30556a.a[0]);
                return C3555b.m10609b(c3555b, false, true, null, null, null, false, 60, null);
            }
            if (!z13 && AbstractC22676k.m65745e(str, c3555b.getInitialPath()) && c3555b.getData() != null && !c3555b.getIsError()) {
                this.logger.mo85228t("LoadInitial: data already loaded for path, skipping fetch", new AbstractC30556a.a[0]);
                return C3555b.m10609b(c3555b, false, false, null, null, AbstractC3557d.c.f14393a, false, 46, null);
            }
            c3555bM10609b = C3555b.m10609b(c3555b, true, false, null, str, null, false, 52, null);
            gVar2.f14343w = null;
            gVar2.f14344x = str;
            gVar2.f14345y = null;
            gVar2.f14346z = c3555bM10609b;
            gVar2.f14339E = z13;
            gVar2.f14342H = 1;
            if (interfaceC13062m.emit(c3555bM10609b, gVar2) != obj2) {
                str2 = str;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        boolean z14 = gVar2.f14339E;
        c3555bM10609b = (C3555b) gVar2.f14346z;
        str2 = (String) gVar2.f14344x;
        AbstractC34132o.m107864I(obj);
        z13 = z14;
        gVar2.f14343w = null;
        gVar2.f14344x = null;
        gVar2.f14345y = null;
        gVar2.f14346z = null;
        gVar2.f14339E = z13;
        gVar2.f14342H = 2;
        Object objM10628l = m10628l(str2, c3555bM10609b, gVar2);
        return objM10628l == obj2 ? obj2 : objM10628l;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m10633q(C3556c c3556c, InterfaceC13062m interfaceC13062m, String str, C3555b c3555b, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c3556c.m10632p(interfaceC13062m, str, c3555b, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x012c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: r */
    public final Object m10634r(InterfaceC13062m interfaceC13062m, Action action, C3555b c3555b, InterfaceC30057d<? super C3555b> interfaceC30057d) {
        h hVar;
        String strM10636u;
        C3555b c3555b2;
        C3555b c3555b3;
        String str;
        Object objM10628l;
        Object objM10629m;
        Action action2 = action;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f14350H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f14350H = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f14348F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = hVar.f14350H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            strM10636u = m10636u(action2);
            if (strM10636u == null || AbstractC39414r.m125890i0(strM10636u)) {
                this.logger.mo85228t("LoadPage: no GET path, skipping fetch", new AbstractC30556a.a[0]);
                return c3555b;
            }
            if (c3555b.getData() == null) {
                this.logger.mo85228t("LoadPage: no data loaded, skipping fetch", new AbstractC30556a.a[0]);
                return c3555b;
            }
            if (Uri.parse(strM10636u).getQueryParameter("nextToken") == null) {
                C3555b c3555bM10609b = C3555b.m10609b(c3555b, true, false, null, null, AbstractC3557d.c.f14393a, false, 44, null);
                hVar.f14351w = null;
                hVar.f14352x = null;
                hVar.f14353y = null;
                hVar.f14354z = strM10636u;
                hVar.f14347E = c3555bM10609b;
                hVar.f14350H = 1;
                if (interfaceC13062m.emit(c3555bM10609b, hVar) != obj2) {
                    c3555b3 = c3555bM10609b;
                    str = strM10636u;
                    hVar.f14351w = null;
                    hVar.f14352x = null;
                    hVar.f14353y = null;
                    hVar.f14354z = null;
                    hVar.f14347E = null;
                    hVar.f14350H = 2;
                    objM10628l = m10628l(str, c3555b3, hVar);
                    if (objM10628l == obj2) {
                        return objM10628l;
                    }
                }
            } else {
                C3555b c3555bM10609b2 = C3555b.m10609b(c3555b, false, false, null, null, AbstractC3557d.b.f14392a, false, 47, null);
                hVar.f14351w = null;
                hVar.f14352x = action2;
                hVar.f14353y = null;
                hVar.f14354z = strM10636u;
                hVar.f14347E = c3555bM10609b2;
                hVar.f14350H = 3;
                if (interfaceC13062m.emit(c3555bM10609b2, hVar) != obj2) {
                    c3555b2 = c3555bM10609b2;
                    hVar.f14351w = null;
                    hVar.f14352x = null;
                    hVar.f14353y = null;
                    hVar.f14354z = null;
                    hVar.f14347E = null;
                    hVar.f14350H = 4;
                    objM10629m = m10629m(c3555b2, strM10636u, action2, hVar);
                    if (objM10629m == obj2) {
                        return objM10629m;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        c3555b2 = (C3555b) hVar.f14347E;
                        String str2 = (String) hVar.f14354z;
                        Action action3 = (Action) hVar.f14352x;
                        AbstractC34132o.m107864I(obj);
                        strM10636u = str2;
                        action2 = action3;
                        hVar.f14351w = null;
                        hVar.f14352x = null;
                        hVar.f14353y = null;
                        hVar.f14354z = null;
                        hVar.f14347E = null;
                        hVar.f14350H = 4;
                        objM10629m = m10629m(c3555b2, strM10636u, action2, hVar);
                        if (objM10629m == obj2) {
                            return objM10629m;
                        }
                    } else if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            c3555b3 = (C3555b) hVar.f14347E;
            str = (String) hVar.f14354z;
            AbstractC34132o.m107864I(obj);
            hVar.f14351w = null;
            hVar.f14352x = null;
            hVar.f14353y = null;
            hVar.f14354z = null;
            hVar.f14347E = null;
            hVar.f14350H = 2;
            objM10628l = m10628l(str, c3555b3, hVar);
            if (objM10628l == obj2) {
                return objM10628l;
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final Object m10635s(InterfaceC13062m interfaceC13062m, C3555b c3555b, InterfaceC30057d<? super C3555b> interfaceC30057d) {
        String initialPath = c3555b.getInitialPath();
        if (initialPath != null && !AbstractC39414r.m125890i0(initialPath)) {
            return m10632p(interfaceC13062m, initialPath, c3555b, true, interfaceC30057d);
        }
        this.logger.mo85228t("Refresh: no initial path, skipping", new AbstractC30556a.a[0]);
        return c3555b;
    }

    /* JADX INFO: renamed from: u */
    private final String m10636u(Action action) {
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

    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m10637t(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new i(upstream, this, null));
    }

    public /* synthetic */ C3556c(CommunityFollowerContainerApi communityFollowerContainerApi, C37378a c37378a, InterfaceC14515a interfaceC14515a, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(communityFollowerContainerApi, c37378a, interfaceC14515a, str, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CommunityFollowerContainerInteractor") : interfaceC34116n);
    }
}
