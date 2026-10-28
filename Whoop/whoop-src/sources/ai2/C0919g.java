package ai2;

import bi2.AbstractC3289e;
import bi2.C3290f;
import bi2.InterfaceC3288d;
import hk0.AbstractC17369d;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import oh2.C27938a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ai2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006#"}, m65681d2 = {"Lai2/g;", "Lai2/h;", "Lbi2/d;", "dataStore", "Ltr2/n;", "logger", "<init>", "(Lbi2/d;Ltr2/n;)V", "Loh2/a;", "acquisitionInfo", "Ll83/a0;", "b", "(Loh2/a;)V", "Llt0/m;", "receivedPacket", "Llt0/f;", "dataPacket", "c", "(Llt0/m;Llt0/f;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "reset", "()V", "Lbi2/d;", "Ltr2/n;", "Lbi2/f;", "Lbi2/f;", "batch", "", "Llt0/g;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "supportedFormatRevisions", "strap-history-sync_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0919g implements InterfaceC0920h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC3288d dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private C3290f batch;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC24730g> supportedFormatRevisions;

    /* JADX INFO: renamed from: ai2.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.straphistorysync.sink.collectors.MetricsCollector", m100430f = "MetricsCollector.kt", m100431l = {94}, m100432m = "flush", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f3374w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f3375x;

        /* JADX INFO: renamed from: z */
        int f3377z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f3375x = obj;
            this.f3377z |= Integer.MIN_VALUE;
            return C0919g.this.mo2258a(this);
        }
    }

    public C0919g(InterfaceC3288d dataStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.logger = logger;
        this.supportedFormatRevisions = AbstractC3289e.m9573a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: a */
    public Object mo2258a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        C3290f c3290f;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f3377z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f3377z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f3375x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f3377z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C3290f c3290f2 = this.batch;
                if (c3290f2 == null) {
                    throw new IllegalStateException("flush() called before startBurst()");
                }
                if (c3290f2.getCount() == 0) {
                    this.logger.mo85228t("No metrics packets to flush", new AbstractC30556a.a[0]);
                    return Boolean.TRUE;
                }
                InterfaceC3288d interfaceC3288d = this.dataStore;
                Map<Long, C23465k> mapM9578e = c3290f2.m9578e();
                C27938a acquisitionInfo = c3290f2.getAcquisitionInfo();
                aVar.f3374w = c3290f2;
                aVar.f3377z = 1;
                Object objMo9571d = interfaceC3288d.mo9571d(mapM9578e, acquisitionInfo, aVar);
                if (objMo9571d == enumC31071a) {
                    return enumC31071a;
                }
                c3290f = c3290f2;
                obj = objMo9571d;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3290f = (C3290f) aVar.f3374w;
                AbstractC34132o.m107864I(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                this.logger.mo85216g("Flushed " + c3290f, new AbstractC30556a.a[0]);
            } else {
                this.logger.mo85222m("Failed to flush metrics packets", new AbstractC30556a.a[0]);
            }
            z4 = zBooleanValue;
        } catch (Exception e5) {
            this.logger.mo85230v("Exception flushing metrics packets", e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: b */
    public void mo2259b(C27938a acquisitionInfo) {
        AbstractC22676k.m65750j(acquisitionInfo, "acquisitionInfo");
        reset();
        this.batch = new C3290f(acquisitionInfo);
    }

    @Override // ai2.InterfaceC0920h
    /* JADX INFO: renamed from: c */
    public void mo2260c(C24736m receivedPacket, InterfaceC24729f dataPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        AbstractC22676k.m65750j(dataPacket, "dataPacket");
        C3290f c3290f = this.batch;
        if (c3290f == null) {
            throw new IllegalStateException("collect() called before startBurst()");
        }
        InterfaceC24730g interfaceC24730gMo49181g = dataPacket.mo49181g();
        if (interfaceC24730gMo49181g instanceof InterfaceC24730g.b) {
            C24725b c24725bM2268a = AbstractC0921i.m2268a(dataPacket);
            c3290f.m9574a(receivedPacket, c24725bM2268a.m72396Y().m41583j(), c24725bM2268a.mo33457Q(), c24725bM2268a.m72391T() != 0, c24725bM2268a.mo49181g());
        } else {
            if (!(interfaceC24730gMo49181g instanceof InterfaceC24730g.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC17369d abstractC17369dM2269b = AbstractC0921i.m2269b(dataPacket);
            c3290f.m9574a(receivedPacket, abstractC17369dM2269b.m49180X().m41583j(), abstractC17369dM2269b.m49179W(), true, abstractC17369dM2269b.mo49181g());
        }
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

    public /* synthetic */ C0919g(InterfaceC3288d interfaceC3288d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3288d, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MetricsCollector") : interfaceC34116n);
    }
}
