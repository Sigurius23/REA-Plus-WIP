package rk0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.core.app.NotificationCompat;
import dc3.C11923h;
import dc3.C11929n;
import dc3.InterfaceC11927l;
import ec3.AbstractC13091v;
import ec3.C13054k;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import md3.InterfaceC25456b;
import nd3.C26591a;
import no.nordicsemi.android.ble.AbstractC26886c;
import no.nordicsemi.android.ble.AbstractC26903k0;
import no.nordicsemi.android.ble.C26891e0;
import no.nordicsemi.android.ble.C26893f0;
import no.nordicsemi.android.ble.C26895g0;
import no.nordicsemi.android.ble.C26915q0;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pj0.InterfaceC29293a;
import pj0.InterfaceC29295c;
import pj0.InterfaceC29296d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qd3.InterfaceC30297b;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32410a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: rk0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u001b\u0010\u0019J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010 \u001a\u00020\bH\u0096@¢\u0006\u0004\b!\u0010\"J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010 \u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020#0'2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u001c2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0015H\u0014¢\u0006\u0004\b7\u0010+J\u000f\u00108\u001a\u00020\u0015H\u0014¢\u0006\u0004\b8\u0010+J\u0017\u00109\u001a\u00020\u00122\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b9\u00106J\u000f\u0010:\u001a\u00020\u0015H\u0000¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\u0015H\u0000¢\u0006\u0004\b;\u0010+J\u0017\u0010<\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001cH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010=J\u001f\u0010B\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001cH\u0016¢\u0006\u0004\bB\u0010@J\u0017\u0010C\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bC\u0010=J\u0017\u0010D\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\bD\u0010=JB\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u001082\u0006\u0010E\u001a\u00020/2\u001c\u0010I\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000G\u0012\u0006\u0012\u0004\u0018\u00010H0FH\u0080@¢\u0006\u0004\bJ\u0010KJ%\u0010M\u001a\b\u0012\u0004\u0012\u00020L0\u00142\u0006\u0010E\u001a\u00020/2\u0006\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010UR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020O0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010]R \u0010b\u001a\b\u0012\u0004\u0012\u00020O0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010_\u001a\u0004\b`\u0010aR&\u0010e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\\0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010dR\"\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020f0c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010dR\u0014\u0010j\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006l"}, m65681d2 = {"Lrk0/c;", "Lno/nordicsemi/android/ble/c;", "Lpj0/a;", "Lqd3/b;", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothDevice;", "device", "Ljava/util/UUID;", "serviceId", "", "characteristicIds", "Ltr2/n;", "logger", "Landroid/os/HandlerThread;", "callbackThread", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/Set;Ltr2/n;Landroid/os/HandlerThread;)V", "", "autoConnect", "Lpj0/d;", "Ll83/a0;", "g", "(ZLq83/d;)Ljava/lang/Object;", "l", "(Lq83/d;)Ljava/lang/Object;", "s", "r", "", "preferred", "p", "(ILq83/d;)Ljava/lang/Object;", "characteristicId", "i", "(Ljava/util/UUID;Lq83/d;)Ljava/lang/Object;", "", "data", "j", "(Ljava/util/UUID;[BLq83/d;)Ljava/lang/Object;", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/UUID;)Lec3/l;", "close", "()V", "I", "()I", "priority", "", "message", "P", "(ILjava/lang/String;)V", "Landroid/bluetooth/BluetoothGatt;", "gatt", "O", "(Landroid/bluetooth/BluetoothGatt;)Z", "L", "T", "r0", "q0", "n0", "f", "(Landroid/bluetooth/BluetoothDevice;)V", "reason", "e", "(Landroid/bluetooth/BluetoothDevice;I)V", "c", "q", "t", "u", "operation", "Lkotlin/Function1;", "Lq83/d;", "", "request", "o0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "", "s0", "(Ljava/lang/String;Ljava/util/UUID;)Lpj0/d;", "Lpj0/c;", NotificationCompat.CATEGORY_EVENT, "m0", "(Lpj0/c;)V", "k", "Landroid/bluetooth/BluetoothDevice;", "Ljava/util/UUID;", "m", "Ljava/util/Set;", "n", "Ltr2/n;", "o", "Landroid/os/HandlerThread;", "Ldc3/l;", "Ldc3/l;", "_events", "Lec3/l;", "B", "()Lec3/l;", "events", "", "Ljava/util/Map;", "notificationChannels", "Landroid/bluetooth/BluetoothGattCharacteristic;", "resolved", "A", "()Z", "hasBond", "a", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@SuppressLint({"MissingPermission"})
public final class C31493c extends AbstractC26886c implements InterfaceC29293a, InterfaceC30297b {

