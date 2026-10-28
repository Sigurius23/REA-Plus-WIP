package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import com.airbnb.lottie.LottieAnimationView;
import hi0.AbstractC17307e;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.b */
/* JADX INFO: loaded from: classes7.dex */
public class C18535b extends AbstractC18533a {

    /* JADX INFO: renamed from: k */
    private static final C1191u f72210k;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f72211l;

    /* JADX INFO: renamed from: i */
    private final ConstraintLayout f72212i;

    /* JADX INFO: renamed from: j */
    private long f72213j;

    static {
        C1191u c1191u = new C1191u(9);
        f72210k = c1191u;
        c1191u.m3737a(0, new int[]{1, 2, 3, 4}, new int[]{AbstractC17308f.f66899u, AbstractC17308f.f66898t, AbstractC17308f.f66896r, AbstractC17308f.f66897s}, new String[]{"view_enable_location_services", "view_enable_bluetooth_services", "view_allow_location_permissions", "view_choose_gen4_bluetooth_device"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72211l = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66564D4, 5);
        sparseIntArray.put(AbstractC17307e.f66596J0, 6);
        sparseIntArray.put(AbstractC17307e.f66633P1, 7);
        sparseIntArray.put(AbstractC17307e.f66833t2, 8);
    }

    public C18535b(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f72210k, f72211l));
    }

    /* JADX INFO: renamed from: e */
    private boolean m53751e(AbstractC18534a0 abstractC18534a0, int i13) {
        if (i13 != 0) {
            return false;
        }
        synchronized (this) {
            this.f72213j |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m53752f(AbstractC18538c0 abstractC18538c0, int i13) {
        if (i13 != 0) {
            return false;
        }
        synchronized (this) {
            this.f72213j |= 4;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m53753g(AbstractC18542e0 abstractC18542e0, int i13) {
        if (i13 != 0) {
            return false;
        }
        synchronized (this) {
            this.f72213j |= 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private boolean m53754h(AbstractC18546g0 abstractC18546g0, int i13) {
        if (i13 != 0) {
            return false;
        }
        synchronized (this) {
            this.f72213j |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f72213j = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f72205e);
        AbstractC1168a0.executeBindingsOn(this.f72204d);
        AbstractC1168a0.executeBindingsOn(this.f72201a);
        AbstractC1168a0.executeBindingsOn(this.f72203c);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f72213j != 0) {
                    return true;
                }
                return this.f72205e.hasPendingBindings() || this.f72204d.hasPendingBindings() || this.f72201a.hasPendingBindings() || this.f72203c.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72213j = 16L;
        }
        this.f72205e.invalidateAll();
        this.f72204d.invalidateAll();
        this.f72201a.invalidateAll();
        this.f72203c.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m53751e((AbstractC18534a0) obj, i14);
        }
        if (i13 == 1) {
            return m53753g((AbstractC18542e0) obj, i14);
        }
        if (i13 == 2) {
            return m53752f((AbstractC18538c0) obj, i14);
        }
        if (i13 != 3) {
            return false;
        }
        return m53754h((AbstractC18546g0) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f72205e.setLifecycleOwner(interfaceC1585g0);
        this.f72204d.setLifecycleOwner(interfaceC1585g0);
        this.f72201a.setLifecycleOwner(interfaceC1585g0);
        this.f72203c.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C18535b(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 4, (AbstractC18534a0) objArr[3], (ImageView) objArr[6], (AbstractC18538c0) objArr[4], (AbstractC18542e0) objArr[2], (AbstractC18546g0) objArr[1], (View) objArr[7], (Guideline) objArr[8], (LottieAnimationView) objArr[5]);
        this.f72213j = -1L;
        setContainedBinding(this.f72201a);
        setContainedBinding(this.f72203c);
        setContainedBinding(this.f72204d);
        setContainedBinding(this.f72205e);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72212i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
