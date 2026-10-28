package p320m5;

import android.os.Bundle;
import p087db.C11856j0;

/* JADX INFO: renamed from: m5.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25058b {

    /* JADX INFO: renamed from: a */
    public final Bundle f98190a;

    /* JADX INFO: renamed from: b */
    public final Bundle f98191b;

    /* JADX INFO: renamed from: c */
    public final C11856j0 f98192c;

    public AbstractC25058b(Bundle bundle, Bundle bundle2, C11856j0 c11856j0) {
        this.f98190a = bundle;
        this.f98191b = bundle2;
        this.f98192c = c11856j0;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
