package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.f3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13465f3 extends AbstractC13460e3 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47285e = null;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47286f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47287c;

    /* JADX INFO: renamed from: d */
    private long f47288d;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47286f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165443w6, 1);
        sparseIntArray.put(AbstractC38499a0.f165461y6, 2);
    }

    public C13465f3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47285e, f47286f));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47288d = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47288d != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47288d = 1L;
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

    private C13465f3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (CircleImageView) objArr[1], (TextView) objArr[2]);
        this.f47288d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47287c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
