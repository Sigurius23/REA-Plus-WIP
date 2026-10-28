package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.VideoView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import androidx.fragment.app.FragmentContainerView;
import com.airbnb.lottie.LottieAnimationView;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.h */
/* JADX INFO: loaded from: classes.dex */
public class C18547h extends AbstractC18545g {

    /* JADX INFO: renamed from: h */
    private static final C1191u f72278h = null;

    /* JADX INFO: renamed from: i */
    private static final SparseIntArray f72279i;

    /* JADX INFO: renamed from: f */
    private final ConstraintLayout f72280f;

    /* JADX INFO: renamed from: g */
    private long f72281g;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72279i = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66639Q1, 1);
        sparseIntArray.put(AbstractC17307e.f66627O1, 2);
        sparseIntArray.put(AbstractC17307e.f66812q2, 3);
        sparseIntArray.put(AbstractC17307e.f66877z4, 4);
        sparseIntArray.put(AbstractC17307e.f66870y4, 5);
    }

    public C18547h(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 6, f72278h, f72279i));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72281g = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72281g != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72281g = 1L;
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

    private C18547h(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (ComposeView) objArr[2], (FragmentContainerView) objArr[1], (ComposeView) objArr[3], (VideoView) objArr[5], (LottieAnimationView) objArr[4]);
        this.f72281g = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f72280f = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
