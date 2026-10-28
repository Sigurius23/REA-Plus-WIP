package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.c1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13448c1 extends AbstractC13443b1 {

    /* JADX INFO: renamed from: d */
    private static final C1191u f47170d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f47171e;

    /* JADX INFO: renamed from: b */
    private final ConstraintLayout f47172b;

    /* JADX INFO: renamed from: c */
    private long f47173c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47171e = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165260c3, 1);
    }

    public C13448c1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 2, f47170d, f47171e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47173c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47173c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47173c = 1L;
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

    private C13448c1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1]);
        this.f47173c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47172b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
