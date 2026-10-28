package y42;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l83.C23454a0;
import md3.InterfaceC25455a;
import md3.InterfaceC25456b;
import md3.InterfaceC25457c;
import md3.InterfaceC25459e;
import nd3.C26591a;
import no.nordicsemi.android.ble.AbstractC26884b;
import no.nordicsemi.android.ble.AbstractC26886c;
import no.nordicsemi.android.ble.C26891e0;
import no.nordicsemi.android.ble.C26895g0;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qd3.InterfaceC30297b;
import qr2.AbstractC30556a;
import qt0.C30586b;
import qt0.InterfaceC30585a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ys0.InterfaceC39750a;

/* JADX INFO: renamed from: y42.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B1\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u001aJ\u001f\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J#\u00106\u001a\u00020\"2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020403H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0018H\u0016¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b<\u0010;J\u0017\u0010>\u001a\u00020=2\u0006\u0010%\u001a\u00020\u0016H\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010I\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\bG\u0010\u0011\u001a\u0004\bH\u0010\u0012¨\u0006J"}, m65681d2 = {"Ly42/d;", "Lno/nordicsemi/android/ble/c;", "Lqd3/b;", "Lys0/a;", "Ltr2/n;", "logger", "Landroid/content/Context;", "context", "Lys0/a$a;", "puffinBleHandlerCallback", "Lqt0/a;", "bleScanner", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltr2/n;Landroid/content/Context;Lys0/a$a;Lqt0/a;Lbc3/c0;)V", "", "I", "()I", "Lno/nordicsemi/android/ble/b;", "H", "()Lno/nordicsemi/android/ble/b;", "Landroid/bluetooth/BluetoothDevice;", "device", "Ll83/a0;", "t", "(Landroid/bluetooth/BluetoothDevice;)V", "f", "reason", "e", "(Landroid/bluetooth/BluetoothDevice;I)V", "c", "u", "q", "", "k", "()Z", "bluetoothDevice", "a", "(Landroid/bluetooth/BluetoothDevice;)Z", "x", "d", "force", "y", "(Z)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "bluetoothGattCharacteristic", "", "data", "z", "(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z", "", "Lys0/a$b;", "chars", "b", "(Ljava/util/Map;)Z", "v", "()V", "p0", "(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;", "o0", "", "m0", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "Ltr2/n;", "l", "Lys0/a$a;", "m", "Lqt0/a;", "n", "Lbc3/c0;", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "maxTransmissionUnit", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@SuppressLint({"MissingPermission"})
public final class C39222d extends AbstractC26886c implements InterfaceC30297b, InterfaceC39750a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC39750a.a puffinBleHandlerCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC30585a bleScanner;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int maxTransmissionUnit;

    /* JADX INFO: renamed from: y42.d$a */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, m65681d2 = {"Ly42/d$a;", "Lno/nordicsemi/android/ble/b;", "<init>", "(Ly42/d;)V", "Ll83/a0;", "F1", "()V", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "T1", "(Landroid/bluetooth/BluetoothGatt;)Z", "j2", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a extends AbstractC26884b {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o2 */
        public static final void m124953o2(C39222d c39222d, BluetoothDevice it) {
            AbstractC22676k.m65750j(it, "it");
            c39222d.logger.mo85228t("Successfully set MTU to 247", new AbstractC30556a.a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p2 */
        public static final void m124954p2(C39222d c39222d, BluetoothDevice bluetoothDevice, int i13) {
            AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
            c39222d.logger.mo85222m(AbstractC2875y.m8295h(i13, "Failed to set MTU to 247 status = "), new AbstractC30556a.a[0]);
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: F1 */
        public void mo80309F1() {
            C26895g0 c26895g0M80255X = C39222d.this.m80255X(247);
            C39222d c39222d = C39222d.this;
            c26895g0M80255X.f107388g = new C39221c(c39222d);
            c26895g0M80255X.f107389h = new C39221c(c39222d);
            c26895g0M80255X.m80359b();
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: T1 */
        public boolean mo80230T1(BluetoothGatt gatt) {
            AbstractC22676k.m65750j(gatt, "gatt");
            InterfaceC39750a.a aVar = C39222d.this.puffinBleHandlerCallback;
            List<BluetoothGattService> services = gatt.getServices();
            AbstractC22676k.m65749i(services, "getServices(...)");
            return aVar.mo106392c1(services);
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: j2 */
        public void mo80231j2() {
            C39222d.this.puffinBleHandlerCallback.mo106374F0();
        }
    }

    /* JADX INFO: renamed from: y42.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinBleManager$connectDevice$1", m100430f = "PuffinBleManager.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ long f168534E;

        /* JADX INFO: renamed from: w */
        int f168535w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ BluetoothDevice f168537y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f168538z;

        /* JADX INFO: renamed from: y42.d$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinBleManager$connectDevice$1$success$1", m100430f = "PuffinBleManager.kt", m100431l = {121, 127, 135}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/Object;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ BluetoothDevice f168539E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ long f168540F;

            /* JADX INFO: renamed from: w */
            boolean f168541w;

            /* JADX INFO: renamed from: x */
            boolean f168542x;

            /* JADX INFO: renamed from: y */
            int f168543y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C39222d f168544z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C39222d c39222d, BluetoothDevice bluetoothDevice, long j7, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f168544z = c39222d;
                this.f168539E = bluetoothDevice;
                this.f168540F = j7;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f168544z, this.f168539E, this.f168540F, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<Object> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0026  */
            /* JADX WARN: Code duplicated, block: B:16:0x0034 A[PHI: r11
              0x0034: PHI (r11v1 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:14:0x0030, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:18:0x003c  */
            /* JADX WARN: Code duplicated, block: B:22:0x0066 A[PHI: r1 r11
              0x0066: PHI (r1v3 boolean) = (r1v1 boolean), (r1v7 boolean) binds: [B:20:0x0063, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]
              0x0066: PHI (r11v9 java.lang.Object) = (r11v4 java.lang.Object), (r11v0 java.lang.Object) binds: [B:20:0x0063, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:24:0x006e  */
            /* JADX WARN: Code duplicated, block: B:26:0x008a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:13:0x0026). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // s83.AbstractC32267a
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r10.f168543y
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1f
                    if (r1 == r3) goto L19
                    if (r1 != r2) goto L11
                    goto L23
                L11:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L19:
                    boolean r1 = r10.f168541w
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L66
                L1f:
                    p505ts.AbstractC34132o.m107864I(r11)
                    goto L34
                L23:
                    p505ts.AbstractC34132o.m107864I(r11)
                L26:
                    y42.d r11 = r10.f168544z
                    android.bluetooth.BluetoothDevice r1 = r10.f168539E
                    r10.f168543y = r4
                    java.lang.Object r11 = y42.C39222d.m124946l0(r11, r1, r10)
                    if (r11 != r0) goto L34
                    goto Lb3
                L34:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r1 = r11.booleanValue()
                    if (r1 != 0) goto L57
                    y42.d r11 = r10.f168544z
                    tr2.n r11 = y42.C39222d.m124941g0(r11)
                    y42.d r6 = r10.f168544z
                    android.bluetooth.BluetoothDevice r7 = r10.f168539E
                    java.lang.String r6 = y42.C39222d.m124943i0(r6, r7)
                    java.lang.String r7 = "Device "
                    java.lang.String r8 = " not found during scan. Retrying..."
                    java.lang.String r6 = p088dc.AbstractC11895b.m31996o(r7, r6, r8)
                    qr2.a$a[] r7 = new qr2.AbstractC30556a.a[r5]
                    r11.mo85226q(r6, r7)
                L57:
                    y42.d r11 = r10.f168544z
                    android.bluetooth.BluetoothDevice r6 = r10.f168539E
                    r10.f168541w = r1
                    r10.f168543y = r3
                    java.lang.Object r11 = y42.C39222d.m124945k0(r11, r6, r10)
                    if (r11 != r0) goto L66
                    goto Lb3
                L66:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L8a
                    y42.d r11 = r10.f168544z
                    tr2.n r11 = y42.C39222d.m124941g0(r11)
                    y42.d r0 = r10.f168544z
                    android.bluetooth.BluetoothDevice r1 = r10.f168539E
                    java.lang.String r0 = y42.C39222d.m124943i0(r0, r1)
                    java.lang.String r1 = "Successfully connected to "
                    java.lang.String r0 = p000.AbstractC11266d.m30461o(r1, r0)
                    qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r5]
                    r11.mo85216g(r0, r1)
                    java.lang.Boolean r11 = java.lang.Boolean.TRUE
                    return r11
                L8a:
                    y42.d r6 = r10.f168544z
                    tr2.n r6 = y42.C39222d.m124941g0(r6)
                    y42.d r7 = r10.f168544z
                    android.bluetooth.BluetoothDevice r8 = r10.f168539E
                    java.lang.String r7 = y42.C39222d.m124943i0(r7, r8)
                    java.lang.String r8 = "Connection to "
                    java.lang.String r9 = " failed. Retrying..."
                    java.lang.String r7 = p088dc.AbstractC11895b.m31996o(r8, r7, r9)
                    qr2.a$a[] r8 = new qr2.AbstractC30556a.a[r5]
                    r6.mo85226q(r7, r8)
                    long r6 = r10.f168540F
                    r10.f168541w = r1
                    r10.f168542x = r11
                    r10.f168543y = r2
                    java.lang.Object r11 = bc3.AbstractC3034m0.m8782b(r6, r10)
                    if (r11 != r0) goto L26
                Lb3:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: y42.C39222d.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BluetoothDevice bluetoothDevice, long j7, long j13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168537y = bluetoothDevice;
            this.f168538z = j7;
            this.f168534E = j13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39222d.this.new b(this.f168537y, this.f168538z, this.f168534E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168535w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C39222d.this.logger.mo85216g(AbstractC11266d.m30461o("Starting scan and connect loop for ", C39222d.this.m124947m0(this.f168537y)), new AbstractC30556a.a[0]);
                long j7 = this.f168538z;
                a aVar = new a(C39222d.this, this.f168537y, this.f168534E, null);
                this.f168535w = 1;
                obj = AbstractC3028k2.m8751e(j7, aVar, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (obj == null) {
                C39222d.this.logger.mo85222m(AbstractC31061c.m95640p("Failed to connect to ", C39222d.this.m124947m0(this.f168537y), " after ", Duration.m134302toStringimpl(this.f168538z)), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y42.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC25455a {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ BluetoothDevice f168546x;

        public c(BluetoothDevice bluetoothDevice) {
            this.f168546x = bluetoothDevice;
        }

        @Override // md3.InterfaceC25455a
        /* JADX INFO: renamed from: a */
        public final void mo74862a(BluetoothDevice it) {
            AbstractC22676k.m65750j(it, "it");
            C39222d.this.logger.mo85216g(AbstractC11266d.m30461o("Attempting connection to ", C39222d.this.m124947m0(this.f168546x)), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: y42.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC25459e {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC3025k f168547w;

        public d(InterfaceC3025k interfaceC3025k) {
            this.f168547w = interfaceC3025k;
        }

        @Override // md3.InterfaceC25459e
        /* JADX INFO: renamed from: d */
        public final void mo9035d(BluetoothDevice it) {
            AbstractC22676k.m65750j(it, "it");
            this.f168547w.resumeWith(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: y42.d$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC25457c {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ BluetoothDevice f168549x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC3025k f168550y;

        public e(BluetoothDevice bluetoothDevice, InterfaceC3025k interfaceC3025k) {
            this.f168549x = bluetoothDevice;
            this.f168550y = interfaceC3025k;
        }

        @Override // md3.InterfaceC25457c
        /* JADX INFO: renamed from: c */
        public final void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
            AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
            C39222d.this.logger.mo85226q(AbstractC25012a.m73374g(i13, "Connection failed to ", C39222d.this.m124947m0(this.f168549x), " with status "), new AbstractC30556a.a[0]);
            this.f168550y.resumeWith(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: y42.d$f */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinBleManager", m100430f = "PuffinBleManager.kt", m100431l = {147}, m100432m = "tryScanForDevice", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f168551w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168552x;

        /* JADX INFO: renamed from: z */
        int f168554z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168552x = obj;
            this.f168554z |= Integer.MIN_VALUE;
            return C39222d.this.m124950p0(null, this);
        }
    }

    /* JADX INFO: renamed from: y42.d$g */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinBleManager$tryScanForDevice$2", m100430f = "PuffinBleManager.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lqt0/b;", "<anonymous>", "(Lbc3/c0;)Lqt0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168555w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ BluetoothDevice f168557y;

        /* JADX INFO: renamed from: y42.d$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinBleManager$tryScanForDevice$2$1", m100430f = "PuffinBleManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lqt0/b;", "it", "", "<anonymous>", "(Lqt0/b;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f168558w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f168559x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ BluetoothDevice f168560y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f168560y = bluetoothDevice;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f168560y, interfaceC30057d);
                aVar.f168559x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C30586b c30586b, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(c30586b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C30586b c30586b = (C30586b) this.f168559x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f168558w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(AbstractC22676k.m65745e(c30586b.getAddress(), this.f168560y.getAddress()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168557y = bluetoothDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39222d.this.new g(this.f168557y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C30586b> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168555w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13058l interfaceC13058lMo1485b = C39222d.this.bleScanner.getStartScan();
            a aVar = new a(this.f168557y, null);
            this.f168555w = 1;
            Object objM36576B = AbstractC13091v.m36576B(interfaceC13058lMo1485b, aVar, this);
            return objM36576B == enumC31071a ? enumC31071a : objM36576B;
        }
    }

    public /* synthetic */ C39222d(InterfaceC34116n interfaceC34116n, Context context, InterfaceC39750a.a aVar, InterfaceC30585a interfaceC30585a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinBleManager") : interfaceC34116n, context, aVar, interfaceC30585a, interfaceC2994c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final String m124947m0(BluetoothDevice bluetoothDevice) {
        String name = bluetoothDevice.getName();
        if (name != null) {
            return name;
        }
        String address = bluetoothDevice.getAddress();
        AbstractC22676k.m65749i(address, "getAddress(...)");
        return address;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m124948n0(InterfaceC39750a.b bVar, C39222d c39222d, BluetoothDevice bluetoothDevice, C26591a data) {
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        AbstractC22676k.m65750j(data, "data");
        try {
            byte[] bArr = data.f105756w;
            AbstractC22676k.m65748h(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
            bVar.mo106402a(bArr);
        } catch (Exception e5) {
            c39222d.logger.mo85230v("Failed to notify characteristic changed", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public final Object m124949o0(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        C26891e0 c26891e0M80234C = m80234C(bluetoothDevice);
        c26891e0M80234C.f107387f = new c(bluetoothDevice);
        c26891e0M80234C.f107388g = new d(c3033m);
        c26891e0M80234C.f107389h = new e(bluetoothDevice, c3033m);
        c26891e0M80234C.f107352r = 2;
        c26891e0M80234C.m80359b();
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p0 */
    public final Object m124950p0(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f168554z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f168554z = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM8750d = fVar.f168552x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f168554z;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8750d);
                g gVar = new g(bluetoothDevice, null);
                fVar.f168551w = bluetoothDevice;
                fVar.f168554z = 1;
                objM8750d = AbstractC3028k2.m8750d(5000L, gVar, fVar);
                if (objM8750d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bluetoothDevice = (BluetoothDevice) fVar.f168551w;
                AbstractC34132o.m107864I(objM8750d);
            }
            if (objM8750d != null) {
                z4 = true;
            }
        } catch (Exception e5) {
            this.logger.mo85230v(AbstractC11266d.m30461o("Scan failed for ", m124947m0(bluetoothDevice)), e5, new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: H */
    public AbstractC26884b mo80239H() {
        return new a();
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: I */
    public int mo80240I() {
        return 2;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: a */
    public boolean mo100524a(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        return true;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: b */
    public boolean mo100525b(Map<BluetoothGattCharacteristic, ? extends InterfaceC39750a.b> chars) {
        AbstractC22676k.m65750j(chars, "chars");
        if (!chars.isEmpty()) {
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : chars.keySet()) {
                InterfaceC39750a.b bVar = chars.get(bluetoothGattCharacteristic);
                AbstractC22676k.m65748h(bVar, "null cannot be cast to non-null type com.whoop.connectivityCore.ble.IBleHandler.CharacteristicNotificationCallback");
                final InterfaceC39750a.b bVar2 = bVar;
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                this.logger.mo85216g("Registering " + uuid + " for notifications with callback: " + bVar2.getName(), new AbstractC30556a.a[0]);
                m80258a0(bluetoothGattCharacteristic).f107405a = new InterfaceC25456b() { // from class: y42.b
                    @Override // md3.InterfaceC25456b
                    /* JADX INFO: renamed from: a */
                    public final void mo74863a(BluetoothDevice bluetoothDevice, C26591a c26591a) {
                        C39222d.m124948n0(bVar2, this, bluetoothDevice, c26591a);
                    }
                };
                try {
                    m80237F(bluetoothGattCharacteristic).m80365k();
                } catch (Exception e5) {
                    if (e5 instanceof RequestFailedException) {
                        this.logger.mo85222m("Failed to register notifications for " + uuid + " with status: " + ((RequestFailedException) e5).f107358w, new AbstractC30556a.a[0]);
                    } else if (e5 instanceof NullPointerException) {
                        this.logger.mo85230v("Caught a NullPointerException while trying to register for notifications synchronously", e5, new AbstractC30556a.a[0]);
                    } else {
                        this.logger.mo85230v("Failed to register notifications for " + uuid, e5, new AbstractC30556a.a[0]);
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: c */
    public void mo92600c(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.puffinBleHandlerCallback.mo106391c(device);
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: d */
    public void mo100526d(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        m80236E().m80359b();
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: e */
    public void mo92601e(BluetoothDevice device, int reason) {
        AbstractC22676k.m65750j(device, "device");
        this.puffinBleHandlerCallback.mo106387X0(device, reason, "Failed to connect");
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: f */
    public void mo92602f(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.puffinBleHandlerCallback.mo106376L(device);
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: k */
    public boolean mo100527k() {
        return false;
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: q */
    public void mo92603q(BluetoothDevice device, int reason) {
        AbstractC22676k.m65750j(device, "device");
        this.puffinBleHandlerCallback.mo106384V(device);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: t */
    public void mo92604t(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.puffinBleHandlerCallback.mo106372C0(device);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: u */
    public void mo92605u(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.puffinBleHandlerCallback.mo106380P(device);
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: v */
    public void mo100528v() {
        close();
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: w, reason: from getter */
    public int getMaxTransmissionUnit() {
        return this.maxTransmissionUnit;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: x */
    public void mo100530x(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        Duration.Companion companion = Duration.INSTANCE;
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(bluetoothDevice, DurationKt.toDuration(60, DurationUnit.SECONDS), 1000L, null), 3);
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: y */
    public void mo100531y(boolean force) {
        if (force) {
            m80253V().m80359b();
        }
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: z */
    public boolean mo100532z(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] data) {
        AbstractC22676k.m65750j(bluetoothGattCharacteristic, "bluetoothGattCharacteristic");
        AbstractC22676k.m65750j(data, "data");
        m80261d0(bluetoothGattCharacteristic, data, 2).m80359b();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39222d(InterfaceC34116n logger, Context context, InterfaceC39750a.a puffinBleHandlerCallback, InterfaceC30585a bleScanner, InterfaceC2994c0 coroutineScope) {
        super(context, new Handler(Looper.getMainLooper()));
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(puffinBleHandlerCallback, "puffinBleHandlerCallback");
        AbstractC22676k.m65750j(bleScanner, "bleScanner");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.logger = logger;
        this.puffinBleHandlerCallback = puffinBleHandlerCallback;
        this.bleScanner = bleScanner;
        this.coroutineScope = coroutineScope;
        m80257Z(this);
        this.maxTransmissionUnit = 247;
    }
}
