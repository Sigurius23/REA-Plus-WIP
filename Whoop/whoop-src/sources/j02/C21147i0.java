package j02;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.whoop.profile.domain.ProfileApiKt;
import p114eb.C12966j0;
import p114eb.C12969k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.i0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJW\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lj02/i0;", "", "<init>", "()V", "", "uriString", "Leb/k0;", "a", "(Ljava/lang/String;)Leb/k0;", "Landroid/content/Context;", "context", "", "navGraph", "deeplinkDestination", ProfileApiKt.TARGET_USER_ID_PARAM, "", "showDialogView", "fromButton", "achievementId", "navigateToMemberLevels", "fromCommunity", "Landroid/app/PendingIntent;", "b", "(Landroid/content/Context;IIIZZLjava/lang/String;ZZ)Landroid/app/PendingIntent;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21147i0 {

    /* JADX INFO: renamed from: a */
    public static final int f80230a = 0;

    /* JADX INFO: renamed from: a */
    public final C12969k0 m58994a(String uriString) {
        AbstractC22676k.m65750j(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        AbstractC22676k.m65750j(uri, "uri");
        return new C12969k0(uri, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final PendingIntent m58995b(Context context, int navGraph, int deeplinkDestination, int targetUserId, boolean showDialogView, boolean fromButton, String achievementId, boolean navigateToMemberLevels, boolean fromCommunity) {
        AbstractC22676k.m65750j(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt(ProfileApiKt.TARGET_USER_ID_PARAM, targetUserId);
        bundle.putBoolean("showDialogView", showDialogView);
        bundle.putBoolean("fromButton", fromButton);
        bundle.putString("achievementId", achievementId);
        bundle.putBoolean("navigateToMemberLevels", navigateToMemberLevels);
        bundle.putBoolean("fromCommunity", fromCommunity);
        C12966j0 c12966j0 = new C12966j0(context);
        c12966j0.m36448g(navGraph);
        C12966j0.m36442f(c12966j0, deeplinkDestination);
        c12966j0.m36447e(bundle);
        return c12966j0.m36444b();
    }
}
