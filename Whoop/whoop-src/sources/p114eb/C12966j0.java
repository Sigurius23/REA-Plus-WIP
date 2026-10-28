package p114eb;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.TaskStackBuilder;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import m83.AbstractC25265s;
import m83.C25258m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;

/* JADX INFO: renamed from: eb.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12966j0 {

    /* JADX INFO: renamed from: a */
    public final Context f44782a;

    /* JADX INFO: renamed from: b */
    public final Intent f44783b;

    /* JADX INFO: renamed from: c */
    public C12985r0 f44784c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f44785d;

    /* JADX INFO: renamed from: e */
    public Bundle f44786e;

    public C12966j0(Context context) {
        Intent launchIntentForPackage;
        AbstractC22676k.m65750j(context, "context");
        this.f44782a = context;
        Activity activity = (Activity) AbstractC38176k.m122283s(AbstractC38176k.m122273B(AbstractC38176k.m122288x(context, C12944c.f44718z), C12944c.f44712E));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f44783b = launchIntentForPackage;
        this.f44785d = new ArrayList();
    }

    /* JADX INFO: renamed from: f */
    public static void m36442f(C12966j0 c12966j0, int i13) {
        ArrayList arrayList = c12966j0.f44785d;
        arrayList.clear();
        arrayList.add(new C12957g0(i13, null));
        if (c12966j0.f44784c != null) {
            c12966j0.m36449h();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m36443a(int i13, Bundle bundle) {
        this.f44785d.add(new C12957g0(i13, bundle));
        if (this.f44784c != null) {
            m36449h();
        }
    }

    /* JADX INFO: renamed from: b */
    public final PendingIntent m36444b() {
        int iHashCode;
        Bundle bundle = this.f44786e;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            iHashCode = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        } else {
            iHashCode = 0;
        }
        for (C12957g0 c12957g0 : this.f44785d) {
            iHashCode = (iHashCode * 31) + c12957g0.f44755a;
            Bundle bundle2 = c12957g0.f44756b;
            if (bundle2 != null) {
                Iterator<String> it3 = bundle2.keySet().iterator();
                while (it3.hasNext()) {
                    Object obj2 = bundle2.get(it3.next());
                    iHashCode = (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
        }
        PendingIntent pendingIntent = m36445c().getPendingIntent(iHashCode, 201326592);
        AbstractC22676k.m65747g(pendingIntent);
        return pendingIntent;
    }

    /* JADX INFO: renamed from: c */
    public final TaskStackBuilder m36445c() {
        if (this.f44784c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = this.f44785d;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        C12977n0 c12977n0 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = this.f44782a;
            int i13 = 0;
            if (!zHasNext) {
                int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList2);
                Intent intent = this.f44783b;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrM74091C1);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(context).addNextIntentWithParentStack(new Intent(intent));
                AbstractC22676k.m65749i(taskStackBuilderAddNextIntentWithParentStack, "create(context).addNextI…rentStack(Intent(intent))");
                int intentCount = taskStackBuilderAddNextIntentWithParentStack.getIntentCount();
                while (i13 < intentCount) {
                    Intent intentEditIntentAt = taskStackBuilderAddNextIntentWithParentStack.editIntentAt(i13);
                    if (intentEditIntentAt != null) {
                        intentEditIntentAt.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i13++;
                }
                return taskStackBuilderAddNextIntentWithParentStack;
            }
            C12957g0 c12957g0 = (C12957g0) it.next();
            int i14 = c12957g0.f44755a;
            Bundle bundle = c12957g0.f44756b;
            C12977n0 c12977n0M36446d = m36446d(i14);
            if (c12977n0M36446d == null) {
                int i15 = C12977n0.f44815K;
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Navigation destination ", AbstractC34132o.m107895x(context, i14), " cannot be found in the navigation graph ");
                sbM53375p.append(this.f44784c);
                throw new IllegalArgumentException(sbM53375p.toString());
            }
            int[] iArrM36465d = c12977n0M36446d.m36465d(c12977n0);
            int length = iArrM36465d.length;
            while (i13 < length) {
                arrayList2.add(Integer.valueOf(iArrM36465d[i13]));
                arrayList3.add(bundle);
                i13++;
            }
            c12977n0 = c12977n0M36446d;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C12977n0 m36446d(int i13) {
        C25258m c25258m = new C25258m();
        C12985r0 c12985r0 = this.f44784c;
        AbstractC22676k.m65747g(c12985r0);
        c25258m.addLast(c12985r0);
        while (!c25258m.isEmpty()) {
            C12977n0 c12977n0 = (C12977n0) c25258m.removeFirst();
            if (c12977n0.f44819H == i13) {
                return c12977n0;
            }
            if (c12977n0 instanceof C12985r0) {
                C12983q0 c12983q0 = new C12983q0((C12985r0) c12977n0);
                while (c12983q0.hasNext()) {
                    c25258m.addLast((C12977n0) c12983q0.next());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m36447e(Bundle bundle) {
        this.f44786e = bundle;
        this.f44783b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
    }

    /* JADX INFO: renamed from: g */
    public final void m36448g(int i13) {
        this.f44784c = new C12993v0(this.f44782a, new C12963i0()).m36506b(i13);
        m36449h();
    }

    /* JADX INFO: renamed from: h */
    public final void m36449h() {
        Iterator it = this.f44785d.iterator();
        while (it.hasNext()) {
            int i13 = ((C12957g0) it.next()).f44755a;
            if (m36446d(i13) == null) {
                int i14 = C12977n0.f44815K;
                StringBuilder sbM53375p = AbstractC18489d0.m53375p("Navigation destination ", AbstractC34132o.m107895x(this.f44782a, i13), " cannot be found in the navigation graph ");
                sbM53375p.append(this.f44784c);
                throw new IllegalArgumentException(sbM53375p.toString());
            }
        }
    }

    public C12966j0(AbstractC12939a0 abstractC12939a0) {
        this(abstractC12939a0.f44680a);
        this.f44784c = abstractC12939a0.m36396k();
    }
}
