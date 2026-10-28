package pb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.models.items.behaviordetails.BehaviorDetailsTileModel;
import com.whoop.design.models.items.behaviordetails.ImpactDetailCardModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f51.C14090a;
import f51.C14094e;
import i21.C18011u;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23639h2;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import y11.C39065r;
import y11.C39067t;

/* JADX INFO: renamed from: pb1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;", "model", "Ljb1/a;", "reducer", "Lf51/a;", "f", "(Lcom/whoop/design/models/items/behaviordetails/ImpactDetailCardModel;Ljb1/a;)Lf51/a;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "behaviorDetailsTileMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29055b {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f117568a = Function1.m68251a(new C26842g(16));

    /* JADX INFO: renamed from: pb1.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f117569w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f117569w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f117569w.invoke((BehaviorDetailsTileModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m88316c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(BehaviorDetailsTileModel.class), new a(new C26842g(17)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C14094e m88317d(BehaviorDetailsTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        return new C14094e(m88319f(model.getImpactCard(), c21535aM60555e), c21535aM60555e.m60540g(model.getImpactAdditionalDetails()));
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m88318e() {
        return f117568a;
    }

    /* JADX INFO: renamed from: f */
    private static final C14090a m88319f(ImpactDetailCardModel impactDetailCardModel, C21535a c21535a) {
        C39065r c39065rM124571b;
        InterfaceC25312u interfaceC25312uM60544l = c21535a.m60544l(impactDetailCardModel.getImpactBarSegment());
        C39065r c39065r = interfaceC25312uM60544l instanceof C39065r ? (C39065r) interfaceC25312uM60544l : null;
        if (c39065r != null) {
            C39067t similarMarkerViewState = c39065r.getSimilarMarkerViewState();
            c39065rM124571b = C39065r.m124571b(c39065r, 0.0f, null, 0.0f, 0.0f, null, null, similarMarkerViewState != null ? C39067t.m124582b(similarMarkerViewState, null, null, null, 1, null) : null, 63, null);
        } else {
            c39065rM124571b = null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(impactDetailCardModel.getTitleDisplay());
        EnumC39333f enumC39333fM68833d = C23639h2.f93783a.m68833d(impactDetailCardModel.getImpactStyle());
        TileTagModel tileTag = impactDetailCardModel.getTileTag();
        C18011u c18011uM88313a = tileTag != null ? AbstractC29054a.m88313a(tileTag) : null;
        String impactPercentageValue = impactDetailCardModel.getImpactPercentageValue();
        TextResource textResourceM21278l2 = impactPercentageValue != null ? AbstractC8693b.m21278l(impactPercentageValue) : null;
        String impactPercentageSymbol = impactDetailCardModel.getImpactPercentageSymbol();
        TextResource textResourceM21278l3 = impactPercentageSymbol != null ? AbstractC8693b.m21278l(impactPercentageSymbol) : null;
        String subBarLabel = impactDetailCardModel.getSubBarLabel();
        TextResource textResourceM21278l4 = subBarLabel != null ? AbstractC8693b.m21278l(subBarLabel) : null;
        String subBarPercent = impactDetailCardModel.getSubBarPercent();
        return new C14090a(textResourceM21278l, enumC39333fM68833d, c18011uM88313a, textResourceM21278l2, textResourceM21278l3, c39065rM124571b, textResourceM21278l4, subBarPercent != null ? AbstractC8693b.m21278l(subBarPercent) : null);
    }
}
