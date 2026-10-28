package v10;

import com.stripe.android.model.StripeIntent$Status;
import p499t9.C33647p;

/* JADX INFO: renamed from: v10.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC35528d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f151163a;

    static {
        int[] iArr = new int[StripeIntent$Status.values().length];
        try {
            C33647p c33647p = StripeIntent$Status.f22249x;
            iArr[5] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            C33647p c33647p2 = StripeIntent$Status.f22249x;
            iArr[6] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f151163a = iArr;
    }
}
