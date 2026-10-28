package a82;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.ble.scan.C6050a;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qt0.C30586b;
import qt0.InterfaceC30585a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: a82.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 ¨\u0006\""}, m65681d2 = {"La82/c;", "Lqt0/a;", "Ltr2/n;", "logger", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "La82/a;", "bleScannerHelper", "Lcom/whoop/ble/scan/a;", "bleDeviceScanner", "<init>", "(Ltr2/n;Landroid/bluetooth/BluetoothAdapter;La82/a;Lcom/whoop/ble/scan/a;)V", "", "name", "Landroid/bluetooth/BluetoothDevice;", "a", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ltr2/n;", "b", "Landroid/bluetooth/BluetoothAdapter;", "c", "La82/a;", "d", "Lcom/whoop/ble/scan/a;", "Landroid/bluetooth/le/ScanCallback;", "e", "Landroid/bluetooth/le/ScanCallback;", "scanCallback", "Lec3/l;", "Lqt0/b;", "f", "Lec3/l;", "()Lec3/l;", "startScan", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0572c implements InterfaceC30585a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C0570a bleScannerHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C6050a bleDeviceScanner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ScanCallback scanCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SuppressLint({"MissingPermission"})
    private final InterfaceC13058l startScan;

    /* JADX INFO: renamed from: a82.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.scanner.BleScannerImpl$startScan$1", m100430f = "BleScannerImpl.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Lqt0/b;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f2042w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2043x;

        /* JADX INFO: renamed from: a82.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes10.dex */
        @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"a82/c$a$a", "Landroid/bluetooth/le/ScanCallback;", "", "callbackType", "Landroid/bluetooth/le/ScanResult;", "result", "Ll83/a0;", "onScanResult", "(ILandroid/bluetooth/le/ScanResult;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41266a extends ScanCallback {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0572c f2045a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC11936u f2046b;

            public C41266a(C0572c c0572c, InterfaceC11936u interfaceC11936u) {
                this.f2045a = c0572c;
                this.f2046b = interfaceC11936u;
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                AbstractC22676k.m65750j(result, "result");
                EnumC32978v enumC32978vM1477c = this.f2045a.bleScannerHelper.m1477c(result);
                if (enumC32978vM1477c != null) {
                    this.f2045a.logger.mo85228t(AbstractC31061c.m95640p("Found Whoop device; Name: ", result.getDevice().getName(), ", Address: ", result.getDevice().getAddress()), new AbstractC30556a.a[0]);
                    InterfaceC11936u interfaceC11936u = this.f2046b;
                    String name = result.getDevice().getName();
                    if (name == null) {
                        name = "";
                    }
                    String address = result.getDevice().getAddress();
                    AbstractC22676k.m65749i(address, "getAddress(...)");
                    ((C11935t) interfaceC11936u).mo32218s(new C30586b(name, address, result.getRssi(), enumC32978vM1477c));
                }
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m1487h(C0572c c0572c) {
            c0572c.logger.mo85228t("Stopping scan", new AbstractC30556a.a[0]);
            c0572c.bluetoothAdapter.getBluetoothLeScanner().stopScan(c0572c.scanCallback);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C0572c.this.new a(interfaceC30057d);
            aVar.f2043x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f2043x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2042w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C0572c.this.scanCallback = new C41266a(C0572c.this, interfaceC11936u);
                C0572c.this.logger.mo85228t("Starting scan", new AbstractC30556a.a[0]);
                C0572c.this.bluetoothAdapter.getBluetoothLeScanner().startScan(C0572c.this.bleScannerHelper.m1475a(), C0572c.this.bleScannerHelper.getLowLatencyScanSettings(), C0572c.this.scanCallback);
                final C0572c c0572c = C0572c.this;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: a82.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return C0572c.a.m1487h(c0572c);
                    }
                };
                this.f2043x = null;
                this.f2042w = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
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

    public C0572c(InterfaceC34116n logger, BluetoothAdapter bluetoothAdapter, C0570a bleScannerHelper, C6050a bleDeviceScanner) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(bluetoothAdapter, "bluetoothAdapter");
        AbstractC22676k.m65750j(bleScannerHelper, "bleScannerHelper");
        AbstractC22676k.m65750j(bleDeviceScanner, "bleDeviceScanner");
        this.logger = logger;
        this.bluetoothAdapter = bluetoothAdapter;
        this.bleScannerHelper = bleScannerHelper;
        this.bleDeviceScanner = bleDeviceScanner;
        this.startScan = AbstractC13091v.m36600j(new a(null));
    }

    @Override // qt0.InterfaceC30585a
    /* JADX INFO: renamed from: a */
    public Object mo1484a(String str, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) {
        return this.bleDeviceScanner.m18132d(str, interfaceC30057d);
    }

    @Override // qt0.InterfaceC30585a
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13058l getStartScan() {
        return this.startScan;
    }
}
