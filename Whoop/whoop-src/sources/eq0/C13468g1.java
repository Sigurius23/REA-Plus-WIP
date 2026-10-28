package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.p069ui.WhoopZoomageView;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.views.ColoredImageView;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: eq0.g1 */
/* JADX INFO: loaded from: classes7.dex */
public class C13468g1 extends AbstractC13463f1 {

    /* JADX INFO: renamed from: O */
    private static final C1191u f47310O;

    /* JADX INFO: renamed from: P */
    private static final SparseIntArray f47311P;

    /* JADX INFO: renamed from: M */
    private final ConstraintLayout f47312M;

    /* JADX INFO: renamed from: N */
    private long f47313N;

    static {
        C1191u c1191u = new C1191u(39);
        f47310O = c1191u;
        c1191u.m3737a(0, new int[]{1, 2}, new int[]{AbstractC38501b0.f165516f0, AbstractC38501b0.f165518g0}, new String[]{"layout_team_pick_image", "layout_team_pick_logo"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47311P = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165230Z, 3);
        sparseIntArray.put(AbstractC38499a0.f165198V, 4);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 5);
        sparseIntArray.put(AbstractC38499a0.f165054E4, 6);
        sparseIntArray.put(AbstractC38499a0.f165271d5, 7);
        sparseIntArray.put(AbstractC38499a0.f165045D4, 8);
        sparseIntArray.put(AbstractC38499a0.f165280e5, 9);
        sparseIntArray.put(AbstractC38499a0.f165214X, 10);
        sparseIntArray.put(AbstractC38499a0.f165257c0, 11);
        sparseIntArray.put(AbstractC38499a0.f165266d0, 12);
        sparseIntArray.put(AbstractC38499a0.f165275e0, 13);
        sparseIntArray.put(AbstractC38499a0.f165206W, 14);
        sparseIntArray.put(AbstractC38499a0.f165423u4, 15);
        sparseIntArray.put(AbstractC38499a0.f165405s4, 16);
        sparseIntArray.put(AbstractC38499a0.f165450x4, 17);
        sparseIntArray.put(AbstractC38499a0.f165459y4, 18);
        sparseIntArray.put(AbstractC38499a0.f165468z4, 19);
        sparseIntArray.put(AbstractC38499a0.f165414t4, 20);
        sparseIntArray.put(AbstractC38499a0.f165027B4, 21);
        sparseIntArray.put(AbstractC38499a0.f165036C4, 22);
        sparseIntArray.put(AbstractC38499a0.f165200V1, 23);
        sparseIntArray.put(AbstractC38499a0.f165241a2, 24);
        sparseIntArray.put(AbstractC38499a0.f165250b2, 25);
        sparseIntArray.put(AbstractC38499a0.f165216X1, 26);
        sparseIntArray.put(AbstractC38499a0.f165432v4, 27);
        sparseIntArray.put(AbstractC38499a0.f165268d2, 28);
        sparseIntArray.put(AbstractC38499a0.f165286f2, 29);
        sparseIntArray.put(AbstractC38499a0.f165224Y1, 30);
        sparseIntArray.put(AbstractC38499a0.f165291f7, 31);
        sparseIntArray.put(AbstractC38499a0.f165208W1, 32);
        sparseIntArray.put(AbstractC38499a0.f165273d7, 33);
        sparseIntArray.put(AbstractC38499a0.f165282e7, 34);
        sparseIntArray.put(AbstractC38499a0.f165220X5, 35);
        sparseIntArray.put(AbstractC38499a0.f165444w7, 36);
        sparseIntArray.put(AbstractC38499a0.f165159Q1, 37);
        sparseIntArray.put(AbstractC38499a0.f165435v7, 38);
    }

    public C13468g1(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 39, f47310O, f47311P));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38191e(AbstractC13499m2 abstractC13499m2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47313N |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38192f(AbstractC13509o2 abstractC13509o2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47313N |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        long j7;
        synchronized (this) {
            j7 = this.f47313N;
            this.f47313N = 0L;
        }
        if ((j7 & 4) != 0) {
            this.f47265h.mo38214c(getRoot().getResources().getString(AbstractC38505d0.f165622T1));
        }
        AbstractC1168a0.executeBindingsOn(this.f47265h);
        AbstractC1168a0.executeBindingsOn(this.f47282y);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47313N != 0) {
                    return true;
                }
                return this.f47265h.hasPendingBindings() || this.f47282y.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47313N = 4L;
        }
        this.f47265h.invalidateAll();
        this.f47282y.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38191e((AbstractC13499m2) obj, i14);
        }
        if (i13 != 1) {
            return false;
        }
        return m38192f((AbstractC13509o2) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47265h.setLifecycleOwner(interfaceC1585g0);
        this.f47282y.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13468g1(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 2, (WhoopZoomageView) objArr[4], (StrokedPillButton) objArr[14], (Group) objArr[10], (Flow) objArr[11], (ImageView) objArr[12], (TextView) objArr[13], (ImageView) objArr[3], (AbstractC13499m2) objArr[1], (StrokedPillButton) objArr[37], (Flow) objArr[23], (ImageView) objArr[24], (TextView) objArr[25], (EditText) objArr[32], (Group) objArr[26], (ImageView) objArr[28], (EditText) objArr[30], (TextView) objArr[29], (WhoopZoomageView) objArr[16], (StrokedPillButton) objArr[20], (Group) objArr[15], (Flow) objArr[17], (ImageView) objArr[18], (TextView) objArr[19], (CircleImageView) objArr[27], (AbstractC13509o2) objArr[2], (ConstraintLayout) objArr[22], (NestedScrollView) objArr[21], (ColoredImageView) objArr[8], (WhoopNewToolbar) objArr[6], (Group) objArr[7], (TextView) objArr[9], (StrokedPillButton) objArr[35], (TextView) objArr[33], (SwitchCompat) objArr[34], (TextView) objArr[31], (ThrobberView) objArr[5], (TextView) objArr[38], (StrokedPillButton) objArr[36]);
        this.f47313N = -1L;
        setContainedBinding(this.f47265h);
        setContainedBinding(this.f47282y);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47312M = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
