package eq0;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.WhoopSwitch;
import p479s4.AbstractC32121b;
import xp0.AbstractC38498a;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.t3 */
/* JADX INFO: loaded from: classes7.dex */
public class C13535t3 extends AbstractC13530s3 {

    /* JADX INFO: renamed from: h */
    private static final C1191u f47669h = null;

    /* JADX INFO: renamed from: i */
    private static final SparseIntArray f47670i;

    /* JADX INFO: renamed from: f */
    private final ConstraintLayout f47671f;

    /* JADX INFO: renamed from: g */
    private long f47672g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47670i = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165408s7, 3);
    }

    public C13535t3(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 4, f47669h, f47670i));
    }

    @Override // eq0.AbstractC13530s3
    /* JADX INFO: renamed from: c */
    public void mo38250c(Drawable drawable) throws Throwable {
        this.f47643d = drawable;
        synchronized (this) {
            this.f47672g |= 1;
        }
        notifyPropertyChanged(AbstractC38498a.f165011e);
        super.requestRebind();
    }

    @Override // eq0.AbstractC13530s3
    /* JADX INFO: renamed from: d */
    public void mo38251d(String str) throws Throwable {
        this.f47644e = str;
        synchronized (this) {
            this.f47672g |= 2;
        }
        notifyPropertyChanged(AbstractC38498a.f165012f);
        super.requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        long j7;
        synchronized (this) {
            j7 = this.f47672g;
            this.f47672g = 0L;
        }
        Drawable drawable = this.f47643d;
        String str = this.f47644e;
        long j13 = 5 & j7;
        long j14 = j7 & 6;
        if (j13 != 0) {
            this.f47640a.setImageDrawable(drawable);
        }
        if (j14 != 0) {
            AbstractC32121b.m99990C(this.f47641b, str);
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47672g != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47672g = 4L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean onFieldChange(int i13, Object obj, int i14) {
        return false;
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean setVariable(int i13, Object obj) throws Throwable {
        if (AbstractC38498a.f165011e == i13) {
            mo38250c((Drawable) obj);
            return true;
        }
        if (AbstractC38498a.f165012f != i13) {
            return false;
        }
        mo38251d((String) obj);
        return true;
    }

    private C13535t3(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ImageView) objArr[1], (TextView) objArr[2], (WhoopSwitch) objArr[3]);
        this.f47672g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f47671f = constraintLayout;
        constraintLayout.setTag(null);
        this.f47640a.setTag(null);
        this.f47641b.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
