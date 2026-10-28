package il;

import al.InterfaceC0955b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import gl.C15938c;
import java.util.List;
import p108e4.AbstractC12667a;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p684zk.InterfaceC40801z;
import r80.AbstractC31061c;
import uk.C35046e;
import uk.InterfaceC35042a;

/* JADX INFO: renamed from: il.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18617c implements InterfaceC37332j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72797a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f72798b;

    public C18617c(InterfaceC0955b interfaceC0955b) {
        this.f72798b = interfaceC0955b;
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z mo44989a(Object obj, int i13, int i14, C37330h c37330h) {
        switch (this.f72797a) {
            case 0:
                return m53888c((Uri) obj);
            default:
                return C15938c.m44994b((InterfaceC0955b) this.f72798b, ((C35046e) ((InterfaceC35042a) obj)).m110778c());
        }
    }

    @Override // p586wk.InterfaceC37332j
    /* JADX INFO: renamed from: b */
    public final boolean mo44990b(Object obj, C37330h c37330h) {
        switch (this.f72797a) {
            case 0:
                return ((Uri) obj).getScheme().equals("android.resource");
            default:
                return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC40801z m53888c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = (Context) this.f72798b;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e5) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(AbstractC31061c.m95637m(uri, "Failed to obtain context or unrecognized Uri format for: "), e5);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(AbstractC31061c.m95637m(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(AbstractC31061c.m95637m(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e13) {
                throw new IllegalArgumentException(AbstractC31061c.m95637m(uri, "Unrecognized Uri format: "), e13);
            }
        }
        return C18616b.m53886b(AbstractC12667a.m35471y(context, contextCreatePackageContext, identifier));
    }

    public C18617c(Context context) {
        this.f72798b = context.getApplicationContext();
    }
}
