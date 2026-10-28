package ru1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.lastnightsleep.domain.models.DetailsGraphingCardModel;
import com.whoop.lastnightsleep.domain.models.LastNightSleepSectionModel;
import com.whoop.lastnightsleep.domain.models.LastNightSleepSpacingType;
import com.whoop.lastnightsleep.domain.models.SubHeaderModel;
import e31.C12612d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nu1.C27139c;
import nu1.InterfaceC27137a;
import p31.C28801l;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qu1.C30625a;
import qu1.C30630f;
import qu1.C30631g;
import qu1.C30632h;
import qu1.InterfaceC30627c;
import uu1.C35238c;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ru1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lru1/b;", "", "Lru1/a;", "detailsGraphingCardReducer", "<init>", "(Lru1/a;)V", "Lnu1/c;", "Lqu1/f;", "d", "(Lnu1/c;)Lqu1/f;", "Lnu1/a$a;", "c", "(Lnu1/a$a;)Lqu1/f;", "", "spacing", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;", "a", "(Ljava/lang/String;)Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSpacingType;", "domainResult", "b", "Lru1/a;", "getDetailsGraphingCardReducer", "()Lru1/a;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31819b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C31818a detailsGraphingCardReducer;

    public C31819b(C31818a detailsGraphingCardReducer) {
        AbstractC22676k.m65750j(detailsGraphingCardReducer, "detailsGraphingCardReducer");
        this.detailsGraphingCardReducer = detailsGraphingCardReducer;
    }

    /* JADX INFO: renamed from: a */
    private final LastNightSleepSpacingType m98883a(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return LastNightSleepSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? LastNightSleepSpacingType.COMPACT : LastNightSleepSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: c */
    private final C30630f m98884c(InterfaceC27137a.a aVar) {
        if (aVar instanceof InterfaceC27137a.b) {
            return new C30630f(null, null, null, new C30631g(C12612d.f43056a.m35366a(), null, null, 6, null), 7, null);
        }
        if (!(aVar instanceof InterfaceC27137a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC27137a.c cVar = (InterfaceC27137a.c) aVar;
        return new C30630f(null, null, null, new C30631g(C12612d.f43056a.m35368c(), null, !AbstractC39414r.m125890i0(cVar.getPath()) ? new InterfaceC30627c.j(cVar.getPath()) : null, 2, null), 7, null);
    }

    /* JADX INFO: renamed from: d */
    private final C30630f m98885d(C27139c c27139c) {
        C35238c c35238c;
        LastNightSleepSpacingType lastNightSleepSpacingTypeM98883a;
        if (c27139c.getResponse() == null) {
            return m98884c(new InterfaceC27137a.c(""));
        }
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(c27139c.getResponse().getHeaderSection());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.sectionheader.HomeSectionHeaderItemState");
        C28801l c28801l = (C28801l) interfaceC25312uM60541h;
        SubHeaderModel subHeaderSection = c27139c.getResponse().getSubHeaderSection();
        if (subHeaderSection != null) {
            String subHeader = subHeaderSection.getSubHeader();
            String subHeaderEnd = subHeaderSection.getSubHeaderEnd();
            c35238c = new C35238c(subHeader, subHeaderEnd != null ? subHeaderEnd : "");
        } else {
            c35238c = null;
        }
        List<LastNightSleepSectionModel> sections = c27139c.getResponse().getSections();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : sections) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            LastNightSleepSectionModel lastNightSleepSectionModel = (LastNightSleepSectionModel) obj;
            String insetBottom = lastNightSleepSectionModel.getInsetBottom();
            if (insetBottom == null || (lastNightSleepSpacingTypeM98883a = m98883a(insetBottom)) == null) {
                lastNightSleepSpacingTypeM98883a = LastNightSleepSpacingType.COMPACT;
            }
            List<DesignSystemModel> items = lastNightSleepSectionModel.getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            for (DesignSystemModel designSystemModel : items) {
                arrayList2.add(designSystemModel instanceof DetailsGraphingCardModel ? new C30625a(this.detailsGraphingCardReducer.m98880e((DetailsGraphingCardModel) designSystemModel, c27139c), i13 == AbstractC37056f.m118951C(c27139c.getResponse().getSections()) ? LastNightSleepSpacingType.NONE : lastNightSleepSpacingTypeM98883a) : new C30625a(c21535aM60555e.m60541h(designSystemModel), lastNightSleepSpacingTypeM98883a));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList2);
            i13 = i14;
        }
        return new C30630f(new C30632h(arrayList), c28801l, c35238c, null, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public final C30630f m98886b(C27139c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC27137a.a ? m98884c((InterfaceC27137a.a) domainResult.getCurrentDialogType()) : m98885d(domainResult);
    }
}
