package qj0;

import c93.InterfaceC4351m;
import java.time.Clock;
import java.util.Map;
import java.util.UUID;
import kt0.InterfaceC22824b;
import l83.C23454a0;
import m83.AbstractC25265s;
import mj0.EnumC25613b;
import mj0.InterfaceC25614c;
import nj0.EnumC26747c;
import nj0.InterfaceC26750f;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29124b;
import pj0.InterfaceC29293a;
import pj0.InterfaceC29294b;
import pj0.InterfaceC29296d;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ut0.InterfaceC35230b;

/* JADX INFO: renamed from: qj0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lqj0/a;", "Lqj0/e;", "Lpj0/b;", "transports", "Lut0/b;", "wires", "", "Lnj0/f;", "Lkt0/b;", "handshakes", "Ljava/time/Clock;", "clock", "Ltr2/n;", "logger", "<init>", "(Lpj0/b;Lut0/b;Ljava/util/Map;Ljava/time/Clock;Ltr2/n;)V", "Lqj0/h;", "handle", "Lqj0/d;", "a", "(Lqj0/h;)Lqj0/d;", "Lpj0/b;", "b", "Lut0/b;", "c", "Ljava/util/Map;", "d", "Ljava/time/Clock;", "e", "Ltr2/n;", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30419a implements InterfaceC30423e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC29294b transports;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC35230b wires;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<InterfaceC26750f, InterfaceC22824b> handshakes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: qj0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.BleDeviceSessionFactory$create$1", m100430f = "BleDeviceSessionFactory.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m65681d2 = {"<anonymous>", "", "frame", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124842w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124843x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC29293a f124844y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ UUID f124845z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC29293a interfaceC29293a, UUID uuid, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f124844y = interfaceC29293a;
            this.f124845z = uuid;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f124844y, this.f124845z, interfaceC30057d);
            aVar.f124843x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(byte[] bArr, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((a) create(bArr, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            byte[] bArr = (byte[]) this.f124843x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124842w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC29293a interfaceC29293a = this.f124844y;
                UUID uuid = this.f124845z;
                this.f124843x = null;
                this.f124842w = 1;
                obj = interfaceC29293a.mo88906j(uuid, bArr, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return Boolean.valueOf(obj instanceof InterfaceC29296d.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C30419a(InterfaceC29294b transports, InterfaceC35230b wires, Map<InterfaceC26750f, ? extends InterfaceC22824b> handshakes, Clock clock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(transports, "transports");
        AbstractC22676k.m65750j(wires, "wires");
        AbstractC22676k.m65750j(handshakes, "handshakes");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(logger, "logger");
        this.transports = transports;
        this.wires = wires;
        this.handshakes = handshakes;
        this.clock = clock;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m92986c(AbstractC30426h abstractC30426h, EnumC25613b phase) {
        AbstractC22676k.m65750j(phase, "phase");
        abstractC30426h.m93038h(new InterfaceC25614c.a(phase));
        return C23454a0.f92919a;
    }

    @Override // qj0.InterfaceC30423e
    /* JADX INFO: renamed from: a */
    public InterfaceC30422d mo92987a(AbstractC30426h handle) {
        AbstractC22676k.m65750j(handle, "handle");
        InterfaceC26750f protocol = handle.getProtocol();
        InterfaceC22824b interfaceC22824b = this.handshakes.get(protocol);
        if (interfaceC22824b == null) {
            throw new IllegalArgumentException(("No handshake registered for " + protocol).toString());
        }
        InterfaceC22824b interfaceC22824b2 = interfaceC22824b;
        UUID uuidM79609a = protocol.mo79622d().m79609a(EnumC26747c.CmdToStrap);
        if (uuidM79609a == null) {
            throw new IllegalArgumentException((protocol + " has no CmdToStrap characteristic").toString());
        }
        UUID uuidM79609a2 = protocol.mo79622d().m79609a(EnumC26747c.CmdFromStrap);
        if (uuidM79609a2 == null) {
            throw new IllegalArgumentException((protocol + " has no CmdFromStrap characteristic").toString());
        }
        InterfaceC29293a interfaceC29293aMo88911a = this.transports.mo88911a(handle.getId(), protocol.mo79621c(), AbstractC25265s.m74103I1(protocol.mo79622d().m79610b().values()));
        if (interfaceC29293aMo88911a == null) {
            this.logger.mo85222m(AbstractC11266d.m30461o("No transport for ", handle.getId()), new AbstractC30556a.a[0]);
            return null;
        }
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("WhoopBle-" + handle.getId());
        C30420b c30420b = new C30420b(this.wires.mo93114a(protocol), new a(interfaceC29293aMo88911a, uuidM79609a, null), interfaceC29293aMo88911a.mo88904h(uuidM79609a2), handle.getScope(), interfaceC34116nM107848a);
        c30420b.m93000l();
        return new C30425g(protocol, interfaceC29293aMo88911a, c30420b, interfaceC22824b2, this.clock, new C29124b(handle, 13), interfaceC34116nM107848a);
    }
}
