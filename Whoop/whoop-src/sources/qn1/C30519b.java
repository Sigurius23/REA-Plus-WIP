package qn1;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.homenotificationscenter.domain.cache.NotificationsCenterGetRequest;
import com.whoop.homenotificationscenter.domain.models.HomeNotificationsCenterResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import m83.AbstractC25260n;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import or2.AbstractC28157e0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.InterfaceC29354a;
import pn1.AbstractC29378a;
import pn1.C29380c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: qn1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u000f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lqn1/b;", "Lod1/g;", "Lpn1/a;", "Lqn1/d;", "Lnm0/e;", "cachedApiSource", "Lpn1/c;", "refreshHook", "<init>", "(Lnm0/e;Lpn1/c;)V", "", "shouldShimmer", "", "path", "userCategory", "Lec3/l;", "d", "(ZLjava/lang/String;Ljava/lang/String;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "e", "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lpn1/c;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30519b implements InterfaceC27844g<AbstractC29378a, AbstractC30521d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C29380c refreshHook;

    /* JADX INFO: renamed from: qn1.b$a */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125387w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f125388x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f125389y;

        /* JADX INFO: renamed from: qn1.b$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42230a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125390w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f125391x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f125392y;

            /* JADX INFO: renamed from: qn1.b$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsFetchInteractor$fetchNotificationCards$$inlined$map$1$2", m100430f = "HomeNotificationsFetchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42231a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125393E;

                /* JADX INFO: renamed from: F */
                Object f125394F;

                /* JADX INFO: renamed from: G */
                Object f125395G;

                /* JADX INFO: renamed from: H */
                int f125396H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125397w;

                /* JADX INFO: renamed from: x */
                int f125398x;

                /* JADX INFO: renamed from: y */
                Object f125399y;

                public C42231a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125397w = obj;
                    this.f125398x |= Integer.MIN_VALUE;
                    return C42230a.this.emit(null, this);
                }
            }

            public C42230a(InterfaceC13062m interfaceC13062m, boolean z4, String str) {
                this.f125390w = interfaceC13062m;
                this.f125391x = z4;
                this.f125392y = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42231a c42231a;
                Object cVar;
                if (interfaceC30057d instanceof C42231a) {
                    c42231a = (C42231a) interfaceC30057d;
                    int i13 = c42231a.f125398x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42231a.f125398x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42231a = new C42231a(interfaceC30057d);
                    }
                } else {
                    c42231a = new C42231a(interfaceC30057d);
                }
                Object obj2 = c42231a.f125397w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42231a.f125398x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125390w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        cVar = new AbstractC30521d.k((HomeNotificationsCenterResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), this.f125391x, this.f125392y);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        cVar = new AbstractC30521d.l((HomeNotificationsCenterResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f125392y);
                    } else {
                        cVar = interfaceC29354a instanceof InterfaceC29354a.e ? AbstractC30521d.e.f125501a : new AbstractC30521d.c(this.f125392y);
                    }
                    c42231a.f125399y = null;
                    c42231a.f125393E = null;
                    c42231a.f125394F = null;
                    c42231a.f125395G = null;
                    c42231a.f125396H = 0;
                    c42231a.f125398x = 1;
                    if (interfaceC13062m.emit(cVar, c42231a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, boolean z4, String str) {
            this.f125387w = interfaceC13058l;
            this.f125388x = z4;
            this.f125389y = str;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125387w.collect(new C42230a(interfaceC13062m, this.f125388x, this.f125389y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qn1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsFetchInteractor$fetchNotificationCards$$inlined$transform$1", m100430f = "HomeNotificationsFetchInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125401w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125402x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f125403y;

        /* JADX INFO: renamed from: qn1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125404w;

            /* JADX INFO: renamed from: qn1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsFetchInteractor$fetchNotificationCards$$inlined$transform$1$1", m100430f = "HomeNotificationsFetchInteractor.kt", m100431l = {41, 42, 45, 46, 47, 49}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42232a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125405E;

                /* JADX INFO: renamed from: F */
                Object f125406F;

                /* JADX INFO: renamed from: G */
                Object f125407G;

                /* JADX INFO: renamed from: H */
                int f125408H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125409w;

                /* JADX INFO: renamed from: x */
                int f125410x;

                /* JADX INFO: renamed from: z */
                Object f125412z;

                public C42232a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125409w = obj;
                    this.f125410x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f125404w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:34:0x00dd A[PHI: r2 r4 r8
              0x00dd: PHI (r2v18 ec3.m) = (r2v15 ec3.m), (r2v20 ec3.m) binds: [B:32:0x00da, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x00dd: PHI (r4v5 qn1.d) = (r4v2 qn1.d), (r4v9 qn1.d) binds: [B:32:0x00da, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x00dd: PHI (r8v20 int) = (r8v17 int), (r8v23 int) binds: [B:32:0x00da, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
            
                if (bc3.AbstractC3034m0.m8782b(1500, r0) == r1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
            
                if (r9.emit(r8, r0) == r1) goto L39;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
                /*
                    Method dump skipped, instruction units count: 294
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: qn1.C30519b.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125403y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f125403y, interfaceC30057d);
            bVar.f125402x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125401w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125402x;
                InterfaceC13058l interfaceC13058l = this.f125403y;
                a aVar = new a(interfaceC13062m);
                this.f125402x = null;
                this.f125401w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qn1.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsFetchInteractor$fetchNotificationCardsFromCacheResultFlow$$inlined$cacheAPI$1", m100430f = "HomeNotificationsFetchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125413w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125414x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125415y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f125416z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f125416z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f125416z);
            cVar.f125414x = interfaceC13062m;
            cVar.f125415y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125413w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125414x;
                C26832c c26832c = (C26832c) this.f125415y;
                InterfaceC26834e interfaceC26834e = this.f125416z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HomeNotificationsCenterResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HomeNotificationsCenterResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f125414x = null;
                this.f125415y = null;
                this.f125413w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qn1.b$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125417w;

        /* JADX INFO: renamed from: qn1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125418w;

            /* JADX INFO: renamed from: qn1.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsFetchInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "HomeNotificationsFetchInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42233a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f125420F;

                /* JADX INFO: renamed from: G */
                Object f125421G;

                /* JADX INFO: renamed from: H */
                int f125422H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125423w;

                /* JADX INFO: renamed from: x */
                int f125424x;

                /* JADX INFO: renamed from: y */
                Object f125425y;

                /* JADX INFO: renamed from: z */
                Object f125426z;

                public C42233a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125423w = obj;
                    this.f125424x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f125418w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42233a c42233a;
                if (interfaceC30057d instanceof C42233a) {
                    c42233a = (C42233a) interfaceC30057d;
                    int i13 = c42233a.f125424x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42233a.f125424x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42233a = new C42233a(interfaceC30057d);
                    }
                } else {
                    c42233a = new C42233a(interfaceC30057d);
                }
                Object obj2 = c42233a.f125423w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42233a.f125424x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125418w;
                    if (obj instanceof AbstractC29378a.c) {
                        c42233a.f125425y = null;
                        c42233a.f125426z = null;
                        c42233a.f125420F = null;
                        c42233a.f125421G = null;
                        c42233a.f125422H = 0;
                        c42233a.f125424x = 1;
                        if (interfaceC13062m.emit(obj, c42233a) == enumC31071a) {
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
            this.f125417w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125417w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qn1.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.domain.interactors.HomeNotificationsFetchInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HomeNotificationsFetchInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125427w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125428x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125429y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30519b f125430z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C30519b c30519b) {
            super(3, interfaceC30057d);
            this.f125430z = c30519b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29378a abstractC29378a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f125430z);
            eVar.f125428x = interfaceC13062m;
            eVar.f125429y = abstractC29378a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125427w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125428x;
                AbstractC29378a abstractC29378a = (AbstractC29378a) this.f125429y;
                if (!(abstractC29378a instanceof AbstractC29378a.c)) {
                    throw new IllegalStateException("state is impossible");
                }
                AbstractC29378a.c cVar = (AbstractC29378a.c) abstractC29378a;
                InterfaceC13058l interfaceC13058lM93509d = this.f125430z.m93509d(cVar.getPlayShimmer(), cVar.getPath(), cVar.getUserCategory());
                this.f125428x = null;
                this.f125429y = null;
                this.f125427w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM93509d, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC29378a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C30519b(InterfaceC26834e cachedApiSource, C29380c refreshHook) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(refreshHook, "refreshHook");
        this.cachedApiSource = cachedApiSource;
        this.refreshHook = refreshHook;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m93509d(boolean shouldShimmer, String path, String userCategory) {
        return new C13084s1(new b(new a(m93510e(path), shouldShimmer, userCategory), null));
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC13058l m93510e(String path) {
        if (path == null) {
            path = NotificationsCenterGetRequest.NOTIFICATION_WRAPPER_V2_PATH;
        }
        return AbstractC13091v.m36590P(AbstractC32714a.m102669a(new C0456u(new NotificationsCenterGetRequest(path), 1), AbstractC25260n.m74059b1(new String[]{SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, "home", "notifications"}), path), new c(null, this.cachedApiSource));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(AbstractC28157e0.m85207a(new d(upstream), this.refreshHook.getRefreshEvents()), new e(null, this));
    }
}
