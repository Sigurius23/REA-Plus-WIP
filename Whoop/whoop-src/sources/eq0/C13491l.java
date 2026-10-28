package eq0;

import android.util.SparseIntArray;
import android.view.View;
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
import com.whoop.p069ui.pills.StrokedPillButton;
import of1.C27895a;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.l */
/* JADX INFO: loaded from: classes7.dex */
public class C13491l extends AbstractC13486k {

    /* JADX INFO: renamed from: n */
    private static final C1191u f47420n;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f47421o;

    /* JADX INFO: renamed from: k */
    private final C27895a f47422k;

    /* JADX INFO: renamed from: l */
    private final LinearLayout f47423l;

    /* JADX INFO: renamed from: m */
    private long f47424m;

    static {
        C1191u c1191u = new C1191u(12);
        f47420n = c1191u;
        c1191u.m3737a(1, new int[]{3}, new int[]{AbstractC38501b0.f165522i0}, new String[]{"layout_teams_overview_header"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47421o = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165188T5, 4);
        sparseIntArray.put(AbstractC38499a0.f165387q4, 5);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 6);
        sparseIntArray.put(AbstractC38499a0.f165271d5, 7);
        sparseIntArray.put(AbstractC38499a0.f165280e5, 8);
        sparseIntArray.put(AbstractC38499a0.f165252b4, 9);
        sparseIntArray.put(AbstractC38499a0.f165243a4, 10);
        sparseIntArray.put(AbstractC38499a0.f165141O1, 11);
    }

    public C13491l(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 12, f47420n, f47421o));
    }

    /* JADX INFO: renamed from: c */
    private boolean m38207c(AbstractC13529s2 abstractC13529s2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47424m |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47424m = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47404h);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47424m != 0) {
                    return true;
                }
                return this.f47404h.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47424m = 2L;
        }
        this.f47404h.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38207c((AbstractC13529s2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47404h.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13491l(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (CoordinatorLayout) objArr[1], (StrokedPillButton) objArr[11], (StrokedPillButton) objArr[10], (LinearLayout) objArr[9], (RelativeLayout) objArr[5], (LinearLayout) objArr[7], (TextView) objArr[8], (AbstractC13529s2) objArr[3], (RecyclerView) objArr[4], (ThrobberView) objArr[6]);
        this.f47424m = -1L;
        this.f47397a.setTag(null);
        Object obj = objArr[2];
        this.f47422k = obj != null ? C27895a.m84174a((View) obj) : null;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f47423l = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.f47404h);
        setRootTag(view);
        invalidateAll();
    }
}
