package fq2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.HeaderContentModel;
import com.whoop.user.journey.model.HeaderStyle;
import com.whoop.user.journey.model.UserJourneySection;
import com.whoop.user.journey.model.UserJourneyStep;
import eq2.C13563a;
import eq2.C13564b;
import eq2.C13567e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kr2.AbstractC22815d;
import lr2.C24702c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.EnumC24674f;
import yp2.AbstractC39704a;
import zp2.AbstractC40945c;
import zp2.InterfaceC40949g;

/* JADX INFO: renamed from: fq2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lfq2/f;", "", "Lfq2/e;", "stepReducer", "<init>", "(Lfq2/e;)V", "Lzp2/c;", "result", "Leq2/e;", "a", "(Lzp2/c;)Leq2/e;", "Lfq2/e;", "", "b", "Ljava/lang/Integer;", "previousStepIndex", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14689f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14688e stepReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Integer previousStepIndex;

    public C14689f(C14688e stepReducer) {
        AbstractC22676k.m65750j(stepReducer, "stepReducer");
        this.stepReducer = stepReducer;
    }

    /* JADX INFO: renamed from: a */
    public final C13567e m42125a(AbstractC40945c result) {
        int currentStepIndex;
        TextResource textResourceM21267a;
        String title;
        String avatarUrl;
        AbstractC22676k.m65750j(result, "result");
        if (result.equals(AbstractC40945c.b.f176670a)) {
            return new C13567e(false, true, null, 4, null);
        }
        if (!(result instanceof AbstractC40945c.c)) {
            if (result instanceof AbstractC40945c.a) {
                return new C13567e(true, false, null, 4, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC40945c.c cVar = (AbstractC40945c.c) result;
        InterfaceC40949g domainState = cVar.getDomainState();
        if (domainState instanceof InterfaceC40949g.a) {
            currentStepIndex = ((InterfaceC40949g.a) domainState).getProgressResult().getCurrentStepIndex();
        } else {
            if (!(domainState instanceof InterfaceC40949g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            currentStepIndex = ((InterfaceC40949g.b) domainState).getProgressResult().getCurrentStepIndex();
        }
        int i13 = currentStepIndex;
        Integer num = this.previousStepIndex;
        this.previousStepIndex = Integer.valueOf(i13);
        InterfaceC40949g domainState2 = cVar.getDomainState();
        if (domainState2 instanceof InterfaceC40949g.a) {
            InterfaceC40949g.a aVar = (InterfaceC40949g.a) domainState2;
            List<UserJourneyStep> steps = aVar.getContentModel().getSteps();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(steps, 10));
            Iterator<T> it = steps.iterator();
            while (it.hasNext()) {
                arrayList.add(C14688e.m42120f(this.stepReducer, (UserJourneyStep) it.next(), null, null, false, 6, null));
            }
            int stepTotal = aVar.getProgressResult().getStepTotal();
            HeaderContentModel header = aVar.getContentModel().getHeader();
            AbstractC22403o aVar2 = (header == null || (avatarUrl = header.getAvatarUrl()) == null) ? new AbstractC22403o.a(AbstractC39704a.f170898c) : new AbstractC22403o.c(avatarUrl, 0, 0, 0, 14, null);
            HeaderContentModel header2 = aVar.getContentModel().getHeader();
            if (header2 == null || (title = header2.getTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(title)) == null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            return new C13567e(false, false, new C13564b(arrayList, i13, stepTotal, new C13563a(aVar2, textResourceM21267a, HeaderStyle.FULL), null, null, num, null, 144, null));
        }
        if (!(domainState2 instanceof InterfaceC40949g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC40949g.b bVar = (InterfaceC40949g.b) domainState2;
        C24702c c24702c = new C24702c(AbstractC8693b.m21278l(bVar.getContentModelV2().getLanding().getText()), AbstractC8693b.m21278l(bVar.getContentModelV2().getLanding().getSubtext()), bVar.getContentModelV2().getLanding().getImageUrl(), AbstractC8693b.m21278l(bVar.getContentModelV2().getLanding().getButtonText()), new AbstractC22815d.o(EnumC24674f.PRIMARY), false, 32, null);
        List<UserJourneySection> sections = bVar.getContentModelV2().getSections();
        ArrayList arrayList2 = new ArrayList();
        for (UserJourneySection userJourneySection : sections) {
            List<UserJourneyStep> steps2 = userJourneySection.getSteps();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(steps2, 10));
            Iterator<T> it3 = steps2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(this.stepReducer.m42124e((UserJourneyStep) it3.next(), bVar.getSubmittedTimeCapsuleText(), userJourneySection.getSectionId(), true));
            }
            AbstractC25265s.m74141p0(arrayList2, arrayList3);
        }
        return new C13567e(false, false, new C13564b(arrayList2, bVar.getProgressResult().getCurrentStepIndex(), bVar.getProgressResult().getStepTotal(), new C13563a(new AbstractC22403o.a(AbstractC39704a.f170899d), AbstractC8693b.m21267a(), HeaderStyle.SIMPLE), c24702c, bVar.getProgressResult().getSectionProgress(), null, bVar.getSubmittedTimeCapsuleText(), 64, null));
    }
}
