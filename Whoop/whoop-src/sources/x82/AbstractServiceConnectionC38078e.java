package x82;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import ze1.C40588d;

/* JADX INFO: renamed from: x82.e */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceConnectionC38078e<S extends Service> implements ServiceConnection {

    /* JADX INFO: renamed from: w */
    private a<S> f163079w;

    /* JADX INFO: renamed from: x */
    private C40588d<S> f163080x = C40588d.m131622Y();

    /* JADX INFO: renamed from: x82.e$a */
    public static class a<S extends Service> extends Binder {

        /* JADX INFO: renamed from: f */
        private S f163081f;

        public a(S s13) {
            this.f163081f = s13;
        }

        /* JADX INFO: renamed from: a */
        public S m121987a() {
            return this.f163081f;
        }
    }

    /* JADX INFO: renamed from: a */
    public S m121985a() {
        a<S> aVar = this.f163079w;
        if (aVar != null) {
            return (S) aVar.m121987a();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m121986b(Context context) {
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f163079w = (a) iBinder;
        this.f163080x.onNext(m121985a());
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f163079w = null;
        this.f163080x.onNext(null);
    }
}
