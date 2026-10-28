package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import gy0.AbstractC16272a;
import q83.AbstractC30060g;
import vu1.AbstractC36512c;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;
import xp0.AbstractC38529z;

/* JADX INFO: renamed from: eq0.u1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13538u1 extends AbstractC13533t1 {

    /* JADX INFO: renamed from: j */
    private static final C1191u f47679j;

    /* JADX INFO: renamed from: k */
    private static final SparseIntArray f47680k;

    /* JADX INFO: renamed from: h */
    private final ConstraintLayout f47681h;

    /* JADX INFO: renamed from: i */
    private long f47682i;

    static {
        C1191u c1191u = new C1191u(8);
        f47679j = c1191u;
        int i13 = AbstractC38501b0.f165477B0;
        c1191u.m3737a(0, new int[]{1, 2, 3}, new int[]{i13, i13, i13}, new String[]{"view_team_leaderboard_toggle", "view_team_leaderboard_toggle", "view_team_leaderboard_toggle"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47680k = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165246a7, 4);
        sparseIntArray.put(AbstractC38499a0.f165042D1, 5);
        sparseIntArray.put(AbstractC38499a0.f165033C1, 6);
        sparseIntArray.put(AbstractC38499a0.f165217X2, 7);
    }

    public C13538u1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 8, f47679j, f47680k));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38254e(AbstractC13530s3 abstractC13530s3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47682i |= 4;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38255f(AbstractC13530s3 abstractC13530s3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47682i |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m38256g(AbstractC13530s3 abstractC13530s3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47682i |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        long j7;
        synchronized (this) {
            j7 = this.f47682i;
            this.f47682i = 0L;
        }
        if ((j7 & 8) != 0) {
            this.f47661d.mo38250c(AbstractC30060g.m92133x(getRoot().getContext(), AbstractC38529z.f165827t));
            this.f47661d.mo38251d(getRoot().getResources().getString(AbstractC38505d0.f165652c2));
            this.f47662e.mo38250c(AbstractC30060g.m92133x(getRoot().getContext(), AbstractC16272a.f62030X4));
            this.f47662e.mo38251d(getRoot().getResources().getString(AbstractC38505d0.f165656d2));
            this.f47663f.mo38250c(AbstractC30060g.m92133x(getRoot().getContext(), AbstractC36512c.f156064g));
            this.f47663f.mo38251d(getRoot().getResources().getString(AbstractC38505d0.f165660e2));
        }
        AbstractC1168a0.executeBindingsOn(this.f47663f);
        AbstractC1168a0.executeBindingsOn(this.f47661d);
        AbstractC1168a0.executeBindingsOn(this.f47662e);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47682i != 0) {
                    return true;
                }
                return this.f47663f.hasPendingBindings() || this.f47661d.hasPendingBindings() || this.f47662e.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47682i = 8L;
        }
        this.f47663f.invalidateAll();
        this.f47661d.invalidateAll();
        this.f47662e.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38255f((AbstractC13530s3) obj, i14);
        }
        if (i13 == 1) {
            return m38256g((AbstractC13530s3) obj, i14);
        }
        if (i13 != 2) {
            return false;
        }
        return m38254e((AbstractC13530s3) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47663f.setLifecycleOwner(interfaceC1585g0);
        this.f47661d.setLifecycleOwner(interfaceC1585g0);
        this.f47662e.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13538u1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 3, (TextView) objArr[6], (TextView) objArr[5], (ImageView) objArr[7], (AbstractC13530s3) objArr[2], (AbstractC13530s3) objArr[3], (AbstractC13530s3) objArr[1], (TextView) objArr[4]);
        this.f47682i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47681h = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f47661d);
        setContainedBinding(this.f47662e);
        setContainedBinding(this.f47663f);
        setRootTag(view);
        invalidateAll();
    }
}
