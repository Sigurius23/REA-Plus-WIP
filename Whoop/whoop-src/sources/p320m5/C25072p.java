package p320m5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import m83.C25235a0;

/* JADX INFO: renamed from: m5.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C25072p {

    /* JADX INFO: renamed from: a */
    public final Bundle f98204a;

    /* JADX INFO: renamed from: b */
    public final Bundle f98205b;

    /* JADX INFO: renamed from: c */
    public final Set f98206c;

    public C25072p() {
        Bundle bundle = new Bundle();
        C25235a0 c25235a0 = C25235a0.f99113w;
        bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(c25235a0));
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(c25235a0));
        this.f98204a = bundle;
        this.f98205b = bundle2;
        this.f98206c = c25235a0;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000);
    }
}
