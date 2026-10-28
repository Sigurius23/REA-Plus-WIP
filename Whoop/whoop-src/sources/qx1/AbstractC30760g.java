package qx1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.domain.upcycle.models.Cta;
import com.whoop.membership.domain.upcycle.models.LineItem;
import com.whoop.membership.domain.upcycle.models.UpcycleContent;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import tv1.AbstractC34207c;

/* JADX INFO: renamed from: qx1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ltv1/c$b;", "Lqx1/e$c;", "b", "(Ltv1/c$b;)Lqx1/e$c;", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30760g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC30758e.c m94499b(AbstractC34207c.b bVar) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(bVar.getModel().getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(bVar.getModel().getSubtitle());
        List<UpcycleContent> items = bVar.getModel().getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (UpcycleContent upcycleContent : items) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(upcycleContent.getTitle());
            Cta cta = upcycleContent.getCta();
            C30754a c30754a = cta != null ? new C30754a(cta.getText(), EnumC16313m0.valueOf(cta.getIcon()), cta.getAnalyticsLabel(), cta.getDestination()) : null;
            List<LineItem> lineItems = upcycleContent.getLineItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(lineItems, 10));
            for (LineItem lineItem : lineItems) {
                arrayList2.add(new C30755b(AbstractC8693b.m21278l(lineItem.getText()), EnumC16313m0.valueOf(lineItem.getIcon())));
            }
            arrayList.add(new C30756c(textResourceM21278l3, arrayList2, c30754a));
        }
        return new InterfaceC30758e.c(textResourceM21278l, textResourceM21278l2, arrayList, new C30757d(bVar.getModel().getAnalyticsCategory(), bVar.getModel().getReceivedKit(), bVar.getModel().getUpcycleOffer()));
    }
}
