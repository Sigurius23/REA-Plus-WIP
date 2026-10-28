package xf1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveyModels;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveySectionModel;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveySectionSpacingType;
import com.whoop.feedbacksurvey.domain.models.FeedbackSurveyStickyModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import tf1.C33764c;
import tf1.InterfaceC33762a;
import wf1.C37245c;
import wf1.InterfaceC37243a;

/* JADX INFO: renamed from: xf1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u0007*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lxf1/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Ltf1/a$b;", "Lwf1/c;", "c", "(Ltf1/a$b;)Lwf1/c;", "Ltf1/c;", "Lwf1/c$b;", "dialog", "d", "(Ltf1/c;Lwf1/c$b;)Lwf1/c;", "", "spacing", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;", "a", "(Ljava/lang/String;)Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;", "domainResult", "b", "(Ltf1/c;)Lwf1/c;", "Ljb1/a;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38261a {

    /* JADX INFO: renamed from: b */
    public static final int f164041b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C38261a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final FeedbackSurveySectionSpacingType m122593a(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return FeedbackSurveySectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? FeedbackSurveySectionSpacingType.COMPACT : FeedbackSurveySectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: c */
    private final C37245c m122594c(InterfaceC33762a.b bVar) {
        if (bVar instanceof InterfaceC33762a.c) {
            return new C37245c(null, new C37245c.c(C33205o0.f138451a.m105288b(), null, null, null, null, 30, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC33762a.d) {
            return new C37245c(null, new C37245c.c(C33205o0.f138451a.m105289c(), ((InterfaceC33762a.d) bVar).getRetryEvent(), null, InterfaceC37243a.f.f159304a, null, 20, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC33762a.e) {
            return new C37245c(null, new C37245c.c(C33205o0.f138451a.m105291e(), ((InterfaceC33762a.e) bVar).getRetryEvent(), null, InterfaceC37243a.f.f159304a, null, 20, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC33762a.a) {
            return new C37245c(null, new C37245c.c(C33205o0.f138451a.m105287a(), InterfaceC37243a.f.f159304a, null, null, null, 28, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    private final C37245c m122595d(C33764c c33764c, C37245c.b bVar) {
        ?? r10;
        TextResource textResourceM21267a;
        List<FeedbackSurveySectionModel> sections;
        FeedbackSurveySectionSpacingType feedbackSurveySectionSpacingTypeM122593a;
        String toolBarTitle;
        List<DesignSystemModel> items;
        List<InterfaceC25312u> listM60540g;
        FeedbackSurveyModels response = c33764c.getResponse();
        FeedbackSurveyStickyModel stickyButtons = response != null ? response.getStickyButtons() : null;
        String text = stickyButtons != null ? stickyButtons.getText() : null;
        ?? arrayList = C25271y.f99162w;
        if (stickyButtons == null || (items = stickyButtons.getItems()) == null || (listM60540g = this.reducer.m60540g(items)) == null) {
            r10 = listM60540g;
            r10 = arrayList;
        }
        r10 = listM60540g;
        C37245c.e eVar = new C37245c.e(text, r10);
        FeedbackSurveyModels response2 = c33764c.getResponse();
        if (response2 == null || (toolBarTitle = response2.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        FeedbackSurveyModels response3 = c33764c.getResponse();
        if (response3 != null && (sections = response3.getSections()) != null) {
            List<FeedbackSurveySectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (FeedbackSurveySectionModel feedbackSurveySectionModel : list) {
                String insetBottom = feedbackSurveySectionModel.getInsetBottom();
                if (insetBottom == null || (feedbackSurveySectionSpacingTypeM122593a = m122593a(insetBottom)) == null) {
                    feedbackSurveySectionSpacingTypeM122593a = FeedbackSurveySectionSpacingType.COMPACT;
                }
                arrayList.add(new C37245c.a(this.reducer.m60540g(feedbackSurveySectionModel.getItems()), feedbackSurveySectionSpacingTypeM122593a));
            }
        }
        return new C37245c(bVar, null, new C37245c.d(textResourceM21267a, arrayList, !c33764c.getManualRefresh() && c33764c.getDisplayRefreshingSpinner(), eVar), 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final C37245c m122596b(C33764c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC33762a.b ? m122594c((InterfaceC33762a.b) domainResult.getCurrentDialogType()) : m122595d(domainResult, null);
    }

    public /* synthetic */ C38261a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC38262b.f164043a : c21535a);
    }
}
