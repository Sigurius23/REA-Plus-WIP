package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.l2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13494l2 extends AbstractC13489k2 {

    /* JADX INFO: renamed from: g */
    private static final C1191u f47448g = null;

    /* JADX INFO: renamed from: h */
    private static final SparseIntArray f47449h;

    /* JADX INFO: renamed from: e */
    private final ConstraintLayout f47450e;

    /* JADX INFO: renamed from: f */
    private long f47451f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47449h = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165416t6, 1);
        sparseIntArray.put(AbstractC38499a0.f165425u6, 2);
        sparseIntArray.put(AbstractC38499a0.f165407s6, 3);
        sparseIntArray.put(AbstractC38499a0.f165398r6, 4);
    }

    public C13494l2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f47448g, f47449h));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47451f = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47451f != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47451f = 1L;
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

    private C13494l2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (StrokedPillButton) objArr[4], (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[2]);
        this.f47451f = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47450e = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
