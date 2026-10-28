package jv0;

import androidx.health.platform.client.proto.C1533u;
import at0.C1983a;
import at0.InterfaceC1984b;
import gv0.C16226a;
import hv0.C17670a;
import l83.C23454a0;
import l83.C23468n;
import p000.AbstractC11266d;
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
import yt0.InterfaceC39765d;
import zt0.C41124b;

/* JADX INFO: renamed from: jv0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Ljv0/a;", "Lat0/b;", "Lhv0/a;", "consolePacketDataToDtoMapper", "Lyt0/d;", "consolePacketsDao", "Lgv0/a;", "consolePacketUploader", "Ltr2/n;", "logger", "<init>", "(Lhv0/a;Lyt0/d;Lgv0/a;Ltr2/n;)V", "Lat0/a;", "packetData", "Ll83/a0;", "a", "(Lat0/a;Lq83/d;)Ljava/lang/Object;", "Ll83/n;", "b", "(Lq83/d;)Ljava/lang/Object;", "Lhv0/a;", "getConsolePacketDataToDtoMapper", "()Lhv0/a;", "Lyt0/d;", "getConsolePacketsDao", "()Lyt0/d;", "c", "Lgv0/a;", "d", "Ltr2/n;", "getLogger", "()Ltr2/n;", "console-packets_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21967a implements InterfaceC1984b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17670a consolePacketDataToDtoMapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39765d consolePacketsDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16226a consolePacketUploader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: jv0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.domain.ConsolePacketServiceImpl", m100430f = "ConsolePacketServiceImpl.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "saveConsolePacket", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f85030E;

        /* JADX INFO: renamed from: w */
        Object f85031w;

        /* JADX INFO: renamed from: x */
        Object f85032x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f85033y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f85033y = obj;
            this.f85030E |= Integer.MIN_VALUE;
            return C21967a.this.mo6045a(null, this);
        }
    }

    /* JADX INFO: renamed from: jv0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.consolePackets.domain.ConsolePacketServiceImpl", m100430f = "ConsolePacketServiceImpl.kt", m100431l = {26}, m100432m = "uploadSavedPackets-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f85035w;

        /* JADX INFO: renamed from: y */
        int f85037y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f85035w = obj;
            this.f85037y |= Integer.MIN_VALUE;
            Object objMo6046b = C21967a.this.mo6046b(this);
            return objMo6046b == EnumC31071a.f128113w ? objMo6046b : new C23468n(objMo6046b);
        }
    }

    public C21967a(C17670a consolePacketDataToDtoMapper, InterfaceC39765d consolePacketsDao, C16226a consolePacketUploader, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(consolePacketDataToDtoMapper, "consolePacketDataToDtoMapper");
        AbstractC22676k.m65750j(consolePacketsDao, "consolePacketsDao");
        AbstractC22676k.m65750j(consolePacketUploader, "consolePacketUploader");
        AbstractC22676k.m65750j(logger, "logger");
        this.consolePacketDataToDtoMapper = consolePacketDataToDtoMapper;
        this.consolePacketsDao = consolePacketsDao;
        this.consolePacketUploader = consolePacketUploader;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.InterfaceC1984b
    /* JADX INFO: renamed from: a */
    public Object mo6045a(C1983a c1983a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f85030E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f85030E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f85033y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f85030E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C41124b c41124bM50411a = this.consolePacketDataToDtoMapper.m50411a(c1983a);
                InterfaceC39765d interfaceC39765d = this.consolePacketsDao;
                aVar.f85031w = null;
                aVar.f85032x = null;
                aVar.f85030E = 1;
                if (interfaceC39765d.mo127297f(c41124bM50411a, aVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to save console packets due to ", e5.getMessage()), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // at0.InterfaceC1984b
    /* JADX INFO: renamed from: b */
    public Object mo6046b(InterfaceC30057d<? super C23468n> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f85037y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f85037y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f85035w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f85037y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C16226a c16226a = this.consolePacketUploader;
        bVar.f85037y = 1;
        Object objM45932k = c16226a.m45932k(bVar);
        return objM45932k == enumC31071a ? enumC31071a : objM45932k;
    }

    public /* synthetic */ C21967a(C17670a c17670a, InterfaceC39765d interfaceC39765d, C16226a c16226a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17670a, interfaceC39765d, c16226a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ConsolePacketService") : interfaceC34116n);
    }
}
