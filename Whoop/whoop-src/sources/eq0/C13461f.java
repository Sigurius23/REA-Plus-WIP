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

/* JADX INFO: renamed from: eq0.f */
/* JADX INFO: loaded from: classes7.dex */
public class C13461f extends AbstractC13456e {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47233i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47234j;

    /* JADX INFO: renamed from: g */
    private final ConstraintLayout f47235g;

    /* JADX INFO: renamed from: h */
    private long f47236h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47234j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165324j4, 1);
        sparseIntArray.put(AbstractC38499a0.f165406s5, 2);
        sparseIntArray.put(AbstractC38499a0.f165397r5, 3);
        sparseIntArray.put(AbstractC38499a0.f165076H, 4);
        sparseIntArray.put(AbstractC38499a0.f165262c5, 5);
        sparseIntArray.put(AbstractC38499a0.f165176S1, 6);
    }

    public C13461f(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 7, f47233i, f47234j));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47236h = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47236h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47236h = 1L;
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

    private C13461f(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[4], (TextView) objArr[6], (TextView) objArr[1], (StrokedPillButton) objArr[5], (ImageView) objArr[3], (TextView) objArr[2]);
        this.f47236h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47235g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
