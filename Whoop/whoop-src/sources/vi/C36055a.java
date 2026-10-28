package vi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: vi.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36055a {

    /* JADX INFO: renamed from: d */
    public static final Object f153920d = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f153921a;

    /* JADX INFO: renamed from: b */
    public final String f153922b;

    /* JADX INFO: renamed from: c */
    public final Map f153923c;

    public C36055a(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f153922b = str;
        } else {
            this.f153922b = str.concat("/");
        }
        this.f153923c = map;
        if (callback instanceof View) {
            this.f153921a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f153921a = null;
        }
    }
}
