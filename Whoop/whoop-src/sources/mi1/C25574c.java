package mi1;

import ci2.InterfaceC4733b;
import com.whoop.domain.model.haptics.HapticsAlarmStatusMessage;
import com.whoop.domain.model.haptics.NotificationHapticsPattern;
import com.whoop.domain.model.haptics.StrapAlarmIdentifiable;
import jk0.InterfaceC21750d;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import xj0.AbstractC38356i0;
import xj0.C38359j0;
import zj0.C40742m;
import zj0.C40749p0;
import zj0.C40751q0;

/* JADX INFO: renamed from: mi1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lmi1/c;", "Lmi1/a;", "Ltr2/n;", "logger", "Lci2/b;", "whoopStrapProvider", "<init>", "(Ltr2/n;Lci2/b;)V", "Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;", "notificationHapticsPattern", "Lmi1/b;", "d", "(Lcom/whoop/domain/model/haptics/NotificationHapticsPattern;Lq83/d;)Ljava/lang/Object;", "", "alarmId", "c", "(ILq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/domain/model/haptics/StoredAlarm;", "storedAlarmList", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;", "strapAlarmIdentifiable", "b", "(Lcom/whoop/domain/model/haptics/StrapAlarmIdentifiable;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "Lci2/b;", "Ljk0/d;", "e", "()Ljk0/d;", "whoopStrap", "hapticsStrapService_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25574c implements InterfaceC25572a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: mi1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.HapticsStrapServiceImpl", m100430f = "HapticsStrapServiceImpl.kt", m100431l = {61}, m100432m = "getAlarms", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f100277E;

        /* JADX INFO: renamed from: w */
        int f100278w;

        /* JADX INFO: renamed from: x */
        Object f100279x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100280y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100280y = obj;
            this.f100277E |= Integer.MIN_VALUE;
            return C25574c.this.mo75187c(0, this);
        }
    }

    /* JADX INFO: renamed from: mi1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.HapticsStrapServiceImpl", m100430f = "HapticsStrapServiceImpl.kt", m100431l = {110}, m100432m = "runAlarms", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f100282E;

        /* JADX INFO: renamed from: w */
        Object f100283w;

        /* JADX INFO: renamed from: x */
        Object f100284x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100285y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100285y = obj;
            this.f100282E |= Integer.MIN_VALUE;
            return C25574c.this.mo75186b(null, this);
        }
    }

    /* JADX INFO: renamed from: mi1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.HapticsStrapServiceImpl", m100430f = "HapticsStrapServiceImpl.kt", m100431l = {51}, m100432m = "runPattern", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f100288F;

        /* JADX INFO: renamed from: w */
        Object f100289w;

        /* JADX INFO: renamed from: x */
        Object f100290x;

        /* JADX INFO: renamed from: y */
        Object f100291y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f100292z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100292z = obj;
            this.f100288F |= Integer.MIN_VALUE;
            return C25574c.this.mo75188d(null, this);
        }
    }

    /* JADX INFO: renamed from: mi1.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.hapticsstrapservice.HapticsStrapServiceImpl", m100430f = "HapticsStrapServiceImpl.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 102}, m100432m = "setAlarms", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f100293E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f100294F;

        /* JADX INFO: renamed from: H */
        int f100296H;

        /* JADX INFO: renamed from: w */
        Object f100297w;

        /* JADX INFO: renamed from: x */
        Object f100298x;

        /* JADX INFO: renamed from: y */
        Object f100299y;

        /* JADX INFO: renamed from: z */
        Object f100300z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100294F = obj;
            this.f100296H |= Integer.MIN_VALUE;
            return C25574c.this.mo75185a(null, this);
        }
    }

    public C25574c(InterfaceC34116n logger, InterfaceC4733b whoopStrapProvider) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        this.logger = logger;
        this.whoopStrapProvider = whoopStrapProvider;
    }

    /* JADX INFO: renamed from: e */
    private final InterfaceC21750d m75190e() {
        return (InterfaceC21750d) this.whoopStrapProvider.mo14817a().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r0 == r3) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a3 -> B:27:0x00a6). Please report as a decompilation issue!!! */
    @Override // mi1.InterfaceC25572a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo75185a(java.util.List<com.whoop.domain.model.haptics.StoredAlarm> r19, q83.InterfaceC30057d<? super mi1.AbstractC25573b> r20) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.C25574c.mo75185a(java.util.List, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // mi1.InterfaceC25572a
    /* JADX INFO: renamed from: b */
    public Object mo75186b(StrapAlarmIdentifiable strapAlarmIdentifiable, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f100282E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f100282E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM61371J0 = bVar2.f100285y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f100282E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61371J0);
            InterfaceC21750d interfaceC21750dM75190e = m75190e();
            if (interfaceC21750dM75190e == null) {
                return AbstractC25573b.f.f100274a;
            }
            AbstractC38356i0.b bVar3 = new AbstractC38356i0.b(strapAlarmIdentifiable.getStrapAlarmId());
            bVar2.f100283w = null;
            bVar2.f100284x = null;
            bVar2.f100282E = 1;
            objM61371J0 = InterfaceC21750d.m61371J0(interfaceC21750dM75190e, 0L, bVar3, bVar2, 1, null);
            if (objM61371J0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61371J0);
        }
        C40749p0 c40749p0 = (C40749p0) objM61371J0;
        if (c40749p0 == null) {
            return AbstractC25573b.d.f100272a;
        }
        return c40749p0.m132198W() ? new AbstractC25573b.c(c40749p0.m132241d0()) : new AbstractC25573b.b(c40749p0.m132241d0());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // mi1.InterfaceC25572a
    /* JADX INFO: renamed from: c */
    public Object mo75187c(int i13, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f100277E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f100277E = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM61381r = aVar2.f100280y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar2.f100277E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM61381r);
            InterfaceC21750d interfaceC21750dM75190e = m75190e();
            if (interfaceC21750dM75190e == null) {
                return AbstractC25573b.f.f100274a;
            }
            aVar2.f100279x = null;
            aVar2.f100278w = i13;
            aVar2.f100277E = 1;
            objM61381r = InterfaceC21750d.m61381r(interfaceC21750dM75190e, 0L, i13, aVar2, 1, null);
            if (objM61381r == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61381r);
        }
        C40742m c40742m = (C40742m) objM61381r;
        if (c40742m == null) {
            return AbstractC25573b.d.f100272a;
        }
        if (c40742m.m132198W()) {
            return new AbstractC25573b.a(c40742m.m132186c0() != 0, c40742m.m132186c0());
        }
        return new AbstractC25573b.b(HapticsAlarmStatusMessage.UNKNOWN);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // mi1.InterfaceC25572a
    /* JADX INFO: renamed from: d */
    public Object mo75188d(NotificationHapticsPattern notificationHapticsPattern, InterfaceC30057d<? super AbstractC25573b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f100288F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f100288F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM61387z0 = cVar2.f100292z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f100288F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61387z0);
            InterfaceC21750d interfaceC21750dM75190e = m75190e();
            if (interfaceC21750dM75190e == null) {
                return AbstractC25573b.f.f100274a;
            }
            C38359j0 c38359j0 = new C38359j0(notificationHapticsPattern);
            cVar2.f100289w = null;
            cVar2.f100290x = null;
            cVar2.f100291y = null;
            cVar2.f100288F = 1;
            objM61387z0 = InterfaceC21750d.m61387z0(interfaceC21750dM75190e, c38359j0, 0L, cVar2, 2, null);
            if (objM61387z0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61387z0);
        }
        C40751q0 c40751q0 = (C40751q0) objM61387z0;
        if (c40751q0 == null) {
            return AbstractC25573b.d.f100272a;
        }
        return c40751q0.m132198W() ? new AbstractC25573b.c(c40751q0.getStatusMessage()) : new AbstractC25573b.b(c40751q0.getStatusMessage());
    }
}
