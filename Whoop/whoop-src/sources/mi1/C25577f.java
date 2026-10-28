package mi1;

import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.mapbox.common.logger.LogPriority;
import com.whoop.domain.model.haptics.AlarmHapticsPattern;
import com.whoop.domain.model.haptics.StrapAlarmIdentifiable;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import ek0.C13271a;
import ek0.C13272a0;
import ek0.C13274b0;
import ek0.C13301z;
import f82.EnumC14250a;
import f82.InterfaceC14252c;
import g82.InterfaceC15574a;
import j93.InterfaceC21461d;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import m83.C25262p;
import ot0.C28323a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: mi1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001$B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010\u0019J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b$\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lmi1/f;", "Lmi1/e;", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "Lf82/c;", "gen4StrapAlarmSdk", "Lmi1/a;", "maverickHapticsStrapService", "Lg82/a;", "smartAlarmDiagnosticDbHelper", "<init>", "(Ltr2/n;Lci2/b;Lf82/c;Lmi1/a;Lg82/a;)V", "Lot0/a;", "eventPacket", "Ll83/a0;", "l", "(Lot0/a;)V", "", "durationSeconds", "", "b", "(ILq83/d;)Ljava/lang/Object;", "c", "(Lq83/d;)Ljava/lang/Object;", "", "timeStampMillis", "e", "(JLq83/d;)Ljava/lang/Object;", "Lmi1/b;", "g", "Lf82/b;", "smartAlarmTrigger", "d", "(Lf82/b;Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "Lci2/b;", "Lf82/c;", "Lmi1/a;", "Lg82/a;", "Lec3/l;", "f", "Ll83/h;", "()Lec3/l;", "alarmEventPacketsFlow", "Ljk0/d;", "k", "()Ljk0/d;", "whoopStrap", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25577f implements InterfaceC25576e {

    /* JADX INFO: renamed from: g */
    private static final a f100314g = new a(null);

    /* JADX INFO: renamed from: h */
    private static final StrapAlarmIdentifiable f100315h = new StrapAlarmIdentifiable(1);

    /* JADX INFO: renamed from: i */
    private static final AlarmHapticsPattern f100316i = new AlarmHapticsPattern(47, 152, 0, 0, 0, 0, 0, 0, 0, 7, 30, 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14252c gen4StrapAlarmSdk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25572a maverickHapticsStrapService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC15574a smartAlarmDiagnosticDbHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h alarmEventPacketsFlow;

    /* JADX INFO: renamed from: mi1.f$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lmi1/f$a;", "", "<init>", "()V", "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;", "maverickStrapAlarmIdentifiable", "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "maverickStrapAlarmHaptics", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: mi1.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100323a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f100324b;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f100323a = iArr;
            int[] iArr2 = new int[C28323a.b.values().length];
            try {
                iArr2[C28323a.b.STRAP_DRIVEN_ALARM_SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[C28323a.b.STRAP_DRIVEN_ALARM_EXECUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[C28323a.b.APP_DRIVEN_ALARM_EXECUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[C28323a.b.STRAP_DRIVEN_ALARM_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f100324b = iArr2;
        }
    }

    /* JADX INFO: renamed from: mi1.f$c */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl$alarmEventPacketsFlow$2$1", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lot0/a;", "it", "Ll83/a0;", "<anonymous>", "(Lot0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100325w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100326x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C25577f.this.new c(interfaceC30057d);
            cVar.f100326x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C28323a c28323a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c28323a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C28323a c28323a = (C28323a) this.f100326x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100325w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C25577f.this.m75208l(c28323a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mi1.f$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {194, 197}, m100432m = "disableAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f100328w;

        /* JADX INFO: renamed from: y */
        int f100330y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100328w = obj;
            this.f100330y |= Integer.MIN_VALUE;
            return C25577f.this.mo75197a(this);
        }
    }

    /* JADX INFO: renamed from: mi1.f$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {85, 88}, m100432m = "enterHighFreqSyncMode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f100331w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100332x;

        /* JADX INFO: renamed from: z */
        int f100334z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100332x = obj;
            this.f100334z |= Integer.MIN_VALUE;
            return C25577f.this.mo75198b(0, this);
        }
    }

    /* JADX INFO: renamed from: mi1.f$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {LogPriority.NONE, 102}, m100432m = "exitHighFreqSyncMode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f100335w;

        /* JADX INFO: renamed from: y */
        int f100337y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100335w = obj;
            this.f100337y |= Integer.MIN_VALUE;
            return C25577f.this.mo75199c(this);
        }
    }

    /* JADX INFO: renamed from: mi1.f$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {147, 153}, m100432m = "getAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f100338w;

        /* JADX INFO: renamed from: y */
        int f100340y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100338w = obj;
            this.f100340y |= Integer.MIN_VALUE;
            return C25577f.this.mo75203g(this);
        }
    }

    /* JADX INFO: renamed from: mi1.f$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {172, 175}, m100432m = "runAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f100341w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100342x;

        /* JADX INFO: renamed from: z */
        int f100344z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100342x = obj;
            this.f100344z |= Integer.MIN_VALUE;
            return C25577f.this.mo75200d(null, this);
        }
    }

    /* JADX INFO: renamed from: mi1.f$i */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl", m100430f = "SmartAlarmHapticsWrapperImpl.kt", m100431l = {113, 117}, m100432m = "setAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f100345w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100346x;

        /* JADX INFO: renamed from: z */
        int f100348z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100346x = obj;
            this.f100348z |= Integer.MIN_VALUE;
            return C25577f.this.mo75201e(0L, this);
        }
    }

    public C25577f(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider, InterfaceC14252c gen4StrapAlarmSdk, InterfaceC25572a maverickHapticsStrapService, InterfaceC15574a smartAlarmDiagnosticDbHelper) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(gen4StrapAlarmSdk, "gen4StrapAlarmSdk");
        AbstractC22676k.m65750j(maverickHapticsStrapService, "maverickHapticsStrapService");
        AbstractC22676k.m65750j(smartAlarmDiagnosticDbHelper, "smartAlarmDiagnosticDbHelper");
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
        this.gen4StrapAlarmSdk = gen4StrapAlarmSdk;
        this.maverickHapticsStrapService = maverickHapticsStrapService;
        this.smartAlarmDiagnosticDbHelper = smartAlarmDiagnosticDbHelper;
        this.alarmEventPacketsFlow = AbstractC30060g.m92088H(new C25262p(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC13058l m75206j(C25577f c25577f) {
        InterfaceC21750d interfaceC21750dM75207k = c25577f.m75207k();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM75207k != null ? interfaceC21750dM75207k.mo24752w0() : null;
        int i13 = enumC32978vMo24752w0 == null ? -1 : b.f100323a[enumC32978vMo24752w0.ordinal()];
        int i14 = 0;
        InterfaceC13058l interfaceC13058l = C13054k.f45116w;
        switch (i13) {
            case -1:
            case 1:
            case 2:
            case 3:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
            case 5:
            case 6:
                InterfaceC21750d interfaceC21750dM75207k2 = c25577f.m75207k();
                if (interfaceC21750dM75207k2 != null) {
                    C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                    InterfaceC13058l interfaceC13058lMo24750v = interfaceC21750dM75207k2.mo24750v(AbstractC25260n.m74059b1(new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(C13272a0.class), c22673i0.getOrCreateKotlinClass(C13271a.class), c22673i0.getOrCreateKotlinClass(C13301z.class), c22673i0.getOrCreateKotlinClass(C13274b0.class)}));
                    if (interfaceC13058lMo24750v != null) {
                        interfaceC13058l = interfaceC13058lMo24750v;
                    }
                }
                break;
        }
        return new C13052j1(interfaceC13058l, c25577f.new c(null), i14);
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC21750d m75207k() {
        return (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m75208l(C28323a eventPacket) {
        C28323a.b bVarM85785R = eventPacket.m85785R();
        int i13 = bVarM85785R == null ? -1 : b.f100324b[bVarM85785R.ordinal()];
        if (i13 == 1) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.STRAP_DRIVEN_ALARM_SET, eventPacket);
            return;
        }
        if (i13 == 2) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.STRAP_DRIVEN_ALARM_EXECUTED, eventPacket);
        } else if (i13 == 3) {
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.APP_DRIVEN_ALARM_EXECUTED, eventPacket);
        } else {
            if (i13 != 4) {
                return;
            }
            this.smartAlarmDiagnosticDbHelper.mo43870a(EnumC14250a.STRAP_DRIVEN_ALARM_DISABLED, eventPacket);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r9 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r9 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        return r0;
     */
    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75197a(q83.InterfaceC30057d<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof mi1.C25577f.d
            if (r0 == 0) goto L14
            r0 = r9
            mi1.f$d r0 = (mi1.C25577f.d) r0
            int r1 = r0.f100330y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f100330y = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            mi1.f$d r0 = new mi1.f$d
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f100328w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r4.f100330y
            r2 = 2
            r3 = 1
            r7 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p505ts.AbstractC34132o.m107864I(r9)
            goto L70
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            p505ts.AbstractC34132o.m107864I(r9)
            goto L85
        L39:
            p505ts.AbstractC34132o.m107864I(r9)
            jk0.d r9 = r8.m75207k()
            if (r9 == 0) goto L47
            st0.v r9 = r9.mo24752w0()
            goto L48
        L47:
            r9 = 0
        L48:
            if (r9 != 0) goto L4c
            r9 = -1
            goto L54
        L4c:
            int[] r1 = mi1.C25577f.b.f100323a
            int r9 = r9.ordinal()
            r9 = r1[r9]
        L54:
            switch(r9) {
                case -1: goto L78;
                case 0: goto L57;
                case 1: goto L78;
                case 2: goto L78;
                case 3: goto L78;
                case 4: goto L7a;
                case 5: goto L5d;
                case 6: goto L5d;
                default: goto L57;
            }
        L57:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L5d:
            jk0.d r1 = r8.m75207k()
            if (r1 == 0) goto L78
            r4.f100330y = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = jk0.InterfaceC21750d.m61383t0(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L70
            goto L84
        L70:
            zj0.j r9 = (zj0.C40733j) r9
            if (r9 == 0) goto L78
            boolean r7 = r9.m132198W()
        L78:
            r5 = r7
            goto L8e
        L7a:
            f82.c r9 = r8.gen4StrapAlarmSdk
            r4.f100330y = r3
            java.lang.Object r9 = r9.mo40722a(r4)
            if (r9 != r0) goto L85
        L84:
            return r0
        L85:
            zj0.j r9 = (zj0.C40733j) r9
            if (r9 == 0) goto L78
            boolean r7 = r9.m132198W()
            goto L78
        L8e:
            g82.a r0 = r8.smartAlarmDiagnosticDbHelper
            f82.a r1 = f82.EnumC14250a.PHONE_DISABLED_ALARM
            java.lang.String r3 = ""
            r4 = 0
            r2 = 0
            r0.mo43871b(r1, r2, r3, r4, r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25577f.mo75197a(q83.d):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r12 == r0) goto L38;
     */
    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75198b(int r11, q83.InterfaceC30057d<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof mi1.C25577f.e
            if (r0 == 0) goto L14
            r0 = r12
            mi1.f$e r0 = (mi1.C25577f.e) r0
            int r1 = r0.f100334z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f100334z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            mi1.f$e r0 = new mi1.f$e
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f100332x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f100334z
            r9 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p505ts.AbstractC34132o.m107864I(r12)
            goto L75
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            p505ts.AbstractC34132o.m107864I(r12)
            return r12
        L39:
            p505ts.AbstractC34132o.m107864I(r12)
            jk0.d r12 = r10.m75207k()
            if (r12 == 0) goto L47
            st0.v r12 = r12.mo24752w0()
            goto L48
        L47:
            r12 = 0
        L48:
            if (r12 != 0) goto L4c
            r12 = -1
            goto L54
        L4c:
            int[] r1 = mi1.C25577f.b.f100323a
            int r12 = r12.ordinal()
            r12 = r1[r12]
        L54:
            switch(r12) {
                case -1: goto L8c;
                case 0: goto L57;
                case 1: goto L8c;
                case 2: goto L8c;
                case 3: goto L8c;
                case 4: goto L7e;
                case 5: goto L5d;
                case 6: goto L5d;
                default: goto L57;
            }
        L57:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L5d:
            jk0.d r1 = r10.m75207k()
            if (r1 == 0) goto L8c
            r6.f100331w = r11
            r6.f100334z = r2
            r2 = 180(0xb4, float:2.52E-43)
            r4 = 0
            r7 = 4
            r8 = 0
            r3 = r11
            java.lang.Object r12 = jk0.InterfaceC21750d.m61386y0(r1, r2, r3, r4, r6, r7, r8)
            if (r12 != r0) goto L75
            goto L8a
        L75:
            ak0.b r12 = (ak0.C0940b) r12
            if (r12 == 0) goto L8c
            boolean r9 = r12.m132198W()
            goto L8c
        L7e:
            f82.c r12 = r10.gen4StrapAlarmSdk
            r6.f100331w = r11
            r6.f100334z = r3
            java.lang.Object r11 = r12.mo40723b(r11, r6)
            if (r11 != r0) goto L8b
        L8a:
            return r0
        L8b:
            return r11
        L8c:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25577f.mo75198b(int, q83.d):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r9 == r0) goto L38;
     */
    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75199c(q83.InterfaceC30057d<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof mi1.C25577f.f
            if (r0 == 0) goto L14
            r0 = r9
            mi1.f$f r0 = (mi1.C25577f.f) r0
            int r1 = r0.f100337y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f100337y = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            mi1.f$f r0 = new mi1.f$f
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f100335w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r4.f100337y
            r7 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p505ts.AbstractC34132o.m107864I(r9)
            goto L70
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            p505ts.AbstractC34132o.m107864I(r9)
            return r9
        L39:
            p505ts.AbstractC34132o.m107864I(r9)
            jk0.d r9 = r8.m75207k()
            if (r9 == 0) goto L47
            st0.v r9 = r9.mo24752w0()
            goto L48
        L47:
            r9 = 0
        L48:
            if (r9 != 0) goto L4c
            r9 = -1
            goto L54
        L4c:
            int[] r1 = mi1.C25577f.b.f100323a
            int r9 = r9.ordinal()
            r9 = r1[r9]
        L54:
            switch(r9) {
                case -1: goto L85;
                case 0: goto L57;
                case 1: goto L85;
                case 2: goto L85;
                case 3: goto L85;
                case 4: goto L79;
                case 5: goto L5d;
                case 6: goto L5d;
                default: goto L57;
            }
        L57:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L5d:
            jk0.d r1 = r8.m75207k()
            if (r1 == 0) goto L85
            r4.f100337y = r2
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = jk0.InterfaceC21750d.m61368B(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L70
            goto L83
        L70:
            zj0.k r9 = (zj0.C40736k) r9
            if (r9 == 0) goto L85
            boolean r7 = r9.m132198W()
            goto L85
        L79:
            f82.c r9 = r8.gen4StrapAlarmSdk
            r4.f100337y = r3
            java.lang.Object r9 = r9.mo40724c(r4)
            if (r9 != r0) goto L84
        L83:
            return r0
        L84:
            return r9
        L85:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25577f.mo75199c(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        return r1;
     */
    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75200d(f82.EnumC14251b r11, q83.InterfaceC30057d<? super java.lang.Boolean> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof mi1.C25577f.h
            if (r0 == 0) goto L13
            r0 = r12
            mi1.f$h r0 = (mi1.C25577f.h) r0
            int r1 = r0.f100344z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100344z = r1
            goto L18
        L13:
            mi1.f$h r0 = new mi1.f$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f100342x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f100344z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r11 = r0.f100341w
            f82.b r11 = (f82.EnumC14251b) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L72
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            java.lang.Object r11 = r0.f100341w
            f82.b r11 = (f82.EnumC14251b) r11
            p505ts.AbstractC34132o.m107864I(r12)
            goto L84
        L3f:
            p505ts.AbstractC34132o.m107864I(r12)
            jk0.d r12 = r10.m75207k()
            if (r12 == 0) goto L4d
            st0.v r12 = r12.mo24752w0()
            goto L4e
        L4d:
            r12 = 0
        L4e:
            if (r12 != 0) goto L52
            r12 = -1
            goto L5a
        L52:
            int[] r2 = mi1.C25577f.b.f100323a
            int r12 = r12.ordinal()
            r12 = r2[r12]
        L5a:
            switch(r12) {
                case -1: goto L74;
                case 0: goto L5d;
                case 1: goto L74;
                case 2: goto L74;
                case 3: goto L74;
                case 4: goto L77;
                case 5: goto L63;
                case 6: goto L63;
                default: goto L5d;
            }
        L5d:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L63:
            mi1.a r12 = r10.maverickHapticsStrapService
            com.whoop.domain.model.haptics.StrapAlarmIdentifiable r2 = mi1.C25577f.f100315h
            r0.f100341w = r11
            r0.f100344z = r4
            java.lang.Object r12 = r12.mo75186b(r2, r0)
            if (r12 != r1) goto L72
            goto L83
        L72:
            boolean r3 = r12 instanceof mi1.AbstractC25573b.c
        L74:
            r6 = r11
            r9 = r3
            goto L8d
        L77:
            f82.c r12 = r10.gen4StrapAlarmSdk
            r0.f100341w = r11
            r0.f100344z = r5
            java.lang.Object r12 = r12.mo40725d(r11, r0)
            if (r12 != r1) goto L84
        L83:
            return r1
        L84:
            zj0.p0 r12 = (zj0.C40749p0) r12
            if (r12 == 0) goto L74
            boolean r3 = r12.m132198W()
            goto L74
        L8d:
            g82.a r4 = r10.smartAlarmDiagnosticDbHelper
            f82.a r5 = f82.EnumC14250a.PHONE_RUN_ALARM
            java.lang.String r7 = ""
            r8 = 0
            r4.mo43871b(r5, r6, r7, r8, r9)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25577f.mo75200d(f82.b, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        return r1;
     */
    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75201e(long r7, q83.InterfaceC30057d<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof mi1.C25577f.i
            if (r0 == 0) goto L13
            r0 = r9
            mi1.f$i r0 = (mi1.C25577f.i) r0
            int r1 = r0.f100348z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100348z = r1
            goto L18
        L13:
            mi1.f$i r0 = new mi1.f$i
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f100346x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f100348z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            long r7 = r0.f100345w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L79
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            long r7 = r0.f100345w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L8c
        L3b:
            p505ts.AbstractC34132o.m107864I(r9)
            jk0.d r9 = r6.m75207k()
            if (r9 == 0) goto L49
            st0.v r9 = r9.mo24752w0()
            goto L4a
        L49:
            r9 = 0
        L4a:
            if (r9 != 0) goto L4e
            r9 = -1
            goto L56
        L4e:
            int[] r2 = mi1.C25577f.b.f100323a
            int r9 = r9.ordinal()
            r9 = r2[r9]
        L56:
            switch(r9) {
                case -1: goto L7d;
                case 0: goto L59;
                case 1: goto L7d;
                case 2: goto L7d;
                case 3: goto L7d;
                case 4: goto L7f;
                case 5: goto L5f;
                case 6: goto L5f;
                default: goto L59;
            }
        L59:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L5f:
            mi1.a r9 = r6.maverickHapticsStrapService
            com.whoop.domain.model.haptics.StoredAlarm r2 = new com.whoop.domain.model.haptics.StoredAlarm
            com.whoop.domain.model.haptics.StrapAlarmIdentifiable r3 = mi1.C25577f.f100315h
            com.whoop.domain.model.haptics.AlarmHapticsPattern r5 = mi1.C25577f.f100316i
            r2.<init>(r3, r5, r7)
            java.util.List r2 = wb3.AbstractC37056f.m118958J(r2)
            r0.f100345w = r7
            r0.f100348z = r4
            java.lang.Object r9 = r9.mo75185a(r2, r0)
            if (r9 != r1) goto L79
            goto L8b
        L79:
            mi1.b r9 = (mi1.AbstractC25573b) r9
            boolean r3 = r9 instanceof mi1.AbstractC25573b.c
        L7d:
            r5 = r3
            goto L95
        L7f:
            f82.c r9 = r6.gen4StrapAlarmSdk
            r0.f100345w = r7
            r0.f100348z = r5
            java.lang.Object r9 = r9.mo40726e(r7, r0)
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            zj0.v0 r9 = (zj0.C40761v0) r9
            if (r9 == 0) goto L7d
            boolean r3 = r9.m132198W()
            goto L7d
        L95:
            g82.a r0 = r6.smartAlarmDiagnosticDbHelper
            f82.a r1 = f82.EnumC14250a.PHONE_SET_ALARM_TIME
            java.lang.String r3 = java.lang.String.valueOf(r7)
            r4 = 0
            r2 = 0
            r0.mo43871b(r1, r2, r3, r4, r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25577f.mo75201e(long, q83.d):java.lang.Object");
    }

    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: f */
    public InterfaceC13058l mo75202f() {
        return (InterfaceC13058l) this.alarmEventPacketsFlow.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        return r1;
     */
    @Override // mi1.InterfaceC25576e
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75203g(q83.InterfaceC30057d<? super mi1.AbstractC25573b> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mi1.C25577f.g
            if (r0 == 0) goto L13
            r0 = r7
            mi1.f$g r0 = (mi1.C25577f.g) r0
            int r1 = r0.f100340y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100340y = r1
            goto L18
        L13:
            mi1.f$g r0 = new mi1.f$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f100338w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f100340y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L79
        L36:
            p505ts.AbstractC34132o.m107864I(r7)
            jk0.d r7 = r6.m75207k()
            if (r7 == 0) goto L44
            st0.v r7 = r7.mo24752w0()
            goto L45
        L44:
            r7 = 0
        L45:
            if (r7 != 0) goto L49
            r7 = -1
            goto L51
        L49:
            int[] r2 = mi1.C25577f.b.f100323a
            int r7 = r7.ordinal()
            r7 = r2[r7]
        L51:
            switch(r7) {
                case -1: goto L8f;
                case 0: goto L54;
                case 1: goto L8f;
                case 2: goto L8f;
                case 3: goto L8f;
                case 4: goto L6e;
                case 5: goto L5a;
                case 6: goto L5a;
                default: goto L54;
            }
        L54:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L5a:
            mi1.a r7 = r6.maverickHapticsStrapService
            com.whoop.domain.model.haptics.StrapAlarmIdentifiable r2 = mi1.C25577f.f100315h
            int r2 = r2.getStrapAlarmId()
            r0.f100340y = r3
            java.lang.Object r7 = r7.mo75187c(r2, r0)
            if (r7 != r1) goto L6b
            goto L78
        L6b:
            mi1.b r7 = (mi1.AbstractC25573b) r7
            goto L96
        L6e:
            f82.c r7 = r6.gen4StrapAlarmSdk
            r0.f100340y = r4
            java.lang.Object r7 = r7.mo40727g(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            zj0.m r7 = (zj0.C40742m) r7
            if (r7 == 0) goto L8c
            mi1.b$a r0 = new mi1.b$a
            boolean r1 = r7.m132230d0()
            long r2 = r7.m132186c0()
            r0.<init>(r1, r2)
            r7 = r0
            goto L96
        L8c:
            mi1.b$d r7 = mi1.AbstractC25573b.d.f100272a
            goto L96
        L8f:
            mi1.b$e r7 = new mi1.b$e
            java.lang.String r0 = "Not compatible!"
            r7.<init>(r0)
        L96:
            g82.a r0 = r6.smartAlarmDiagnosticDbHelper
            f82.a r1 = f82.EnumC14250a.PHONE_GET_ALARM_TIME
            r4 = 0
            boolean r5 = r7 instanceof mi1.AbstractC25573b.a
            r2 = 0
            java.lang.String r3 = ""
            r0.mo43871b(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25577f.mo75203g(q83.d):java.lang.Object");
    }

    public /* synthetic */ C25577f(InterfaceC34116n interfaceC34116n, InterfaceC4733b interfaceC4733b, InterfaceC14252c interfaceC14252c, InterfaceC25572a interfaceC25572a, InterfaceC15574a interfaceC15574a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SmartAlarmHapticsWrapperImpl") : interfaceC34116n, interfaceC4733b, interfaceC14252c, interfaceC25572a, interfaceC15574a);
    }
}
