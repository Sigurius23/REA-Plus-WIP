package androidx.profileinstaller;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.core.app.AppLocalesStorageHelper;
import p314m.AbstractC24856o;
import p314m.AbstractC24857p;
import p314m.AbstractC24858q;

/* JADX INFO: renamed from: androidx.profileinstaller.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1654e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6527w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Context f6528x;

    public /* synthetic */ RunnableC1654e(Context context, int i13) {
        this.f6527w = i13;
        this.f6528x = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6527w) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(this.f6528x);
                break;
            case 1:
                ProfileInstaller.writeProfile(this.f6528x);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = this.f6528x;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AbstractC24858q.m72880d().m7701c()) {
                            String locales = AppLocalesStorageHelper.readLocales(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                AbstractC24857p.m72878b(systemService, AbstractC24856o.m72876a(locales));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC24858q.f97378F = true;
                break;
        }
    }
}
