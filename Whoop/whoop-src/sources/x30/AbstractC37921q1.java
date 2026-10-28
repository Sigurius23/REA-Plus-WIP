package x30;

import com.stripe.android.p056ui.core.elements.Capitalization;
import com.stripe.android.p056ui.core.elements.KeyboardType;

/* JADX INFO: renamed from: x30.q1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC37921q1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f162376a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f162377b;

    static {
        int[] iArr = new int[Capitalization.values().length];
        try {
            iArr[Capitalization.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Capitalization.Characters.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Capitalization.Words.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Capitalization.Sentences.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f162376a = iArr;
        int[] iArr2 = new int[KeyboardType.values().length];
        try {
            iArr2[KeyboardType.Text.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[KeyboardType.Ascii.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[KeyboardType.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[KeyboardType.Phone.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[KeyboardType.Uri.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[KeyboardType.Email.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[KeyboardType.Password.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[KeyboardType.NumberPassword.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        f162377b = iArr2;
    }
}
