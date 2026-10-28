package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.p3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13515p3 extends AbstractC13510o3 {

    /* JADX INFO: renamed from: f */
    private static final C1191u f47540f;

    /* JADX INFO: renamed from: g */
    private static final SparseIntArray f47541g;

    /* JADX INFO: renamed from: e */
    private long f47542e;

    static {
        C1191u c1191u = new C1191u(4);
        f47540f = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC38501b0.f165550w0}, new String[]{"view_create_team_and_invite_code_button_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47541g = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165372o7, 2);
        sparseIntArray.put(AbstractC38499a0.f165381p7, 3);
    }

    public C13515p3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47540f, f47541g));
    }

    /* JADX INFO: renamed from: c */
    private boolean m38236c(AbstractC13490k3 abstractC13490k3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47542e |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47542e = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47514a);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47542e != 0) {
                    return true;
                }
                return this.f47514a.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47542e = 2L;
        }
        this.f47514a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38236c((AbstractC13490k3) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47514a.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13515p3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (AbstractC13490k3) objArr[1], (TextView) objArr[2], (TextView) objArr[3], (ConstraintLayout) objArr[0]);
        this.f47542e = -1L;
        setContainedBinding(this.f47514a);
        this.f47517d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
