package or2;

import android.companion.CompanionDeviceManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m65681d2 = {"Lor2/n;", "Lor2/o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "deviceAddress", "", "a", "(Ljava/lang/String;)Z", "Ltr2/n;", "Ltr2/n;", "logger", "Landroid/companion/CompanionDeviceManager;", "b", "Landroid/companion/CompanionDeviceManager;", "manager", "c", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28183n implements InterfaceC28186o {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f113901d = 8;

    /* JADX INFO: renamed from: e */
    private static final Handler f113902e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CompanionDeviceManager manager;

    /* JADX INFO: renamed from: or2.n$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lor2/n$a;", "", "<init>", "()V", "Landroid/os/Handler;", "companionHandler", "Landroid/os/Handler;", "a", "()Landroid/os/Handler;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Handler m85302a() {
            return C28183n.f113902e;
        }

        private Companion() {
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("companion-device-handler");
        handlerThread.start();
        f113902e = new Handler(handlerThread.getLooper());
    }

    public C28183n(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.logger = InterfaceC34116n.INSTANCE.m107848a("CompanionDeviceHelper");
        this.manager = (CompanionDeviceManager) context.getSystemService(CompanionDeviceManager.class);
    }

    @Override // or2.InterfaceC28186o
    /* JADX INFO: renamed from: a */
    public boolean mo85301a(String deviceAddress) {
        List<String> associations;
        AbstractC22676k.m65750j(deviceAddress, "deviceAddress");
        CompanionDeviceManager companionDeviceManager = this.manager;
        if (companionDeviceManager == null || (associations = companionDeviceManager.getAssociations()) == null) {
            return false;
        }
        return associations.contains(deviceAddress);
    }
}
