package sh2;

import c93.InterfaceC4339a;
import com.whoop.strapauth.certificatetransfer.CertificateTransferException;
import ec3.AbstractC13091v;
import ec3.InterfaceC13075p1;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36083i;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import xj0.AbstractC38334b;
import zj0.C40727h;
import zj0.EnumC40721f;

/* JADX INFO: renamed from: sh2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0003(&$BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0017\u0010\u0015J\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b#\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b4\u00103¨\u00065"}, m65681d2 = {"Lsh2/e;", "Lvk0/j;", "", "certificate", "Lkotlin/Function0;", "Ll83/a0;", "onExecuteStart", "Ltr2/n;", "logger", "", "taskName", "Lec3/p1;", "Lvk0/k;", "serviceFlow", "Lvk0/i;", "iGattService", "<init>", "([BLc93/a;Ltr2/n;Ljava/lang/String;Lec3/p1;Lec3/p1;)V", "gattService", "Lsh2/c;", "j", "(Lvk0/i;Lq83/d;)Ljava/lang/Object;", "Lsh2/e$b;", "g", "Lxj0/b;", "packet", "Lzj0/h;", "i", "(Lvk0/i;Lxj0/b;Lq83/d;)Ljava/lang/Object;", "Lsh2/e$c;", "step", "Lsh2/e$b$a;", "f", "(Lsh2/e$c;)Lsh2/e$b$a;", "Lvk0/e;", "x", "a", "[B", "b", "Lc93/a;", "c", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ltr2/n;", "d", "Ljava/lang/String;", "F", "()Ljava/lang/String;", "e", "Lec3/p1;", "o", "()Lec3/p1;", "l", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32514e implements InterfaceC36084j {

    /* JADX INFO: renamed from: h */
    private static final long f134659h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final byte[] certificate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a onExecuteStart;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String taskName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13075p1 iGattService;

    /* JADX INFO: renamed from: sh2.e$b */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lsh2/e$b;", "", "a", "b", "Lsh2/e$b$a;", "Lsh2/e$b$b;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {

        /* JADX INFO: renamed from: sh2.e$b$a */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lsh2/e$b$a;", "Lsh2/e$b;", "Lsh2/c;", "result", "<init>", "(Lsh2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsh2/c;", "()Lsh2/c;", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC32512c result;

            public a(AbstractC32512c result) {
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC32512c getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.result, ((a) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "Finished(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: sh2.e$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lsh2/e$b$b;", "Lsh2/e$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42322b implements b {

            /* JADX INFO: renamed from: a */
            public static final C42322b f134667a = new C42322b();

            private C42322b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C42322b);
            }

            public int hashCode() {
                return -663573168;
            }

            public String toString() {
                return "Incomplete";
            }
        }
    }

    /* JADX INFO: renamed from: sh2.e$c */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lsh2/e$c;", "", "<init>", "(Ljava/lang/String;I)V", "Lsh2/c$b;", "toFailureReason", "()Lsh2/c$b;", "START", "LOAD", "VERIFY", "PROCESS", "strap-auth_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum c {
        START,
        LOAD,
        VERIFY,
        PROCESS;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: sh2.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f134668a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.LOAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.VERIFY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.PROCESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f134668a = iArr;
            }
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final AbstractC32512c.b toFailureReason() {
            int i13 = a.f134668a[ordinal()];
            if (i13 == 1) {
                return AbstractC32512c.b.START_FAILED;
            }
            if (i13 == 2) {
                return AbstractC32512c.b.LOAD_FAILED;
            }
            if (i13 == 3) {
                return AbstractC32512c.b.VERIFY_FAILED;
            }
            if (i13 == 4) {
                return AbstractC32512c.b.PROCESS_FAILED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: sh2.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134669a;

        static {
            int[] iArr = new int[EnumC40721f.values().length];
            try {
                iArr[EnumC40721f.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC40721f.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC40721f.INCOMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f134669a = iArr;
        }
    }

    /* JADX INFO: renamed from: sh2.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.certificatetransfer.CertificateTransferTask", m100430f = "CertificateTransferTask.kt", m100431l = {39}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f134670w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f134671x;

        /* JADX INFO: renamed from: z */
        int f134673z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134671x = obj;
            this.f134673z |= Integer.MIN_VALUE;
            return C32514e.this.mo23655x(null, this);
        }
    }

    /* JADX INFO: renamed from: sh2.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.certificatetransfer.CertificateTransferTask", m100430f = "CertificateTransferTask.kt", m100431l = {62, 67, 72, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "runSequence", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f134674E;

        /* JADX INFO: renamed from: G */
        int f134676G;

        /* JADX INFO: renamed from: w */
        Object f134677w;

        /* JADX INFO: renamed from: x */
        Object f134678x;

        /* JADX INFO: renamed from: y */
        int f134679y;

        /* JADX INFO: renamed from: z */
        int f134680z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134674E = obj;
            this.f134676G |= Integer.MIN_VALUE;
            return C32514e.this.m101525g(null, this);
        }
    }

    /* JADX INFO: renamed from: sh2.e$g */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.certificatetransfer.CertificateTransferTask", m100430f = "CertificateTransferTask.kt", m100431l = {86}, m100432m = "sendCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f134681E;

        /* JADX INFO: renamed from: w */
        Object f134682w;

        /* JADX INFO: renamed from: x */
        Object f134683x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f134684y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134684y = obj;
            this.f134681E |= Integer.MIN_VALUE;
            return C32514e.this.m101526i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: sh2.e$h */
    @InterfaceC32271e(m100429c = "com.whoop.strapauth.certificatetransfer.CertificateTransferTask", m100430f = "CertificateTransferTask.kt", m100431l = {51}, m100432m = "transfer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f134686E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f134687F;

        /* JADX INFO: renamed from: H */
        int f134689H;

        /* JADX INFO: renamed from: w */
        Object f134690w;

        /* JADX INFO: renamed from: x */
        int f134691x;

        /* JADX INFO: renamed from: y */
        int f134692y;

        /* JADX INFO: renamed from: z */
        int f134693z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f134687F = obj;
            this.f134689H |= Integer.MIN_VALUE;
            return C32514e.this.m101527j(null, this);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f134659h = DurationKt.toDuration(5, DurationUnit.SECONDS);
    }

    public C32514e(byte[] certificate, InterfaceC4339a onExecuteStart, InterfaceC34116n logger, String taskName, InterfaceC13075p1 serviceFlow, InterfaceC13075p1 iGattService) {
        AbstractC22676k.m65750j(certificate, "certificate");
        AbstractC22676k.m65750j(onExecuteStart, "onExecuteStart");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(taskName, "taskName");
        AbstractC22676k.m65750j(serviceFlow, "serviceFlow");
        AbstractC22676k.m65750j(iGattService, "iGattService");
        this.certificate = certificate;
        this.onExecuteStart = onExecuteStart;
        this.logger = logger;
        this.taskName = taskName;
        this.serviceFlow = serviceFlow;
        this.iGattService = iGattService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m101520b() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private final b.a m101524f(c step) {
        getLogger().mo85222m("Certificate transfer failed at " + step, new AbstractC30556a.a[0]);
        return new b.a(new AbstractC32512c.a(step.toFailureReason()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a7 -> B:34:0x00aa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: g */
    public final java.lang.Object m101525g(vk0.InterfaceC36083i r11, q83.InterfaceC30057d<? super sh2.C32514e.b> r12) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.C32514e.m101525g(vk0.i, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m101526i(InterfaceC36083i interfaceC36083i, AbstractC38334b abstractC38334b, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        g gVar;
        Object objM114608r0;
        AbstractC38334b abstractC38334b2;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f134681E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f134681E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f134684y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f134681E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            long j7 = f134659h;
            gVar2.f134682w = null;
            gVar2.f134683x = abstractC38334b;
            gVar2.f134681E = 1;
            objM114608r0 = InterfaceC36083i.m114608r0(interfaceC36083i, abstractC38334b, j7, false, gVar2, 4, null);
            if (objM114608r0 == enumC31071a) {
                return enumC31071a;
            }
            abstractC38334b2 = abstractC38334b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC38334b2 = (AbstractC38334b) gVar2.f134683x;
            AbstractC34132o.m107864I(obj);
            objM114608r0 = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM114608r0);
        if (thM68037a != null) {
            getLogger().mo85230v(abstractC38334b2 + " failed", thM68037a, new AbstractC30556a.a[0]);
        }
        if (objM114608r0 instanceof C23467m) {
            objM114608r0 = null;
        }
        C40727h c40727h = (C40727h) objM114608r0;
        if (c40727h == null || !c40727h.m132198W()) {
            return null;
        }
        return c40727h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: j */
    public final java.lang.Object m101527j(vk0.InterfaceC36083i r10, q83.InterfaceC30057d<? super sh2.AbstractC32512c> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof sh2.C32514e.h
            if (r0 == 0) goto L13
            r0 = r11
            sh2.e$h r0 = (sh2.C32514e.h) r0
            int r1 = r0.f134689H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134689H = r1
            goto L18
        L13:
            sh2.e$h r0 = new sh2.e$h
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f134687F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f134689H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            int r10 = r0.f134693z
            int r2 = r0.f134692y
            int r5 = r0.f134691x
            java.lang.Object r6 = r0.f134690w
            vk0.i r6 = (vk0.InterfaceC36083i) r6
            p505ts.AbstractC34132o.m107864I(r11)
            goto L59
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            p505ts.AbstractC34132o.m107864I(r11)
            r11 = 2
            r5 = r11
            r11 = r10
            r10 = r3
        L41:
            if (r10 >= r5) goto L8a
            r0.f134690w = r11
            r0.f134691x = r5
            r0.f134692y = r10
            r0.f134693z = r10
            r0.f134686E = r3
            r0.f134689H = r4
            java.lang.Object r2 = r9.m101525g(r11, r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r6 = r11
            r11 = r2
            r2 = r10
        L59:
            sh2.e$b r11 = (sh2.C32514e.b) r11
            boolean r7 = r11 instanceof sh2.C32514e.b.a
            if (r7 == 0) goto L66
            sh2.e$b$a r11 = (sh2.C32514e.b.a) r11
            sh2.c r10 = r11.getResult()
            return r10
        L66:
            sh2.e$b$b r7 = sh2.C32514e.b.C42322b.f134667a
            boolean r11 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r11, r7)
            if (r11 == 0) goto L84
            tr2.n r11 = r9.getLogger()
            int r10 = r10 + r4
            java.lang.String r7 = "Verify reported incomplete on attempt "
            java.lang.String r8 = ", restarting from Start"
            java.lang.String r10 = p031b9.AbstractC2875y.m8296i(r10, r7, r8)
            qr2.a$a[] r7 = new qr2.AbstractC30556a.a[r3]
            r11.mo85226q(r10, r7)
            int r10 = r2 + 1
            r11 = r6
            goto L41
        L84:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L8a:
            sh2.c$a r10 = new sh2.c$a
            sh2.c$b r11 = sh2.AbstractC32512c.b.TRANSFER_INCOMPLETE
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.C32514e.m101527j(vk0.i, q83.d):java.lang.Object");
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: F, reason: from getter */
    public String getTaskName() {
        return this.taskName;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: H */
    public /* bridge */ Object mo23651H(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return super.mo23651H(interfaceC36083i, interfaceC30057d);
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: h, reason: from getter */
    public InterfaceC34116n getLogger() {
        return this.logger;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: l, reason: from getter */
    public InterfaceC13075p1 getIGattService() {
        return this.iGattService;
    }

    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13075p1 getServiceFlow() {
        return this.serviceFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vk0.InterfaceC36084j
    /* JADX INFO: renamed from: x */
    public Object mo23655x(InterfaceC36083i interfaceC36083i, InterfaceC30057d<? super InterfaceC36079e> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f134673z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f134673z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM101527j = eVar.f134671x;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f134673z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM101527j);
            this.onExecuteStart.invoke();
            getLogger().mo85216g(AbstractC2875y.m8296i(this.certificate.length, "Starting certificate transfer of ", " bytes"), new AbstractC30556a.a[0]);
            eVar.f134670w = null;
            eVar.f134673z = 1;
            objM101527j = m101527j(interfaceC36083i, eVar);
            if (objM101527j == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM101527j);
        }
        AbstractC32512c abstractC32512c = (AbstractC32512c) objM101527j;
        getLogger().mo85216g("Certificate transfer finished: " + abstractC32512c, new AbstractC30556a.a[0]);
        return abstractC32512c instanceof AbstractC32512c.d ? new InterfaceC36079e.b(null) : new InterfaceC36079e.a(new CertificateTransferException(abstractC32512c));
    }

    public /* synthetic */ C32514e(byte[] bArr, InterfaceC4339a interfaceC4339a, InterfaceC34116n interfaceC34116n, String str, InterfaceC13075p1 interfaceC13075p1, InterfaceC13075p1 interfaceC13075p2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i13 & 2) != 0 ? new C32513d(0) : interfaceC4339a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("CertificateTransferTask") : interfaceC34116n, (i13 & 8) != 0 ? "CertificateTransferTask" : str, (i13 & 16) != 0 ? AbstractC13091v.m36593c(InterfaceC36085k.a.f154178a) : interfaceC13075p1, (i13 & 32) != 0 ? AbstractC13091v.m36593c(null) : interfaceC13075p2);
    }
}
