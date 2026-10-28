package ol1;

import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.request.UserCreatedWorkoutDto;
import com.whoop.data.remote.domain.request.UserState;
import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.service.network.ActivitiesApi;
import dt0.InterfaceC12362e;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import il1.AbstractC18649z;
import l83.C23454a0;
import od1.InterfaceC27844g;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import us0.C35210f;
import wm0.C37378a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ol1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001!B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, m65681d2 = {"Lol1/b;", "Lod1/g;", "Lil1/z;", "Lol1/a;", "Lwm0/a;", "scopeCoordinator", "Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Lzr2/a;", "dateAndTimeProvider", "Lus0/f;", "historySyncAnalytics", "Ldt0/e;", "processNowApi", "<init>", "(Lwm0/a;Lcom/whoop/service/network/ActivitiesApi;Lzr2/a;Lus0/f;Ldt0/e;)V", "", "m", "(Lq83/d;)Ljava/lang/Object;", "Lil1/z$a;", "action", "l", "(Lil1/z$a;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "j", "Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;", "k", "(Lil1/z$a;)Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lwm0/a;", "b", "Lcom/whoop/service/network/ActivitiesApi;", "c", "Lzr2/a;", "d", "Lus0/f;", "e", "Ldt0/e;", "Ltr2/n;", "f", "Ltr2/n;", "logger", "g", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28016b implements InterfaceC27844g<AbstractC18649z, AbstractC28015a> {

    /* JADX INFO: renamed from: h */
    public static final int f112989h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivitiesApi activitiesApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C35210f historySyncAnalytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC12362e processNowApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ol1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ProcessNowInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f112996w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f112997x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112998y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28016b f112999z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C28016b c28016b) {
            super(3, interfaceC30057d);
            this.f112999z = c28016b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18649z abstractC18649z, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f112999z);
            bVar.f112997x = interfaceC13062m;
            bVar.f112998y = abstractC18649z;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f112996w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f112997x;
                AbstractC18649z abstractC18649z = (AbstractC18649z) this.f112998y;
                if (AbstractC22676k.m65745e(abstractC18649z, AbstractC18649z.b.f73185a)) {
                    c13084s1 = new C13084s1(new c(null));
                } else if (AbstractC22676k.m65745e(abstractC18649z, AbstractC18649z.c.f73186a)) {
                    c13084s1 = new C13084s1(this.f112999z.new d(null));
                } else {
                    if (!(abstractC18649z instanceof AbstractC18649z.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f112999z.new e(abstractC18649z, null));
                }
                this.f112997x = null;
                this.f112998y = null;
                this.f112996w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC18649z) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ol1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$1$1", m100430f = "ProcessNowInteractor.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lol1/c$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113000w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113001x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f113001x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f113001x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113000w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC28017c.b bVar = AbstractC28017c.b.f113027a;
                this.f113001x = null;
                this.f113000w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ol1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$1$2", m100430f = "ProcessNowInteractor.kt", m100431l = {54, 55, 56, 62, 63, 64, 66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lol1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113002w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113003x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C28016b.this.new d(interfaceC30057d);
            dVar.f113003x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0059 A[PHI: r9
          0x0059: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v0 java.lang.Object) binds: [B:16:0x0055, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0061  */
        /* JADX WARN: Code duplicated, block: B:23:0x0080  */
        /* JADX WARN: Code duplicated, block: B:26:0x008e  */
        /* JADX WARN: Code duplicated, block: B:29:0x009c  */
        /* JADX WARN: Code duplicated, block: B:32:0x00af  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ol1.C28016b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ol1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$1$3", m100430f = "ProcessNowInteractor.kt", m100431l = {79, 80, 81, 87, 88, 89, 91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lol1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113005w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f113006x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC18649z f113008z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC18649z abstractC18649z, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113008z = abstractC18649z;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C28016b.this.new e(this.f113008z, interfaceC30057d);
            eVar.f113006x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005e A[PHI: r9
          0x005e: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v0 java.lang.Object) binds: [B:16:0x005a, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x0066  */
        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        /* JADX WARN: Code duplicated, block: B:26:0x0093  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ol1.C28016b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ol1.b$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$interact$2", m100430f = "ProcessNowInteractor.kt", m100431l = {108, 117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lol1/a;", "<unused var>", "Lol1/c;", "action", "<anonymous>", "(Lol1/a;Lol1/c;)Lol1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113009w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113010x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC28015a abstractC28015a, AbstractC28017c abstractC28017c, InterfaceC30057d<? super AbstractC28015a> interfaceC30057d) {
            f fVar = C28016b.this.new f(interfaceC30057d);
            fVar.f113010x = abstractC28017c;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        
            if (wm0.C37378a.m119655c(r6, null, r5, 1, null) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        
            if (wm0.C37378a.m119655c(r6, null, r5, 1, null) == r1) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f113010x
                ol1.c r0 = (ol1.AbstractC28017c) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f113009w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L79
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L51
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                boolean r6 = r0 instanceof ol1.AbstractC28017c.a
                r2 = 0
                if (r6 == 0) goto L54
                ol1.b r6 = ol1.C28016b.this
                dt0.e r6 = ol1.C28016b.m84496f(r6)
                ol1.c$a r0 = (ol1.AbstractC28017c.a) r0
                com.whoop.connectivityCore.dataSyncService.models.ProcessNowSource r0 = r0.getSource()
                r6.mo34626a(r0)
                ol1.b r6 = ol1.C28016b.this
                us0.f r6 = ol1.C28016b.m84495e(r6)
                r6.m111554c()
                ol1.b r6 = ol1.C28016b.this
                wm0.a r6 = ol1.C28016b.m84497g(r6)
                r5.f113010x = r2
                r5.f113009w = r4
                java.lang.Object r6 = wm0.C37378a.m119655c(r6, r2, r5, r4, r2)
                if (r6 != r1) goto L51
                goto L78
            L51:
                ol1.a$b r6 = ol1.AbstractC28015a.b.f112982a
                return r6
            L54:
                boolean r6 = r0 instanceof ol1.AbstractC28017c.c
                if (r6 == 0) goto L64
                ol1.a$c r6 = new ol1.a$c
                ol1.c$c r0 = (ol1.AbstractC28017c.c) r0
                com.whoop.design.util.TextResource r0 = r0.getProcessingText()
                r6.<init>(r0)
                return r6
            L64:
                boolean r6 = r0 instanceof ol1.AbstractC28017c.e
                if (r6 == 0) goto L89
                ol1.b r6 = ol1.C28016b.this
                wm0.a r6 = ol1.C28016b.m84497g(r6)
                r5.f113010x = r0
                r5.f113009w = r3
                java.lang.Object r6 = wm0.C37378a.m119655c(r6, r2, r5, r4, r2)
                if (r6 != r1) goto L79
            L78:
                return r1
            L79:
                ol1.a$d r6 = new ol1.a$d
                ol1.c$e r0 = (ol1.AbstractC28017c.e) r0
                com.whoop.design.util.TextResource r1 = r0.getTitle()
                com.whoop.design.util.TextResource r0 = r0.getDescription()
                r6.<init>(r1, r0)
                return r6
            L89:
                boolean r6 = r0 instanceof ol1.AbstractC28017c.d
                if (r6 == 0) goto La1
                ol1.a$a r6 = new ol1.a$a
                ol1.c$d r0 = (ol1.AbstractC28017c.d) r0
                com.whoop.design.util.TextResource r1 = r0.getTitle()
                com.whoop.design.util.TextResource r2 = r0.getDescription()
                com.whoop.design.util.TextResource r0 = r0.getCtaText()
                r6.<init>(r1, r2, r0)
                return r6
            La1:
                ol1.c$b r6 = ol1.AbstractC28017c.b.f113027a
                boolean r6 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r6)
                if (r6 == 0) goto Lac
                ol1.a$b r6 = ol1.AbstractC28015a.b.f112982a
                return r6
            Lac:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ol1.C28016b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ol1.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor", m100430f = "ProcessNowInteractor.kt", m100431l = {142}, m100432m = "isPostUserCreatedWorkoutSuccessful", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f113012w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113013x;

        /* JADX INFO: renamed from: z */
        int f113015z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113013x = obj;
            this.f113015z |= Integer.MIN_VALUE;
            return C28016b.this.m84502l(null, this);
        }
    }

    /* JADX INFO: renamed from: ol1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$isPostUserCreatedWorkoutSuccessful$response$1", m100430f = "ProcessNowInteractor.kt", m100431l = {143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113016w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC18649z.a f113018y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC18649z.a aVar, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f113018y = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28016b.this.new h(this.f113018y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113016w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C28016b c28016b = C28016b.this;
            AbstractC18649z.a aVar = this.f113018y;
            this.f113016w = 1;
            Object objM84500j = c28016b.m84500j(aVar, this);
            return objM84500j == enumC31071a ? enumC31071a : objM84500j;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ol1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor", m100430f = "ProcessNowInteractor.kt", m100431l = {135}, m100432m = "isSetUserStateSuccessful", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f113019w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113020x;

        /* JADX INFO: renamed from: z */
        int f113022z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113020x = obj;
            this.f113022z |= Integer.MIN_VALUE;
            return C28016b.this.m84503m(this);
        }
    }

    /* JADX INFO: renamed from: ol1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.forcesync.ProcessNowInteractor$isSetUserStateSuccessful$response$1", m100430f = "ProcessNowInteractor.kt", m100431l = {136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113023w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ UserStateRequestBody f113025y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(UserStateRequestBody userStateRequestBody, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f113025y = userStateRequestBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28016b.this.new j(this.f113025y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113023w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivitiesApi activitiesApi = C28016b.this.activitiesApi;
            UserStateRequestBody userStateRequestBody = this.f113025y;
            this.f113023w = 1;
            Object userState = activitiesApi.setUserState(userStateRequestBody, this);
            return userState == enumC31071a ? enumC31071a : userState;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C28016b(C37378a scopeCoordinator, ActivitiesApi activitiesApi, InterfaceC41070a dateAndTimeProvider, C35210f historySyncAnalytics, InterfaceC12362e processNowApi) {
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(activitiesApi, "activitiesApi");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(historySyncAnalytics, "historySyncAnalytics");
        AbstractC22676k.m65750j(processNowApi, "processNowApi");
        this.scopeCoordinator = scopeCoordinator;
        this.activitiesApi = activitiesApi;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.historySyncAnalytics = historySyncAnalytics;
        this.processNowApi = processNowApi;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("ProcessNowInteractor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final Object m84500j(AbstractC18649z.a aVar, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
        return this.activitiesApi.addWorkout(m84501k(aVar), interfaceC30057d);
    }

    /* JADX INFO: renamed from: k */
    private final UserCreatedWorkoutDto m84501k(AbstractC18649z.a action) {
        DateTime dateTimeMo133364c = this.dateAndTimeProvider.mo133364c();
        String startAt = action.getStartAt();
        String string = dateTimeMo133364c.withZone(DateTimeZone.UTC).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return new UserCreatedWorkoutDto(AbstractC2875y.m8300m("[", startAt, ", ", string, ")"), (String) null, action.getGpsEnabled(), 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: l */
    public final Object m84502l(AbstractC18649z.a aVar, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f113015z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f113015z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM108729b = gVar2.f113013x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f113015z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(aVar, null);
            gVar2.f113012w = null;
            gVar2.f113015z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to post workout", hVar, gVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c) && (!(interfaceC34385a instanceof InterfaceC34385a.b.a) || ((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode() != 409)) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: m */
    public final Object m84503m(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f113022z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f113022z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108729b = iVar2.f113020x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f113022z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            UserStateRequestBody userStateRequestBody = new UserStateRequestBody(UserState.Idle);
            this.logger.mo85228t("Checking for setting user state: RequestBody: " + userStateRequestBody, new AbstractC30556a.a[0]);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            j jVar = new j(userStateRequestBody, null);
            iVar2.f113019w = null;
            iVar2.f113022z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "failed to set user state", jVar, iVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return Boolean.valueOf(((InterfaceC34385a) objM108729b) instanceof InterfaceC34385a.c);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC28015a.b.f112982a, AbstractC13091v.m36590P(upstream, new b(null, this)), new f(null));
    }
}
