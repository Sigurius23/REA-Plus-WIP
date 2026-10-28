package p364oc;

import android.net.NetworkCapabilities;
import mc.C25408e;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oc.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC27813g {

    /* JADX INFO: renamed from: a */
    public static final String f112060a;

    static {
        String strM52887f = C18389w.m52887f("NetworkStateTracker");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f112060a = strM52887f;
    }

    /* JADX INFO: renamed from: a */
    public static final C25408e m83891a(NetworkCapabilities networkCapabilities, boolean z4) {
        return new C25408e(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18), z4);
    }
}
