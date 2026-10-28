package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.google.android.material.imageview.ShapeableImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.h3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13475h3 extends AbstractC13470g3 {

    /* JADX INFO: renamed from: f */
    private static final C1191u f47333f = null;

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f47334g;

    /* JADX INFO: renamed from: d */
    private final ConstraintLayout f47335d;

    /* JADX INFO: renamed from: e */
    private long f47336e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47334g = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165234Z3, 1);
        sparseIntArray.put(AbstractC38499a0.f165347m0, 2);
        sparseIntArray.put(AbstractC38499a0.f165157Q, 3);
    }

    public C13475h3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47333f, f47334g));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47336e = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47336e != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47336e = 1L;
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

    private C13475h3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[3], (ImageView) objArr[2], (ShapeableImageView) objArr[1]);
        this.f47336e = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47335d = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
