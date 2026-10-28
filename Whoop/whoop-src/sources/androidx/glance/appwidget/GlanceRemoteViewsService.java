package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import bi.C3278p;
import p395p6.C28925v0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Landroidx/glance/appwidget/GlanceRemoteViewsService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "p6/v0", "glance-appwidget"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class GlanceRemoteViewsService extends RemoteViewsService {

    /* JADX INFO: renamed from: w */
    public static final C3278p f5857w = new C3278p(5);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("Intent is null");
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            throw new IllegalStateException("No view id was present in the intent");
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra == null || stringExtra.length() == 0) {
            throw new IllegalStateException("No size info was present in the intent");
        }
        return new C28925v0(this, intExtra, intExtra2, stringExtra);
    }
}
