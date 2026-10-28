package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.p */
/* JADX INFO: loaded from: classes7.dex */
public class C18560p extends AbstractC18559o {

    /* JADX INFO: renamed from: k */
    private static final C1191u f72360k = null;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f72361l;

    /* JADX INFO: renamed from: i */
    private final ConstraintLayout f72362i;

    /* JADX INFO: renamed from: j */
    private long f72363j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72361l = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66805p2, 1);
        sparseIntArray.put(AbstractC17307e.f66714c2, 2);
        sparseIntArray.put(AbstractC17307e.f66610L2, 3);
        sparseIntArray.put(AbstractC17307e.f66763j2, 4);
        sparseIntArray.put(AbstractC17307e.f66721d2, 5);
        sparseIntArray.put(AbstractC17307e.f66734f1, 6);
        sparseIntArray.put(AbstractC17307e.f66557C3, 7);
        sparseIntArray.put(AbstractC17307e.f66828s4, 8);
    }

    public C18560p(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f72360k, f72361l));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72363j = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72363j != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72363j = 1L;
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

    private C18560p(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (StrokedPillButton) objArr[6], (ImageView) objArr[2], (TextView) objArr[5], (TextView) objArr[4], (TextView) objArr[1], (ImageView) objArr[3], (TextView) objArr[7], (TextView) objArr[8]);
        this.f72363j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72362i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
