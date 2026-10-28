package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.whoop.p069ui.WhoopNewToolbar;
import hi0.AbstractC17307e;
import hi0.AbstractC17308f;

/* JADX INFO: renamed from: ii0.v */
/* JADX INFO: loaded from: classes7.dex */
public class C18566v extends AbstractC18565u {

    /* JADX INFO: renamed from: o */
    private static final C1191u f72525o;

    /* JADX INFO: renamed from: p */
    private static final SparseIntArray f72526p;

    /* JADX INFO: renamed from: m */
    private final ConstraintLayout f72527m;

    /* JADX INFO: renamed from: n */
    private long f72528n;

    static {
        C1191u c1191u = new C1191u(13);
        f72525o = c1191u;
        c1191u.m3737a(0, new int[]{1}, new int[]{AbstractC17308f.f66898t}, new String[]{"view_enable_bluetooth_services"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72526p = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66738f5, 2);
        sparseIntArray.put(AbstractC17307e.f66696Z4, 3);
        sparseIntArray.put(AbstractC17307e.f66594I4, 4);
        sparseIntArray.put(AbstractC17307e.f66588H4, 5);
        sparseIntArray.put(AbstractC17307e.f66612L4, 6);
        sparseIntArray.put(AbstractC17307e.f66660T4, 7);
        sparseIntArray.put(AbstractC17307e.f66672V4, 8);
        sparseIntArray.put(AbstractC17307e.f66666U4, 9);
        sparseIntArray.put(AbstractC17307e.f66606K4, 10);
        sparseIntArray.put(AbstractC17307e.f66600J4, 11);
        sparseIntArray.put(AbstractC17307e.f66820r3, 12);
    }

    public C18566v(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 13, f72525o, f72526p));
    }

    /* JADX INFO: renamed from: e */
    private boolean m53779e(AbstractC18542e0 abstractC18542e0, int i13) {
        if (i13 != 0) {
            return false;
        }
        synchronized (this) {
            this.f72528n |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f72528n = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f72513a);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f72528n != 0) {
                    return true;
                }
                return this.f72513a.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72528n = 2L;
        }
        this.f72513a.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 != 0) {
            return false;
        }
        return m53779e((AbstractC18542e0) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f72513a.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C18566v(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 1, (AbstractC18542e0) objArr[1], (ComposeView) objArr[12], (TextView) objArr[5], (TextView) objArr[4], (ViewPager2) objArr[11], (TabLayout) objArr[10], (ImageView) objArr[6], (TextView) objArr[7], (ImageView) objArr[9], (TextView) objArr[8], (ConstraintLayout) objArr[3], (WhoopNewToolbar) objArr[2]);
        this.f72528n = -1L;
        setContainedBinding(this.f72513a);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72527m = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
