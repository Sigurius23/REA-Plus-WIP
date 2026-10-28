package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.LinkedHashMap;
import p395p6.C28918t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "p6/t", "glance-appwidget"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class UnmanagedSessionReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final C28918t f5859a = new C28918t();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f5860b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !AbstractC22676k.m65745e(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            throw new IllegalStateException("Intent is missing ActionKey extra");
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("Intent is missing AppWidgetId extra");
        }
        C28918t.m87834c(intExtra);
        Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
    }
}
