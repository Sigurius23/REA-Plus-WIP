package f52;

import android.os.Build;
import com.whoop.puffin.network.BatteryPackApi;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
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
import ud3.AbstractC34846v0;
import wb3.AbstractC37056f;
import x42.C37965b;

/* JADX INFO: renamed from: f52.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$¨\u0006%"}, m65681d2 = {"Lf52/d;", "", "Lf52/c;", "fileExporter", "Lcom/whoop/puffin/network/BatteryPackApi;", "batteryPackApi", "", "modelString", "releaseVersion", "Lx42/b;", "batteryPackMetricWriter", "Ltr2/n;", "logger", "<init>", "(Lf52/c;Lcom/whoop/puffin/network/BatteryPackApi;Ljava/lang/String;Ljava/lang/String;Lx42/b;Ltr2/n;)V", "", "isConsole", "f", "(ZLq83/d;)Ljava/lang/Object;", "", "headers", "Lud3/v0;", "body", "Lpg3/v0;", "Ll83/a0;", "c", "(ZLjava/util/Map;Lud3/v0;Lq83/d;)Ljava/lang/Object;", "e", "(Lq83/d;)Ljava/lang/Object;", "d", "a", "Lf52/c;", "b", "Lcom/whoop/puffin/network/BatteryPackApi;", "Ljava/lang/String;", "Lx42/b;", "Ltr2/n;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14106d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14105c fileExporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BatteryPackApi batteryPackApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String modelString;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String releaseVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37965b batteryPackMetricWriter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f52.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsUploader", m100430f = "BatteryPackRelativeEventsUploader.kt", m100431l = {29, 42, 51, 52, 54}, m100432m = "uploadBatteryPackRelativePackets", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f50698E;

        /* JADX INFO: renamed from: F */
        int f50699F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f50700G;

        /* JADX INFO: renamed from: I */
        int f50702I;

        /* JADX INFO: renamed from: w */
        boolean f50703w;

        /* JADX INFO: renamed from: x */
        Object f50704x;

        /* JADX INFO: renamed from: y */
        Object f50705y;

        /* JADX INFO: renamed from: z */
        Object f50706z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f50700G = obj;
            this.f50702I |= Integer.MIN_VALUE;
            return C14106d.this.m40194f(false, this);
        }
    }

    /* JADX INFO: renamed from: f52.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.sync.BatteryPackRelativeEventsUploader$uploadBatteryPackRelativePackets$result$1", m100430f = "BatteryPackRelativeEventsUploader.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC34846v0 f50707E;

        /* JADX INFO: renamed from: w */
        int f50708w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f50710y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, String> f50711z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, Map<String, String> map, AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f50710y = z4;
            this.f50711z = map;
            this.f50707E = abstractC34846v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14106d.this.new b(this.f50710y, this.f50711z, this.f50707E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f50708w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14106d c14106d = C14106d.this;
            boolean z4 = this.f50710y;
            Map<String, String> map = this.f50711z;
            AbstractC34846v0 abstractC34846v0 = this.f50707E;
            this.f50708w = 1;
            Object objM40193c = c14106d.m40193c(z4, map, abstractC34846v0, this);
            return objM40193c == enumC31071a ? enumC31071a : objM40193c;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14106d(C14105c fileExporter, BatteryPackApi batteryPackApi, String modelString, String releaseVersion, C37965b batteryPackMetricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(fileExporter, "fileExporter");
        AbstractC22676k.m65750j(batteryPackApi, "batteryPackApi");
        AbstractC22676k.m65750j(modelString, "modelString");
        AbstractC22676k.m65750j(releaseVersion, "releaseVersion");
        AbstractC22676k.m65750j(batteryPackMetricWriter, "batteryPackMetricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.fileExporter = fileExporter;
        this.batteryPackApi = batteryPackApi;
        this.modelString = modelString;
        this.releaseVersion = releaseVersion;
        this.batteryPackMetricWriter = batteryPackMetricWriter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final Object m40193c(boolean z4, Map<String, String> map, AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
        return z4 ? this.batteryPackApi.postRelativeConsoleLogEvents(map, abstractC34846v0, interfaceC30057d) : this.batteryPackApi.postRelativeFirmwareEvents(map, abstractC34846v0, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01de  */
    /* JADX WARN: Code duplicated, block: B:49:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x021c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0239  */
    /* JADX WARN: Code duplicated, block: B:58:0x023c  */
    /* JADX WARN: Code duplicated, block: B:59:0x023e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0219, code lost:
    
        if (r5.m40189h(r4, r2, r9) == r10) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40194f(boolean r26, q83.InterfaceC30057d<? super java.lang.Boolean> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f52.C14106d.m40194f(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final Object m40195d(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return m40194f(true, interfaceC30057d);
    }

    /* JADX INFO: renamed from: e */
    public final Object m40196e(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return m40194f(false, interfaceC30057d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C14106d(C14105c c14105c, BatteryPackApi batteryPackApi, String str, String RELEASE, C37965b c37965b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String strM74110N0 = (i13 & 4) != 0 ? AbstractC25265s.m74110N0(AbstractC37056f.m118959K(Build.BRAND, Build.MANUFACTURER, Build.MODEL, Build.DEVICE), "|", null, null, null, 62) : str;
        if ((i13 & 8) != 0) {
            RELEASE = Build.VERSION.RELEASE;
            AbstractC22676k.m65749i(RELEASE, "RELEASE");
        }
        this(c14105c, batteryPackApi, strM74110N0, RELEASE, c37965b, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BatteryPackRelativeEventsUploader") : interfaceC34116n);
    }
}
