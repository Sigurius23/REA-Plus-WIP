package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.c2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13449c2 extends AbstractC13444b2 {

    /* JADX INFO: renamed from: m */
    private static final C1191u f47174m;

    /* JADX INFO: renamed from: n */
    private static final SparseIntArray f47175n;

    /* JADX INFO: renamed from: k */
    private final ConstraintLayout f47176k;

    /* JADX INFO: renamed from: l */
    private long f47177l;

    static {
        C1191u c1191u = new C1191u(11);
        f47174m = c1191u;
        c1191u.m3737a(1, new int[]{2}, new int[]{AbstractC38501b0.f165522i0}, new String[]{"layout_teams_overview_header"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47175n = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165188T5, 3);
        sparseIntArray.put(AbstractC38499a0.f165146O6, 4);
        sparseIntArray.put(AbstractC38499a0.f165387q4, 5);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 6);
        sparseIntArray.put(AbstractC38499a0.f165271d5, 7);
        sparseIntArray.put(AbstractC38499a0.f165280e5, 8);
        sparseIntArray.put(AbstractC38499a0.f165243a4, 9);
        sparseIntArray.put(AbstractC38499a0.f165141O1, 10);
    }

    public C13449c2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 11, f47174m, f47175n));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38177e(AbstractC13529s2 abstractC13529s2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47177l |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47177l = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47140g);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47177l != 0) {
                    return true;
                }
                return this.f47140g.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47177l = 2L;
        }
        this.f47140g.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38177e((AbstractC13529s2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47140g.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13449c2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (CoordinatorLayout) objArr[1], (StrokedPillButton) objArr[10], (StrokedPillButton) objArr[9], (RelativeLayout) objArr[5], (LinearLayout) objArr[7], (TextView) objArr[8], (AbstractC13529s2) objArr[2], (RecyclerView) objArr[3], (ImageView) objArr[4], (ThrobberView) objArr[6]);
        this.f47177l = -1L;
        this.f47134a.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47176k = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f47140g);
        setRootTag(view);
        invalidateAll();
    }
}
