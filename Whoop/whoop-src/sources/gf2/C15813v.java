package gf2;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.DotProgressIndicator;
import com.whoop.p069ui.views.ColoredImageView;
import qe2.AbstractC30312e;

/* JADX INFO: renamed from: gf2.v */
/* JADX INFO: loaded from: classes10.dex */
public class C15813v extends AbstractC15812u {

    /* JADX INFO: renamed from: k */
    private static final C1191u f59702k = null;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f59703l;

    /* JADX INFO: renamed from: j */
    private long f59704j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f59703l = sparseIntArray;
        sparseIntArray.put(AbstractC30312e.f124094M1, 1);
        sparseIntArray.put(AbstractC30312e.f124097N1, 2);
        sparseIntArray.put(AbstractC30312e.f124091L1, 3);
        sparseIntArray.put(AbstractC30312e.f124088K1, 4);
        sparseIntArray.put(AbstractC30312e.f124056A, 5);
        sparseIntArray.put(AbstractC30312e.f124210z, 6);
        sparseIntArray.put(AbstractC30312e.f124065D, 7);
        sparseIntArray.put(AbstractC30312e.f124085J1, 8);
    }

    public C15813v(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f59702k, f59703l));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f59704j = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f59704j != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f59704j = 1L;
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

    private C15813v(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (View) objArr[6], (ImageView) objArr[5], (DotProgressIndicator) objArr[7], (FrameLayout) objArr[0], (ColoredImageView) objArr[8], (TextView) objArr[4], (TextView) objArr[3], (ConstraintLayout) objArr[1], (TextView) objArr[2]);
        this.f59704j = -1L;
        this.f59696d.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
