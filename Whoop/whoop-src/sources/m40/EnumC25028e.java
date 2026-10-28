package m40;

import android.graphics.Bitmap;
import ge3.AbstractC15751g;
import java.util.List;
import t83.C33617b;
import wb3.AbstractC37056f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: m40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25028e {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC25028e[] f98042x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ C33617b f98043y;

    /* JADX INFO: renamed from: w */
    public final List f98044w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC25028e EF0;

    static {
        List listM118958J = AbstractC37056f.m118958J("png");
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        EnumC25028e enumC25028e = new EnumC25028e("PNG", 0, listM118958J);
        List listM118958J2 = AbstractC37056f.m118958J("webp");
        Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.WEBP;
        EnumC25028e enumC25028e2 = new EnumC25028e("WEBP", 1, listM118958J2);
        List listM118959K = AbstractC37056f.m118959K("jpeg", "jpg");
        Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.JPEG;
        EnumC25028e[] enumC25028eArr = {enumC25028e, enumC25028e2, new EnumC25028e("JPEG", 2, listM118959K)};
        f98042x = enumC25028eArr;
        f98043y = AbstractC15751g.m44468u(enumC25028eArr);
    }

    public EnumC25028e(String str, int i13, List list) {
        super(str, i13);
        this.f98044w = list;
    }

    public static EnumC25028e valueOf(String str) {
        return (EnumC25028e) Enum.valueOf(EnumC25028e.class, str);
    }

    public static EnumC25028e[] values() {
        return (EnumC25028e[]) f98042x.clone();
    }
}
