package com.whoop.straphistorysync.sync;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0016\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/h;", "Lvk0/j;", "Lec3/p1;", "Lvk0/k;", "serviceFlow", "Lvk0/i;", "iGattService", "", "taskName", "Ltr2/n;", "logger", "Lcom/whoop/straphistorysync/sync/i;", "sensorSyncHolder", "Lkotlin/Function0;", "Ll83/a0;", "onInterrupted", "<init>", "(Lec3/p1;Lec3/p1;Ljava/lang/String;Ltr2/n;Lcom/whoop/straphistorysync/sync/i;Lc93/a;)V", "gattService", "Lvk0/e;", "x", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", "H", "a", "Lec3/p1;", "o", "()Lec3/p1;", "b", "l", "c", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "d", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "e", "Lcom/whoop/straphistorysync/sync/i;", "f", "Lc93/a;", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10280h implements InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C10281i sensorSyncHolder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC4339a onInterrupted;

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorHistoricalPullTask", m100430f = "SensorHistoricalPullTask.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f31119E;

        /* JADX INFO: renamed from: w */
        Object f31120w;

        /* JADX INFO: renamed from: x */
        Object f31121x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31122y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31122y = obj;
            this.f31119E |= Integer.MIN_VALUE;
            return C10280h.this.mo23655x(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.straphistorysync.sync.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sync.SensorHistoricalPullTask", m100430f = "SensorHistoricalPullTask.kt", m100431l = {33}, m100432m = "onCancel", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f31124w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f31125x;

        /* JADX INFO: renamed from: z */
        int f31127z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31125x = obj;
            this.f31127z |= Integer.MIN_VALUE;
            return C10280h.this.mo23651H(null, this);
        }
    }

    public C10280h(InterfaceC13075p1 serviceFlow, InterfaceC13075p1 iGattService, String taskName, InterfaceC34116n logger, C10281i sensorSyncHolder, InterfaceC4339a onInterrupted) {
        AbstractC22676k.m65750j(serviceFlow, "serviceFlow");
        AbstractC22676k.m65750j(iGattService, "iGattService");
        AbstractC22676k.m65750j(taskName, "taskName");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(sensorSyncHolder, "sensorSyncHolder");
        AbstractC22676k.m65750j(onInterrupted, "onInterrupted");
        this.serviceFlow = serviceFlow;
        this.iGattService = iGattService;
        this.taskName = taskName;
        this.logger = logger;
        this.sensorSyncHolder = sensorSyncHolder;
        this.onInterrupted = onInterrupted;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: F, reason: from getter */
    public String getTaskName() {
        return this.taskName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: H */
    public Object mo23651H(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f31127z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f31127z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f31125x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f31127z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C10281i c10281i = this.sensorSyncHolder;
            bVar.f31124w = null;
            bVar.f31127z = 1;
            if (c10281i.m26300k(interfaceC36083i, bVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.onInterrupted.invoke();
        return C23454a0.f92919a;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: h, reason: from getter */
    public InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: l, reason: from getter */
    public InterfaceC13075p1 getIGattService() {
        return this.iGattService;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13075p1 getServiceFlow() {
        return this.serviceFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: x */
    public Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f31119E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f31119E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM26299h = aVar.f31122y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f31119E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM26299h);
            getLogger().mo85216g("beginning sensor hps execution", new AbstractC30556a.a[0]);
            InterfaceC21750d interfaceC21750d = interfaceC36083i instanceof InterfaceC21750d ? (InterfaceC21750d) interfaceC36083i : null;
            if (interfaceC21750d == null) {
                return new InterfaceC36079e.a(new IllegalStateException("Could not cast gattService to IWhoopStrap"));
            }
            C10281i c10281i = this.sensorSyncHolder;
            aVar.f31120w = null;
            aVar.f31121x = null;
            aVar.f31119E = 1;
            objM26299h = c10281i.m26299h(interfaceC21750d, aVar);
            if (objM26299h == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM26299h);
        }
        InterfaceC10278f.b bVar = (InterfaceC10278f.b) objM26299h;
        getLogger().mo85216g("Sensor HPS ended with " + bVar, new AbstractC30556a.a[0]);
        return bVar instanceof InterfaceC10278f.b.d ? new InterfaceC36079e.b(null) : new InterfaceC36079e.a(new SensorHpsException(bVar));
    }
}
