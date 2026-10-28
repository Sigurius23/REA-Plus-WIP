package com.amplitude.android.engagement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import p197hj.C17338u;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/amplitude/android/engagement/AmplitudeEngagementInitializer;", "Lyb/b;", "Ll83/a0;", "<init>", "()V", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class AmplitudeEngagementInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public final Object create(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application == null) {
            Log.e("AmplitudeEngagement", "No application context available");
        } else {
            Context applicationContext2 = context.getApplicationContext();
            Application application2 = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
            if (application2 == null) {
                Log.e("AmplitudeEngagement", "No application context available");
            } else {
                application2.unregisterActivityLifecycleCallbacks(C17338u.f67142w);
                C17338u.f67143x = null;
            }
            C17338u c17338u = C17338u.f67142w;
            application.registerActivityLifecycleCallbacks(c17338u);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                c17338u.onActivityResumed(activity);
            }
        }
        return C23454a0.f92919a;
    }

    @Override // p644yb.InterfaceC39377b
    public final List dependencies() {
        return C25271y.f99162w;
    }
}
