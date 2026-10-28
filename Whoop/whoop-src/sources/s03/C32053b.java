package s03;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s03.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ls03/b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32053b {
    /* JADX INFO: renamed from: a */
    public final boolean m99629a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }
}
