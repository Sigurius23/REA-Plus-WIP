package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.views.ColoredImageView;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.n */
/* JADX INFO: loaded from: classes7.dex */
public class C18558n extends AbstractC18557m {

    /* JADX INFO: renamed from: m */
    private static final C1191u f72349m = null;

    /* JADX INFO: renamed from: n */
    private static final SparseIntArray f72350n;

    /* JADX INFO: renamed from: l */
    private long f72351l;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72350n = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66590I0, 1);
        sparseIntArray.put(AbstractC17307e.f66731e5, 2);
        sparseIntArray.put(AbstractC17307e.f66847v2, 3);
        sparseIntArray.put(AbstractC17307e.f66840u2, 4);
        sparseIntArray.put(AbstractC17307e.f66762j1, 5);
        sparseIntArray.put(AbstractC17307e.f66755i1, 6);
        sparseIntArray.put(AbstractC17307e.f66634P2, 7);
        sparseIntArray.put(AbstractC17307e.f66628O2, 8);
        sparseIntArray.put(AbstractC17307e.f66717c5, 9);
        sparseIntArray.put(AbstractC17307e.f66710b5, 10);
    }

    public C18558n(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 11, f72349m, f72350n));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72351l = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72351l != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72351l = 1L;
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

    private C18558n(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1], (ColoredImageView) objArr[6], (ConstraintLayout) objArr[5], (ColoredImageView) objArr[4], (ConstraintLayout) objArr[3], (ColoredImageView) objArr[8], (ConstraintLayout) objArr[7], (ScrollView) objArr[0], (ColoredImageView) objArr[10], (ConstraintLayout) objArr[9], (TextView) objArr[2]);
        this.f72351l = -1L;
        this.f72345h.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
