package r92;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import c92.C4329a;
import com.whoop.data.repositories.FeatureFlagChecker;
import java.util.List;
import m32.InterfaceC25005a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import rr2.InterfaceC31766c;
import s92.C32293a;
import s92.C32297e;
import ys0.InterfaceC39750a;

/* JADX INFO: renamed from: r92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m65681d2 = {"Lr92/a;", "", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31104a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: r92.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lr92/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "Lys0/a;", "implClass", "Lys0/a$a;", "bleHandlerCallback", "", "testFlag", "Lc92/a;", "bluetoothHelper", "Lrr2/c;", "crashReporter", "Lm32/a;", "permissionChecker", "", "", "requiredPermissions", "", "sdkVersion", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "a", "(Landroid/content/Context;Ljava/lang/Class;Lys0/a$a;ZLc92/a;Lrr2/c;Lm32/a;Ljava/util/List;ILcom/whoop/data/repositories/FeatureFlagChecker;)Lys0/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC39750a m95858a(Context context, Class<? extends InterfaceC39750a> implClass, InterfaceC39750a.a bleHandlerCallback, boolean testFlag, C4329a bluetoothHelper, InterfaceC31766c crashReporter, InterfaceC25005a permissionChecker, List<String> requiredPermissions, int sdkVersion, FeatureFlagChecker featureFlagChecker) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(implClass, "implClass");
            AbstractC22676k.m65750j(bleHandlerCallback, "bleHandlerCallback");
            AbstractC22676k.m65750j(bluetoothHelper, "bluetoothHelper");
            AbstractC22676k.m65750j(crashReporter, "crashReporter");
            AbstractC22676k.m65750j(permissionChecker, "permissionChecker");
            AbstractC22676k.m65750j(requiredPermissions, "requiredPermissions");
            AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
            if (testFlag) {
                return new C32293a();
            }
            HandlerThread handlerThread = new HandlerThread("WhoopBleCallback");
            handlerThread.start();
            return new C32297e(context, featureFlagChecker, bleHandlerCallback, bluetoothHelper, crashReporter, permissionChecker, requiredPermissions, sdkVersion, new Handler(handlerThread.getLooper()), handlerThread);
        }

        private Companion() {
        }
    }
}
