package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.k1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13488k1 extends AbstractC13483j1 {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47410i;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47411j;

    /* JADX INFO: renamed from: g */
    private final ConstraintLayout f47412g;

    /* JADX INFO: renamed from: h */
    private long f47413h;

    static {
        C1191u c1191u = new C1191u(7);
        f47410i = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC38501b0.f165514e0}, new String[]{"layout_select_team_empty"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47411j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165389q6, 2);
        sparseIntArray.put(AbstractC38499a0.f165029B6, 3);
        sparseIntArray.put(AbstractC38499a0.f165452x6, 4);
        sparseIntArray.put(AbstractC38499a0.f165470z6, 5);
        sparseIntArray.put(AbstractC38499a0.f165020A6, 6);
    }

    public C13488k1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 7, f47410i, f47411j));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38206e(AbstractC13489k2 abstractC13489k2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47413h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47413h = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47384b);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47413h != 0) {
                    return true;
                }
                return this.f47384b.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47413h = 2L;
        }
        this.f47384b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38206e((AbstractC13489k2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47384b.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13488k1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (ImageView) objArr[2], (AbstractC13489k2) objArr[1], (TextView) objArr[4], (RecyclerView) objArr[5], (ThrobberView) objArr[6], (TextView) objArr[3]);
        this.f47413h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47412g = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f47384b);
        setRootTag(view);
        invalidateAll();
    }
}
