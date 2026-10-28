package p044c5;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.iterable.iterableapi.C5356n2;
import com.iterable.iterableapi.C5360p;
import com.iterable.iterableapi.C5392z1;
import com.iterable.iterableapi.InterfaceC5312c2;
import com.iterable.iterableapi.InterfaceC5318e0;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p012ab.C0682h0;
import p073cq.C11052u;
import p097ds.RunnableC12316s;
import p311lq.AbstractC24648g;
import q30.C29934u0;
import so.C32784a;
import so.C32797n;
import so.C32798o;
import so.ExecutorC32792i;
import to.AbstractC33975h;

/* JADX INFO: renamed from: c5.m */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC4221m implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17106w;

    /* JADX INFO: renamed from: x */
    public Object f17107x;

    /* JADX INFO: renamed from: y */
    public Object f17108y;

    /* JADX INFO: renamed from: z */
    public Object f17109z;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        OverScroller overScroller;
        int i13;
        C11052u c11052uM102857c;
        switch (this.f17106w) {
            case 0:
                try {
                    objCall = ((CallableC4213e) this.f17107x).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f17109z).post(new RunnableC12316s(4, (C4214f) this.f17108y, objCall));
                return;
            case 1:
                InterfaceC5312c2 interfaceC5312c2 = (InterfaceC5312c2) this.f17107x;
                String str = (String) this.f17108y;
                C5360p c5360p = (C5360p) this.f17109z;
                ((C5356n2) interfaceC5312c2).getClass();
                HashMap map = C5356n2.f21780b;
                C5392z1 c5392z1 = (C5392z1) map.get(str);
                HashMap map2 = C5356n2.f21781c;
                InterfaceC5318e0 interfaceC5318e0 = (InterfaceC5318e0) map2.get(str);
                map.remove(str);
                map2.remove(str);
                boolean z4 = c5360p.f21797a;
                JSONObject jSONObject = c5360p.f21800d;
                if (z4) {
                    if (c5392z1 != null) {
                        c5392z1.m16544a(jSONObject);
                        return;
                    }
                    return;
                } else {
                    if (interfaceC5318e0 != null) {
                        interfaceC5318e0.m16436a(c5360p.f21801e, jSONObject);
                        return;
                    }
                    return;
                }
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f17107x;
                AbstractC24648g abstractC24648g = (AbstractC24648g) this.f17109z;
                View view = (View) this.f17108y;
                if (view == null || (overScroller = abstractC24648g.f96405d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    abstractC24648g.m71999M(coordinatorLayout, view, abstractC24648g.f96405d.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) abstractC24648g).m15667S(coordinatorLayout, appBarLayout);
                if (appBarLayout.f20686L) {
                    appBarLayout.m15652f(appBarLayout.m15653g(AppBarLayout.BaseBehavior.m15656P(coordinatorLayout)));
                    return;
                }
                return;
            case 3:
                C32784a c32784a = (C32784a) this.f17108y;
                if (TextUtils.isEmpty(c32784a.m102843b())) {
                    c11052uM102857c = Tasks.m15640d(null);
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putString("google.message_id", c32784a.m102843b());
                    Integer numM102844f = c32784a.m102844f();
                    if (numM102844f != null) {
                        bundle.putInt("google.product_id", numM102844f.intValue());
                    }
                    Context context = (Context) this.f17107x;
                    bundle.putBoolean("supports_message_handled", true);
                    C32798o c32798oM102855b = C32798o.m102855b(context);
                    synchronized (c32798oM102855b) {
                        i13 = c32798oM102855b.f136499a;
                        c32798oM102855b.f136499a = i13 + 1;
                    }
                    c11052uM102857c = c32798oM102855b.m102857c(new C32797n(i13, 2, bundle, 0));
                }
                c11052uM102857c.addOnCompleteListener(ExecutorC32792i.f136479w, new C29934u0((CountDownLatch) this.f17109z, 18));
                return;
            default:
                AbstractC33975h abstractC33975h = (AbstractC33975h) this.f17107x;
                C0682h0 c0682h0 = (C0682h0) this.f17109z;
                if (c0682h0.f2432x > 0) {
                    Bundle bundle2 = (Bundle) c0682h0.f2434z;
                    abstractC33975h.mo107440d(bundle2 != null ? bundle2.getBundle((String) this.f17108y) : null);
                }
                if (c0682h0.f2432x >= 2) {
                    abstractC33975h.mo107443h();
                }
                if (c0682h0.f2432x >= 3) {
                    abstractC33975h.mo107441f();
                }
                if (c0682h0.f2432x >= 4) {
                    abstractC33975h.mo29700i();
                }
                if (c0682h0.f2432x >= 5) {
                    abstractC33975h.mo107416e();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC4221m(Context context, C32784a c32784a, CountDownLatch countDownLatch) {
        this.f17106w = 3;
        this.f17107x = context;
        this.f17108y = c32784a;
        this.f17109z = countDownLatch;
    }

    public /* synthetic */ RunnableC4221m(Object obj, Object obj2, Object obj3, int i13) {
        this.f17106w = i13;
        this.f17109z = obj;
        this.f17107x = obj2;
        this.f17108y = obj3;
    }

    public RunnableC4221m(InterfaceC5312c2 interfaceC5312c2, String str, int i13, C5360p c5360p) {
        this.f17106w = 1;
        this.f17107x = interfaceC5312c2;
        this.f17108y = str;
        this.f17109z = c5360p;
    }
}
