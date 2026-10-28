package y30;

import android.content.Context;
import b20.C2326f;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import g40.C15383l0;
import h32.C16829b;
import p395p6.C28875e1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C39189d {
    /* JADX INFO: renamed from: a */
    public static InterfaceC39190e m124822a(Context context, String googlePlacesApiKey, C15383l0 c15383l0, C16829b c16829b, C28875e1 c28875e1, C2326f c2326f) {
        AbstractC22676k.m65750j(googlePlacesApiKey, "googlePlacesApiKey");
        try {
            Class.forName("com.google.android.libraries.places.api.Places");
            c28875e1.invoke();
            return new C39188c((PlacesClient) c16829b.invoke(context), c2326f);
        } catch (Exception unused) {
            return new C39191f(c2326f);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC39190e m124823b(Context context, String str, C2326f c2326f) {
        return m124822a(context, str, new C15383l0(0), new C16829b(context, 4), new C28875e1(context, str, 1), c2326f);
    }

    /* JADX INFO: renamed from: c */
    public static final PlacesClient m124824c(Context context, Context it) {
        AbstractC22676k.m65750j(it, "it");
        return Places.createClient(context);
    }

    /* JADX INFO: renamed from: d */
    public static final void m124825d(Context context, String str) {
        Places.initialize(context, str);
    }

    /* JADX INFO: renamed from: e */
    public static Integer m124826e(boolean z4, C15383l0 c15383l0) {
        try {
            Class.forName("com.google.android.libraries.places.api.Places");
            return Integer.valueOf(z4 ? R.drawable.places_powered_by_google_dark : R.drawable.places_powered_by_google_light);
        } catch (Exception unused) {
            return null;
        }
    }
}
