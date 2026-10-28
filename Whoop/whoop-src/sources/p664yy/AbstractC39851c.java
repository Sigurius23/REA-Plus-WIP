package p664yy;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import java.util.UUID;
import k83.InterfaceC22297a;
import p537ux.C35331f0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yy.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39851c {

    /* JADX INFO: renamed from: g */
    public static volatile UUID f172106g;

    /* JADX INFO: renamed from: h */
    public static final String f172107h;

    /* JADX INFO: renamed from: i */
    public static final C35331f0 f172108i;

    /* JADX INFO: renamed from: a */
    public final PackageManager f172109a;

    /* JADX INFO: renamed from: b */
    public final PackageInfo f172110b;

    /* JADX INFO: renamed from: c */
    public final String f172111c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC22297a f172112d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC22297a f172113e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC22297a f172114f;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
        f172106g = uuidRandomUUID;
        f172107h = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
        f172108i = new C35331f0(14);
    }

    public AbstractC39851c(PackageManager packageManager, PackageInfo packageInfo, String str, InterfaceC22297a interfaceC22297a, InterfaceC22297a interfaceC22297a2) {
        C35331f0 pluginTypeProvider = f172108i;
        AbstractC22676k.m65750j(pluginTypeProvider, "pluginTypeProvider");
        this.f172109a = packageManager;
        this.f172110b = packageInfo;
        this.f172111c = str;
        this.f172112d = interfaceC22297a;
        this.f172113e = interfaceC22297a2;
        this.f172114f = pluginTypeProvider;
    }

    /* JADX INFO: renamed from: a */
    public abstract C39849b mo7052a(InterfaceC39847a interfaceC39847a, Map map);
}
