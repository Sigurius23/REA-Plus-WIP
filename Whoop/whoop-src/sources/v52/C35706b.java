package v52;

import com.whoop.recommendationtile.domain.C9912c;
import h31.C16814g;
import h31.C16820m;
import h31.C16824q;
import h31.EnumC16813f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc1.AbstractC29070d;

/* JADX INFO: renamed from: v52.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lv52/b;", "", "<init>", "()V", "Lcom/whoop/recommendationtile/domain/c;", "state", "Lh31/m;", "a", "(Lcom/whoop/recommendationtile/domain/c;)Lh31/m;", "recommendation-tile-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35706b {
    /* JADX INFO: renamed from: a */
    public final C16820m m113180a(C9912c state) {
        C16814g c16814gM47364b;
        AbstractC22676k.m65750j(state, "state");
        C16814g button = state.getButton();
        if (button != null) {
            c16814gM47364b = C16814g.m47364b(button, null, state.getIsCommitting() ? EnumC16813f.LOADING : AbstractC29070d.m88376b(state.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String()), null, null, false, null, 61, null);
        } else {
            c16814gM47364b = null;
        }
        return new C16820m(new C16824q(state.getRecommendationId(), AbstractC29070d.m88379e(state.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String()), state.getHeader(), state.m24300d(), c16814gM47364b, state.getIsExpanded(), state.getIsSelected(), state.getBackgroundStyle()), state.getShowCommitError(), state.getDismiss(), state.getFollowupMessage());
    }
}
