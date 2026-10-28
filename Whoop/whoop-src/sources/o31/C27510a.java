package o31;

import ad3.AbstractC0770m;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateClearAction;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lo31/a;", "", "<init>", "()V", "", "keyword", "stateUpdateSearchKey", "Lcom/whoop/whoopaction/domain/models/Action;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whoopaction/domain/models/Action;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27510a {

    /* JADX INFO: renamed from: a */
    public static final C27510a f110781a = new C27510a();

    private C27510a() {
    }

    /* JADX INFO: renamed from: a */
    public final Action m82922a(String keyword, String stateUpdateSearchKey) {
        AbstractC22676k.m65750j(keyword, "keyword");
        AbstractC22676k.m65750j(stateUpdateSearchKey, "stateUpdateSearchKey");
        if (stateUpdateSearchKey.length() <= 0) {
            stateUpdateSearchKey = null;
        }
        if (stateUpdateSearchKey != null) {
            return keyword.length() > 0 ? new StateUpdateAction(AbstractC25247g0.m73989X(new C23465k(stateUpdateSearchKey, AbstractC0770m.m1841c(keyword))), false, 2, (DefaultConstructorMarker) null) : new StateClearAction(AbstractC37056f.m118958J(stateUpdateSearchKey), false, 2, (DefaultConstructorMarker) null);
        }
        return null;
    }
}
