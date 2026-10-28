package td1;

import ak0.C0940b;
import ak0.C0945g;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.C6656c;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.service.rearchitect.BleWhoopStrapService;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13072o1;
import f93.AbstractC14290b;
import f93.InterfaceC14292d;
import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jk0.InterfaceC21750d;
import kk0.C22538a;
import kk0.C22539b;
import l73.AbstractC23410a;
import l73.AbstractC23412c;
import l83.C23454a0;
import mh3.AbstractC25568e;
import mh3.C25566c;
import p392p3.C28761b0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import q83.InterfaceC30057d;
import q92.C30071c;
import q92.C30076h;
import qc1.C30217a;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import st0.AbstractC32962f;
import st0.C32958b;
import st0.C32959c;
import st0.C32960d;
import st0.C32961e;
import st0.C32963g;
import st0.C32964h;
import st0.C32965i;
import st0.C32966j;
import st0.C32967k;
import st0.C32969m;
import st0.C32970n;
import st0.C32971o;
import tj0.InterfaceC33864a;
import tr2.InterfaceC34116n;
import v73.CallableC35776b;
import w73.CallableC36924j;
import xg3.C38280g;
import xg3.InterfaceC38293t;
import xj0.AbstractC38334b;
import xj0.AbstractC38356i0;
import yj0.C39588b;
import ze1.C40588d;
import zj0.C40726g1;
import zj0.C40727h;
import zj0.C40733j;
import zj0.C40736k;
import zj0.C40742m;
import zj0.C40749p0;
import zj0.C40761v0;

