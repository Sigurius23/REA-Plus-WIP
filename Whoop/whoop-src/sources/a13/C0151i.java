package a13;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import io.sentry.hints.C20363j;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23470p;
import p161g.AbstractActivityC14909l;
import p236j.AbstractC21065d;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: a13.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C0151i extends AbstractC0143a {

    /* JADX INFO: renamed from: E */
    public static final C20363j f468E = new C20363j(1);

    /* JADX INFO: renamed from: F */
    public static volatile C0151i f469F;

    /* JADX INFO: renamed from: x */
    public Activity f471x;

    /* JADX INFO: renamed from: w */
    public final ArrayList f470w = new ArrayList();

    /* JADX INFO: renamed from: y */
    public final ActivityResultContracts$RequestPermission f472y = new ActivityResultContracts$RequestPermission();

    /* JADX INFO: renamed from: z */
    public final C23470p f473z = AbstractC30060g.m92088H(new C0148f(0));

    /* JADX INFO: renamed from: a */
    public final void m365a(EnumC0147e enumC0147e) {
        Log.v("PnPermissionRequester", "[onPermissionStatus] permissionStatus: " + enumC0147e);
        Iterator it = this.f470w.iterator();
        while (it.hasNext()) {
            ((C0146d) it.next()).m362b(enumC0147e);
        }
    }

    @Override // a13.AbstractC0143a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
        Log.v("PnPermissionRequester", "[onActivityCreated] activity: " + activity);
        super.onActivityCreated(activity, bundle);
        this.f471x = activity;
    }

    @Override // a13.AbstractC0143a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Log.v("PnPermissionRequester", "[onActivityResumed] activity: " + activity);
        this.f471x = activity;
        super.onActivityResumed(activity);
    }

    @Override // a13.AbstractC0143a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Log.v("PnPermissionRequester", "[onActivityStarted] activity: " + activity);
        this.f471x = activity;
        if ((activity instanceof AbstractActivityC14909l) && Build.VERSION.SDK_INT >= 33) {
            Log.i("PnPermissionRequester", "[registerPermissionCallback] activity: " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(activity.getClass()).getSimpleName());
            AbstractActivityC14909l abstractActivityC14909l = (AbstractActivityC14909l) activity;
            AbstractC21065d abstractC21065dRegisterForActivityResult = abstractActivityC14909l.registerForActivityResult(this.f472y, new C0149g(this, 0));
            AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
            Log.v("PnPermissionRequester", "[registerPermissionCallback] launcher: " + abstractC21065dRegisterForActivityResult);
            View viewFindViewById = abstractActivityC14909l.findViewById(R.id.content);
            AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
            viewFindViewById.setTag(com.whoop.android.R.id.stream_post_notifications_permission, abstractC21065dRegisterForActivityResult);
        }
        super.onActivityStarted(activity);
    }

    @Override // a13.AbstractC0143a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Log.v("PnPermissionRequester", "[onActivityStopped] activity: " + activity);
        if (activity instanceof AbstractActivityC14909l) {
            Log.i("PnPermissionRequester", "[unregisterPermissionCallback] activity: " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(activity.getClass()).getSimpleName());
            View viewFindViewById = ((AbstractActivityC14909l) activity).findViewById(R.id.content);
            AbstractC22676k.m65749i(viewFindViewById, "findViewById(...)");
            Object tag = viewFindViewById.getTag(com.whoop.android.R.id.stream_post_notifications_permission);
            AbstractC21065d abstractC21065d = tag instanceof AbstractC21065d ? (AbstractC21065d) tag : null;
            Log.d("PnPermissionRequester", "[unregisterPermissionCallback] found launcher: " + abstractC21065d);
            if (abstractC21065d != null) {
                abstractC21065d.mo4053b();
            }
        }
        super.onActivityStopped(activity);
    }

    @Override // a13.AbstractC0143a
    public final void onFirstActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Log.i("PnPermissionRequester", "[onFirstActivityStarted] activity: " + activity);
        super.onFirstActivityStarted(activity);
        Iterator it = this.f470w.iterator();
        while (it.hasNext()) {
            ((C0146d) it.next()).m361a();
        }
    }

    @Override // a13.AbstractC0143a
    public final void onLastActivityStopped(Activity activity) {
        Log.i("PnPermissionRequester", "[onLastActivityStopped] activity: " + activity);
        this.f471x = null;
    }
}
