package a13;

import android.app.Activity;
import android.widget.Toast;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.whoop.android.R;
import l83.C23470p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a13.b */
/* JADX INFO: loaded from: classes11.dex */
public final class C0144b extends AbstractC0143a implements InterfaceC0145c {

    /* JADX INFO: renamed from: w */
    public final C23470p f452w = AbstractC1772c1.m5382S(this, "Push:Default-NPH");

    /* JADX INFO: renamed from: x */
    public Activity f453x;

    @Override // a13.AbstractC0143a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        super.onActivityStarted(activity);
        this.f453x = activity;
    }

    @Override // a13.AbstractC0143a
    public final void onLastActivityStopped(Activity activity) {
        this.f453x = null;
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionDenied() {
        C2345k c2345k = (C2345k) this.f452w.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[onPermissionDenied] currentActivity: " + this.f453x, null);
        }
        Activity activity = this.f453x;
        if (activity != null) {
            Toast.makeText(activity, R.string.stream_push_permissions_notifications_message, 1).show();
        }
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionGranted() {
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRationale() {
    }

    @Override // a13.InterfaceC0145c
    public final void onPermissionRequested() {
    }
}
