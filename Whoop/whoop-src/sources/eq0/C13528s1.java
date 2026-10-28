package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.s1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13528s1 extends AbstractC13523r1 {

    /* JADX INFO: renamed from: d */
    private static final C1191u f47631d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f47632e;

    /* JADX INFO: renamed from: b */
    private final ConstraintLayout f47633b;

    /* JADX INFO: renamed from: c */
    private long f47634c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47632e = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165232Z1, 1);
    }

    public C13528s1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 2, f47631d, f47632e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47634c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47634c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47634c = 1L;
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

    private C13528s1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (EditText) objArr[1]);
        this.f47634c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47633b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
