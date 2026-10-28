package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.q0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13517q0 extends AbstractC13512p0 {

    /* JADX INFO: renamed from: k */
    private static final C1191u f47547k = null;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f47548l;

    /* JADX INFO: renamed from: i */
    private final ConstraintLayout f47549i;

    /* JADX INFO: renamed from: j */
    private long f47550j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47548l = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165318i7, 1);
        sparseIntArray.put(AbstractC38499a0.f165327j7, 2);
        sparseIntArray.put(AbstractC38499a0.f165354m7, 3);
        sparseIntArray.put(AbstractC38499a0.f165284f0, 4);
        sparseIntArray.put(AbstractC38499a0.f165345l7, 5);
        sparseIntArray.put(AbstractC38499a0.f165336k7, 6);
        sparseIntArray.put(AbstractC38499a0.f165229Y6, 7);
        sparseIntArray.put(AbstractC38499a0.f165095J0, 8);
    }

    public C13517q0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f47547k, f47548l));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47550j = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47550j != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47550j = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13517q0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (Barrier) objArr[4], (ViewPager2) objArr[8], (TabLayout) objArr[7], (ConstraintLayout) objArr[1], (ImageView) objArr[2], (ImageView) objArr[6], (Spinner) objArr[5], (TextView) objArr[3]);
        this.f47550j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47549i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
