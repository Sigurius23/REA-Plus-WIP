package p688zp;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.C4974e;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.common.api.Scope;
import p096dq.C12281y;

/* JADX INFO: renamed from: zp.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC40938b {

    /* JADX INFO: renamed from: a */
    public static final C12281y f176617a;

    /* JADX INFO: renamed from: b */
    public static final C4975f f176618b;

    static {
        C4974e c4974e = new C4974e();
        C12281y c12281y = new C12281y(9);
        f176617a = c12281y;
        new Scope(1, "profile");
        new Scope(1, NotificationCompat.CATEGORY_EMAIL);
        f176618b = new C4975f("SignIn.API", c12281y, c4974e);
    }
}
