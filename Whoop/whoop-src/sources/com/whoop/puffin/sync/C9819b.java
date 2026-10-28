package com.whoop.puffin.sync;

import c52.AbstractC4251b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: com.whoop.puffin.sync.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0012\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lcom/whoop/puffin/sync/b;", "Lvk0/j;", "Lec3/p1;", "Lvk0/k;", "serviceFlow", "Lvk0/i;", "iGattService", "Ltr2/n;", "logger", "Lcom/whoop/puffin/sync/c;", "batterySyncHolder", "<init>", "(Lec3/p1;Lec3/p1;Ltr2/n;Lcom/whoop/puffin/sync/c;)V", "gattService", "Lvk0/e;", "x", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "H", "a", "Lec3/p1;", "o", "()Lec3/p1;", "b", "l", "c", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "d", "Lcom/whoop/puffin/sync/c;", "", "e", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "taskName", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9819b implements InterfaceC36084j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9820c batterySyncHolder;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: com.whoop.puffin.sync.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackHistoricalPullTask", m100430f = "BatteryPackHistoricalPullTask.kt", m100431l = {26}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28586E;

        /* JADX INFO: renamed from: w */
        Object f28587w;

        /* JADX INFO: renamed from: x */
        Object f28588x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28589y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28589y = obj;
            this.f28586E |= Integer.MIN_VALUE;
            return C9819b.this.mo23655x(null, this);
        }
    }

    public C9819b(InterfaceC13075p1 serviceFlow, InterfaceC13075p1 iGattService, InterfaceC34116n logger, C9820c batterySyncHolder) {
        AbstractC22676k.m65750j(serviceFlow, "serviceFlow");
        AbstractC22676k.m65750j(iGattService, "iGattService");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(batterySyncHolder, "batterySyncHolder");
        this.serviceFlow = serviceFlow;
        this.iGattService = iGattService;
        this.logger = logger;
        this.batterySyncHolder = batterySyncHolder;
        this.taskName = "PuffinHistoricalPullTask";
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: F, reason: from getter */
    public String getTaskName() {
        return this.taskName;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: H */
    public Object mo23651H(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM23665j = this.batterySyncHolder.m23665j(interfaceC36083i, interfaceC30057d);
        return objM23665j == EnumC31071a.f128113w ? objM23665j : C23454a0.f92919a;
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
            int i13 = aVar.f28586E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f28586E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM23664h = aVar.f28589y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f28586E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM23664h);
            getLogger().mo85228t("beginning puffin hps execution", new AbstractC30556a.a[0]);
            InterfaceC39219a interfaceC39219a = interfaceC36083i instanceof InterfaceC39219a ? (InterfaceC39219a) interfaceC36083i : null;
            if (interfaceC39219a == null) {
                return new InterfaceC36079e.a(new IllegalStateException("Could not cast gattService to Puffin"));
            }
            if (!AbstractC22676k.m65745e(AbstractC25265s.m74100H0(interfaceC39219a.mo124937l().getReplayCache()), AbstractC4251b.f.f17287a)) {
                return new InterfaceC36079e.a(new IllegalStateException("Puffin must be in Ready state to execute HPS"));
            }
            C9820c c9820c = this.batterySyncHolder;
            aVar.f28587w = null;
            aVar.f28588x = null;
            aVar.f28586E = 1;
            objM23664h = c9820c.m23664h(interfaceC39219a, aVar);
            if (objM23664h == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM23664h);
        }
        InterfaceC9823f.b bVar = (InterfaceC9823f.b) objM23664h;
        getLogger().mo85228t("puffin HPS ended with " + bVar, new AbstractC30556a.a[0]);
        return bVar instanceof InterfaceC9823f.b.c ? new InterfaceC36079e.b(null) : new InterfaceC36079e.a(new BatteryPackHpsException(bVar));
    }

    public /* synthetic */ C9819b(InterfaceC13075p1 interfaceC13075p1, InterfaceC13075p1 interfaceC13075p2, InterfaceC34116n interfaceC34116n, C9820c c9820c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a) : interfaceC13075p1, (i13 & 2) != 0 ? AbstractC13091v.m36593c(null) : interfaceC13075p2, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinHistoricalPullTask") : interfaceC34116n, c9820c);
    }
}
