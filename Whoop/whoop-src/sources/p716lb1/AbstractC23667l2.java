package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.IntegrationUpsellModel;
import com.whoop.design.models.items.IntegrationsUpsellButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import k21.C22157a;
import k21.C22160d;
import kd1.AbstractC22403o;
import kd1.AbstractC22406r;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lb1.l2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/IntegrationUpsellModel;", "model", "Lk21/d;", "d", "(Lcom/whoop/design/models/items/IntegrationUpsellModel;)Lk21/d;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "integrationUpsellModelMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23667l2 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93848a = Function1.m68251a(new C23714t1(21));

    /* JADX INFO: renamed from: lb1.l2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93849w;

        public a(Function1 function1) {
            this.f93849w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93849w.invoke((IntegrationUpsellModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m69025c() {
        return f93848a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX INFO: renamed from: d */
    public static final C22160d m69026d(IntegrationUpsellModel model) {
        C22157a c22157a;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        AbstractC22676k.m65750j(model, "model");
        AbstractC22403o abstractC22403oM64511a = AbstractC22406r.m64511a(model.getImage());
        String title = model.getTitle();
        String subtitle = model.getSubtitle();
        IntegrationsUpsellButtonModel primaryButton = model.getPrimaryButton();
        if (primaryButton != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(primaryButton.getTitle());
            C9598e destination = primaryButton.getDestination();
            String color = primaryButton.getColor();
            if (color != null) {
                enumC39333f = EnumC39333f.BRAND_WHITE;
                EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                int length = enumC39333fArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC39333f2 = null;
                        break;
                    }
                    enumC39333f2 = enumC39333fArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC39333f2.name(), color)) {
                        break;
                    }
                    i13++;
                }
                if (enumC39333f2 != null) {
                    enumC39333f = enumC39333f2;
                }
                if (enumC39333f == null) {
                    enumC39333f = EnumC39333f.BRAND_WHITE;
                }
            } else {
                enumC39333f = EnumC39333f.BRAND_WHITE;
            }
            c22157a = new C22157a(textResourceM21278l, destination, enumC39333f);
        } else {
            c22157a = null;
        }
        IntegrationsUpsellButtonModel secondaryButton = model.getSecondaryButton();
        C22157a c22157a2 = secondaryButton != null ? new C22157a(AbstractC8693b.m21278l(secondaryButton.getTitle()), secondaryButton.getDestination(), EnumC39333f.RECOVERY) : null;
        CardButtonModel cardButton = model.getCardButton();
        return new C22160d(abstractC22403oM64511a, title, subtitle, c22157a, c22157a2, cardButton != null ? AbstractC23613d4.m68662l(cardButton, null, 1, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m69027e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(IntegrationUpsellModel.class), new a(new C23714t1(22)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C22160d m69028f(IntegrationUpsellModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69026d(model);
    }
}
