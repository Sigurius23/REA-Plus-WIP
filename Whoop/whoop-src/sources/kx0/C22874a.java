package kx0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4366f;
import ch.C4588i;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.straphistorysync.sync.InterfaceC10278f;
import dt0.InterfaceC12361d;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13054k;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.android.core.RunnableC20151r0;
import java.time.Clock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import tr2.InterfaceC34116n;
import ts0.EnumC34138c;
import yh2.InterfaceC39544c;

/* JADX INFO: renamed from: kx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001e\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010 J\u0017\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020&0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, m65681d2 = {"Lkx0/a;", "Lca2/f;", "Lyh2/c;", "sensorHpsApi", "Ldt0/d;", "dataSyncService", "Lbc3/c0;", "scope", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lyh2/c;Ldt0/d;Lbc3/c0;Ljava/time/Clock;Ltr2/n;)V", "Ljk0/d;", "strap", "Lsj2/a;", "priority", "", "jobTag", "Ll83/a0;", "o", "(Ljk0/d;Lsj2/a;Ljava/lang/String;)V", "Lec3/f2;", "Lcom/whoop/straphistorysync/sync/f;", "hpsStateFlow", "n", "(Lec3/f2;)V", "m", "(Lec3/f2;Ljava/lang/String;)V", "l", "b", "(Ljk0/d;Ljava/lang/String;)V", "", "processNow", "a", "(Ljk0/d;ZLjava/lang/String;)V", "d", "Ljava/lang/Runnable;", "listener", "f", "(Ljava/lang/Runnable;)Ljava/lang/Runnable;", "Lec3/l;", "Lts0/c;", "e", "(Ljava/lang/String;)Lec3/l;", "Lyh2/c;", "Ldt0/d;", "c", "Lbc3/c0;", "Ljava/time/Clock;", "Ltr2/n;", "Ljk0/d;", "cachedStrap", "", "g", "J", "lastMidSyncObserveTime", "Ljava/util/concurrent/CopyOnWriteArrayList;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/concurrent/CopyOnWriteArrayList;", "syncCompletedListeners", "i", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22874a implements InterfaceC4366f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39544c sensorHpsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC12361d dataSyncService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile InterfaceC21750d cachedStrap;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private volatile long lastMidSyncObserveTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final CopyOnWriteArrayList<Runnable> syncCompletedListeners;

    /* JADX INFO: renamed from: kx0.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForMidSyncUpload$1", m100430f = "HistorySyncRouterImpl.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f90156w;

        /* JADX INFO: renamed from: x */
        int f90157x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13037f2 f90158y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22874a f90159z;

        /* JADX INFO: renamed from: kx0.a$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForMidSyncUpload$1$1", m100430f = "HistorySyncRouterImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f;", "it", "", "<anonymous>", "(Lcom/whoop/straphistorysync/sync/f;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f90160w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f90161x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f90161x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC10278f interfaceC10278f, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC10278f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC10278f interfaceC10278f = (InterfaceC10278f) this.f90161x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f90160w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(!(interfaceC10278f instanceof InterfaceC10278f.b));
            }
        }

        /* JADX INFO: renamed from: kx0.a$b$b, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41925b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22665e0 f90162w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22874a f90163x;

            public C41925b(C22665e0 c22665e0, C22874a c22874a) {
                this.f90162w = c22665e0;
                this.f90163x = c22874a;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC10278f interfaceC10278f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (interfaceC10278f.getSuccessfulBurstCount() - this.f90162w.f89334w >= 500) {
                    this.f90163x.logger.mo85216g(AbstractC2875y.m8295h(interfaceC10278f.getSuccessfulBurstCount(), "Mid-sync upload triggered at burst "), new AbstractC30556a.a[0]);
                    this.f90163x.dataSyncService.mo34625c(DeviceTriggerSource.IMPLICIT_UPLOAD);
                    this.f90162w.f89334w = interfaceC10278f.getSuccessfulBurstCount();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13037f2 interfaceC13037f2, C22874a c22874a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f90158y = interfaceC13037f2;
            this.f90159z = c22874a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f90158y, this.f90159z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f90157x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22665e0 c22665e0 = new C22665e0();
                C13015a0 c13015a0 = new C13015a0(4, new a(null), this.f90158y);
                C41925b c41925b = new C41925b(c22665e0, this.f90159z);
                this.f90156w = null;
                this.f90157x = 1;
                if (c13015a0.collect(c41925b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kx0.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForStrapUpload$1", m100430f = "HistorySyncRouterImpl.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f90164w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC13037f2 f90165x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22874a f90166y;

        /* JADX INFO: renamed from: kx0.a$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForStrapUpload$1$terminal$1", m100430f = "HistorySyncRouterImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f;", "it", "", "<anonymous>", "(Lcom/whoop/straphistorysync/sync/f;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f90167w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f90168x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f90168x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC10278f interfaceC10278f, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC10278f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC10278f interfaceC10278f = (InterfaceC10278f) this.f90168x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f90167w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(interfaceC10278f instanceof InterfaceC10278f.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13037f2 interfaceC13037f2, C22874a c22874a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f90165x = interfaceC13037f2;
            this.f90166y = c22874a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f90165x, this.f90166y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f90164w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2 = this.f90165x;
                a aVar = new a(null);
                this.f90164w = 1;
                obj = AbstractC13091v.m36616z(interfaceC13037f2, aVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((InterfaceC10278f) obj) instanceof InterfaceC10278f.b.d) {
                this.f90166y.logger.mo85216g("HPS session completed successfully with empty jobTag, triggering STRAP upload", new AbstractC30556a.a[0]);
                this.f90166y.dataSyncService.mo34625c(DeviceTriggerSource.STRAP);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForSyncCompleted$1", m100430f = "HistorySyncRouterImpl.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f90169w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC13037f2 f90170x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22874a f90171y;

        /* JADX INFO: renamed from: kx0.a$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$observeForSyncCompleted$1$1", m100430f = "HistorySyncRouterImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f;", "it", "", "<anonymous>", "(Lcom/whoop/straphistorysync/sync/f;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f90172w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f90173x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f90173x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC10278f interfaceC10278f, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC10278f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC10278f interfaceC10278f = (InterfaceC10278f) this.f90173x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f90172w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(interfaceC10278f instanceof InterfaceC10278f.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13037f2 interfaceC13037f2, C22874a c22874a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f90170x = interfaceC13037f2;
            this.f90171y = c22874a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f90170x, this.f90171y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f90169w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2 = this.f90170x;
                a aVar = new a(null);
                this.f90169w = 1;
                if (AbstractC13091v.m36616z(interfaceC13037f2, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f90171y.logger.mo85216g("Sensor HPS reached terminal state, notifying sync completed listeners", new AbstractC30556a.a[0]);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f90171y.syncCompletedListeners;
            C22874a c22874a = this.f90171y;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((Runnable) it.next()).run();
                } catch (Exception e5) {
                    c22874a.logger.mo85230v("Sync completed listener threw", e5, new AbstractC30556a.a[0]);
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.a$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90174w;

        /* JADX INFO: renamed from: kx0.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90175w;

            /* JADX INFO: renamed from: kx0.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$startForcedSyncAndObserve$$inlined$filter$1$2", m100430f = "HistorySyncRouterImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41926a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f90177F;

                /* JADX INFO: renamed from: G */
                Object f90178G;

                /* JADX INFO: renamed from: H */
                int f90179H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90180w;

                /* JADX INFO: renamed from: x */
                int f90181x;

                /* JADX INFO: renamed from: y */
                Object f90182y;

                /* JADX INFO: renamed from: z */
                Object f90183z;

                public C41926a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90180w = obj;
                    this.f90181x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90175w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41926a c41926a;
                if (interfaceC30057d instanceof C41926a) {
                    c41926a = (C41926a) interfaceC30057d;
                    int i13 = c41926a.f90181x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41926a.f90181x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41926a = new C41926a(interfaceC30057d);
                    }
                } else {
                    c41926a = new C41926a(interfaceC30057d);
                }
                Object obj2 = c41926a.f90180w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41926a.f90181x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90175w;
                    if (((InterfaceC10278f) obj) instanceof InterfaceC10278f.b) {
                        c41926a.f90182y = null;
                        c41926a.f90183z = null;
                        c41926a.f90177F = null;
                        c41926a.f90178G = null;
                        c41926a.f90179H = 0;
                        c41926a.f90181x = 1;
                        if (interfaceC13062m.emit(obj, c41926a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f90174w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90174w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kx0.a$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f90184w;

        /* JADX INFO: renamed from: kx0.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f90185w;

            /* JADX INFO: renamed from: kx0.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.sync.HistorySyncRouterImpl$startForcedSyncAndObserve$$inlined$map$1$2", m100430f = "HistorySyncRouterImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41927a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f90186E;

                /* JADX INFO: renamed from: F */
                Object f90187F;

                /* JADX INFO: renamed from: G */
                Object f90188G;

                /* JADX INFO: renamed from: H */
                int f90189H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f90190w;

                /* JADX INFO: renamed from: x */
                int f90191x;

                /* JADX INFO: renamed from: y */
                Object f90192y;

                public C41927a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f90190w = obj;
                    this.f90191x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f90185w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41927a c41927a;
                if (interfaceC30057d instanceof C41927a) {
                    c41927a = (C41927a) interfaceC30057d;
                    int i13 = c41927a.f90191x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41927a.f90191x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41927a = new C41927a(interfaceC30057d);
                    }
                } else {
                    c41927a = new C41927a(interfaceC30057d);
                }
                Object obj2 = c41927a.f90190w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41927a.f90191x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f90185w;
                    EnumC34138c enumC34138c = ((InterfaceC10278f) obj) instanceof InterfaceC10278f.b.d ? EnumC34138c.FORCE_SYNC_COMPLETE : null;
                    c41927a.f90192y = null;
                    c41927a.f90186E = null;
                    c41927a.f90187F = null;
                    c41927a.f90188G = null;
                    c41927a.f90189H = 0;
                    c41927a.f90191x = 1;
                    if (interfaceC13062m.emit(enumC34138c, c41927a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f90184w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f90184w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22874a(InterfaceC39544c sensorHpsApi, InterfaceC12361d dataSyncService, InterfaceC2994c0 scope, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(sensorHpsApi, "sensorHpsApi");
        AbstractC22676k.m65750j(dataSyncService, "dataSyncService");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.sensorHpsApi = sensorHpsApi;
        this.dataSyncService = dataSyncService;
        this.scope = scope;
        this.clock = clock;
        this.logger = logger;
        this.syncCompletedListeners = new CopyOnWriteArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m66463k(C22874a c22874a, Runnable runnable) {
        c22874a.syncCompletedListeners.remove(runnable);
    }

    /* JADX INFO: renamed from: l */
    private final void m66464l(InterfaceC13037f2 hpsStateFlow) {
        long jLongValue = ((Number) this.dataSyncService.getHighWaterMark().getValue()).longValue();
        long jMillis = this.clock.millis();
        if (jLongValue > 0) {
            long j7 = jMillis - jLongValue;
            if (j7 > 900000) {
                if (jMillis - this.lastMidSyncObserveTime < ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
                    this.logger.mo85228t("Mid-sync upload observer throttled, skipping", new AbstractC30556a.a[0]);
                    return;
                }
                this.lastMidSyncObserveTime = jMillis;
                this.logger.mo85216g(AbstractC31061c.m95636l(j7 / ((long) DateTimeConstants.MILLIS_PER_MINUTE), "User is backlogged (", "min behind), enabling mid-sync uploads"), new AbstractC30556a.a[0]);
                AbstractC3006f0.m8732z(this.scope, null, null, new b(hpsStateFlow, this, null), 3);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m66465m(InterfaceC13037f2 hpsStateFlow, String jobTag) {
        if (jobTag.length() > 0) {
            return;
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new c(hpsStateFlow, this, null), 3);
    }

    /* JADX INFO: renamed from: n */
    private final void m66466n(InterfaceC13037f2 hpsStateFlow) {
        AbstractC3006f0.m8732z(this.scope, null, null, new d(hpsStateFlow, this, null), 3);
    }

    /* JADX INFO: renamed from: o */
    private final void m66467o(InterfaceC21750d strap, InterfaceC32564a priority, String jobTag) {
        this.cachedStrap = strap;
        InterfaceC34116n interfaceC34116n = this.logger;
        WhoopStrapInfo whoopStrapInfo = strap.get_strapInfo();
        interfaceC34116n.mo85228t("Sensor HPS: sync for " + (whoopStrapInfo != null ? whoopStrapInfo.getSerialNumber() : null) + " (priority=" + priority + ")", new AbstractC30556a.a[0]);
        InterfaceC13037f2 interfaceC13037f2Mo26279a = this.sensorHpsApi.mo26279a(strap, priority);
        m66464l(interfaceC13037f2Mo26279a);
        m66465m(interfaceC13037f2Mo26279a, jobTag);
        m66466n(interfaceC13037f2Mo26279a);
    }

    @Override // ca2.InterfaceC4366f
    /* JADX INFO: renamed from: a */
    public void mo13754a(InterfaceC21750d strap, boolean processNow, String jobTag) {
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(jobTag, "jobTag");
        m66467o(strap, InterfaceC32564a.b.f134906a, jobTag);
    }

    @Override // ca2.InterfaceC4366f
    /* JADX INFO: renamed from: b */
    public void mo13755b(InterfaceC21750d strap, String jobTag) {
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(jobTag, "jobTag");
        m66467o(strap, InterfaceC32564a.b.f134906a, jobTag);
    }

    @Override // ca2.InterfaceC4366f
    /* JADX INFO: renamed from: d */
    public void mo13756d(InterfaceC21750d strap, String jobTag) {
        AbstractC22676k.m65750j(strap, "strap");
        AbstractC22676k.m65750j(jobTag, "jobTag");
        m66467o(strap, InterfaceC32564a.c.f134908a, jobTag);
    }

    @Override // ca2.InterfaceC4366f
    /* JADX INFO: renamed from: e */
    public InterfaceC13058l mo13757e(String jobTag) {
        AbstractC22676k.m65750j(jobTag, "jobTag");
        InterfaceC21750d interfaceC21750d = this.cachedStrap;
        if (interfaceC21750d == null) {
            this.logger.mo85222m("Sensor HPS: no cached strap available for startForcedSyncAndObserve", new AbstractC30556a.a[0]);
            return C13054k.f45116w;
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        WhoopStrapInfo whoopStrapInfo = interfaceC21750d.get_strapInfo();
        interfaceC34116n.mo85228t(AbstractC11266d.m30461o("Sensor HPS: startForcedSyncAndObserve for ", whoopStrapInfo != null ? whoopStrapInfo.getSerialNumber() : null), new AbstractC30556a.a[0]);
        InterfaceC13037f2 interfaceC13037f2Mo26279a = this.sensorHpsApi.mo26279a(interfaceC21750d, InterfaceC32564a.b.f134906a);
        m66464l(interfaceC13037f2Mo26279a);
        m66466n(interfaceC13037f2Mo26279a);
        return new C4588i(new f(new e(interfaceC13037f2Mo26279a)), 2);
    }

    @Override // ca2.InterfaceC4366f
    /* JADX INFO: renamed from: f */
    public Runnable mo13758f(Runnable listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.syncCompletedListeners.add(listener);
        return new RunnableC20151r0(10, this, listener);
    }
}
