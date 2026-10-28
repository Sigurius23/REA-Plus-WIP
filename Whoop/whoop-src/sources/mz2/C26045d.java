package mz2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.os.ParcelUuid;
import b92.AbstractC2891a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kj0.AbstractC22513a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;
import yb3.C39412p;
import yw2.AbstractC39831c;
import yw2.C39830b;

/* JADX INFO: renamed from: mz2.d */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001=\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\"0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0.028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00109R\u0018\u0010<\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u0004\u0018\u00010H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010IR\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\"0K8F¢\u0006\u0006\u001a\u0004\b;\u0010L¨\u0006N"}, m65681d2 = {"Lmz2/d;", "", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "Lrr2/c;", "exceptionHandler", "Lmz2/a;", "bleDeviceUtil", "<init>", "(Landroid/bluetooth/BluetoothAdapter;Ltr2/n;Lbc3/c0;Lrr2/c;Lmz2/a;)V", "", "deviceAddress", "requiredRegex", "blockedRegex", "Ll83/a0;", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "p", "()V", "a", "Landroid/bluetooth/BluetoothAdapter;", "b", "Ltr2/n;", "c", "Lbc3/c0;", "d", "Lrr2/c;", "e", "Lmz2/a;", "Lec3/o1;", "Lyw2/b;", "f", "Lec3/o1;", "_addDeviceFlow", "", "g", "_scanErrorFlow", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/Map;", "hrDevices", "Lec3/p1;", "", "i", "Lec3/p1;", "_deviceList", "Lec3/f2;", "j", "Lec3/f2;", "k", "()Lec3/f2;", "deviceList", "Lyb3/p;", "Lyb3/p;", "_requiredRegex", "l", "_blockedRegex", "mz2/d$a", "m", "Lmz2/d$a;", "scanCallback", "Landroid/bluetooth/le/ScanFilter;", "Landroid/bluetooth/le/ScanFilter;", "hrServiceScanFilter", "Landroid/bluetooth/le/ScanSettings;", "o", "Landroid/bluetooth/le/ScanSettings;", "scanSettings", "Landroid/bluetooth/le/BluetoothLeScanner;", "()Landroid/bluetooth/le/BluetoothLeScanner;", "scanner", "Lec3/t1;", "()Lec3/t1;", "deviceScannedFlow", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@SuppressLint({"MissingPermission"})
public final class C26045d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c exceptionHandler;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C26042a bleDeviceUtil;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13072o1 _addDeviceFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13072o1 _scanErrorFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final Map<String, C39830b> hrDevices;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13075p1 _deviceList;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13037f2 deviceList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private C39412p _requiredRegex;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private C39412p _blockedRegex;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final a scanCallback;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final ScanFilter hrServiceScanFilter;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final ScanSettings scanSettings;

    /* JADX INFO: renamed from: mz2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"mz2/d$a", "Landroid/bluetooth/le/ScanCallback;", "", "callbackType", "Landroid/bluetooth/le/ScanResult;", "result", "Ll83/a0;", "onScanResult", "(ILandroid/bluetooth/le/ScanResult;)V", "errorCode", "onScanFailed", "(I)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends ScanCallback {

        /* JADX INFO: renamed from: mz2.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceScanner$scanCallback$1$onScanFailed$1", m100430f = "HrDeviceScanner.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42039a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f103080w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26045d f103081x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ int f103082y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42039a(C26045d c26045d, int i13, InterfaceC30057d<? super C42039a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f103081x = c26045d;
                this.f103082y = i13;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42039a(this.f103081x, this.f103082y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42039a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f103080w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13072o1 interfaceC13072o1 = this.f103081x._scanErrorFlow;
                    Integer num = new Integer(this.f103082y);
                    this.f103080w = 1;
                    if (interfaceC13072o1.emit(num, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: mz2.d$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceScanner$scanCallback$1$onScanResult$1", m100430f = "HrDeviceScanner.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            Object f103083E;

            /* JADX INFO: renamed from: F */
            int f103084F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ BluetoothDevice f103085G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ C26045d f103086H;

            /* JADX INFO: renamed from: w */
            Object f103087w;

            /* JADX INFO: renamed from: x */
            Object f103088x;

            /* JADX INFO: renamed from: y */
            Object f103089y;

            /* JADX INFO: renamed from: z */
            Object f103090z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BluetoothDevice bluetoothDevice, C26045d c26045d, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f103085G = bluetoothDevice;
                this.f103086H = c26045d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f103085G, this.f103086H, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f103084F;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String strM127792c = AbstractC39831c.m127792c(this.f103085G);
                    C39412p c39412p = this.f103086H._requiredRegex;
                    if (c39412p != null && !c39412p.m125851e(strM127792c)) {
                        InterfaceC34116n interfaceC34116n = this.f103086H.logger;
                        String strPattern = c39412p.f169588w.pattern();
                        AbstractC22676k.m65749i(strPattern, "pattern(...)");
                        interfaceC34116n.mo85228t(strM127792c + " doesn't match " + strPattern, new AbstractC30556a.a[0]);
                        return c23454a0;
                    }
                    C39412p c39412p2 = this.f103086H._blockedRegex;
                    if (c39412p2 != null) {
                        C26045d c26045d = this.f103086H;
                        if (c39412p2.m125851e(strM127792c) || AbstractC39421y.m125930O(strM127792c, "BT device", false)) {
                            InterfaceC34116n interfaceC34116n2 = c26045d.logger;
                            String strPattern2 = c39412p2.f169588w.pattern();
                            AbstractC22676k.m65749i(strPattern2, "pattern(...)");
                            interfaceC34116n2.mo85228t(strM127792c + " was blocked by " + strPattern2 + " regex or due to a fallback name.", new AbstractC30556a.a[0]);
                            return c23454a0;
                        }
                    }
                    String address = this.f103085G.getAddress();
                    C39830b c39830b = (C39830b) this.f103086H.hrDevices.get(address);
                    if (c39830b == null) {
                        C39830b c39830bM127789a = C39830b.INSTANCE.m127789a(this.f103085G);
                        this.f103086H.hrDevices.put(address, c39830bM127789a);
                        InterfaceC13072o1 interfaceC13072o1 = this.f103086H._addDeviceFlow;
                        this.f103087w = null;
                        this.f103088x = null;
                        this.f103089y = null;
                        this.f103090z = null;
                        this.f103083E = null;
                        this.f103084F = 1;
                        if (interfaceC13072o1.emit(c39830bM127789a, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        this.f103086H.hrDevices.put(address, c39830b.m127788i(strM127792c));
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                InterfaceC13075p1 interfaceC13075p1 = this.f103086H._deviceList;
                List listM74093D1 = AbstractC25265s.m74093D1(this.f103086H.hrDevices.values());
                C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                c13045h2.getClass();
                c13045h2.m36571k(null, listM74093D1);
                return c23454a0;
            }
        }

        public a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int errorCode) {
            String str = this + " onScanFailed errorCode: " + AbstractC2891a.m8454b(errorCode);
            AbstractC3006f0.m8732z(C26045d.this.coroutineScope, null, null, new C42039a(C26045d.this, errorCode, null), 3);
            C26045d.this.exceptionHandler.mo98626g(new Exception(str), str);
            BluetoothLeScanner bluetoothLeScannerM77499m = C26045d.this.m77499m();
            if (bluetoothLeScannerM77499m != null) {
                bluetoothLeScannerM77499m.stopScan(this);
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int callbackType, ScanResult result) {
            AbstractC22676k.m65750j(result, "result");
            BluetoothDevice device = result.getDevice();
            AbstractC22676k.m65749i(device, "getDevice(...)");
            if (AbstractC3006f0.m8729w(C26045d.this.coroutineScope)) {
                AbstractC3006f0.m8732z(C26045d.this.coroutineScope, null, null, new b(device, C26045d.this, null), 3);
            } else {
                C26045d.this.logger.mo85226q("still getting scan results but parent scope is not active: caller forgot to cancel scan", new AbstractC30556a.a[0]);
                C26045d.this.m77504p();
            }
        }
    }

    /* JADX INFO: renamed from: mz2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceScanner$scanHrDevices$3", m100430f = "HrDeviceScanner.kt", m100431l = {133}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103091w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26045d.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103091w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26045d.this._scanErrorFlow;
                Integer num = new Integer(102);
                this.f103091w = 1;
                if (interfaceC13072o1.emit(num, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mz2.d$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceScanner$scanHrDevices$4", m100430f = "HrDeviceScanner.kt", m100431l = {137}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103093w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26045d.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103093w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26045d.this._scanErrorFlow;
                Integer num = new Integer(101);
                this.f103093w = 1;
                if (interfaceC13072o1.emit(num, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mz2.d$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceScanner$scanHrDevices$5", m100430f = "HrDeviceScanner.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f103095w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26045d.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f103095w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26045d.this._scanErrorFlow;
                Integer num = new Integer(3);
                this.f103095w = 1;
                if (interfaceC13072o1.emit(num, this) == enumC31071a) {
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

    public C26045d(BluetoothAdapter bluetoothAdapter, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope, InterfaceC31766c exceptionHandler, C26042a bleDeviceUtil) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(exceptionHandler, "exceptionHandler");
        AbstractC22676k.m65750j(bleDeviceUtil, "bleDeviceUtil");
        this.bluetoothAdapter = bluetoothAdapter;
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        this.exceptionHandler = exceptionHandler;
        this.bleDeviceUtil = bleDeviceUtil;
        this._addDeviceFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this._scanErrorFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this.hrDevices = new LinkedHashMap();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C25271y.f99162w);
        this._deviceList = c13045h2M36593c;
        this.deviceList = c13045h2M36593c;
        this.scanCallback = new a();
        ScanFilter scanFilterBuild = new ScanFilter.Builder().setServiceUuid(new ParcelUuid(AbstractC22513a.m65017c())).build();
        AbstractC22676k.m65749i(scanFilterBuild, "build(...)");
        this.hrServiceScanFilter = scanFilterBuild;
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setLegacy(false);
        ScanSettings scanSettingsBuild = builder.setScanMode(2).setCallbackType(1).build();
        AbstractC22676k.m65749i(scanSettingsBuild, "build(...)");
        this.scanSettings = scanSettingsBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final BluetoothLeScanner m77499m() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBluetoothLeScanner();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m77500o(C26045d c26045d, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        c26045d.m77503n(str, str2, str3);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC13037f2 getDeviceList() {
        return this.deviceList;
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC13087t1 m77502l() {
        return AbstractC13091v.m36597g(this._addDeviceFlow);
    }

    /* JADX INFO: renamed from: n */
    public final void m77503n(String deviceAddress, String requiredRegex, String blockedRegex) {
        this.hrDevices.clear();
        this._requiredRegex = requiredRegex != null ? new C39412p(requiredRegex) : null;
        this._blockedRegex = blockedRegex != null ? new C39412p(blockedRegex) : null;
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter == null) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(null), 3);
            return;
        }
        if (!bluetoothAdapter.isEnabled()) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
            return;
        }
        if (m77499m() == null) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(null), 3);
            return;
        }
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(this.hrServiceScanFilter);
        if (deviceAddress != null) {
            ScanFilter scanFilterBuild = new ScanFilter.Builder().setDeviceAddress(deviceAddress).build();
            AbstractC22676k.m65749i(scanFilterBuild, "build(...)");
            arrayListM118964P.add(scanFilterBuild);
        }
        this.logger.mo85228t(this + " starting scan", new AbstractC30556a.a[0]);
        BluetoothLeScanner bluetoothLeScannerM77499m = m77499m();
        if (bluetoothLeScannerM77499m != null) {
            bluetoothLeScannerM77499m.startScan(arrayListM118964P, this.scanSettings, this.scanCallback);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m77504p() {
        this.logger.mo85228t(this + " attempting to stop scan if one is running; scanner available: " + (m77499m() != null), new AbstractC30556a.a[0]);
        BluetoothLeScanner bluetoothLeScannerM77499m = m77499m();
        if (bluetoothLeScannerM77499m != null) {
            bluetoothLeScannerM77499m.stopScan(this.scanCallback);
        }
    }
}
