package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.e0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13457e0 extends AbstractC13452d0 {

    /* JADX INFO: renamed from: o */
    private static final C1191u f47219o = null;

    /* JADX INFO: renamed from: p */
    private static final SparseIntArray f47220p;

    /* JADX INFO: renamed from: m */
    private final FrameLayout f47221m;

    /* JADX INFO: renamed from: n */
    private long f47222n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47220p = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165420u1, 1);
        sparseIntArray.put(AbstractC38499a0.f165438w1, 2);
        sparseIntArray.put(AbstractC38499a0.f165016A2, 3);
        sparseIntArray.put(AbstractC38499a0.f165402s1, 4);
        sparseIntArray.put(AbstractC38499a0.f165353m6, 5);
        sparseIntArray.put(AbstractC38499a0.f165465z1, 6);
        sparseIntArray.put(AbstractC38499a0.f165429v1, 7);
        sparseIntArray.put(AbstractC38499a0.f165447x1, 8);
        sparseIntArray.put(AbstractC38499a0.f165025B2, 9);
        sparseIntArray.put(AbstractC38499a0.f165411t1, 10);
        sparseIntArray.put(AbstractC38499a0.f165362n6, 11);
        sparseIntArray.put(AbstractC38499a0.f165015A1, 12);
    }

    public C13457e0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 13, f47219o, f47220p));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47222n = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47222n != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47222n = 1L;
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

    private C13457e0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (TextView) objArr[4], (ImageView) objArr[10], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[7], (TextView) objArr[2], (ImageView) objArr[8], (TextView) objArr[6], (ImageView) objArr[12], (View) objArr[3], (View) objArr[9], (View) objArr[5], (View) objArr[11]);
        this.f47222n = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f47221m = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
