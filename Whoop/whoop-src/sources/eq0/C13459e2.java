package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.e2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13459e2 extends AbstractC13454d2 {

    /* JADX INFO: renamed from: g */
    private static final C1191u f47227g = null;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f47228h;

    /* JADX INFO: renamed from: e */
    private final ConstraintLayout f47229e;

    /* JADX INFO: renamed from: f */
    private long f47230f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47228h = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165370o5, 1);
        sparseIntArray.put(AbstractC38499a0.f165139O, 2);
        sparseIntArray.put(AbstractC38499a0.f165117L4, 3);
        sparseIntArray.put(AbstractC38499a0.f165361n5, 4);
    }

    public C13459e2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f47227g, f47228h));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47230f = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47230f != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47230f = 1L;
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

    private C13459e2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (RadioButton) objArr[2], (RadioButton) objArr[3], (RadioButton) objArr[4], (RadioGroup) objArr[1]);
        this.f47230f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47229e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
