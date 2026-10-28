package ii0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.ThrobberView;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.j0 */
/* JADX INFO: loaded from: classes7.dex */
public class C18552j0 extends AbstractC18550i0 {

    /* JADX INFO: renamed from: d */
    private static final C1191u f72296d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f72297e;

    /* JADX INFO: renamed from: c */
    private long f72298c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72297e = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66701a3, 1);
    }

    public C18552j0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 2, f72296d, f72297e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72298c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72298c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72298c = 1L;
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

    private C18552j0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ThrobberView) objArr[1], (ConstraintLayout) objArr[0]);
        this.f72298c = -1L;
        this.f72291b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
