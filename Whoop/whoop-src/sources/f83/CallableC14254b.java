package f83;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: f83.b */
/* JADX INFO: loaded from: classes5.dex */
public final class CallableC14254b implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52046w;

    public /* synthetic */ CallableC14254b(int i13) {
        this.f52046w = i13;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f52046w) {
            case 0:
                return AbstractC14253a.f52045a;
            case 1:
                return AbstractC14255c.f52047a;
            case 2:
                return AbstractC14256d.f52048a;
            default:
                return AbstractC14257e.f52049a;
        }
    }
}
