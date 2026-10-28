package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.e1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13458e1 extends AbstractC13453d1 {

    /* JADX INFO: renamed from: l */
    private static final C1191u f47223l;

    /* JADX INFO: renamed from: m */
    private static final SparseIntArray f47224m;

    /* JADX INFO: renamed from: j */
    private final ConstraintLayout f47225j;

    /* JADX INFO: renamed from: k */
    private long f47226k;

    static {
        C1191u c1191u = new C1191u(10);
        f47223l = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC38501b0.f165512d0}, new String[]{"layout_global_share_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47224m = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165120L7, 2);
        sparseIntArray.put(AbstractC38499a0.f165137N6, 3);
        sparseIntArray.put(AbstractC38499a0.f165147O7, 4);
        sparseIntArray.put(AbstractC38499a0.f165156P7, 5);
        sparseIntArray.put(AbstractC38499a0.f165115L2, 6);
        sparseIntArray.put(AbstractC38499a0.f165097J2, 7);
        sparseIntArray.put(AbstractC38499a0.f165106K2, 8);
        sparseIntArray.put(AbstractC38499a0.f165434v6, 9);
    }

    public C13458e1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 10, f47223l, f47224m));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38182e(AbstractC13479i2 abstractC13479i2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47226k |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47226k = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47196a);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47226k != 0) {
                    return true;
                }
                return this.f47196a.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47226k = 2L;
        }
        this.f47196a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38182e((AbstractC13479i2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47196a.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13458e1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (AbstractC13479i2) objArr[1], (StrokedPillButton) objArr[7], (StrokedPillButton) objArr[8], (ThrobberView) objArr[6], (FragmentContainerView) objArr[9], (TextView) objArr[3], (ImageView) objArr[2], (ViewPager2) objArr[4], (TabLayout) objArr[5]);
        this.f47226k = -1L;
        setContainedBinding(this.f47196a);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47225j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
