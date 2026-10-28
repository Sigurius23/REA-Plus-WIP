package androidx.core.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import p296l5.C23347k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m65681d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "l5/j", "l5/k", "core-remoteviews_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class RemoteViewsCompatService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("No app widget id was present in the intent");
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new C23347k(this, intExtra, intExtra2);
        }
        throw new IllegalStateException("No view id was present in the intent");
    }
}
