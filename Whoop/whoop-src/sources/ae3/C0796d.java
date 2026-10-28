package ae3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import io.sentry.util.C20588j;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p027b3.C2353b1;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ae3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C0796d extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2945a;

    public /* synthetic */ C0796d(int i13) {
        this.f2945a = i13;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2945a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC37174h.f158962a);
                return simpleDateFormat;
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C2353b1 c2353b1 = new C2353b1(choreographer, Handler.createAsync(looperMyLooper));
                return c2353b1.plus(c2353b1.f9301J);
            case 2:
                return new PathMeasure();
            case 3:
                return new Path();
            case 4:
                return new Path();
            case 5:
                return new float[4];
            case 6:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            default:
                return new C20588j();
        }
    }
}
