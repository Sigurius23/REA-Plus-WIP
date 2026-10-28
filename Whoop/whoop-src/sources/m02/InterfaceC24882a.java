package m02;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: m02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lm02/a;", "", "Landroid/content/Context;", "context", "Ll83/a0;", "b", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "deepLinkUri", "a", "(Landroid/content/Context;Landroid/net/Uri;)V", "Landroid/os/Bundle;", "arguments", "Landroid/app/PendingIntent;", "c", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC24882a {
    /* JADX INFO: renamed from: a */
    void mo58971a(Context context, Uri deepLinkUri);

    /* JADX INFO: renamed from: b */
    void mo58972b(Context context);

    /* JADX INFO: renamed from: c */
    PendingIntent mo58973c(Context context, Bundle arguments);
}
