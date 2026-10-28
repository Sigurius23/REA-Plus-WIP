package ii0;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.C1191u;
import androidx.databinding.InterfaceC1176f;
import hi0.AbstractC17307e;

/* JADX INFO: renamed from: ii0.r */
/* JADX INFO: loaded from: classes7.dex */
public class C18562r extends AbstractC18561q {

    /* JADX INFO: renamed from: B */
    private static final C1191u f72389B = null;

    /* JADX INFO: renamed from: C */
    private static final SparseIntArray f72390C;

    /* JADX INFO: renamed from: A */
    private long f72391A;

    /* JADX INFO: renamed from: z */
    private final ScrollView f72392z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f72390C = sparseIntArray;
        sparseIntArray.put(AbstractC17307e.f66671V3, 1);
        sparseIntArray.put(AbstractC17307e.f66677W3, 2);
        sparseIntArray.put(AbstractC17307e.f66683X3, 3);
        sparseIntArray.put(AbstractC17307e.f66641Q3, 4);
        sparseIntArray.put(AbstractC17307e.f66689Y3, 5);
        sparseIntArray.put(AbstractC17307e.f66587H3, 6);
        sparseIntArray.put(AbstractC17307e.f66581G3, 7);
        sparseIntArray.put(AbstractC17307e.f66709b4, 8);
        sparseIntArray.put(AbstractC17307e.f66702a4, 9);
        sparseIntArray.put(AbstractC17307e.f66695Z3, 10);
        sparseIntArray.put(AbstractC17307e.f66659T3, 11);
        sparseIntArray.put(AbstractC17307e.f66635P3, 12);
        sparseIntArray.put(AbstractC17307e.f66629O3, 13);
        sparseIntArray.put(AbstractC17307e.f66716c4, 14);
        sparseIntArray.put(AbstractC17307e.f66723d4, 15);
        sparseIntArray.put(AbstractC17307e.f66730e4, 16);
        sparseIntArray.put(AbstractC17307e.f66599J3, 17);
        sparseIntArray.put(AbstractC17307e.f66605K3, 18);
        sparseIntArray.put(AbstractC17307e.f66611L3, 19);
        sparseIntArray.put(AbstractC17307e.f66623N3, 20);
        sparseIntArray.put(AbstractC17307e.f66593I3, 21);
        sparseIntArray.put(AbstractC17307e.f66617M3, 22);
        sparseIntArray.put(AbstractC17307e.f66647R3, 23);
        sparseIntArray.put(AbstractC17307e.f66653S3, 24);
        sparseIntArray.put(AbstractC17307e.f66665U3, 25);
    }

    public C18562r(InterfaceC1176f interfaceC1176f, View view) {
        this(interfaceC1176f, view, AbstractC1168a0.mapBindings(interfaceC1176f, view, 26, f72389B, f72390C));
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void executeBindings() {
        synchronized (this) {
            this.f72391A = 0L;
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f72391A != 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.AbstractC1168a0
    public void invalidateAll() {
        synchronized (this) {
            this.f72391A = 1L;
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

    private C18562r(InterfaceC1176f interfaceC1176f, View view, Object[] objArr) {
        super(interfaceC1176f, view, 0, (Button) objArr[7], (Button) objArr[6], (Button) objArr[21], (Button) objArr[17], (Button) objArr[18], (Button) objArr[19], (Button) objArr[22], (Button) objArr[20], (Button) objArr[13], (Button) objArr[12], (Button) objArr[4], (Button) objArr[23], (Button) objArr[24], (Button) objArr[11], (Button) objArr[25], (Button) objArr[1], (Button) objArr[2], (Button) objArr[3], (Button) objArr[5], (Button) objArr[10], (Button) objArr[9], (Button) objArr[8], (Button) objArr[14], (Button) objArr[15], (Button) objArr[16]);
        this.f72391A = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.f72392z = scrollView;
        scrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
