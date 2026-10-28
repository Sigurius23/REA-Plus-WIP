package ai2;

import bi2.C3286b;
import h52.C16935a;
import java.util.List;
import java.util.Set;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
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

/* JADX INFO: renamed from: ai2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, m65681d2 = {"Lai2/j;", "Lai2/h;", "Lh52/a;", "pulseInformationDbManager", "Ltr2/n;", "logger", "<init>", "(Lh52/a;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Lh52/a;", "Ltr2/n;", "Lbi2/b;", "Lbi2/b;", "batch", "", "Llt0/g;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0922j implements InterfaceC0920h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16935a pulseInformationDbManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C3286b batch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC24730g> supportedFormatRevisions;

    /* JADX INFO: renamed from: ai2.j$a */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.PipCollector", m100430f = "PipCollector.kt", m100431l = {54}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f3382w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f3383x;

        /* JADX INFO: renamed from: z */
        int f3385z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3383x = obj;
            this.f3385z |= Integer.MIN_VALUE;
            return C0922j.this.mo2258a(this);
        }
    }

    public C0922j(C16935a pulseInformationDbManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(pulseInformationDbManager, "pulseInformationDbManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.pulseInformationDbManager = pulseInformationDbManager;
        this.logger = logger;
        this.supportedFormatRevisions = InterfaceC24730g.INSTANCE.m72408a(25, 26);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: a */
    public Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        C3286b c3286b;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f3385z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f3385z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f3383x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f3385z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C3286b c3286b2 = this.batch;
                if (c3286b2 == null) {
                    throw new IllegalStateException("flush() called before startBurst()");
                }
                if (c3286b2.m9564c().isEmpty()) {
                    this.logger.mo85228t("No PIP packets to flush", new AbstractC30556a.a[0]);
                    return Boolean.TRUE;
                }
                C16935a c16935a = this.pulseInformationDbManager;
                C27938a acquisitionInfo = c3286b2.getAcquisitionInfo();
                List<C24725b> listM9564c = c3286b2.m9564c();
                aVar.f3382w = c3286b2;
                aVar.f3385z = 1;
                Object objM47695a = c16935a.m47695a(acquisitionInfo, listM9564c, aVar);
                if (objM47695a == enumC31071a) {
                    return enumC31071a;
                }
                c3286b = c3286b2;
                obj = objM47695a;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3286b = (C3286b) aVar.f3382w;
                AbstractC34132o.m107864I(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                this.logger.mo85228t("Flushed " + c3286b.m9564c().size() + " PIP packets", new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to flush PIP packets", new AbstractC30556a.a[0]);
            }
            z4 = zBooleanValue;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception flushing PIP packets", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: b */
    public void mo2259b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.batch = new C3286b(acquisitionInfo);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: c */
    public void mo2260c(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        C3286b c3286b = this.batch;
        if (c3286b == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        c3286b.m9562a(AbstractC0921i.m2268a(dataPacket));
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

    public /* synthetic */ C0922j(C16935a c16935a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16935a, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PipCollector") : interfaceC34116n);
    }
}
