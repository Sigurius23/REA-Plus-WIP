package m32;

import a13.C0149g;
import androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.PushNotificationFeatureFlagsKt;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l83.C23454a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: m32.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0+0*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010)¨\u00068"}, m65681d2 = {"Lm32/d;", "Lm32/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ltr2/n;", "logger", "Lj/j;", "registry", "Lm32/a;", "permissionChecker", "", "", "requiredPermissions", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "name", "<init>", "(Ltr2/n;Lj/j;Lm32/a;Ljava/util/List;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V", "", "", "permissionsResultMap", "Ll83/a0;", "o", "(Ljava/util/Map;)V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "shouldResetResumed", "Lm32/e;", "x", "(ZLq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "Lj/j;", "y", "Lm32/a;", "z", "Ljava/util/List;", "E", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "Ljava/lang/String;", "Lj/d;", "", "G", "Lj/d;", "getPermissions", "Lbc3/k;", "H", "Lbc3/k;", "permissionsContinuation", "I", "Z", "resumed", "J", "registrationKey", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25008d implements InterfaceC25007c, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private AbstractC21065d getPermissions;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private InterfaceC3025k permissionsContinuation;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean resumed;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String registrationKey;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final AbstractC21071j registry;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC25005a permissionChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final List<String> requiredPermissions;

    /* JADX INFO: renamed from: m32.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m73361a(Throwable th3) {
            C25008d.this.logger.mo85228t("Unregistering ble permission helper", new AbstractC30556a.a[0]);
            AbstractC21065d abstractC21065d = C25008d.this.getPermissions;
            if (abstractC21065d != null) {
                abstractC21065d.mo4053b();
            } else {
                AbstractC22676k.m65757q("getPermissions");
                throw null;
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m73361a((Throwable) obj);
            return C23454a0.f92919a;
        }
    }

    public C25008d(InterfaceC34116n logger, AbstractC21071j registry, InterfaceC25005a permissionChecker, List<String> requiredPermissions, FeatureFlagChecker featureFlagChecker, String name) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(registry, "registry");
        AbstractC22676k.m65750j(permissionChecker, "permissionChecker");
        AbstractC22676k.m65750j(requiredPermissions, "requiredPermissions");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(name, "name");
        this.logger = logger;
        this.registry = registry;
        this.permissionChecker = permissionChecker;
        this.requiredPermissions = requiredPermissions;
        this.featureFlagChecker = featureFlagChecker;
        this.name = name;
        if (featureFlagChecker.isFeatureEnabled(PushNotificationFeatureFlagsKt.PUSH_NOTIFICATIONS_PERMISSION_REQUEST_FIX)) {
            name = name + "#" + UUID.randomUUID();
        }
        this.registrationKey = name;
    }

    /* JADX INFO: renamed from: o */
    private final void m73359o(Map<String, Boolean> permissionsResultMap) {
        EnumC25009e enumC25009e;
        InterfaceC3025k interfaceC3025k;
        if (!permissionsResultMap.isEmpty()) {
            Iterator<Map.Entry<String, Boolean>> it = permissionsResultMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    enumC25009e = EnumC25009e.GRANTED;
                    break;
                } else if (!it.next().getValue().booleanValue()) {
                    enumC25009e = EnumC25009e.DENIED;
                    break;
                }
            }
        } else {
            enumC25009e = EnumC25009e.GRANTED;
            break;
        }
        if (this.resumed || (interfaceC3025k = this.permissionsContinuation) == null) {
            return;
        }
        if (interfaceC3025k == null) {
            AbstractC22676k.m65757q("permissionsContinuation");
            throw null;
        }
        interfaceC3025k.resumeWith(enumC25009e);
        this.resumed = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m73360p(C25008d c25008d, Map permissionsResultMap) {
        AbstractC22676k.m65750j(permissionsResultMap, "permissionsResultMap");
        c25008d.m73359o(permissionsResultMap);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.logger.mo85228t(AbstractC11266d.m30461o("registering permission helper for: ", this.registrationKey), new AbstractC30556a.a[0]);
        this.getPermissions = this.registry.m58913c(this.registrationKey, owner, new ActivityResultContracts$RequestMultiplePermissions(), new C0149g(this, 2));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069 A[Catch: IllegalStateException -> 0x0081, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x0081, blocks: (B:20:0x0062, B:22:0x0069, B:28:0x0083, B:29:0x0088), top: B:33:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[Catch: IllegalStateException -> 0x0081, TRY_ENTER, TryCatch #0 {IllegalStateException -> 0x0081, blocks: (B:20:0x0062, B:22:0x0069, B:28:0x0083, B:29:0x0088), top: B:33:0x0062 }] */
    @Override // m32.InterfaceC25007c
    /* JADX INFO: renamed from: x */
    public Object mo73348x(boolean z4, InterfaceC30057d<? super EnumC25009e> interfaceC30057d) {
        String[] strArr;
        AbstractC21065d abstractC21065d;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        if (z4) {
            this.resumed = false;
        }
        List list = this.requiredPermissions;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!this.permissionChecker.mo73346a((String) it.next())) {
                    }
                } else if (this.resumed) {
                    c3033m.resumeWith(EnumC25009e.GRANTED);
                    this.resumed = true;
                }
                this.permissionsContinuation = c3033m;
                strArr = (String[]) this.requiredPermissions.toArray(new String[0]);
                try {
                    abstractC21065d = this.getPermissions;
                    if (abstractC21065d != null) {
                        AbstractC22676k.m65757q("getPermissions");
                        throw null;
                    }
                    abstractC21065d.mo4052a(strArr, null);
                    if (!this.featureFlagChecker.isFeatureEnabled(PushNotificationFeatureFlagsKt.PUSH_NOTIFICATIONS_PERMISSION_REQUEST_FIX)) {
                        c3033m.m8776u(new a());
                    }
                } catch (IllegalStateException e5) {
                    this.logger.mo85230v(AbstractC11895b.m31996o("Permission launcher unavailable for ", this.registrationKey, "; the user was not prompted"), e5, new AbstractC30556a.a[0]);
                    this.resumed = true;
                    c3033m.resumeWith(EnumC25009e.DENIED);
                }
            }
        } else if (this.resumed) {
            this.permissionsContinuation = c3033m;
            strArr = (String[]) this.requiredPermissions.toArray(new String[0]);
            abstractC21065d = this.getPermissions;
            if (abstractC21065d != null) {
                AbstractC22676k.m65757q("getPermissions");
                throw null;
            }
            abstractC21065d.mo4052a(strArr, null);
            if (!this.featureFlagChecker.isFeatureEnabled(PushNotificationFeatureFlagsKt.PUSH_NOTIFICATIONS_PERMISSION_REQUEST_FIX)) {
                c3033m.m8776u(new a());
            }
        } else {
            c3033m.resumeWith(EnumC25009e.GRANTED);
            this.resumed = true;
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    public /* synthetic */ C25008d(InterfaceC34116n interfaceC34116n, AbstractC21071j abstractC21071j, InterfaceC25005a interfaceC25005a, List list, FeatureFlagChecker featureFlagChecker, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34116n, abstractC21071j, interfaceC25005a, list, featureFlagChecker, (i13 & 32) != 0 ? "key" : str);
    }
}
