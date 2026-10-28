package x92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import bi2.InterfaceC3288d;
import bu0.C3634a;
import c93.InterfaceC4351m;
import fg1.C14455a;
import fg1.InterfaceC14457c;
import fk2.C14554a;
import gg1.InterfaceC15825a;
import hk0.C17371f;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.HashMap;
import l83.C23454a0;
import mt0.C25932b;
import oh2.C27938a;
import oh2.C27941d;
import org.joda.time.DateTime;
import ot0.C28323a;
import ot0.InterfaceC28324b;
import p167g5.C15483b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: x92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$0#j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020$`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lx92/a;", "Lgg1/a;", "Lbc3/c0;", "Ltr2/n;", "logger", "Lfg1/c;", "firmwareEventsRoomInteractor", "Lbi2/d;", "heartDataStore", "Lin2/d;", "dispatcherFactory", "<init>", "(Ltr2/n;Lfg1/c;Lbi2/d;Lin2/d;)V", "Lot0/b;", "", "f", "(Lot0/b;)Ljava/lang/Integer;", "Loh2/a;", "info", "", "g", "(Loh2/a;)J", "Lfg1/a;", "eventPacketBatch", "Ll83/a0;", "a", "(Lfg1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Lfg1/c;", "y", "Lbi2/d;", "z", "Lin2/d;", "Ljava/util/HashMap;", "Loh2/d;", "Lkotlin/collections/HashMap;", "E", "Ljava/util/HashMap;", "infoToVersionCache", "Lbc3/u;", "F", "Lbc3/u;", "job", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38104a implements InterfaceC15825a, InterfaceC2994c0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final HashMap<C27938a, C27941d> infoToVersionCache;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC14457c firmwareEventsRoomInteractor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC3288d heartDataStore;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: x92.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.statuspackets.FirmwareEventsStoreImpl$store$1", m100430f = "FirmwareEventsStoreImpl.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14455a f163198E;

        /* JADX INFO: renamed from: w */
        Object f163199w;

        /* JADX INFO: renamed from: x */
        long f163200x;

        /* JADX INFO: renamed from: y */
        int f163201y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C14455a c14455a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f163198E = c14455a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38104a.this.new a(this.f163198E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163201y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ArrayList arrayList = new ArrayList();
                long jM122087g = C38104a.this.m122087g(this.f163198E.getAcquisitionInfo());
                if (jM122087g == -1) {
                    C38104a.this.logger.mo85222m("Firmware Events storage got a missing version ID for a packet batch!", new AbstractC30556a.a[0]);
                }
                for (C15483b c15483b : this.f163198E.m41182d()) {
                    InterfaceC28324b interfaceC28324b = (InterfaceC28324b) c15483b.f58138a;
                    C25932b c25932b = (C25932b) c15483b.f58139b;
                    C14554a timestamp = interfaceC28324b.getTimestamp();
                    long jM41580f = timestamp != null ? timestamp.m41580f() : DateTime.now().getMillis();
                    Integer numM122086f = C38104a.this.m122086f(interfaceC28324b);
                    arrayList.add(new C3634a(jM41580f, numM122086f != null ? numM122086f.intValue() : -1, c25932b.m76710f(), (int) jM122087g));
                }
                InterfaceC14457c interfaceC14457c = C38104a.this.firmwareEventsRoomInteractor;
                this.f163199w = null;
                this.f163200x = jM122087g;
                this.f163201y = 1;
                if (interfaceC14457c.mo41190c(arrayList, this) == enumC31071a) {
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

    public C38104a(InterfaceC34116n logger, InterfaceC14457c firmwareEventsRoomInteractor, InterfaceC3288d heartDataStore, InterfaceC18732d dispatcherFactory) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(firmwareEventsRoomInteractor, "firmwareEventsRoomInteractor");
        AbstractC22676k.m65750j(heartDataStore, "heartDataStore");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        this.logger = logger;
        this.firmwareEventsRoomInteractor = firmwareEventsRoomInteractor;
        this.heartDataStore = heartDataStore;
        this.dispatcherFactory = dispatcherFactory;
        this.infoToVersionCache = new HashMap<>();
        this.job = AbstractC3006f0.m8710d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final Integer m122086f(InterfaceC28324b interfaceC28324b) {
        if (interfaceC28324b instanceof C28323a) {
            return ((C28323a) interfaceC28324b).m85786S();
        }
        if (interfaceC28324b instanceof C17371f) {
            return ((C17371f) interfaceC28324b).m49185Y();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final long m122087g(C27938a info) {
        C27941d c27941dM84340i = this.infoToVersionCache.get(info);
        if (c27941dM84340i == null) {
            c27941dM84340i = C27941d.m84340i(info);
            this.infoToVersionCache.put(info, c27941dM84340i);
        }
        InterfaceC3288d interfaceC3288d = this.heartDataStore;
        AbstractC22676k.m65747g(c27941dM84340i);
        return interfaceC3288d.mo9568a(c27941dM84340i);
    }

    @Override // gg1.InterfaceC15825a
    /* JADX INFO: renamed from: a */
    public void mo44662a(C14455a eventPacketBatch) {
        AbstractC22676k.m65750j(eventPacketBatch, "eventPacketBatch");
        if (eventPacketBatch.m41182d().isEmpty()) {
            this.logger.mo85222m("Called store when the strap firmware events packet batch list is empty!", new AbstractC30556a.a[0]);
        } else {
            AbstractC3006f0.m8732z(this, null, null, new a(eventPacketBatch, null), 3);
        }
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.mo54465b().plus(this.job);
    }
}
