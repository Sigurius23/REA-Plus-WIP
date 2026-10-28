package eq0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.p069ui.WhoopZoomageView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: eq0.q1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13518q1 extends AbstractC13513p1 {

    /* JADX INFO: renamed from: g */
    private static final C1191u f47551g;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f47552h;

    /* JADX INFO: renamed from: e */
    private final ConstraintLayout f47553e;

    /* JADX INFO: renamed from: f */
    private long f47554f;

    static {
        C1191u c1191u = new C1191u(5);
        f47551g = c1191u;
        c1191u.m3737a(0, new int[]{1, 2}, new int[]{AbstractC38501b0.f165518g0, AbstractC38501b0.f165556z0}, new String[]{"layout_team_pick_logo", "view_drag_and_zoom"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47552h = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165057E7, 3);
        sparseIntArray.put(AbstractC38499a0.f165396r4, 4);
    }

    public C13518q1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f47551g, f47552h));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38237e(AbstractC13509o2 abstractC13509o2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47554f |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38238f(AbstractC13520q3 abstractC13520q3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47554f |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        long j7;
        synchronized (this) {
            j7 = this.f47554f;
            this.f47554f = 0L;
        }
        if ((j7 & 4) != 0) {
            this.f47533b.mo38240d(getRoot().getResources().getString(AbstractC38505d0.f165616R1));
            this.f47533b.mo38239c(getRoot().getResources().getString(AbstractC38505d0.f165681k));
        }
        AbstractC1168a0.executeBindingsOn(this.f47532a);
        AbstractC1168a0.executeBindingsOn(this.f47533b);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47554f != 0) {
                    return true;
                }
                return this.f47532a.hasPendingBindings() || this.f47533b.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47554f = 4L;
        }
        this.f47532a.invalidateAll();
        this.f47533b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38237e((AbstractC13509o2) obj, i14);
        }
        if (i13 != 1) {
            return false;
        }
        return m38238f((AbstractC13520q3) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47532a.setLifecycleOwner(interfaceC1585g0);
        this.f47533b.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13518q1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 2, (AbstractC13509o2) objArr[1], (AbstractC13520q3) objArr[2], (WhoopZoomageView) objArr[4], (Group) objArr[3]);
        this.f47554f = -1L;
        setContainedBinding(this.f47532a);
        setContainedBinding(this.f47533b);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47553e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
