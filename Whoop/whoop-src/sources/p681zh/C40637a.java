package p681zh;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import fi.C14509o;
import java.io.File;
import ne3.C26611e0;
import p461rh.AbstractC31426o;
import p461rh.C31436y;

/* JADX INFO: renamed from: zh.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40637a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f175391a;

    public /* synthetic */ C40637a(int i13) {
        this.f175391a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final C31436y m131875a(Object obj, C14509o c14509o) {
        switch (this.f175391a) {
            case 0:
                return AbstractC31426o.m96746j(((Uri) obj).toString());
            case 1:
                return AbstractC31426o.m96737a(((File) obj).getPath());
            case 2:
                return AbstractC31426o.m96737a(((C26611e0) obj).f105849w.m79265s());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = c14509o.f53003a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return AbstractC31426o.m96746j("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return AbstractC31426o.m96746j((String) obj);
        }
    }
}
