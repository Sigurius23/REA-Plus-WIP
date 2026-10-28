package io.getstream.android.push.permissions.snackbar;

import a13.AbstractC0143a;
import a13.InterfaceC0145c;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.room.AbstractC1772c1;
import b13.C2293b;
import b13.ViewOnClickListenerC2292a;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import l83.InterfaceC23462h;
import mr.C25908n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/android/push/permissions/snackbar/SnackbarNotificationPermissionHandler;", "La13/c;", "La13/a;", "<init>", "()V", "Landroid/app/Activity;", "Ll83/a0;", "showNotificationBlocked", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "openSystemSettings", "(Landroid/content/Context;)V", "activity", "onActivityStarted", "onLastActivityStopped", "onPermissionRequested", "onPermissionGranted", "onPermissionDenied", "onPermissionRationale", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "currentActivity", "Landroid/app/Activity;", "Companion", "b13/b", "stream-android-push-permissions-snackbar_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SnackbarNotificationPermissionHandler extends AbstractC0143a implements InterfaceC0145c {
    public static final C2293b Companion = new C2293b();
    private Activity currentActivity;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    public /* synthetic */ SnackbarNotificationPermissionHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openSystemSettings(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        Uri uriFromParts = Uri.fromParts("package", context.getPackageName(), null);
        AbstractC22676k.m65749i(uriFromParts, "fromParts(...)");
        intent.addFlags(268435456);
        intent.setData(uriFromParts);
        context.startActivity(intent);
    }

    private final void showNotificationBlocked(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        int[] iArr = C25908n.f102274F;
        C25908n c25908nM76617h = C25908n.m76617h(viewGroup, viewGroup.getResources().getText(com.whoop.android.R.string.stream_push_permissions_notifications_message), 0);
        c25908nM76617h.m76618i(com.whoop.android.R.string.stream_push_permissions_setting_button, new ViewOnClickListenerC2292a(0, this, activity));
        c25908nM76617h.m76619j();
    }

    @Override // a13.AbstractC0143a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        super.onActivityStarted(activity);
        this.currentActivity = activity;
    }

    @Override // a13.AbstractC0143a
    public void onLastActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        this.currentActivity = null;
    }

    @Override // a13.InterfaceC0145c
    public void onPermissionDenied() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onPermissionDenied] currentActivity: " + this.currentActivity, null);
        }
        Activity activity = this.currentActivity;
        if (activity != null) {
            showNotificationBlocked(activity);
        }
    }

    @Override // a13.InterfaceC0145c
    public void onPermissionGranted() {
    }

    @Override // a13.InterfaceC0145c
    public void onPermissionRationale() {
    }

    @Override // a13.InterfaceC0145c
    public void onPermissionRequested() {
    }

    private SnackbarNotificationPermissionHandler() {
        this.logger = AbstractC1772c1.m5382S(this, "Push:Snackbar-NPH");
    }
}
