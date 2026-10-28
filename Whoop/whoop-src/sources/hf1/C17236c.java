package hf1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.experiments.api.ExperimentsApi;
import com.whoop.experiments.api.ExperimentsAuthApi;
import java.util.Map;
import jf1.C21642a;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: hf1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u001dB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0097@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J0\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lhf1/c;", "Lhf1/b;", "Lcom/whoop/experiments/api/ExperimentsApi;", "experimentsApi", "Lcom/whoop/experiments/api/ExperimentsAuthApi;", "experimentsAuthApi", "Ljf1/a;", "experimentsDataStoreHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/experiments/api/ExperimentsApi;Lcom/whoop/experiments/api/ExperimentsAuthApi;Ljf1/a;Ltr2/n;)V", "Lhf1/a;", "experiment", "", "isAuthenticated", "", "e", "(Lhf1/a;ZLq83/d;)Ljava/lang/Object;", "f", "(Lhf1/a;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "b", "(Lq83/d;)Ljava/lang/Object;", "", "c", "", "cacheTtlSeconds", "shouldBucketUser", "a", "(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/experiments/api/ExperimentsApi;", "Lcom/whoop/experiments/api/ExperimentsAuthApi;", "Ljf1/a;", "d", "Ltr2/n;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17236c implements InterfaceC17235b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ExperimentsApi experimentsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ExperimentsAuthApi experimentsAuthApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21642a experimentsDataStoreHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: hf1.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.ExperimentsRepository", m100430f = "ExperimentsRepository.kt", m100431l = {54}, m100432m = "getCachedVariantFor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f66231w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f66232x;

        /* JADX INFO: renamed from: z */
        int f66234z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66232x = obj;
            this.f66234z |= Integer.MIN_VALUE;
            return C17236c.this.mo48746f(null, this);
        }
    }

    /* JADX INFO: renamed from: hf1.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.ExperimentsRepository", m100430f = "ExperimentsRepository.kt", m100431l = {72, 74, 98}, m100432m = "getVariant", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f66235E;

        /* JADX INFO: renamed from: F */
        boolean f66236F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f66237G;

        /* JADX INFO: renamed from: I */
        int f66239I;

        /* JADX INFO: renamed from: w */
        Object f66240w;

        /* JADX INFO: renamed from: x */
        Object f66241x;

        /* JADX INFO: renamed from: y */
        Object f66242y;

        /* JADX INFO: renamed from: z */
        long f66243z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66237G = obj;
            this.f66239I |= Integer.MIN_VALUE;
            return C17236c.this.mo48742a(null, 0L, false, false, this);
        }
    }

    /* JADX INFO: renamed from: hf1.c$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.ExperimentsRepository$getVariant$response$1", m100430f = "ExperimentsRepository.kt", m100431l = {80, 85}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f66244E;

        /* JADX INFO: renamed from: w */
        int f66245w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f66246x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17236c f66247y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC17234a f66248z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, C17236c c17236c, InterfaceC17234a interfaceC17234a, boolean z13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f66246x = z4;
            this.f66247y = c17236c;
            this.f66248z = interfaceC17234a;
            this.f66244E = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f66246x, this.f66247y, this.f66248z, this.f66244E, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r6 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            if (r6 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f66245w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L56
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3b
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                boolean r6 = r5.f66246x
                if (r6 == 0) goto L3e
                hf1.c r6 = r5.f66247y
                com.whoop.experiments.api.ExperimentsAuthApi r6 = hf1.C17236c.m48748h(r6)
                hf1.a r1 = r5.f66248z
                java.lang.String r1 = r1.getName()
                boolean r2 = r5.f66244E
                r2 = r2 ^ r3
                r5.f66245w = r3
                java.lang.Object r6 = r6.getUserVariantForExperiment(r1, r2, r5)
                if (r6 != r0) goto L3b
                goto L55
            L3b:
                pg3.v0 r6 = (pg3.C29218v0) r6
                return r6
            L3e:
                hf1.c r6 = r5.f66247y
                com.whoop.experiments.api.ExperimentsApi r6 = hf1.C17236c.m48747g(r6)
                hf1.a r1 = r5.f66248z
                java.lang.String r1 = r1.getName()
                boolean r4 = r5.f66244E
                r3 = r3 ^ r4
                r5.f66245w = r2
                java.lang.Object r6 = r6.getVariantForExperiment(r1, r3, r5)
                if (r6 != r0) goto L56
            L55:
                return r0
            L56:
                pg3.v0 r6 = (pg3.C29218v0) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hf1.C17236c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<String>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: hf1.c$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.ExperimentsRepository", m100430f = "ExperimentsRepository.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, 26, 44}, m100432m = "getVariantFor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f66249E;

        /* JADX INFO: renamed from: G */
        int f66251G;

        /* JADX INFO: renamed from: w */
        Object f66252w;

        /* JADX INFO: renamed from: x */
        Object f66253x;

        /* JADX INFO: renamed from: y */
        Object f66254y;

        /* JADX INFO: renamed from: z */
        boolean f66255z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66249E = obj;
            this.f66251G |= Integer.MIN_VALUE;
            return C17236c.this.mo48745e(null, false, this);
        }
    }

    /* JADX INFO: renamed from: hf1.c$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.ExperimentsRepository$getVariantFor$response$1", m100430f = "ExperimentsRepository.kt", m100431l = {32, 34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f66256w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f66257x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17236c f66258y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC17234a f66259z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, C17236c c17236c, InterfaceC17234a interfaceC17234a, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f66257x = z4;
            this.f66258y = c17236c;
            this.f66259z = interfaceC17234a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f66257x, this.f66258y, this.f66259z, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r11 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.f66256w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r11)
                goto L5b
            L10:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L18:
                p505ts.AbstractC34132o.m107864I(r11)
                r4 = r10
                goto L3e
            L1d:
                p505ts.AbstractC34132o.m107864I(r11)
                boolean r11 = r10.f66257x
                if (r11 == 0) goto L41
                hf1.c r11 = r10.f66258y
                com.whoop.experiments.api.ExperimentsAuthApi r4 = hf1.C17236c.m48748h(r11)
                hf1.a r11 = r10.f66259z
                java.lang.String r5 = r11.getName()
                r10.f66256w = r3
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r10
                java.lang.Object r11 = com.whoop.experiments.api.ExperimentsAuthApi.m21413a(r4, r5, r6, r7, r8, r9)
                r4 = r7
                if (r11 != r0) goto L3e
                goto L5a
            L3e:
                pg3.v0 r11 = (pg3.C29218v0) r11
                return r11
            L41:
                r4 = r10
                hf1.c r11 = r4.f66258y
                com.whoop.experiments.api.ExperimentsApi r1 = hf1.C17236c.m48747g(r11)
                hf1.a r11 = r4.f66259z
                java.lang.String r11 = r11.getName()
                r4.f66256w = r2
                r3 = 0
                r5 = 2
                r6 = 0
                r2 = r11
                java.lang.Object r11 = com.whoop.experiments.api.ExperimentsApi.m21412a(r1, r2, r3, r4, r5, r6)
                if (r11 != r0) goto L5b
            L5a:
                return r0
            L5b:
                pg3.v0 r11 = (pg3.C29218v0) r11
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: hf1.C17236c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<String>> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C17236c(ExperimentsApi experimentsApi, ExperimentsAuthApi experimentsAuthApi, C21642a experimentsDataStoreHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(experimentsApi, "experimentsApi");
        AbstractC22676k.m65750j(experimentsAuthApi, "experimentsAuthApi");
        AbstractC22676k.m65750j(experimentsDataStoreHelper, "experimentsDataStoreHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.experimentsApi = experimentsApi;
        this.experimentsAuthApi = experimentsAuthApi;
        this.experimentsDataStoreHelper = experimentsDataStoreHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // hf1.InterfaceC17235b
    /* JADX INFO: renamed from: a */
    public Object mo48742a(InterfaceC17234a interfaceC17234a, long j7, boolean z4, boolean z13, InterfaceC30057d<? super String> interfaceC30057d) throws Exception {
        c cVar;
        InterfaceC17234a interfaceC17234a2;
        boolean z14;
        boolean z15;
        long j13;
        InterfaceC17234a interfaceC17234a3;
        boolean z16;
        boolean z17;
        InterfaceC34385a interfaceC34385a;
        String str;
        long j14 = j7;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f66239I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f66239I = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM60901e = cVar.f66237G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f66239I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM60901e);
            C21642a c21642a = this.experimentsDataStoreHelper;
            String name = interfaceC17234a.getName();
            interfaceC17234a2 = interfaceC17234a;
            cVar.f66240w = interfaceC17234a2;
            cVar.f66243z = j14;
            z14 = z4;
            cVar.f66235E = z14;
            z15 = z13;
            cVar.f66236F = z15;
            cVar.f66239I = 1;
            objM60901e = c21642a.m60901e(name, j14, cVar);
            if (objM60901e != enumC31071a) {
            }
        }
        if (i14 == 1) {
            boolean z18 = cVar.f66236F;
            boolean z19 = cVar.f66235E;
            long j15 = cVar.f66243z;
            InterfaceC17234a interfaceC17234a4 = (InterfaceC17234a) cVar.f66240w;
            AbstractC34132o.m107864I(objM60901e);
            z15 = z18;
            z14 = z19;
            j14 = j15;
            interfaceC17234a2 = interfaceC17234a4;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) cVar.f66242y;
                AbstractC34132o.m107864I(objM60901e);
                return str2;
            }
            z17 = cVar.f66236F;
            z16 = cVar.f66235E;
            j13 = cVar.f66243z;
            interfaceC17234a3 = (InterfaceC17234a) cVar.f66240w;
            AbstractC34132o.m107864I(objM60901e);
        }
        interfaceC34385a = (InterfaceC34385a) objM60901e;
        if ((interfaceC34385a instanceof InterfaceC34385a.c) || (str = (String) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b) == null || str.length() == 0) {
            return "error";
        }
        C21642a c21642a2 = this.experimentsDataStoreHelper;
        String name2 = interfaceC17234a3.getName();
        cVar.f66240w = null;
        cVar.f66241x = null;
        cVar.f66242y = str;
        cVar.f66243z = j13;
        cVar.f66235E = z16;
        cVar.f66236F = z17;
        cVar.f66239I = 3;
        return c21642a2.m60904h(name2, str, cVar) == enumC31071a ? enumC31071a : str;
        String str3 = (String) objM60901e;
        if (str3 != null) {
            return str3;
        }
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        String strM30461o = AbstractC11266d.m30461o("failed to fetch variant for experiment ", interfaceC17234a2.getName());
        d dVar = new d(z14, this, interfaceC17234a2, z15, null);
        cVar.f66240w = interfaceC17234a2;
        cVar.f66243z = j14;
        cVar.f66235E = z14;
        cVar.f66236F = z15;
        cVar.f66239I = 2;
        objM60901e = companion.m108730a(interfaceC34116n, null, strM30461o, dVar, cVar);
        if (objM60901e != enumC31071a) {
            j13 = j14;
            interfaceC17234a3 = interfaceC17234a2;
            z16 = z14;
            z17 = z15;
            interfaceC34385a = (InterfaceC34385a) objM60901e;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
            }
            return "error";
        }
    }

    @Override // hf1.InterfaceC17235b
    /* JADX INFO: renamed from: b */
    public Object mo48743b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM60902f = this.experimentsDataStoreHelper.m60902f(interfaceC30057d);
        return objM60902f == EnumC31071a.f128113w ? objM60902f : C23454a0.f92919a;
    }

    @Override // hf1.InterfaceC17235b
    /* JADX INFO: renamed from: c */
    public Object mo48744c(InterfaceC30057d<? super Map<String, String>> interfaceC30057d) {
        return this.experimentsDataStoreHelper.m60899a(interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // hf1.InterfaceC17235b
    @InterfaceC23457c
    /* JADX INFO: renamed from: e */
    public Object mo48745e(InterfaceC17234a interfaceC17234a, boolean z4, InterfaceC30057d<? super String> interfaceC30057d) throws Exception {
        e eVar;
        InterfaceC17234a interfaceC17234a2;
        boolean z13;
        InterfaceC34385a interfaceC34385a;
        String str;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f66251G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f66251G = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM60900d = eVar2.f66249E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f66251G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM60900d);
            C21642a c21642a = this.experimentsDataStoreHelper;
            String name = interfaceC17234a.getName();
            eVar2.f66252w = interfaceC17234a;
            eVar2.f66255z = z4;
            eVar2.f66251G = 1;
            objM60900d = c21642a.m60900d(name, eVar2);
            if (objM60900d != enumC31071a) {
            }
        }
        if (i14 == 1) {
            z4 = eVar2.f66255z;
            interfaceC17234a = (InterfaceC17234a) eVar2.f66252w;
            AbstractC34132o.m107864I(objM60900d);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = (String) eVar2.f66254y;
                AbstractC34132o.m107864I(objM60900d);
                return str2;
            }
            z13 = eVar2.f66255z;
            interfaceC17234a2 = (InterfaceC17234a) eVar2.f66252w;
            AbstractC34132o.m107864I(objM60900d);
        }
        interfaceC34385a = (InterfaceC34385a) objM60900d;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return interfaceC17234a2.getDefaultVariant();
        }
        str = (String) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
        if (str != null || str.length() == 0) {
            return interfaceC17234a2.getDefaultVariant();
        }
        C21642a c21642a2 = this.experimentsDataStoreHelper;
        String name2 = interfaceC17234a2.getName();
        eVar2.f66252w = null;
        eVar2.f66253x = null;
        eVar2.f66254y = str;
        eVar2.f66255z = z13;
        eVar2.f66251G = 3;
        return c21642a2.m60903g(name2, str, eVar2) == enumC31071a ? enumC31071a : str;
        String str3 = (String) objM60900d;
        if (str3 != null) {
            return str3;
        }
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        String strM30461o = AbstractC11266d.m30461o("failed to fetch variant for experiment ", interfaceC17234a.getName());
        f fVar = new f(z4, this, interfaceC17234a, null);
        eVar2.f66252w = interfaceC17234a;
        eVar2.f66255z = z4;
        eVar2.f66251G = 2;
        objM60900d = companion.m108730a(interfaceC34116n, null, strM30461o, fVar, eVar2);
        if (objM60900d != enumC31071a) {
            boolean z14 = z4;
            interfaceC17234a2 = interfaceC17234a;
            z13 = z14;
            interfaceC34385a = (InterfaceC34385a) objM60900d;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return interfaceC17234a2.getDefaultVariant();
            }
            str = (String) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            if (str != null) {
            }
            return interfaceC17234a2.getDefaultVariant();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // hf1.InterfaceC17235b
    /* JADX INFO: renamed from: f */
    public Object mo48746f(InterfaceC17234a interfaceC17234a, InterfaceC30057d<? super String> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f66234z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f66234z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM60900d = bVar.f66232x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f66234z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM60900d);
            C21642a c21642a = this.experimentsDataStoreHelper;
            String name = interfaceC17234a.getName();
            bVar.f66231w = interfaceC17234a;
            bVar.f66234z = 1;
            objM60900d = c21642a.m60900d(name, bVar);
            if (objM60900d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC17234a = (InterfaceC17234a) bVar.f66231w;
            AbstractC34132o.m107864I(objM60900d);
        }
        String str = (String) objM60900d;
        return str == null ? interfaceC17234a.getDefaultVariant() : str;
    }

    public /* synthetic */ C17236c(ExperimentsApi experimentsApi, ExperimentsAuthApi experimentsAuthApi, C21642a c21642a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(experimentsApi, experimentsAuthApi, c21642a, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ExperimentsRepository") : interfaceC34116n);
    }
}
