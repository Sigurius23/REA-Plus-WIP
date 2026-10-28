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

/* JADX INFO: renamed from: eq0.u0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13537u0 extends AbstractC13532t0 {

    /* JADX INFO: renamed from: f */
    private static final C1191u f47676f = null;

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f47677g;

    /* JADX INFO: renamed from: e */
    private long f47678e;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47677g = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165294g1, 1);
        sparseIntArray.put(AbstractC38499a0.f165384q1, 2);
        sparseIntArray.put(AbstractC38499a0.f165312i1, 3);
    }

    public C13537u0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47676f, f47677g));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47678e = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47678e != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47678e = 1L;
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

    private C13537u0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (CircleImageView) objArr[1], (Spinner) objArr[3], (ConstraintLayout) objArr[0], (TextView) objArr[2]);
        this.f47678e = -1L;
        this.f47656c.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
