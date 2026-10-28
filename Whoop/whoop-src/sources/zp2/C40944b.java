package zp2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.user.journey.model.TimeCapsuleRequest;
import com.whoop.user.journey.sources.data.UserJourneyApi;
import hq2.C17570a;
import l83.C23454a0;
import mr2.C25924a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: zp2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lzp2/b;", "", "Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "userJourneyApi", "Lhq2/a;", "dataStoreHandler", "Lmr2/a;", "syncScheduler", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Lhq2/a;Lmr2/a;Ltr2/n;)V", "", "year", "", "text", "", "b", "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "Lhq2/a;", "Lmr2/a;", "d", "Ltr2/n;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40944b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyApi userJourneyApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17570a dataStoreHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C25924a syncScheduler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: zp2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.TimeCapsuleRepository", m100430f = "TimeCapsuleRepository.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 26, 37}, m100432m = "saveTimeCapsule", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f176648E;

        /* JADX INFO: renamed from: G */
        int f176650G;

        /* JADX INFO: renamed from: w */
        int f176651w;

        /* JADX INFO: renamed from: x */
        int f176652x;

        /* JADX INFO: renamed from: y */
        Object f176653y;

        /* JADX INFO: renamed from: z */
        Object f176654z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176648E = obj;
            this.f176650G |= Integer.MIN_VALUE;
            return C40944b.this.m132861b(0, null, this);
        }
    }

    /* JADX INFO: renamed from: zp2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.TimeCapsuleRepository$saveTimeCapsule$response$1", m100430f = "TimeCapsuleRepository.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176655w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f176657y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f176658z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i13, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f176657y = i13;
            this.f176658z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40944b.this.new b(this.f176657y, this.f176658z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176655w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            UserJourneyApi userJourneyApi = C40944b.this.userJourneyApi;
            int i14 = this.f176657y;
            TimeCapsuleRequest timeCapsuleRequest = new TimeCapsuleRequest(this.f176658z);
            this.f176655w = 1;
            Object objSaveTimeCapsule = userJourneyApi.saveTimeCapsule(i14, timeCapsuleRequest, this);
            return objSaveTimeCapsule == enumC31071a ? enumC31071a : objSaveTimeCapsule;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: zp2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.TimeCapsuleRepository", m100430f = "TimeCapsuleRepository.kt", m100431l = {60, 61, 67, 79}, m100432m = "syncTimeCapsule", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f176660F;

        /* JADX INFO: renamed from: w */
        Object f176661w;

        /* JADX INFO: renamed from: x */
        Object f176662x;

        /* JADX INFO: renamed from: y */
        Object f176663y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f176664z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176664z = obj;
            this.f176660F |= Integer.MIN_VALUE;
            return C40944b.this.m132862c(this);
        }
    }

    /* JADX INFO: renamed from: zp2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.TimeCapsuleRepository$syncTimeCapsule$response$1", m100430f = "TimeCapsuleRepository.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f176665w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Integer f176667y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f176668z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Integer num, String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f176667y = num;
            this.f176668z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C40944b.this.new d(this.f176667y, this.f176668z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176665w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            UserJourneyApi userJourneyApi = C40944b.this.userJourneyApi;
            int iIntValue = this.f176667y.intValue();
            TimeCapsuleRequest timeCapsuleRequest = new TimeCapsuleRequest(this.f176668z);
            this.f176665w = 1;
            Object objSaveTimeCapsule = userJourneyApi.saveTimeCapsule(iIntValue, timeCapsuleRequest, this);
            return objSaveTimeCapsule == enumC31071a ? enumC31071a : objSaveTimeCapsule;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C40944b(UserJourneyApi userJourneyApi, C17570a dataStoreHandler, C25924a syncScheduler, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userJourneyApi, "userJourneyApi");
        AbstractC22676k.m65750j(dataStoreHandler, "dataStoreHandler");
        AbstractC22676k.m65750j(syncScheduler, "syncScheduler");
        AbstractC22676k.m65750j(logger, "logger");
        this.userJourneyApi = userJourneyApi;
        this.dataStoreHandler = dataStoreHandler;
        this.syncScheduler = syncScheduler;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ba A[PHI: r0 r2 r3
      0x00ba: PHI (r0v12 java.lang.Object) = (r0v9 java.lang.Object), (r0v1 java.lang.Object) binds: [B:39:0x00b7, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r2v6 int) = (r2v4 int), (r2v12 int) binds: [B:39:0x00b7, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r3v6 int) = (r3v4 int), (r3v14 int) binds: [B:39:0x00b7, B:21:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2 A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #3 {Exception -> 0x0042, blocks: (B:15:0x003d, B:47:0x00d5, B:44:0x00c2), top: B:68:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r0.m50019f(r2, r3, r10) == r4) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (r0.m50016c(r10) == r4) goto L46;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m132861b(int r17, java.lang.String r18, q83.InterfaceC30057d<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp2.C40944b.m132861b(int, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1 A[Catch: Exception -> 0x0043, PHI: r15
      0x00b1: PHI (r15v14 java.lang.Object) = (r15v13 java.lang.Object), (r15v1 java.lang.Object) binds: [B:43:0x00ae, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:50:0x00c8, B:23:0x0057, B:45:0x00b1, B:47:0x00b7, B:51:0x00d2, B:53:0x00d6, B:55:0x00f2, B:56:0x00f7, B:26:0x005f, B:36:0x0085, B:38:0x0089, B:42:0x0092, B:57:0x00f8, B:27:0x0063, B:33:0x0075, B:30:0x006a), top: B:62:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:50:0x00c8, B:23:0x0057, B:45:0x00b1, B:47:0x00b7, B:51:0x00d2, B:53:0x00d6, B:55:0x00f2, B:56:0x00f7, B:26:0x005f, B:36:0x0085, B:38:0x0089, B:42:0x0092, B:57:0x00f8, B:27:0x0063, B:33:0x0075, B:30:0x006a), top: B:62:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:50:0x00c8, B:23:0x0057, B:45:0x00b1, B:47:0x00b7, B:51:0x00d2, B:53:0x00d6, B:55:0x00f2, B:56:0x00f7, B:26:0x005f, B:36:0x0085, B:38:0x0089, B:42:0x0092, B:57:0x00f8, B:27:0x0063, B:33:0x0075, B:30:0x006a), top: B:62:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:50:0x00c8, B:23:0x0057, B:45:0x00b1, B:47:0x00b7, B:51:0x00d2, B:53:0x00d6, B:55:0x00f2, B:56:0x00f7, B:26:0x005f, B:36:0x0085, B:38:0x0089, B:42:0x0092, B:57:0x00f8, B:27:0x0063, B:33:0x0075, B:30:0x006a), top: B:62:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f2 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:16:0x003e, B:50:0x00c8, B:23:0x0057, B:45:0x00b1, B:47:0x00b7, B:51:0x00d2, B:53:0x00d6, B:55:0x00f2, B:56:0x00f7, B:26:0x005f, B:36:0x0085, B:38:0x0089, B:42:0x0092, B:57:0x00f8, B:27:0x0063, B:33:0x0075, B:30:0x006a), top: B:62:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        if (r15.m50016c(r7) == r1) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00d6, please report this as an issue */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m132862c(q83.InterfaceC30057d<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp2.C40944b.m132862c(q83.d):java.lang.Object");
    }
}
