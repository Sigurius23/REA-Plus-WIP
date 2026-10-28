package com.whoop.whooplabs.p070io;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import b92.AbstractC2891a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import kj0.AbstractC22513a;
import l83.C23454a0;
import live.hms.video.utils.HMSConstantsKt;
import lm0.C24506a;
import lm0.EnumC24508c;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import nz2.AbstractC27308b;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import yw2.AbstractC39833e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00022uB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001e\u0010\u0012J \u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0083@¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010\u0019J\u001d\u0010)\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0015H\u0003¢\u0006\u0004\b,\u0010\u0019J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\"0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\"0J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020/0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010RR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020T0W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u0016\u0010m\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010oR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010qR\u001d\u0010t\u001a\b\u0012\u0004\u0012\u00020/0W8\u0006¢\u0006\f\n\u0004\b)\u0010Y\u001a\u0004\bs\u0010[¨\u0006v"}, m65681d2 = {"Lcom/whoop/whooplabs/io/HrDeviceConnection;", "", "Lbc3/c0;", "scope", "Landroid/content/Context;", "context", "Llm0/a;", "bleStateChangeReceiver", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "<init>", "(Lbc3/c0;Landroid/content/Context;Llm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/bluetooth/BluetoothAdapter;)V", "", "deviceAddress", "Landroid/bluetooth/BluetoothDevice;", "v", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "emitDisconnected", "Ll83/a0;", "r", "(Z)V", "t", "()V", "z", "H", "()Z", "y", "x", "emitDisconnect", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "", "hrData", "G", "([BLq83/d;)Ljava/lang/Object;", "p", "Lbc3/k;", "continuation", "q", "(Lbc3/k;)V", "o", "u", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "", "E", "(Landroid/bluetooth/BluetoothGattCharacteristic;)I", "a", "Lbc3/c0;", "F", "()Lbc3/c0;", "b", "Landroid/content/Context;", "B", "()Landroid/content/Context;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Landroid/bluetooth/BluetoothAdapter;", "Landroid/bluetooth/BluetoothGatt;", "e", "Landroid/bluetooth/BluetoothGatt;", "gatt", "Ltr2/n;", "f", "Ltr2/n;", "logger", "Lec3/o1;", "g", "Lec3/o1;", "_dataFlow", "Lec3/t1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lec3/t1;", "C", "()Lec3/t1;", "dataFlow", "Lec3/p1;", "i", "Lec3/p1;", "_connectionStateFlow", "Lcom/whoop/whooplabs/io/HrDeviceConnection$a;", "j", "_broadcastingStateFlow", "Lec3/f2;", "k", "Lec3/f2;", "getBroadcastingStateFlow", "()Lec3/f2;", "broadcastingStateFlow", "Lbc3/k1;", "l", "Lbc3/k1;", "getPauseAndEmitNotBroadcastingJob", "()Lbc3/k1;", "setPauseAndEmitNotBroadcastingJob", "(Lbc3/k1;)V", "pauseAndEmitNotBroadcastingJob", "m", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "I", "(Ljava/lang/String;)V", "n", "Z", "shouldAutoReconnect", "Lmc3/a;", "Lmc3/a;", "connectMutex", "Lbc3/k;", "activeConnectContinuation", "A", "connectionStateFlow", "HrDeviceConnectionException", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HrDeviceConnection {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private BluetoothGatt gatt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13072o1 _dataFlow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC13087t1 dataFlow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC13075p1 _connectionStateFlow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC13075p1 _broadcastingStateFlow;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC13037f2 broadcastingStateFlow;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private InterfaceC3027k1 pauseAndEmitNotBroadcastingJob;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public String deviceAddress;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean shouldAutoReconnect;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final InterfaceC25435a connectMutex;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private InterfaceC3025k activeConnectContinuation;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC13037f2 connectionStateFlow;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/whoop/design/util/TextResource;", "error", "<init>", "(Lcom/whoop/design/util/TextResource;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/design/util/TextResource;", "a", "()Lcom/whoop/design/util/TextResource;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class HrDeviceConnectionException extends Exception {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private final TextResource error;

        public HrDeviceConnectionException(TextResource error) {
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getError() {
            return this.error;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/whooplabs/io/HrDeviceConnection$a;", "", "<init>", "(Ljava/lang/String;I)V", "BROADCASTING", "NOT_BROADCASTING", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EnumC10841a {
        BROADCASTING,
        NOT_BROADCASTING;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceConnection$cancelAndRescheduleHrNotBroadcastingJob$1", m100430f = "HrDeviceConnection.kt", m100431l = {202, 203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10842b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f33286w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f33287x;

        public C10842b(InterfaceC30057d<? super C10842b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10842b c10842b = HrDeviceConnection.this.new C10842b(interfaceC30057d);
            c10842b.f33287x = obj;
            return c10842b;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10842b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f33287x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33286w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f33287x = interfaceC2994c0;
                this.f33286w = 1;
                if (AbstractC3034m0.m8782b(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
            if (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                InterfaceC13075p1 interfaceC13075p1 = HrDeviceConnection.this._broadcastingStateFlow;
                EnumC10841a enumC10841a = EnumC10841a.NOT_BROADCASTING;
                this.f33287x = null;
                this.f33286w = 2;
                ((C13045h2) interfaceC13075p1).emit(enumC10841a, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10843c implements Function1 {

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC3025k f33290x;

        public C10843c(InterfaceC3025k interfaceC3025k) {
            this.f33290x = interfaceC3025k;
        }

        /* JADX INFO: renamed from: a */
        public final void m28609a(Throwable th3) {
            if (HrDeviceConnection.this.activeConnectContinuation == this.f33290x) {
                HrDeviceConnection.this.activeConnectContinuation = null;
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m28609a((Throwable) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"com/whoop/whooplabs/io/HrDeviceConnection$d", "Landroid/bluetooth/BluetoothGattCallback;", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", NotificationCompat.CATEGORY_STATUS, "newState", "Ll83/a0;", "onConnectionStateChange", "(Landroid/bluetooth/BluetoothGatt;II)V", "onServicesDiscovered", "(Landroid/bluetooth/BluetoothGatt;I)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "onCharacteristicChanged", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V", "Landroid/bluetooth/BluetoothGattDescriptor;", "descriptor", "onDescriptorWrite", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10844d extends BluetoothGattCallback {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f33292b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC3025k f33293c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ BluetoothDevice f33294d;

        /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceConnection$connectToDeviceInternal$2$bluetoothGattCallback$1$onCharacteristicChanged$1", m100430f = "HrDeviceConnection.kt", m100431l = {175}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f33295w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ HrDeviceConnection f33296x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ BluetoothGattCharacteristic f33297y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HrDeviceConnection hrDeviceConnection, BluetoothGattCharacteristic bluetoothGattCharacteristic, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f33296x = hrDeviceConnection;
                this.f33297y = bluetoothGattCharacteristic;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f33296x, this.f33297y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f33295w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HrDeviceConnection hrDeviceConnection = this.f33296x;
                    byte[] value = this.f33297y.getValue();
                    AbstractC22676k.m65749i(value, "getValue(...)");
                    this.f33295w = 1;
                    if (hrDeviceConnection.m28574G(value, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$d$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            public static final b f33298w = new b();

            /* JADX INFO: renamed from: a */
            public final void m28610a(Throwable it) {
                AbstractC22676k.m65750j(it, "it");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m28610a((Throwable) obj);
                return C23454a0.f92919a;
            }
        }

        public C10844d(boolean z4, InterfaceC3025k interfaceC3025k, BluetoothDevice bluetoothDevice) {
            this.f33292b = z4;
            this.f33293c = interfaceC3025k;
            this.f33294d = bluetoothDevice;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
            AbstractC22676k.m65750j(characteristic, "characteristic");
            boolean zM65745e = AbstractC22676k.m65745e(characteristic.getUuid(), AbstractC22513a.m65016b());
            HrDeviceConnection.this.logger.mo85228t("onCharacteristicChanged: HR chr is " + zM65745e + " , hr is " + HrDeviceConnection.this.m28573E(characteristic), new AbstractC30556a.a[0]);
            if (zM65745e) {
                AbstractC3006f0.m8732z(HrDeviceConnection.this.getScope(), null, null, new a(HrDeviceConnection.this, characteristic, null), 3);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
            AbstractC22676k.m65750j(gatt, "gatt");
            HrDeviceConnection.this.logger.mo85228t(AbstractC11266d.m30461o("new HR connection state: ", AbstractC2891a.m8453a(newState)), new AbstractC30556a.a[0]);
            InterfaceC13075p1 interfaceC13075p1 = HrDeviceConnection.this._connectionStateFlow;
            Integer numValueOf = Integer.valueOf(newState);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, numValueOf);
            if (newState == 0) {
                HrDeviceConnection.this.m28604r(this.f33292b);
            } else {
                if (newState != 2) {
                    return;
                }
                gatt.discoverServices();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
            if (this.f33293c.isActive()) {
                if (status == 0) {
                    HrDeviceConnection.this.m28592q(this.f33293c);
                    this.f33293c.mo8744e(this.f33294d, b.f33298w);
                } else {
                    HrDeviceConnection.this.m28592q(this.f33293c);
                    this.f33293c.resumeWith(AbstractC34132o.m107888l(new HrDeviceConnectionException(new TextResource.C8688b(AbstractC39833e.f171735t, null, 2, null))));
                }
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt gatt, int status) {
            AbstractC22676k.m65750j(gatt, "gatt");
            if (status != 0) {
                if (this.f33293c.isActive()) {
                    HrDeviceConnection.this.m28592q(this.f33293c);
                    this.f33293c.resumeWith(AbstractC34132o.m107888l(new HrDeviceConnectionException(new TextResource.C8688b(AbstractC39833e.f171723h, null, 2, null))));
                    return;
                }
                return;
            }
            BluetoothGattCharacteristic characteristic = gatt.getService(AbstractC22513a.m65017c()).getCharacteristic(AbstractC22513a.m65016b());
            if (characteristic == null) {
                InterfaceC3025k interfaceC3025k = this.f33293c;
                HrDeviceConnection hrDeviceConnection = HrDeviceConnection.this;
                if (interfaceC3025k.isActive()) {
                    hrDeviceConnection.m28592q(interfaceC3025k);
                    interfaceC3025k.resumeWith(AbstractC34132o.m107888l(new HrDeviceConnectionException(new TextResource.C8688b(AbstractC39833e.f171722g, null, 2, null))));
                    return;
                }
                return;
            }
            if (!gatt.setCharacteristicNotification(characteristic, true)) {
                if (this.f33293c.isActive()) {
                    HrDeviceConnection.this.m28592q(this.f33293c);
                    this.f33293c.resumeWith(AbstractC34132o.m107888l(new HrDeviceConnectionException(new TextResource.C8688b(AbstractC39833e.f171725j, null, 2, null))));
                    return;
                }
                return;
            }
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(AbstractC22513a.m65015a());
            if (descriptor == null) {
                InterfaceC3025k interfaceC3025k2 = this.f33293c;
                HrDeviceConnection hrDeviceConnection2 = HrDeviceConnection.this;
                if (interfaceC3025k2.isActive()) {
                    hrDeviceConnection2.m28592q(interfaceC3025k2);
                    interfaceC3025k2.resumeWith(AbstractC34132o.m107888l(new HrDeviceConnectionException(new TextResource.C8688b(AbstractC39833e.f171724i, null, 2, null))));
                    return;
                }
                return;
            }
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            if (gatt.writeDescriptor(descriptor) || !this.f33293c.isActive()) {
                return;
            }
            HrDeviceConnection.this.m28592q(this.f33293c);
            this.f33293c.resumeWith(AbstractC34132o.m107888l(new HrDeviceConnectionException(new TextResource.C8688b(AbstractC39833e.f171726k, null, 2, null))));
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceConnection", m100430f = "HrDeviceConnection.kt", m100431l = {261, 96}, m100432m = "connectToDeviceWithFix", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10845e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f33299E;

        /* JADX INFO: renamed from: G */
        int f33301G;

        /* JADX INFO: renamed from: w */
        Object f33302w;

        /* JADX INFO: renamed from: x */
        Object f33303x;

        /* JADX INFO: renamed from: y */
        int f33304y;

        /* JADX INFO: renamed from: z */
        int f33305z;

        public C10845e(InterfaceC30057d<? super C10845e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33299E = obj;
            this.f33301G |= Integer.MIN_VALUE;
            return HrDeviceConnection.this.m28597y(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceConnection$connectionStateFlow$1", m100430f = "HrDeviceConnection.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "deviceState", "Llm0/c;", "btState", "<anonymous>", "(ILlm0/c;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10846f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f33306w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ int f33307x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f33308y;

        /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceConnection$connectionStateFlow$1$1", m100430f = "HrDeviceConnection.kt", m100431l = {85}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f33310w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ HrDeviceConnection f33311x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HrDeviceConnection hrDeviceConnection, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f33311x = hrDeviceConnection;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f33311x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f33310w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    HrDeviceConnection hrDeviceConnection = this.f33311x;
                    String strM28601D = hrDeviceConnection.m28601D();
                    this.f33310w = 1;
                    if (hrDeviceConnection.m28606v(strM28601D, this) == enumC31071a) {
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

        public C10846f(InterfaceC30057d<? super C10846f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m28611f(int i13, EnumC24508c enumC24508c, InterfaceC30057d<? super Integer> interfaceC30057d) {
            C10846f c10846f = HrDeviceConnection.this.new C10846f(interfaceC30057d);
            c10846f.f33307x = i13;
            c10846f.f33308y = enumC24508c;
            return c10846f.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m28611f(((Number) obj).intValue(), (EnumC24508c) obj2, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13 = this.f33307x;
            EnumC24508c enumC24508c = (EnumC24508c) this.f33308y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f33306w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (enumC24508c == EnumC24508c.OFF) {
                HrDeviceConnection.m28593s(HrDeviceConnection.this, false, 1, null);
                i13 = 0;
            } else if (i13 == 0) {
                HrDeviceConnection hrDeviceConnection = HrDeviceConnection.this;
                if (hrDeviceConnection.deviceAddress != null && hrDeviceConnection.shouldAutoReconnect) {
                    AbstractC3006f0.m8732z(HrDeviceConnection.this.getScope(), null, null, new a(HrDeviceConnection.this, null), 3);
                }
            }
            return new Integer(i13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.whooplabs.io.HrDeviceConnection$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.io.HrDeviceConnection", m100430f = "HrDeviceConnection.kt", m100431l = {194, 195}, m100432m = "onHeartBeat", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10847g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f33312w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f33313x;

        /* JADX INFO: renamed from: z */
        int f33315z;

        public C10847g(InterfaceC30057d<? super C10847g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33313x = obj;
            this.f33315z |= Integer.MIN_VALUE;
            return HrDeviceConnection.this.m28574G(null, this);
        }
    }

    public HrDeviceConnection(InterfaceC2994c0 scope, Context context, C24506a bleStateChangeReceiver, FeatureFlagChecker featureFlagChecker, BluetoothAdapter bluetoothAdapter) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(bleStateChangeReceiver, "bleStateChangeReceiver");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.scope = scope;
        this.context = context;
        this.featureFlagChecker = featureFlagChecker;
        this.bluetoothAdapter = bluetoothAdapter;
        this.logger = AbstractC27308b.m82458a("HrDeviceConnection");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this._dataFlow = c13096w1M36592b;
        this.dataFlow = AbstractC13091v.m36597g(c13096w1M36592b);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(0);
        this._connectionStateFlow = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(EnumC10841a.NOT_BROADCASTING);
        this._broadcastingStateFlow = c13045h2M36593c2;
        this.broadcastingStateFlow = c13045h2M36593c2;
        this.shouldAutoReconnect = true;
        this.connectMutex = AbstractC25438d.m74669a();
        this.connectionStateFlow = AbstractC13091v.m36587M(new C13060l1(c13045h2M36593c, bleStateChangeReceiver.getBluetoothStateFlow(), new C10846f(null), 1), scope, C13105z1.f45288a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final int m28573E(BluetoothGattCharacteristic characteristic) {
        Integer intValue = characteristic.getIntValue((characteristic.getProperties() & 1) != 0 ? 18 : 17, 1);
        AbstractC22676k.m65749i(intValue, "getIntValue(...)");
        return intValue.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r3 == r1) goto L21;
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28574G(byte[] r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.whoop.whooplabs.p070io.HrDeviceConnection.C10847g
            if (r0 == 0) goto L13
            r0 = r9
            com.whoop.whooplabs.io.HrDeviceConnection$g r0 = (com.whoop.whooplabs.p070io.HrDeviceConnection.C10847g) r0
            int r1 = r0.f33315z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33315z = r1
            goto L18
        L13:
            com.whoop.whooplabs.io.HrDeviceConnection$g r0 = new com.whoop.whooplabs.io.HrDeviceConnection$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f33313x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f33315z
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r8 = r0.f33312w
            byte[] r8 = (byte[]) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L61
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.f33312w
            byte[] r8 = (byte[]) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L51
        L41:
            p505ts.AbstractC34132o.m107864I(r9)
            ec3.o1 r9 = r7._dataFlow
            r0.f33312w = r4
            r0.f33315z = r6
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L51
            goto L60
        L51:
            ec3.p1 r8 = r7._broadcastingStateFlow
            com.whoop.whooplabs.io.HrDeviceConnection$a r9 = com.whoop.whooplabs.p070io.HrDeviceConnection.EnumC10841a.BROADCASTING
            r0.f33312w = r4
            r0.f33315z = r5
            ec3.h2 r8 = (ec3.C13045h2) r8
            r8.emit(r9, r0)
            if (r3 != r1) goto L61
        L60:
            return r1
        L61:
            r7.m28591p()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.whooplabs.p070io.HrDeviceConnection.m28574G(byte[], q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: H */
    private final boolean m28575H() {
        return this.featureFlagChecker.isFeatureEnabled("dwl-android-connection-maintainer-fix");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final void m28590o() {
        InterfaceC3025k interfaceC3025k = this.activeConnectContinuation;
        if (interfaceC3025k != null && interfaceC3025k.isActive()) {
            interfaceC3025k.cancel(new CancellationException("Connection closed"));
        }
        this.activeConnectContinuation = null;
    }

    /* JADX INFO: renamed from: p */
    private final void m28591p() {
        InterfaceC3027k1 interfaceC3027k1 = this.pauseAndEmitNotBroadcastingJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.pauseAndEmitNotBroadcastingJob = AbstractC3006f0.m8732z(this.scope, null, null, new C10842b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m28592q(InterfaceC3025k continuation) {
        if (this.activeConnectContinuation == continuation) {
            this.activeConnectContinuation = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m28593s(HrDeviceConnection hrDeviceConnection, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        hrDeviceConnection.m28604r(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: u */
    public final void m28594u() {
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
        }
        this.gatt = null;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: w */
    private final Object m28595w(String str, boolean z4, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        m28590o();
        this.activeConnectContinuation = c3033m;
        c3033m.m8776u(new C10843c(c3033m));
        m28603I(str);
        m28594u();
        if (z4) {
            InterfaceC13075p1 interfaceC13075p1 = this._connectionStateFlow;
            Integer num = new Integer(0);
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.getClass();
            c13045h2.m36571k(null, num);
        }
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        AbstractC22676k.m65747g(bluetoothAdapter);
        BluetoothDevice remoteDevice = bluetoothAdapter.getRemoteDevice(str);
        AbstractC22676k.m65749i(remoteDevice, "getRemoteDevice(...)");
        this.gatt = remoteDevice.connectGatt(getContext(), false, new C10844d(z4, c3033m, remoteDevice), 2);
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: x */
    private final Object m28596x(String str, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) {
        return m28595w(str, true, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m28597y(String str, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) throws Throwable {
        C10845e c10845e;
        InterfaceC25435a interfaceC25435a;
        int i13;
        Throwable th3;
        InterfaceC25435a interfaceC25435a2;
        if (interfaceC30057d instanceof C10845e) {
            c10845e = (C10845e) interfaceC30057d;
            int i14 = c10845e.f33301G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c10845e.f33301G = i14 - Integer.MIN_VALUE;
            } else {
                c10845e = new C10845e(interfaceC30057d);
            }
        } else {
            c10845e = new C10845e(interfaceC30057d);
        }
        Object obj = c10845e.f33299E;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = c10845e.f33301G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.connectMutex;
                c10845e.f33302w = str;
                c10845e.f33303x = interfaceC25435a;
                c10845e.f33304y = 0;
                c10845e.f33301G = 1;
                if (interfaceC25435a.mo68211b(c10845e) != obj2) {
                    i13 = 0;
                }
                return obj2;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c10845e.f33303x;
                try {
                    AbstractC34132o.m107864I(obj);
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                    interfaceC25435a2.mo68214i(null);
                    return bluetoothDevice;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            int i16 = c10845e.f33304y;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c10845e.f33303x;
            String str2 = (String) c10845e.f33302w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            i13 = i16;
            str = str2;
            c10845e.f33302w = null;
            c10845e.f33303x = interfaceC25435a;
            c10845e.f33304y = i13;
            c10845e.f33305z = 0;
            c10845e.f33301G = 2;
            Object objM28595w = m28595w(str, false, c10845e);
            if (objM28595w != obj2) {
                InterfaceC25435a interfaceC25435a4 = interfaceC25435a;
                obj = objM28595w;
                interfaceC25435a2 = interfaceC25435a4;
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) obj;
                interfaceC25435a2.mo68214i(null);
                return bluetoothDevice2;
            }
            return obj2;
        } catch (Throwable th5) {
            InterfaceC25435a interfaceC25435a5 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2 = interfaceC25435a5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final InterfaceC13037f2 getConnectionStateFlow() {
        return this.connectionStateFlow;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final InterfaceC13087t1 getDataFlow() {
        return this.dataFlow;
    }

    /* JADX INFO: renamed from: D */
    public final String m28601D() {
        String str = this.deviceAddress;
        if (str != null) {
            return str;
        }
        AbstractC22676k.m65757q("deviceAddress");
        throw null;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final InterfaceC2994c0 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: I */
    public final void m28603I(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.deviceAddress = str;
    }

    /* JADX INFO: renamed from: r */
    public final void m28604r(boolean emitDisconnected) {
        m28590o();
        m28594u();
        if (emitDisconnected) {
            C13045h2 c13045h2 = (C13045h2) this._connectionStateFlow;
            c13045h2.getClass();
            c13045h2.m36571k(null, 0);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m28605t() {
        this.shouldAutoReconnect = false;
        m28604r(false);
    }

    /* JADX INFO: renamed from: v */
    public final Object m28606v(String str, InterfaceC30057d<? super BluetoothDevice> interfaceC30057d) {
        return m28575H() ? m28597y(str, interfaceC30057d) : m28596x(str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: z */
    public final void m28607z() {
        this.shouldAutoReconnect = true;
    }

    public /* synthetic */ HrDeviceConnection(InterfaceC2994c0 interfaceC2994c0, Context context, C24506a c24506a, FeatureFlagChecker featureFlagChecker, BluetoothAdapter bluetoothAdapter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2994c0, context, c24506a, featureFlagChecker, (i13 & 16) != 0 ? BluetoothAdapter.getDefaultAdapter() : bluetoothAdapter);
    }
}
