package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.UpsellCardCalloutModel;
import kd1.AbstractC22403o;
import l01.C23036h;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.h5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/UpsellCardCalloutModel;", "Ll01/h;", "d", "(Lcom/whoop/design/models/items/UpsellCardCalloutModel;)Ll01/h;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "upsellCardCalloutMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23642h5 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93790a = Function1.m68251a(new C23753z4(12));

    /* JADX INFO: renamed from: lb1.h5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93791w;

        public a(Function1 function1) {
            this.f93791w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93791w.invoke((UpsellCardCalloutModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68851c() {
        return f93790a;
    }

    /* JADX INFO: renamed from: d */
    public static final C23036h m68852d(UpsellCardCalloutModel upsellCardCalloutModel) {
        AbstractC22676k.m65750j(upsellCardCalloutModel, "<this>");
        String description = upsellCardCalloutModel.getDescription();
        AbstractC22403o.c cVar = new AbstractC22403o.c(upsellCardCalloutModel.getImageUrl(), 0, 0, 0, 14, null);
        String tierImage = upsellCardCalloutModel.getTierImage();
        return new C23036h(description, cVar, tierImage != null ? new AbstractC22403o.c(tierImage, 0, 0, 0, 14, null) : null, AbstractC23653j2.m68922b(upsellCardCalloutModel.getCallout()), AbstractC23613d4.m68662l(upsellCardCalloutModel.getCardButton(), null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68853e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(UpsellCardCalloutModel.class), new a(new C23753z4(13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23036h m68854f(UpsellCardCalloutModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68852d(model);
    }
}
