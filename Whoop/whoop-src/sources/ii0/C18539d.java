package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.ConnectStrapNetworkErrorView;
import com.whoop.p069ui.views.ConnectingAnimationView;
import eq0.C13464f2;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.d */
/* JADX INFO: loaded from: classes7.dex */
public class C18539d extends AbstractC18537c {

    /* JADX INFO: renamed from: u */
    private static final C1191u f72243u = null;

    /* JADX INFO: renamed from: v */
    private static final SparseIntArray f72244v;

    /* JADX INFO: renamed from: r */
    private final FrameLayout f72245r;

    /* JADX INFO: renamed from: s */
    private final FrameLayout f72246s;

    /* JADX INFO: renamed from: t */
    private long f72247t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72244v = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66776l1, 2);
        sparseIntArray.put(AbstractC17307e.f66797o1, 3);
        sparseIntArray.put(AbstractC17307e.f66773k5, 4);
        sparseIntArray.put(AbstractC17307e.f66850v5, 5);
        sparseIntArray.put(AbstractC17307e.f66713c1, 6);
        sparseIntArray.put(AbstractC17307e.f66804p1, 7);
        sparseIntArray.put(AbstractC17307e.f66699a1, 8);
        sparseIntArray.put(AbstractC17307e.f66706b1, 9);
        sparseIntArray.put(AbstractC17307e.f66694Z2, 10);
        sparseIntArray.put(AbstractC17307e.f66688Y2, 11);
        sparseIntArray.put(AbstractC17307e.f66679X, 12);
        sparseIntArray.put(AbstractC17307e.f66839u1, 13);
        sparseIntArray.put(AbstractC17307e.f66818r1, 14);
        sparseIntArray.put(AbstractC17307e.f66832t1, 15);
        sparseIntArray.put(AbstractC17307e.f66811q1, 16);
        sparseIntArray.put(AbstractC17307e.f66790n1, 17);
        sparseIntArray.put(AbstractC17307e.f66785m3, 18);
    }

    public C18539d(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 19, f72243u, f72244v));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72247t = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72247t != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72247t = 1L;
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

    /* JADX WARN: Illegal instructions before constructor call */
    private C18539d(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        FrameLayout frameLayout = (FrameLayout) objArr[12];
        ImageView imageView = (ImageView) objArr[8];
        ImageView imageView2 = (ImageView) objArr[9];
        TextView textView = (TextView) objArr[6];
        Object obj = objArr[2];
        super(interfaceC1176f, view, 0, frameLayout, imageView, imageView2, textView, obj != null ? C13464f2.m38187a((View) obj) : null, (Button) objArr[17], (LinearLayout) objArr[3], (FrameLayout) objArr[7], (TextView) objArr[16], (LinearLayout) objArr[14], (TextView) objArr[15], (ConnectingAnimationView) objArr[13], (FrameLayout) objArr[11], (ViewFlipper) objArr[10], (ConnectStrapNetworkErrorView) objArr[18], (RelativeLayout) objArr[4], (ImageView) objArr[5]);
        this.f72247t = -1L;
        FrameLayout frameLayout2 = (FrameLayout) objArr[0];
        this.f72245r = frameLayout2;
        frameLayout2.setTag(null);
        FrameLayout frameLayout3 = (FrameLayout) objArr[1];
        this.f72246s = frameLayout3;
        frameLayout3.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
