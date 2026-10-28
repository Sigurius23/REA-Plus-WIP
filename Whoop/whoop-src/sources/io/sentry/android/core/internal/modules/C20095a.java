package io.sentry.android.core.internal.modules;

import android.content.Context;
import androidx.lifecycle.RunnableC1645z0;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.internal.modules.AbstractC20385d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.android.core.internal.modules.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20095a extends AbstractC20385d {

    /* JADX INFO: renamed from: e */
    public final Context f75482e;

    public C20095a(Context context, C20513q6 c20513q6) {
        super(c20513q6.getLogger());
        Context applicationContext = context.getApplicationContext();
        this.f75482e = applicationContext != null ? applicationContext : context;
        try {
            c20513q6.getExecutorService().submit(new RunnableC1645z0(this, 11));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "AssetsModulesLoader submit failed", th3);
        }
    }

    @Override // io.sentry.internal.modules.AbstractC20385d
    /* JADX INFO: renamed from: b */
    public final Map mo55973b() {
        InterfaceC20602v0 interfaceC20602v0 = this.f76435a;
        TreeMap treeMap = new TreeMap();
        try {
            InputStream inputStreamOpen = this.f75482e.getAssets().open("sentry-external-modules.txt");
            try {
                TreeMap treeMapM56603c = m56603c(inputStreamOpen);
                if (inputStreamOpen == null) {
                    return treeMapM56603c;
                }
                inputStreamOpen.close();
                return treeMapM56603c;
            } catch (Throwable th3) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (FileNotFoundException unused) {
            interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (IOException e5) {
            interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error extracting modules.", e5);
            return treeMap;
        }
    }
}
