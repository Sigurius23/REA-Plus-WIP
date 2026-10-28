package od1;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import com.whoop.service.network.CycleMetadataApi;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import in2.InterfaceC18732d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: od1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lod1/c;", "", "Lcom/whoop/service/network/CycleMetadataApi;", "cycleMetadataApi", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/CycleMetadataApi;Lin2/d;Ltr2/n;)V", "a", "Lcom/whoop/service/network/CycleMetadataApi;", "b", "Lin2/d;", "c", "Ltr2/n;", "Lec3/l;", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "d", "Lec3/l;", "()Lec3/l;", "cycleDataFlow", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27840c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CycleMetadataApi cycleMetadataApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13058l cycleDataFlow;

    /* JADX INFO: renamed from: od1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.CurrentCycleInteractor$cycleDataFlow$1", m100430f = "CurrentCycleInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f112140w;

        /* JADX INFO: renamed from: x */
        int f112141x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f112142y;

        /* JADX INFO: renamed from: od1.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.domain.CurrentCycleInteractor$cycleDataFlow$1$response$1", m100430f = "CurrentCycleInteractor.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42118a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f112144w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27840c f112145x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42118a(C27840c c27840c, InterfaceC30057d<? super C42118a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f112145x = c27840c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42118a(this.f112145x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CycleMetadataResponseDto> interfaceC30057d) {
                return ((C42118a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f112144w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                CycleMetadataApi cycleMetadataApi = this.f112145x.cycleMetadataApi;
                this.f112144w = 1;
                Object objM24487a = CycleMetadataApi.m24487a(cycleMetadataApi, null, this, 1, null);
                return objM24487a == enumC31071a ? enumC31071a : objM24487a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C27840c.this.new a(interfaceC30057d);
            aVar.f112142y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f112142y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f112141x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L27
                if (r2 == r4) goto L21
                if (r2 != r3) goto L19
                java.lang.Object r0 = r7.f112140w
                com.whoop.data.remote.domain.dto.CycleMetadataResponseDto r0 = (com.whoop.data.remote.domain.dto.CycleMetadataResponseDto) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L65
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                p505ts.AbstractC34132o.m107864I(r8)     // Catch: java.lang.Exception -> L25
                goto L46
            L25:
                r8 = move-exception
                goto L49
            L27:
                p505ts.AbstractC34132o.m107864I(r8)
                od1.c r8 = od1.C27840c.this     // Catch: java.lang.Exception -> L25
                in2.d r8 = od1.C27840c.m83931b(r8)     // Catch: java.lang.Exception -> L25
                q83.j r8 = r8.mo54465b()     // Catch: java.lang.Exception -> L25
                od1.c$a$a r2 = new od1.c$a$a     // Catch: java.lang.Exception -> L25
                od1.c r6 = od1.C27840c.this     // Catch: java.lang.Exception -> L25
                r2.<init>(r6, r5)     // Catch: java.lang.Exception -> L25
                r7.f112142y = r0     // Catch: java.lang.Exception -> L25
                r7.f112141x = r4     // Catch: java.lang.Exception -> L25
                java.lang.Object r8 = bc3.AbstractC3006f0.m8705K(r8, r2, r7)     // Catch: java.lang.Exception -> L25
                if (r8 != r1) goto L46
                goto L64
            L46:
                com.whoop.data.remote.domain.dto.CycleMetadataResponseDto r8 = (com.whoop.data.remote.domain.dto.CycleMetadataResponseDto) r8     // Catch: java.lang.Exception -> L25
                goto L58
            L49:
                od1.c r2 = od1.C27840c.this
                tr2.n r2 = od1.C27840c.m83932c(r2)
                r4 = 0
                qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
                java.lang.String r6 = "Failed to fetch cycle data"
                r2.mo85230v(r6, r8, r4)
                r8 = r5
            L58:
                r7.f112142y = r5
                r7.f112140w = r5
                r7.f112141x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L65
            L64:
                return r1
            L65:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: od1.C27840c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C27840c(CycleMetadataApi cycleMetadataApi, InterfaceC18732d dispatcherFactory, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cycleMetadataApi, "cycleMetadataApi");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(logger, "logger");
        this.cycleMetadataApi = cycleMetadataApi;
        this.dispatcherFactory = dispatcherFactory;
        this.logger = logger;
        this.cycleDataFlow = new C13084s1(new a(null));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13058l getCycleDataFlow() {
        return this.cycleDataFlow;
    }

    public /* synthetic */ C27840c(CycleMetadataApi cycleMetadataApi, InterfaceC18732d interfaceC18732d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cycleMetadataApi, interfaceC18732d, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CurrentCycleInteractor") : interfaceC34116n);
    }
}
