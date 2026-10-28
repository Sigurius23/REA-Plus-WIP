package com.mapbox.common.module.cronet;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23467m;
import org.chromium.net.CronetProvider;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m65681d2 = {"CRONET_PLAY_SERVICES_INSTALLER_CLASS", "", "canInstallFromGooglePlay", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disabledProviders", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getDisabledProviders$annotations", "()V", "getDisabledProviders", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "isPlayServicesCronetProviderInstallerAvailable", "", "findCronetProvider", "Lorg/chromium/net/CronetProvider;", "context", "Landroid/content/Context;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class LazyEngineKt {
    private static final String CRONET_PLAY_SERVICES_INSTALLER_CLASS = "com.google.android.gms.net.CronetProviderInstaller";
    private static final AtomicBoolean canInstallFromGooglePlay;
    private static final CopyOnWriteArraySet<String> disabledProviders;
    private static final boolean isPlayServicesCronetProviderInstallerAvailable;

    static {
        Object objM107888l;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(CronetProvider.PROVIDER_NAME_FALLBACK);
        disabledProviders = copyOnWriteArraySet;
        try {
            objM107888l = CronetProviderInstaller.class;
            String str = CronetProviderInstaller.PROVIDER_NAME;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = !(objM107888l instanceof C23467m);
        isPlayServicesCronetProviderInstallerAvailable = z4;
        canInstallFromGooglePlay = new AtomicBoolean(z4);
    }

    public static final CronetProvider findCronetProvider(Context context) {
        Object next;
        AbstractC22676k.m65750j(context, "context");
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
        AbstractC22676k.m65749i(allProviders, "getAllProviders(context)");
        Iterator<T> it = allProviders.iterator();
        while (it.hasNext()) {
            next = it.next();
            CronetProvider cronetProvider = (CronetProvider) next;
            try {
                if (cronetProvider.isEnabled() && !disabledProviders.contains(cronetProvider.getName())) {
                    return (CronetProvider) next;
                }
            } catch (Exception unused) {
            }
        }
        next = null;
        return (CronetProvider) next;
    }

    public static final CopyOnWriteArraySet<String> getDisabledProviders() {
        return disabledProviders;
    }

    public static /* synthetic */ void getDisabledProviders$annotations() {
    }
}
