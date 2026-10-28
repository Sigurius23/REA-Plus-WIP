package ro;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC4980k;
import java.util.Iterator;
import java.util.Set;
import p012ab.C0682h0;
import to.C33971f;

/* JADX INFO: renamed from: ro.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31623h {

    /* JADX INFO: renamed from: a */
    public static final C0682h0 f130662a = new C0682h0("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static void m97693a(Context context) {
        C31624i.m97695G(context).m97704H();
        Set set = AbstractC4980k.f20514a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((AbstractC4980k) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C33971f.m107427a();
    }
}
