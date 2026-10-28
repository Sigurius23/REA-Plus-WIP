package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.C4987d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.tasks.Task;
import com.whoop.service.network.model.UserSessionDto;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import p073cq.C11040i;
import p073cq.C11052u;
import p095dp.C12238b;
import p097ds.RunnableC12316s;
import p529uo.AbstractC35135w;

/* JADX INFO: loaded from: classes6.dex */
public class CronetProviderInstaller {
    public static final String PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
    private static final String zza = "CronetProviderInstaller";
    private static final C4987d zzb = C4987d.getInstance();
    private static final Object zzc = new Object();
    private static C12238b zzd = null;
    private static String zze = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE;

    private CronetProviderInstaller() {
    }

    public static Task<Void> installProvider(Context context) {
        AbstractC35135w.m111095g(context, "Context must not be null");
        C11040i c11040i = new C11040i();
        boolean zIsInstalled = isInstalled();
        C11052u c11052u = c11040i.f34644a;
        if (zIsInstalled) {
            c11040i.m29687b(null);
            return c11052u;
        }
        new Thread(new RunnableC12316s(18, context, c11040i)).start();
        return c11052u;
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    public static C12238b zza() {
        C12238b c12238b;
        synchronized (zzc) {
            c12238b = zzd;
        }
        return c12238b;
    }

    public static String zzb() {
        String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    @Deprecated
    public static void zzc(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        synchronized (zzc) {
            try {
                if (isInstalled()) {
                    return;
                }
                AbstractC35135w.m111095g(context, "Context must not be null");
                ClassLoader classLoader = CronetProviderInstaller.class.getClassLoader();
                AbstractC35135w.m111094f(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    C4987d c4987d = zzb;
                    c4987d.verifyGooglePlayServicesIsAvailable(context, 11925000);
                    try {
                        C12238b c12238bM34029c = C12238b.m34029c(context, C12238b.f40940b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = c12238bM34029c.f40951a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                                Log.e(zza, "ImplVersion class is missing from Cronet module.");
                                throw new GooglePlayServicesNotAvailableException(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) method.invoke(null, null);
                            AbstractC35135w.m111094f(num);
                            int iIntValue = num.intValue();
                            String str = (String) method2.invoke(null, null);
                            AbstractC35135w.m111094f(str);
                            zze = str;
                            if (apiLevel <= iIntValue) {
                                zzd = c12238bM34029c;
                                return;
                            }
                            if (c4987d.getErrorResolutionIntent(context, 2, "cr") == null) {
                                Log.e(zza, "Unable to fetch error resolution intent");
                                throw new GooglePlayServicesNotAvailableException(2);
                            }
                            String str2 = zze;
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb4.append("Google Play Services update is required. The API Level of the client is ");
                            sb4.append(apiLevel);
                            sb4.append(". The API Level of the implementation is ");
                            sb4.append(iIntValue);
                            sb4.append(". The Cronet implementation version is ");
                            sb4.append(str2);
                            throw new GooglePlayServicesRepairableException(sb4.toString());
                        } catch (Exception e5) {
                            Log.e(zza, "Unable to read Cronet version from the Cronet module ", e5);
                            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e5));
                        }
                    } catch (DynamiteModule$LoadingException e13) {
                        Log.e(zza, "Unable to load Cronet module", e13);
                        throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(8).initCause(e13));
                    }
                } catch (ClassNotFoundException e14) {
                    Log.e(zza, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException(10).initCause(e14));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
