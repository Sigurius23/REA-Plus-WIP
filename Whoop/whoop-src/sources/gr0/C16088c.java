package gr0;

import android.net.Uri;
import androidx.recyclerview.widget.AbstractC1707m0;
import c93.InterfaceC4351m;
import com.whoop.communityfollowerlookup.api.CommunityFollowerLookupApi;
import com.whoop.communityfollowerlookup.domain.model.CommunityFollowerLookupResponse;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.FollowerRequestModel;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.Request;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wm0.C37378a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gr0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 @2\u00020\u0001:\u00014B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0011\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0018\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\u001e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J'\u0010&\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010'J \u0010(\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b*\u0010+J(\u0010-\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b-\u0010.J!\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0/2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, m65681d2 = {"Lgr0/c;", "", "Lcom/whoop/communityfollowerlookup/api/CommunityFollowerLookupApi;", "api", "Lqw2/c;", "actionInteractor", "Lwm0/a;", "scopeCoordinator", "", "refreshScope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/communityfollowerlookup/api/CommunityFollowerLookupApi;Lqw2/c;Lwm0/a;Ljava/lang/String;Ltr2/n;)V", "Lec3/m;", "Lgr0/b;", "state", "s", "(Lec3/m;Lgr0/b;Lq83/d;)Ljava/lang/Object;", "n", "(Lgr0/b;)Lgr0/b;", "path", "", "forceRefresh", "p", "(Lec3/m;Ljava/lang/String;Lgr0/b;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "r", "(Lec3/m;Lcom/whoop/whoopaction/domain/models/Action;Lgr0/b;Lq83/d;)Ljava/lang/Object;", "o", "Lgr0/d;", "resolution", "k", "(Lgr0/d;Lgr0/b;)Lgr0/b;", "id", "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;", "data", "v", "(Ljava/lang/String;Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;Lgr0/b;)Lgr0/b;", "l", "(Ljava/lang/String;Lgr0/b;Lq83/d;)Ljava/lang/Object;", "u", "(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/String;", "nextPagePath", "m", "(Lgr0/b;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lgr0/a;", "upstream", "t", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/communityfollowerlookup/api/CommunityFollowerLookupApi;", "b", "Lqw2/c;", "c", "Ljava/lang/String;", "d", "Ltr2/n;", "Lgr0/a$f;", "e", "Lec3/l;", "scopeActions", "f", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16088c {

    /* JADX INFO: renamed from: g */
    public static final int f60889g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommunityFollowerLookupApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String refreshScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l scopeActions;

    /* JADX INFO: renamed from: gr0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {219}, m100432m = "fetchInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f60895E;

        /* JADX INFO: renamed from: w */
        Object f60896w;

        /* JADX INFO: renamed from: x */
        Object f60897x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60898y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60898y = obj;
            this.f60895E |= Integer.MIN_VALUE;
            return C16088c.this.m45474l(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gr0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$fetchInitial$result$1", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {223}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60900w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f60902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f60902y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C16088c.this.new c(this.f60902y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60900w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityFollowerLookupApi communityFollowerLookupApi = C16088c.this.api;
            String str = this.f60902y;
            this.f60900w = 1;
            Object communityFollowerLookup = communityFollowerLookupApi.getCommunityFollowerLookup(str, this);
            return communityFollowerLookup == enumC31071a ? enumC31071a : communityFollowerLookup;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityFollowerLookupResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gr0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {246}, m100432m = "fetchMore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f60904F;

        /* JADX INFO: renamed from: w */
        Object f60905w;

        /* JADX INFO: renamed from: x */
        Object f60906x;

        /* JADX INFO: renamed from: y */
        Object f60907y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f60908z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60908z = obj;
            this.f60904F |= Integer.MIN_VALUE;
            return C16088c.this.m45475m(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: gr0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$fetchMore$result$1", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/communityfollowerlookup/domain/model/CommunityFollowerLookupResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f60909w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f60911y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f60911y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C16088c.this.new e(this.f60911y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60909w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityFollowerLookupApi communityFollowerLookupApi = C16088c.this.api;
            String str = this.f60911y;
            this.f60909w = 1;
            Object communityFollowerLookup = communityFollowerLookupApi.getCommunityFollowerLookup(str, this);
            return communityFollowerLookup == enumC31071a ? enumC31071a : communityFollowerLookup;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityFollowerLookupResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gr0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60912w;

        /* JADX INFO: renamed from: gr0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60913w;

            /* JADX INFO: renamed from: gr0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$handleItemAction$$inlined$filter$1$2", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41661a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f60915F;

                /* JADX INFO: renamed from: G */
                Object f60916G;

                /* JADX INFO: renamed from: H */
                int f60917H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60918w;

                /* JADX INFO: renamed from: x */
                int f60919x;

                /* JADX INFO: renamed from: y */
                Object f60920y;

                /* JADX INFO: renamed from: z */
                Object f60921z;

                public C41661a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60918w = obj;
                    this.f60919x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f60913w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41661a c41661a;
                if (interfaceC30057d instanceof C41661a) {
                    c41661a = (C41661a) interfaceC30057d;
                    int i13 = c41661a.f60919x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41661a.f60919x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41661a = new C41661a(interfaceC30057d);
                    }
                } else {
                    c41661a = new C41661a(interfaceC30057d);
                }
                Object obj2 = c41661a.f60918w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41661a.f60919x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60913w;
                    AbstractC30694b abstractC30694b = (AbstractC30694b) obj;
                    if ((abstractC30694b instanceof AbstractC30694b.f) || (abstractC30694b instanceof AbstractC30694b.a) || (abstractC30694b instanceof AbstractC30694b.b)) {
                        c41661a.f60920y = null;
                        c41661a.f60921z = null;
                        c41661a.f60915F = null;
                        c41661a.f60916G = null;
                        c41661a.f60917H = 0;
                        c41661a.f60919x = 1;
                        if (interfaceC13062m.emit(obj, c41661a) == enumC31071a) {
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
            this.f60912w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60912w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gr0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {133, 144, 150}, m100432m = "handleItemAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f60922E;

        /* JADX INFO: renamed from: F */
        Object f60923F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f60924G;

        /* JADX INFO: renamed from: I */
        int f60926I;

        /* JADX INFO: renamed from: w */
        Object f60927w;

        /* JADX INFO: renamed from: x */
        Object f60928x;

        /* JADX INFO: renamed from: y */
        Object f60929y;

        /* JADX INFO: renamed from: z */
        Object f60930z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60924G = obj;
            this.f60926I |= Integer.MIN_VALUE;
            return C16088c.this.m45477o(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: gr0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {93, 94}, m100432m = "handleLoadInitial", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f60931E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f60932F;

        /* JADX INFO: renamed from: H */
        int f60934H;

        /* JADX INFO: renamed from: w */
        Object f60935w;

        /* JADX INFO: renamed from: x */
        Object f60936x;

        /* JADX INFO: renamed from: y */
        Object f60937y;

        /* JADX INFO: renamed from: z */
        Object f60938z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60932F = obj;
            this.f60934H |= Integer.MIN_VALUE;
            return C16088c.this.m45478p(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: gr0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {115, 120, 121}, m100432m = "handleLoadPage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f60939E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f60940F;

        /* JADX INFO: renamed from: H */
        int f60942H;

        /* JADX INFO: renamed from: w */
        Object f60943w;

        /* JADX INFO: renamed from: x */
        Object f60944x;

        /* JADX INFO: renamed from: y */
        Object f60945y;

        /* JADX INFO: renamed from: z */
        Object f60946z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f60940F = obj;
            this.f60942H |= Integer.MIN_VALUE;
            return C16088c.this.m45480r(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: gr0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$interact$1", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {43, 45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lgr0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C16088c f60947E;

        /* JADX INFO: renamed from: w */
        Object f60948w;

        /* JADX INFO: renamed from: x */
        int f60949x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f60950y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f60951z;

        /* JADX INFO: renamed from: gr0.c$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f60952w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16088c f60953x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f60954y;

            /* JADX INFO: renamed from: gr0.c$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$interact$1$1", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {47, 48, 49, 51, 54}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41662a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f60955E;

                /* JADX INFO: renamed from: w */
                Object f60956w;

                /* JADX INFO: renamed from: x */
                Object f60957x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f60958y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f60959z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41662a(a<? super T> aVar, InterfaceC30057d<? super C41662a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f60959z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60958y = obj;
                    this.f60955E |= Integer.MIN_VALUE;
                    return this.f60959z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C16088c c16088c, InterfaceC13062m interfaceC13062m) {
                this.f60952w = c22669g0;
                this.f60953x = c16088c;
                this.f60954y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x016c, code lost:
            
                if (r1.emit(r2, r9) == r3) goto L60;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(gr0.AbstractC16086a r27, q83.InterfaceC30057d<? super l83.C23454a0> r28) {
                /*
                    Method dump skipped, instruction units count: 376
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gr0.C16088c.j.a.emit(gr0.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC13058l interfaceC13058l, C16088c c16088c, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60951z = interfaceC13058l;
            this.f60947E = c16088c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f60951z, this.f60947E, interfaceC30057d);
            jVar.f60950y = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
        
            if (r5.collect(r6, r17) == r2) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = r0.f60950y
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r0.f60949x
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2a
                if (r3 == r5) goto L22
                if (r3 != r4) goto L1a
                java.lang.Object r1 = r0.f60948w
                kotlin.jvm.internal.g0 r1 = (p715kotlin.jvm.internal.C22669g0) r1
                p505ts.AbstractC34132o.m107864I(r18)
                goto L74
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                java.lang.Object r3 = r0.f60948w
                kotlin.jvm.internal.g0 r3 = (p715kotlin.jvm.internal.C22669g0) r3
                p505ts.AbstractC34132o.m107864I(r18)
                goto L4e
            L2a:
                kotlin.jvm.internal.g0 r3 = p088dc.AbstractC11895b.m32004w(r18)
                gr0.b r6 = new gr0.b
                r15 = 255(0xff, float:3.57E-43)
                r16 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r3.f89336w = r6
                r0.f60950y = r1
                r0.f60948w = r3
                r0.f60949x = r5
                java.lang.Object r6 = r1.emit(r6, r0)
                if (r6 != r2) goto L4e
                goto L73
            L4e:
                ec3.l r6 = r0.f60951z
                gr0.c r7 = r0.f60947E
                ec3.l r7 = gr0.C16088c.m45467e(r7)
                ec3.l[] r5 = new ec3.InterfaceC13058l[r5]
                r8 = 0
                r5[r8] = r7
                ec3.l r5 = or2.AbstractC28157e0.m85207a(r6, r5)
                gr0.c$j$a r6 = new gr0.c$j$a
                gr0.c r7 = r0.f60947E
                r6.<init>(r3, r7, r1)
                r1 = 0
                r0.f60950y = r1
                r0.f60948w = r1
                r0.f60949x = r4
                java.lang.Object r1 = r5.collect(r6, r0)
                if (r1 != r2) goto L74
            L73:
                return r2
            L74:
                l83.a0 r1 = l83.C23454a0.f92919a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: gr0.C16088c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gr0.c$k */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60960w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16088c f60961x;

        /* JADX INFO: renamed from: gr0.c$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60962w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16088c f60963x;

            /* JADX INFO: renamed from: gr0.c$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$special$$inlined$filter$1$2", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41663a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f60965F;

                /* JADX INFO: renamed from: G */
                Object f60966G;

                /* JADX INFO: renamed from: H */
                int f60967H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60968w;

                /* JADX INFO: renamed from: x */
                int f60969x;

                /* JADX INFO: renamed from: y */
                Object f60970y;

                /* JADX INFO: renamed from: z */
                Object f60971z;

                public C41663a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60968w = obj;
                    this.f60969x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16088c c16088c) {
                this.f60962w = interfaceC13062m;
                this.f60963x = c16088c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41663a c41663a;
                if (interfaceC30057d instanceof C41663a) {
                    c41663a = (C41663a) interfaceC30057d;
                    int i13 = c41663a.f60969x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41663a.f60969x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41663a = new C41663a(interfaceC30057d);
                    }
                } else {
                    c41663a = new C41663a(interfaceC30057d);
                }
                Object obj2 = c41663a.f60968w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41663a.f60969x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60962w;
                    String str = (String) obj;
                    if (AbstractC22676k.m65745e(str, "CommunityFollowerRefreshScope") || AbstractC22676k.m65745e(str, this.f60963x.refreshScope)) {
                        c41663a.f60970y = null;
                        c41663a.f60971z = null;
                        c41663a.f60965F = null;
                        c41663a.f60966G = null;
                        c41663a.f60967H = 0;
                        c41663a.f60969x = 1;
                        if (interfaceC13062m.emit(obj, c41663a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l, C16088c c16088c) {
            this.f60960w = interfaceC13058l;
            this.f60961x = c16088c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60960w.collect(new a(interfaceC13062m, this.f60961x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gr0.c$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60972w;

        /* JADX INFO: renamed from: gr0.c$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60973w;

            /* JADX INFO: renamed from: gr0.c$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.domain.CommunityFollowerLookupInteractor$special$$inlined$map$1$2", m100430f = "CommunityFollowerLookupInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41664a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f60974E;

                /* JADX INFO: renamed from: F */
                Object f60975F;

                /* JADX INFO: renamed from: G */
                Object f60976G;

                /* JADX INFO: renamed from: H */
                int f60977H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60978w;

                /* JADX INFO: renamed from: x */
                int f60979x;

                /* JADX INFO: renamed from: y */
                Object f60980y;

                public C41664a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60978w = obj;
                    this.f60979x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f60973w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41664a c41664a;
                if (interfaceC30057d instanceof C41664a) {
                    c41664a = (C41664a) interfaceC30057d;
                    int i13 = c41664a.f60979x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41664a.f60979x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41664a = new C41664a(interfaceC30057d);
                    }
                } else {
                    c41664a = new C41664a(interfaceC30057d);
                }
                Object obj2 = c41664a.f60978w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41664a.f60979x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60973w;
                    AbstractC16086a.f fVar = AbstractC16086a.f.f60879a;
                    c41664a.f60980y = null;
                    c41664a.f60974E = null;
                    c41664a.f60975F = null;
                    c41664a.f60976G = null;
                    c41664a.f60977H = 0;
                    c41664a.f60979x = 1;
                    if (interfaceC13062m.emit(fVar, c41664a) == enumC31071a) {
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
            this.f60972w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60972w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C16088c(CommunityFollowerLookupApi api, C30695c actionInteractor, C37378a scopeCoordinator, String str, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.actionInteractor = actionInteractor;
        this.refreshScope = str;
        this.logger = logger;
        this.scopeActions = new l(new k(scopeCoordinator.getScopeUpdateEvents(), this));
    }

    /* JADX INFO: renamed from: k */
    private final C16087b m45473k(AbstractC16089d resolution, C16087b state) {
        CommunityFollowerLookupResponse data = state.getData();
        if (data == null) {
            return C16087b.m45453b(state, false, false, null, null, null, AbstractC16092g.c.f60990a, null, null, 223, null);
        }
        if (resolution instanceof AbstractC16089d.a) {
            return m45483v(((AbstractC16089d.a) resolution).getId(), data, state);
        }
        if (!(resolution instanceof AbstractC16089d.b)) {
            if (!(resolution instanceof AbstractC16089d.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return C16087b.m45453b(state, false, false, null, null, null, AbstractC16092g.c.f60990a, AbstractC25247g0.m73996e0(state.m45456d(), new C23465k(((AbstractC16089d.c) resolution).getId(), EnumC16091f.AFTER_SECONDARY_ACTION)), null, 159, null);
        }
        AbstractC16089d.b bVar = (AbstractC16089d.b) resolution;
        if (!bVar.getHasSecondaryProgression()) {
            return m45483v(bVar.getId(), data, state);
        }
        return C16087b.m45453b(state, false, false, null, null, null, AbstractC16092g.c.f60990a, AbstractC25247g0.m73996e0(state.m45456d(), new C23465k(bVar.getId(), EnumC16091f.AFTER_PRIMARY_ACTION)), null, 159, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m45474l(String str, C16087b c16087b, InterfaceC30057d<? super C16087b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f60895E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f60895E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f60898y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f60895E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, null);
            bVar2.f60896w = null;
            bVar2.f60897x = c16087b;
            bVar2.f60895E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch community follower lookup", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16087b = (C16087b) bVar2.f60897x;
            AbstractC34132o.m107864I(objM108729b);
        }
        C16087b c16087b2 = c16087b;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return C16087b.m45453b(c16087b2, false, false, (CommunityFollowerLookupResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), null, AbstractC16093h.c.f60994a, AbstractC16092g.c.f60990a, C25272z.f99163w, null, 136, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C16087b.m45453b(c16087b2, false, true, null, null, null, null, null, null, 252, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: m */
    public final Object m45475m(C16087b c16087b, String str, Action action, InterfaceC30057d<? super C16087b> interfaceC30057d) {
        d dVar;
        C16087b c16087b2;
        Action action2;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f60904F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f60904F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f60908z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f60904F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str, null);
            c16087b2 = c16087b;
            dVar2.f60905w = c16087b2;
            dVar2.f60906x = null;
            action2 = action;
            dVar2.f60907y = action2;
            dVar2.f60904F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch next page of community follower lookup", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Action action3 = (Action) dVar2.f60907y;
            C16087b c16087b3 = (C16087b) dVar2.f60905w;
            AbstractC34132o.m107864I(objM108729b);
            action2 = action3;
            c16087b2 = c16087b3;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            CommunityFollowerLookupResponse data = c16087b2.getData();
            return C16087b.m45453b(c16087b2, false, false, data != null ? CommunityFollowerLookupResponse.copy$default(data, 0, null, null, AbstractC25265s.m74129g1(c16087b2.getData().getContentItems(), ((CommunityFollowerLookupResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getItems()), 7, null) : null, null, AbstractC16093h.c.f60994a, AbstractC16092g.c.f60990a, null, null, 203, null);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C16087b.m45453b(c16087b2, false, false, null, null, new AbstractC16093h.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage(), action2), null, null, null, 239, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final C16087b m45476n(C16087b state) {
        return C16087b.m45453b(state, false, false, null, null, AbstractC16093h.c.f60994a, AbstractC16092g.c.f60990a, null, null, 207, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0145  */
    /* JADX WARN: Code duplicated, block: B:54:0x0149  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x0198  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: o */
    public final Object m45477o(InterfaceC13062m interfaceC13062m, Action action, C16087b c16087b, InterfaceC30057d<? super C16087b> interfaceC30057d) {
        g gVar;
        AbstractC16089d abstractC16089dM45490c;
        C16087b c16087b2;
        InterfaceC13062m interfaceC13062m2;
        AbstractC16089d abstractC16089d;
        Action action2;
        AbstractC30694b abstractC30694b;
        Object objM45478p;
        InterfaceC13062m interfaceC13062m3 = interfaceC13062m;
        Action action3 = action;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f60926I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f60926I = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f60924G;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar2.f60926I;
        if (i14 != 0) {
            if (i14 == 1) {
                AbstractC16089d abstractC16089d2 = (AbstractC16089d) gVar2.f60922E;
                C16087b c16087b3 = (C16087b) gVar2.f60929y;
                Action action4 = (Action) gVar2.f60928x;
                InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) gVar2.f60927w;
                AbstractC34132o.m107864I(obj);
                abstractC16089dM45490c = abstractC16089d2;
                c16087b2 = c16087b3;
                action3 = action4;
                interfaceC13062m3 = interfaceC13062m4;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                abstractC16089d = (AbstractC16089d) gVar2.f60922E;
                C16087b c16087b4 = (C16087b) gVar2.f60929y;
                action2 = (Action) gVar2.f60928x;
                interfaceC13062m2 = (InterfaceC13062m) gVar2.f60927w;
                AbstractC34132o.m107864I(obj);
                c16087b2 = c16087b4;
            }
            abstractC30694b = (AbstractC30694b) obj;
            if (abstractC30694b instanceof AbstractC30694b.f) {
                if (abstractC30694b instanceof AbstractC30694b.b) {
                    return C16087b.m45453b(c16087b2, false, false, null, null, null, AbstractC16092g.c.f60990a, null, ((AbstractC30694b.b) abstractC30694b).getInteraction(), 95, null);
                }
                if (abstractC30694b instanceof AbstractC30694b.a) {
                    this.logger.mo85228t("PerformItemAction: no actionable terminal state, ignoring", new AbstractC30556a.a[0]);
                    return C16087b.m45453b(c16087b2, false, false, null, null, null, AbstractC16092g.c.f60990a, null, null, 223, null);
                }
                AbstractC30694b.a aVar = (AbstractC30694b.a) abstractC30694b;
                this.logger.mo85222m(AbstractC11266d.m30461o("PerformItemAction failed: ", aVar.getMessage()), new AbstractC30556a.a[0]);
                return C16087b.m45453b(c16087b2, false, false, null, null, null, new AbstractC16092g.a(aVar.getMessage(), action2), null, null, 223, null);
            }
            if (abstractC16089d != null) {
                return m45473k(abstractC16089d, c16087b2);
            }
            String initialPath = c16087b2.getInitialPath();
            gVar2.f60927w = null;
            gVar2.f60928x = null;
            gVar2.f60929y = null;
            gVar2.f60930z = null;
            gVar2.f60922E = null;
            gVar2.f60923F = null;
            gVar2.f60926I = 3;
            objM45478p = m45478p(interfaceC13062m2, initialPath, c16087b2, true, gVar2);
            if (objM45478p != obj2) {
                return obj2;
            }
            return objM45478p;
        }
        AbstractC34132o.m107864I(obj);
        CommunityFollowerLookupResponse data = c16087b.getData();
        List<FollowerRequestModel> followerRequestItems = data != null ? data.getFollowerRequestItems() : null;
        if (followerRequestItems == null) {
            followerRequestItems = C25271y.f99162w;
        }
        abstractC16089dM45490c = AbstractC16090e.m45490c(action3, followerRequestItems, c16087b.m45456d());
        if (c16087b.getData() != null) {
            c16087b2 = c16087b;
            Object objM45453b = C16087b.m45453b(c16087b2, false, false, null, null, null, new AbstractC16092g.b(abstractC16089dM45490c != null ? abstractC16089dM45490c.getId() : null), null, null, 223, null);
            gVar2.f60927w = interfaceC13062m3;
            gVar2.f60928x = action3;
            gVar2.f60929y = c16087b2;
            gVar2.f60930z = null;
            gVar2.f60922E = abstractC16089dM45490c;
            gVar2.f60926I = 1;
            if (interfaceC13062m3.emit(objM45453b, gVar2) != obj2) {
            }
            return obj2;
        }
        c16087b2 = c16087b;
        if (c16087b2.getInitialPath() == null) {
            return c16087b2;
        }
        f fVar = new f(this.actionInteractor.interact(new C0456u(new C30698f(action3), 1)));
        gVar2.f60927w = interfaceC13062m3;
        gVar2.f60928x = action3;
        gVar2.f60929y = c16087b2;
        gVar2.f60930z = null;
        gVar2.f60922E = abstractC16089dM45490c;
        gVar2.f60926I = 2;
        Object objM36577C = AbstractC13091v.m36577C(fVar, gVar2);
        if (objM36577C != obj2) {
            interfaceC13062m2 = interfaceC13062m3;
            abstractC16089d = abstractC16089dM45490c;
            obj = objM36577C;
            action2 = action3;
            abstractC30694b = (AbstractC30694b) obj;
            if (abstractC30694b instanceof AbstractC30694b.f) {
                if (abstractC30694b instanceof AbstractC30694b.b) {
                    return C16087b.m45453b(c16087b2, false, false, null, null, null, AbstractC16092g.c.f60990a, null, ((AbstractC30694b.b) abstractC30694b).getInteraction(), 95, null);
                }
                if (abstractC30694b instanceof AbstractC30694b.a) {
                    this.logger.mo85228t("PerformItemAction: no actionable terminal state, ignoring", new AbstractC30556a.a[0]);
                    return C16087b.m45453b(c16087b2, false, false, null, null, null, AbstractC16092g.c.f60990a, null, null, 223, null);
                }
                AbstractC30694b.a aVar2 = (AbstractC30694b.a) abstractC30694b;
                this.logger.mo85222m(AbstractC11266d.m30461o("PerformItemAction failed: ", aVar2.getMessage()), new AbstractC30556a.a[0]);
                return C16087b.m45453b(c16087b2, false, false, null, null, null, new AbstractC16092g.a(aVar2.getMessage(), action2), null, null, 223, null);
            }
            if (abstractC16089d != null) {
                return m45473k(abstractC16089d, c16087b2);
            }
            String initialPath2 = c16087b2.getInitialPath();
            gVar2.f60927w = null;
            gVar2.f60928x = null;
            gVar2.f60929y = null;
            gVar2.f60930z = null;
            gVar2.f60922E = null;
            gVar2.f60923F = null;
            gVar2.f60926I = 3;
            objM45478p = m45478p(interfaceC13062m2, initialPath2, c16087b2, true, gVar2);
            if (objM45478p != obj2) {
                return objM45478p;
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: p */
    public final Object m45478p(InterfaceC13062m interfaceC13062m, String str, C16087b c16087b, boolean z4, InterfaceC30057d<? super C16087b> interfaceC30057d) {
        h hVar;
        Object obj;
        C16087b c16087bM45453b;
        String str2 = str;
        boolean z13 = z4;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f60934H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f60934H = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object obj2 = hVar2.f60932F;
        Object obj3 = EnumC31071a.f128113w;
        int i14 = hVar2.f60934H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            if (AbstractC39414r.m125890i0(str2)) {
                this.logger.mo85228t("LoadInitial: blank path, skipping", new AbstractC30556a.a[0]);
                return C16087b.m45453b(c16087b, false, true, null, null, null, null, null, null, 252, null);
            }
            if (!z13 && AbstractC22676k.m65745e(str2, c16087b.getInitialPath()) && c16087b.getData() != null && !c16087b.getIsError()) {
                this.logger.mo85228t("LoadInitial: data already loaded for path, skipping fetch", new AbstractC30556a.a[0]);
                return C16087b.m45453b(c16087b, false, false, null, null, AbstractC16093h.c.f60994a, AbstractC16092g.c.f60990a, null, null, 206, null);
            }
            obj = null;
            c16087bM45453b = C16087b.m45453b(c16087b, true, false, null, str2, null, null, null, null, 244, null);
            hVar2.f60935w = null;
            hVar2.f60936x = str2;
            hVar2.f60937y = null;
            hVar2.f60938z = c16087bM45453b;
            hVar2.f60931E = z13;
            hVar2.f60934H = 1;
            if (interfaceC13062m.emit(c16087bM45453b, hVar2) != obj3) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            return obj2;
        }
        boolean z14 = hVar2.f60931E;
        c16087bM45453b = (C16087b) hVar2.f60938z;
        str2 = (String) hVar2.f60936x;
        AbstractC34132o.m107864I(obj2);
        z13 = z14;
        obj = null;
        hVar2.f60935w = obj;
        hVar2.f60936x = obj;
        hVar2.f60937y = obj;
        hVar2.f60938z = obj;
        hVar2.f60931E = z13;
        hVar2.f60934H = 2;
        Object objM45474l = m45474l(str2, c16087bM45453b, hVar2);
        return objM45474l == obj3 ? obj3 : objM45474l;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m45479q(C16088c c16088c, InterfaceC13062m interfaceC13062m, String str, C16087b c16087b, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c16088c.m45478p(interfaceC13062m, str, c16087b, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: r */
    public final Object m45480r(InterfaceC13062m interfaceC13062m, Action action, C16087b c16087b, InterfaceC30057d<? super C16087b> interfaceC30057d) {
        i iVar;
        String strM45482u;
        C16087b c16087bM45453b;
        Action action2 = action;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f60942H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f60942H = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f60940F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = iVar2.f60942H;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    C16087b c16087b2 = (C16087b) iVar2.f60939E;
                    String str = (String) iVar2.f60946z;
                    Action action3 = (Action) iVar2.f60944x;
                    AbstractC34132o.m107864I(obj);
                    strM45482u = str;
                    c16087bM45453b = c16087b2;
                    action2 = action3;
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        strM45482u = m45482u(action2);
        if (strM45482u == null || AbstractC39414r.m125890i0(strM45482u)) {
            this.logger.mo85228t("LoadPage: no GET path, skipping fetch", new AbstractC30556a.a[0]);
            return c16087b;
        }
        if (c16087b.getData() == null) {
            this.logger.mo85228t("LoadPage: no data loaded, skipping fetch", new AbstractC30556a.a[0]);
            return c16087b;
        }
        if (Uri.parse(strM45482u).getQueryParameter("nextToken") == null) {
            iVar2.f60943w = null;
            iVar2.f60944x = null;
            iVar2.f60945y = null;
            iVar2.f60946z = null;
            iVar2.f60942H = 1;
            Object objM45478p = m45478p(interfaceC13062m, strM45482u, c16087b, true, iVar2);
            if (objM45478p != obj2) {
                return objM45478p;
            }
        } else {
            c16087bM45453b = C16087b.m45453b(c16087b, false, false, null, null, AbstractC16093h.b.f60993a, null, null, null, 239, null);
            iVar2.f60943w = null;
            iVar2.f60944x = action2;
            iVar2.f60945y = null;
            iVar2.f60946z = strM45482u;
            iVar2.f60939E = c16087bM45453b;
            iVar2.f60942H = 2;
            if (interfaceC13062m.emit(c16087bM45453b, iVar2) != obj2) {
            }
        }
        iVar2.f60943w = null;
        iVar2.f60944x = null;
        iVar2.f60945y = null;
        iVar2.f60946z = null;
        iVar2.f60939E = null;
        iVar2.f60942H = 3;
        Object objM45475m = m45475m(c16087bM45453b, strM45482u, action2, iVar2);
        return objM45475m == obj2 ? obj2 : objM45475m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final Object m45481s(InterfaceC13062m interfaceC13062m, C16087b c16087b, InterfaceC30057d<? super C16087b> interfaceC30057d) {
        String initialPath = c16087b.getInitialPath();
        if (initialPath != null && !AbstractC39414r.m125890i0(initialPath)) {
            return m45478p(interfaceC13062m, initialPath, c16087b, true, interfaceC30057d);
        }
        this.logger.mo85228t("Refresh: no initial path, skipping", new AbstractC30556a.a[0]);
        return c16087b;
    }

    /* JADX INFO: renamed from: u */
    private final String m45482u(Action action) {
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

    /* JADX INFO: renamed from: v */
    private final C16087b m45483v(String id4, CommunityFollowerLookupResponse data, C16087b state) {
        List<DesignSystemModel> items = data.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            DesignSystemModel designSystemModelUnwrap = DesignSystemModelKt.unwrap((DesignSystemModel) obj);
            FollowerRequestModel followerRequestModel = designSystemModelUnwrap instanceof FollowerRequestModel ? (FollowerRequestModel) designSystemModelUnwrap : null;
            if (!AbstractC22676k.m65745e(followerRequestModel != null ? followerRequestModel.getId() : null, id4)) {
                arrayList.add(obj);
            }
        }
        int totalRequest = data.getTotalRequest() - 1;
        if (totalRequest < 0) {
            totalRequest = 0;
        }
        return C16087b.m45453b(state, false, false, CommunityFollowerLookupResponse.copy$default(data, totalRequest, null, null, arrayList, 6, null), null, null, AbstractC16092g.c.f60990a, AbstractC25247g0.m73991Z(id4, state.m45456d()), null, 155, null);
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m45484t(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new j(upstream, this, null));
    }

    public /* synthetic */ C16088c(CommunityFollowerLookupApi communityFollowerLookupApi, C30695c c30695c, C37378a c37378a, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(communityFollowerLookupApi, c30695c, c37378a, str, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CommunityFollowerLookupInteractor") : interfaceC34116n);
    }
}
