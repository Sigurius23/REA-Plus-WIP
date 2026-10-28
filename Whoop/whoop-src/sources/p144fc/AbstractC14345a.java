package p144fc;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: fc.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14345a {

    /* JADX INFO: renamed from: a */
    private final DataSetObservable f52396a = new DataSetObservable();

    /* JADX INFO: renamed from: b */
    private DataSetObserver f52397b;

    /* JADX INFO: renamed from: a */
    public abstract void mo4232a(ViewGroup viewGroup, int i13, Object obj);

    @Deprecated
    /* JADX INFO: renamed from: b */
    public void m40964b(View view) {
    }

    /* JADX INFO: renamed from: c */
    public void mo4233c(ViewGroup viewGroup) {
        m40964b(viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo28901d();

    /* JADX INFO: renamed from: e */
    public int mo40965e(Object obj) {
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public CharSequence mo40966f(int i13) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public float m40967g(int i13) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo4234h(ViewGroup viewGroup, int i13);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo4235i(View view, Object obj);

    /* JADX INFO: renamed from: j */
    public void m40968j() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f52397b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f52396a.notifyChanged();
    }

    /* JADX INFO: renamed from: k */
    public void m40969k(DataSetObserver dataSetObserver) {
        this.f52396a.registerObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: l */
    public void mo4236l(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* JADX INFO: renamed from: m */
    public Parcelable mo4237m() {
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public void m40970n(View view, int i13, Object obj) {
    }

    /* JADX INFO: renamed from: o */
    public void mo4238o(ViewGroup viewGroup, int i13, Object obj) {
        m40970n(viewGroup, i13, obj);
    }

    /* JADX INFO: renamed from: p */
    public void m40971p(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f52397b = dataSetObserver;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public void m40972q(View view) {
    }

    /* JADX INFO: renamed from: r */
    public void mo4239r(ViewGroup viewGroup) {
        m40972q(viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public void m40973s(DataSetObserver dataSetObserver) {
        this.f52396a.unregisterObserver(dataSetObserver);
    }
}
