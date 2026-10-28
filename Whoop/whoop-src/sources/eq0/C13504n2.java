package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import p479s4.AbstractC32121b;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.n2 */
/* JADX INFO: loaded from: classes7.dex */
public class C13504n2 extends AbstractC13499m2 {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47492i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47493j;

    /* JADX INFO: renamed from: g */
    private final ConstraintLayout f47494g;

    /* JADX INFO: renamed from: h */
    private long f47495h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47493j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165287f3, 2);
        sparseIntArray.put(AbstractC38499a0.f165388q5, 3);
        sparseIntArray.put(AbstractC38499a0.f165314i3, 4);
        sparseIntArray.put(AbstractC38499a0.f165380p6, 5);
    }

    public C13504n2(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 6, f47492i, f47493j));
    }

    @Override // eq0.AbstractC13499m2
    /* JADX INFO: renamed from: c */
    public void mo38214c(String str) throws Throwable {
        this.f47472f = str;
        synchronized (this) {
            this.f47495h |= 1;
        }
        notifyPropertyChanged(AbstractC38498a.f165010d);
        super.requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        long j7;
        synchronized (this) {
            j7 = this.f47495h;
            this.f47495h = 0L;
        }
        String str = this.f47472f;
        if ((j7 & 3) != 0) {
            AbstractC32121b.m99990C(this.f47471e, str);
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47495h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47495h = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) throws Throwable {
        if (AbstractC38498a.f165010d != i13) {
            return false;
        }
        mo38214c((String) obj);
        return true;
    }

    private C13504n2(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[2], (StrokedPillButton) objArr[4], (TextView) objArr[3], (StrokedPillButton) objArr[5], (TextView) objArr[1]);
        this.f47495h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47494g = constraintLayout;
        constraintLayout.setTag(null);
        this.f47471e.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
