package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.g0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13467g0 extends AbstractC13462f0 {

    /* JADX INFO: renamed from: l */
    private static final C1191u f47306l = null;

    /* JADX INFO: renamed from: m */
    private static final SparseIntArray f47307m;

    /* JADX INFO: renamed from: j */
    private final ConstraintLayout f47308j;

    /* JADX INFO: renamed from: k */
    private long f47309k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47307m = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165066F7, 1);
        sparseIntArray.put(AbstractC38499a0.f165277e2, 2);
        sparseIntArray.put(AbstractC38499a0.f165259c2, 3);
        sparseIntArray.put(AbstractC38499a0.f165456y1, 4);
        sparseIntArray.put(AbstractC38499a0.f165047D6, 5);
        sparseIntArray.put(AbstractC38499a0.f165065F6, 6);
        sparseIntArray.put(AbstractC38499a0.f165056E6, 7);
        sparseIntArray.put(AbstractC38499a0.f165093I7, 8);
        sparseIntArray.put(AbstractC38499a0.f165211W4, 9);
    }

    public C13467g0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 10, f47306l, f47307m));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47309k = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47309k != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47309k = 1L;
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

    private C13467g0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ConstraintLayout) objArr[4], (ImageView) objArr[3], (TextView) objArr[2], (EditText) objArr[9], (FrameLayout) objArr[5], (RecyclerView) objArr[7], (RecyclerView) objArr[6], (LinearProgressIndicator) objArr[1], (CircleImageView) objArr[8]);
        this.f47309k = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47308j = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
