package ff2;

import androidx.health.platform.client.proto.C1533u;
import ci2.InterfaceC4733b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qf2.C30327f;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ff2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lff2/a;", "", "Lci2/b;", "whoopStrapProvider", "Lqf2/f;", "smartAlarmRepository", "Ltr2/n;", "logger", "<init>", "(Lci2/b;Lqf2/f;Ltr2/n;)V", "", "enabling", "Lorg/joda/time/Instant;", "alarmInstant", "b", "(ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "c", "(Lq83/d;)Ljava/lang/Object;", "a", "Lci2/b;", "Lqf2/f;", "Ltr2/n;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14430a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30327f smartAlarmRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ff2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.util.SmartAlarmHandler", m100430f = "SmartAlarmHandler.kt", m100431l = {29, 34}, m100432m = "updateAlarmOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f52659E;

        /* JADX INFO: renamed from: w */
        boolean f52660w;

        /* JADX INFO: renamed from: x */
        Object f52661x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52662y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52662y = obj;
            this.f52659E |= Integer.MIN_VALUE;
            return C14430a.this.m41160b(false, null, this);
        }
    }

    /* JADX INFO: renamed from: ff2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.util.SmartAlarmHandler", m100430f = "SmartAlarmHandler.kt", m100431l = {C1533u.AVG_FIELD_NUMBER, 20}, m100432m = "updateSmartAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f52665F;

        /* JADX INFO: renamed from: w */
        Object f52666w;

        /* JADX INFO: renamed from: x */
        Object f52667x;

        /* JADX INFO: renamed from: y */
        int f52668y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f52669z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f52669z = obj;
            this.f52665F |= Integer.MIN_VALUE;
            return C14430a.this.m41161c(this);
        }
    }

    public C14430a(InterfaceC4733b whoopStrapProvider, C30327f smartAlarmRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(smartAlarmRepository, "smartAlarmRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.whoopStrapProvider = whoopStrapProvider;
        this.smartAlarmRepository = smartAlarmRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m41160b(boolean r6, org.joda.time.Instant r7, q83.InterfaceC30057d<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ff2.C14430a.a
            if (r0 == 0) goto L13
            r0 = r8
            ff2.a$a r0 = (ff2.C14430a.a) r0
            int r1 = r0.f52659E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52659E = r1
            goto L18
        L13:
            ff2.a$a r0 = new ff2.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f52662y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f52659E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f52661x
            org.joda.time.Instant r6 = (org.joda.time.Instant) r6
            p505ts.AbstractC34132o.m107864I(r8)
            return r8
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f52661x
            r7 = r6
            org.joda.time.Instant r7 = (org.joda.time.Instant) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L53
        L3f:
            p505ts.AbstractC34132o.m107864I(r8)
            if (r6 == 0) goto L7c
            qf2.f r8 = r5.smartAlarmRepository
            r0.f52661x = r7
            r0.f52660w = r6
            r0.f52659E = r4
            java.lang.Object r8 = r8.m92684r(r7, r0)
            if (r8 != r1) goto L53
            goto L8b
        L53:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            tr2.n r8 = r5.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "is alarm set : "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = " and time as : "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r0 = 0
            qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
            r8.mo85228t(r7, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L7c:
            qf2.f r7 = r5.smartAlarmRepository
            r8 = 0
            r0.f52661x = r8
            r0.f52660w = r6
            r0.f52659E = r3
            java.lang.Object r6 = r7.disableAlarmOnStrap(r0)
            if (r6 != r1) goto L8c
        L8b:
            return r1
        L8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ff2.C14430a.m41160b(boolean, org.joda.time.Instant, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m41161c(q83.InterfaceC30057d<? super com.whoop.data.remote.commons.Resource<l83.C23454a0>> r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ff2.C14430a.m41161c(q83.d):java.lang.Object");
    }
}
