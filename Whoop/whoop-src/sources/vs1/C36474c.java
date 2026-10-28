package vs1;

import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vs1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lvs1/c;", "", "<init>", "()V", "", "", "values", "a", "(Ljava/util/List;)Ljava/lang/String;", "string", "b", "(Ljava/lang/String;)Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36474c {
    /* JADX INFO: renamed from: a */
    public final String m116837a(List<String> values) {
        AbstractC22676k.m65750j(values, "values");
        return values.isEmpty() ? "" : AbstractC25265s.m74110N0(values, ",", null, null, null, 62);
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m116838b(String string) {
        AbstractC22676k.m65750j(string, "string");
        return string.equals("") ? C25271y.f99162w : AbstractC39414r.m125906y0(string, new String[]{","}, 6);
    }
}
