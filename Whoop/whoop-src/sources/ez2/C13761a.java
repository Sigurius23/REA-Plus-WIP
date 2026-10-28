package ez2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.domain.DwlCampaignSection;
import com.whoop.whooplabs.data.domain.DwlCampaignSectionEmptyState;
import com.whoop.whooplabs.data.domain.DwlImpactSection;
import com.whoop.whooplabs.data.domain.DwlLanding;
import dz2.InterfaceC12471b;
import ev2.C13693b;
import hz2.C17816a;
import hz2.C17817b;
import hz2.C17818c;
import hz2.InterfaceC17819d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ez2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lez2/a;", "", "Ljb1/a;", "designReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/whooplabs/data/domain/DwlLanding;", "Lhz2/d$b;", "g", "(Lcom/whoop/whooplabs/data/domain/DwlLanding;)Lhz2/d$b;", "Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;", "Lhz2/b;", "e", "(Lcom/whoop/whooplabs/data/domain/DwlCampaignSection;)Lhz2/b;", "Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;", "Lhz2/a;", "d", "(Lcom/whoop/whooplabs/data/domain/DwlCampaignSectionEmptyState;)Lhz2/a;", "Lcom/whoop/whooplabs/data/domain/DwlImpactSection;", "Lhz2/c;", "f", "(Lcom/whoop/whooplabs/data/domain/DwlImpactSection;)Lhz2/c;", "Ldz2/b;", "domainState", "Lhz2/d;", "c", "(Ldz2/b;)Lhz2/d;", "a", "Ljb1/a;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13761a {

    /* JADX INFO: renamed from: b */
    public static final int f49110b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designReducer;

    public C13761a(C21535a designReducer) {
        AbstractC22676k.m65750j(designReducer, "designReducer");
        this.designReducer = designReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m39124b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final C17816a m39125d(DwlCampaignSectionEmptyState dwlCampaignSectionEmptyState) {
        String imageUrl = dwlCampaignSectionEmptyState.getImageUrl();
        return new C17816a(imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null, AbstractC8693b.m21279m(dwlCampaignSectionEmptyState.getTitle()), AbstractC8693b.m21279m(dwlCampaignSectionEmptyState.getBody()));
    }

    /* JADX INFO: renamed from: e */
    private final C17817b m39126e(DwlCampaignSection dwlCampaignSection) {
        List<InterfaceC25312u> listM60540g;
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(dwlCampaignSection.getTitle());
        TextResource.C8691e c8691eM21279m2 = AbstractC8693b.m21279m(dwlCampaignSection.getSubtitle());
        List<DesignSystemModel> items = dwlCampaignSection.getItems();
        if (items == null || (listM60540g = this.designReducer.m60540g(items)) == null) {
            listM60540g = C25271y.f99162w;
        }
        DwlCampaignSectionEmptyState emptyState = dwlCampaignSection.getEmptyState();
        return new C17817b(c8691eM21279m, c8691eM21279m2, listM60540g, emptyState != null ? m39125d(emptyState) : null);
    }

    /* JADX INFO: renamed from: f */
    private final C17818c m39127f(DwlImpactSection dwlImpactSection) {
        List<InterfaceC25312u> listM60540g;
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(dwlImpactSection.getTitle());
        List<DesignSystemModel> items = dwlImpactSection.getItems();
        if (items == null || (listM60540g = this.designReducer.m60540g(items)) == null) {
            listM60540g = C25271y.f99162w;
        }
        return new C17818c(c8691eM21279m, listM60540g);
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC17819d.b m39128g(DwlLanding dwlLanding) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(dwlLanding.getToolbarTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(dwlLanding.getHeaderTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(dwlLanding.getHeaderBody());
        AbstractC22403o abstractC22403oM64503l = AbstractC22404p.m64503l(dwlLanding.getPageBackgroundImageUrl());
        List<DwlCampaignSection> campaignSections = dwlLanding.getCampaignSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(campaignSections, 10));
        Iterator<T> it = campaignSections.iterator();
        while (it.hasNext()) {
            arrayList.add(m39126e((DwlCampaignSection) it.next()));
        }
        DwlImpactSection impactSection = dwlLanding.getImpactSection();
        C17818c c17818cM39127f = impactSection != null ? m39127f(impactSection) : null;
        TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(dwlLanding.getFooterText());
        DesignSystemModel footer = dwlLanding.getFooter();
        return new InterfaceC17819d.b(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, abstractC22403oM64503l, arrayList, c17818cM39127f, c8691eM21279m, footer != null ? this.designReducer.m60544l(footer) : null);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC17819d m39129c(InterfaceC12471b domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.equals(InterfaceC12471b.c.f42554a)) {
            return InterfaceC17819d.c.f69303a;
        }
        if (domainState.equals(InterfaceC12471b.a.f42552a)) {
            return InterfaceC17819d.a.f69294a;
        }
        if (domainState instanceof InterfaceC12471b.b) {
            return m39128g(((InterfaceC12471b.b) domainState).getLanding());
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C13761a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21537c.m60554d(new C13693b(11)) : c21535a);
    }
}
