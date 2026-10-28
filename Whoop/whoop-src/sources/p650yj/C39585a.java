package p650yj;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import fk.InterfaceC14544a;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import p120ek.C13270d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yj.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39585a extends FragmentManager$FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final C13270d f170324a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC14544a f170325b;

    public C39585a(C13270d c13270d, InterfaceC14544a logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.f170324a = c13270d;
        this.f170325b = logger;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: f */
    public final void mo4035f(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 f13) {
        Object objM107888l;
        Object objM107888l2;
        CharSequence charSequenceLoadLabel;
        AbstractC22676k.m65750j(f13, "f");
        String canonicalName = f13.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = f13.getClass().getSimpleName();
        }
        try {
            objM107888l = f13.getResources().getResourceEntryName(f13.getId());
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        InterfaceC14544a interfaceC14544a = this.f170325b;
        if (thM68037a != null) {
            interfaceC14544a.error("Failed to get resource entry name: " + thM68037a);
        }
        if (objM107888l instanceof C23467m) {
            objM107888l = null;
        }
        String str = (String) objM107888l;
        try {
            AbstractActivityC1340r0 activity = f13.getActivity();
            if (activity == null) {
                objM107888l2 = null;
            } else {
                PackageManager packageManager = activity.getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), 128) : null;
                if (activityInfo == null || (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) == null || (objM107888l2 = charSequenceLoadLabel.toString()) == null) {
                    if (activityInfo != null) {
                        objM107888l2 = activityInfo.name;
                    } else {
                        objM107888l2 = null;
                    }
                }
            }
        } catch (Throwable th4) {
            objM107888l2 = AbstractC34132o.m107888l(th4);
        }
        Throwable thM68037a2 = C23468n.m68037a(objM107888l2);
        if (thM68037a2 != null) {
            interfaceC14544a.error("Failed to get screen name: " + thM68037a2);
        }
        this.f170324a.invoke("[Amplitude] Fragment Viewed", AbstractC25247g0.m73990Y(new C23465k("[Amplitude] Fragment Class", canonicalName), new C23465k("[Amplitude] Fragment Identifier", str), new C23465k("[Amplitude] Screen Name", (String) (objM107888l2 instanceof C23467m ? null : objM107888l2)), new C23465k("[Amplitude] Fragment Tag", f13.getTag())));
    }
}
