package com.whoop.service.rearchitect;

import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcelable;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.C6656c;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import g83.C15578d;
import in2.C18729a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n73.InterfaceC26443b;
import oh3.AbstractC27946d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q92.C30070b;
import q92.C30076h;
import r73.AbstractC31056a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s92.C32297e;
import st0.AbstractC32962f;
import st0.C32970n;
import t73.C33589b;
import vf3.InterfaceC35951a;
import ys0.InterfaceC39750a;
import z82.InterfaceC40188b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 M2\u00020\u0001:\u0003NOPB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u00060\u001fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101R(\u00109\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b5\u00106\"\u0004\b7\u00108R \u0010>\u001a\f\u0012\u0006\b\u0001\u0012\u00020;\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010%\u001a\u0004\bE\u0010FR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006Q"}, m65681d2 = {"Lcom/whoop/service/rearchitect/BleWhoopStrapService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Ll83/a0;", "m", "(Landroid/content/Intent;)V", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "n", "(Landroid/bluetooth/BluetoothDevice;)V", "Ljk0/d;", "iWhoopStrap", "p", "(Ljk0/d;)V", "Lec3/l;", "Lst0/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljk0/d;)Lec3/l;", "onDestroy", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Loh3/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lq92/b;", "k", "()Loh3/d;", "log", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "x", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "whoopStrapServiceBinder", "Lq92/h;", "y", "Ll83/h;", "l", "()Lq92/h;", "whoopStrapSharedPrefs", "Lz82/b;", "z", "i", "()Lz82/b;", "analyticsManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/service/rearchitect/c;", "value", "F", "Lcom/whoop/service/rearchitect/c;", "o", "(Lcom/whoop/service/rearchitect/c;)V", "whoopStrap", "Ljava/lang/Class;", "Lys0/a;", "G", "Ljava/lang/Class;", "implClass", "Lbc3/k1;", "H", "Lbc3/k1;", "monitorConnectionStateJob", "Lbc3/c0;", "I", "j", "()Lbc3/c0;", "coroutineScope", "Lg83/d;", "Lcom/whoop/service/rearchitect/b;", "J", "Lg83/d;", "notificationPubSub", "K", "a", "b", "c", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BleWhoopStrapService extends Service {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private volatile C10015c whoopStrap;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private Class<? extends InterfaceC39750a> implClass;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private InterfaceC3027k1 monitorConnectionStateJob;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h coroutineScope;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C15578d notificationPubSub;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C30070b log = new C30070b("BleWhoopStrapService");

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final BinderC10003a whoopStrapServiceBinder = new BinderC10003a();

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager;

    /* JADX INFO: renamed from: L */
    static final /* synthetic */ InterfaceC21493z[] f29723L = {AbstractC22671h0.f89337a.property1(new C22693x(BleWhoopStrapService.class, "log", "getLog()Ltimber/log/Timber$Tree;", 0))};

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$a */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "Landroid/os/Binder;", "<init>", "(Lcom/whoop/service/rearchitect/BleWhoopStrapService;)V", "Ljk0/d;", "f", "()Ljk0/d;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;", "callback", "Ln73/b;", "c", "(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/bluetooth/BluetoothDevice;)V", "g", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class BinderC10003a extends Binder {
        public BinderC10003a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m24621d(InterfaceC10005c interfaceC10005c, C10014b c10014b) {
            if (c10014b.getValue() != null) {
                interfaceC10005c.mo13710C(c10014b.getValue());
            } else {
                interfaceC10005c.mo13718q();
            }
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public static final void m24622e(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC26443b m24623c(final InterfaceC10005c callback) {
            AbstractC22676k.m65750j(callback, "callback");
            if (BleWhoopStrapService.this.whoopStrap != null) {
                C10015c c10015c = BleWhoopStrapService.this.whoopStrap;
                AbstractC22676k.m65748h(c10015c, "null cannot be cast to non-null type com.whoop.ble.strap.IWhoopStrap");
                callback.mo13710C(c10015c);
            }
            C15578d c15578d = BleWhoopStrapService.this.notificationPubSub;
            C6656c c6656c = new C6656c(new Function1() { // from class: com.whoop.service.rearchitect.a
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BleWhoopStrapService.BinderC10003a.m24621d(callback, (C10014b) obj);
                }
            }, 21);
            c15578d.getClass();
            C33589b c33589b = new C33589b(c6656c, AbstractC31056a.f128065d);
            c15578d.m67905c(c33589b);
            return c33589b;
        }

        /* JADX INFO: renamed from: f */
        public final InterfaceC21750d m24624f() {
            C10015c c10015c = BleWhoopStrapService.this.whoopStrap;
            if (c10015c != null) {
                return c10015c;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g */
        public final void m24625g() {
            BleWhoopStrapService.this.m24613k().mo84367a("Removing whoop strap reference", new Object[0]);
            BleWhoopStrapService.this.m24617o(null);
            BleWhoopStrapService.this.notificationPubSub.onNext(new C10014b(null, 1, 0 == true ? 1 : 0));
        }

        /* JADX INFO: renamed from: h */
        public final void m24626h(BluetoothDevice bluetoothDevice) {
            BluetoothDevice bluetoothDeviceM92195a = BleWhoopStrapService.this.m24614l().m92195a();
            if (bluetoothDevice != null && !bluetoothDevice.equals(bluetoothDeviceM92195a)) {
                BleWhoopStrapService.this.m24616n(bluetoothDevice);
                return;
            }
            if (bluetoothDevice != null && bluetoothDevice.equals(bluetoothDeviceM92195a)) {
                BleWhoopStrapService.this.m24613k().mo84371h("Reinitializing WhoopStrapGatt object due to FAULTY state machine state", new Object[0]);
                C10015c c10015c = BleWhoopStrapService.this.whoopStrap;
                if (c10015c != null) {
                    c10015c.mo24736k2();
                }
                BleWhoopStrapService.this.m24617o(null);
                BleWhoopStrapService.this.m24616n(bluetoothDevice);
                return;
            }
            if (BleWhoopStrapService.this.whoopStrap != null || bluetoothDeviceM92195a == null) {
                return;
            }
            BleWhoopStrapService.this.m24616n(bluetoothDeviceM92195a);
            C10015c c10015c2 = BleWhoopStrapService.this.whoopStrap;
            if (c10015c2 != null) {
                BleWhoopStrapService.this.m24613k().mo84371h("feature flag switched: reconnecting via nordic from cached strap", new Object[0]);
                c10015c2.mo104074O();
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$b, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/content/ServiceConnection;Landroid/bluetooth/BluetoothDevice;)V", "", "EXTRA_BLE_HANDLE_IMPL_CLASS", "Ljava/lang/String;", "EXTRA_WHOOP_STRAP", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24627a(Context context, ServiceConnection serviceConnection, BluetoothDevice bluetoothDevice) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(serviceConnection, "serviceConnection");
            Intent intent = new Intent(context, (Class<?>) BleWhoopStrapService.class);
            intent.putExtra("ble_handler_impl_class", C32297e.class);
            intent.putExtra("whoop_strap", bluetoothDevice);
            context.bindService(intent, serviceConnection, 1);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$c */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;", "", "Ljk0/d;", "whoopStrap", "Ll83/a0;", "C", "(Ljk0/d;)V", "q", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface InterfaceC10005c {
        /* JADX INFO: renamed from: C */
        void mo13710C(InterfaceC21750d whoopStrap);

        /* JADX INFO: renamed from: q */
        void mo13718q();
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10006d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f29735w;

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f29736w;

            /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.BleWhoopStrapService$buildConnectionMonitorJob$$inlined$filter$1$2", m100430f = "BleWhoopStrapService.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41409a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f29738F;

                /* JADX INFO: renamed from: G */
                Object f29739G;

                /* JADX INFO: renamed from: H */
                int f29740H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f29741w;

                /* JADX INFO: renamed from: x */
                int f29742x;

                /* JADX INFO: renamed from: y */
                Object f29743y;

                /* JADX INFO: renamed from: z */
                Object f29744z;

                public C41409a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f29741w = obj;
                    this.f29742x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f29736w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41409a c41409a;
                if (interfaceC30057d instanceof C41409a) {
                    c41409a = (C41409a) interfaceC30057d;
                    int i13 = c41409a.f29742x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41409a.f29742x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41409a = new C41409a(interfaceC30057d);
                    }
                } else {
                    c41409a = new C41409a(interfaceC30057d);
                }
                Object obj2 = c41409a.f29741w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41409a.f29742x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f29736w;
                    if (((AbstractC32962f) obj) instanceof C32970n) {
                        c41409a.f29743y = null;
                        c41409a.f29744z = null;
                        c41409a.f29738F = null;
                        c41409a.f29739G = null;
                        c41409a.f29740H = 0;
                        c41409a.f29742x = 1;
                        if (interfaceC13062m.emit(obj, c41409a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public C10006d(InterfaceC13058l interfaceC13058l) {
            this.f29735w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f29735w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.BleWhoopStrapService$buildConnectionMonitorJob$2", m100430f = "BleWhoopStrapService.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lst0/f;", "it", "Ll83/a0;", "<anonymous>", "(Lst0/f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10007e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29745w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21750d f29747y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10007e(InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C10007e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29747y = interfaceC21750d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleWhoopStrapService.this.new C10007e(this.f29747y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC32962f abstractC32962f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10007e) create(abstractC32962f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f29745w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            BleWhoopStrapService.this.notificationPubSub.onNext(new C10014b(this.f29747y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10008f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29748w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29749x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29750y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10008f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29748w = componentCallbacks;
            this.f29749x = interfaceC35951a;
            this.f29750y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q92.h] */
        @Override // c93.InterfaceC4339a
        public final C30076h invoke() {
            ComponentCallbacks componentCallbacks = this.f29748w;
            InterfaceC35951a interfaceC35951a = this.f29749x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29750y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30076h.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10009g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29751w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29752x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29753y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10009g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29751w = componentCallbacks;
            this.f29752x = interfaceC35951a;
            this.f29753y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z82.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40188b invoke() {
            ComponentCallbacks componentCallbacks = this.f29751w;
            InterfaceC35951a interfaceC35951a = this.f29752x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29753y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10010h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29754w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29755x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29756y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10010h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29754w = componentCallbacks;
            this.f29755x = interfaceC35951a;
            this.f29756y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f29754w;
            InterfaceC35951a interfaceC35951a = this.f29755x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29756y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10011i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f29757w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29758x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29759y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10011i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29757w = componentCallbacks;
            this.f29758x = interfaceC35951a;
            this.f29759y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bc3.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC2994c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f29757w;
            InterfaceC35951a interfaceC35951a = this.f29758x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f29759y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.BleWhoopStrapService$j */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.BleWhoopStrapService$startMonitoringAndAlertListener$1", m100430f = "BleWhoopStrapService.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10012j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29760w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21750d f29762y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10012j(InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C10012j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29762y = interfaceC21750d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleWhoopStrapService.this.new C10012j(this.f29762y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10012j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29760w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM24610h = BleWhoopStrapService.this.m24610h(this.f29762y);
                this.f29760w = 1;
                if (AbstractC13091v.m36603m(interfaceC13058lM24610h, this) == enumC31071a) {
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

    public BleWhoopStrapService() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.whoopStrapSharedPrefs = AbstractC30060g.m92087G(enumC23463i, new C10008f(this, null, null));
        this.analyticsManager = AbstractC30060g.m92087G(enumC23463i, new C10009g(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10010h(this, null, null));
        this.coroutineScope = AbstractC30060g.m92087G(enumC23463i, new C10011i(this, null, null));
        this.notificationPubSub = new C15578d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m24610h(InterfaceC21750d iWhoopStrap) {
        return new C13052j1(new C10006d(iWhoopStrap.getConnectionStateFlow()), new C10007e(iWhoopStrap, null), 0);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC40188b m24611i() {
        return (InterfaceC40188b) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC2994c0 m24612j() {
        return (InterfaceC2994c0) this.coroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC27946d m24613k() {
        return this.log.getValue(this, f29723L[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C30076h m24614l() {
        return (C30076h) this.whoopStrapSharedPrefs.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final void m24615m(Intent intent) {
        m24613k().mo84371h("instantiateImplFromIntent", new Object[0]);
        if (!intent.hasExtra("ble_handler_impl_class")) {
            m24613k().mo84371h("no valid intent", new Object[0]);
            return;
        }
        try {
            Serializable serializableExtra = intent.getSerializableExtra("ble_handler_impl_class");
            AbstractC22676k.m65748h(serializableExtra, "null cannot be cast to non-null type java.lang.Class<out com.whoop.connectivityCore.ble.IBleHandler>");
            this.implClass = (Class) serializableExtra;
            Parcelable parcelableExtra = intent.getParcelableExtra("whoop_strap");
            BluetoothDevice bluetoothDeviceM92195a = parcelableExtra != null ? (BluetoothDevice) parcelableExtra : null;
            m24613k().mo84371h("btDevice=" + bluetoothDeviceM92195a, new Object[0]);
            if (bluetoothDeviceM92195a == null) {
                bluetoothDeviceM92195a = m24614l().m92195a();
            }
            m24616n(bluetoothDeviceM92195a);
        } catch (Exception e5) {
            m24613k().mo84369c(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m24616n(BluetoothDevice bluetoothDevice) {
        BleWhoopStrapService bleWhoopStrapService;
        BluetoothDevice bluetoothDevice2;
        BluetoothDevice bluetoothDevice3;
        m24613k().mo84371h("instantiateImpl " + bluetoothDevice, new Object[0]);
        if (this.whoopStrap != null || bluetoothDevice == null) {
            bleWhoopStrapService = this;
            C10015c c10015c = bleWhoopStrapService.whoopStrap;
            String address = null;
            if (!AbstractC22676k.m65745e((c10015c == null || (bluetoothDevice3 = c10015c.getBluetoothDevice()) == null) ? null : bluetoothDevice3.getAddress(), bluetoothDevice != null ? bluetoothDevice.getAddress() : null)) {
                AbstractC27946d abstractC27946dM24613k = m24613k();
                String address2 = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
                C10015c c10015c2 = bleWhoopStrapService.whoopStrap;
                if (c10015c2 != null && (bluetoothDevice2 = c10015c2.getBluetoothDevice()) != null) {
                    address = bluetoothDevice2.getAddress();
                }
                abstractC27946dM24613k.mo84367a(AbstractC31061c.m95640p("User trying to connect to ", address2, " but already connected to ", address), new Object[0]);
                C10015c c10015c3 = bleWhoopStrapService.whoopStrap;
                if (c10015c3 != null) {
                    c10015c3.mo24736k2();
                }
                C10015c c10015c4 = bleWhoopStrapService.whoopStrap;
                if (c10015c4 != null) {
                    c10015c4.m106400z1();
                }
                C10015c.Companion bVar = C10015c.INSTANCE;
                AbstractC22676k.m65747g(bluetoothDevice);
                Class<? extends InterfaceC39750a> cls = bleWhoopStrapService.implClass;
                AbstractC22676k.m65747g(cls);
                m24617o(C10015c.Companion.m24759b(bVar, bleWhoopStrapService, bluetoothDevice, cls, new C18729a(), m24611i(), m24614l(), null, null, 192, null));
            }
        } else {
            m24613k().mo84371h(AbstractC2875y.m8296i(System.identityHashCode(this), "(", ") :Creating a new object for Whoop Strap"), new Object[0]);
            C10015c.Companion bVar2 = C10015c.INSTANCE;
            Class<? extends InterfaceC39750a> cls2 = this.implClass;
            AbstractC22676k.m65747g(cls2);
            bleWhoopStrapService = this;
            m24617o(C10015c.Companion.m24759b(bVar2, this, bluetoothDevice, cls2, new C18729a(), m24611i(), m24614l(), null, null, 192, null));
        }
        C10015c c10015c5 = bleWhoopStrapService.whoopStrap;
        if (c10015c5 != null) {
            c10015c5.mo104074O();
            m24618p(c10015c5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m24617o(C10015c c10015c) {
        m24613k().mo84371h("whoopStrap changed from " + this.whoopStrap + " to " + c10015c, new Object[0]);
        this.whoopStrap = c10015c;
    }

    /* JADX INFO: renamed from: p */
    private final void m24618p(InterfaceC21750d iWhoopStrap) {
        InterfaceC3027k1 interfaceC3027k1 = this.monitorConnectionStateJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.monitorConnectionStateJob = AbstractC3006f0.m8732z(m24612j(), null, null, new C10012j(iWhoopStrap, null), 3);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        m24615m(intent);
        return this.whoopStrapServiceBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        m24613k().mo84371h("onDestroy", new Object[0]);
        InterfaceC3027k1 interfaceC3027k1 = this.monitorConnectionStateJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        C10015c c10015c = this.whoopStrap;
        if (c10015c != null) {
            c10015c.mo24736k2();
        }
    }
}
