package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1172c0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.fragment.app.FragmentContainerView;
import com.whoop.p069ui.LockableNestedScrollView;
import com.whoop.p069ui.ProgressDial;
import com.whoop.p069ui.WhoopSwitch;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.p069ui.views.ColoredImageView;
import com.whoop.p069ui.views.LiveHeartRateView;
import com.whoop.realtime.presentation.views.DayStrainView;
import com.whoop.realtime.presentation.views.StrainCoachGoalPicker;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.b */
/* JADX INFO: loaded from: classes10.dex */
public class C25082b extends AbstractC25081a {

    /* JADX INFO: renamed from: P */
    private static final C1191u f98275P = null;

    /* JADX INFO: renamed from: Q */
    private static final SparseIntArray f98276Q;

    /* JADX INFO: renamed from: O */
    private long f98277O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98276Q = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86284E, 1);
        sparseIntArray.put(AbstractC22208d.f86316U, 2);
        sparseIntArray.put(AbstractC22208d.f86356j0, 3);
        sparseIntArray.put(AbstractC22208d.f86310R, 4);
        sparseIntArray.put(AbstractC22208d.f86314T, 5);
        sparseIntArray.put(AbstractC22208d.f86312S, 6);
        sparseIntArray.put(AbstractC22208d.f86332b0, 7);
        sparseIntArray.put(AbstractC22208d.f86366o0, 8);
        sparseIntArray.put(AbstractC22208d.f86297K0, 9);
        sparseIntArray.put(AbstractC22208d.f86299L0, 10);
        sparseIntArray.put(AbstractC22208d.f86353i0, 11);
        sparseIntArray.put(AbstractC22208d.f86382w0, 12);
        sparseIntArray.put(AbstractC22208d.f86384x0, 13);
        sparseIntArray.put(AbstractC22208d.f86347g0, 14);
        sparseIntArray.put(AbstractC22208d.f86287F0, 15);
        sparseIntArray.put(AbstractC22208d.f86370q0, 16);
        sparseIntArray.put(AbstractC22208d.f86282D, 17);
        sparseIntArray.put(AbstractC22208d.f86276A, 18);
        sparseIntArray.put(AbstractC22208d.f86308Q, 19);
        sparseIntArray.put(AbstractC22208d.f86303N0, 20);
        sparseIntArray.put(AbstractC22208d.f86301M0, 21);
        sparseIntArray.put(AbstractC22208d.f86379v, 22);
        sparseIntArray.put(AbstractC22208d.f86293I0, 23);
        sparseIntArray.put(AbstractC22208d.f86378u0, 24);
        sparseIntArray.put(AbstractC22208d.f86386y0, 25);
        sparseIntArray.put(AbstractC22208d.f86372r0, 26);
        sparseIntArray.put(AbstractC22208d.f86286F, 27);
        sparseIntArray.put(AbstractC22208d.f86278B, 28);
        sparseIntArray.put(AbstractC22208d.f86289G0, 29);
        sparseIntArray.put(AbstractC22208d.f86280C, 30);
        sparseIntArray.put(AbstractC22208d.f86383x, 31);
        sparseIntArray.put(AbstractC22208d.f86364n0, 32);
        sparseIntArray.put(AbstractC22208d.f86334c, 33);
        sparseIntArray.put(AbstractC22208d.f86311R0, 34);
        sparseIntArray.put(AbstractC22208d.f86387z, 35);
        sparseIntArray.put(AbstractC22208d.f86328a, 36);
        sparseIntArray.put(AbstractC22208d.f86331b, 37);
        sparseIntArray.put(AbstractC22208d.f86337d, 38);
        sparseIntArray.put(AbstractC22208d.f86309Q0, 39);
    }

    public C25082b(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 40, f98275P, f98276Q));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f98277O = 0L;
        }
        AbstractC1168a0 abstractC1168a0 = this.f98264p.f5326b;
        if (abstractC1168a0 != null) {
            AbstractC1168a0.executeBindingsOn(abstractC1168a0);
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98277O != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98277O = 1L;
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

    private C25082b(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[36], (ColoredImageView) objArr[37], (FragmentContainerView) objArr[33], (TextView) objArr[22], (TextView) objArr[38], (LinearLayout) objArr[31], (ImageView) objArr[35], (LinearLayout) objArr[18], (FrameLayout) objArr[28], (TextView) objArr[30], (LockableNestedScrollView) objArr[17], (CoordinatorLayout) objArr[1], (DayStrainView) objArr[27], (StrainCoachGoalPicker) objArr[19], (ConstraintLayout) objArr[2], new C1172c0((ViewStub) objArr[4]), (WhoopSwitch) objArr[6], (LinearLayout) objArr[5], (LiveHeartRateView) objArr[7], (ImageButton) objArr[14], (LinearLayout) objArr[11], (ImageView) objArr[3], (CoordinatorLayout) objArr[0], (StrokedPillButton) objArr[32], (View) objArr[8], (LinearLayout) objArr[9], (ImageView) objArr[10], (WhoopSwitch) objArr[16], (TextView) objArr[26], (TextView) objArr[24], (Guideline) objArr[21], (Guideline) objArr[20], (ProgressDial) objArr[12], (TextView) objArr[13], (ImageButton) objArr[25], (TextView) objArr[15], (TextView) objArr[29], (TextView) objArr[23], (ColoredImageView) objArr[39], (LinearLayout) objArr[34]);
        this.f98277O = -1L;
        this.f98264p.f5329e = this;
        this.f98271w.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