    /* JADX INFO: renamed from: t */
    private static final a f129874t = new a(null);

    /* JADX INFO: renamed from: u */
    private static final AtomicInteger f129875u = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final BluetoothDevice device;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final UUID serviceId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Set<UUID> characteristicIds;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final HandlerThread callbackThread;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC11927l _events;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC13058l events;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final Map<UUID, InterfaceC11927l> notificationChannels;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private volatile Map<UUID, ? extends BluetoothGattCharacteristic> resolved;

    /* JADX INFO: renamed from: rk0.c$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lrk0/c$a;", "", "<init>", "()V", "", "a", "()I", "EVENT_BUFFER", "I", "NOTIFICATION_BUFFER", "MIN_NORDIC_LOG_PRIORITY", "Ljava/util/concurrent/atomic/AtomicInteger;", "threadIds", "Ljava/util/concurrent/atomic/AtomicInteger;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m97020a() {
            return C31493c.f129875u.incrementAndGet();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: rk0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$bond$2", m100430f = "NordicBle.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129885w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129885w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26903k0 abstractC26903k0M80235D = C31493c.this.m80235D();
                AbstractC22676k.m65749i(abstractC26903k0M80235D, "access$createBondInsecure(...)");
                this.f129885w = 1;
                Object objM101025d0 = AbstractC32410a.m101025d0(abstractC26903k0M80235D, this);
                if (objM101025d0 != enumC31071a) {
                    objM101025d0 = c23454a0;
                }
                if (objM101025d0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk0.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$connect$2", m100430f = "NordicBle.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129887w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f129889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f129889y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new c(this.f129889y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129887w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31493c c31493c = C31493c.this;
                C26891e0 c26891e0M80234C = c31493c.m80234C(c31493c.device);
                c26891e0M80234C.f107356v = this.f129889y;
                this.f129887w = 1;
                if (AbstractC32410a.m101021b0(c26891e0M80234C, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk0.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$dropLink$2", m100430f = "NordicBle.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129890w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129890w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26893f0 c26893f0M80236E = C31493c.this.m80236E();
                AbstractC22676k.m65749i(c26893f0M80236E, "disconnect(...)");
                this.f129890w = 1;
                if (AbstractC32410a.m101021b0(c26893f0M80236E, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk0.c$e */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$enableNotifications$2", m100430f = "NordicBle.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129892w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ BluetoothGattCharacteristic f129894y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BluetoothGattCharacteristic bluetoothGattCharacteristic, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f129894y = bluetoothGattCharacteristic;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new e(this.f129894y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129892w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26915q0 c26915q0M80237F = C31493c.this.m80237F(this.f129894y);
                AbstractC22676k.m65749i(c26915q0M80237F, "access$enableNotifications(...)");
                this.f129892w = 1;
                if (AbstractC32410a.m101023c0(c26915q0M80237F, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk0.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$forgetBond$2", m100430f = "NordicBle.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129895w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new f(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129895w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC26903k0 abstractC26903k0M80254W = C31493c.this.m80254W();
                AbstractC22676k.m65749i(abstractC26903k0M80254W, "access$removeBond(...)");
                this.f129895w = 1;
                Object objM101025d0 = AbstractC32410a.m101025d0(abstractC26903k0M80254W, this);
                if (objM101025d0 != enumC31071a) {
                    objM101025d0 = c23454a0;
                }
                if (objM101025d0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk0.c$g */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle", m100430f = "NordicBle.kt", m100431l = {186}, m100432m = "issue$whoop_ble_transport_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g<T> extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129897E;

        /* JADX INFO: renamed from: w */
        Object f129898w;

        /* JADX INFO: renamed from: x */
        Object f129899x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129900y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129900y = obj;
            this.f129897E |= Integer.MIN_VALUE;
            return C31493c.this.m97017o0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: rk0.c$h */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$negotiateMtu$2", m100430f = "NordicBle.kt", m100431l = {86}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129902w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f129904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i13, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f129904y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new h(this.f129904y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129902w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C26895g0 c26895g0M80255X = C31493c.this.m80255X(this.f129904y);
            AbstractC22676k.m65749i(c26895g0M80255X, "access$requestMtu(...)");
            this.f129902w = 1;
            Object objM101019a0 = AbstractC32410a.m101019a0(c26895g0M80255X, this);
            return objM101019a0 == enumC31071a ? enumC31071a : objM101019a0;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk0.c$i */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.device.NordicBle$write$2", m100430f = "NordicBle.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129905w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ BluetoothGattCharacteristic f129907y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ byte[] f129908z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f129907y = bluetoothGattCharacteristic;
            this.f129908z = bArr;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31493c.this.new i(this.f129907y, this.f129908z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129905w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26915q0 c26915q0M80261d0 = C31493c.this.m80261d0(this.f129907y, this.f129908z, 2);
                AbstractC22676k.m65749i(c26915q0M80261d0, "access$writeCharacteristic(...)");
                this.f129905w = 1;
                if (AbstractC32410a.m101023c0(c26915q0M80261d0, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public /* synthetic */ C31493c(Context context, BluetoothDevice bluetoothDevice, UUID uuid, Set set, InterfaceC34116n interfaceC34116n, HandlerThread handlerThread, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 32) != 0) {
            handlerThread = new HandlerThread(AbstractC2875y.m8295h(f129874t.m97020a(), "WhoopBle-"));
            handlerThread.start();
        }
        this(context, bluetoothDevice, uuid, set, interfaceC34116n, handlerThread);
    }

    /* JADX INFO: renamed from: m0 */
    private final void m97013m0(InterfaceC29295c event) {
        this.logger.mo85216g("event: " + event + " on " + this.device.getAddress(), new AbstractC30556a.a[0]);
        if (this._events.mo32218s(event) instanceof C11929n) {
            this.logger.mo85226q("Dropped " + event + ": consumer is behind", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m97014p0(InterfaceC11927l interfaceC11927l, C31493c c31493c, UUID uuid, BluetoothDevice bluetoothDevice, C26591a data) {
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        AbstractC22676k.m65750j(data, "data");
        byte[] bArr = data.f105756w;
        if (bArr != null && (interfaceC11927l.mo32218s(bArr) instanceof C11929n)) {
            c31493c.logger.mo85226q("Dropped " + bArr.length + " bytes from " + uuid + ": consumer is behind", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final InterfaceC29296d m97015s0(String operation, UUID characteristicId) {
        this.logger.mo85226q("Cannot " + operation + " " + characteristicId + ": it is not resolved on " + this.device.getAddress(), new AbstractC30556a.a[0]);
        return InterfaceC29296d.d.f118552a;
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: A */
    public boolean mo88901A() {
        return this.device.getBondState() == 12;
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: B, reason: from getter */
    public InterfaceC13058l getEvents() {
        return this.events;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: I */
    public int mo80240I() {
        return 5;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: L */
    public void mo80243L() {
        m97018q0();
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: O */
    public boolean mo80246O(BluetoothGatt gatt) {
        AbstractC22676k.m65750j(gatt, "gatt");
        return m97019r0(gatt);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: P */
    public void mo80247P(int priority, String message) {
        AbstractC22676k.m65750j(message, "message");
        this.logger.mo85217h(priority, "Nordic", message, null);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c
    /* JADX INFO: renamed from: T */
    public void mo80251T() {
        m97016n0();
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: c */
    public void mo92600c(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        m97013m0(InterfaceC29295c.d.f118546a);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26886c, pj0.InterfaceC29293a
    public void close() {
        super.close();
        this._events.mo32217r(null);
        Iterator<T> it = this.notificationChannels.values().iterator();
        while (it.hasNext()) {
            ((InterfaceC11927l) it.next()).mo32217r(null);
        }
        this.callbackThread.quitSafely();
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: e */
    public void mo92601e(BluetoothDevice device, int reason) {
        AbstractC22676k.m65750j(device, "device");
        m97013m0(new InterfaceC29295c.c(reason));
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: f */
    public void mo92602f(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        m97013m0(InterfaceC29295c.a.f118543a);
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: g */
    public Object mo88903g(boolean z4, InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
        return m97017o0("connect", new c(z4, null), interfaceC30057d);
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: h */
    public InterfaceC13058l mo88904h(UUID characteristicId) {
        AbstractC22676k.m65750j(characteristicId, "characteristicId");
        InterfaceC11927l interfaceC11927l = this.notificationChannels.get(characteristicId);
        return interfaceC11927l != null ? AbstractC13091v.m36585K(interfaceC11927l) : C13054k.f45116w;
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: i */
    public Object mo88905i(UUID uuid, InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.resolved.get(uuid);
        return bluetoothGattCharacteristic == null ? m97015s0("enable notifications on", uuid) : m97017o0("enableNotifications", new e(bluetoothGattCharacteristic, null), interfaceC30057d);
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: j */
    public Object mo88906j(UUID uuid, byte[] bArr, InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.resolved.get(uuid);
        return bluetoothGattCharacteristic == null ? m97015s0("write to", uuid) : m97017o0("write", new i(bluetoothGattCharacteristic, bArr, null), interfaceC30057d);
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: l */
    public Object mo88907l(InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
        return m97017o0("dropLink", new d(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m97016n0() {
        this.resolved = C25272z.f99163w;
        m97013m0(InterfaceC29295c.f.f118548a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o0 */
    public final <T> Object m97017o0(String str, Function1 function1, InterfaceC30057d<? super InterfaceC29296d<? extends T>> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f129897E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f129897E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objInvoke = gVar.f129900y;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar.f129897E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                gVar.f129898w = str;
                gVar.f129899x = null;
                gVar.f129897E = 1;
                objInvoke = function1.invoke(gVar);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) gVar.f129898w;
                AbstractC34132o.m107864I(objInvoke);
            }
            return new InterfaceC29296d.e(objInvoke);
        } catch (BluetoothDisabledException e5) {
            this.logger.mo85213c(AbstractC2875y.m8299l(str, " failed: Bluetooth is off"), e5, new AbstractC30556a.a[0]);
            return InterfaceC29296d.a.f118549a;
        } catch (DeviceDisconnectedException e13) {
            this.logger.mo85213c(AbstractC2875y.m8299l(str, " failed: the device disconnected"), e13, new AbstractC30556a.a[0]);
            return InterfaceC29296d.b.f118550a;
        } catch (InvalidRequestException e14) {
            this.logger.mo85213c(AbstractC2875y.m8299l(str, " could not be issued"), e14, new AbstractC30556a.a[0]);
            return InterfaceC29296d.d.f118552a;
        } catch (RequestFailedException e15) {
            InterfaceC34116n interfaceC34116n = this.logger;
            int i15 = e15.f107358w;
            interfaceC34116n.mo85213c(AbstractC25012a.m73373f(i15, str, " failed with status "), e15, new AbstractC30556a.a[0]);
            return new InterfaceC29296d.c(i15);
        }
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: p */
    public Object mo88908p(int i13, InterfaceC30057d<? super InterfaceC29296d<Integer>> interfaceC30057d) {
        return m97017o0("negotiateMtu", new h(i13, null), interfaceC30057d);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: q */
    public void mo92603q(BluetoothDevice device, int reason) {
        AbstractC22676k.m65750j(device, "device");
        m97013m0(new InterfaceC29295c.b(reason));
    }

    /* JADX INFO: renamed from: q0 */
    public final void m97018q0() {
        for (Map.Entry<UUID, ? extends BluetoothGattCharacteristic> entry : this.resolved.entrySet()) {
            final UUID key = entry.getKey();
            BluetoothGattCharacteristic value = entry.getValue();
            final InterfaceC11927l interfaceC11927l = this.notificationChannels.get(key);
            if (interfaceC11927l != null) {
                m80258a0(value).f107405a = new InterfaceC25456b() { // from class: rk0.b
                    @Override // md3.InterfaceC25456b
                    /* JADX INFO: renamed from: a */
                    public final void mo74863a(BluetoothDevice bluetoothDevice, C26591a c26591a) {
                        C31493c.m97014p0(interfaceC11927l, this, key, bluetoothDevice, c26591a);
                    }
                };
            }
        }
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: r */
    public Object mo88909r(InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
        return m97017o0("forgetBond", new f(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m97019r0(BluetoothGatt gatt) {
        AbstractC22676k.m65750j(gatt, "gatt");
        this.resolved = C25272z.f99163w;
        BluetoothGattService service = gatt.getService(this.serviceId);
        if (service == null) {
            this.logger.mo85226q("Service " + this.serviceId + " is missing on " + this.device.getAddress(), new AbstractC30556a.a[0]);
            m97013m0(new InterfaceC29295c.e(false));
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UUID uuid : this.characteristicIds) {
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid);
            if (characteristic == null) {
                this.logger.mo85226q("Characteristic " + uuid + " is missing on " + this.device.getAddress(), new AbstractC30556a.a[0]);
                m97013m0(new InterfaceC29295c.e(false));
                return false;
            }
            linkedHashMap.put(uuid, characteristic);
        }
        this.resolved = linkedHashMap;
        m97013m0(new InterfaceC29295c.e(true));
        return true;
    }

    @Override // pj0.InterfaceC29293a
    /* JADX INFO: renamed from: s */
    public Object mo88910s(InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
        return m97017o0("bond", new b(null), interfaceC30057d);
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: t */
    public void mo92604t(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
    }

    @Override // qd3.InterfaceC30297b
    /* JADX INFO: renamed from: u */
    public void mo92605u(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31493c(Context context, BluetoothDevice device, UUID serviceId, Set<UUID> characteristicIds, InterfaceC34116n logger, HandlerThread callbackThread) {
        super(context, new Handler(callbackThread.getLooper()));
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(device, "device");
        AbstractC22676k.m65750j(serviceId, "serviceId");
        AbstractC22676k.m65750j(characteristicIds, "characteristicIds");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(callbackThread, "callbackThread");
        this.device = device;
        this.serviceId = serviceId;
        this.characteristicIds = characteristicIds;
        this.logger = logger;
        this.callbackThread = callbackThread;
        C11923h c11923hM92111d = AbstractC30060g.m92111d(16, 6, null);
        this._events = c11923hM92111d;
        this.events = AbstractC13091v.m36585K(c11923hM92111d);
        Set<UUID> set = characteristicIds;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W >= 16 ? iM73988W : 16);
        for (Object obj : set) {
            linkedHashMap.put(obj, AbstractC30060g.m92111d(64, 6, null));
        }
        this.notificationChannels = linkedHashMap;
        this.resolved = C25272z.f99163w;
        m80257Z(this);
    }
}
