package qm2;

import a92.C0589a;
import android.annotation.SuppressLint;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1630u0;
import bc3.InterfaceC2994c0;
import com.whoop.domain.model.WhoopStrapInfo;
import f93.InterfaceC14292d;
import fi0.InterfaceC14515a;
import hi0.AbstractC17311i;
import hi0.AbstractC17312j;
import hj0.AbstractC17356o;
import i92.InterfaceC18260e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import m32.EnumC25009e;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import o52.C27566m0;
import od1.InterfaceC27837a0;
import or2.C28150c;
import or2.C28180m;
import or2.C28196r0;
import or2.C28199s0;
import or2.InterfaceC28186o;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C29124b;
import q80.C30036h;
import q83.AbstractC30060g;
import q92.C30076h;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import yb3.AbstractC39421y;
import z82.C40191e;
import z82.C40196j;
import zg3.C40634a;

/* JADX INFO: renamed from: qm2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\r\u0010$\u001a\u00020 ¢\u0006\u0004\b$\u0010\"J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010\"J\r\u0010&\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020 ¢\u0006\u0004\b(\u0010\"J\r\u0010)\u001a\u00020 ¢\u0006\u0004\b)\u0010\"J\u0017\u0010,\u001a\u00020 2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020 2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020 2\u0006\u00102\u001a\u00020\f¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020 2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020 2\u0006\u00109\u001a\u000205¢\u0006\u0004\b:\u00108J!\u0010=\u001a\u00020 2\u0006\u0010<\u001a\u00020;2\n\b\u0002\u00109\u001a\u0004\u0018\u000105¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00020 2\u0006\u0010?\u001a\u0002052\b\u0010@\u001a\u0004\u0018\u000105¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020 ¢\u0006\u0004\bC\u0010\"J\r\u0010D\u001a\u00020 ¢\u0006\u0004\bD\u0010\"J\r\u0010E\u001a\u00020 ¢\u0006\u0004\bE\u0010\"J\u000f\u0010F\u001a\u00020\u0014H\u0003¢\u0006\u0004\bF\u0010'J\u000f\u0010G\u001a\u00020 H\u0002¢\u0006\u0004\bG\u0010\"J\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020 H\u0003¢\u0006\u0004\bJ\u0010\"J\u000f\u0010K\u001a\u00020\u0014H\u0002¢\u0006\u0004\bK\u0010'J\u000f\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\\R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010$R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010]R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010e\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b7\u0010b\u001a\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010$R\u001c\u0010j\u001a\b\u0018\u00010gR\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010$R\u001d\u0010p\u001a\b\u0012\u0004\u0012\u0002050m8\u0006¢\u0006\f\n\u0004\b(\u0010n\u001a\u0004\bU\u0010oR\u001d\u0010q\u001a\b\u0012\u0004\u0012\u0002050m8\u0006¢\u0006\f\n\u0004\b0\u0010n\u001a\u0004\bM\u0010oR#\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0s0r8\u0006¢\u0006\f\n\u0004\b3\u0010t\u001a\u0004\bS\u0010uR\u001d\u0010{\u001a\b\u0012\u0004\u0012\u00020x0w8\u0006¢\u0006\f\n\u0004\b:\u0010y\u001a\u0004\bZ\u0010zR\u0017\u0010\u007f\u001a\u00020|8\u0006¢\u0006\f\n\u0004\b$\u0010}\u001a\u0004\bQ\u0010~R\u0019\u0010\u0081\u0001\u001a\u00020|8\u0006¢\u0006\r\n\u0005\b\u0080\u0001\u0010}\u001a\u0004\bO\u0010~R1\u0010\u0087\u0001\u001a\u00020x2\u0007\u0010\u0082\u0001\u001a\u00020x8B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b%\u0010\u0083\u0001\u001a\u0005\bX\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001d\u0010\u0089\u0001\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\r\n\u0005\b,\u0010\u0088\u0001\u001a\u0004\b^\u0010'R\u0016\u0010\u008b\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010'¨\u0006\u008c\u0001"}, m65681d2 = {"Lqm2/f;", "Lhj0/o;", "La92/a;", "scanController", "Lod1/a0;", "userSessionManager", "Ltr2/n;", "logger", "Lor2/c;", "appDiagnostics", "Li92/e;", "networkMonitor", "", "sdkVersion", "Lz82/e;", "eventDispatcher", "Lor2/o;", "companionDeviceInteractor", "Lz82/j;", "onboardingTracker", "", "isTest", "Lq92/h;", "whoopStrapSharedPrefs", "Lfi0/a;", "analytics", "Ltd1/b;", "whoopStrapProxy", "Lbc3/c0;", "coroutineScope", "<init>", "(La92/a;Lod1/a0;Ltr2/n;Lor2/c;Li92/e;ILz82/e;Lor2/o;Lz82/j;ZLq92/h;Lfi0/a;Ltd1/b;Lbc3/c0;)V", "Ll83/a0;", "o0", "()V", "n0", "Z", "b0", "M", "()Z", "V", "k0", "Lqm2/s;", "scanResult", "c0", "(Lqm2/s;)V", "Lm32/e;", "result", "W", "(Lm32/e;)V", "requestCode", "X", "(I)V", "", "action", "R", "(Ljava/lang/String;)V", "deviceAddress", "Y", "Lqm2/n;", NotificationCompat.CATEGORY_STATUS, "S", "(Lqm2/n;Ljava/lang/String;)V", "strapGeneration", "name", "d0", "(Ljava/lang/String;Ljava/lang/String;)V", "e0", "m0", "l0", "N", "h0", "g0", "()I", "C", "B", "O", "E", "La92/a;", "F", "Lod1/a0;", "G", "Ltr2/n;", "H", "Lor2/c;", "I", "Li92/e;", "J", "K", "Lz82/e;", "L", "Lor2/o;", "Lz82/j;", "Lq92/h;", "P", "Lfi0/a;", "Q", "Ltd1/b;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "isAndroid12orHigher", "La92/a$b;", "T", "La92/a$b;", "scanHandle", "U", "companionDevicePairingInProgress", "Lor2/s0;", "Lor2/s0;", "()Lor2/s0;", "startCompanionDevicePairingEvent", "connectToDeviceEvent", "Landroidx/lifecycle/u0;", "", "Landroidx/lifecycle/u0;", "()Landroidx/lifecycle/u0;", "scannedWhoopDevices", "Landroidx/lifecycle/p0;", "Lqm2/g;", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "viewStateLiveData", "Lor2/r0;", "Lor2/r0;", "()Lor2/r0;", "requestNewBlePermissionEvent", "a0", "navigateToAppInfoAction", "<set-?>", "Lf93/d;", "()Lqm2/g;", "f0", "(Lqm2/g;)V", "viewState", "Ll83/h;", "isUserGoingThroughOnBoardingProcess", "D", "companionPairingEnabled", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30489f extends AbstractC17356o {

    /* JADX INFO: renamed from: d0 */
    static final /* synthetic */ InterfaceC21493z[] f125280d0 = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C30489f.class, "viewState", "getViewState()Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapViewState;", 0))};

    /* JADX INFO: renamed from: e0 */
    public static final int f125281e0 = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C0589a scanController;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C28150c appDiagnostics;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int sdkVersion;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC28186o companionDeviceInteractor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C40196j onboardingTracker;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final boolean isTest;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final boolean isAndroid12orHigher;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private C0589a.b scanHandle;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private boolean companionDevicePairingInProgress;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final C28199s0<String> startCompanionDevicePairingEvent;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final C28199s0<String> connectToDeviceEvent;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C1630u0 scannedWhoopDevices;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final AbstractC1615p0 viewStateLiveData;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final C28196r0 requestNewBlePermissionEvent;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final C28196r0 navigateToAppInfoAction;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC23462h isUserGoingThroughOnBoardingProcess;

    /* JADX INFO: renamed from: qm2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125307a;

        static {
            int[] iArr = new int[EnumC30497n.values().length];
            try {
                iArr[EnumC30497n.COMPANION_DEVICE_PAIRING_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC30497n.COMPANION_DEVICE_PAIRING_CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC30497n.COMPANION_DEVICE_PAIRING_TIMED_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC30497n.COMPANION_DEVICE_MANAGER_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f125307a = iArr;
        }
    }

    /* JADX INFO: renamed from: qm2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((C30502s) t15).getRssi()), Integer.valueOf(((C30502s) t14).getRssi()));
        }
    }

    /* JADX INFO: renamed from: qm2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"qm2/f$c", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C30490g value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30489f f125309x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, C30489f c30489f) {
            this.f125309x = c30489f;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C30490g getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C30490g value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C30489f c30489f = this.f125309x;
            c30489f.m49138t(c30489f.getViewStateLiveData(), value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30489f(C0589a scanController, InterfaceC27837a0 userSessionManager, InterfaceC34116n logger, C28150c appDiagnostics, InterfaceC18260e networkMonitor, int i13, C40191e eventDispatcher, InterfaceC28186o companionDeviceInteractor, C40196j onboardingTracker, boolean z4, C30076h whoopStrapSharedPrefs, InterfaceC14515a analytics, InterfaceC33704b whoopStrapProxy, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(scanController, "scanController");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(appDiagnostics, "appDiagnostics");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(companionDeviceInteractor, "companionDeviceInteractor");
        AbstractC22676k.m65750j(onboardingTracker, "onboardingTracker");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.scanController = scanController;
        this.userSessionManager = userSessionManager;
        this.logger = logger;
        this.appDiagnostics = appDiagnostics;
        this.networkMonitor = networkMonitor;
        this.sdkVersion = i13;
        this.eventDispatcher = eventDispatcher;
        this.companionDeviceInteractor = companionDeviceInteractor;
        this.onboardingTracker = onboardingTracker;
        this.isTest = z4;
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.analytics = analytics;
        this.whoopStrapProxy = whoopStrapProxy;
        this.logTag = "BleChooseStrapViewModel";
        this.isAndroid12orHigher = i13 >= 31;
        this.startCompanionDevicePairingEvent = new C28199s0<>();
        this.connectToDeviceEvent = new C28199s0<>();
        this.scannedWhoopDevices = new C1630u0(C25271y.f99162w);
        this.viewStateLiveData = new C1630u0();
        this.requestNewBlePermissionEvent = new C28196r0();
        this.navigateToAppInfoAction = new C28196r0();
        this.viewState = new c(new C30490g(0, 0, 0, 0, 0, 0, 0, 0, 0, false, 1023, null), this);
        this.isUserGoingThroughOnBoardingProcess = AbstractC30060g.m92088H(new C30036h(this, 6));
    }

    /* JADX INFO: renamed from: B */
    private final boolean m93348B() {
        return (this.isAndroid12orHigher || this.appDiagnostics.m85178a()) ? false : true;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: C */
    private final void m93349C() {
        if (this.isAndroid12orHigher) {
            if (!m93352N()) {
                this.requestNewBlePermissionEvent.m85330e();
                return;
            }
        } else if (!m93371M()) {
            m93357f0(C30490g.m93388b(m93351K(), 8, 8, 0, 8, 0, 8, m93358g0(), 0, 0, false, 912, null));
            return;
        }
        if (!m93353O()) {
            m93357f0(C30490g.m93388b(m93351K(), 0, 8, 8, 8, 0, 8, m93358g0(), 0, 0, false, 912, null));
        } else if (m93348B()) {
            m93357f0(C30490g.m93388b(m93351K(), 8, 0, 8, 8, 0, 8, m93358g0(), 0, 0, false, 912, null));
        } else {
            m93357f0(C30490g.m93388b(m93351K(), 8, 8, 8, 0, AbstractC17311i.f66909f, 0, m93358g0(), 0, 0, true, 384, null));
            m93359h0();
        }
    }

    /* JADX INFO: renamed from: D */
    private final boolean m93350D() {
        return this.sdkVersion >= 26;
    }

    /* JADX INFO: renamed from: K */
    private final C30490g m93351K() {
        return (C30490g) this.viewState.getValue(this, f125280d0[0]);
    }

    /* JADX INFO: renamed from: N */
    private final boolean m93352N() {
        return this.appDiagnostics.m85179b("android.permission.BLUETOOTH_CONNECT") && this.appDiagnostics.m85179b("android.permission.BLUETOOTH_SCAN");
    }

    /* JADX INFO: renamed from: O */
    private final boolean m93353O() {
        return this.appDiagnostics.m85180c();
    }

    /* JADX INFO: renamed from: P */
    private final boolean m93354P() {
        return ((Boolean) this.isUserGoingThroughOnBoardingProcess.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final boolean m93355Q(C30489f c30489f) {
        return c30489f.userSessionManager.mo83921q() == null;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m93356U(C30489f c30489f, EnumC30497n enumC30497n, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        c30489f.m93373S(enumC30497n, str);
    }

    /* JADX INFO: renamed from: f0 */
    private final void m93357f0(C30490g c30490g) {
        this.viewState.setValue(this, f125280d0[0], c30490g);
    }

    /* JADX INFO: renamed from: g0 */
    private final int m93358g0() {
        return m93354P() ? 0 : 8;
    }

    /* JADX INFO: renamed from: h0 */
    private final void m93359h0() {
        getSubscriptions().m75179c(this.scanController.m1532h().m122655E().m122652B(C40634a.m131874a()).m122661K(new C27566m0(new C29124b(this, 14), 12)));
        C0589a.b bVarM1533i = this.scanController.m1533i();
        if (bVarM1533i == null) {
            this.logger.mo85225p("BleChooseStrapViewModel", "Failed to start Bluetooth scans...", new AbstractC30556a.a[0]);
            return;
        }
        m93383k0();
        this.scanHandle = bVarM1533i;
        this.logger.mo85220k("BleChooseStrapViewModel", "Bluetooth scans started", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m93360i0(C30489f c30489f, C30502s c30502s) {
        AbstractC22676k.m65747g(c30502s);
        c30489f.m93380c0(c30502s);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m93361j0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final C28199s0<String> m93365E() {
        return this.connectToDeviceEvent;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final C28196r0 getNavigateToAppInfoAction() {
        return this.navigateToAppInfoAction;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final C28196r0 getRequestNewBlePermissionEvent() {
        return this.requestNewBlePermissionEvent;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final C1630u0 getScannedWhoopDevices() {
        return this.scannedWhoopDevices;
    }

    /* JADX INFO: renamed from: I */
    public final C28199s0<String> m93369I() {
        return this.startCompanionDevicePairingEvent;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final AbstractC1615p0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m93371M() {
        return this.sdkVersion >= 31 || this.appDiagnostics.m85179b("android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX INFO: renamed from: R */
    public final void m93372R(String action) {
        AbstractC22676k.m65750j(action, "action");
        if (action.equals("android.location.PROVIDERS_CHANGED")) {
            m93349C();
        } else if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            m93349C();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m93373S(EnumC30497n status, String deviceAddress) {
        AbstractC22676k.m65750j(status, "status");
        this.companionDevicePairingInProgress = false;
        int i13 = a.f125307a[status.ordinal()];
        if (i13 == 1) {
            this.eventDispatcher.m129068y();
            this.logger.mo85228t("User accepted association. Moving to connect", new AbstractC30556a.a[0]);
            if (deviceAddress != null) {
                this.connectToDeviceEvent.m85347e(deviceAddress);
                return;
            }
            return;
        }
        if (i13 == 2) {
            this.eventDispatcher.m129066x();
            this.logger.mo85226q("Result Cancelled. User denied association request.", new AbstractC30556a.a[0]);
            return;
        }
        if (i13 == 3) {
            this.eventDispatcher.m129070z();
            this.logger.mo85226q("Companion Device Pairing timed out", new AbstractC30556a.a[0]);
            if (deviceAddress != null) {
                this.connectToDeviceEvent.m85347e(deviceAddress);
                return;
            }
            return;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85226q("CompanionDeviceManager was null, proceeding with connection attempt without attempting Companion Device Pairing", new AbstractC30556a.a[0]);
        if (deviceAddress != null) {
            this.connectToDeviceEvent.m85347e(deviceAddress);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m93374V() {
        m93359h0();
    }

    /* JADX INFO: renamed from: W */
    public final void m93375W(EnumC25009e result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.werePermissionsGranted()) {
            m93349C();
        } else {
            this.navigateToAppInfoAction.m85330e();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m93376X(int requestCode) {
        if (requestCode == 2131) {
            m93349C();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m93377Y(String deviceAddress) {
        AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
        if (!m93350D() || this.companionDeviceInteractor.mo85301a(deviceAddress) || this.isTest) {
            this.connectToDeviceEvent.m85347e(deviceAddress);
            return;
        }
        if (!this.companionDevicePairingInProgress) {
            this.startCompanionDevicePairingEvent.m85347e(deviceAddress);
        }
        this.companionDevicePairingInProgress = true;
    }

    /* JADX INFO: renamed from: Z */
    public final void m93378Z() {
        m93349C();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m93379b0() {
        m93383k0();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m93380c0(C30502s scanResult) {
        AbstractC22676k.m65750j(scanResult, "scanResult");
        List list = (List) this.scannedWhoopDevices.getValue();
        if (list != null) {
            Set<C30502s> setM74101H1 = AbstractC25265s.m74101H1(list);
            if (!setM74101H1.isEmpty()) {
                for (C30502s c30502s : setM74101H1) {
                    if (AbstractC22676k.m65745e(c30502s.getName(), scanResult.getName()) && AbstractC22676k.m65745e(c30502s.getAddress(), scanResult.getAddress())) {
                        return;
                    }
                }
            }
            WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
            if (AbstractC39421y.m125921F(whoopStrapInfoMo106493f != null ? whoopStrapInfoMo106493f.getDeviceName() : null, scanResult.getName(), false) && !this.isTest) {
                this.logger.mo85222m(AbstractC11895b.m31996o("Not displaying ", scanResult.getName(), " on the scanned devices list because its already connected to the app!"), new AbstractC30556a.a[0]);
                return;
            }
            setM74101H1.add(scanResult);
            this.scannedWhoopDevices.setValue(AbstractC25265s.m74152u1(setM74101H1, new b()));
            m93382e0();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m93381d0(String strapGeneration, String name) {
        AbstractC22676k.m65750j(strapGeneration, "strapGeneration");
        this.logger.mo85228t(AbstractC11266d.m30456j(this.onboardingTracker.m129077b(), "Current \"Connect\" button click count is ", ". Strap Generation: ", strapGeneration), new AbstractC30556a.a[0]);
        if (this.onboardingTracker.m129077b() == 0) {
            this.logger.mo85228t("Sending first time Connect click event!", new AbstractC30556a.a[0]);
            this.eventDispatcher.m129021X(strapGeneration, Boolean.TRUE);
        }
        this.eventDispatcher.m128981C(strapGeneration, AbstractC25247g0.m73990Y(new C23465k("online_status", String.valueOf(this.networkMonitor.isConnected())), new C23465k("new_strap", String.valueOf(!AbstractC22676k.m65745e(this.whoopStrapSharedPrefs.m92197c(), name))), new C23465k("other_properties", "new-connectivity-flow")));
        this.onboardingTracker.m129078c();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m93382e0() {
        InterfaceC14515a.m41418i(this.analytics, null, null, null, "Device found", null, AbstractC31061c.m95645u("Screen", "Pairing: Connecting device"), 23, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m93383k0() {
        C0589a.b bVar = this.scanHandle;
        if (bVar != null) {
            if (bVar != null) {
                bVar.m1536a();
            }
            this.scanHandle = null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m93384l0() {
        InterfaceC14515a.m41418i(this.analytics, null, "need help?", null, "Pairing: CTA", null, AbstractC31061c.m95645u("source", "choose device screen"), 21, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m93385m0() {
        InterfaceC14515a.m41418i(this.analytics, null, "upgraded your whoop?", null, "Pairing: CTA", null, AbstractC31061c.m95645u("source", "choose device screen"), 21, null);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m93386n0() {
        m93357f0(C30490g.m93388b(m93351K(), 0, 0, 0, 0, 0, 0, 0, AbstractC17312j.f66930I, AbstractC17312j.f66942O, false, 127, null));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m93387o0() {
        m93357f0(C30490g.m93388b(m93351K(), 0, 0, 0, 0, 0, 0, 0, AbstractC17312j.f66953T0, AbstractC17312j.f66954U, true, 127, null));
    }

    public /* synthetic */ C30489f(C0589a c0589a, InterfaceC27837a0 interfaceC27837a0, InterfaceC34116n interfaceC34116n, C28150c c28150c, InterfaceC18260e interfaceC18260e, int i13, C40191e c40191e, InterfaceC28186o interfaceC28186o, C40196j c40196j, boolean z4, C30076h c30076h, InterfaceC14515a interfaceC14515a, InterfaceC33704b interfaceC33704b, InterfaceC2994c0 interfaceC2994c0, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0589a, interfaceC27837a0, interfaceC34116n, c28150c, interfaceC18260e, i13, c40191e, interfaceC28186o, c40196j, z4, c30076h, interfaceC14515a, interfaceC33704b, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
