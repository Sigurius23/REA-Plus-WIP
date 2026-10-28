package eq0;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.viewpager.widget.ViewPager;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: eq0.p2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13514p2 extends AbstractC13509o2 {

    /* JADX INFO: renamed from: e */
    private static final C1191u f47536e;

    /* JADX INFO: renamed from: f */
    private static final SparseIntArray f47537f;

    /* JADX INFO: renamed from: c */
    private final ConstraintLayout f47538c;

    /* JADX INFO: renamed from: d */
    private long f47539d;

    static {
        C1191u c1191u = new C1191u(3);
        f47536e = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC38501b0.f165516f0}, new String[]{"layout_team_pick_image"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47537f = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165441w4, 2);
    }

    public C13514p2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 3, f47536e, f47537f));
    }

    /* JADX INFO: renamed from: c */
    private boolean m38235c(AbstractC13499m2 abstractC13499m2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47539d |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        long j7;
        synchronized (this) {
            j7 = this.f47539d;
            this.f47539d = 0L;
        }
        if ((j7 & 2) != 0) {
            this.f47513b.mo38214c(getRoot().getResources().getString(AbstractC38505d0.f165625U1));
        }
        AbstractC1168a0.executeBindingsOn(this.f47513b);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47539d != 0) {
                    return true;
                }
                return this.f47513b.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47539d = 2L;
        }
        this.f47513b.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m38235c((AbstractC13499m2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47513b.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13514p2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (ViewPager) objArr[2], (AbstractC13499m2) objArr[1]);
        this.f47539d = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47538c = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.f47513b);
        setRootTag(view);
        invalidateAll();
    }
}
