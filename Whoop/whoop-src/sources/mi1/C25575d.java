package mi1;

import ak0.C0945g;
import ak0.EnumC0944f;
import b82.InterfaceC2804a;
import ci2.InterfaceC4733b;
import com.whoop.domain.model.haptics.NotificationHapticsPattern;
import jk0.InterfaceC21750d;
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
import st0.EnumC32978v;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: mi1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0011B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lmi1/d;", "", "Ltr2/n;", "logger", "Lmi1/a;", "maverickHaptics", "Lb82/a;", "harvardHaptics", "Lci2/b;", "whoopStrapProvider", "<init>", "(Ltr2/n;Lmi1/a;Lb82/a;Lci2/b;)V", "", "d", "(Lq83/d;)Ljava/lang/Object;", "e", "f", "a", "Ltr2/n;", "b", "Lmi1/a;", "c", "Lb82/a;", "Lci2/b;", "Ljk0/d;", "()Ljk0/d;", "iWhoopStrap", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25575d {

    /* JADX INFO: renamed from: e */
    private static final a f100301e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final NotificationHapticsPattern f100302f = new NotificationHapticsPattern(47, 152, 0, 0, 0, 0, 0, 0, 0, 1);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC25572a maverickHaptics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2804a harvardHaptics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: mi1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lmi1/d$a;", "", "<init>", "()V", "", "HARVARD_STRAIN_SEQUENCE_ID", "I", "HARVARD_STRAIN_SEQUENCE_LOOPS", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: mi1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100307a;

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
            f100307a = iArr;
        }
    }

    /* JADX INFO: renamed from: mi1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.HapticsWrapper", m100430f = "HapticsWrapper.kt", m100431l = {49}, m100432m = "runHapticsOnHarvard", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f100308w;

        /* JADX INFO: renamed from: y */
        int f100310y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100308w = obj;
            this.f100310y |= Integer.MIN_VALUE;
            return C25575d.this.m75194d(this);
        }
    }

    /* JADX INFO: renamed from: mi1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.HapticsWrapper", m100430f = "HapticsWrapper.kt", m100431l = {56}, m100432m = "runHapticsOnMaverick", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f100311w;

        /* JADX INFO: renamed from: y */
        int f100313y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100311w = obj;
            this.f100313y |= Integer.MIN_VALUE;
            return C25575d.this.m75195e(this);
        }
    }

    public C25575d(InterfaceC34116n logger, InterfaceC25572a maverickHaptics, InterfaceC2804a harvardHaptics, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(maverickHaptics, "maverickHaptics");
        AbstractC22676k.m65750j(harvardHaptics, "harvardHaptics");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.logger = logger;
        this.maverickHaptics = maverickHaptics;
        this.harvardHaptics = harvardHaptics;
        this.whoopStrapProvider = whoopStrapProvider;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC21750d m75193c() {
        return (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m75194d(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f100310y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f100310y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objMo7990a = cVar.f100308w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f100310y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo7990a);
            InterfaceC2804a interfaceC2804a = this.harvardHaptics;
            cVar.f100310y = 1;
            objMo7990a = interfaceC2804a.mo7990a(2, 0, cVar);
            if (objMo7990a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo7990a);
        }
        C0945g c0945g = (C0945g) objMo7990a;
        EnumC0944f enumC0944fM2381X = c0945g != null ? c0945g.m2381X() : null;
        EnumC0944f enumC0944f = EnumC0944f.SUCCESS;
        this.logger.mo85228t("Haptics Result: " + (c0945g != null ? c0945g.m2381X() : null), new AbstractC30556a.a[0]);
        return Boolean.valueOf(enumC0944fM2381X == enumC0944f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m75195e(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f100313y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f100313y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objMo75188d = dVar.f100311w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f100313y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75188d);
            InterfaceC25572a interfaceC25572a = this.maverickHaptics;
            NotificationHapticsPattern notificationHapticsPattern = f100302f;
            dVar.f100313y = 1;
            objMo75188d = interfaceC25572a.mo75188d(notificationHapticsPattern, dVar);
            if (objMo75188d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75188d);
        }
        AbstractC25573b abstractC25573b = (AbstractC25573b) objMo75188d;
        Boolean boolValueOf = Boolean.valueOf(abstractC25573b instanceof AbstractC25573b.c);
        this.logger.mo85228t("Maverick Haptics Result: " + abstractC25573b, new AbstractC30556a.a[0]);
        return boolValueOf;
    }

    /* JADX INFO: renamed from: f */
    public final Object m75196f(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM75193c = m75193c();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM75193c != null ? interfaceC21750dM75193c.mo24752w0() : null;
        switch (enumC32978vMo24752w0 == null ? -1 : b.f100307a[enumC32978vMo24752w0.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                return Boolean.FALSE;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 4:
                return m75194d(interfaceC30057d);
            case 5:
            case 6:
                return m75195e(interfaceC30057d);
        }
    }

    public /* synthetic */ C25575d(InterfaceC34116n interfaceC34116n, InterfaceC25572a interfaceC25572a, InterfaceC2804a interfaceC2804a, InterfaceC4733b interfaceC4733b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StrainCoachHapticsWrapper") : interfaceC34116n, interfaceC25572a, interfaceC2804a, interfaceC4733b);
    }
}
