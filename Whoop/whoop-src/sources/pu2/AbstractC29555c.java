package pu2;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: pu2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroid/content/Context;", "", "deepLink", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/app/PendingIntent;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29555c {
    /* JADX INFO: renamed from: a */
    public static final PendingIntent m90538a(Context context, String deepLink) {
        AbstractC22676k.m65750j(context, "<this>");
        AbstractC22676k.m65750j(deepLink, "deepLink");
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        taskStackBuilderCreate.addNextIntentWithParentStack(new Intent("android.intent.action.VIEW", Uri.parse(deepLink)));
        PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(deepLink.hashCode(), 201326592);
        AbstractC22676k.m65749i(pendingIntent, "with(...)");
        return pendingIntent;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ PendingIntent m90539b(Context context, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "whoop://strength.builder";
        }
        return m90538a(context, str);
    }
}
