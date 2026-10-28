package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;
import xp0.AbstractC38501b0;

/* JADX INFO: renamed from: eq0.s0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13527s0 extends AbstractC13522r0 {

    /* JADX INFO: renamed from: Q */
    private static final C1191u f47627Q;

    /* JADX INFO: renamed from: R */
    private static final SparseIntArray f47628R;

    /* JADX INFO: renamed from: O */
    private final FrameLayout f47629O;

    /* JADX INFO: renamed from: P */
    private long f47630P;

    static {
        C1191u c1191u = new C1191u(41);
        f47627Q = c1191u;
        c1191u.m3737a(1, new int[]{8}, new int[]{AbstractC38501b0.f165541s}, new String[]{"community_landing_rank_settings"});
        c1191u.m3737a(2, new int[]{4}, new int[]{AbstractC38501b0.f165484F}, new String[]{"fragment_community_landing_toolbarv1"});
        c1191u.m3737a(3, new int[]{5, 6, 7}, new int[]{AbstractC38501b0.f165554y0, AbstractC38501b0.f165552x0, AbstractC38501b0.f165532n0}, new String[]{"view_create_team_and_invite_code_prompt_cardv1", "view_create_team_and_invite_code_button_layoutv1", "member_story_layout"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47628R = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165175S0, 9);
        sparseIntArray.put(AbstractC38499a0.f165183T0, 10);
        sparseIntArray.put(AbstractC38499a0.f165325j5, 11);
        sparseIntArray.put(AbstractC38499a0.f165316i5, 12);
        sparseIntArray.put(AbstractC38499a0.f165307h5, 13);
        sparseIntArray.put(AbstractC38499a0.f165267d1, 14);
        sparseIntArray.put(AbstractC38499a0.f165158Q0, 15);
        sparseIntArray.put(AbstractC38499a0.f165430v2, 16);
        sparseIntArray.put(AbstractC38499a0.f165295g2, 17);
        sparseIntArray.put(AbstractC38499a0.f165028B5, 18);
        sparseIntArray.put(AbstractC38499a0.f165172R5, 19);
        sparseIntArray.put(AbstractC38499a0.f165421u2, 20);
        sparseIntArray.put(AbstractC38499a0.f165041D0, 21);
        sparseIntArray.put(AbstractC38499a0.f165412t2, 22);
        sparseIntArray.put(AbstractC38499a0.f165466z2, 23);
        sparseIntArray.put(AbstractC38499a0.f165457y2, 24);
        sparseIntArray.put(AbstractC38499a0.f165451x5, 25);
        sparseIntArray.put(AbstractC38499a0.f165130N, 26);
        sparseIntArray.put(AbstractC38499a0.f165121M, 27);
        sparseIntArray.put(AbstractC38499a0.f165469z5, 28);
        sparseIntArray.put(AbstractC38499a0.f165460y5, 29);
        sparseIntArray.put(AbstractC38499a0.f165165Q7, 30);
        sparseIntArray.put(AbstractC38499a0.f165037C5, 31);
        sparseIntArray.put(AbstractC38499a0.f165046D5, 32);
        sparseIntArray.put(AbstractC38499a0.f165102J7, 33);
        sparseIntArray.put(AbstractC38499a0.f165309h7, 34);
        sparseIntArray.put(AbstractC38499a0.f165300g7, 35);
        sparseIntArray.put(AbstractC38499a0.f165285f1, 36);
        sparseIntArray.put(AbstractC38499a0.f165024B1, 37);
        sparseIntArray.put(AbstractC38499a0.f165051E1, 38);
        sparseIntArray.put(AbstractC38499a0.f165403s2, 39);
        sparseIntArray.put(AbstractC38499a0.f165394r2, 40);
    }

    public C13527s0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 41, f47627Q, f47628R));
    }

    /* JADX INFO: renamed from: e */
    private boolean m38245e(AbstractC13510o3 abstractC13510o3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47630P |= 8;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m38246f(AbstractC13542v0 abstractC13542v0, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47630P |= 4;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m38247g(AbstractC13558z abstractC13558z, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47630P |= 1;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    private boolean m38248h(AbstractC13500m3 abstractC13500m3, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47630P |= 16;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    private boolean m38249i(AbstractC13549w2 abstractC13549w2, int i13) {
        if (i13 != AbstractC38498a.f165007a) {
            return false;
        }
        synchronized (this) {
            this.f47630P |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f47630P = 0L;
        }
        AbstractC1168a0.executeBindingsOn(this.f47594f);
        AbstractC1168a0.executeBindingsOn(this.f47591c);
        AbstractC1168a0.executeBindingsOn(this.f47604p);
        AbstractC1168a0.executeBindingsOn(this.f47614z);
        AbstractC1168a0.executeBindingsOn(this.f47599k);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f47630P != 0) {
                    return true;
                }
                return this.f47594f.hasPendingBindings() || this.f47591c.hasPendingBindings() || this.f47604p.hasPendingBindings() || this.f47614z.hasPendingBindings() || this.f47599k.hasPendingBindings();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47630P = 32L;
        }
        this.f47594f.invalidateAll();
        this.f47591c.invalidateAll();
        this.f47604p.invalidateAll();
        this.f47614z.invalidateAll();
        this.f47599k.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        if (i13 == 0) {
            return m38247g((AbstractC13558z) obj, i14);
        }
        if (i13 == 1) {
            return m38249i((AbstractC13549w2) obj, i14);
        }
        if (i13 == 2) {
            return m38246f((AbstractC13542v0) obj, i14);
        }
        if (i13 == 3) {
            return m38245e((AbstractC13510o3) obj, i14);
        }
        if (i13 != 4) {
            return false;
        }
        return m38248h((AbstractC13500m3) obj, i14);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void setLifecycleOwner(InterfaceC1585g0 interfaceC1585g0) {
        super.setLifecycleOwner(interfaceC1585g0);
        this.f47594f.setLifecycleOwner(interfaceC1585g0);
        this.f47591c.setLifecycleOwner(interfaceC1585g0);
        this.f47604p.setLifecycleOwner(interfaceC1585g0);
        this.f47614z.setLifecycleOwner(interfaceC1585g0);
        this.f47599k.setLifecycleOwner(interfaceC1585g0);
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) {
        return true;
    }

    private C13527s0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 5, (ImageView) objArr[27], (TextView) objArr[26], (AbstractC13510o3) objArr[5], (LinearLayout) objArr[21], (NestedScrollView) objArr[15], (AbstractC13542v0) objArr[4], (CoordinatorLayout) objArr[1], (ConstraintLayout) objArr[2], (RelativeLayout) objArr[9], (ConstraintLayout) objArr[10], (AbstractC13558z) objArr[8], (ThrobberView) objArr[14], (ThrobberView) objArr[36], (ConstraintLayout) objArr[3], (LinearLayout) objArr[37], (AbstractC13500m3) objArr[6], (TextView) objArr[38], (ComposeView) objArr[17], (TextView) objArr[40], (LinearLayout) objArr[39], (LinearLayout) objArr[22], (LinearLayout) objArr[20], (ComposeView) objArr[16], (NestedScrollView) objArr[23], (RecyclerView) objArr[24], (AbstractC13549w2) objArr[7], (TextView) objArr[13], (TextView) objArr[12], (ImageView) objArr[11], (TextView) objArr[25], (LinearLayout) objArr[28], (RecyclerView) objArr[29], (ComposeView) objArr[18], (TextView) objArr[32], (LinearLayout) objArr[31], (TextView) objArr[19], (RelativeLayout) objArr[34], (RecyclerView) objArr[35], (LinearLayout) objArr[33], (TextView) objArr[30]);
        this.f47630P = -1L;
        setContainedBinding(this.f47591c);
        setContainedBinding(this.f47594f);
        this.f47595g.setTag(null);
        this.f47596h.setTag(null);
        setContainedBinding(this.f47599k);
        this.f47602n.setTag(null);
        setContainedBinding(this.f47604p);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f47629O = frameLayout;
        frameLayout.setTag(null);
        setContainedBinding(this.f47614z);
        setRootTag(view);
        invalidateAll();
    }
}
