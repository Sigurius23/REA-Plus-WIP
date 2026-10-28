package ts1;

import bc3.AbstractC3006f0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import java.time.Clock;
import java.util.List;
import l83.C23454a0;
import n83.C26463f;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qk1.C30443a;
import qk1.InterfaceC30444b;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import us1.InterfaceC35218a;
import vs1.AbstractC36473b;
import vs1.C36472a;

/* JADX INFO: renamed from: ts1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0004\b\u001c\u0010\u001aJ0\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e2\u0006\u0010 \u001a\u00020\fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b$\u0010%J\"\u0010'\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,¨\u0006-"}, m65681d2 = {"Lts1/a;", "Lqk1/b;", "Ltr2/n;", "logger", "Lus1/a;", "labradorDao", "Lfi0/a;", "baseAnalytics", "Ljava/time/Clock;", "clock", "<init>", "(Ltr2/n;Lus1/a;Lfi0/a;Ljava/time/Clock;)V", "", "action", "", "timeDiff", "labradorReadingCompleteTime", "Ll83/a0;", "g", "(Ljava/lang/String;JLjava/lang/Long;)V", "Lvs1/a;", "labradorReadingResult", "", "f", "(Lvs1/a;Lq83/d;)Ljava/lang/Object;", "e", "(Lq83/d;)Ljava/lang/Object;", "Lqk1/a;", "b", "timeStamp", "", "symptoms", "notes", "a", "(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "timestamp", "c", "(JLq83/d;)Ljava/lang/Object;", "isUploaded", "d", "(JZLq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lus1/a;", "Lfi0/a;", "Ljava/time/Clock;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34142a implements InterfaceC30444b {

    /* JADX INFO: renamed from: e */
    private static final a f143082e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f143083f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC35218a labradorDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: ts1.a$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"Lts1/a$a;", "", "<init>", "()V", "", "LABRADOR_READING_RESULT", "Ljava/lang/String;", "SAVE", "GET", "DELETE", "LABRADOR", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ts1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultDbManager", m100430f = "LabradorReadingResultDbManager.kt", m100431l = {48}, m100432m = "clear", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f143088w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143089x;

        /* JADX INFO: renamed from: z */
        int f143091z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143089x = obj;
            this.f143091z |= Integer.MIN_VALUE;
            return C34142a.this.m107906e(this);
        }
    }

    /* JADX INFO: renamed from: ts1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultDbManager", m100430f = "LabradorReadingResultDbManager.kt", m100431l = {102}, m100432m = "deleteReadingByTrailingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f143092E;

        /* JADX INFO: renamed from: w */
        long f143093w;

        /* JADX INFO: renamed from: x */
        long f143094x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143095y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143095y = obj;
            this.f143092E |= Integer.MIN_VALUE;
            return C34142a.this.mo93127c(0L, this);
        }
    }

    /* JADX INFO: renamed from: ts1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultDbManager", m100430f = "LabradorReadingResultDbManager.kt", m100431l = {73}, m100432m = "getLatestReading", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f143097w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143098x;

        /* JADX INFO: renamed from: z */
        int f143100z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143098x = obj;
            this.f143100z |= Integer.MIN_VALUE;
            return C34142a.this.mo93126b(this);
        }
    }

    /* JADX INFO: renamed from: ts1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultDbManager", m100430f = "LabradorReadingResultDbManager.kt", m100431l = {33}, m100432m = ProfileAnalyticsKt.SAVE, m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f143101E;

        /* JADX INFO: renamed from: w */
        Object f143102w;

        /* JADX INFO: renamed from: x */
        long f143103x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143104y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143104y = obj;
            this.f143101E |= Integer.MIN_VALUE;
            return C34142a.this.m107907f(null, this);
        }
    }

    /* JADX INFO: renamed from: ts1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultDbManager", m100430f = "LabradorReadingResultDbManager.kt", m100431l = {87, 88}, m100432m = "updateReadingSymptomsAndNotesById", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f143106E;

        /* JADX INFO: renamed from: G */
        int f143108G;

        /* JADX INFO: renamed from: w */
        long f143109w;

        /* JADX INFO: renamed from: x */
        long f143110x;

        /* JADX INFO: renamed from: y */
        Object f143111y;

        /* JADX INFO: renamed from: z */
        Object f143112z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143106E = obj;
            this.f143108G |= Integer.MIN_VALUE;
            return C34142a.this.mo93125a(0L, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ts1.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.data.LabradorReadingResultDbManager", m100430f = "LabradorReadingResultDbManager.kt", m100431l = {114, 115}, m100432m = "updateReadingUploadStatusByTrailingTimeStamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f143114F;

        /* JADX INFO: renamed from: w */
        long f143115w;

        /* JADX INFO: renamed from: x */
        long f143116x;

        /* JADX INFO: renamed from: y */
        boolean f143117y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f143118z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f143118z = obj;
            this.f143114F |= Integer.MIN_VALUE;
            return C34142a.this.mo93128d(0L, false, this);
        }
    }

    public C34142a(InterfaceC34116n logger, InterfaceC35218a labradorDao, InterfaceC14515a baseAnalytics, Clock clock) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labradorDao, "labradorDao");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(clock, "clock");
        this.logger = logger;
        this.labradorDao = labradorDao;
        this.baseAnalytics = baseAnalytics;
        this.clock = clock;
    }

    /* JADX INFO: renamed from: g */
    private final void m107905g(String action, long timeDiff, Long labradorReadingCompleteTime) {
        C26463f c26463f = new C26463f();
        c26463f.put("Feature", "ECG");
        if (labradorReadingCompleteTime != null) {
            c26463f.put("ECG Reading Result", Long.valueOf(labradorReadingCompleteTime.longValue()));
        }
        c26463f.put(action, String.valueOf(timeDiff));
        InterfaceC14515a.m41418i(this.baseAnalytics, "ECG Reading Result", null, null, "DB Query Performance", null, c26463f.m78380b(), 22, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // qk1.InterfaceC30444b
    /* JADX INFO: renamed from: a */
    public Object mo93125a(long j7, List<String> list, String str, InterfaceC30057d<? super C30443a> interfaceC30057d) {
        f fVar;
        long jMillis;
        Exception exc;
        long j13;
        long j14;
        C36472a c36472a;
        Long l7;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f143108G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f143108G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objMo111564c = fVar2.f143106E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f143108G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo111564c);
            jMillis = this.clock.millis();
            try {
                InterfaceC35218a interfaceC35218a = this.labradorDao;
                fVar2.f143111y = null;
                fVar2.f143112z = null;
                fVar2.f143109w = j7;
                fVar2.f143110x = jMillis;
                fVar2.f143108G = 1;
                if (interfaceC35218a.mo111562a(j7, list, str, fVar2) == enumC31071a) {
                }
                return enumC31071a;
            } catch (Exception e5) {
                exc = e5;
                AbstractC3006f0.m8721o(fVar2.getContext());
                this.logger.mo85230v(AbstractC11895b.m31994m(j7, "Failed to update symptoms with id "), exc, new AbstractC30556a.a[0]);
                c36472a = null;
                j14 = jMillis;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j14 = fVar2.f143110x;
                j13 = fVar2.f143109w;
                try {
                    AbstractC34132o.m107864I(objMo111564c);
                    c36472a = (C36472a) objMo111564c;
                } catch (Exception e13) {
                    exc = e13;
                    jMillis = j14;
                    j7 = j13;
                    AbstractC3006f0.m8721o(fVar2.getContext());
                    this.logger.mo85230v(AbstractC11895b.m31994m(j7, "Failed to update symptoms with id "), exc, new AbstractC30556a.a[0]);
                    c36472a = null;
                    j14 = jMillis;
                }
                long jMillis2 = this.clock.millis() - j14;
                if (c36472a != null) {
                    l7 = new Long(c36472a.getTimeStamp());
                } else {
                    l7 = null;
                }
                m107905g("Get", jMillis2, l7);
                if (c36472a != null) {
                    return AbstractC36473b.m116836a(c36472a);
                }
                return null;
            }
            long j15 = fVar2.f143110x;
            long j16 = fVar2.f143109w;
            try {
                AbstractC34132o.m107864I(objMo111564c);
                jMillis = j15;
                j7 = j16;
            } catch (Exception e14) {
                exc = e14;
                jMillis = j15;
                j7 = j16;
                AbstractC3006f0.m8721o(fVar2.getContext());
                this.logger.mo85230v(AbstractC11895b.m31994m(j7, "Failed to update symptoms with id "), exc, new AbstractC30556a.a[0]);
                c36472a = null;
                j14 = jMillis;
            }
        }
        InterfaceC35218a interfaceC35218a2 = this.labradorDao;
        fVar2.f143111y = null;
        fVar2.f143112z = null;
        fVar2.f143109w = j7;
        fVar2.f143110x = jMillis;
        fVar2.f143108G = 2;
        objMo111564c = interfaceC35218a2.mo111564c(j7, fVar2);
        if (objMo111564c != enumC31071a) {
            j13 = j7;
            j14 = jMillis;
            c36472a = (C36472a) objMo111564c;
            long jMillis3 = this.clock.millis() - j14;
            if (c36472a != null) {
                l7 = new Long(c36472a.getTimeStamp());
            } else {
                l7 = null;
            }
            m107905g("Get", jMillis3, l7);
            if (c36472a != null) {
                return AbstractC36473b.m116836a(c36472a);
            }
            return null;
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk1.InterfaceC30444b
    /* JADX INFO: renamed from: b */
    public Object mo93126b(InterfaceC30057d<? super C30443a> interfaceC30057d) {
        d dVar;
        long j7;
        C36472a c36472a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f143100z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f143100z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objMo111565d = dVar.f143098x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f143100z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo111565d);
            long jMillis = this.clock.millis();
            try {
                InterfaceC35218a interfaceC35218a = this.labradorDao;
                dVar.f143097w = jMillis;
                dVar.f143100z = 1;
                objMo111565d = interfaceC35218a.mo111565d(dVar);
                if (objMo111565d == enumC31071a) {
                    return enumC31071a;
                }
                j7 = jMillis;
            } catch (Exception e5) {
                e = e5;
                j7 = jMillis;
                AbstractC3006f0.m8721o(dVar.getContext());
                this.logger.mo85230v("Failed to get latest reading", e, new AbstractC30556a.a[0]);
                c36472a = null;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = dVar.f143097w;
            try {
                AbstractC34132o.m107864I(objMo111565d);
            } catch (Exception e13) {
                e = e13;
                AbstractC3006f0.m8721o(dVar.getContext());
                this.logger.mo85230v("Failed to get latest reading", e, new AbstractC30556a.a[0]);
                c36472a = null;
            }
        }
        c36472a = (C36472a) objMo111565d;
        m107905g("Get", this.clock.millis() - j7, c36472a != null ? new Long(c36472a.getTimeStamp()) : null);
        if (c36472a != null) {
            return AbstractC36473b.m116836a(c36472a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk1.InterfaceC30444b
    /* JADX INFO: renamed from: c */
    public Object mo93127c(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        long jMillis;
        long j13;
        long j14;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f143092E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f143092E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f143095y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f143092E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j14 = cVar.f143094x;
            j13 = cVar.f143093w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e5) {
                e = e5;
                jMillis = j14;
                j7 = j13;
                AbstractC3006f0.m8721o(cVar.getContext());
                this.logger.mo85230v(AbstractC11895b.m31994m(j7, "Failed to delete reading with id "), e, new AbstractC30556a.a[0]);
                j13 = j7;
                j14 = jMillis;
            }
            m107905g("Delete", this.clock.millis() - j14, new Long(j13));
            return C23454a0.f92919a;
        }
        AbstractC34132o.m107864I(obj);
        jMillis = this.clock.millis();
        try {
            InterfaceC35218a interfaceC35218a = this.labradorDao;
            cVar.f143093w = j7;
            cVar.f143094x = jMillis;
            cVar.f143092E = 1;
            if (interfaceC35218a.mo111563b(j7, cVar) == enumC31071a) {
                return enumC31071a;
            }
        } catch (Exception e13) {
            e = e13;
            AbstractC3006f0.m8721o(cVar.getContext());
            this.logger.mo85230v(AbstractC11895b.m31994m(j7, "Failed to delete reading with id "), e, new AbstractC30556a.a[0]);
        }
        j13 = j7;
        j14 = jMillis;
        m107905g("Delete", this.clock.millis() - j14, new Long(j13));
        return C23454a0.f92919a;
        AbstractC3006f0.m8721o(cVar.getContext());
        this.logger.mo85230v(AbstractC11895b.m31994m(j7, "Failed to delete reading with id "), e, new AbstractC30556a.a[0]);
        j13 = j7;
        j14 = jMillis;
        m107905g("Delete", this.clock.millis() - j14, new Long(j13));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r14 == r1) goto L30;
     */
    @Override // qk1.InterfaceC30444b
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo93128d(long r11, boolean r13, q83.InterfaceC30057d<? super qk1.C30443a> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof ts1.C34142a.g
            if (r0 == 0) goto L13
            r0 = r14
            ts1.a$g r0 = (ts1.C34142a.g) r0
            int r1 = r0.f143114F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f143114F = r1
            goto L18
        L13:
            ts1.a$g r0 = new ts1.a$g
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f143118z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f143114F
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4f
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            long r11 = r0.f143116x
            long r1 = r0.f143115w
            p505ts.AbstractC34132o.m107864I(r14)     // Catch: java.lang.Exception -> L31
            r6 = r11
            r11 = r1
            goto L7a
        L31:
            r13 = move-exception
            r6 = r11
            r11 = r1
            goto L7e
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            long r11 = r0.f143116x
            boolean r13 = r0.f143117y
            long r5 = r0.f143115w
            p505ts.AbstractC34132o.m107864I(r14)     // Catch: java.lang.Exception -> L4a
            r8 = r5
            r6 = r11
            r11 = r8
            goto L69
        L4a:
            r13 = move-exception
            r8 = r5
            r6 = r11
            r11 = r8
            goto L7e
        L4f:
            p505ts.AbstractC34132o.m107864I(r14)
            java.time.Clock r14 = r10.clock
            long r6 = r14.millis()
            us1.a r14 = r10.labradorDao     // Catch: java.lang.Exception -> L7d
            r0.f143115w = r11     // Catch: java.lang.Exception -> L7d
            r0.f143117y = r13     // Catch: java.lang.Exception -> L7d
            r0.f143116x = r6     // Catch: java.lang.Exception -> L7d
            r0.f143114F = r5     // Catch: java.lang.Exception -> L7d
            java.lang.Object r14 = r14.mo111567f(r11, r13, r0)     // Catch: java.lang.Exception -> L7d
            if (r14 != r1) goto L69
            goto L79
        L69:
            us1.a r14 = r10.labradorDao     // Catch: java.lang.Exception -> L7d
            r0.f143115w = r11     // Catch: java.lang.Exception -> L7d
            r0.f143117y = r13     // Catch: java.lang.Exception -> L7d
            r0.f143116x = r6     // Catch: java.lang.Exception -> L7d
            r0.f143114F = r4     // Catch: java.lang.Exception -> L7d
            java.lang.Object r14 = r14.mo111564c(r11, r0)     // Catch: java.lang.Exception -> L7d
            if (r14 != r1) goto L7a
        L79:
            return r1
        L7a:
            vs1.a r14 = (vs1.C36472a) r14     // Catch: java.lang.Exception -> L7d
            goto L94
        L7d:
            r13 = move-exception
        L7e:
            q83.j r14 = r0.getContext()
            bc3.AbstractC3006f0.m8721o(r14)
            tr2.n r14 = r10.logger
            java.lang.String r0 = "Failed to update symptoms with id "
            java.lang.String r0 = p088dc.AbstractC11895b.m31994m(r11, r0)
            r1 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
            r14.mo85230v(r0, r13, r1)
            r14 = r3
        L94:
            java.time.Clock r13 = r10.clock
            long r0 = r13.millis()
            long r0 = r0 - r6
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            java.lang.String r11 = "Save"
            r10.m107905g(r11, r0, r13)
            if (r14 == 0) goto Lab
            qk1.a r3 = vs1.AbstractC36473b.m116836a(r14)
        Lab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ts1.C34142a.mo93128d(long, boolean, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m107906e(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        long j7;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f143091z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f143091z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f143089x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f143091z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            long jMillis = this.clock.millis();
            try {
                InterfaceC35218a interfaceC35218a = this.labradorDao;
                bVar.f143088w = jMillis;
                bVar.f143091z = 1;
                if (interfaceC35218a.deleteAll(bVar) == enumC31071a) {
                    return enumC31071a;
                }
                j7 = jMillis;
            } catch (Exception e5) {
                e = e5;
                j7 = jMillis;
                AbstractC3006f0.m8721o(bVar.getContext());
                this.logger.mo85230v("Failed to clear table", e, new AbstractC30556a.a[0]);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = bVar.f143088w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e13) {
                e = e13;
                AbstractC3006f0.m8721o(bVar.getContext());
                this.logger.mo85230v("Failed to clear table", e, new AbstractC30556a.a[0]);
            }
        }
        m107905g("Clear", this.clock.millis() - j7, null);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, r83.a] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: f */
    public final Object m107907f(C36472a c36472a, InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        e eVar;
        long j7;
        long jMillis;
        Long l7;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f143101E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f143101E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f143104y;
        long j13 = EnumC31071a.f128113w;
        int i14 = eVar.f143101E;
        boolean z4 = true;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                long jMillis2 = this.clock.millis();
                try {
                    InterfaceC35218a interfaceC35218a = this.labradorDao;
                    eVar.f143102w = c36472a;
                    eVar.f143103x = jMillis2;
                    eVar.f143101E = 1;
                    if (interfaceC35218a.mo111566e(c36472a, eVar) == j13) {
                        return j13;
                    }
                    j7 = jMillis2;
                    jMillis = this.clock.millis() - j7;
                    l7 = new Long(c36472a.getTimeStamp());
                } catch (Exception unused) {
                    j7 = jMillis2;
                    AbstractC3006f0.m8721o(eVar.getContext());
                    z4 = false;
                    this.logger.mo85222m("Failed to save ECG reading result: " + c36472a, new AbstractC30556a.a[0]);
                    jMillis = this.clock.millis() - j7;
                    l7 = new Long(c36472a.getTimeStamp());
                } catch (Throwable th3) {
                    th = th3;
                    j13 = jMillis2;
                    m107905g("Save", this.clock.millis() - j13, new Long(c36472a.getTimeStamp()));
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = eVar.f143103x;
                c36472a = (C36472a) eVar.f143102w;
                try {
                    AbstractC34132o.m107864I(obj);
                    jMillis = this.clock.millis() - j7;
                    l7 = new Long(c36472a.getTimeStamp());
                } catch (Exception unused2) {
                    AbstractC3006f0.m8721o(eVar.getContext());
                    z4 = false;
                    this.logger.mo85222m("Failed to save ECG reading result: " + c36472a, new AbstractC30556a.a[0]);
                    jMillis = this.clock.millis() - j7;
                    l7 = new Long(c36472a.getTimeStamp());
                }
            }
            m107905g("Save", jMillis, l7);
            return Boolean.valueOf(z4);
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