/* JADX INFO: renamed from: td1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000©\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001z\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0019\u0010\u0013J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b%\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010'H\u0096@¢\u0006\u0004\b(\u0010\u0015J\u001a\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020)H\u0096@¢\u0006\u0004\b,\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010.H\u0096@¢\u0006\u0004\b/\u0010\u0015J\u0012\u00100\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0004\b0\u0010\u0015J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00020605H\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020:09H\u0016¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020:0=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u001eH\u0016¢\u0006\u0004\bD\u0010 J\u0015\u0010G\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\"\u0010I\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\bI\u0010\u001dJ\u000f\u0010J\u001a\u00020\u001eH\u0002¢\u0006\u0004\bJ\u0010 J\u0017\u0010M\u001a\u00020\u001e2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010SR\u001c\u0010W\u001a\b\u0018\u00010TR\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010VR/\u0010^\u001a\u0004\u0018\u00010@2\b\u0010X\u001a\u0004\u0018\u00010@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010CR\"\u0010b\u001a\u0010\u0012\f\u0012\n `*\u0004\u0018\u00010:0:0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010aR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020:0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010dR\u001a\u0010L\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010P\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010u\u001a\u00020r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00020:8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0089\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0091\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bY\u0010\u0092\u0001R\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0097\u0001"}, m65681d2 = {"Ltd1/d;", "Ltd1/b;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;", "Lq92/h;", "whoopStrapSharedPrefs", "<init>", "(Lq92/h;)V", "Lxj0/b;", "any", "", "timeout", "Lzj0/h;", "k", "(Lxj0/b;JLq83/d;)Ljava/lang/Object;", "", "intervalSeconds", "durationSeconds", "", "z", "(IILq83/d;)Ljava/lang/Object;", "x", "(Lq83/d;)Ljava/lang/Object;", "patternId", "numberOfLoops", "Lak0/g;", "D", "enable", "Lzj0/g1;", "t", "(ZJLq83/d;)Ljava/lang/Object;", "Ll83/a0;", "l", "()V", "B", "Lfk2/a;", "timeStamp", "Lzj0/v0;", "u", "(Lfk2/a;Lq83/d;)Ljava/lang/Object;", "Lzj0/m;", "g", "Lxj0/i0;", "params", "Lzj0/p0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lxj0/i0;Lq83/d;)Ljava/lang/Object;", "Lzj0/j;", "a", "c", "Ll73/c;", "Lot0/a;", "E", "()Ll73/c;", "Ll73/a;", "Lek0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ll73/a;", "Lxg3/g;", "Ltd1/e;", "i", "()Lxg3/g;", "Lec3/l;", "r", "()Lec3/l;", "Ljk0/d;", "whoopStrap", "C", "(Ljk0/d;)V", "q", "Landroid/content/Context;", "context", "R", "(Landroid/content/Context;)V", "o", "a0", "Lkk0/a;", "batteryLevel", "T", "(Lkk0/a;)V", "Lkk0/b;", "chargeStatus", "W", "(Lkk0/b;)V", "Lq92/h;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "binder", "<set-?>", "y", "Lf93/d;", "S", "()Ljk0/d;", "Z", "newBleWhoopStrap", "Lze1/d;", "kotlin.jvm.PlatformType", "Lze1/d;", "statusSubject", "Lec3/o1;", "Lec3/o1;", "strapStatusFlow", "F", "Lkk0/a;", "b", "()Lkk0/a;", "G", "Lkk0/b;", "n", "()Lkk0/b;", "Ltr2/n;", "H", "Ltr2/n;", "log", "Lxg3/t;", "I", "Lxg3/t;", "nordicBleStatus", "Lmh3/c;", "J", "Lmh3/c;", "strapPropertySubscriptions", "td1/d$d", "K", "Ltd1/d$d;", "serviceConnection", "Ltj0/a;", "e", "()Ltj0/a;", "genericHrProfileController", "Ltd1/a;", "d", "()Ltd1/a;", "strapGeneration", "A", "()Ltd1/e;", "currentStatus", "Lcom/whoop/domain/model/WhoopStrapInfo;", "f", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "Landroid/bluetooth/BluetoothDevice;", "m", "()Landroid/bluetooth/BluetoothDevice;", "device", "", "()Ljava/lang/String;", "deviceName", "j", "()Ljava/lang/Boolean;", "batteryPackOn", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33706d implements InterfaceC33704b, BleWhoopStrapService.InterfaceC10005c {

    /* JADX INFO: renamed from: L */
    static final /* synthetic */ InterfaceC21493z[] f140895L = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C33706d.class, "newBleWhoopStrap", "getNewBleWhoopStrap()Lcom/whoop/ble/strap/IWhoopStrap;", 0))};

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 strapStatusFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C22538a batteryLevel;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C22539b chargeStatus;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private InterfaceC38293t nordicBleStatus;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C25566c strapPropertySubscriptions;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final d serviceConnection;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private BleWhoopStrapService.BinderC10003a binder;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC14292d newBleWhoopStrap;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C40588d<EnumC33707e> statusSubject;

    /* JADX INFO: renamed from: td1.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f140907a;

        static {
            int[] iArr = new int[EnumC33703a.values().length];
            try {
                iArr[EnumC33703a.MAVERICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33703a.HARVARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC33703a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f140907a = iArr;
        }
    }

    /* JADX INFO: renamed from: td1.d$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapProxyImpl", m100430f = "WhoopStrapProxyImpl.kt", m100431l = {169}, m100432m = "sendExitHighFreqHistorySyncCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f140908w;

        /* JADX INFO: renamed from: y */
        int f140910y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f140908w = obj;
            this.f140910y |= Integer.MIN_VALUE;
            return C33706d.this.mo106507x(this);
        }
    }

    /* JADX INFO: renamed from: td1.d$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.strap.WhoopStrapProxyImpl", m100430f = "WhoopStrapProxyImpl.kt", m100431l = {165}, m100432m = "sendHighFrequencyHistorySyncCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f140911E;

        /* JADX INFO: renamed from: w */
        int f140912w;

        /* JADX INFO: renamed from: x */
        int f140913x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f140914y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f140914y = obj;
            this.f140911E |= Integer.MIN_VALUE;
            return C33706d.this.mo106509z(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: td1.d$d */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"td1/d$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "name", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements ServiceConnection {
        public d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder service) {
            AbstractC22676k.m65750j(className, "className");
            AbstractC22676k.m65750j(service, "service");
            C33706d.this.log.mo85228t("onServiceConnected", new AbstractC30556a.a[0]);
            try {
                C33706d.this.binder = (BleWhoopStrapService.BinderC10003a) service;
                BleWhoopStrapService.BinderC10003a binderC10003a = C33706d.this.binder;
                if (binderC10003a != null) {
                    binderC10003a.m24623c(C33706d.this);
                }
            } catch (ClassCastException e5) {
                C33706d.this.log.mo85230v("Failed to cast service binder: " + service + " to BleWhoopStrapServiceBinder", e5, new AbstractC30556a.a[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC22676k.m65750j(name, "name");
            C33706d.this.log.mo85228t("onServiceDisconnected", new AbstractC30556a.a[0]);
            C33706d.this.m106535Z(null);
        }
    }

    /* JADX INFO: renamed from: td1.d$e */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"td1/d$e", "Lf93/b;", "Lj93/z;", "property", "oldValue", "newValue", "Ll83/a0;", "afterChange", "(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC14290b {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C33706d f140917w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, C33706d c33706d) {
            super(obj);
            this.f140917w = c33706d;
        }

        @Override // f93.AbstractC14290b
        public void afterChange(InterfaceC21493z property, InterfaceC21750d oldValue, InterfaceC21750d newValue) {
            AbstractC22676k.m65750j(property, "property");
            this.f140917w.m106528a0();
        }
    }

    public C33706d(C30076h whoopStrapSharedPrefs) {
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.newBleWhoopStrap = new e(null, this);
        C40588d<EnumC33707e> c40588dM131622Y = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y, "createSingle(...)");
        this.statusSubject = c40588dM131622Y;
        this.strapStatusFlow = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
        this.batteryLevel = new C22538a();
        this.chargeStatus = new C22539b();
        this.log = InterfaceC34116n.INSTANCE.m107848a("WhoopStrapProxyImpl");
        this.nordicBleStatus = AbstractC25568e.f100262a;
        this.strapPropertySubscriptions = new C25566c();
        m106528a0();
        this.serviceConnection = new d();
    }

    /* JADX INFO: renamed from: T */
    private final void m106522T(C22538a batteryLevel) {
        getBatteryLevel().m65134c(batteryLevel);
        this.strapPropertySubscriptions.m75179c(batteryLevel.m65140j().m122661K(new C6529c(new C28761b0(9, this, batteryLevel), 23)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m106523U(C33706d c33706d, C22538a c22538a, Byte b6) {
        c33706d.getBatteryLevel().m65134c(c22538a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m106524V(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W */
    private final void m106525W(C22539b chargeStatus) {
        getChargeStatus().m65148c(chargeStatus);
        this.strapPropertySubscriptions.m75179c(chargeStatus.m65151f().m122661K(new C6529c(new C33705c(this, 1), 22)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m106526X(C33706d c33706d, C22539b c22539b) {
        C22539b chargeStatus = c33706d.getChargeStatus();
        AbstractC22676k.m65747g(c22539b);
        chargeStatus.m65148c(c22539b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m106527Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final void m106528a0() {
        if (m106534S() == null) {
            C40588d<EnumC33707e> c40588d = this.statusSubject;
            EnumC33707e enumC33707e = EnumC33707e.NONE;
            c40588d.onNext(enumC33707e);
            this.strapStatusFlow.mo36564a(enumC33707e);
            return;
        }
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S == null) {
            throw new IllegalStateException("another thread changed strap to null");
        }
        this.strapPropertySubscriptions.m75180d();
        m106522T(interfaceC21750dM106534S.getBatteryLevel());
        m106525W(interfaceC21750dM106534S.getChargeStatus());
        C30071c c30071c = new C30071c();
        interfaceC21750dM106534S.mo104073M(c30071c);
        this.nordicBleStatus.mo14750b();
        InterfaceC38293t interfaceC38293tM122661K = c30071c.m92172c().m122659I(C32963g.f137291a).m122682x(new C6656c(new C30217a(24), 26)).m122661K(new C6529c(new C33705c(this, 0), 21));
        AbstractC22676k.m65749i(interfaceC38293tM122661K, "subscribe(...)");
        this.nordicBleStatus = interfaceC38293tM122661K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final EnumC33707e m106529b0(AbstractC32962f abstractC32962f) {
        if (!AbstractC22676k.m65745e(abstractC32962f, C32959c.f137288a) && !AbstractC22676k.m65745e(abstractC32962f, C32958b.f137287a)) {
            if (AbstractC22676k.m65745e(abstractC32962f, C32963g.f137291a)) {
                return EnumC33707e.NONE;
            }
            if (!AbstractC22676k.m65745e(abstractC32962f, C32961e.f137290a) && !AbstractC22676k.m65745e(abstractC32962f, C32960d.f137289a)) {
                if (!AbstractC22676k.m65745e(abstractC32962f, C32966j.f137295a) && !AbstractC22676k.m65745e(abstractC32962f, C32971o.f137299a)) {
                    if (AbstractC22676k.m65745e(abstractC32962f, C32969m.f137297a)) {
                        return EnumC33707e.LOCKED;
                    }
                    if (AbstractC22676k.m65745e(abstractC32962f, C32970n.f137298a)) {
                        return EnumC33707e.READY;
                    }
                    if (!AbstractC22676k.m65745e(abstractC32962f, C32964h.f137292a) && !AbstractC22676k.m65745e(abstractC32962f, C32967k.f137296a)) {
                        if (abstractC32962f instanceof C32965i) {
                            return EnumC33707e.CONNECTION_FAILED;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return EnumC33707e.NONE;
                }
                return EnumC33707e.INITIALIZING;
            }
            return EnumC33707e.CONNECTING;
        }
        return EnumC33707e.BONDING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final EnumC33707e m106530c0(Function1 function1, Object obj) {
        return (EnumC33707e) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m106531d0(C33706d c33706d, EnumC33707e enumC33707e) {
        c33706d.statusSubject.onNext(enumC33707e);
        InterfaceC13072o1 interfaceC13072o1 = c33706d.strapStatusFlow;
        AbstractC22676k.m65747g(enumC33707e);
        interfaceC13072o1.mo36564a(enumC33707e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m106532e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: A */
    public EnumC33707e mo106484A() {
        EnumC33707e enumC33707eM131623Z = this.statusSubject.m131623Z();
        return enumC33707eM131623Z == null ? EnumC33707e.NONE : enumC33707eM131623Z;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: B */
    public Object mo106485B(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM61372K0;
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        return (interfaceC21750dM106534S == null || (objM61372K0 = InterfaceC21750d.m61372K0(interfaceC21750dM106534S, 0L, interfaceC30057d, 1, null)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objM61372K0;
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: C */
    public void mo13710C(InterfaceC21750d whoopStrap) {
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        m106535Z(whoopStrap);
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: D */
    public Object mo106486D(int i13, int i14, InterfaceC30057d<? super C0945g> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61374R(interfaceC21750dM106534S, new C39588b(i13, i14), 0L, interfaceC30057d, 2, null);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: E */
    public AbstractC23412c mo106487E() {
        AbstractC23412c abstractC23412cMo24696K;
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        return (interfaceC21750dM106534S == null || (abstractC23412cMo24696K = interfaceC21750dM106534S.mo24696K()) == null) ? CallableC36924j.f157986w : abstractC23412cMo24696K;
    }

    /* JADX INFO: renamed from: R */
    public final void m106533R(Context context) {
        AbstractC22676k.m65750j(context, "context");
        BleWhoopStrapService.INSTANCE.m24627a(context, this.serviceConnection, this.whoopStrapSharedPrefs.m92195a());
    }

    /* JADX INFO: renamed from: S */
    public final InterfaceC21750d m106534S() {
        return (InterfaceC21750d) this.newBleWhoopStrap.getValue(this, f140895L[0]);
    }

    /* JADX INFO: renamed from: Z */
    public final void m106535Z(InterfaceC21750d interfaceC21750d) {
        this.newBleWhoopStrap.setValue(this, f140895L[0], interfaceC21750d);
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: a */
    public Object mo106488a(InterfaceC30057d<? super C40733j> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61383t0(interfaceC21750dM106534S, 0L, interfaceC30057d, 1, null);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: b, reason: from getter */
    public C22538a getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: c */
    public Object mo106490c(InterfaceC30057d<? super C40727h> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61382s0(interfaceC21750dM106534S, 0L, interfaceC30057d, 1, null);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: d */
    public EnumC33703a mo106491d() {
        EnumC33703a enumC33703aMo24721d;
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        return (interfaceC21750dM106534S == null || (enumC33703aMo24721d = interfaceC21750dM106534S.mo24721d()) == null) ? EnumC33703a.UNKNOWN : enumC33703aMo24721d;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: e */
    public InterfaceC33864a mo106492e() {
        int i13 = a.f140907a[mo106491d().ordinal()];
        if (i13 != 1 && i13 != 2) {
            if (i13 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return interfaceC21750dM106534S.mo24724e();
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: f */
    public WhoopStrapInfo mo106493f() {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return interfaceC21750dM106534S.get_strapInfo();
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: g */
    public Object mo106494g(InterfaceC30057d<? super C40742m> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61381r(interfaceC21750dM106534S, 0L, 0, interfaceC30057d, 3, null);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: h */
    public AbstractC23410a mo106495h() {
        AbstractC23410a abstractC23410aMo24728h;
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null && (abstractC23410aMo24728h = interfaceC21750dM106534S.mo24728h()) != null) {
            return abstractC23410aMo24728h;
        }
        int i13 = AbstractC23410a.f92767w;
        return CallableC35776b.f152145x;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: i */
    public C38280g<EnumC33707e> mo106496i() {
        return this.statusSubject;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: j */
    public Boolean mo106497j() {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return Boolean.valueOf(interfaceC21750dM106534S.getBatteryPackOn());
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: k */
    public Object mo106498k(AbstractC38334b abstractC38334b, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61379l0(interfaceC21750dM106534S, abstractC38334b, j7, null, interfaceC30057d, 4, null);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: l */
    public void mo106499l() {
        C40588d<EnumC33707e> c40588d = this.statusSubject;
        EnumC33707e enumC33707e = EnumC33707e.NONE;
        c40588d.onNext(enumC33707e);
        this.strapStatusFlow.mo36564a(enumC33707e);
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            interfaceC21750dM106534S.mo24690G0();
        }
        BleWhoopStrapService.BinderC10003a binderC10003a = this.binder;
        if (binderC10003a != null) {
            binderC10003a.m24625g();
        }
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: m */
    public BluetoothDevice mo106500m() {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return interfaceC21750dM106534S.getBluetoothDevice();
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: n, reason: from getter */
    public C22539b getChargeStatus() {
        return this.chargeStatus;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: o */
    public Object mo106502o(boolean z4, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return interfaceC21750dM106534S.mo24741o(z4, j7, interfaceC30057d);
        }
        return null;
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: q */
    public void mo13718q() {
        this.log.mo85228t("Lost Whoop Strap", new AbstractC30556a.a[0]);
        m106535Z(null);
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: r */
    public InterfaceC13058l mo106503r() {
        return AbstractC13091v.m36597g(this.strapStatusFlow);
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: t */
    public Object mo106504t(boolean z4, long j7, InterfaceC30057d<? super C40726g1> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return interfaceC21750dM106534S.mo24700N0(z4, j7, interfaceC30057d);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: u */
    public Object mo106505u(C14554a c14554a, InterfaceC30057d<? super C40761v0> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61369B0(interfaceC21750dM106534S, c14554a, 0L, interfaceC30057d, 2, null);
        }
        return null;
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: w */
    public Object mo106506w(AbstractC38356i0 abstractC38356i0, InterfaceC30057d<? super C40749p0> interfaceC30057d) {
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null) {
            return InterfaceC21750d.m61371J0(interfaceC21750dM106534S, 0L, abstractC38356i0, interfaceC30057d, 1, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: x */
    public Object mo106507x(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        b bVar;
        boolean zM132198W;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f140910y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f140910y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM61368B = bVar2.f140908w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f140910y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61368B);
            InterfaceC21750d interfaceC21750dM106534S = m106534S();
            if (interfaceC21750dM106534S != null) {
                bVar2.f140910y = 1;
                objM61368B = InterfaceC21750d.m61368B(interfaceC21750dM106534S, 0L, bVar2, 1, null);
                if (objM61368B == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                zM132198W = false;
            }
            return Boolean.valueOf(zM132198W);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM61368B);
        C40736k c40736k = (C40736k) objM61368B;
        if (c40736k != null) {
            zM132198W = c40736k.m132198W();
        } else {
            zM132198W = false;
        }
        return Boolean.valueOf(zM132198W);
    }

    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: y */
    public String mo106508y() {
        String strMo24698M0;
        InterfaceC21750d interfaceC21750dM106534S = m106534S();
        if (interfaceC21750dM106534S != null && (strMo24698M0 = interfaceC21750dM106534S.getAdvertisingName()) != null) {
            return strMo24698M0;
        }
        WhoopStrapInfo whoopStrapInfoMo106493f = mo106493f();
        if (whoopStrapInfoMo106493f != null) {
            return whoopStrapInfoMo106493f.getDeviceName();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // td1.InterfaceC33704b
    /* JADX INFO: renamed from: z */
    public Object mo106509z(int i13, int i14, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        boolean zM132198W;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i15 = cVar.f140911E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f140911E = i15 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM61386y0 = cVar2.f140914y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = cVar2.f140911E;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM61386y0);
            InterfaceC21750d interfaceC21750dM106534S = m106534S();
            if (interfaceC21750dM106534S != null) {
                cVar2.f140912w = i13;
                cVar2.f140913x = i14;
                cVar2.f140911E = 1;
                objM61386y0 = InterfaceC21750d.m61386y0(interfaceC21750dM106534S, i13, i14, 0L, cVar2, 4, null);
                if (objM61386y0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                zM132198W = false;
            }
            return Boolean.valueOf(zM132198W);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM61386y0);
        C0940b c0940b = (C0940b) objM61386y0;
        if (c0940b != null) {
            zM132198W = c0940b.m132198W();
        } else {
            zM132198W = false;
        }
        return Boolean.valueOf(zM132198W);
    }
}
