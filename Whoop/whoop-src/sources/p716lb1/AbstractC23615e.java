package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.cards.AdvancedLabsSubscriptionCardModel;
import com.whoop.design.models.cards.Footer;
import com.whoop.design.models.cards.LineItem;
import com.whoop.design.util.TextResource;
import f01.C13856e1;
import f01.C13863h;
import f01.C13867i0;
import f01.C13870j0;
import f01.C13894r0;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "advancedLabsSubscriptionCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23615e {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93726a = Function1.m68251a(new C23587a(4));

    /* JADX INFO: renamed from: lb1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93727w;

        public a(Function1 function1) {
            this.f93727w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93727w.invoke((AdvancedLabsSubscriptionCardModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68681c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AdvancedLabsSubscriptionCardModel.class), new a(new C23587a(5)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C13863h m68682d(AdvancedLabsSubscriptionCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        C13870j0 c13870j0 = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        C13894r0 c13894r0 = new C13894r0(new C13867i0(model.getHeader().getLeadingContent().getTitle(), model.getHeader().getLeadingContent().getSubtitle()), new C13867i0(model.getHeader().getTrailingContent().getTitle(), model.getHeader().getTrailingContent().getSubtitle()));
        List<LineItem> lineItems = model.getLineItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(lineItems, 10));
        for (LineItem lineItem : lineItems) {
            arrayList.add(new C13856e1(lineItem.getTitle(), lineItem.getLabel()));
        }
        Footer footer = model.getFooter();
        if (footer != null) {
            EnumC39333f enumC39333f = AbstractC22676k.m65745e(model.getStatus(), "CANCELED") ? EnumC39333f.ACCENT_NEGATIVE_TREND : EnumC39333f.BRAND_WHITE;
            TextResource title = footer.getTitle();
            TextResource subtitle = footer.getSubtitle();
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(footer.getCardButton());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState");
            c13870j0 = new C13870j0(title, subtitle, (C27256h) interfaceC25312uM60541h, enumC39333f);
        }
        return new C13863h(c13894r0, arrayList, c13870j0);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68683e() {
        return f93726a;
    }
}
