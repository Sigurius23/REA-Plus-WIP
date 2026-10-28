package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import bc3.AbstractC3050q0;
import java.util.concurrent.CancellationException;
import no0.C26954j0;
import p33.C28820m;
import p358o6.C27598f;
import p395p6.C28864b;
import p415q6.AbstractC29995e;
import p558vp.AbstractC36259c;
import p715kotlin.Metadata;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "q6/e", "glance-appwidget"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5861a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context is null");
            }
            if (intent == null) {
                throw new IllegalArgumentException("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("The intent must have action parameters extras.");
            }
            C27598f c27598fM91724c = AbstractC29995e.m91724c(extras);
            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            C28864b c28864b = new C28864b(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (AbstractC37978j.m121631O(context, new C26954j0(string, c28864b, c27598fM91724c, 19))) {
                return;
            }
            AbstractC36259c.m115680a0(this, AbstractC3050q0.f12077a, new C28820m(context, string, c28864b, c27598fM91724c, null, 4));
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th3) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th3);
        }
    }
}
