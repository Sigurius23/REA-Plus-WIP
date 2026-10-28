package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.recyclerview.widget.RecyclerView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.n */
/* JADX INFO: loaded from: classes7.dex */
public class C13501n extends AbstractC13496m {

    /* JADX INFO: renamed from: f */
    private static final C1191u f47475f = null;

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f47476g;

    /* JADX INFO: renamed from: d */
    private final ConstraintLayout f47477d;

    /* JADX INFO: renamed from: e */
    private long f47478e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47476g = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165419u0, 1);
        sparseIntArray.put(AbstractC38499a0.f165385q2, 2);
        sparseIntArray.put(AbstractC38499a0.f165105K1, 3);
    }

    public C13501n(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47475f, f47476g));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47478e = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47478e != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47478e = 1L;
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

    private C13501n(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[1], (RecyclerView) objArr[3], (View) objArr[2]);
        this.f47478e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47477d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
