package mc2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.ReferAFriendScreenModel;
import com.whoop.settings.referafriendmenu.model.MenuItem;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mc2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lmc2/g;", "", "<init>", "()V", "Lmc2/b;", "result", "Lmc2/m;", "a", "(Lmc2/b;)Lmc2/m;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25428g {
    /* JADX INFO: renamed from: a */
    public final C25434m m74643a(AbstractC25423b result) {
        String shareMessage;
        AbstractC22676k.m65750j(result, "result");
        if (!result.equals(AbstractC25423b.a.f99533a) && !result.equals(AbstractC25423b.b.f99534a)) {
            if (!(result instanceof AbstractC25423b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC25423b.c cVar = (AbstractC25423b.c) result;
            TextResource textResourceM21278l = AbstractC8693b.m21278l(cVar.getResult().getSectionHeader());
            List<MenuItem> items = cVar.getResult().getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            for (MenuItem menuItem : items) {
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(menuItem.getContent().getTitle());
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(menuItem.getContent().getSubtitle());
                EnumC25425d enumC25425d = AbstractC22676k.m65745e(menuItem.getContent().getStyle(), "TRIAL_REFER_A_FRIEND") ? EnumC25425d.OUTLINED : EnumC25425d.RAF_MENU_ITEM;
                String leftIcon = menuItem.getContent().getLeftIcon();
                C9598e destination = menuItem.getContent().getDestination();
                NavigationScreenModel parameters = destination != null ? destination.getParameters() : null;
                ReferAFriendScreenModel referAFriendScreenModel = parameters instanceof ReferAFriendScreenModel ? (ReferAFriendScreenModel) parameters : null;
                if (referAFriendScreenModel == null || (shareMessage = referAFriendScreenModel.getShareMessage()) == null) {
                    shareMessage = "";
                }
                C9598e destination2 = menuItem.getContent().getDestination();
                arrayList.add(new C25429h(textResourceM21278l2, textResourceM21278l3, enumC25425d, leftIcon, shareMessage, destination2 == null ? new C9598e(null, null, null, 7, null) : destination2));
            }
            return new C25434m(textResourceM21278l, arrayList);
        }
        return new C25434m(null, null, 3, null);
    }
}
