package nq1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ArchMiniBehaviorDetailsModel;
import com.whoop.design.models.items.BehaviorDetailsTileImpactCard;
import com.whoop.design.models.items.BehaviorDetailsTileModel;
import com.whoop.design.models.items.ImpactBarSegmentModel;
import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e31.C12612d;
import f51.C14090a;
import f51.C14094e;
import i21.C18011u;
import iq1.C20848a;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import no1.C26993g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.C23639h2;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import pb1.AbstractC29054a;
import pq1.C29483g;
import y11.C39065r;
import y11.C39067t;

/* JADX INFO: renamed from: nq1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "Ly11/r;", "barViewState", "Lf51/a;", "j", "(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ly11/r;)Lf51/a;", "Ljb1/a;", "a", "Ljb1/a;", "i", "()Ljb1/a;", "behaviorDetailsDesignItemReducer", "behavior-impact_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27056a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f108165a = AbstractC21537c.m60554d(new C26993g(2));

    /* JADX INFO: renamed from: nq1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f108166w;

        public a(Function1 function1) {
            this.f108166w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f108166w.invoke((ArchMiniBehaviorDetailsModel) it);
        }
    }

    /* JADX INFO: renamed from: nq1.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f108167w;

        public b(Function1 function1) {
            this.f108167w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f108167w.invoke((BehaviorDetailsTileModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m81285e(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C26993g(3));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m81286f(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C26993g c26993g = new C26993g(4);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ArchMiniBehaviorDetailsModel.class), new a(c26993g));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(BehaviorDetailsTileModel.class), new b(new C26993g(5)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C29483g m81287g(ArchMiniBehaviorDetailsModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C29483g(new C20848a(new C20848a.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, 2, null), model.getPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C14094e m81288h(BehaviorDetailsTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        C39065r c39065rM124571b = null;
        c39065rM124571b = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        ImpactBarSegmentModel impactBarSegment = model.getImpactCard().getImpactBarSegment();
        if (impactBarSegment != null) {
            InterfaceC25312u interfaceC25312uM60544l = c21535aM60555e.m60544l(impactBarSegment);
            C39065r c39065r = interfaceC25312uM60544l instanceof C39065r ? (C39065r) interfaceC25312uM60544l : null;
            if (c39065r != null) {
                C39067t similarMarkerViewState = c39065r.getSimilarMarkerViewState();
                c39065rM124571b = C39065r.m124571b(c39065r, 0.0f, null, 0.0f, 0.0f, null, null, similarMarkerViewState != null ? C39067t.m124582b(similarMarkerViewState, null, null, null, 1, null) : null, 63, null);
            }
        }
        return new C14094e(m81290j(model.getImpactCard(), c39065rM124571b), c21535aM60555e.m60540g(model.getImpactAdditionalDetails()));
    }

    /* JADX INFO: renamed from: i */
    public static final C21535a m81289i() {
        return f108165a;
    }

    /* JADX INFO: renamed from: j */
    private static final C14090a m81290j(BehaviorDetailsTileImpactCard behaviorDetailsTileImpactCard, C39065r c39065r) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(behaviorDetailsTileImpactCard.getTitleDisplay());
        EnumC39333f enumC39333fM68833d = C23639h2.f93783a.m68833d(behaviorDetailsTileImpactCard.getImpactStyle());
        TileTagModel tileTag = behaviorDetailsTileImpactCard.getTileTag();
        C18011u c18011uM88313a = tileTag != null ? AbstractC29054a.m88313a(tileTag) : null;
        String impactPercentageValue = behaviorDetailsTileImpactCard.getImpactPercentageValue();
        TextResource textResourceM21278l2 = impactPercentageValue != null ? AbstractC8693b.m21278l(impactPercentageValue) : null;
        String impactPercentageSymbol = behaviorDetailsTileImpactCard.getImpactPercentageSymbol();
        TextResource textResourceM21278l3 = impactPercentageSymbol != null ? AbstractC8693b.m21278l(impactPercentageSymbol) : null;
        String subBarLabel = behaviorDetailsTileImpactCard.getSubBarLabel();
        TextResource textResourceM21278l4 = subBarLabel != null ? AbstractC8693b.m21278l(subBarLabel) : null;
        String subBarPercent = behaviorDetailsTileImpactCard.getSubBarPercent();
        return new C14090a(textResourceM21278l, enumC39333fM68833d, c18011uM88313a, textResourceM21278l2, textResourceM21278l3, c39065r, textResourceM21278l4, subBarPercent != null ? AbstractC8693b.m21278l(subBarPercent) : null);
    }
}
