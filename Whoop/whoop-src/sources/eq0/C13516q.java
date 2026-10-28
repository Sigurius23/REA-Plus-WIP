package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.google.android.material.imageview.ShapeableImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.q */
/* JADX INFO: loaded from: classes7.dex */
public class C13516q extends AbstractC13511p {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47543i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47544j;

    /* JADX INFO: renamed from: g */
    private final ConstraintLayout f47545g;

    /* JADX INFO: renamed from: h */
    private long f47546h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47544j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165251b3, 1);
        sparseIntArray.put(AbstractC38499a0.f165278e3, 2);
        sparseIntArray.put(AbstractC38499a0.f165052E2, 3);
        sparseIntArray.put(AbstractC38499a0.f165305h3, 4);
        sparseIntArray.put(AbstractC38499a0.f165296g3, 5);
        sparseIntArray.put(AbstractC38499a0.f165415t5, 6);
    }

    public C13516q(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 7, f47543i, f47544j));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47546h = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47546h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47546h = 1L;
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

    private C13516q(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ShapeableImageView) objArr[3], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[4], (TextView) objArr[6]);
        this.f47546h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47545g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
