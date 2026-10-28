package ml;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import la.C23548b;
import p029b5.C2725d;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: ml.f */
/* JADX INFO: loaded from: classes6.dex */
public class FragmentC25664f extends Fragment {

    /* JADX INFO: renamed from: E */
    public FragmentC25664f f100917E;

    /* JADX INFO: renamed from: F */
    public Fragment f100918F;

    /* JADX INFO: renamed from: w */
    public final C2725d f100919w;

    /* JADX INFO: renamed from: x */
    public final C23548b f100920x;

    /* JADX INFO: renamed from: y */
    public final HashSet f100921y;

    /* JADX INFO: renamed from: z */
    public ComponentCallbacks2C4966h f100922z;

    public FragmentC25664f() {
        C2725d c2725d = new C2725d();
        this.f100920x = new C23548b(this, 6);
        this.f100921y = new HashSet();
        this.f100919w = c2725d;
    }

    /* JADX INFO: renamed from: a */
    public final C2725d m75555a() {
        return this.f100919w;
    }

    /* JADX INFO: renamed from: b */
    public final ComponentCallbacks2C4966h m75556b() {
        return this.f100922z;
    }

    /* JADX INFO: renamed from: c */
    public final C23548b m75557c() {
        return this.f100920x;
    }

    /* JADX INFO: renamed from: d */
    public final void m75558d(Activity activity) {
        FragmentC25664f fragmentC25664f = this.f100917E;
        if (fragmentC25664f != null) {
            fragmentC25664f.f100921y.remove(this);
            this.f100917E = null;
        }
        C25665g c25665g = ComponentCallbacks2C4960b.m15527c(activity).f20294G;
        c25665g.getClass();
        FragmentC25664f fragmentC25664fM75570i = c25665g.m75570i(activity.getFragmentManager(), null, C25665g.m75564k(activity));
        this.f100917E = fragmentC25664fM75570i;
        if (equals(fragmentC25664fM75570i)) {
            return;
        }
        this.f100917E.f100921y.add(this);
    }

    /* JADX INFO: renamed from: e */
    public final void m75559e(Fragment fragment) {
        this.f100918F = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m75558d(fragment.getActivity());
    }

    /* JADX INFO: renamed from: f */
    public final void m75560f(ComponentCallbacks2C4966h componentCallbacks2C4966h) {
        this.f100922z = componentCallbacks2C4966h;
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m75558d(activity);
        } catch (IllegalStateException e5) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e5);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C2725d c2725d = this.f100919w;
        c2725d.f10734x = true;
        Iterator it = AbstractC33913l.m107269d((Set) c2725d.f10735y).iterator();
        while (it.hasNext()) {
            ((InterfaceC25662d) it.next()).onDestroy();
        }
        FragmentC25664f fragmentC25664f = this.f100917E;
        if (fragmentC25664f != null) {
            fragmentC25664f.f100921y.remove(this);
            this.f100917E = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentC25664f fragmentC25664f = this.f100917E;
        if (fragmentC25664f != null) {
            fragmentC25664f.f100921y.remove(this);
            this.f100917E = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f100919w.m7695b();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        C2725d c2725d = this.f100919w;
        c2725d.f10733w = false;
        Iterator it = AbstractC33913l.m107269d((Set) c2725d.f10735y).iterator();
        while (it.hasNext()) {
            ((InterfaceC25662d) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f100918F;
        }
        sb4.append(parentFragment);
        sb4.append("}");
        return sb4.toString();
    }
}
