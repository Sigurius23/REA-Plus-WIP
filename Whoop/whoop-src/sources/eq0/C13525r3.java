package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.pills.StrokedPillButton;
import p479s4.AbstractC32121b;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.r3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13525r3 extends AbstractC13520q3 {

    /* JADX INFO: renamed from: i */
    private static final C1191u f47620i = null;

    /* JADX INFO: renamed from: j */
    private static final SparseIntArray f47621j;

    /* JADX INFO: renamed from: g */
    private final ConstraintLayout f47622g;

    /* JADX INFO: renamed from: h */
    private long f47623h;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47621j = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165192U1, 3);
        sparseIntArray.put(AbstractC38499a0.f165225Y2, 4);
    }

    public C13525r3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 5, f47620i, f47621j));
    }

    @Override // eq0.AbstractC13520q3
    /* JADX INFO: renamed from: c */
    public void mo38239c(String str) throws Throwable {
        this.f47571f = str;
        synchronized (this) {
            this.f47623h |= 1;
        }
        notifyPropertyChanged(AbstractC38498a.f165008b);
        super.requestRebind();
    }

    @Override // eq0.AbstractC13520q3
    /* JADX INFO: renamed from: d */
    public void mo38240d(String str) throws Throwable {
        this.f47570e = str;
        synchronized (this) {
            this.f47623h |= 2;
        }
        notifyPropertyChanged(AbstractC38498a.f165009c);
        super.requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        long j7;
        synchronized (this) {
            j7 = this.f47623h;
            this.f47623h = 0L;
        }
        String str = this.f47571f;
        String str2 = this.f47570e;
        long j13 = 5 & j7;
        long j14 = j7 & 6;
        if (j13 != 0) {
            AbstractC32121b.m99990C(this.f47566a, str);
        }
        if (j14 != 0) {
            AbstractC32121b.m99990C(this.f47568c, str2);
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47623h != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47623h = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) throws Throwable {
        if (AbstractC38498a.f165008b == i13) {
            mo38239c((String) obj);
            return true;
        }
        if (AbstractC38498a.f165009c != i13) {
            return false;
        }
        mo38240d((String) obj);
        return true;
    }

    private C13525r3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (StrokedPillButton) objArr[2], (Flow) objArr[3], (TextView) objArr[1], (ImageView) objArr[4]);
        this.f47623h = -1L;
        this.f47566a.setTag(null);
        this.f47568c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47622g = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
