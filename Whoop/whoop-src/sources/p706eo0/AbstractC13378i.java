package p706eo0;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: eo0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroid/os/Bundle;", "Leo0/h;", "a", "(Landroid/os/Bundle;)Leo0/h;", "change-password_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13378i {
    /* JADX INFO: renamed from: a */
    public static final C13377h m37733a(Bundle bundle) {
        return bundle == null ? new C13377h(null, false, null, 7, null) : new C13377h(bundle.getString("resetToken"), bundle.getBoolean("isExpired", false), bundle.getString(NotificationCompat.CATEGORY_EMAIL));
    }
}
