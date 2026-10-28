package p252jh;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import m83.AbstractC25265s;
import mh.C25545m;
import p425qh.AbstractC30358d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import ud3.C34810e0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jh.a */
/* JADX INFO: loaded from: classes.dex */
public final class C21692a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83290a;

    public /* synthetic */ C21692a(int i13) {
        this.f83290a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final Object m61084a(Object obj, C25545m c25545m) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.f83290a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!AbstractC30358d.m92829c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (AbstractC39414r.m125907z0(path, '/') && ((String) AbstractC25265s.m74100H0(uri.getPathSegments())) != null) {
                        if (!AbstractC22676k.m65745e(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((C34810e0) obj).f146570i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = c25545m.f100135a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!AbstractC22676k.m65745e(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || AbstractC39414r.m125890i0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = "";
                }
                Resources resourcesForApplication = c25545m.f100135a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(AbstractC31061c.m95637m(uri2, "Invalid android.resource URI: ").toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
