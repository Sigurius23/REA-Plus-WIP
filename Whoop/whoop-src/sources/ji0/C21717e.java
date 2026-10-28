package ji0;

import ad3.AbstractC0757c;
import android.database.sqlite.SQLiteException;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.appconfiguration.AppConfigurationApi;
import com.whoop.appconfiguration.AppConfigurationResponse;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.appconfiguration.TabsConfiguration;
import com.whoop.data.repositories.ActiveSessionChecker;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jy1.C22047a;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ze1.C40587c;

/* JADX INFO: renamed from: ji0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0001(BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010*\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020\u001bH\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b.\u0010-J\u0018\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b0\u0010\u001fJ\u0018\u00101\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b1\u0010\u001fJ\u0010\u00102\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b5\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001f\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0P0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010HR&\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0P0J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u0016\u0010X\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR \u0010^\u001a\b\u0012\u0004\u0012\u00020\u001d0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006`"}, m65681d2 = {"Lji0/e;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lji0/f;", "Lji0/a;", "cacheDao", "Lad3/c;", "json", "Liy1/c;", "metricWriter", "Lcom/whoop/appconfiguration/AppConfigurationApi;", "api", "Lcom/whoop/data/repositories/ActiveSessionChecker;", "activeSessionChecker", "Ljava/time/Clock;", "clock", "Lze1/c;", "lifecycleScopeProvider", "Ltr2/n;", "logger", "<init>", "(Lji0/a;Lad3/c;Liy1/c;Lcom/whoop/appconfiguration/AppConfigurationApi;Lcom/whoop/data/repositories/ActiveSessionChecker;Ljava/time/Clock;Lze1/c;Ltr2/n;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", "", "source", "", "refresh", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/appconfiguration/AppConfigurationResponse;", "response", "t", "(Lcom/whoop/appconfiguration/AppConfigurationResponse;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/appconfiguration/TabConfiguration;", "b", "()Lcom/whoop/appconfiguration/TabConfiguration;", "tabId", "a", "(Ljava/lang/String;)Z", "c", "(Ljava/lang/String;)Lcom/whoop/appconfiguration/TabConfiguration;", "clear", "(Lq83/d;)Ljava/lang/Object;", "n", "reason", "q", "r", "p", "l", "(Lcom/whoop/appconfiguration/AppConfigurationResponse;)V", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lji0/a;", "x", "Lad3/c;", "y", "Liy1/c;", "z", "Lcom/whoop/appconfiguration/AppConfigurationApi;", "E", "Lcom/whoop/data/repositories/ActiveSessionChecker;", "F", "Ljava/time/Clock;", "G", "Lze1/c;", "H", "Ltr2/n;", "Lec3/p1;", "I", "Lec3/p1;", "configurationState", "Lec3/f2;", "J", "Lec3/f2;", "getConfigurationFlow", "()Lec3/f2;", "configurationFlow", "", "K", "tabsState", "L", "d", "tabsFlow", "M", "Z", "wasExplicitlyCleared", "Lec3/l;", "N", "Lec3/l;", "e", "()Lec3/l;", "shouldFetchAiContextFlow", "O", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21717e implements DefaultLifecycleObserver, InterfaceC21718f {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final ActiveSessionChecker activeSessionChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C40587c lifecycleScopeProvider;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13075p1 configurationState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13037f2 configurationFlow;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13075p1 tabsState;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13037f2 tabsFlow;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private boolean wasExplicitlyCleared;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l shouldFetchAiContextFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC21713a cacheDao;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final AppConfigurationApi api;

    /* JADX INFO: renamed from: ji0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {128, 131}, m100432m = "clear", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f83370w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83371x;

        /* JADX INFO: renamed from: z */
        int f83373z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83371x = obj;
            this.f83373z |= Integer.MIN_VALUE;
            return C21717e.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: ji0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {137, 140, 151}, m100432m = "hydrateFromCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83374E;

        /* JADX INFO: renamed from: w */
        Object f83375w;

        /* JADX INFO: renamed from: x */
        Object f83376x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83377y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83377y = obj;
            this.f83374E |= Integer.MIN_VALUE;
            return C21717e.this.m61180n(this);
        }
    }

    /* JADX INFO: renamed from: ji0.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl$onCreate$1", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83379w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21717e.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83379w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21717e c21717e = C21717e.this;
                this.f83379w = 1;
                if (c21717e.m61180n(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ji0.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl$onStart$1", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83381w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21717e.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83381w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21717e c21717e = C21717e.this;
                this.f83381w = 1;
                obj = c21717e.refresh("self_app_start", this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C21717e.this.logger.mo85228t(AbstractC11266d.m30462p("App launch refresh result: ", ((Boolean) obj).booleanValue()), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ji0.e$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {90, 93, 101, 105}, m100432m = "persist", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83383E;

        /* JADX INFO: renamed from: w */
        Object f83384w;

        /* JADX INFO: renamed from: x */
        Object f83385x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83386y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83386y = obj;
            this.f83383E |= Integer.MIN_VALUE;
            return C21717e.this.m61190t(null, this);
        }
    }

    /* JADX INFO: renamed from: ji0.e$g */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {59, 64, 70}, m100432m = "refresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83388E;

        /* JADX INFO: renamed from: w */
        Object f83389w;

        /* JADX INFO: renamed from: x */
        Object f83390x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83391y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83391y = obj;
            this.f83388E |= Integer.MIN_VALUE;
            return C21717e.this.refresh(null, this);
        }
    }

    /* JADX INFO: renamed from: ji0.e$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl$refresh$result$1", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/appconfiguration/AppConfigurationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f83393w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21717e.this.new h(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83393w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AppConfigurationApi appConfigurationApi = C21717e.this.api;
            this.f83393w = 1;
            Object configuration = appConfigurationApi.getConfiguration(this);
            return configuration == enumC31071a ? enumC31071a : configuration;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AppConfigurationResponse> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ji0.e$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83395w;

        /* JADX INFO: renamed from: ji0.e$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83396w;

            /* JADX INFO: renamed from: ji0.e$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.appconfiguration.AppConfigurationRepositoryImpl$special$$inlined$map$1$2", m100430f = "AppConfigurationRepositoryImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41846a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83397E;

                /* JADX INFO: renamed from: F */
                Object f83398F;

                /* JADX INFO: renamed from: G */
                Object f83399G;

                /* JADX INFO: renamed from: H */
                int f83400H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83401w;

                /* JADX INFO: renamed from: x */
                int f83402x;

                /* JADX INFO: renamed from: y */
                Object f83403y;

                public C41846a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83401w = obj;
                    this.f83402x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f83396w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41846a c41846a;
                Boolean shouldFetchAiContext;
                if (interfaceC30057d instanceof C41846a) {
                    c41846a = (C41846a) interfaceC30057d;
                    int i13 = c41846a.f83402x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41846a.f83402x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41846a = new C41846a(interfaceC30057d);
                    }
                } else {
                    c41846a = new C41846a(interfaceC30057d);
                }
                Object obj2 = c41846a.f83401w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41846a.f83402x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83396w;
                    AppConfigurationResponse appConfigurationResponse = (AppConfigurationResponse) obj;
                    Boolean boolValueOf = Boolean.valueOf((appConfigurationResponse == null || (shouldFetchAiContext = appConfigurationResponse.getShouldFetchAiContext()) == null) ? false : shouldFetchAiContext.booleanValue());
                    c41846a.f83403y = null;
                    c41846a.f83397E = null;
                    c41846a.f83398F = null;
                    c41846a.f83399G = null;
                    c41846a.f83400H = 0;
                    c41846a.f83402x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41846a) == enumC31071a) {
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
            this.f83395w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83395w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C21717e(InterfaceC21713a cacheDao, AbstractC0757c json, InterfaceC21030c metricWriter, AppConfigurationApi api, ActiveSessionChecker activeSessionChecker, Clock clock, C40587c lifecycleScopeProvider, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cacheDao, "cacheDao");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(activeSessionChecker, "activeSessionChecker");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(lifecycleScopeProvider, "lifecycleScopeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        this.cacheDao = cacheDao;
        this.json = json;
        this.metricWriter = metricWriter;
        this.api = api;
        this.activeSessionChecker = activeSessionChecker;
        this.clock = clock;
        this.lifecycleScopeProvider = lifecycleScopeProvider;
        this.logger = logger;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.configurationState = c13045h2M36593c;
        C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c);
        this.configurationFlow = c13081r1M36598h;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(C25271y.f99162w);
        this.tabsState = c13045h2M36593c2;
        this.tabsFlow = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.shouldFetchAiContextFlow = AbstractC13091v.m36610t(new i(c13081r1M36598h));
    }

    /* JADX INFO: renamed from: l */
    private final void m61179l(AppConfigurationResponse response) {
        InterfaceC13075p1 interfaceC13075p1 = this.tabsState;
        TabsConfiguration tabs = response.getTabs();
        List<TabConfiguration> items = tabs != null ? tabs.getItems() : null;
        if (items == null) {
            items = C25271y.f99162w;
        }
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m61180n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f83374E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f83374E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo61163a = cVar.f83377y;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f83374E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo61163a);
                InterfaceC21713a interfaceC21713a = this.cacheDao;
                cVar.f83374E = 1;
                objMo61163a = interfaceC21713a.mo61163a(cVar);
                if (objMo61163a == obj) {
                }
                return obj;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objMo61163a);
            } else {
                if (i14 == 2) {
                    AbstractC34132o.m107864I(objMo61163a);
                    return c23454a0;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo61163a);
            }
            return c23454a0;
            C21716d c21716d = (C21716d) objMo61163a;
            if (c21716d == null) {
                this.logger.mo85228t("No cached app configuration found on disk", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            try {
                AbstractC0757c abstractC0757c = this.json;
                String responseJson = c21716d.getResponseJson();
                abstractC0757c.getClass();
                AppConfigurationResponse appConfigurationResponse = (AppConfigurationResponse) abstractC0757c.m1831b(AppConfigurationResponse.INSTANCE.serializer(), responseJson);
                if (((C13045h2) this.configurationState).getValue() == null) {
                    ((C13045h2) this.configurationState).m36570j(appConfigurationResponse);
                    m61179l(appConfigurationResponse);
                } else {
                    this.logger.mo85228t("hydrateFromCache skipped — fresher data already in state", new AbstractC30556a.a[0]);
                }
                return c23454a0;
            } catch (SerializationException e5) {
                this.logger.mo85230v("Failed to deserialize cached app configuration", e5, new AbstractC30556a.a[0]);
                cVar.f83375w = null;
                cVar.f83376x = null;
                cVar.f83374E = 3;
                if (m61183q("serialization", cVar) == obj) {
                }
            }
        } catch (SQLiteException e13) {
            this.logger.mo85230v("Failed to read app configuration from DB", e13, new AbstractC30556a.a[0]);
            cVar.f83375w = null;
            cVar.f83374E = 2;
            if (m61183q("sqlite", cVar) == obj) {
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    private final Object m61181o(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "applied_app_configuration", null, C25271y.f99162w, null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private final Object m61182p(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "failed_to_clear_app_configuration", null, C25271y.f99162w, null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private final Object m61183q(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "failed_to_read_app_configuration_on_disk", null, AbstractC31061c.m95644t("reason:", str), null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private final Object m61184r(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "failed_to_persist_app_configuration", null, AbstractC31061c.m95644t("reason:", str), null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    @Override // ji0.InterfaceC21718f
    /* JADX INFO: renamed from: a */
    public boolean mo61185a(String tabId) {
        AbstractC22676k.m65750j(tabId, "tabId");
        Iterable iterable = (Iterable) getTabsFlow().getValue();
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((TabConfiguration) it.next()).getId(), tabId)) {
                return true;
            }
        }
        return false;
    }

    @Override // ji0.InterfaceC21718f
    /* JADX INFO: renamed from: b */
    public TabConfiguration mo61186b() {
        TabsConfiguration tabs;
        AppConfigurationResponse appConfigurationResponse = (AppConfigurationResponse) this.configurationFlow.getValue();
        Object obj = null;
        if (appConfigurationResponse == null || (tabs = appConfigurationResponse.getTabs()) == null) {
            return null;
        }
        for (Object obj2 : tabs.getItems()) {
            if (AbstractC22676k.m65745e(((TabConfiguration) obj2).getId(), tabs.getDefaultTabId())) {
                obj = obj2;
                break;
            }
        }
        return (TabConfiguration) obj;
    }

    @Override // ji0.InterfaceC21718f
    /* JADX INFO: renamed from: c */
    public TabConfiguration mo61187c(String tabId) {
        Object next;
        AbstractC22676k.m65750j(tabId, "tabId");
        Iterator it = ((Iterable) getTabsFlow().getValue()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((TabConfiguration) next).getId(), tabId)) {
                return (TabConfiguration) next;
            }
        }
        next = null;
        return (TabConfiguration) next;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8.deleteAll(r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (m61182p(r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        return r1;
     */
    @Override // com.whoop.data.remote.AppConfigurationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clear(q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ji0.C21717e.b
            if (r0 == 0) goto L13
            r0 = r8
            ji0.e$b r0 = (ji0.C21717e.b) r0
            int r1 = r0.f83373z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83373z = r1
            goto L18
        L13:
            ji0.e$b r0 = new ji0.e$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f83371x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f83373z
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f83370w
            android.database.sqlite.SQLiteException r0 = (android.database.sqlite.SQLiteException) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L75
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            p505ts.AbstractC34132o.m107864I(r8)     // Catch: android.database.sqlite.SQLiteException -> L3b
            goto L75
        L3b:
            r8 = move-exception
            goto L60
        L3d:
            p505ts.AbstractC34132o.m107864I(r8)
            r7.wasExplicitlyCleared = r5
            ec3.p1 r8 = r7.configurationState
            ec3.h2 r8 = (ec3.C13045h2) r8
            r8.m36570j(r4)
            ec3.p1 r8 = r7.tabsState
            ec3.h2 r8 = (ec3.C13045h2) r8
            r8.getClass()
            m83.y r2 = m83.C25271y.f99162w
            r8.m36571k(r4, r2)
            ji0.a r8 = r7.cacheDao     // Catch: android.database.sqlite.SQLiteException -> L3b
            r0.f83373z = r5     // Catch: android.database.sqlite.SQLiteException -> L3b
            java.lang.Object r8 = r8.deleteAll(r0)     // Catch: android.database.sqlite.SQLiteException -> L3b
            if (r8 != r1) goto L75
            goto L74
        L60:
            tr2.n r2 = r7.logger
            r5 = 0
            qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r5]
            java.lang.String r6 = "Failed to clear app configuration from DB"
            r2.mo85230v(r6, r8, r5)
            r0.f83370w = r4
            r0.f83373z = r3
            java.lang.Object r8 = r7.m61182p(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C21717e.clear(q83.d):java.lang.Object");
    }

    @Override // ji0.InterfaceC21718f
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC13037f2 getTabsFlow() {
        return this.tabsFlow;
    }

    @Override // ji0.InterfaceC21718f
    /* JADX INFO: renamed from: e, reason: from getter */
    public InterfaceC13058l getShouldFetchAiContextFlow() {
        return this.shouldFetchAiContextFlow;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.lifecycleScopeProvider.m131621a(owner), null, null, new d(null), 3);
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
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        if (((C13045h2) this.configurationState).getValue() != null || this.wasExplicitlyCleared) {
            return;
        }
        AbstractC3006f0.m8732z(this.lifecycleScopeProvider.m131621a(owner), null, null, new e(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.whoop.data.remote.AppConfigurationRepository
    public Object refresh(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) throws Exception {
        g gVar;
        InterfaceC34385a interfaceC34385a;
        boolean z4;
        Object objM61190t;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f83388E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f83388E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objHasSession = gVar2.f83391y;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar2.f83388E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objHasSession);
            ActiveSessionChecker activeSessionChecker = this.activeSessionChecker;
            gVar2.f83389w = str;
            gVar2.f83388E = 1;
            objHasSession = activeSessionChecker.hasSession(gVar2);
            if (objHasSession != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            str = (String) gVar2.f83389w;
            AbstractC34132o.m107864I(objHasSession);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objHasSession);
                return objHasSession;
            }
            str = (String) gVar2.f83389w;
            AbstractC34132o.m107864I(objHasSession);
        }
        interfaceC34385a = (InterfaceC34385a) objHasSession;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = ((C13045h2) this.configurationState).getValue() != null;
            if (z4) {
                this.logger.mo85228t(AbstractC11895b.m31996o("Fetch failed (", str, "), falling back to cached config"), new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m(AbstractC11895b.m31996o("Fetch failed (", str, ") and no cached config available"), new AbstractC30556a.a[0]);
            }
            return Boolean.valueOf(z4);
        }
        this.logger.mo85228t(AbstractC11895b.m31996o("Refresh success (", str, ")"), new AbstractC30556a.a[0]);
        AppConfigurationResponse appConfigurationResponse = (AppConfigurationResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        gVar2.f83389w = null;
        gVar2.f83390x = null;
        gVar2.f83388E = 3;
        objM61190t = m61190t(appConfigurationResponse, gVar2);
        if (objM61190t != obj) {
            return obj;
        }
        return objM61190t;
        if (!((Boolean) objHasSession).booleanValue()) {
            this.logger.mo85228t(AbstractC11895b.m31996o("Skipping refresh (", str, ") — no active or pending session"), new AbstractC30556a.a[0]);
            return Boolean.TRUE;
        }
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        h hVar = new h(null);
        gVar2.f83389w = str;
        gVar2.f83388E = 2;
        objHasSession = companion.m108730a(interfaceC34116n, null, "failed to fetch app configuration", hVar, gVar2);
        if (objHasSession != obj) {
            interfaceC34385a = (InterfaceC34385a) objHasSession;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((C13045h2) this.configurationState).getValue() != null) {
                }
                if (z4) {
                    this.logger.mo85228t(AbstractC11895b.m31996o("Fetch failed (", str, "), falling back to cached config"), new AbstractC30556a.a[0]);
                } else {
                    this.logger.mo85222m(AbstractC11895b.m31996o("Fetch failed (", str, ") and no cached config available"), new AbstractC30556a.a[0]);
                }
                return Boolean.valueOf(z4);
            }
            this.logger.mo85228t(AbstractC11895b.m31996o("Refresh success (", str, ")"), new AbstractC30556a.a[0]);
            AppConfigurationResponse appConfigurationResponse2 = (AppConfigurationResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            gVar2.f83389w = null;
            gVar2.f83390x = null;
            gVar2.f83388E = 3;
            objM61190t = m61190t(appConfigurationResponse2, gVar2);
            if (objM61190t != obj) {
                return objM61190t;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2 A[Catch: SerializationException -> 0x005a, SQLiteException -> 0x005d, TryCatch #2 {SQLiteException -> 0x005d, SerializationException -> 0x005a, blocks: (B:20:0x0056, B:36:0x00b8, B:38:0x00c0, B:40:0x00c6, B:41:0x00d7, B:43:0x00dd, B:45:0x00ec, B:47:0x00f2, B:49:0x00f8, B:27:0x0068, B:33:0x00a0, B:30:0x006f), top: B:60:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (m61184r("serialization", r3) == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if (m61184r("sqlite", r3) == r4) goto L57;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m61190t(com.whoop.appconfiguration.AppConfigurationResponse r20, q83.InterfaceC30057d<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C21717e.m61190t(com.whoop.appconfiguration.AppConfigurationResponse, q83.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21717e(InterfaceC21713a interfaceC21713a, AbstractC0757c abstractC0757c, InterfaceC21030c interfaceC21030c, AppConfigurationApi appConfigurationApi, ActiveSessionChecker activeSessionChecker, Clock clock, C40587c c40587c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        if ((i13 & 32) != 0) {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
            clock2 = clockSystemDefaultZone;
        } else {
            clock2 = clock;
        }
        this(interfaceC21713a, abstractC0757c, interfaceC21030c, appConfigurationApi, activeSessionChecker, clock2, (i13 & 64) != 0 ? new C40587c() : c40587c, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AppConfigurationRepository") : interfaceC34116n);
    }
}
