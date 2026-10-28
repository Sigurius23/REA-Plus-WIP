package com.whoop.ble.scan;

import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30065l;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.ble.scan.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/ble/scan/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll83/a0;", "e", "(Lq83/d;)Ljava/lang/Object;", "", "name", "Landroid/bluetooth/BluetoothDevice;", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Lcom/whoop/ble/scan/BleDeviceScannerService;", "b", "Lcom/whoop/ble/scan/BleDeviceScannerService;", "scannerService", "Ltr2/n;", "c", "Ltr2/n;", "logger", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6050a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private BleDeviceScannerService scannerService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.ble.scan.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.scan.BleDeviceScanner", m100430f = "BleDeviceScanner.kt", m100431l = {25, 26}, m100432m = "scanForDevice", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f24087w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f24088x;

        /* JADX INFO: renamed from: z */
        int f24090z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f24088x = obj;
            this.f24090z |= Integer.MIN_VALUE;
            return C6050a.this.m18132d(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ble.scan.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ble.scan.BleDeviceScanner$startService$2", m100430f = "BleDeviceScanner.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f24091w;

        /* JADX INFO: renamed from: x */
        int f24092x;

        /* JADX INFO: renamed from: com.whoop.ble.scan.a$b$a */
        @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"com/whoop/ble/scan/a$b$a", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements ServiceConnection {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C6050a f24094w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC30057d<C23454a0> f24095x;

            /* JADX WARN: Multi-variable type inference failed */
            public a(C6050a c6050a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f24094w = c6050a;
                this.f24095x = interfaceC30057d;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                this.f24094w.logger.mo85228t("onServiceConnected", new AbstractC30556a.a[0]);
                AbstractC22676k.m65748h(service, "null cannot be cast to non-null type com.whoop.ble.scan.BleDeviceScannerService.BleDeviceScannerServiceBinder");
                this.f24094w.scannerService = ((BleDeviceScannerService.BinderC6048a) service).getF24076f();
                this.f24095x.resumeWith(C23454a0.f92919a);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                this.f24094w.logger.mo85228t("onServiceDisconnected " + name, new AbstractC30556a.a[0]);
                this.f24095x.resumeWith(AbstractC34132o.m107888l(new Exception("Service Disconnected")));
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C6050a.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f24092x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C6050a c6050a = C6050a.this;
                this.f24091w = c6050a;
                this.f24092x = 1;
                C30065l c30065l = new C30065l(AbstractC15751g.m44424D(this));
                a aVar = new a(c6050a, c30065l);
                Intent intent = new Intent(c6050a.context, (Class<?>) BleDeviceScannerService.class);
                c6050a.logger.mo85228t("Calling bindService", new AbstractC30556a.a[0]);
                c6050a.context.bindService(intent, aVar, 1);
                if (c30065l.m92140a() == enumC31071a) {
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

    public C6050a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("BleDeviceScanner");
    }

    /* JADX INFO: renamed from: e */
    private final Object m18131e(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        this.logger.mo85216g("Starting BleDeviceScannerService service", new AbstractC30556a.a[0]);
        Object objM8748b = AbstractC3028k2.m8748b(5000L, new b(null), interfaceC30057d);
        return objM8748b == EnumC31071a.f128113w ? objM8748b : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m18132d(String str, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f24090z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f24090z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f24088x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f24090z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.logger.mo85216g(AbstractC11266d.m30461o("scanForDevice called for device name ", str), new AbstractC30556a.a[0]);
            aVar.f24087w = str;
            aVar.f24090z = 1;
            if (m18131e(aVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        str = (String) aVar.f24087w;
        AbstractC34132o.m107864I(obj);
        BleDeviceScannerService bleDeviceScannerService = this.scannerService;
        if (bleDeviceScannerService == null) {
            AbstractC22676k.m65757q("scannerService");
            throw null;
        }
        aVar.f24087w = null;
        aVar.f24090z = 2;
        Object objM18121c = bleDeviceScannerService.m18121c(str, aVar);
        return objM18121c == obj2 ? obj2 : objM18121c;
    }
}
