package ia0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.addactivity.network.model.Activity;
import com.whoop.addactivity.network.model.RecentActivity;
import com.whoop.domain.model.Login;
import com.whoop.service.network.ActivitiesApi;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ha0.C17051d;
import ha0.C17055h;
import ha0.InterfaceC17048a;
import ha0.InterfaceC17052e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.InterfaceC27837a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ia0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u0012J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00180\u0017H\u0086@¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u001e\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lia0/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lha0/a;", "activitiesDao", "Lha0/e;", "recentActivitiesDao", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Ltr2/n;", "logger", "Lod1/a0;", "userSessionManager", "Lbc3/c0;", "scope", "<init>", "(Lha0/a;Lha0/e;Lcom/whoop/service/network/ActivitiesApi;Ltr2/n;Lod1/a0;Lbc3/c0;)V", "Ll83/a0;", "c", "(Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "Lec3/l;", "", "Lha0/d;", "e", "f", "Lha0/h;", "g", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lha0/a;", "x", "Lha0/e;", "y", "Lcom/whoop/service/network/ActivitiesApi;", "z", "Ltr2/n;", "E", "Lod1/a0;", "F", "Lbc3/c0;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18292a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC17048a activitiesDao;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC17052e recentActivitiesDao;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ia0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository", m100430f = "ActivityTypesRepository.kt", m100431l = {66, 87}, m100432m = "fetchAllActivities", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f71166w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71167x;

        /* JADX INFO: renamed from: z */
        int f71169z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71167x = obj;
            this.f71169z |= Integer.MIN_VALUE;
            return C18292a.this.m52658c(this);
        }
    }

    /* JADX INFO: renamed from: ia0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$fetchAllActivities$response$1", m100430f = "ActivityTypesRepository.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"", "Lha0/d;", "<anonymous>", "()Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f71170w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C18292a.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71170w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ActivitiesApi activitiesApi = C18292a.this.activitiesApi;
                this.f71170w = 1;
                obj = activitiesApi.getActivities(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Iterable<Activity> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (Activity activity : iterable) {
                arrayList.add(new C17051d(activity.getInternalName(), activity.getDisplayName(), activity.getIconUrl(), activity.getDeleted(), activity.getCategory(), activity.getScoreType(), activity.getHasGps()));
            }
            return arrayList;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<C17051d>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ia0.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository", m100430f = "ActivityTypesRepository.kt", m100431l = {96, 117}, m100432m = "fetchRecentActivities", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f71172w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f71173x;

        /* JADX INFO: renamed from: z */
        int f71175z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71173x = obj;
            this.f71175z |= Integer.MIN_VALUE;
            return C18292a.this.m52659d(this);
        }
    }

    /* JADX INFO: renamed from: ia0.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$fetchRecentActivities$response$1", m100430f = "ActivityTypesRepository.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"", "Lha0/h;", "<anonymous>", "()Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f71176w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C18292a.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71176w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ActivitiesApi activitiesApi = C18292a.this.activitiesApi;
                this.f71176w = 1;
                obj = activitiesApi.getRecentActivities(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Iterable<RecentActivity> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            for (RecentActivity recentActivity : iterable) {
                arrayList.add(new C17055h(recentActivity.getInternalName(), recentActivity.getDisplayName(), recentActivity.getIconUrl(), recentActivity.getDeleted(), recentActivity.getCategory(), recentActivity.getScoreType(), recentActivity.getHasGps()));
            }
            return arrayList;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<C17055h>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ia0.a$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f71178w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18292a f71179x;

        /* JADX INFO: renamed from: ia0.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f71180w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18292a f71181x;

            /* JADX INFO: renamed from: ia0.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$getAllActivities$$inlined$map$1$2", m100430f = "ActivityTypesRepository.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41734a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f71182E;

                /* JADX INFO: renamed from: F */
                Object f71183F;

                /* JADX INFO: renamed from: G */
                Object f71184G;

                /* JADX INFO: renamed from: H */
                Object f71185H;

                /* JADX INFO: renamed from: I */
                Object f71186I;

                /* JADX INFO: renamed from: J */
                Object f71187J;

                /* JADX INFO: renamed from: K */
                int f71188K;

                /* JADX INFO: renamed from: L */
                int f71189L;

                /* JADX INFO: renamed from: M */
                int f71190M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f71191w;

                /* JADX INFO: renamed from: x */
                int f71192x;

                /* JADX INFO: renamed from: y */
                Object f71193y;

                public C41734a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f71191w = obj;
                    this.f71192x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18292a c18292a) {
                this.f71180w = interfaceC13062m;
                this.f71181x = c18292a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L25;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ia0.C18292a.e.a.C41734a
                    if (r0 == 0) goto L13
                    r0 = r9
                    ia0.a$e$a$a r0 = (ia0.C18292a.e.a.C41734a) r0
                    int r1 = r0.f71192x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f71192x = r1
                    goto L18
                L13:
                    ia0.a$e$a$a r0 = new ia0.a$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f71191w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f71192x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f71184G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f71182E
                    ia0.a$e$a$a r8 = (ia0.C18292a.e.a.C41734a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto La2
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f71188K
                    java.lang.Object r2 = r0.f71187J
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Object r2 = r0.f71186I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f71185H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f71184G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f71182E
                    ia0.a$e$a$a r4 = (ia0.C18292a.e.a.C41734a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L85
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f71180w
                    java.util.List r8 = (java.util.List) r8
                    java.util.Collection r8 = (java.util.Collection) r8
                    boolean r9 = r8.isEmpty()
                    r6 = 0
                    if (r9 == 0) goto L89
                    ia0.a r8 = r7.f71181x
                    r0.f71193y = r5
                    r0.f71182E = r5
                    r0.f71183F = r5
                    r0.f71184G = r5
                    r0.f71185H = r2
                    r0.f71186I = r5
                    r0.f71187J = r5
                    r0.f71188K = r6
                    r0.f71189L = r6
                    r0.f71190M = r6
                    r0.f71192x = r4
                    java.lang.Object r8 = ia0.C18292a.m52656a(r8, r0)
                    if (r8 != r1) goto L84
                    goto La1
                L84:
                    r8 = r6
                L85:
                    m83.y r9 = m83.C25271y.f99162w
                    r6 = r8
                    r8 = r9
                L89:
                    r0.f71193y = r5
                    r0.f71182E = r5
                    r0.f71183F = r5
                    r0.f71184G = r5
                    r0.f71185H = r5
                    r0.f71186I = r5
                    r0.f71187J = r5
                    r0.f71188K = r6
                    r0.f71192x = r3
                    java.lang.Object r8 = r2.emit(r8, r0)
                    if (r8 != r1) goto La2
                La1:
                    return r1
                La2:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ia0.C18292a.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C18292a c18292a) {
            this.f71178w = interfaceC13058l;
            this.f71179x = c18292a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f71178w.collect(new a(interfaceC13062m, this.f71179x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ia0.a$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository", m100430f = "ActivityTypesRepository.kt", m100431l = {53}, m100432m = "getCachedActivities", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f71195w;

        /* JADX INFO: renamed from: y */
        int f71197y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f71195w = obj;
            this.f71197y |= Integer.MIN_VALUE;
            return C18292a.this.m52661f(this);
        }
    }

    /* JADX INFO: renamed from: ia0.a$g */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f71198w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18292a f71199x;

        /* JADX INFO: renamed from: ia0.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f71200w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18292a f71201x;

            /* JADX INFO: renamed from: ia0.a$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$getRecentActivities$$inlined$map$1$2", m100430f = "ActivityTypesRepository.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41735a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f71202E;

                /* JADX INFO: renamed from: F */
                Object f71203F;

                /* JADX INFO: renamed from: G */
                Object f71204G;

                /* JADX INFO: renamed from: H */
                Object f71205H;

                /* JADX INFO: renamed from: I */
                Object f71206I;

                /* JADX INFO: renamed from: J */
                Object f71207J;

                /* JADX INFO: renamed from: K */
                int f71208K;

                /* JADX INFO: renamed from: L */
                int f71209L;

                /* JADX INFO: renamed from: M */
                int f71210M;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f71211w;

                /* JADX INFO: renamed from: x */
                int f71212x;

                /* JADX INFO: renamed from: y */
                Object f71213y;

                public C41735a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f71211w = obj;
                    this.f71212x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18292a c18292a) {
                this.f71200w = interfaceC13062m;
                this.f71201x = c18292a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L25;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ia0.C18292a.g.a.C41735a
                    if (r0 == 0) goto L13
                    r0 = r9
                    ia0.a$g$a$a r0 = (ia0.C18292a.g.a.C41735a) r0
                    int r1 = r0.f71212x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f71212x = r1
                    goto L18
                L13:
                    ia0.a$g$a$a r0 = new ia0.a$g$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f71211w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f71212x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f71204G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f71202E
                    ia0.a$g$a$a r8 = (ia0.C18292a.g.a.C41735a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto La2
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f71208K
                    java.lang.Object r2 = r0.f71207J
                    java.util.List r2 = (java.util.List) r2
                    java.lang.Object r2 = r0.f71206I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f71205H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f71204G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f71202E
                    ia0.a$g$a$a r4 = (ia0.C18292a.g.a.C41735a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L85
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f71200w
                    java.util.List r8 = (java.util.List) r8
                    java.util.Collection r8 = (java.util.Collection) r8
                    boolean r9 = r8.isEmpty()
                    r6 = 0
                    if (r9 == 0) goto L89
                    ia0.a r8 = r7.f71201x
                    r0.f71213y = r5
                    r0.f71202E = r5
                    r0.f71203F = r5
                    r0.f71204G = r5
                    r0.f71205H = r2
                    r0.f71206I = r5
                    r0.f71207J = r5
                    r0.f71208K = r6
                    r0.f71209L = r6
                    r0.f71210M = r6
                    r0.f71212x = r4
                    java.lang.Object r8 = r8.m52659d(r0)
                    if (r8 != r1) goto L84
                    goto La1
                L84:
                    r8 = r6
                L85:
                    m83.y r9 = m83.C25271y.f99162w
                    r6 = r8
                    r8 = r9
                L89:
                    r0.f71213y = r5
                    r0.f71202E = r5
                    r0.f71203F = r5
                    r0.f71204G = r5
                    r0.f71205H = r5
                    r0.f71206I = r5
                    r0.f71207J = r5
                    r0.f71208K = r6
                    r0.f71212x = r3
                    java.lang.Object r8 = r2.emit(r8, r0)
                    if (r8 != r1) goto La2
                La1:
                    return r1
                La2:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ia0.C18292a.g.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public g(InterfaceC13058l interfaceC13058l, C18292a c18292a) {
            this.f71198w = interfaceC13058l;
            this.f71199x = c18292a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f71198w.collect(new a(interfaceC13062m, this.f71199x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ia0.a$h */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$onCreate$1", m100430f = "ActivityTypesRepository.kt", m100431l = {33, 34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Login;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Login;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71215w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C18292a.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Login login, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(login, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r5.m52659d(r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f71215w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L35
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2a
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                ia0.a r5 = ia0.C18292a.this
                r4.f71215w = r3
                java.lang.Object r5 = ia0.C18292a.m52656a(r5, r4)
                if (r5 != r0) goto L2a
                goto L34
            L2a:
                ia0.a r5 = ia0.C18292a.this
                r4.f71215w = r2
                java.lang.Object r5 = r5.m52659d(r4)
                if (r5 != r0) goto L35
            L34:
                return r0
            L35:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ia0.C18292a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ia0.a$i */
    @InterfaceC32271e(m100429c = "com.whoop.addactivity.activitieslist.repository.ActivityTypesRepository$onCreate$2", m100430f = "ActivityTypesRepository.kt", m100431l = {37, 38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/domain/model/Login;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71217w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C18292a.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r5.m52659d(r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f71217w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L35
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2a
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                ia0.a r5 = ia0.C18292a.this
                r4.f71217w = r3
                java.lang.Object r5 = ia0.C18292a.m52656a(r5, r4)
                if (r5 != r0) goto L2a
                goto L34
            L2a:
                ia0.a r5 = ia0.C18292a.this
                r4.f71217w = r2
                java.lang.Object r5 = r5.m52659d(r4)
                if (r5 != r0) goto L35
            L34:
                return r0
            L35:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ia0.C18292a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18292a(InterfaceC17048a activitiesDao, InterfaceC17052e recentActivitiesDao, ActivitiesApi activitiesApi, InterfaceC34116n logger, InterfaceC27837a0 userSessionManager, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(activitiesDao, "activitiesDao");
        AbstractC22676k.m65750j(recentActivitiesDao, "recentActivitiesDao");
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(scope, "scope");
        this.activitiesDao = activitiesDao;
        this.recentActivitiesDao = recentActivitiesDao;
        this.activitiesApi = activitiesApi;
        this.logger = logger;
        this.userSessionManager = userSessionManager;
        this.scope = scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r1.mo48126b(r13, r6) == r0) goto L31;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m52658c(q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ia0.C18292a.a
            if (r0 == 0) goto L14
            r0 = r13
            ia0.a$a r0 = (ia0.C18292a.a) r0
            int r1 = r0.f71169z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f71169z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ia0.a$a r0 = new ia0.a$a
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f71167x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f71169z
            r9 = 0
            r10 = 0
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 == r2) goto L3d
            if (r1 != r11) goto L35
            java.lang.Object r0 = r6.f71166w
            u02.a r0 = (u02.InterfaceC34385a) r0
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.Exception -> L32
            goto L9c
        L32:
            r0 = move-exception
            r13 = r0
            goto L8f
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3d:
            p505ts.AbstractC34132o.m107864I(r13)
            goto L5c
        L41:
            p505ts.AbstractC34132o.m107864I(r13)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r13 = r2
            tr2.n r2 = r12.logger
            ia0.a$b r5 = new ia0.a$b
            r5.<init>(r10)
            r6.f71169z = r13
            r3 = 0
            java.lang.String r4 = "Failed to fetch activities"
            r7 = 2
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L5c
            goto L8e
        L5c:
            u02.a r13 = (u02.InterfaceC34385a) r13
            boolean r1 = r13 instanceof u02.InterfaceC34385a.b
            if (r1 == 0) goto L76
            tr2.n r0 = r12.logger
            u02.a$b r13 = (u02.InterfaceC34385a.b) r13
            java.lang.String r13 = r13.getErrorMessage()
            java.lang.String r1 = "failed to fetch activities: "
            java.lang.String r13 = p000.AbstractC11266d.m30461o(r1, r13)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r9]
            r0.mo85228t(r13, r1)
            goto L9c
        L76:
            boolean r1 = r13 instanceof u02.InterfaceC34385a.c
            if (r1 == 0) goto L9f
            ha0.a r1 = r12.activitiesDao     // Catch: java.lang.Exception -> L32
            u02.a$c r13 = (u02.InterfaceC34385a.c) r13     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = r13.m108735a()     // Catch: java.lang.Exception -> L32
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Exception -> L32
            r6.f71166w = r10     // Catch: java.lang.Exception -> L32
            r6.f71169z = r11     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = r1.mo48126b(r13, r6)     // Catch: java.lang.Exception -> L32
            if (r13 != r0) goto L9c
        L8e:
            return r0
        L8f:
            tr2.n r0 = r12.logger
            java.lang.String r1 = "failed to save activities to database "
            java.lang.String r13 = p031b9.AbstractC2875y.m8297j(r13, r1)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r9]
            r0.mo85228t(r13, r1)
        L9c:
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        L9f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C18292a.m52658c(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r1.mo48149b(r13, r6) == r0) goto L31;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m52659d(q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ia0.C18292a.c
            if (r0 == 0) goto L14
            r0 = r13
            ia0.a$c r0 = (ia0.C18292a.c) r0
            int r1 = r0.f71175z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f71175z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ia0.a$c r0 = new ia0.a$c
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f71173x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f71175z
            r9 = 0
            r10 = 0
            r11 = 2
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 == r2) goto L3d
            if (r1 != r11) goto L35
            java.lang.Object r0 = r6.f71172w
            u02.a r0 = (u02.InterfaceC34385a) r0
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.Exception -> L32
            goto L9c
        L32:
            r0 = move-exception
            r13 = r0
            goto L8f
        L35:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L3d:
            p505ts.AbstractC34132o.m107864I(r13)
            goto L5c
        L41:
            p505ts.AbstractC34132o.m107864I(r13)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r13 = r2
            tr2.n r2 = r12.logger
            ia0.a$d r5 = new ia0.a$d
            r5.<init>(r10)
            r6.f71175z = r13
            r3 = 0
            java.lang.String r4 = "Failed to fetch recent activities"
            r7 = 2
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L5c
            goto L8e
        L5c:
            u02.a r13 = (u02.InterfaceC34385a) r13
            boolean r1 = r13 instanceof u02.InterfaceC34385a.b
            if (r1 == 0) goto L76
            tr2.n r0 = r12.logger
            u02.a$b r13 = (u02.InterfaceC34385a.b) r13
            java.lang.String r13 = r13.getErrorMessage()
            java.lang.String r1 = "failed to fetch recent activities: "
            java.lang.String r13 = p000.AbstractC11266d.m30461o(r1, r13)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r9]
            r0.mo85228t(r13, r1)
            goto L9c
        L76:
            boolean r1 = r13 instanceof u02.InterfaceC34385a.c
            if (r1 == 0) goto L9f
            ha0.e r1 = r12.recentActivitiesDao     // Catch: java.lang.Exception -> L32
            u02.a$c r13 = (u02.InterfaceC34385a.c) r13     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = r13.m108735a()     // Catch: java.lang.Exception -> L32
            java.util.List r13 = (java.util.List) r13     // Catch: java.lang.Exception -> L32
            r6.f71172w = r10     // Catch: java.lang.Exception -> L32
            r6.f71175z = r11     // Catch: java.lang.Exception -> L32
            java.lang.Object r13 = r1.mo48149b(r13, r6)     // Catch: java.lang.Exception -> L32
            if (r13 != r0) goto L9c
        L8e:
            return r0
        L8f:
            tr2.n r0 = r12.logger
            java.lang.String r1 = "failed to save recent activities to database "
            java.lang.String r13 = p031b9.AbstractC2875y.m8297j(r13, r1)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r9]
            r0.mo85228t(r13, r1)
        L9c:
            l83.a0 r13 = l83.C23454a0.f92919a
            return r13
        L9f:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ia0.C18292a.m52659d(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final Object m52660e(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new e(this.activitiesDao.mo48125a(), this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m52661f(InterfaceC30057d<? super List<C17051d>> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f71197y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f71197y = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM36577C = fVar.f71195w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f71197y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            InterfaceC13058l interfaceC13058lMo48125a = this.activitiesDao.mo48125a();
            fVar.f71197y = 1;
            objM36577C = AbstractC13091v.m36577C(interfaceC13058lMo48125a, fVar);
            if (objM36577C == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36577C);
        }
        List list = (List) objM36577C;
        return list == null ? C25271y.f99162w : list;
    }

    /* JADX INFO: renamed from: g */
    public final Object m52662g(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new g(this.recentActivitiesDao.mo48148a(), this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new C13015a0(new i(null), new C13052j1(this.userSessionManager.getLoginFlow(), new h(null), 0)), this.scope);
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
