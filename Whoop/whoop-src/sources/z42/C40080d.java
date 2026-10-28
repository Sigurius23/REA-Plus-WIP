package z42;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import us0.EnumC35206b;
import us0.InterfaceC35205a;
import ys0.InterfaceC39750a;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: z42.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0012\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lz42/d;", "Lys0/a$b;", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "Lq83/j;", "limitedParallelismContext", "Lus0/a;", "backgroundUsageAggregator", "<init>", "(Ltr2/n;Lbc3/c0;Lq83/j;Lus0/a;)V", "", "data", "Ll83/a0;", "a", "([B)V", "Ltr2/n;", "b", "Lbc3/c0;", "c", "Lq83/j;", "d", "Lus0/a;", "Lec3/o1;", "e", "Lec3/o1;", "()Lec3/o1;", "puffinMemfaultResponseFlow", "", "f", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40080d implements InterfaceC39750a.b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j limitedParallelismContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC35205a backgroundUsageAggregator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13072o1 puffinMemfaultResponseFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: z42.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.packets.characteristics.PuffinMemfaultCharacteristicCallback$onCharacteristicNotified$1", m100430f = "PuffinMemfaultCharacteristicCallback.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f172987w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ byte[] f172989y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f172989y = bArr;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40080d.this.new a(this.f172989y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f172987w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 puffinMemfaultResponseFlow = C40080d.this.getPuffinMemfaultResponseFlow();
                byte[] bArr = this.f172989y;
                this.f172987w = 1;
                if (puffinMemfaultResponseFlow.emit(bArr, this) == enumC31071a) {
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

    public C40080d(InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, InterfaceC30063j limitedParallelismContext, InterfaceC35205a backgroundUsageAggregator) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(limitedParallelismContext, "limitedParallelismContext");
        AbstractC22676k.m65750j(backgroundUsageAggregator, "backgroundUsageAggregator");
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        this.limitedParallelismContext = limitedParallelismContext;
        this.backgroundUsageAggregator = backgroundUsageAggregator;
        this.puffinMemfaultResponseFlow = AbstractC13091v.m36592b(100, 0, EnumC11916a.f38983x, 2);
        this.name = "memfaultCharacteristicNotifCallback";
    }

    @Override // ys0.InterfaceC39750a.b
    /* JADX INFO: renamed from: a */
    public void mo106402a(byte[] data) {
        AbstractC22676k.m65750j(data, "data");
        this.backgroundUsageAggregator.mo111546m(EnumC35206b.PUFFIN_PACKET_RECEIVED);
        this.logger.mo85216g(AbstractC11266d.m30461o("memfaultCharacteristicNotifCallback = ", AbstractC40586b.m131618c(data)), new AbstractC30556a.a[0]);
        AbstractC3006f0.m8732z(this.coroutineScope, this.limitedParallelismContext, null, new a(data, null), 2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13072o1 getPuffinMemfaultResponseFlow() {
        return this.puffinMemfaultResponseFlow;
    }

    @Override // ys0.InterfaceC39750a.b
    public String getName() {
        return this.name;
    }

    public C40080d(InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, InterfaceC35205a interfaceC35205a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinMemfaultCharacteristicCallback") : interfaceC34116n, interfaceC2994c0, (i13 & 4) != 0 ? AbstractC3076z.limitedParallelism$default(AbstractC3050q0.f12077a, 1, null, 2, null) : interfaceC30063j, interfaceC35205a);
    }
}
