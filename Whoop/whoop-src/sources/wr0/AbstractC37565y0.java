package wr0;

import java.util.List;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wr0.y0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "index", "", "b", "(I)Ljava/lang/String;", "", "previousIds", "currentIds", "", "a", "(Ljava/util/List;Ljava/util/List;)Z", "community-moments_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37565y0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m120568a(List<String> previousIds, List<String> currentIds) {
        AbstractC22676k.m65750j(previousIds, "previousIds");
        AbstractC22676k.m65750j(currentIds, "currentIds");
        if (currentIds.size() < previousIds.size()) {
            return false;
        }
        return AbstractC25265s.m74156w1(currentIds, previousIds.size()).equals(previousIds);
    }

    /* JADX INFO: renamed from: b */
    public static final String m120569b(int i13) {
        return AbstractC2875y.m8295h(i13, "moment_stack_peek_");
    }
}
