package eq0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.y0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13555y0 extends AbstractC13551x0 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47764e;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47765f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47766c;

    /* JADX INFO: renamed from: d */
    private long f47767d;

    static {
        C1191u c1191u = new C1191u(3);
        f47764e = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC38501b0.f165482E}, new String[]{"fragment_community_landing_toolbar"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47765f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165339l1, 2);
    }

    public C13555y0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47764e, f47765f));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38267e(AbstractC13532t0 abstractC13532t0, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47767d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47767d = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47744a);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47767d != 0) {
                    return true;
                }
                return this.f47744a.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47767d = 2L;
        }
        this.f47744a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38267e((AbstractC13532t0) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47744a.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13555y0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (AbstractC13532t0) objArr[1], (RecyclerView) objArr[2]);
        this.f47767d = -1L;
        setContainedBinding(this.f47744a);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47766c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
