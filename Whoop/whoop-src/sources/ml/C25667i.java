package ml;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import la.C23548b;
import p000.AbstractC11266d;
import p029b5.C2725d;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: ml.i */
/* JADX INFO: loaded from: classes6.dex */
public class C25667i extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E */
    public ComponentCallbacks2C4966h f100931E;

    /* JADX INFO: renamed from: F */
    public AbstractComponentCallbacksC1320m0 f100932F;

    /* JADX INFO: renamed from: w */
    public final C2725d f100933w;

    /* JADX INFO: renamed from: x */
    public final C23548b f100934x;

    /* JADX INFO: renamed from: y */
    public final HashSet f100935y;

    /* JADX INFO: renamed from: z */
    public C25667i f100936z;

    public C25667i() {
        C2725d c2725d = new C2725d();
        this.f100934x = new C23548b(this, 7);
        this.f100935y = new HashSet();
        this.f100933w = c2725d;
    }

    /* JADX INFO: renamed from: A */
    public final C23548b m75573A() {
        return this.f100934x;
    }

    /* JADX INFO: renamed from: B */
    public final void m75574B(Context context, AbstractC1329o1 abstractC1329o1) {
        C25667i c25667i = this.f100936z;
        if (c25667i != null) {
            c25667i.f100935y.remove(this);
            this.f100936z = null;
        }
        C25665g c25665g = ComponentCallbacks2C4960b.m15527c(context).f20294G;
        c25665g.getClass();
        C25667i c25667iM75571j = c25665g.m75571j(abstractC1329o1, null, C25665g.m75564k(context));
        this.f100936z = c25667iM75571j;
        if (equals(c25667iM75571j)) {
            return;
        }
        this.f100936z.f100935y.add(this);
    }

    /* JADX INFO: renamed from: C */
    public final void m75575C(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f100932F = abstractComponentCallbacksC1320m0;
        if (abstractComponentCallbacksC1320m0 == null || abstractComponentCallbacksC1320m0.getContext() == null) {
            return;
        }
        AbstractComponentCallbacksC1320m0 parentFragment = abstractComponentCallbacksC1320m0;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        AbstractC1329o1 fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        m75574B(abstractComponentCallbacksC1320m0.getContext(), fragmentManager);
    }

    /* JADX INFO: renamed from: D */
    public final void m75576D(ComponentCallbacks2C4966h componentCallbacks2C4966h) {
        this.f100931E = componentCallbacks2C4966h;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onAttach(Context context) {
        super.onAttach(context);
        AbstractComponentCallbacksC1320m0 parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        AbstractC1329o1 fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                m75574B(getContext(), fragmentManager);
            } catch (IllegalStateException e5) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e5);
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDestroy() {
        super.onDestroy();
        C2725d c2725d = this.f100933w;
        c2725d.f10734x = true;
        Iterator it = AbstractC33913l.m107269d((Set) c2725d.f10735y).iterator();
        while (it.hasNext()) {
            ((InterfaceC25662d) it.next()).onDestroy();
        }
        C25667i c25667i = this.f100936z;
        if (c25667i != null) {
            c25667i.f100935y.remove(this);
            this.f100936z = null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onDetach() {
        super.onDetach();
        this.f100932F = null;
        C25667i c25667i = this.f100936z;
        if (c25667i != null) {
            c25667i.f100935y.remove(this);
            this.f100936z = null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStart() {
        super.onStart();
        this.f100933w.m7695b();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final void onStop() {
        super.onStop();
        C2725d c2725d = this.f100933w;
        c2725d.f10733w = false;
        Iterator it = AbstractC33913l.m107269d((Set) c2725d.f10735y).iterator();
        while (it.hasNext()) {
            ((InterfaceC25662d) it.next()).onStop();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append("{parent=");
        AbstractComponentCallbacksC1320m0 parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f100932F;
        }
        return AbstractC11266d.m30463q(sb4, parentFragment, "}");
    }

    /* JADX INFO: renamed from: y */
    public final C2725d m75577y() {
        return this.f100933w;
    }

    /* JADX INFO: renamed from: z */
    public final ComponentCallbacks2C4966h m75578z() {
        return this.f100931E;
    }
}
