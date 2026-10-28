package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.z2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13561z2 extends AbstractC13557y2 {

    /* JADX INFO: renamed from: r */
    private static final C1191u f47813r = null;

    /* JADX INFO: renamed from: s */
    private static final SparseIntArray f47814s;

    /* JADX INFO: renamed from: q */
    private long f47815q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47814s = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165187T4, 1);
        sparseIntArray.put(AbstractC38499a0.f165322j2, 2);
        sparseIntArray.put(AbstractC38499a0.f165349m2, 3);
        sparseIntArray.put(AbstractC38499a0.f165340l2, 4);
        sparseIntArray.put(AbstractC38499a0.f165313i2, 5);
        sparseIntArray.put(AbstractC38499a0.f165331k2, 6);
        sparseIntArray.put(AbstractC38499a0.f165367o2, 7);
        sparseIntArray.put(AbstractC38499a0.f165304h2, 8);
        sparseIntArray.put(AbstractC38499a0.f165358n2, 9);
        sparseIntArray.put(AbstractC38499a0.f165293g0, 10);
        sparseIntArray.put(AbstractC38499a0.f165195U4, 11);
        sparseIntArray.put(AbstractC38499a0.f165162Q4, 12);
        sparseIntArray.put(AbstractC38499a0.f165179S4, 13);
        sparseIntArray.put(AbstractC38499a0.f165171R4, 14);
        sparseIntArray.put(AbstractC38499a0.f165203V4, 15);
    }

    public C13561z2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 16, f47813r, f47814s));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47815q = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47815q != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47815q = 1L;
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

    private C13561z2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (Barrier) objArr[10], (ImageView) objArr[8], (ImageView) objArr[5], (Group) objArr[2], (ImageView) objArr[6], (ImageView) objArr[4], (ImageView) objArr[3], (ImageView) objArr[9], (ImageView) objArr[7], (TextView) objArr[12], (TextView) objArr[14], (TextView) objArr[13], (ImageView) objArr[1], (ConstraintLayout) objArr[0], (TextView) objArr[11], (TextView) objArr[15]);
        this.f47815q = -1L;
        this.f47785n.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
