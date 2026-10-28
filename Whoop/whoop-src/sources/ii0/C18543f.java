package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.f */
/* JADX INFO: loaded from: classes7.dex */
public class C18543f extends AbstractC18541e {

    /* JADX INFO: renamed from: l */
    private static final C1191u f72264l = null;

    /* JADX INFO: renamed from: m */
    private static final SparseIntArray f72265m;

    /* JADX INFO: renamed from: j */
    private final ConstraintLayout f72266j;

    /* JADX INFO: renamed from: k */
    private long f72267k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72265m = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66591I1, 1);
        sparseIntArray.put(AbstractC17307e.f66541A1, 2);
        sparseIntArray.put(AbstractC17307e.f66567E1, 3);
        sparseIntArray.put(AbstractC17307e.f66579G1, 4);
        sparseIntArray.put(AbstractC17307e.f66585H1, 5);
        sparseIntArray.put(AbstractC17307e.f66561D1, 6);
        sparseIntArray.put(AbstractC17307e.f66555C1, 7);
        sparseIntArray.put(AbstractC17307e.f66573F1, 8);
        sparseIntArray.put(AbstractC17307e.f66548B1, 9);
    }

    public C18543f(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 10, f72264l, f72265m));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72267k = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72267k != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72267k = 1L;
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

    private C18543f(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (View) objArr[2], (TextView) objArr[9], (TextInputEditText) objArr[7], (TextInputLayout) objArr[6], (ProgressBar) objArr[3], (TextView) objArr[8], (ImageView) objArr[4], (TextView) objArr[5], (View) objArr[1]);
        this.f72267k = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72266j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
