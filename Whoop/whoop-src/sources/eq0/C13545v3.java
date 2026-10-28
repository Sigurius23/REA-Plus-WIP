package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.v3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13545v3 extends AbstractC13540u3 {

    /* JADX INFO: renamed from: d */
    private static final C1191u f47720d = null;

    /* JADX INFO: renamed from: e */
    private static final SparseIntArray f47721e;

    /* JADX INFO: renamed from: b */
    private final ConstraintLayout f47722b;

    /* JADX INFO: renamed from: c */
    private long f47723c;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47721e = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165138N7, 1);
    }

    public C13545v3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 2, f47720d, f47721e));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47723c = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47723c != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47723c = 1L;
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

    private C13545v3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1]);
        this.f47723c = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47722b = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
