package q22;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q22.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lq22/f;", "Lq22/e;", "formValidator", "", "newValue", "", "reduceValidationRequirements", "isCardInputFfEnabled", "a", "(Lq22/f;Lq22/e;Ljava/lang/String;ZZ)Lq22/f;", "payments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29857g {
    /* JADX INFO: renamed from: a */
    public static final C29856f m91491a(C29856f c29856f, C29855e formValidator, String str, boolean z4, boolean z13) {
        String value;
        AbstractC22676k.m65750j(c29856f, "<this>");
        AbstractC22676k.m65750j(formValidator, "formValidator");
        if (str == null || (value = formValidator.m91482b(str)) == null) {
            value = c29856f.getValue();
        }
        String str2 = value;
        return C29856f.m91486b(c29856f, str2, formValidator.m91485h(c29856f.getType(), c29856f.getState(), str2, z4, z13), null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C29856f m91492b(C29856f c29856f, C29855e c29855e, String str, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return m91491a(c29856f, c29855e, str, z4, z13);
    }
}
