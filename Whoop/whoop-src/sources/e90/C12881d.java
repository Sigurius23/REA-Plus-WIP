package e90;

import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e90.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Le90/d;", "", "<init>", "()V", "", "selectedType", "", "Le90/c;", "genders", "selectedBaseLine", "b", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "a", "(Ljava/util/List;)Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12881d {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m36188c(C12881d c12881d, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return c12881d.m36190b(str, list, str2);
    }

    /* JADX INFO: renamed from: a */
    public final List<C12880c> m36189a(List<C12880c> genders) {
        AbstractC22676k.m65750j(genders, "genders");
        List<C12880c> list = genders;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C12880c c12880c : list) {
            arrayList.add(new C12880c(c12880c.getText(), c12880c.getType(), false, null, 8, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<C12880c> m36190b(String selectedType, List<C12880c> genders, String selectedBaseLine) {
        AbstractC22676k.m65750j(selectedType, "selectedType");
        AbstractC22676k.m65750j(genders, "genders");
        List<C12880c> list = genders;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (C12880c c12880c : list) {
            arrayList.add(new C12880c(c12880c.getText(), c12880c.getType(), AbstractC22676k.m65745e(c12880c.getType(), selectedType), AbstractC22676k.m65745e(c12880c.getType(), selectedType) ? selectedBaseLine : null));
        }
        return arrayList;
    }
}
