package p457rc;

import android.net.NetworkRequest;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rc.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31221d {
    /* JADX INFO: renamed from: a */
    public static int[] m96160a(NetworkRequest request) {
        AbstractC22676k.m65750j(request, "request");
        int[] capabilities = request.getCapabilities();
        AbstractC22676k.m65749i(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m96161b(NetworkRequest request) {
        AbstractC22676k.m65750j(request, "request");
        int[] transportTypes = request.getTransportTypes();
        AbstractC22676k.m65749i(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
