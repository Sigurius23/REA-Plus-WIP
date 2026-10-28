package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.l3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13495l3 extends AbstractC13490k3 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47452e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47453f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47454c;

    /* JADX INFO: renamed from: d */
    private long f47455d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47453f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165365o0, 1);
        sparseIntArray.put(AbstractC38499a0.f165356n0, 2);
    }

    public C13495l3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47452e, f47453f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47455d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47455d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47455d = 1L;
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

    private C13495l3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[2], (LinearLayout) objArr[1]);
        this.f47455d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47454c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
