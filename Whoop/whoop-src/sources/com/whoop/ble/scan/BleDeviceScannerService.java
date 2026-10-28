package com.whoop.ble.scan;

import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelUuid;
import androidx.core.app.NotificationCompat;
import b12.AbstractC2289e;
import b12.AbstractC2290f;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import c12.C3853d;
import c12.C3854e;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kj0.AbstractC22513a;
import ks0.AbstractC22820a;
import l83.C23454a0;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import td3.AbstractC33722b;
import td3.AbstractC33729i;
import td3.C33731k;
import td3.C33733m;
import td3.C33734n;
import tr2.InterfaceC34116n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u00060\u0012R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/ble/scan/BleDeviceScannerService;", "Landroid/app/Service;", "<init>", "()V", "Ll83/a0;", "d", "e", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "name", "Landroid/bluetooth/BluetoothDevice;", "c", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/ble/scan/BleDeviceScannerService$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/ble/scan/BleDeviceScannerService$a;", "serviceBinder", "Ltr2/n;", "x", "Ltr2/n;", "logger", "Landroidx/core/app/NotificationCompat$Builder;", "y", "Landroidx/core/app/NotificationCompat$Builder;", "scannerNotification", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class BleDeviceScannerService extends Service {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final BinderC6048a serviceBinder = new BinderC6048a();

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("BleScannerService");

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private NotificationCompat.Builder scannerNotification;

    /* JADX INFO: renamed from: com.whoop.ble.scan.BleDeviceScannerService$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/ble/scan/BleDeviceScannerService$a;", "Landroid/os/Binder;", "<init>", "(Lcom/whoop/ble/scan/BleDeviceScannerService;)V", "Lcom/whoop/ble/scan/BleDeviceScannerService;", "a", "()Lcom/whoop/ble/scan/BleDeviceScannerService;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class BinderC6048a extends Binder {
        public BinderC6048a() {
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BleDeviceScannerService getF24076f() {
            return BleDeviceScannerService.this;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ble.scan.BleDeviceScannerService$b */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/ble/scan/BleDeviceScannerService$b", "Ltd3/i;", "", "callbackType", "Ltd3/m;", "result", "Ll83/a0;", "c", "(ILtd3/m;)V", "", "results", "a", "(Ljava/util/List;)V", "errorCode", "b", "(I)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C6049b extends AbstractC33729i {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC33722b f24078b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC3025k f24079c;

        /* JADX INFO: renamed from: com.whoop.ble.scan.BleDeviceScannerService$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ AbstractC33722b f24080w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C6049b f24081x;

            public a(AbstractC33722b abstractC33722b, C6049b c6049b) {
                this.f24080w = abstractC33722b;
                this.f24081x = c6049b;
            }

            /* JADX INFO: renamed from: a */
            public final void m18126a(Throwable it) {
                AbstractC22676k.m65750j(it, "it");
                AbstractC33722b abstractC33722b = this.f24080w;
                C6049b c6049b = this.f24081x;
                abstractC33722b.getClass();
                if (c6049b == null) {
                    throw new IllegalArgumentException("callback is null");
                }
                abstractC33722b.mo106608c(Collections.EMPTY_LIST, new C33734n(0, 1, 0L, 1, 3, true, 255, true, true, true, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 500L, 4500L), c6049b, new Handler(Looper.getMainLooper()));
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18126a((Throwable) obj);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.ble.scan.BleDeviceScannerService$b$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ AbstractC33722b f24082w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C6049b f24083x;

            public b(AbstractC33722b abstractC33722b, C6049b c6049b) {
                this.f24082w = abstractC33722b;
                this.f24083x = c6049b;
            }

            /* JADX INFO: renamed from: a */
            public final void m18127a(Throwable it) {
                AbstractC22676k.m65750j(it, "it");
                this.f24082w.m106609d(this.f24083x);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m18127a((Throwable) obj);
                return C23454a0.f92919a;
            }
        }

        public C6049b(AbstractC33722b abstractC33722b, InterfaceC3025k interfaceC3025k) {
            this.f24078b = abstractC33722b;
            this.f24079c = interfaceC3025k;
        }

        @Override // td3.AbstractC33729i
        /* JADX INFO: renamed from: a */
        public void mo18123a(List<C33733m> results) {
            AbstractC22676k.m65750j(results, "results");
            if (results.isEmpty()) {
                return;
            }
            Iterator<C33733m> it = results.iterator();
            while (it.hasNext()) {
                BleDeviceScannerService.this.logger.mo85216g(AbstractC11266d.m30461o("scanner found  onBatchScanResults ", it.next().f141097w.getAddress()), new AbstractC30556a.a[0]);
            }
            this.f24078b.m106609d(this);
            if (this.f24079c.isActive()) {
                InterfaceC3025k interfaceC3025k = this.f24079c;
                BluetoothDevice bluetoothDevice = ((C33733m) AbstractC25265s.m74096F0(results)).f141097w;
                AbstractC22676k.m65749i(bluetoothDevice, "getDevice(...)");
                interfaceC3025k.mo8744e(bluetoothDevice, new a(this.f24078b, this));
                BleDeviceScannerService.this.m18120e();
            }
        }

        @Override // td3.AbstractC33729i
        /* JADX INFO: renamed from: b */
        public void mo18124b(int errorCode) {
            BleDeviceScannerService.this.logger.mo85222m(AbstractC2875y.m8295h(errorCode, "onScanFailed errorCode: "), new AbstractC30556a.a[0]);
            this.f24078b.m106609d(this);
            if (this.f24079c.isActive()) {
                this.f24079c.resumeWith(AbstractC34132o.m107888l(new Exception(AbstractC2875y.m8295h(errorCode, "BLE scan finished with error code "))));
                BleDeviceScannerService.this.m18120e();
            }
        }

        @Override // td3.AbstractC33729i
        /* JADX INFO: renamed from: c */
        public void mo18125c(int callbackType, C33733m result) {
            AbstractC22676k.m65750j(result, "result");
            InterfaceC34116n interfaceC34116n = BleDeviceScannerService.this.logger;
            BluetoothDevice bluetoothDevice = result.f141097w;
            interfaceC34116n.mo85216g(AbstractC11266d.m30461o("scanner found onScanResult ", bluetoothDevice.getAddress()), new AbstractC30556a.a[0]);
            this.f24078b.m106609d(this);
            if (this.f24079c.isActive()) {
                InterfaceC3025k interfaceC3025k = this.f24079c;
                AbstractC22676k.m65749i(bluetoothDevice, "getDevice(...)");
                interfaceC3025k.mo8744e(bluetoothDevice, new b(this.f24078b, this));
                BleDeviceScannerService.this.m18120e();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m18119d() {
        this.logger.mo85216g("Starting foreground scanning service", new AbstractC30556a.a[0]);
        C3853d c3853d = C3854e.SETTINGS_GENERAL;
        NotificationCompat.Builder builder = this.scannerNotification;
        if (builder == null) {
            AbstractC22676k.m65757q("scannerNotification");
            throw null;
        }
        c3853d.m11805a(builder);
        if (Build.VERSION.SDK_INT >= 29) {
            NotificationCompat.Builder builder2 = this.scannerNotification;
            if (builder2 != null) {
                startForeground(43, builder2.build(), 16);
                return;
            } else {
                AbstractC22676k.m65757q("scannerNotification");
                throw null;
            }
        }
        NotificationCompat.Builder builder3 = this.scannerNotification;
        if (builder3 != null) {
            startForeground(43, builder3.build());
        } else {
            AbstractC22676k.m65757q("scannerNotification");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final void m18120e() {
        this.logger.mo85228t("Stopping foreground scanning service!", new AbstractC30556a.a[0]);
        stopForeground(true);
        stopSelf();
    }

    /* JADX INFO: renamed from: c */
    public final Object m18121c(String str, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) {
        m18119d();
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        AbstractC33722b abstractC33722bM106606a = AbstractC33722b.m106606a();
        C6049b c6049b = new C6049b(abstractC33722bM106606a, c3033m);
        C33734n c33734n = new C33734n(2, 1, 0L, 1, 3, false, 255, true, true, true, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 0L, 0L);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C33731k(str, null, new ParcelUuid(AbstractC22513a.f88234a), null, null, null, null, -1, null, null));
        this.logger.mo85228t("Starting scan for DFU device!", new AbstractC30556a.a[0]);
        abstractC33722bM106606a.m106607b(arrayList, c33734n, c6049b);
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.logger.mo85219j("onBind", new AbstractC30556a.a[0]);
        return this.serviceBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.logger.mo85228t("onCreate called, building a scanner notification", new AbstractC30556a.a[0]);
        NotificationCompat.Builder color = new NotificationCompat.Builder(this, "06500_FirmwareUpdate").setAutoCancel(true).setContentTitle(AbstractC32122c.getString(this, AbstractC22820a.f89924e)).setContentText(AbstractC32122c.getString(this, AbstractC22820a.f89920a)).setSmallIcon(AbstractC2290f.f9087a).setColor(AbstractC32122c.getColor(this, AbstractC2289e.f9086a));
        AbstractC22676k.m65749i(color, "setColor(...)");
        this.scannerNotification = color;
    }
}
