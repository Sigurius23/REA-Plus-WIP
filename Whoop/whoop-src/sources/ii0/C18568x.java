package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.airbnb.lottie.LottieAnimationView;
import com.whoop.p069ui.views.NewStrapSettingsBatteryIndicator;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.x */
/* JADX INFO: loaded from: classes7.dex */
public class C18568x extends AbstractC18567w {

    /* JADX INFO: renamed from: u */
    private static final C1191u f72547u = null;

    /* JADX INFO: renamed from: v */
    private static final SparseIntArray f72548v;

    /* JADX INFO: renamed from: s */
    private final ConstraintLayout f72549s;

    /* JADX INFO: renamed from: t */
    private long f72550t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72548v = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66618M4, 1);
        sparseIntArray.put(AbstractC17307e.f66822r5, 2);
        sparseIntArray.put(AbstractC17307e.f66815q5, 3);
        sparseIntArray.put(AbstractC17307e.f66874z1, 4);
        sparseIntArray.put(AbstractC17307e.f66576F4, 5);
        sparseIntArray.put(AbstractC17307e.f66582G4, 6);
        sparseIntArray.put(AbstractC17307e.f66727e1, 7);
        sparseIntArray.put(AbstractC17307e.f66586H2, 8);
        sparseIntArray.put(AbstractC17307e.f66819r2, 9);
        sparseIntArray.put(AbstractC17307e.f66630O4, 10);
        sparseIntArray.put(AbstractC17307e.f66624N4, 11);
        sparseIntArray.put(AbstractC17307e.f66648R4, 12);
        sparseIntArray.put(AbstractC17307e.f66636P4, 13);
        sparseIntArray.put(AbstractC17307e.f66642Q4, 14);
        sparseIntArray.put(AbstractC17307e.f66748h1, 15);
        sparseIntArray.put(AbstractC17307e.f66855w3, 16);
        sparseIntArray.put(AbstractC17307e.f66848v3, 17);
        sparseIntArray.put(AbstractC17307e.f66862x3, 18);
    }

    public C18568x(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 19, f72547u, f72548v));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72550t = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72550t != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72550t = 1L;
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

    private C18568x(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ConstraintLayout) objArr[7], (LinearLayout) objArr[15], (Group) objArr[4], (Guideline) objArr[9], (ConstraintLayout) objArr[8], (ImageView) objArr[17], (ConstraintLayout) objArr[16], (TextView) objArr[18], (LottieAnimationView) objArr[5], (NewStrapSettingsBatteryIndicator) objArr[6], (ImageView) objArr[1], (ImageView) objArr[11], (ImageView) objArr[10], (TextView) objArr[13], (SwitchCompat) objArr[14], (TextView) objArr[12], (TextView) objArr[3], (TextView) objArr[2]);
        this.f72550t = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72549s = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
