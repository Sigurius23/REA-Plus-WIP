package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import hi0.AbstractC17307e;
import io.github.florent37.shapeofview.shapes.BubbleView;

/* JADX INFO: renamed from: ii0.l0 */
/* JADX INFO: loaded from: classes7.dex */
public class C18556l0 extends AbstractC18554k0 {

    /* JADX INFO: renamed from: n */
    private static final C1191u f72334n = null;

    /* JADX INFO: renamed from: o */
    private static final SparseIntArray f72335o;

    /* JADX INFO: renamed from: l */
    private final ConstraintLayout f72336l;

    /* JADX INFO: renamed from: m */
    private long f72337m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72335o = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66626O0, 1);
        sparseIntArray.put(AbstractC17307e.f66674W0, 2);
        sparseIntArray.put(AbstractC17307e.f66638Q0, 3);
        sparseIntArray.put(AbstractC17307e.f66680X0, 4);
        sparseIntArray.put(AbstractC17307e.f66662U0, 5);
        sparseIntArray.put(AbstractC17307e.f66668V0, 6);
        sparseIntArray.put(AbstractC17307e.f66632P0, 7);
        sparseIntArray.put(AbstractC17307e.f66656T0, 8);
        sparseIntArray.put(AbstractC17307e.f66686Y0, 9);
        sparseIntArray.put(AbstractC17307e.f66644R0, 10);
        sparseIntArray.put(AbstractC17307e.f66650S0, 11);
    }

    public C18556l0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 12, f72334n, f72335o));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72337m = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72337m != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72337m = 1L;
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

    private C18556l0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (Guideline) objArr[1], (BubbleView) objArr[7], (ImageView) objArr[3], (TextView) objArr[10], (TextView) objArr[11], (ProgressBar) objArr[8], (ComposeView) objArr[5], (ImageView) objArr[6], (FrameLayout) objArr[2], (ImageView) objArr[4], (TextView) objArr[9]);
        this.f72337m = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72336l = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
