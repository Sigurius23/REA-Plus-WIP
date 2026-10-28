package live.hms.video.sdk;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import bc3.InterfaceC3055s;
import java.util.ArrayList;
import l83.C23454a0;
import live.hms.video.audio.BluetoothErrorType;
import live.hms.video.audio.BluetoothPermissionHandler;
import live.hms.video.sdk.models.role.HMSRole;
import live.hms.video.sdk.models.role.PublishParams;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/PermissionsHandlers;", "", "Llive/hms/video/audio/BluetoothPermissionHandler;", "bluetoothPermissionHandler", "<init>", "(Llive/hms/video/audio/BluetoothPermissionHandler;)V", "Llive/hms/video/sdk/models/role/HMSRole;", "hmsRole", "Llive/hms/video/sdk/RequestPermissionInterface;", "requestPermissionInterface", "Landroid/content/Context;", "context", "Ll83/a0;", "requestAndAwaitPermissions", "(Llive/hms/video/sdk/models/role/HMSRole;Llive/hms/video/sdk/RequestPermissionInterface;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;", "setPermissionsAccepted", "()V", "Llive/hms/video/audio/BluetoothPermissionHandler;", "Lbc3/s;", "", "permissionsDeferred", "Lbc3/s;", "", "AUDIO", "Ljava/lang/String;", "VIDEO", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PermissionsHandlers {
    private final String AUDIO;
    private final String VIDEO;
    private final BluetoothPermissionHandler bluetoothPermissionHandler;
    private InterfaceC3055s permissionsDeferred;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BluetoothErrorType.values().length];
            try {
                iArr[BluetoothErrorType.NO_BLUETOOTH_PERMISSON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothErrorType.NO_BLUETOOTH_CONNECT_PERMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.PermissionsHandlers$requestAndAwaitPermissions$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.PermissionsHandlers", m100430f = "PermissionsHandlers.kt", m100431l = {64}, m100432m = "requestAndAwaitPermissions")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241961 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C241961(InterfaceC30057d<? super C241961> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PermissionsHandlers.this.requestAndAwaitPermissions(null, null, null, this);
        }
    }

    public PermissionsHandlers(BluetoothPermissionHandler bluetoothPermissionHandler) {
        AbstractC22676k.m65750j(bluetoothPermissionHandler, "bluetoothPermissionHandler");
        this.bluetoothPermissionHandler = bluetoothPermissionHandler;
        this.permissionsDeferred = AbstractC3006f0.m8707a();
        this.AUDIO = "audio";
        this.VIDEO = "video";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object requestAndAwaitPermissions(HMSRole hMSRole, RequestPermissionInterface requestPermissionInterface, Context context, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C241961 c241961;
        PublishParams publishParams;
        if (interfaceC30057d instanceof C241961) {
            c241961 = (C241961) interfaceC30057d;
            int i13 = c241961.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241961.label = i13 - Integer.MIN_VALUE;
            } else {
                c241961 = new C241961(interfaceC30057d);
            }
        } else {
            c241961 = new C241961(interfaceC30057d);
        }
        Object obj = c241961.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c241961.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (requestPermissionInterface != null) {
                ArrayList arrayList = new ArrayList();
                if (hMSRole != null && (publishParams = hMSRole.getPublishParams()) != null) {
                    if (publishParams.getAllowed().contains(this.AUDIO) && AbstractC32122c.checkSelfPermission(context, "android.permission.RECORD_AUDIO") != 0) {
                        arrayList.add("android.permission.RECORD_AUDIO");
                    }
                    if (publishParams.getAllowed().contains(this.VIDEO) && AbstractC32122c.checkSelfPermission(context, "android.permission.CAMERA") != 0) {
                        arrayList.add("android.permission.CAMERA");
                    }
                    BluetoothErrorType bluetoothErrorTypeHasBluetoothError = this.bluetoothPermissionHandler.hasBluetoothError(context);
                    int i15 = bluetoothErrorTypeHasBluetoothError == null ? -1 : WhenMappings.$EnumSwitchMapping$0[bluetoothErrorTypeHasBluetoothError.ordinal()];
                    if (i15 != -1 && i15 != 1) {
                        if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        arrayList.add(this.bluetoothPermissionHandler.getBLUETOOTH_CONNECT_PERMISSION());
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.permissionsDeferred = AbstractC3006f0.m8707a();
                    requestPermissionInterface.onPermissionsRequested(arrayList);
                    InterfaceC3055s interfaceC3055s = this.permissionsDeferred;
                    c241961.L$0 = requestPermissionInterface;
                    c241961.label = 1;
                    if (((C3058t) interfaceC3055s).m8817m(c241961) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    public final void setPermissionsAccepted() {
        ((C3058t) this.permissionsDeferred).m8807L(Boolean.TRUE);
    }
}
