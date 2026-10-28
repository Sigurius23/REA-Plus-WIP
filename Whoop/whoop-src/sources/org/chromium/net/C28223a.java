package org.chromium.net;

import java.util.Comparator;

/* JADX INFO: renamed from: org.chromium.net.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C28223a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CronetProvider cronetProvider = (CronetProvider) obj;
        CronetProvider cronetProvider2 = (CronetProvider) obj2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
            return 1;
        }
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
            return -1;
        }
        return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
    }
}
