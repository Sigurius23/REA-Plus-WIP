package androidx.databinding;

/* JADX INFO: renamed from: androidx.databinding.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1167a implements InterfaceC1180j {
    private transient C1186p mCallbacks;

    @Override // androidx.databinding.InterfaceC1180j
    public void addOnPropertyChangedCallback(AbstractC1179i abstractC1179i) {
        synchronized (this) {
            try {
                if (this.mCallbacks == null) {
                    this.mCallbacks = new C1186p();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.mCallbacks.m3720a(abstractC1179i);
    }

    public void notifyChange() throws Throwable {
        synchronized (this) {
            try {
                C1186p c1186p = this.mCallbacks;
                if (c1186p == null) {
                    return;
                }
                c1186p.m3722c(this, 0);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void notifyPropertyChanged(int i13) throws Throwable {
        synchronized (this) {
            try {
                C1186p c1186p = this.mCallbacks;
                if (c1186p == null) {
                    return;
                }
                c1186p.m3722c(this, i13);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.databinding.InterfaceC1180j
    public void removeOnPropertyChangedCallback(AbstractC1179i abstractC1179i) {
        synchronized (this) {
            try {
                C1186p c1186p = this.mCallbacks;
                if (c1186p == null) {
                    return;
                }
                c1186p.m3725f(abstractC1179i);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
