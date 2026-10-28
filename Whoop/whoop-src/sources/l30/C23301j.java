package l30;

import android.os.Environment;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p031b9.AbstractC2875y;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l30.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C23301j extends AbstractC23304m {

    /* JADX INFO: renamed from: b */
    public static final List f92344b = AbstractC37056f.m118959K("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");

    /* JADX INFO: renamed from: c */
    public static final C23306o f92345c = new C23306o("SW01", "The device is jailbroken.", EnumC23305n.f92350x);

    @Override // l30.AbstractC23304m
    /* JADX INFO: renamed from: a */
    public final boolean mo67390a() {
        List list = f92344b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (new File(AbstractC2875y.m8299l((String) it.next(), "su")).exists()) {
                    return true;
                }
            }
        }
        File rootDirectory = Environment.getRootDirectory();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(rootDirectory);
        sb4.append("/Superuser");
        return new File(sb4.toString()).isDirectory();
    }
}
