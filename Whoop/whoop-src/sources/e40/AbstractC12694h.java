package e40;

import com.stripe.android.uicore.address.FieldType;

/* JADX INFO: renamed from: e40.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12694h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43391a;

    static {
        int[] iArr = new int[FieldType.values().length];
        try {
            iArr[FieldType.AdministrativeArea.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FieldType.PostalCode.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f43391a = iArr;
    }
}
