package fn0;

import android.bluetooth.le.ScanFilter;
import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.BluetoothLeDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import com.whoop.cdm.CompanionDevicePairingException;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zs0.InterfaceC41076a;

/* JADX INFO: renamed from: fn0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001\u0011B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, m65681d2 = {"Lfn0/a;", "Lzs0/a;", "Lbc3/c0;", "Landroid/companion/CompanionDeviceManager;", "manager", "Lin2/d;", "dispatcherFactory", "Ltr2/n;", "logger", "<init>", "(Landroid/companion/CompanionDeviceManager;Lin2/d;Ltr2/n;)V", "", "deviceAddress", "Landroid/companion/AssociationRequest;", "e", "(Ljava/lang/String;)Landroid/companion/AssociationRequest;", "", "a", "(Ljava/lang/String;)Z", "Ll83/a0;", "c", "()V", "Landroid/companion/CompanionDeviceManager$Callback;", "primaryCallback", "b", "(Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/companion/CompanionDeviceManager;", "getManager", "()Landroid/companion/CompanionDeviceManager;", "x", "Ltr2/n;", "Lbc3/u;", "y", "Lbc3/u;", "supervisorJob", "Lq83/j;", "z", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "E", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14639a implements InterfaceC41076a, InterfaceC2994c0 {

    /* JADX INFO: renamed from: F */
    private static final Handler f54048F;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final CompanionDeviceManager manager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC3061u supervisorJob;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC30063j coroutineContext;

    /* JADX INFO: renamed from: fn0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cdm.CompanionDeviceInteractorRedesignImpl$associateCompanionDevice$1", m100430f = "CompanionDeviceInteractorRedesignImpl.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f54053w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ c f54055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54055y = cVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14639a.this.new b(this.f54055y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54053w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f54053w = 1;
                if (AbstractC3034m0.m8782b(5000L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C14639a.this.logger.mo85226q("CDM: Companion Device Manager Timed Out", new AbstractC30556a.a[0]);
            this.f54055y.onFailure("Companion Device Manager Timed Out");
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fn0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"fn0/a$c", "Landroid/companion/CompanionDeviceManager$Callback;", "Landroid/content/IntentSender;", "intentSender", "Ll83/a0;", "onAssociationPending", "(Landroid/content/IntentSender;)V", "chooserLauncher", "onDeviceFound", "", "error", "onFailure", "(Ljava/lang/CharSequence;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends CompanionDeviceManager.Callback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C22669g0 f54056a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ CompanionDeviceManager.Callback f54057b;

        public c(C22669g0 c22669g0, CompanionDeviceManager.Callback callback) {
            this.f54056a = c22669g0;
            this.f54057b = callback;
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onAssociationPending(IntentSender intentSender) {
            AbstractC22676k.m65750j(intentSender, "intentSender");
            onDeviceFound(intentSender);
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onDeviceFound(IntentSender chooserLauncher) {
            AbstractC22676k.m65750j(chooserLauncher, "chooserLauncher");
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f54056a.f89336w;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.f54057b.onDeviceFound(chooserLauncher);
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onFailure(CharSequence error) {
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f54056a.f89336w;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.f54057b.onFailure(error);
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("companion-device-handler");
        handlerThread.start();
        f54048F = new Handler(handlerThread.getLooper());
    }

    public C14639a(CompanionDeviceManager companionDeviceManager, InterfaceC18732d dispatcherFactory, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(logger, "logger");
        this.manager = companionDeviceManager;
        this.logger = logger;
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        this.supervisorJob = c3004e2M8710d;
        this.coroutineContext = dispatcherFactory.getDefault().plus(c3004e2M8710d);
    }

    /* JADX INFO: renamed from: e */
    private final AssociationRequest m41833e(String deviceAddress) {
        BluetoothLeDeviceFilter bluetoothLeDeviceFilterBuild = new BluetoothLeDeviceFilter.Builder().setScanFilter(new ScanFilter.Builder().setDeviceAddress(deviceAddress).build()).build();
        AbstractC22676k.m65749i(bluetoothLeDeviceFilterBuild, "build(...)");
        BluetoothDeviceFilter bluetoothDeviceFilterBuild = new BluetoothDeviceFilter.Builder().setAddress(deviceAddress).build();
        AbstractC22676k.m65749i(bluetoothDeviceFilterBuild, "build(...)");
        AssociationRequest associationRequestBuild = new AssociationRequest.Builder().addDeviceFilter(bluetoothDeviceFilterBuild).addDeviceFilter(bluetoothLeDeviceFilterBuild).setSingleDevice(true).build();
        AbstractC22676k.m65749i(associationRequestBuild, "build(...)");
        return associationRequestBuild;
    }

    @Override // zs0.InterfaceC41076a
    /* JADX INFO: renamed from: a */
    public boolean mo41834a(String deviceAddress) {
        List<String> associations;
        AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
        this.logger.mo85228t("CDM: Device is associated: ".concat(deviceAddress), new AbstractC30556a.a[0]);
        CompanionDeviceManager companionDeviceManager = this.manager;
        if (companionDeviceManager == null || (associations = companionDeviceManager.getAssociations()) == null) {
            return false;
        }
        return associations.contains(deviceAddress);
    }

    @Override // zs0.InterfaceC41076a
    /* JADX INFO: renamed from: b */
    public void mo41835b(String deviceAddress, CompanionDeviceManager.Callback primaryCallback) throws CompanionDevicePairingException {
        AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
        AbstractC22676k.m65750j(primaryCallback, "primaryCallback");
        this.logger.mo85228t("CDM: Starting association request", new AbstractC30556a.a[0]);
        C22669g0 c22669g0 = new C22669g0();
        c cVar = new c(c22669g0, primaryCallback);
        if (this.manager == null) {
            this.logger.mo85226q("Companion Device Manager is null!", new AbstractC30556a.a[0]);
            throw new CompanionDevicePairingException("Companion Device Manager is null!");
        }
        c22669g0.f89336w = AbstractC3006f0.m8732z(this, null, null, new b(cVar, null), 3);
        this.manager.associate(m41833e(deviceAddress), cVar, f54048F);
    }

    @Override // zs0.InterfaceC41076a
    /* JADX INFO: renamed from: c */
    public void mo41836c() {
        List<String> associations;
        CompanionDeviceManager companionDeviceManager;
        this.logger.mo85228t("CDM: Disassociating all associated devices", new AbstractC30556a.a[0]);
        CompanionDeviceManager companionDeviceManager2 = this.manager;
        if (companionDeviceManager2 == null || (associations = companionDeviceManager2.getAssociations()) == null) {
            associations = C25271y.f99162w;
        }
        for (String str : associations) {
            CompanionDeviceManager companionDeviceManager3 = this.manager;
            if (companionDeviceManager3 != null) {
                companionDeviceManager3.disassociate(str);
            }
            if (Build.VERSION.SDK_INT >= 31 && (companionDeviceManager = this.manager) != null) {
                companionDeviceManager.stopObservingDevicePresence(str);
            }
        }
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.coroutineContext;
    }
}
