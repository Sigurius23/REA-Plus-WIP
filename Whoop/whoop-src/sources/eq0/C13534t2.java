package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import de.hdodenhof.circleimageview.CircleImageView;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.t2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13534t2 extends AbstractC13529s2 {

    /* JADX INFO: renamed from: h */
    private static final C1191u f47665h = null;

    /* JADX INFO: renamed from: i */
    private static final SparseIntArray f47666i;

    /* JADX INFO: renamed from: f */
    private final LinearLayout f47667f;

    /* JADX INFO: renamed from: g */
    private long f47668g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47666i = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165209W2, 1);
        sparseIntArray.put(AbstractC38499a0.f165230Z, 2);
        sparseIntArray.put(AbstractC38499a0.f165222Y, 3);
        sparseIntArray.put(AbstractC38499a0.f165244a5, 4);
        sparseIntArray.put(AbstractC38499a0.f165180S5, 5);
    }

    public C13534t2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 6, f47665h, f47666i));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47668g = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47668g != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47668g = 1L;
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

    private C13534t2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (CircleImageView) objArr[3], (ImageView) objArr[2], (FrameLayout) objArr[1], (TextView) objArr[4], (View) objArr[5]);
        this.f47668g = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f47667f = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
