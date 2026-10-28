package ml1;

import android.bluetooth.BluetoothDevice;
import android.companion.CompanionDeviceManager;
import c93.InterfaceC4339a;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import hj0.C17345d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Hours;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import zr2.InterfaceC41070a;
import zs0.InterfaceC41076a;

/* JADX INFO: renamed from: ml1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*R\u0014\u0010,\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0012¨\u0006-"}, m65681d2 = {"Lml1/b;", "", "Ltd1/b;", "whoopStrapProxy", "Lhj0/d;", "applicationLifecycle", "Lzs0/a;", "interactor", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lzr2/a;", "dateAndTimeProvider", "", "sdkVersion", "<init>", "(Ltd1/b;Lhj0/d;Lzs0/a;Lcom/whoop/data/local/prefs/PreferenceHelper;Lzr2/a;I)V", "", "i", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Landroid/companion/CompanionDeviceManager$Callback;", "callback", "Ll83/a0;", "e", "(Landroid/companion/CompanionDeviceManager$Callback;)V", "a", "Ltd1/b;", "b", "Lzs0/a;", "c", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "d", "Lzr2/a;", "I", "Ltr2/n;", "f", "Ltr2/n;", "logger", "Lec3/l;", "Lml1/d;", "g", "Lec3/l;", "()Lec3/l;", "cdmDialogFlow", "isCompanionDevicePairingEligible", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25673b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41076a interactor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int sdkVersion;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13058l cdmDialogFlow;

    /* JADX INFO: renamed from: ml1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.cdm.CompanionDeviceHandler$cdmDialogFlow$1", m100430f = "CompanionDeviceHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "appForegroundState", "Ltd1/e;", "strapStatus", "", "<anonymous>", "(ZLtd1/e;)Ljava/lang/Object;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100969w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f100970x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100971y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final AbstractC25674c.b m75599i(C25673b c25673b) {
            c25673b.logger.mo85228t("CDM: Sending DoNothing Action", new AbstractC30556a.a[0]);
            return AbstractC25674c.b.f100978a;
        }

        /* JADX INFO: renamed from: h */
        public final Object m75600h(boolean z4, EnumC33707e enumC33707e, InterfaceC30057d<Object> interfaceC30057d) {
            a aVar = C25673b.this.new a(interfaceC30057d);
            aVar.f100970x = z4;
            aVar.f100971y = enumC33707e;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m75600h(((Boolean) obj).booleanValue(), (EnumC33707e) obj2, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object aVar;
            boolean z4 = this.f100970x;
            EnumC33707e enumC33707e = (EnumC33707e) this.f100971y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f100969w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            BluetoothDevice bluetoothDeviceMo106500m = C25673b.this.whoopStrapProxy.mo106500m();
            if (bluetoothDeviceMo106500m != null) {
                C25673b c25673b = C25673b.this;
                if (z4 && enumC33707e.isReady()) {
                    c25673b.logger.mo85228t("CDM: Sending CheckCompanionDevice Action", new AbstractC30556a.a[0]);
                    String address = bluetoothDeviceMo106500m.getAddress();
                    AbstractC22676k.m65749i(address, "getAddress(...)");
                    aVar = new AbstractC25674c.a(address);
                } else {
                    aVar = AbstractC25674c.b.f100978a;
                }
                if (aVar != null) {
                    return aVar;
                }
            }
            final C25673b c25673b2 = C25673b.this;
            return new InterfaceC4339a() { // from class: ml1.a
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return C25673b.a.m75599i(c25673b2);
                }
            };
        }
    }

    /* JADX INFO: renamed from: ml1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.cdm.CompanionDeviceHandler$cdmDialogFlow$2", m100430f = "CompanionDeviceHandler.kt", m100431l = {67, 70, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lml1/d;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Object;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f100973w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f100974x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f100975y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Object obj, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = C25673b.this.new b(interfaceC30057d);
            bVar.f100974x = interfaceC13062m;
            bVar.f100975y = obj;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (r0.emit(r9, r8) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        
            if (r0.emit(r9, r8) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
        
            if (r0.emit(r9, r8) == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
        
            return r2;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f100974x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                java.lang.Object r1 = r8.f100975y
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r8.f100973w
                r4 = 3
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L23
                if (r3 == r6) goto L1e
                if (r3 == r5) goto L1e
                if (r3 != r4) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L9c
            L23:
                p505ts.AbstractC34132o.m107864I(r9)
                boolean r9 = r1 instanceof ml1.AbstractC25674c.a
                r3 = 0
                r7 = 0
                if (r9 == 0) goto L7b
                ml1.b r9 = ml1.C25673b.this
                zs0.a r9 = ml1.C25673b.m75589a(r9)
                ml1.c$a r1 = (ml1.AbstractC25674c.a) r1
                java.lang.String r1 = r1.getDeviceMacAddress()
                boolean r9 = r9.mo41834a(r1)
                if (r9 != 0) goto L5a
                ml1.b r9 = ml1.C25673b.this
                boolean r9 = ml1.C25673b.m75592d(r9)
                if (r9 == 0) goto L5a
                ml1.d r9 = new ml1.d
                fn0.b r1 = fn0.EnumC14640b.SHOW_CDM_DIALOG
                r9.<init>(r1)
                r8.f100974x = r7
                r8.f100975y = r7
                r8.f100973w = r6
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r2) goto L9c
                goto L9b
            L5a:
                ml1.b r9 = ml1.C25673b.this
                tr2.n r9 = ml1.C25673b.m75590b(r9)
                java.lang.String r1 = "CDM: Device is associated"
                qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
                r9.mo85228t(r1, r3)
                ml1.d r9 = new ml1.d
                fn0.b r1 = fn0.EnumC14640b.NO_CDM_DIALOG
                r9.<init>(r1)
                r8.f100974x = r7
                r8.f100975y = r7
                r8.f100973w = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r2) goto L9c
                goto L9b
            L7b:
                ml1.b r9 = ml1.C25673b.this
                tr2.n r9 = ml1.C25673b.m75590b(r9)
                java.lang.String r1 = "CDM: Action is DoNothing"
                qr2.a$a[] r3 = new qr2.AbstractC30556a.a[r3]
                r9.mo85228t(r1, r3)
                ml1.d r9 = new ml1.d
                fn0.b r1 = fn0.EnumC14640b.NO_CDM_DIALOG
                r9.<init>(r1)
                r8.f100974x = r7
                r8.f100975y = r7
                r8.f100973w = r4
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r2) goto L9c
            L9b:
                return r2
            L9c:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ml1.C25673b.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C25673b(InterfaceC33704b whoopStrapProxy, C17345d applicationLifecycle, InterfaceC41076a interactor, PreferenceHelper preferenceHelper, InterfaceC41070a dateAndTimeProvider, int i13) {
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(applicationLifecycle, "applicationLifecycle");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.whoopStrapProxy = whoopStrapProxy;
        this.interactor = interactor;
        this.preferenceHelper = preferenceHelper;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.sdkVersion = i13;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("CompanionDeviceHandler");
        this.cdmDialogFlow = AbstractC13091v.m36590P(new C13060l1(applicationLifecycle.getAppForegroundFlow(), whoopStrapProxy.mo106503r(), new a(null), 1), new b(null));
    }

    /* JADX INFO: renamed from: g */
    private final boolean m75593g() {
        return this.sdkVersion >= 26;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m75594h() {
        return Hours.hoursBetween(new DateTime(this.preferenceHelper.getLongValueFromMainPrefs(SharedPreferenceConstants.KEY_LAST_PROMPTED_COMPANION_DEVICE_MODAL, 0L), DateTimeZone.UTC), this.dateAndTimeProvider.mo133364c()).isGreaterThan(Hours.hours(24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final boolean m75595i() {
        return m75593g() && m75594h();
    }

    /* JADX INFO: renamed from: e */
    public final void m75596e(CompanionDeviceManager.Callback callback) {
        AbstractC22676k.m65750j(callback, "callback");
        BluetoothDevice bluetoothDeviceMo106500m = this.whoopStrapProxy.mo106500m();
        if (bluetoothDeviceMo106500m != null) {
            InterfaceC41076a interfaceC41076a = this.interactor;
            String address = bluetoothDeviceMo106500m.getAddress();
            AbstractC22676k.m65749i(address, "getAddress(...)");
            interfaceC41076a.mo41835b(address, callback);
        }
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC13058l getCdmDialogFlow() {
        return this.cdmDialogFlow;
    }
}
