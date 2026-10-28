package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.w0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13547w0 extends AbstractC13542v0 {

    /* JADX INFO: renamed from: f */
    private static final C1191u f47727f = null;

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f47728g;

    /* JADX INFO: renamed from: e */
    private long f47729e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47728g = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165303h1, 1);
        sparseIntArray.put(AbstractC38499a0.f165393r1, 2);
        sparseIntArray.put(AbstractC38499a0.f165321j1, 3);
    }

    public C13547w0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47727f, f47728g));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47729e = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47729e != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47729e = 1L;
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

    private C13547w0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (CircleImageView) objArr[1], (Spinner) objArr[3], (TextView) objArr[2], (ConstraintLayout) objArr[0]);
        this.f47729e = -1L;
        this.f47709d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
