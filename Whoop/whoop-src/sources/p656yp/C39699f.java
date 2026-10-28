package p656yp;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import java.util.List;
import p002a0.AbstractC0064z;
import p002a0.C0024g1;
import p024b0.AbstractC2177a;
import p231iv.C20943d;
import p360o8.C27651c;
import p360o8.C27653e;
import p360o8.C27654f;
import p360o8.InterfaceC27649a;
import p474s.C31957g0;
import p499t9.C33652u;
import p529uo.AbstractC35135w;
import ro.C31619d;
import so.C32800q;

/* JADX INFO: renamed from: yp.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39699f extends AbstractComponentCallbacksC1320m0 implements InterfaceC27649a {

    /* JADX INFO: renamed from: E */
    public C33652u f170862E;

    /* JADX INFO: renamed from: F */
    public Context f170863F;

    /* JADX INFO: renamed from: w */
    public ListView f170864w;

    /* JADX INFO: renamed from: x */
    public C20943d f170865x;

    /* JADX INFO: renamed from: y */
    public C32800q f170866y;

    /* JADX INFO: renamed from: z */
    public String f170867z;

    @Override // p360o8.InterfaceC27649a
    /* JADX INFO: renamed from: l */
    public final void mo83604l() {
        this.f170865x.clear();
        this.f170865x.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f170863F = context;
        this.f170862E = C33652u.m106280i(context);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.f170867z = arguments.getString("license_activity_package_name");
        }
        if (this.f170867z == null) {
            this.f170867z = this.f170863F.getPackageName();
        }
        this.f170866y = C33652u.m106281j(this.f170863F, this.f170867z);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C32800q c32800q = this.f170866y;
        return layoutInflater.inflate(((Resources) c32800q.f136504w).getIdentifier("license_menu_fragment", "layout", (String) c32800q.f136505x), viewGroup, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        AbstractActivityC1340r0 activity = getActivity();
        if (activity != null) {
            C27653e c27653e = ((C27654f) activity.getSupportLoaderManager()).f111268b;
            boolean z4 = c27653e.f111266x;
            C0024g1 c0024g1 = c27653e.f111265w;
            if (z4) {
                throw new IllegalStateException("Called while creating a loader");
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("destroyLoader must be called on the main thread");
            }
            C27651c c27651c = (C27651c) c0024g1.m55d(54321);
            if (c27651c != null) {
                c27651c.m83609b();
                int iM6853a = AbstractC2177a.m6853a(c0024g1.f58z, 54321, c0024g1.f56x);
                if (iM6853a >= 0) {
                    Object[] objArr = c0024g1.f57y;
                    Object obj = objArr[iM6853a];
                    Object obj2 = AbstractC0064z.f203c;
                    if (obj != obj2) {
                        objArr[iM6853a] = obj2;
                        c0024g1.f55w = true;
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC35135w.m111094f(activity);
        activity.getSupportLoaderManager().mo83608b(54321, this);
        C32800q c32800q = this.f170866y;
        this.f170864w = (ListView) view.findViewById(((Resources) c32800q.f136504w).getIdentifier("license_list", "id", (String) c32800q.f136505x));
        C20943d c20943d = new C20943d(this, activity);
        this.f170865x = c20943d;
        this.f170864w.setAdapter((ListAdapter) c20943d);
        this.f170864w.setOnItemClickListener(new C31957g0(this, 1));
    }

    @Override // p360o8.InterfaceC27649a
    /* JADX INFO: renamed from: p */
    public final /* bridge */ /* synthetic */ void mo83605p(Object obj) {
        this.f170865x.clear();
        this.f170865x.addAll((List) obj);
        this.f170865x.notifyDataSetChanged();
    }

    @Override // p360o8.InterfaceC27649a
    /* JADX INFO: renamed from: w */
    public final C31619d mo83606w() {
        return new C31619d(this.f170863F, this.f170862E);
    }
}
