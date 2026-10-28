package m52;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1172c0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.realtime.presentation.views.RealTimeCell;
import k52.AbstractC22208d;

/* JADX INFO: renamed from: m52.h */
/* JADX INFO: loaded from: classes10.dex */
public class C25088h extends AbstractC25087g {

    /* JADX INFO: renamed from: k */
    private static final C1191u f98327k = null;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f98328l;

    /* JADX INFO: renamed from: i */
    private final ConstraintLayout f98329i;

    /* JADX INFO: renamed from: j */
    private long f98330j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f98328l = sparseIntArray;
        sparseIntArray.put(AbstractC22208d.f86310R, 1);
        sparseIntArray.put(AbstractC22208d.f86354i1, 2);
        sparseIntArray.put(AbstractC22208d.f86346g, 3);
        sparseIntArray.put(AbstractC22208d.f86294J, 4);
        sparseIntArray.put(AbstractC22208d.f86349h, 5);
        sparseIntArray.put(AbstractC22208d.f86298L, 6);
        sparseIntArray.put(AbstractC22208d.f86352i, 7);
        sparseIntArray.put(AbstractC22208d.f86296K, 8);
    }

    public C25088h(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f98327k, f98328l));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() throws Throwable {
        synchronized (this) {
            this.f98330j = 0L;
        }
        AbstractC1168a0 abstractC1168a0 = this.f98325g.f5326b;
        if (abstractC1168a0 != null) {
            AbstractC1168a0.executeBindingsOn(abstractC1168a0);
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f98330j != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f98330j = 1L;
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

    private C25088h(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (LinearLayout) objArr[3], (View) objArr[5], (View) objArr[7], (RealTimeCell) objArr[4], (RealTimeCell) objArr[8], (RealTimeCell) objArr[6], new C1172c0((ViewStub) objArr[1]), (ImageView) objArr[2]);
        this.f98330j = -1L;
        this.f98325g.f5329e = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f98329i = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
