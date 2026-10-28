package an2;

import com.whoop.p069ui.login.ImportantAppInfo;
import java.util.List;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p000.C28503p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: an2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "Lcom/whoop/ui/login/ImportantAppInfo;", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1058a {
    /* JADX INFO: renamed from: b */
    public static final String m3132b(List<? extends ImportantAppInfo> list) {
        AbstractC22676k.m65750j(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? AbstractC11266d.m30461o("Multiple failures: ", AbstractC25265s.m74110N0(list, null, null, null, new C28503p(27), 31)) : AbstractC11266d.m30461o("Failed to fetch ", ((ImportantAppInfo) AbstractC25265s.m74096F0(list)).getExceptionReason());
        }
        throw new IllegalStateException("Cannot build MissingImportantAppInfoException without at least one failure");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m3133c(ImportantAppInfo it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getExceptionReason();
    }
}
