package pr2;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.whoop.domain.model.User;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.C27858u;
import od1.InterfaceC27837a0;
import p000.AbstractC11266d;
import p02.C28589a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pd1.C29104a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: pr2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001f\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, m65681d2 = {"Lpr2/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lod1/a0;", "userSessionManager", "Lpr2/b;", "avatarService", "Lod1/u;", "userContext", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "Lpd1/a;", "bootstrapUserSignIn", "Lz92/a;", "userInfoAccessor", "<init>", "(Lod1/a0;Lpr2/b;Lod1/u;Lbc3/c0;Ltr2/n;Lpd1/a;Lz92/a;)V", "Ll83/a0;", "j", "()V", "l", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "", "firstName", "lastName", "g", "(Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lod1/a0;", "x", "Lpr2/b;", "y", "Lod1/u;", "z", "Lbc3/c0;", "E", "Ltr2/n;", "F", "Lpd1/a;", "G", "Lz92/a;", "Lec3/f2;", "Lpr2/e;", "H", "Lec3/f2;", "getAvatarUploadState", "()Lec3/f2;", "avatarUploadState", "Lec3/o1;", "I", "Lec3/o1;", "avatarUrlUpdates", "Lec3/t1;", "J", "Lec3/t1;", "getAvatarUrlFlow", "()Lec3/t1;", "avatarUrlFlow", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29493a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C29104a bootstrapUserSignIn;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13037f2 avatarUploadState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13072o1 avatarUrlUpdates;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13087t1 avatarUrlFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC29494b avatarService;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: pr2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$generateAvatarForUser$1", m100430f = "AvatarManager.kt", m100431l = {86}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119868w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f119870y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f119871z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119870y = str;
            this.f119871z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29493a.this.new a(this.f119870y, this.f119871z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119868w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC29494b interfaceC29494b = C29493a.this.avatarService;
                    String str = this.f119870y;
                    String str2 = this.f119871z;
                    this.f119868w = 1;
                    obj = interfaceC29494b.mo90119d(str, str2, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C29493a.this.logger.mo85228t("Avatar generation result: " + ((InterfaceC29496d) obj), new AbstractC30556a.a[0]);
            } catch (Exception e5) {
                C29493a.this.logger.mo85230v("Unexpected error in avatar generation", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pr2.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119872w;

        /* JADX INFO: renamed from: pr2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119873w;

            /* JADX INFO: renamed from: pr2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$handleUserAvatarUpdates$$inlined$map$1$2", m100430f = "AvatarManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42185a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119874E;

                /* JADX INFO: renamed from: F */
                Object f119875F;

                /* JADX INFO: renamed from: G */
                Object f119876G;

                /* JADX INFO: renamed from: H */
                int f119877H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119878w;

                /* JADX INFO: renamed from: x */
                int f119879x;

                /* JADX INFO: renamed from: y */
                Object f119880y;

                public C42185a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119878w = obj;
                    this.f119879x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f119873w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42185a c42185a;
                if (interfaceC30057d instanceof C42185a) {
                    c42185a = (C42185a) interfaceC30057d;
                    int i13 = c42185a.f119879x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42185a.f119879x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42185a = new C42185a(interfaceC30057d);
                    }
                } else {
                    c42185a = new C42185a(interfaceC30057d);
                }
                Object obj2 = c42185a.f119878w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42185a.f119879x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119873w;
                    User user = (User) obj;
                    String avatarUrl = user != null ? user.getAvatarUrl() : null;
                    c42185a.f119880y = null;
                    c42185a.f119874E = null;
                    c42185a.f119875F = null;
                    c42185a.f119876G = null;
                    c42185a.f119877H = 0;
                    c42185a.f119879x = 1;
                    if (interfaceC13062m.emit(avatarUrl, c42185a) == enumC31071a) {
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
            this.f119872w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119872w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pr2.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$handleUserAvatarUpdates$2", m100430f = "AvatarManager.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "avatarUrl", "Ll83/a0;", "<anonymous>", "(Ljava/lang/String;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119882w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119883x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C29493a.this.new c(interfaceC30057d);
            cVar.f119883x = obj;
            return cVar;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.f119883x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119882w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C29493a.this.logger.mo85228t(AbstractC11266d.m30461o("User profile updated via UserInfoAccessor, emitting new avatar URL: ", str), new AbstractC30556a.a[0]);
                InterfaceC13072o1 interfaceC13072o1 = C29493a.this.avatarUrlUpdates;
                this.f119883x = null;
                this.f119882w = 1;
                if (interfaceC13072o1.emit(str, this) == enumC31071a) {
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

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: pr2.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$onCreate$1", m100430f = "AvatarManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lpr2/e;", "uploadState", "Ll83/a0;", "<anonymous>", "(Lpr2/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119885w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119886x;

        /* JADX INFO: renamed from: pr2.a$d$a */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$onCreate$1$1", m100430f = "AvatarManager.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f119888w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29493a f119889x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29493a c29493a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f119889x = c29493a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f119889x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f119888w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f119889x.logger.mo85228t("Updating user cache from network for avatar upload", new AbstractC30556a.a[0]);
                    C29104a c29104a = this.f119889x.bootstrapUserSignIn;
                    this.f119888w = 1;
                    if (c29104a.m88436m(this) == enumC31071a) {
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

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C29493a.this.new d(interfaceC30057d);
            dVar.f119886x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC29497e interfaceC29497e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC29497e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC29497e interfaceC29497e = (InterfaceC29497e) this.f119886x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119885w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC29497e instanceof InterfaceC29497e.d) {
                C29493a.this.logger.mo85228t("Avatar upload successful, updating user profile", new AbstractC30556a.a[0]);
                AbstractC3006f0.m8732z(C29493a.this.coroutineScope, null, null, new a(C29493a.this, null), 3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pr2.a$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119890w;

        /* JADX INFO: renamed from: pr2.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119891w;

            /* JADX INFO: renamed from: pr2.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$special$$inlined$map$1$2", m100430f = "AvatarManager.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42186a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119892E;

                /* JADX INFO: renamed from: F */
                Object f119893F;

                /* JADX INFO: renamed from: G */
                Object f119894G;

                /* JADX INFO: renamed from: H */
                int f119895H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119896w;

                /* JADX INFO: renamed from: x */
                int f119897x;

                /* JADX INFO: renamed from: y */
                Object f119898y;

                public C42186a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119896w = obj;
                    this.f119897x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f119891w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42186a c42186a;
                if (interfaceC30057d instanceof C42186a) {
                    c42186a = (C42186a) interfaceC30057d;
                    int i13 = c42186a.f119897x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42186a.f119897x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42186a = new C42186a(interfaceC30057d);
                    }
                } else {
                    c42186a = new C42186a(interfaceC30057d);
                }
                Object obj2 = c42186a.f119896w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42186a.f119897x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119891w;
                    User user = (User) obj;
                    String avatarUrl = user != null ? user.getAvatarUrl() : null;
                    c42186a.f119898y = null;
                    c42186a.f119892E = null;
                    c42186a.f119893F = null;
                    c42186a.f119894G = null;
                    c42186a.f119895H = 0;
                    c42186a.f119897x = 1;
                    if (interfaceC13062m.emit(avatarUrl, c42186a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f119890w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119890w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pr2.a$f */
    @InterfaceC32271e(m100429c = "com.whoop.util.avatar.AvatarManager$updateAvatarOnLogin$2", m100430f = "AvatarManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/User;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/User;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119900w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f119901x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C29493a.this.new f(interfaceC30057d);
            fVar.f119901x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(user, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            User user = (User) this.f119901x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119900w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (user.getAvatarUrl().length() == 0 && user.getFirstName().length() > 0 && user.getLastName().length() > 0) {
                C29493a.this.m90113g(user.getFirstName(), user.getLastName());
            }
            return C23454a0.f92919a;
        }
    }

    public C29493a(InterfaceC27837a0 userSessionManager, InterfaceC29494b avatarService, C27858u userContext, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, C29104a bootstrapUserSignIn, InterfaceC40205a userInfoAccessor) {
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(avatarService, "avatarService");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(bootstrapUserSignIn, "bootstrapUserSignIn");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        this.userSessionManager = userSessionManager;
        this.avatarService = avatarService;
        this.userContext = userContext;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.bootstrapUserSignIn = bootstrapUserSignIn;
        this.userInfoAccessor = userInfoAccessor;
        this.avatarUploadState = avatarService.getAvatarUploadState();
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.avatarUrlUpdates = c13096w1M36592b;
        this.avatarUrlFlow = AbstractC13091v.m36586L(AbstractC13091v.m36610t(AbstractC13091v.m36584J(new e(userInfoAccessor.getUser()), c13096w1M36592b)), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: j */
    private final void m90110j() {
        AbstractC13091v.m36582H(new C13052j1(new b(this.userInfoAccessor.getUser()), new c(null), 0), this.coroutineScope);
    }

    /* JADX INFO: renamed from: l */
    private final void m90111l() {
        AbstractC13091v.m36582H(new C13052j1(new C4588i(AbstractC13091v.m36609s(new C28589a(20), this.userInfoAccessor.getUser()), 2), new f(null), 0), this.coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final boolean m90112n(User user, User user2) {
        return (user == null) == (user2 == null);
    }

    /* JADX INFO: renamed from: g */
    public final void m90113g(String firstName, String lastName) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(firstName, lastName, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onCreate(owner);
        AbstractC13091v.m36582H(new C13052j1(this.avatarUploadState, new d(null), 0), this.coroutineScope);
        m90110j();
        m90111l();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
