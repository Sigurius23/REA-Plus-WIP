package ai2;

import hu1.C17646c;
import hu1.C17652i;
import java.util.Set;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import mt0.C25937g;
import oh2.C27938a;
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

/* JADX INFO: renamed from: ai2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, m65681d2 = {"Lai2/d;", "Lai2/h;", "Lhu1/i;", "labradorPacketsDbManager", "Ltr2/n;", "logger", "<init>", "(Lhu1/i;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Lhu1/i;", "Ltr2/n;", "Lhu1/c;", "Lhu1/c;", "batch", "", "Llt0/g;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0916d implements InterfaceC0920h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17652i labradorPacketsDbManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C17646c batch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC24730g> supportedFormatRevisions;

    /* JADX INFO: renamed from: ai2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.EcgCollector", m100430f = "EcgCollector.kt", m100431l = {53}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f3363w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f3364x;

        /* JADX INFO: renamed from: z */
        int f3366z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3364x = obj;
            this.f3366z |= Integer.MIN_VALUE;
            return C0916d.this.mo2258a(this);
        }
    }

    public C0916d(C17652i labradorPacketsDbManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(labradorPacketsDbManager, "labradorPacketsDbManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.labradorPacketsDbManager = labradorPacketsDbManager;
        this.logger = logger;
        this.supportedFormatRevisions = InterfaceC24730g.INSTANCE.m72408a(16);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: a */
    public Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        a aVar;
        C17646c c17646c;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f3366z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f3366z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f3364x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f3366z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C17646c c17646c2 = this.batch;
                if (c17646c2 == null) {
                    throw new IllegalStateException("flush() called before startBurst()");
                }
                if (c17646c2.m50277c().isEmpty()) {
                    this.logger.mo85228t("No ECG packets to flush", new AbstractC30556a.a[0]);
                    return Boolean.TRUE;
                }
                C17652i c17652i = this.labradorPacketsDbManager;
                aVar.f3363w = c17646c2;
                aVar.f3366z = 1;
                Object objM50294c = c17652i.m50294c(c17646c2, aVar);
                if (objM50294c == enumC31071a) {
                    return enumC31071a;
                }
                c17646c = c17646c2;
                obj = objM50294c;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c17646c = (C17646c) aVar.f3363w;
                AbstractC34132o.m107864I(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                this.logger.mo85228t("Flushed " + c17646c.m50277c().size() + " ECG packets", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to flush ECG packets", new AbstractC30556a.a[0]);
            }
            z4 = zBooleanValue;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception flushing ECG packets", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: b */
    public void mo2259b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.batch = new C17646c(acquisitionInfo);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: c */
    public void mo2260c(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        C17646c c17646c = this.batch;
        if (c17646c == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        c17646c.m50275a((C25937g) dataPacket);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: d */
    public Set<InterfaceC24730g> mo2261d() {
        return this.supportedFormatRevisions;
    }

    @Override // ai2.InterfaceC0920h
    public void reset() {
        this.batch = null;
    }

    public /* synthetic */ C0916d(C17652i c17652i, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17652i, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EcgCollector") : interfaceC34116n);
    }
}
