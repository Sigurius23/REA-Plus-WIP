package eq0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.p069ui.WhoopNewToolbar;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.i1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13478i1 extends AbstractC13473h1 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47346e;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47347f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47348c;

    /* JADX INFO: renamed from: d */
    private long f47349d;

    static {
        C1191u c1191u = new C1191u(3);
        f47346e = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC38501b0.f165502X}, new String[]{"granular_notification_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47347f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165379p5, 2);
    }

    public C13478i1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47346e, f47347f));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38199e(AbstractC13454d2 abstractC13454d2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47349d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47349d = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47327a);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47349d != 0) {
                    return true;
                }
                return this.f47327a.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47349d = 2L;
        }
        this.f47327a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38199e((AbstractC13454d2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47327a.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13478i1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (AbstractC13454d2) objArr[1], (WhoopNewToolbar) objArr[2]);
        this.f47349d = -1L;
        setContainedBinding(this.f47327a);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47348c = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
