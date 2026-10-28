package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.c0 */
/* JADX INFO: loaded from: classes7.dex */
public class C13447c0 extends AbstractC13442b0 {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47166i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47167j;

    /* JADX INFO: renamed from: g */
    private final ConstraintLayout f47168g;

    /* JADX INFO: renamed from: h */
    private long f47169h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47167j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165167R0, 1);
        sparseIntArray.put(AbstractC38499a0.f165357n1, 2);
        sparseIntArray.put(AbstractC38499a0.f165330k1, 3);
        sparseIntArray.put(AbstractC38499a0.f165366o1, 4);
        sparseIntArray.put(AbstractC38499a0.f165375p1, 5);
        sparseIntArray.put(AbstractC38499a0.f165348m1, 6);
    }

    public C13447c0(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 7, f47166i, f47167j));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47169h = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47169h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47169h = 1L;
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

    private C13447c0(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ConstraintLayout) objArr[1], (TextView) objArr[3], (ImageView) objArr[6], (CircleImageView) objArr[2], (TextView) objArr[4], (CircleImageView) objArr[5]);
        this.f47169h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47168g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
