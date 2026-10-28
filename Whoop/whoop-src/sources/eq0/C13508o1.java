package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: eq0.o1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13508o1 extends AbstractC13503n1 {

    /* JADX INFO: renamed from: f */
    private static final C1191u f47508f;

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f47509g;

    /* JADX INFO: renamed from: d */
    private final ConstraintLayout f47510d;

    /* JADX INFO: renamed from: e */
    private long f47511e;

    static {
        C1191u c1191u = new C1191u(4);
        f47508f = c1191u;
        c1191u.m3737a(0, new int[]{1, 2}, new int[]{AbstractC38501b0.f165516f0, AbstractC38501b0.f165556z0}, new String[]{"layout_team_pick_image", "view_drag_and_zoom"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47509g = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165246a7, 3);
    }

    public C13508o1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47508f, f47509g));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38227e(AbstractC13499m2 abstractC13499m2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47511e |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38228f(AbstractC13520q3 abstractC13520q3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47511e |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        long j7;
        synchronized (this) {
            j7 = this.f47511e;
            this.f47511e = 0L;
        }
        if ((j7 & 4) != 0) {
            this.f47489a.mo38214c(getRoot().getResources().getString(AbstractC38505d0.f165622T1));
            this.f47491c.mo38240d(getRoot().getResources().getString(AbstractC38505d0.f165613Q1));
            this.f47491c.mo38239c(getRoot().getResources().getString(AbstractC38505d0.f165677j));
        }
        AbstractC1168a0.executeBindingsOn(this.f47489a);
        AbstractC1168a0.executeBindingsOn(this.f47491c);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47511e != 0) {
                    return true;
                }
                return this.f47489a.hasPendingBindings() || this.f47491c.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47511e = 4L;
        }
        this.f47489a.invalidateAll();
        this.f47491c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38227e((AbstractC13499m2) obj, i14);
        }
        if (i13 != 1) {
            return false;
        }
        return m38228f((AbstractC13520q3) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47489a.setLifecycleOwner(interfaceC1585g0);
        this.f47491c.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13508o1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 2, (AbstractC13499m2) objArr[1], (TextView) objArr[3], (AbstractC13520q3) objArr[2]);
        this.f47511e = -1L;
        setContainedBinding(this.f47489a);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47510d = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f47491c);
        setRootTag(view);
        invalidateAll();
    }
}
