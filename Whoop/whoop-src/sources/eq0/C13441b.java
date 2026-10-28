package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.community.presentation.p059ui.SwipelessViewPager;
import com.whoop.p069ui.ThrobberView;
import com.whoop.p069ui.WhoopZoomageView;
import com.whoop.p069ui.pills.StrokedPillButton;
import of1.C27895a;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.b */
/* JADX INFO: loaded from: classes7.dex */
public class C13441b extends AbstractC13436a {

    /* JADX INFO: renamed from: k */
    private static final C1191u f47121k = null;

    /* JADX INFO: renamed from: l */
    private static final SparseIntArray f47122l;

    /* JADX INFO: renamed from: g */
    private final FrameLayout f47123g;

    /* JADX INFO: renamed from: h */
    private final LinearLayout f47124h;

    /* JADX INFO: renamed from: i */
    private final C27895a f47125i;

    /* JADX INFO: renamed from: j */
    private long f47126j;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47122l = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165239a0, 3);
        sparseIntArray.put(AbstractC38499a0.f165248b0, 4);
        sparseIntArray.put(AbstractC38499a0.f165190U, 5);
        sparseIntArray.put(AbstractC38499a0.f165390q7, 6);
        sparseIntArray.put(AbstractC38499a0.f165043D2, 7);
        sparseIntArray.put(AbstractC38499a0.f165253b5, 8);
    }

    public C13441b(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 9, f47121k, f47122l));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47126j = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47126j != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47126j = 1L;
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

    private C13441b(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (WhoopZoomageView) objArr[5], (SwipelessViewPager) objArr[3], (ImageView) objArr[4], (FrameLayout) objArr[7], (StrokedPillButton) objArr[8], (ThrobberView) objArr[6]);
        this.f47126j = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f47123g = frameLayout;
        frameLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f47124h = linearLayout;
        linearLayout.setTag(null);
        Object obj = objArr[2];
        this.f47125i = obj != null ? C27895a.m84174a((View) obj) : null;
        setRootTag(view);
        invalidateAll();
    }
}
