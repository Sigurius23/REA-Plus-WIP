package or2;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.companion.AssociationRequest;
import android.companion.BluetoothDeviceFilter;
import android.companion.BluetoothLeDeviceFilter;
import android.companion.CompanionDeviceManager;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1613o1;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.domain.exception.CompanionDevicePairingException;
import hi0.AbstractC17312j;
import java.util.concurrent.CancellationException;
import kn2.C22605g;
import l83.C23454a0;
import p314m.AbstractActivityC24852m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lm/m;", "", "deviceAddress", "Landroid/companion/CompanionDeviceManager$Callback;", "managerCallback", "", "timeout", "Ll83/a0;", "a", "(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;J)V", "Landroid/content/Intent;", "Landroid/bluetooth/BluetoothDevice;", "c", "(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28189p {

    /* JADX INFO: renamed from: or2.p$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.CompanionDeviceInteractorKt$associateCompanionDevice$1", m100430f = "CompanionDeviceInteractor.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113910w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ long f113911x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC34116n f113912y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ CompanionDeviceManager.Callback f113913z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j7, InterfaceC34116n interfaceC34116n, CompanionDeviceManager.Callback callback, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f113911x = j7;
            this.f113912y = interfaceC34116n;
            this.f113913z = callback;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f113911x, this.f113912y, this.f113913z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113910w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = this.f113911x;
                this.f113910w = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f113912y.mo85226q("Companion Device Manager Timed Out", new AbstractC30556a.a[0]);
            this.f113913z.onFailure("Companion Device Manager Timed Out");
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: or2.p$b */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"or2/p$b", "Landroid/companion/CompanionDeviceManager$Callback;", "Landroid/content/IntentSender;", "chooserLauncher", "Ll83/a0;", "onDeviceFound", "(Landroid/content/IntentSender;)V", "", "error", "onFailure", "(Ljava/lang/CharSequence;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends CompanionDeviceManager.Callback {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C22669g0 f113914a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractActivityC24852m f113915b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ CompanionDeviceManager.Callback f113916c;

        /* JADX INFO: renamed from: or2.p$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.util.CompanionDeviceInteractorKt$associateCompanionDevice$internalCallback$1$onDeviceFound$1", m100430f = "CompanionDeviceInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f113917w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractActivityC24852m f113918x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ CompanionDeviceManager.Callback f113919y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ IntentSender f113920z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractActivityC24852m abstractActivityC24852m, CompanionDeviceManager.Callback callback, IntentSender intentSender, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f113918x = abstractActivityC24852m;
                this.f113919y = callback;
                this.f113920z = intentSender;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C23454a0 m85320h(CompanionDeviceManager.Callback callback, IntentSender intentSender, boolean z4) {
                callback.onDeviceFound(intentSender);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f113918x, this.f113919y, this.f113920z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f113917w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C22605g c22605g = new C22605g(this.f113918x, false, null, 6, null);
                String string = this.f113918x.getString(AbstractC17312j.f66934K);
                AbstractC22676k.m65749i(string, "getString(...)");
                String string2 = this.f113918x.getString(AbstractC17312j.f66932J);
                AbstractC22676k.m65749i(string2, "getString(...)");
                C22605g.m65540j(c22605g, string, string2, this.f113918x.getString(AbstractC17312j.f66914A), null, null, new C28192q(0, this.f113919y, this.f113920z), 24, null);
                return C23454a0.f92919a;
            }
        }

        public b(C22669g0 c22669g0, AbstractActivityC24852m abstractActivityC24852m, CompanionDeviceManager.Callback callback) {
            this.f113914a = c22669g0;
            this.f113915b = abstractActivityC24852m;
            this.f113916c = callback;
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onDeviceFound(IntentSender chooserLauncher) {
            AbstractC22676k.m65750j(chooserLauncher, "chooserLauncher");
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f113914a.f89336w;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            AbstractC1613o1.m5020j(this.f113915b).m4973b(new a(this.f113915b, this.f113916c, chooserLauncher, null));
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onFailure(CharSequence error) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m85316a(AbstractActivityC24852m abstractActivityC24852m, String deviceAddress, CompanionDeviceManager.Callback managerCallback, long j7) throws CompanionDevicePairingException {
        AbstractC22676k.m65750j(abstractActivityC24852m, "<this>");
        AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
        AbstractC22676k.m65750j(managerCallback, "managerCallback");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("Activity.associateCompanionDevice");
        C22669g0 c22669g0 = new C22669g0();
        b bVar = new b(c22669g0, abstractActivityC24852m, managerCallback);
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) abstractActivityC24852m.getSystemService(CompanionDeviceManager.class);
        BluetoothLeDeviceFilter bluetoothLeDeviceFilterBuild = new BluetoothLeDeviceFilter.Builder().setScanFilter(new ScanFilter.Builder().setDeviceAddress(deviceAddress).build()).build();
        AbstractC22676k.m65749i(bluetoothLeDeviceFilterBuild, "build(...)");
        BluetoothDeviceFilter bluetoothDeviceFilterBuild = new BluetoothDeviceFilter.Builder().setAddress(deviceAddress).build();
        AbstractC22676k.m65749i(bluetoothDeviceFilterBuild, "build(...)");
        AssociationRequest associationRequestBuild = new AssociationRequest.Builder().addDeviceFilter(bluetoothDeviceFilterBuild).addDeviceFilter(bluetoothLeDeviceFilterBuild).setSingleDevice(true).build();
        AbstractC22676k.m65749i(associationRequestBuild, "build(...)");
        interfaceC34116nM107848a.mo85228t("Starting association request", new AbstractC30556a.a[0]);
        if (companionDeviceManager == null) {
            interfaceC34116nM107848a.mo85226q("Companion Device Manager is null!", new AbstractC30556a.a[0]);
            throw new CompanionDevicePairingException("Companion Device Manager is null!");
        }
        c22669g0.f89336w = AbstractC1613o1.m5020j(abstractActivityC24852m).m4972a(new a(j7, interfaceC34116nM107848a, managerCallback, null));
        companionDeviceManager.associate(associationRequestBuild, bVar, C28183n.INSTANCE.m85302a());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m85317b(AbstractActivityC24852m abstractActivityC24852m, String str, CompanionDeviceManager.Callback callback, long j7, int i13, Object obj) throws CompanionDevicePairingException {
        if ((i13 & 4) != 0) {
            j7 = 5000;
        }
        m85316a(abstractActivityC24852m, str, callback, j7);
    }

    /* JADX INFO: renamed from: c */
    public static final BluetoothDevice m85318c(Intent intent) {
        AbstractC22676k.m65750j(intent, "<this>");
        Parcelable parcelableExtra = intent.getParcelableExtra("android.companion.extra.DEVICE");
        if (parcelableExtra instanceof ScanResult) {
            return ((ScanResult) parcelableExtra).getDevice();
        }
        if (parcelableExtra instanceof BluetoothDevice) {
            return (BluetoothDevice) parcelableExtra;
        }
        return null;
    }
}
