package s92;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import c92.C4329a;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.exception.ConnectivityException;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m32.InterfaceC25005a;
import md3.InterfaceC25456b;
import nd3.C26591a;
import no.nordicsemi.android.ble.AbstractC26884b;
import no.nordicsemi.android.ble.AbstractC26886c;
import no.nordicsemi.android.ble.AbstractC26903k0;
import no.nordicsemi.android.ble.C26891e0;
import no.nordicsemi.android.ble.C26895g0;
import no.nordicsemi.android.ble.C26905l0;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import qd3.InterfaceC30296a;
import qd3.InterfaceC30297b;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import rr2.InterfaceC31766c;
import tr2.InterfaceC34116n;
import tt0.AbstractC34156a;
import ys0.InterfaceC39750a;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: s92.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00017Bc\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b,\u0010+J\u001f\u0010.\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b0\u0010+J\u0017\u00101\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b1\u0010+J\u001f\u00102\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b2\u0010/J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002032\u0006\u00106\u001a\u00020(H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0016¢\u0006\u0004\b9\u0010+J\u0017\u0010:\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0016¢\u0006\u0004\b:\u0010+J\u0017\u0010<\u001a\u00020 2\u0006\u0010;\u001a\u000203H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u0002032\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ#\u0010G\u001a\u0002032\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020E0DH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bI\u0010+J\u0017\u0010J\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010+J\u0017\u0010K\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bK\u0010+J\u000f\u0010L\u001a\u000203H\u0002¢\u0006\u0004\bL\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010MR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010PR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010QR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010RR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001cR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u001d¨\u0006]"}, m65681d2 = {"Ls92/e;", "Lno/nordicsemi/android/ble/c;", "Lqd3/b;", "Lqd3/a;", "Lys0/a;", "Landroid/content/Context;", "context", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lys0/a$a;", "bleHandlerCallback", "Lc92/a;", "bluetoothHelper", "Lrr2/c;", "crashReporter", "Lm32/a;", "permissionChecker", "", "", "requiredPermissions", "", "sdkVersion", "Landroid/os/Handler;", "handler", "Landroid/os/HandlerThread;", "handlerThread", "<init>", "(Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Lys0/a$a;Lc92/a;Lrr2/c;Lm32/a;Ljava/util/List;ILandroid/os/Handler;Landroid/os/HandlerThread;)V", "I", "()I", "priority", "message", "Ll83/a0;", "P", "(ILjava/lang/String;)V", "Lno/nordicsemi/android/ble/b;", "H", "()Lno/nordicsemi/android/ble/b;", "v", "()V", "Landroid/bluetooth/BluetoothDevice;", "device", "t", "(Landroid/bluetooth/BluetoothDevice;)V", "f", "reason", "e", "(Landroid/bluetooth/BluetoothDevice;I)V", "c", "u", "q", "", "k", "()Z", "bluetoothDevice", "a", "(Landroid/bluetooth/BluetoothDevice;)Z", "x", "d", "force", "y", "(Z)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "bluetoothGattCharacteristic", "", "data", "z", "(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z", "", "Lys0/a$b;", "chars", "b", "(Ljava/util/Map;)Z", "o", "m", "n", "m0", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "l", "Lys0/a$a;", "Lc92/a;", "Lrr2/c;", "Lm32/a;", "p", "Ljava/util/List;", "r", "Landroid/os/HandlerThread;", "Ltr2/n;", "s", "Ltr2/n;", "logger", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "maxTransmissionUnit", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32297e extends AbstractC26886c implements InterfaceC30297b, InterfaceC30296a, InterfaceC39750a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC39750a.a bleHandlerCallback;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C4329a bluetoothHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC25005a permissionChecker;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final List<String> requiredPermissions;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int sdkVersion;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private HandlerThread handlerThread;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: s92.e$a */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0006¨\u0006\u000e"}, m65681d2 = {"Ls92/e$a;", "Lno/nordicsemi/android/ble/b;", "<init>", "(Ls92/e;)V", "Ll83/a0;", "F1", "()V", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "T1", "(Landroid/bluetooth/BluetoothGatt;)Z", "f2", "j2", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a extends AbstractC26884b {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o2 */
        public static final void m100545o2(C32297e c32297e, BluetoothDevice it) {
            AbstractC22676k.m65750j(it, "it");
            c32297e.logger.mo85228t("Successfully set MTU to 247", new AbstractC30556a.a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p2 */
        public static final void m100546p2(C32297e c32297e, BluetoothDevice bluetoothDevice, int i13) {
            AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
            c32297e.logger.mo85222m(AbstractC2875y.m8295h(i13, "Failed to set MTU to 247 status = "), new AbstractC30556a.a[0]);
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: F1 */
        public void mo80309F1() {
            C32297e.this.logger.mo85216g("bleManagerGattCallback initialize", new AbstractC30556a.a[0]);
            C26895g0 c26895g0M80255X = C32297e.this.m80255X(247);
            C32297e c32297e = C32297e.this;
            c26895g0M80255X.f107388g = new C32296d(c32297e);
            c26895g0M80255X.f107389h = new C32296d(c32297e);
            c26895g0M80255X.m80359b();
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: T1 */
        public boolean mo80230T1(BluetoothGatt gatt) {
            AbstractC22676k.m65750j(gatt, "gatt");
            InterfaceC39750a.a aVar = C32297e.this.bleHandlerCallback;
            List<BluetoothGattService> services = gatt.getServices();
            AbstractC22676k.m65749i(services, "getServices(...)");
            return aVar.mo106392c1(services);
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: f2 */
        public void mo80336f2() {
        }

        @Override // no.nordicsemi.android.ble.AbstractC26887c0
        /* JADX INFO: renamed from: j2 */
        public void mo80231j2() {
            C32297e.this.bleHandlerCallback.mo106374F0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32297e(Context context, FeatureFlagChecker featureFlagChecker, InterfaceC39750a.a bleHandlerCallback, C4329a bluetoothHelper, InterfaceC31766c crashReporter, InterfaceC25005a permissionChecker, List<String> requiredPermissions, int i13, Handler handler, HandlerThread handlerThread) {
        super(context, handler);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(bleHandlerCallback, "bleHandlerCallback");
        AbstractC22676k.m65750j(bluetoothHelper, "bluetoothHelper");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(permissionChecker, "permissionChecker");
        AbstractC22676k.m65750j(requiredPermissions, "requiredPermissions");
        AbstractC22676k.m65750j(handler, "handler");
        this.featureFlagChecker = featureFlagChecker;
        this.bleHandlerCallback = bleHandlerCallback;
        this.bluetoothHelper = bluetoothHelper;
        this.crashReporter = crashReporter;
        this.permissionChecker = permissionChecker;
        this.requiredPermissions = requiredPermissions;
        this.sdkVersion = i13;
        this.handlerThread = handlerThread;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("NordicBleHandlerMigrationImpl");
        m80257Z(this);
        m80256Y(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final void m100539k0(C32297e c32297e, long j7, BluetoothDevice it) {
        AbstractC22676k.m65750j(it, "it");
        c32297e.logger.mo85216g(AbstractC31061c.m95636l(j7, "Connect request starting execution for request id: ", ", autoConnect: false"), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final void m100540l0(C32297e c32297e, long j7, BluetoothDevice bluetoothDevice, int i13) {
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        c32297e.logger.mo85226q("Connection request id: " + j7 + " failed with status: " + AbstractC32298f.m100548b(i13), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: m0 */
    private final boolean m100541m0() {
        List<String> list = this.requiredPermissions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!this.permissionChecker.mo73346a((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final void m100542n0(InterfaceC39750a.b bVar, C32297e c32297e, BluetoothDevice bluetoothDevice, C26591a data) {
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        AbstractC22676k.m65750j(data, "data");
        byte[] bArr = data.f105756w;
        try {
            AbstractC22676k.m65748h(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
            bVar.mo106402a(bArr);
        } catch (Exception e5) {
            String strM30461o = AbstractC11266d.m30461o("Failed to notify characteristic changed for data - ", AbstractC40586b.m131618c(bArr));
            c32297e.crashReporter.mo98631p(e5);
            c32297e.logger.mo85230v(strM30461o, e5, new AbstractC30556a.a[0]);
        }
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

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: P */
    public void mo80247P(int priority, String message) {
        AbstractC22676k.m65750j(message, "message");
        if (this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.ENABLE_BLEMANAGER_VERBOSE_LOGGING)) {
            this.logger.mo85217h(priority, "BleManager", message, null);
        }
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: a */
    public boolean mo100524a(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (m80244M()) {
            this.logger.mo85228t("Device already bonded", new AbstractC30556a.a[0]);
            return true;
        }
        try {
            AbstractC26903k0 abstractC26903k0M80235D = m80235D();
            AbstractC22676k.m65748h(abstractC26903k0M80235D, "null cannot be cast to non-null type no.nordicsemi.android.ble.SimpleRequest");
            ((C26905l0) abstractC26903k0M80235D).m80364k();
        } catch (Exception e5) {
            this.logger.mo85230v("Synchronous bond failed with reason", e5, new AbstractC30556a.a[0]);
        }
        return m80244M();
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
                m80258a0(bluetoothGattCharacteristic).f107405a = new InterfaceC25456b() { // from class: s92.c
                    @Override // md3.InterfaceC25456b
                    /* JADX INFO: renamed from: a */
                    public final void mo74863a(BluetoothDevice bluetoothDevice, C26591a c26591a) {
                        C32297e.m100542n0(bVar2, this, bluetoothDevice, c26591a);
                    }
                };
                try {
                    m80237F(bluetoothGattCharacteristic).m80365k();
                } catch (Exception e5) {
                    if (e5 instanceof RequestFailedException) {
                        this.logger.mo85222m("Failed to register notifications for " + uuid + " with status: " + AbstractC32298f.m100548b(((RequestFailedException) e5).f107358w), new AbstractC30556a.a[0]);
                    } else if (e5 instanceof NullPointerException) {
                        InterfaceC31766c.m98634e(this.crashReporter, new ConnectivityException("Caught a NullPointerException while trying to register for notifications synchronously", e5), null, 2, null);
                    } else if ((e5 instanceof InvalidRequestException) || (e5 instanceof DeviceDisconnectedException) || (e5 instanceof BluetoothDisabledException)) {
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
        this.bleHandlerCallback.mo106391c(device);
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
        this.bleHandlerCallback.mo106387X0(device, reason, AbstractC32298f.m100548b(reason));
    }

    @Override // qd3.InterfaceC30297b
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: f */
    public void mo92602f(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        if (Build.VERSION.SDK_INT >= 31) {
            ((CompanionDeviceManager) m80238G().getSystemService(CompanionDeviceManager.class)).startObservingDevicePresence(device.getAddress());
            this.logger.mo85216g(AbstractC2875y.m8300m("Started observing device presence for ", AbstractC34156a.m107933a(device), " {", device.getAddress(), "}"), new AbstractC30556a.a[0]);
        }
        this.bleHandlerCallback.mo106376L(device);
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: k */
    public boolean mo100527k() {
        return m80244M();
    }

    @Override // qd3.InterfaceC30296a
    /* JADX INFO: renamed from: m */
    public void mo92597m(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.bleHandlerCallback.mo106394m(device);
    }

    @Override // qd3.InterfaceC30296a
    /* JADX INFO: renamed from: n */
    public void mo92598n(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.bleHandlerCallback.mo106395q(device);
    }

    @Override // qd3.InterfaceC30296a
    /* JADX INFO: renamed from: o */
    public void mo92599o(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.bleHandlerCallback.mo106399v0(device);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: q */
    public void mo92603q(BluetoothDevice device, int reason) {
        AbstractC22676k.m65750j(device, "device");
        this.bleHandlerCallback.mo106384V(device);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: t */
    public void mo92604t(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.bleHandlerCallback.mo106372C0(device);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: u */
    public void mo92605u(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        this.bleHandlerCallback.mo106380P(device);
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: v */
    public void mo100528v() {
        close();
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.handlerThread = null;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: w */
    public int getMaxTransmissionUnit() {
        return m80241J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: x */
    public void mo100530x(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (this.sdkVersion >= 31 && !m100541m0()) {
            this.logger.mo85228t("Dropping the command to connect since new BLE runtime permissions are not granted", new AbstractC30556a.a[0]);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.logger.mo85228t("connectDevice: Enqueue connection request with id: " + jCurrentTimeMillis + " to bluetoothDevice: " + AbstractC34156a.m107933a(bluetoothDevice), new AbstractC30556a.a[0]);
        boolean zM13654g = this.bluetoothHelper.m13654g();
        this.logger.mo85228t(AbstractC11895b.m31996o("Current device ", zM13654g ? "supports" : "does NOT support", " LE 2M PHY"), new AbstractC30556a.a[0]);
        try {
            C26891e0 c26891e0M80234C = m80234C(bluetoothDevice);
            c26891e0M80234C.f107356v = false;
            c26891e0M80234C.f107387f = new C32294b(this, jCurrentTimeMillis);
            c26891e0M80234C.f107389h = new C32294b(this, jCurrentTimeMillis);
            this.logger.mo85216g("Setting timeout for connection request id: " + jCurrentTimeMillis, new AbstractC30556a.a[0]);
            Duration.Companion companion = Duration.INSTANCE;
            long jM134273getInWholeMillisecondsimpl = Duration.m134273getInWholeMillisecondsimpl(DurationKt.toDuration(20, DurationUnit.SECONDS));
            if (c26891e0M80234C.f107398n != null) {
                throw new IllegalStateException("Request already started");
            }
            c26891e0M80234C.f107400p = jM134273getInWholeMillisecondsimpl;
            if (zM13654g) {
                this.logger.mo85228t("Using LE 2M PHY as preferred PHY", new AbstractC30556a.a[0]);
                c26891e0M80234C.f107352r = 2;
            }
            c26891e0M80234C.f107354t = 3;
            c26891e0M80234C.f107355u = 100;
            c26891e0M80234C.m80359b();
        } catch (NullPointerException unused) {
            InterfaceC31766c.m98634e(this.crashReporter, new ConnectivityException("Caught a NullPointerException when enqueueing a connect request to Nordic", null, 2, 0 == true ? 1 : 0), null, 2, null);
        }
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
        try {
            m80261d0(bluetoothGattCharacteristic, data, 2).m80359b();
            return true;
        } catch (RuntimeException e5) {
            if (!(e5.getCause() instanceof DeadObjectException)) {
                throw e5;
            }
            this.logger.mo85230v(AbstractC11266d.m30462p("DeadObjectException during GATT write - Bluetooth service might have died. State: ", this.bluetoothHelper.m13651d()), e5, new AbstractC30556a.a[0]);
            return false;
        }
    }
}
