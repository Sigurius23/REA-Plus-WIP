package p529uo;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.InterfaceC4973d;
import com.google.android.gms.common.api.InterfaceC4978i;
import com.google.android.gms.common.api.InterfaceC4979j;
import com.google.android.gms.common.api.Scope;
import com.google.crypto.tink.internal.C5099k0;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: uo.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35117h extends AbstractC35107c implements InterfaceC4973d {

    /* JADX INFO: renamed from: y */
    public final Set f149028y;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC35117h(Context context, Looper looper, int i13, C5099k0 c5099k0, InterfaceC4978i interfaceC4978i, InterfaceC4979j interfaceC4979j, int i14) {
        synchronized (C35118h0.f149029g) {
            try {
                if (C35118h0.f149030h == null) {
                    C35118h0.f149030h = new C35118h0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C35118h0 c35118h0 = C35118h0.f149030h;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        AbstractC35135w.m111094f(interfaceC4978i);
        AbstractC35135w.m111094f(interfaceC4979j);
        super(context, looper, c35118h0, googleApiAvailability, i13, new C35123k(interfaceC4978i), new C35123k(interfaceC4979j), (String) c5099k0.f21436E);
        Set set = (Set) c5099k0.f21441z;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f149028y = set;
    }
}
