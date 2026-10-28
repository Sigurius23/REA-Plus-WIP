package vm2;

import android.content.Intent;
import android.net.Uri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: vm2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lvm2/h;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lvm2/i;", "a", "(Landroid/content/Intent;)Lvm2/i;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36163h {

    /* JADX INFO: renamed from: a */
    public static final C36163h f154739a = new C36163h();

    private C36163h() {
    }

    /* JADX INFO: renamed from: a */
    public final EnumC36164i m115103a(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        if (intent.hasExtra("android-support-nav:controller:deepLinkIntent")) {
            return EnumC36164i.NAV_DEEPLINK;
        }
        if (intent.hasExtra("iterableNavType")) {
            return EnumC36164i.ITERABLE;
        }
        if (intent.hasExtra("pairing_completion_destination")) {
            return EnumC36164i.PAIRING;
        }
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        String scheme = data.getScheme();
        return (scheme == null || !AbstractC39421y.m125930O(scheme, "amp-", false)) ? EnumC36164i.URI_DEEPLINK : EnumC36164i.AMP_PREVIEW;
    }
}
