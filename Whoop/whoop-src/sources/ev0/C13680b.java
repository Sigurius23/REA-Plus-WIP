package ev0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13105z1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ev0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010&¨\u0006("}, m65681d2 = {"Lev0/b;", "", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "Ltd1/b;", "whoopStrapProxy", "Lzr2/a;", "dateTimeProvider", "<init>", "(Ltr2/n;Lbc3/c0;Ltd1/b;Lzr2/a;)V", "Lev0/a;", "currentState", "", "g", "(Lev0/a;)J", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "d", "a", "Ltr2/n;", "b", "Lbc3/c0;", "c", "Lzr2/a;", "Lbc3/k1;", "Lbc3/k1;", "monitorStrapStatusJob", "Lec3/t1;", "e", "Lec3/t1;", "strapDisconnectedFlow", "", "f", "()I", "numberOfDisconnects", "()J", "durationOfDisconnect", "connectivity-analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13680b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private InterfaceC3027k1 monitorStrapStatusJob;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13087t1 strapDisconnectedFlow;

    /* JADX INFO: renamed from: ev0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.status.StrapDisconnectMonitor$startMonitoringForStrapConnection$1", m100430f = "StrapDisconnectMonitor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f48486w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13680b.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f48486w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1 = C13680b.this.strapDisconnectedFlow;
                this.f48486w = 1;
                if (AbstractC13091v.m36603m(interfaceC13087t1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ev0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.connectivityanalytics.strap.status.StrapDisconnectMonitor$strapDisconnectedFlow$1", m100430f = "StrapDisconnectMonitor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lev0/a;", "currentCount", "Ltd1/e;", "strapStatus", "<anonymous>", "(Lev0/a;Ltd1/e;)Lev0/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f48488w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f48489x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f48490y;

        /* JADX INFO: renamed from: ev0.b$b$a */
        /* JADX INFO: loaded from: classes7.dex */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f48492a;

            static {
                int[] iArr = new int[EnumC33707e.values().length];
                try {
                    iArr[EnumC33707e.CONNECTION_FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC33707e.NONE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC33707e.READY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f48492a = iArr;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C13679a c13679a, EnumC33707e enumC33707e, InterfaceC30057d<? super C13679a> interfaceC30057d) {
            b bVar = C13680b.this.new b(interfaceC30057d);
            bVar.f48489x = c13679a;
            bVar.f48490y = enumC33707e;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13679a c13679a = (C13679a) this.f48489x;
            EnumC33707e enumC33707e = (EnumC33707e) this.f48490y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f48488w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            int i13 = a.f48492a[enumC33707e.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return AbstractC13681c.m38599c(AbstractC13681c.m38597a(AbstractC13681c.m38598b(c13679a, C13680b.this.dateTimeProvider.mo133363b())), enumC33707e);
            }
            return i13 != 3 ? AbstractC13681c.m38599c(c13679a, enumC33707e) : AbstractC13681c.m38599c(AbstractC13681c.m38600d(c13679a, C13680b.this.m38591g(c13679a)), enumC33707e);
        }
    }

    public C13680b(InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, InterfaceC33704b whoopStrapProxy, InterfaceC41070a dateTimeProvider) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(dateTimeProvider, "dateTimeProvider");
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        this.dateTimeProvider = dateTimeProvider;
        this.strapDisconnectedFlow = AbstractC13091v.m36586L(new C13060l1(new C13679a(0, 0L, 0L, null, 15, null), AbstractC13091v.m36610t(whoopStrapProxy.mo106503r()), new b(null)), coroutineScope, C13105z1.m36630a(3, 0L), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final long m38591g(C13679a currentState) {
        long lastDisconnectMillis = currentState.getLastDisconnectMillis();
        return currentState.getDurationStrapDisconnectedMillis() + (lastDisconnectMillis != 0 ? this.dateTimeProvider.mo133363b() - lastDisconnectMillis : 0L);
    }

    /* JADX INFO: renamed from: d */
    public final void m38592d() {
        InterfaceC3027k1 interfaceC3027k1 = this.monitorStrapStatusJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.monitorStrapStatusJob = null;
    }

    /* JADX INFO: renamed from: e */
    public final long m38593e() {
        C13679a c13679a = (C13679a) AbstractC25265s.m74100H0(this.strapDisconnectedFlow.getReplayCache());
        if (c13679a != null && (c13679a.getLastStrapState() == EnumC33707e.NONE || c13679a.getLastStrapState() == EnumC33707e.CONNECTION_FAILED)) {
            long lastDisconnectMillis = c13679a.getLastDisconnectMillis();
            return (this.dateTimeProvider.mo133363b() - lastDisconnectMillis) + c13679a.getDurationStrapDisconnectedMillis();
        }
        C13679a c13679a2 = (C13679a) AbstractC25265s.m74100H0(this.strapDisconnectedFlow.getReplayCache());
        if (c13679a2 != null) {
            return c13679a2.getDurationStrapDisconnectedMillis();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: f */
    public final int m38594f() {
        C13679a c13679a = (C13679a) AbstractC25265s.m74100H0(this.strapDisconnectedFlow.getReplayCache());
        if (c13679a != null) {
            return c13679a.getCountOfDisconnects();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final void m38595h() {
        InterfaceC3027k1 interfaceC3027k1 = this.monitorStrapStatusJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.monitorStrapStatusJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(null), 3);
    }
}
