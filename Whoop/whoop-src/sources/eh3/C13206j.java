package eh3;

import android.os.Handler;
import android.os.Looper;
import gh3.ThreadFactoryC15864i;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;
import zg3.C40635b;

/* JADX INFO: renamed from: eh3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C13206j extends AbstractC38284k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45769a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f45770b;

    public C13206j(Looper looper) {
        this.f45770b = new Handler(looper);
    }

    @Override // xg3.AbstractC38284k
    /* JADX INFO: renamed from: a */
    public final AbstractC38283j mo37108a() {
        switch (this.f45769a) {
            case 0:
                return new C13207k((ThreadFactoryC15864i) this.f45770b);
            default:
                return new C40635b((Handler) this.f45770b);
        }
    }

    public C13206j(ThreadFactoryC15864i threadFactoryC15864i) {
        this.f45770b = threadFactoryC15864i;
    }
}
