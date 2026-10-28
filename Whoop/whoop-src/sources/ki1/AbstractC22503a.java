package ki1;

import android.content.Context;
import android.os.Build;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ki1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Landroid/content/Context;", "a", "(Landroid/content/Context;)Landroid/content/Context;", "gps-tracking_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22503a {
    /* JADX INFO: renamed from: a */
    public static final Context m65006a(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return context;
        }
        Context contextCreateAttributionContext = context.createAttributionContext("gpsTracking");
        AbstractC22676k.m65747g(contextCreateAttributionContext);
        return contextCreateAttributionContext;
    }
}
