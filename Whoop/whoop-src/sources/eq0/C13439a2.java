package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

/* JADX INFO: renamed from: eq0.a2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13439a2 extends AbstractC13560z1 {

    /* JADX INFO: renamed from: j */
    private static final C1191u f47116j;

    /* JADX INFO: renamed from: k */
    private static final SparseIntArray f47117k;

    /* JADX INFO: renamed from: h */
    private final FrameLayout f47118h;

    /* JADX INFO: renamed from: i */
    private long f47119i;

    static {
        C1191u c1191u = new C1191u(8);
        f47116j = c1191u;
        c1191u.m3737a(1, new int[]{2}, new int[]{AbstractC38501b0.f165522i0}, new String[]{"layout_teams_overview_header"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47117k = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165188T5, 3);
        sparseIntArray.put(AbstractC38499a0.f165387q4, 4);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 5);
        sparseIntArray.put(AbstractC38499a0.f165271d5, 6);
        sparseIntArray.put(AbstractC38499a0.f165280e5, 7);
    }

    public C13439a2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 8, f47116j, f47117k));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38170e(AbstractC13529s2 abstractC13529s2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47119i |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47119i = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47810e);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47119i != 0) {
                    return true;
                }
                return this.f47810e.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47119i = 2L;
        }
        this.f47810e.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38170e((AbstractC13529s2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47810e.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13439a2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (CoordinatorLayout) objArr[1], (RelativeLayout) objArr[4], (LinearLayout) objArr[6], (TextView) objArr[7], (AbstractC13529s2) objArr[2], (RecyclerView) objArr[3], (ThrobberView) objArr[5]);
        this.f47119i = -1L;
        this.f47806a.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f47118h = frameLayout;
        frameLayout.setTag(null);
        setContainedBinding(this.f47810e);
        setRootTag(view);
        invalidateAll();
    }
}
