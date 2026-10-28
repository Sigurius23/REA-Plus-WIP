package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.WhoopNewToolbar;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.w1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13548w1 extends AbstractC13543v1 {

    /* JADX INFO: renamed from: j */
    private static final C1191u f47730j = null;

    /* JADX INFO: renamed from: k */
    private static final SparseIntArray f47731k;

    /* JADX INFO: renamed from: h */
    private final ConstraintLayout f47732h;

    /* JADX INFO: renamed from: i */
    private long f47733i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47731k = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165236Z5, 1);
        sparseIntArray.put(AbstractC38499a0.f165228Y5, 2);
        sparseIntArray.put(AbstractC38499a0.f165317i6, 3);
        sparseIntArray.put(AbstractC38499a0.f165308h6, 4);
        sparseIntArray.put(AbstractC38499a0.f165188T5, 5);
        sparseIntArray.put(AbstractC38499a0.f165387q4, 6);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 7);
    }

    public C13548w1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 8, f47730j, f47731k));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47733i = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47733i != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47733i = 1L;
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

    private C13548w1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[6], (RecyclerView) objArr[5], (FrameLayout) objArr[2], (WhoopNewToolbar) objArr[1], (ImageView) objArr[4], (EditText) objArr[3], (ThrobberView) objArr[7]);
        this.f47733i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47732h = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
