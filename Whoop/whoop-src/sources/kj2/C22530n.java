package kj2;

import c93.InterfaceC4351m;
import com.whoop.stress.domain.BreathingEvent;
import com.whoop.stress.domain.StressMonitorApi;
import com.whoop.stress.domain.model.StressIntervention;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.util.List;
import l83.C23454a0;
import nj2.AbstractC26771r;
import org.joda.time.DateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: kj2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@¢\u0006\u0004\b$\u0010%J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0017H\u0082@¢\u0006\u0004\b+\u0010%J!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Lkj2/n;", "", "", "sessionType", "Lzr2/a;", "dateAndTimeProvider", "Lcom/whoop/stress/domain/StressMonitorApi;", "api", "Ltr2/n;", "logger", "Lu92/d;", "sharedPrefsStore", "<init>", "(Ljava/lang/String;Lzr2/a;Lcom/whoop/stress/domain/StressMonitorApi;Ltr2/n;Lu92/d;)V", "Lkj2/o;", "accumulator", "Lkj2/m;", "currentAction", "j", "(Lkj2/o;Lkj2/m;)Lkj2/o;", "Lorg/joda/time/DateTime;", "startSessionTime", "action", "Lec3/l;", "Lnj2/r;", "p", "(Lorg/joda/time/DateTime;Lkj2/m;Lq83/d;)Ljava/lang/Object;", "Lkj2/i;", "currentDomainState", "i", "(Lkj2/i;Lnj2/r;)Lkj2/i;", "", "Lcom/whoop/stress/domain/BreathingEvent;", "breathingEvents", "k", "(Lorg/joda/time/DateTime;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "m", "(Lq83/d;)Ljava/lang/Object;", "selectedCycle", "selectedSpeed", "o", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lnj2/r$f;", "n", "upstream", "l", "(Lec3/l;)Lec3/l;", "a", "Ljava/lang/String;", "b", "Lzr2/a;", "c", "Lcom/whoop/stress/domain/StressMonitorApi;", "d", "Ltr2/n;", "e", "Lu92/d;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22530n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sessionType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final StressMonitorApi api;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34660d sharedPrefsStore;

    /* JADX INFO: renamed from: kj2.n$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$endAndSaveSession$2", m100430f = "StressSessionInteractor.kt", m100431l = {94, 97, 114, 121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/r;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ DateTime f88484E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C22530n f88485F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ List<BreathingEvent> f88486G;

        /* JADX INFO: renamed from: w */
        Object f88487w;

        /* JADX INFO: renamed from: x */
        int f88488x;

        /* JADX INFO: renamed from: y */
        int f88489y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f88490z;

        /* JADX INFO: renamed from: kj2.n$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$endAndSaveSession$2$1$1", m100430f = "StressSessionInteractor.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 113}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41910a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ DateTime f88491E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC13062m f88492F;

            /* JADX INFO: renamed from: w */
            Object f88493w;

            /* JADX INFO: renamed from: x */
            int f88494x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22530n f88495y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ List<BreathingEvent> f88496z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41910a(C22530n c22530n, List<BreathingEvent> list, DateTime dateTime, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C41910a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f88495y = c22530n;
                this.f88496z = list;
                this.f88491E = dateTime;
                this.f88492F = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41910a(this.f88495y, this.f88496z, this.f88491E, this.f88492F, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
            
                if (r15.emit(r1, r14) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r14.f88494x
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L26
                    if (r1 == r4) goto L1e
                    if (r1 != r3) goto L16
                    java.lang.Object r0 = r14.f88493w
                    org.joda.time.DateTime r0 = (org.joda.time.DateTime) r0
                    p505ts.AbstractC34132o.m107864I(r15)
                    goto L97
                L16:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1e:
                    java.lang.Object r1 = r14.f88493w
                    org.joda.time.DateTime r1 = (org.joda.time.DateTime) r1
                    p505ts.AbstractC34132o.m107864I(r15)
                    goto L7d
                L26:
                    p505ts.AbstractC34132o.m107864I(r15)
                    kj2.n r15 = r14.f88495y
                    zr2.a r15 = kj2.C22530n.m65106d(r15)
                    org.joda.time.DateTime r7 = r15.mo133364c()
                    kj2.n r15 = r14.f88495y
                    com.whoop.stress.domain.StressMonitorApi r15 = kj2.C22530n.m65105c(r15)
                    com.whoop.stress.domain.StressInterventionSessionData r1 = new com.whoop.stress.domain.StressInterventionSessionData
                    java.util.List<com.whoop.stress.domain.BreathingEvent> r5 = r14.f88496z
                    java.util.List r12 = oj2.AbstractC27981b.m84413a(r5, r7)
                    com.whoop.data.remote.domain.dto.DateTimeRange r5 = new com.whoop.data.remote.domain.dto.DateTimeRange
                    org.joda.time.DateTime r6 = r14.f88491E
                    r10 = 12
                    r11 = 0
                    r8 = 0
                    r9 = 0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    java.lang.String r10 = r5.getDuring()
                    kj2.n r5 = r14.f88495y
                    java.lang.String r5 = kj2.C22530n.m65108f(r5)
                    kj2.n r6 = r14.f88495y
                    zr2.a r6 = kj2.C22530n.m65106d(r6)
                    org.joda.time.DateTimeZone r6 = r6.mo133366e()
                    java.lang.String r13 = r6.getID()
                    java.lang.String r6 = "getID(...)"
                    p715kotlin.jvm.internal.AbstractC22676k.m65749i(r13, r6)
                    java.lang.String r11 = "USER"
                    r8 = r1
                    r9 = r12
                    r12 = r5
                    r8.<init>(r9, r10, r11, r12, r13)
                    r14.f88493w = r2
                    r14.f88494x = r4
                    java.lang.Object r15 = r15.submitSession(r8, r14)
                    if (r15 != r0) goto L7d
                    goto L96
                L7d:
                    kj2.n r15 = r14.f88495y
                    u92.d r15 = kj2.C22530n.m65109g(r15)
                    java.lang.String r1 = "START_ACTIVITY_COMPLETED"
                    r15.m109538q(r1, r4)
                    ec3.m r15 = r14.f88492F
                    nj2.r$a r1 = nj2.AbstractC26771r.a.f106623a
                    r14.f88493w = r2
                    r14.f88494x = r3
                    java.lang.Object r15 = r15.emit(r1, r14)
                    if (r15 != r0) goto L97
                L96:
                    return r0
                L97:
                    l83.a0 r15 = l83.C23454a0.f92919a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.a.C41910a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41910a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: kj2.n$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$endAndSaveSession$2$1$2", m100430f = "StressSessionInteractor.kt", m100431l = {116, 118}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f88497w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f88498x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f88499y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f88499y = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                b bVar = new b(this.f88499y, interfaceC30057d);
                bVar.f88498x = obj;
                return bVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
            
                if (r6.emit(r0, r5) == r1) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
            
                if (r6.emit(r0, r5) == r1) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
            
                return r1;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = r5.f88498x
                    u02.a$b r0 = (u02.InterfaceC34385a.b) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r5.f88497w
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L1d
                    if (r2 == r4) goto L19
                    if (r2 != r3) goto L11
                    goto L19
                L11:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L19:
                    p505ts.AbstractC34132o.m107864I(r6)
                    goto L4d
                L1d:
                    p505ts.AbstractC34132o.m107864I(r6)
                    boolean r6 = r0 instanceof u02.InterfaceC34385a.b.a
                    r2 = 0
                    if (r6 == 0) goto L3e
                    u02.a$b$a r0 = (u02.InterfaceC34385a.b.a) r0
                    int r6 = r0.getErrorCode()
                    r0 = 409(0x199, float:5.73E-43)
                    if (r6 != r0) goto L3e
                    ec3.m r6 = r5.f88499y
                    nj2.r$e r0 = nj2.AbstractC26771r.e.f106627a
                    r5.f88498x = r2
                    r5.f88497w = r4
                    java.lang.Object r6 = r6.emit(r0, r5)
                    if (r6 != r1) goto L4d
                    goto L4c
                L3e:
                    ec3.m r6 = r5.f88499y
                    nj2.r$c r0 = nj2.AbstractC26771r.c.f106625a
                    r5.f88498x = r2
                    r5.f88497w = r3
                    java.lang.Object r6 = r6.emit(r0, r5)
                    if (r6 != r1) goto L4d
                L4c:
                    return r1
                L4d:
                    l83.a0 r6 = l83.C23454a0.f92919a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DateTime dateTime, C22530n c22530n, List<BreathingEvent> list, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88484E = dateTime;
            this.f88485F = c22530n;
            this.f88486G = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f88484E, this.f88485F, this.f88486G, interfaceC30057d);
            aVar.f88490z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0097  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
        
            if (r0 == r12) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
        
            if (r10.emit(r0, r16) == r12) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r5 = r16
                java.lang.Object r0 = r5.f88490z
                r10 = r0
                ec3.m r10 = (ec3.InterfaceC13062m) r10
                r83.a r12 = r83.EnumC31071a.f128113w
                int r0 = r5.f88489y
                r13 = 4
                r14 = 3
                r1 = 2
                r2 = 1
                r15 = 0
                if (r0 == 0) goto L42
                if (r0 == r2) goto L3e
                if (r0 == r1) goto L31
                if (r0 == r14) goto L27
                if (r0 != r13) goto L1f
                p505ts.AbstractC34132o.m107864I(r17)
                goto La6
            L1f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L27:
                java.lang.Object r0 = r5.f88487w
                org.joda.time.DateTime r0 = (org.joda.time.DateTime) r0
                p505ts.AbstractC34132o.m107864I(r17)
                r0 = r17
                goto L93
            L31:
                int r0 = r5.f88488x
                java.lang.Object r1 = r5.f88487w
                org.joda.time.DateTime r1 = (org.joda.time.DateTime) r1
                p505ts.AbstractC34132o.m107864I(r17)
                r8 = r0
                r0 = r17
                goto L7d
            L3e:
                p505ts.AbstractC34132o.m107864I(r17)
                goto L52
            L42:
                p505ts.AbstractC34132o.m107864I(r17)
                nj2.r$b r0 = nj2.AbstractC26771r.b.f106624a
                r5.f88490z = r10
                r5.f88489y = r2
                java.lang.Object r0 = r10.emit(r0, r5)
                if (r0 != r12) goto L52
                goto La5
            L52:
                org.joda.time.DateTime r9 = r5.f88484E
                if (r9 == 0) goto L97
                kj2.n r7 = r5.f88485F
                java.util.List<com.whoop.stress.domain.BreathingEvent> r8 = r5.f88486G
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                tr2.n r2 = kj2.C22530n.m65107e(r7)
                kj2.n$a$a r4 = new kj2.n$a$a
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r5.f88490z = r10
                r5.f88487w = r15
                r8 = 0
                r5.f88488x = r8
                r5.f88489y = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "endAndSubmitSession"
                r6 = 2
                r7 = 0
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r12) goto L7d
                goto La5
            L7d:
                u02.a r0 = (u02.InterfaceC34385a) r0
                kj2.n$a$b r1 = new kj2.n$a$b
                r1.<init>(r10, r15)
                r5.f88490z = r10
                r5.f88487w = r15
                r5.f88488x = r8
                r5.f88489y = r14
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r5)
                if (r0 != r12) goto L93
                goto La5
            L93:
                u02.a r0 = (u02.InterfaceC34385a) r0
                if (r0 != 0) goto La6
            L97:
                nj2.r$c r0 = nj2.AbstractC26771r.c.f106625a
                r5.f88490z = r15
                r5.f88487w = r15
                r5.f88489y = r13
                java.lang.Object r0 = r10.emit(r0, r5)
                if (r0 != r12) goto La6
            La5:
                return r12
            La6:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kj2.n$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$interact$$inlined$flatMapLatest$1", m100430f = "StressSessionInteractor.kt", m100431l = {190, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f88500E;

        /* JADX INFO: renamed from: F */
        Object f88501F;

        /* JADX INFO: renamed from: G */
        Object f88502G;

        /* JADX INFO: renamed from: H */
        Object f88503H;

        /* JADX INFO: renamed from: I */
        int f88504I;

        /* JADX INFO: renamed from: w */
        int f88505w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88506x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88507y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22530n f88508z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C22530n c22530n) {
            super(3, interfaceC30057d);
            this.f88508z = c22530n;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C22531o c22531o, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f88508z);
            bVar.f88506x = interfaceC13062m;
            bVar.f88507y = c22531o;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r9, r8) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f88505w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L35
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r8.f88506x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L7a
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                java.lang.Object r1 = r8.f88503H
                kj2.m r1 = (kj2.AbstractC22529m) r1
                java.lang.Object r1 = r8.f88502G
                org.joda.time.DateTime r1 = (org.joda.time.DateTime) r1
                java.lang.Object r1 = r8.f88501F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r8.f88500E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r8.f88506x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r9)
                goto L63
            L35:
                p505ts.AbstractC34132o.m107864I(r9)
                java.lang.Object r9 = r8.f88506x
                r1 = r9
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r9 = r8.f88507y
                kj2.o r9 = (kj2.C22531o) r9
                org.joda.time.DateTime r5 = r9.getStartSessionTime()
                kj2.m r9 = r9.getAction()
                kj2.n r6 = r8.f88508z
                r8.f88506x = r4
                r8.f88507y = r4
                r8.f88500E = r1
                r8.f88501F = r4
                r8.f88502G = r4
                r8.f88503H = r4
                r7 = 0
                r8.f88504I = r7
                r8.f88505w = r3
                java.lang.Object r9 = kj2.C22530n.m65110h(r6, r5, r9, r8)
                if (r9 != r0) goto L63
                goto L79
            L63:
                ec3.l r9 = (ec3.InterfaceC13058l) r9
                r8.f88506x = r4
                r8.f88507y = r4
                r8.f88500E = r4
                r8.f88501F = r4
                r8.f88502G = r4
                r8.f88503H = r4
                r8.f88505w = r2
                java.lang.Object r9 = ec3.AbstractC13091v.m36613w(r1, r9, r8)
                if (r9 != r0) goto L7a
            L79:
                return r0
            L7a:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C22531o) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kj2.n$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f88509w;

        /* JADX INFO: renamed from: kj2.n$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f88510w;

            /* JADX INFO: renamed from: kj2.n$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$interact$$inlined$mapNotNull$1$2", m100430f = "StressSessionInteractor.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41911a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f88511E;

                /* JADX INFO: renamed from: F */
                Object f88512F;

                /* JADX INFO: renamed from: G */
                Object f88513G;

                /* JADX INFO: renamed from: H */
                Object f88514H;

                /* JADX INFO: renamed from: I */
                int f88515I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f88516w;

                /* JADX INFO: renamed from: x */
                int f88517x;

                /* JADX INFO: renamed from: y */
                Object f88518y;

                public C41911a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f88516w = obj;
                    this.f88517x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f88510w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41911a c41911a;
                if (interfaceC30057d instanceof C41911a) {
                    c41911a = (C41911a) interfaceC30057d;
                    int i13 = c41911a.f88517x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41911a.f88517x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41911a = new C41911a(interfaceC30057d);
                    }
                } else {
                    c41911a = new C41911a(interfaceC30057d);
                }
                Object obj2 = c41911a.f88516w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41911a.f88517x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f88510w;
                    AbstractC26771r domainState = ((C22525i) obj).getDomainState();
                    if (domainState != null) {
                        c41911a.f88518y = null;
                        c41911a.f88511E = null;
                        c41911a.f88512F = null;
                        c41911a.f88513G = null;
                        c41911a.f88514H = null;
                        c41911a.f88515I = 0;
                        c41911a.f88517x = 1;
                        if (interfaceC13062m.emit(domainState, c41911a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f88509w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f88509w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kj2.n$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$interact$1", m100430f = "StressSessionInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkj2/o;", "accumulator", "Lkj2/m;", "currentAction", "<anonymous>", "(Lkj2/o;Lkj2/m;)Lkj2/o;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88520w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88521x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88522y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22531o c22531o, AbstractC22529m abstractC22529m, InterfaceC30057d<? super C22531o> interfaceC30057d) {
            d dVar = C22530n.this.new d(interfaceC30057d);
            dVar.f88521x = c22531o;
            dVar.f88522y = abstractC22529m;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22531o c22531o = (C22531o) this.f88521x;
            AbstractC22529m abstractC22529m = (AbstractC22529m) this.f88522y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88520w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C22530n.this.m65112j(c22531o, abstractC22529m);
        }
    }

    /* JADX INFO: renamed from: kj2.n$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$interact$3", m100430f = "StressSessionInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkj2/i;", "accumulator", "Lnj2/r;", "currentDomainState", "<anonymous>", "(Lkj2/i;Lnj2/r;)Lkj2/i;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88524w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88525x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88526y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22525i c22525i, AbstractC26771r abstractC26771r, InterfaceC30057d<? super C22525i> interfaceC30057d) {
            e eVar = C22530n.this.new e(interfaceC30057d);
            eVar.f88525x = c22525i;
            eVar.f88526y = abstractC26771r;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22525i c22525i = (C22525i) this.f88525x;
            AbstractC26771r abstractC26771r = (AbstractC26771r) this.f88526y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88524w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C22530n.this.m65111i(c22525i, abstractC26771r);
        }
    }

    /* JADX INFO: renamed from: kj2.n$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$refresh$2", m100430f = "StressSessionInteractor.kt", m100431l = {125, 129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/r;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88528w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88529x;

        /* JADX INFO: renamed from: kj2.n$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$refresh$2$1", m100430f = "StressSessionInteractor.kt", m100431l = {126, 128}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            Object f88531w;

            /* JADX INFO: renamed from: x */
            int f88532x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22530n f88533y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC13062m f88534z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22530n c22530n, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f88533y = c22530n;
                this.f88534z = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f88533y, this.f88534z, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
            
                if (r1.emit(r3, r4) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f88532x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r0 = r4.f88531w
                    com.whoop.stress.domain.model.StressSession r0 = (com.whoop.stress.domain.model.StressSession) r0
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L4d
                L14:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1c:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L38
                L20:
                    p505ts.AbstractC34132o.m107864I(r5)
                    kj2.n r5 = r4.f88533y
                    com.whoop.stress.domain.StressMonitorApi r5 = kj2.C22530n.m65105c(r5)
                    kj2.n r1 = r4.f88533y
                    java.lang.String r1 = kj2.C22530n.m65108f(r1)
                    r4.f88532x = r3
                    java.lang.Object r5 = r5.getStressInterventionFullRelease(r1, r4)
                    if (r5 != r0) goto L38
                    goto L4c
                L38:
                    com.whoop.stress.domain.model.StressSession r5 = (com.whoop.stress.domain.model.StressSession) r5
                    ec3.m r1 = r4.f88534z
                    nj2.r$d r3 = new nj2.r$d
                    r3.<init>(r5)
                    r5 = 0
                    r4.f88531w = r5
                    r4.f88532x = r2
                    java.lang.Object r5 = r1.emit(r3, r4)
                    if (r5 != r0) goto L4d
                L4c:
                    return r0
                L4d:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: kj2.n$f$b */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$refresh$2$2", m100430f = "StressSessionInteractor.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f88535w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f88536x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f88536x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f88536x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f88535w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f88536x;
                    AbstractC26771r.c cVar = AbstractC26771r.c.f106625a;
                    this.f88535w = 1;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C22530n.this.new f(interfaceC30057d);
            fVar.f88529x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r15, r2, r14) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f88529x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f88528w
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L58
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L46
            L23:
                p505ts.AbstractC34132o.m107864I(r15)
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                kj2.n r15 = kj2.C22530n.this
                tr2.n r7 = kj2.C22530n.m65107e(r15)
                kj2.n$f$a r10 = new kj2.n$f$a
                kj2.n r15 = kj2.C22530n.this
                r10.<init>(r15, r0, r5)
                r14.f88529x = r0
                r14.f88528w = r4
                r8 = 0
                java.lang.String r9 = "refresh"
                r12 = 2
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L46
                goto L57
            L46:
                u02.a r15 = (u02.InterfaceC34385a) r15
                kj2.n$f$b r2 = new kj2.n$f$b
                r2.<init>(r0, r5)
                r11.f88529x = r5
                r11.f88528w = r3
                java.lang.Object r15 = u02.AbstractC34386b.m108741f(r15, r2, r14)
                if (r15 != r1) goto L58
            L57:
                return r1
            L58:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kj2.n$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$startNextCycle$2", m100430f = "StressSessionInteractor.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/r$f;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88537w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88538x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f88538x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88538x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88537w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26771r.f fVar = new AbstractC26771r.f(null, 0);
                this.f88538x = null;
                this.f88537w = 1;
                if (interfaceC13062m.emit(fVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kj2.n$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$startSession$2", m100430f = "StressSessionInteractor.kt", m100431l = {133, 143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/r;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f88539E;

        /* JADX INFO: renamed from: w */
        int f88540w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88541x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f88543z;

        /* JADX INFO: renamed from: kj2.n$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$startSession$2$1", m100430f = "StressSessionInteractor.kt", m100431l = {134, 142}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f88544E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ InterfaceC13062m f88545F;

            /* JADX INFO: renamed from: w */
            Object f88546w;

            /* JADX INFO: renamed from: x */
            int f88547x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22530n f88548y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f88549z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22530n c22530n, String str, String str2, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f88548y = c22530n;
                this.f88549z = str;
                this.f88544E = str2;
                this.f88545F = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f88548y, this.f88549z, this.f88544E, this.f88545F, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
            
                if (r1.emit(r3, r7) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r7.f88547x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r0 = r7.f88546w
                    com.whoop.stress.domain.model.StressIntervention r0 = (com.whoop.stress.domain.model.StressIntervention) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L5a
                L14:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L41
                L20:
                    p505ts.AbstractC34132o.m107864I(r8)
                    kj2.n r8 = r7.f88548y
                    com.whoop.stress.domain.StressMonitorApi r8 = kj2.C22530n.m65105c(r8)
                    kj2.n r1 = r7.f88548y
                    java.lang.String r1 = kj2.C22530n.m65108f(r1)
                    com.whoop.stress.domain.SessionCustomizationData r4 = new com.whoop.stress.domain.SessionCustomizationData
                    java.lang.String r5 = r7.f88549z
                    java.lang.String r6 = r7.f88544E
                    r4.<init>(r5, r6)
                    r7.f88547x = r3
                    java.lang.Object r8 = r8.getCustomizedIntervention(r1, r4, r7)
                    if (r8 != r0) goto L41
                    goto L59
                L41:
                    com.whoop.stress.domain.model.StressIntervention r8 = (com.whoop.stress.domain.model.StressIntervention) r8
                    ec3.m r1 = r7.f88545F
                    nj2.r$g r3 = new nj2.r$g
                    int r4 = r8.getRepeatCount()
                    r3.<init>(r8, r4)
                    r8 = 0
                    r7.f88546w = r8
                    r7.f88547x = r2
                    java.lang.Object r8 = r1.emit(r3, r7)
                    if (r8 != r0) goto L5a
                L59:
                    return r0
                L5a:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: kj2.n$h$b */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressSessionInteractor$startSession$2$2", m100430f = "StressSessionInteractor.kt", m100431l = {144}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lu02/a$b;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f88550w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC13062m f88551x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f88551x = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f88551x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC34385a.b<C23454a0> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f88550w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m = this.f88551x;
                    AbstractC26771r.c cVar = AbstractC26771r.c.f106625a;
                    this.f88550w = 1;
                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88543z = str;
            this.f88539E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C22530n.this.new h(this.f88543z, this.f88539E, interfaceC30057d);
            hVar.f88541x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (u02.AbstractC34386b.m108741f((u02.InterfaceC34385a) r0, r1, r14) == r12) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f88541x
                r10 = r0
                ec3.m r10 = (ec3.InterfaceC13062m) r10
                r83.a r12 = r83.EnumC31071a.f128113w
                int r0 = r14.f88540w
                r13 = 2
                r1 = 1
                if (r0 == 0) goto L22
                if (r0 == r1) goto L1d
                if (r0 != r13) goto L15
                p505ts.AbstractC34132o.m107864I(r15)
                goto L5f
            L15:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1d:
                p505ts.AbstractC34132o.m107864I(r15)
                r0 = r15
                goto L4c
            L22:
                p505ts.AbstractC34132o.m107864I(r15)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                kj2.n r2 = kj2.C22530n.this
                tr2.n r2 = kj2.C22530n.m65107e(r2)
                kj2.n$h$a r4 = new kj2.n$h$a
                kj2.n r7 = kj2.C22530n.this
                java.lang.String r8 = r14.f88543z
                java.lang.String r9 = r14.f88539E
                r11 = 0
                r6 = r4
                r6.<init>(r7, r8, r9, r10, r11)
                r14.f88541x = r10
                r14.f88540w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "startSession"
                r6 = 2
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r12) goto L4c
                goto L5e
            L4c:
                u02.a r0 = (u02.InterfaceC34385a) r0
                kj2.n$h$b r1 = new kj2.n$h$b
                r2 = 0
                r1.<init>(r10, r2)
                r14.f88541x = r2
                r14.f88540w = r13
                java.lang.Object r0 = u02.AbstractC34386b.m108741f(r0, r1, r14)
                if (r0 != r12) goto L5f
            L5e:
                return r12
            L5f:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22530n.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C22530n(String sessionType, InterfaceC41070a dateAndTimeProvider, StressMonitorApi api, InterfaceC34116n logger, C34660d sharedPrefsStore) {
        AbstractC22676k.m65750j(sessionType, "sessionType");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(sharedPrefsStore, "sharedPrefsStore");
        this.sessionType = sessionType;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.api = api;
        this.logger = logger;
        this.sharedPrefsStore = sharedPrefsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C22525i m65111i(C22525i accumulator, AbstractC26771r currentDomainState) {
        if (AbstractC22676k.m65745e(currentDomainState, AbstractC26771r.a.f106623a) || AbstractC22676k.m65745e(currentDomainState, AbstractC26771r.b.f106624a) || AbstractC22676k.m65745e(currentDomainState, AbstractC26771r.c.f106625a) || AbstractC22676k.m65745e(currentDomainState, AbstractC26771r.e.f106627a)) {
            return new C22525i(accumulator.getIntervention(), currentDomainState, 0, 4, null);
        }
        if (currentDomainState instanceof AbstractC26771r.d) {
            return new C22525i(((AbstractC26771r.d) currentDomainState).getSession().getIntervention(), currentDomainState, 0, 4, null);
        }
        if (currentDomainState instanceof AbstractC26771r.g) {
            AbstractC26771r.g gVar = (AbstractC26771r.g) currentDomainState;
            StressIntervention intervention = gVar.getIntervention();
            StressIntervention intervention2 = gVar.getIntervention();
            return new C22525i(intervention, currentDomainState, intervention2 != null ? intervention2.getRepeatCount() : 0);
        }
        if (!(currentDomainState instanceof AbstractC26771r.f)) {
            throw new NoWhenBranchMatchedException();
        }
        StressIntervention intervention3 = accumulator.getIntervention();
        AbstractC22676k.m65747g(intervention3);
        StressIntervention stressInterventionCopy$default = StressIntervention.copy$default(accumulator.getIntervention(), null, intervention3.getRepeatCount() - 1, null, null, null, null, null, null, null, 509, null);
        return new C22525i(stressInterventionCopy$default, ((AbstractC26771r.f) currentDomainState).m79775a(stressInterventionCopy$default, accumulator.getTotalRounds()), accumulator.getTotalRounds());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final C22531o m65112j(C22531o accumulator, AbstractC22529m currentAction) {
        if ((currentAction instanceof AbstractC22529m.b) || (currentAction instanceof AbstractC22529m.a) || AbstractC22676k.m65745e(currentAction, AbstractC22529m.c.f88476a)) {
            return C22531o.m65124d(accumulator, null, currentAction, 1, null);
        }
        if (currentAction instanceof AbstractC22529m.d) {
            return accumulator.m65127c(this.dateAndTimeProvider.mo133364c(), currentAction);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    private final Object m65113k(DateTime dateTime, List<BreathingEvent> list, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new a(dateTime, this, list, null));
    }

    /* JADX INFO: renamed from: m */
    private final Object m65114m(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new f(null));
    }

    /* JADX INFO: renamed from: n */
    private final Object m65115n(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new g(null));
    }

    /* JADX INFO: renamed from: o */
    private final Object m65116o(String str, String str2, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new h(str2, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m65117p(DateTime dateTime, AbstractC22529m abstractC22529m, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        if (abstractC22529m instanceof AbstractC22529m.a) {
            return m65113k(dateTime, ((AbstractC22529m.a) abstractC22529m).m65100a(), interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC22529m, AbstractC22529m.b.f88475a)) {
            return m65114m(interfaceC30057d);
        }
        if (abstractC22529m instanceof AbstractC22529m.d) {
            AbstractC22529m.d dVar = (AbstractC22529m.d) abstractC22529m;
            return m65116o(dVar.getSelectedCycle(), dVar.getSelectedSpeed(), interfaceC30057d);
        }
        if (!AbstractC22676k.m65745e(abstractC22529m, AbstractC22529m.c.f88476a)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objM65115n = m65115n(interfaceC30057d);
        return objM65115n == EnumC31071a.f128113w ? objM65115n : (InterfaceC13058l) objM65115n;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m65118l(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new c(new C13060l1(new C22525i(null, null, 0, 7, null), AbstractC13091v.m36590P(new C13060l1(new C22531o(null, null, 3, null), upstream, new d(null)), new b(null, this)), new e(null))));
    }
}
