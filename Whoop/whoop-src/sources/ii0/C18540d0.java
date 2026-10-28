package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.recyclerview.widget.RecyclerView;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.d0 */
/* JADX INFO: loaded from: classes7.dex */
public class C18540d0 extends AbstractC18538c0 {

    /* JADX INFO: renamed from: j */
    private static final C1191u f72248j = null;

    /* JADX INFO: renamed from: k */
    private static final SparseIntArray f72249k;

    /* JADX INFO: renamed from: i */
    private long f72250i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72249k = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66826s2, 1);
        sparseIntArray.put(AbstractC17307e.f66832t1, 2);
        sparseIntArray.put(AbstractC17307e.f66783m1, 3);
        sparseIntArray.put(AbstractC17307e.f66825s1, 4);
        sparseIntArray.put(AbstractC17307e.f66833t2, 5);
        sparseIntArray.put(AbstractC17307e.f66570E4, 6);
        sparseIntArray.put(AbstractC17307e.f66692Z0, 7);
    }

    public C18540d0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 8, f72248j, f72249k));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72250i = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72250i != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72250i = 1L;
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

    private C18540d0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ComposeView) objArr[7], (ConstraintLayout) objArr[0], (TextView) objArr[3], (ViewFlipper) objArr[4], (TextView) objArr[2], (Guideline) objArr[1], (Guideline) objArr[5], (RecyclerView) objArr[6]);
        this.f72250i = -1L;
        this.f72236b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
