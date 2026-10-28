package p457rc;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import p000.AbstractC11266d;
import p218ic.C18389w;

/* JADX INFO: renamed from: rc.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31224g {

    /* JADX INFO: renamed from: a */
    public static final String f128601a = C18389w.m52887f("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m96165a(Context context, Class cls, boolean z4) {
        String str = f128601a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z13 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z13 = true;
            }
            if (z4 == z13) {
                C18389w.m52886d().m52888a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            C18389w c18389wM52886d = C18389w.m52886d();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(cls.getName());
            sb4.append(" ");
            sb4.append(z4 ? "enabled" : "disabled");
            c18389wM52886d.m52888a(str, sb4.toString());
        } catch (Exception e5) {
            C18389w c18389wM52886d2 = C18389w.m52886d();
            StringBuilder sb5 = new StringBuilder();
            AbstractC11266d.m30443A(cls, sb5, "could not be ");
            sb5.append(z4 ? "enabled" : "disabled");
            String string = sb5.toString();
            if (c18389wM52886d2.f71556a <= 3) {
                Log.d(str, string, e5);
            }
        }
    }
}
