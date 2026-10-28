package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.y1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13556y1 extends AbstractC13552x1 {

    /* JADX INFO: renamed from: o */
    private static final C1191u f47768o;

    /* JADX INFO: renamed from: p */
    private static final SparseIntArray f47769p;

    /* JADX INFO: renamed from: m */
    private final CoordinatorLayout f47770m;

    /* JADX INFO: renamed from: n */
    private long f47771n;

    static {
        C1191u c1191u = new C1191u(13);
        f47768o = c1191u;
        c1191u.m3737a(0, new int[]{3}, new int[]{AbstractC38501b0.f165524j0}, new String[]{"leaderboard_setting"});
        c1191u.m3737a(1, new int[]{2}, new int[]{AbstractC38501b0.f165520h0}, new String[]{"layout_teams_header_v1"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47769p = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165188T5, 4);
        sparseIntArray.put(AbstractC38499a0.f165387q4, 5);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 6);
        sparseIntArray.put(AbstractC38499a0.f165271d5, 7);
        sparseIntArray.put(AbstractC38499a0.f165280e5, 8);
        sparseIntArray.put(AbstractC38499a0.f165289f5, 9);
        sparseIntArray.put(AbstractC38499a0.f165298g5, 10);
        sparseIntArray.put(AbstractC38499a0.f165075G7, 11);
        sparseIntArray.put(AbstractC38499a0.f165084H7, 12);
    }

    public C13556y1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 13, f47768o, f47769p));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38268e(AbstractC13539u2 abstractC13539u2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47771n |= 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38269f(AbstractC13519q2 abstractC13519q2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47771n |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47771n = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47753h);
        AbstractC1168a0.executeBindingsOn(this.f47747b);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47771n != 0) {
                    return true;
                }
                return this.f47753h.hasPendingBindings() || this.f47747b.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47771n = 4L;
        }
        this.f47753h.invalidateAll();
        this.f47747b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38269f((AbstractC13519q2) obj, i14);
        }
        if (i13 != 1) {
            return false;
        }
        return m38268e((AbstractC13539u2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47753h.setLifecycleOwner(interfaceC1585g0);
        this.f47747b.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13556y1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 2, (CoordinatorLayout) objArr[1], (AbstractC13539u2) objArr[3], (RelativeLayout) objArr[5], (LinearLayout) objArr[7], (TextView) objArr[8], (LinearLayout) objArr[9], (TextView) objArr[10], (AbstractC13519q2) objArr[2], (RecyclerView) objArr[4], (ThrobberView) objArr[6], (LinearLayout) objArr[11], (Space) objArr[12]);
        this.f47771n = -1L;
        this.f47746a.setTag(null);
        setContainedBinding(this.f47747b);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f47770m = coordinatorLayout;
        coordinatorLayout.setTag(null);
        setContainedBinding(this.f47753h);
        setRootTag(view);
        invalidateAll();
    }
}
