package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.m0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13497m0 extends AbstractC13492l0 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47459e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47460f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47461c;

    /* JADX INFO: renamed from: d */
    private long f47462d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47460f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165087I1, 1);
        sparseIntArray.put(AbstractC38499a0.f165096J1, 2);
    }

    public C13497m0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47459e, f47460f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47462d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47462d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47462d = 1L;
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

    private C13497m0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1], (TextView) objArr[2]);
        this.f47462d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47461c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
