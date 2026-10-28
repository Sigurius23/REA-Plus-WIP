package eq0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import com.whoop.p069ui.WhoopEditText;
import com.whoop.p069ui.WhoopToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import nf1.AbstractC26663d;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: eq0.d */
/* JADX INFO: loaded from: classes7.dex */
public class C13451d extends AbstractC13446c {

    /* JADX INFO: renamed from: t */
    private static final C1191u f47181t = null;

    /* JADX INFO: renamed from: u */
    private static final SparseIntArray f47182u;

    /* JADX INFO: renamed from: s */
    private long f47183s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f47182u = sparseIntArray;
        sparseIntArray.put(AbstractC38499a0.f165359n3, 2);
        sparseIntArray.put(AbstractC38499a0.f165182T, 3);
        sparseIntArray.put(AbstractC38499a0.f165417t7, 4);
        sparseIntArray.put(AbstractC26663d.f105993l, 5);
        sparseIntArray.put(AbstractC38499a0.f165151P2, 6);
        sparseIntArray.put(AbstractC38499a0.f165193U2, 7);
        sparseIntArray.put(AbstractC38499a0.f165124M2, 8);
        sparseIntArray.put(AbstractC38499a0.f165368o3, 9);
        sparseIntArray.put(AbstractC38499a0.f165404s3, 10);
        sparseIntArray.put(AbstractC38499a0.f165413t3, 11);
        sparseIntArray.put(AbstractC38499a0.f165323j3, 12);
        sparseIntArray.put(AbstractC38499a0.f165350m3, 13);
        sparseIntArray.put(AbstractC38499a0.f165377p3, 14);
        sparseIntArray.put(AbstractC38499a0.f165386q3, 15);
        sparseIntArray.put(AbstractC38499a0.f165395r3, 16);
        sparseIntArray.put(AbstractC38499a0.f165422u3, 17);
    }

    public C13451d(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 18, f47181t, f47182u));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f47183s = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f47183s != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f47183s = 1L;
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
    private C13451d(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        ImageView imageView = (ImageView) objArr[3];
        Guideline guideline = (Guideline) objArr[8];
        Guideline guideline2 = (Guideline) objArr[6];
        Guideline guideline3 = (Guideline) objArr[7];
        TextView textView = (TextView) objArr[12];
        WhoopEditText whoopEditText = (WhoopEditText) objArr[13];
        Object obj = objArr[2];
        super(interfaceC1176f, view, 0, constraintLayout, imageView, guideline, guideline2, guideline3, textView, whoopEditText, obj != null ? C13464f2.m38187a((View) obj) : null, (LinearLayout) objArr[9], (TextView) objArr[14], (StrokedPillButton) objArr[15], (View) objArr[16], (View) objArr[10], (TextView) objArr[11], (TextView) objArr[17], (WhoopToolbar) objArr[1], (WhoopToolbar) objArr[4], (TextView) objArr[5]);
        this.f47183s = -1L;
        this.f47148a.setTag(null);
        this.f47163p.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
