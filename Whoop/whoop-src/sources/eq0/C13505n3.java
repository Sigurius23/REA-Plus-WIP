package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.n3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13505n3 extends AbstractC13500m3 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47496e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47497f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47498c;

    /* JADX INFO: renamed from: d */
    private long f47499d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47497f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165356n0, 1);
        sparseIntArray.put(AbstractC38499a0.f165365o0, 2);
    }

    public C13505n3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47496e, f47497f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47499d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47499d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47499d = 1L;
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

    private C13505n3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[1], (TextView) objArr[2]);
        this.f47499d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47498c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
