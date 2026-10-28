package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.recyclerview.widget.RecyclerView;
import com.whoop.p069ui.ThrobberView;
import of1.C27895a;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.j */
/* JADX INFO: loaded from: classes7.dex */
public class C13481j extends AbstractC13476i {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47357i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47358j;

    /* JADX INFO: renamed from: f */
    private final C27895a f47359f;

    /* JADX INFO: renamed from: g */
    private final LinearLayout f47360g;

    /* JADX INFO: renamed from: h */
    private long f47361h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47358j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165317i6, 2);
        sparseIntArray.put(AbstractC38499a0.f165308h6, 3);
        sparseIntArray.put(AbstractC38499a0.f165188T5, 4);
        sparseIntArray.put(AbstractC38499a0.f165387q4, 5);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 6);
    }

    public C13481j(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 7, f47357i, f47358j));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47361h = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47361h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47361h = 1L;
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

    private C13481j(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[5], (RecyclerView) objArr[4], (ImageView) objArr[3], (EditText) objArr[2], (ThrobberView) objArr[6]);
        this.f47361h = -1L;
        Object obj = objArr[1];
        this.f47359f = obj != null ? C27895a.m84174a((View) obj) : null;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f47360g = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
