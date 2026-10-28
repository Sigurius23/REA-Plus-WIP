package p529uo;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import to.InterfaceC33977i;

/* JADX INFO: renamed from: uo.r */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC35130r implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: b */
    public static C35128p m111085b(Activity activity, Intent intent, int i13) {
        return new C35128p(intent, activity, i13, 0);
    }

    /* JADX INFO: renamed from: c */
    public static C35128p m111086c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, Intent intent, int i13) {
        return new C35128p(intent, abstractComponentCallbacksC1320m0, i13, 1);
    }

    /* JADX INFO: renamed from: d */
    public static C35129q m111087d(Intent intent, InterfaceC33977i interfaceC33977i) {
        return new C35129q(intent, interfaceC33977i);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo111084a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        try {
            try {
                mo111084a();
            } catch (ActivityNotFoundException e5) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e5);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
