package kc0;

import c41.C4092p2;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextBottomSheet;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextMultipleChoiceOption;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextResponse;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreen;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenContent;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenId;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.SingleSelectScreenContent;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.UnknownScreenContent;
import com.whoop.design.models.InfoCalloutTileModel;
import gc0.AbstractC15706c;
import gc0.C15708e;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc0.C21604d;
import jc0.InterfaceC21601a;
import kd1.AbstractC22403o;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25267u;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23653j2;
import p736sz0.C33205o0;

/* JADX INFO: renamed from: kc0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lkc0/a;", "", "<init>", "()V", "Lgc0/c$f;", "Ljc0/d;", "f", "(Lgc0/c$f;)Ljc0/d;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;", HMSTrackSource.SCREEN, "", "testId", "Lgc0/e;", "progressResult", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;", "response", "Ljc0/d$e;", "c", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;", "content", "d", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/SingleSelectScreenContent;Ljava/lang/String;Lgc0/e;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;)Ljc0/d$e;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;", "option", "Ljc0/d$d;", "b", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextMultipleChoiceOption;)Ljc0/d$d;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "contextBottomSheet", "Ljc0/d$b;", "a", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;)Ljc0/d$b;", "Lgc0/c;", "domainResult", "e", "(Lgc0/c;)Ljc0/d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22349a {
    /* JADX INFO: renamed from: a */
    private final C21604d.b m64226a(HormonalContextBottomSheet contextBottomSheet) {
        return new C21604d.b(contextBottomSheet.getTitle(), contextBottomSheet.getContent(), new C27256h(contextBottomSheet.getPrimaryButton().getTitle(), null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554430, null));
    }

    /* JADX INFO: renamed from: b */
    private final C21604d.d m64227b(HormonalContextMultipleChoiceOption option) {
        String id4 = option.getId();
        String title = option.getTitle();
        String subtitle = option.getSubtitle();
        String nextScreenId = option.getNextScreenId();
        HormonalContextScreenId hormonalContextScreenId = null;
        if (nextScreenId != null) {
            for (HormonalContextScreenId hormonalContextScreenId2 : HormonalContextScreenId.values()) {
                if (AbstractC22676k.m65745e(hormonalContextScreenId2.name(), nextScreenId)) {
                    hormonalContextScreenId = hormonalContextScreenId2;
                    break;
                }
            }
        }
        return new C21604d.d(id4, title, subtitle, hormonalContextScreenId);
    }

    /* JADX INFO: renamed from: c */
    private final C21604d.e m64228c(HormonalContextScreen screen, String testId, C15708e progressResult, HormonalContextResponse response) {
        HormonalContextScreenContent content = screen.getContent();
        if (content instanceof SingleSelectScreenContent) {
            return m64229d((SingleSelectScreenContent) content, testId, progressResult, response);
        }
        return content instanceof UnknownScreenContent ? new C21604d.e(null) : new C21604d.e(null);
    }

    /* JADX INFO: renamed from: d */
    private final C21604d.e m64229d(SingleSelectScreenContent content, String testId, C15708e progressResult, HormonalContextResponse response) {
        boolean zM65745e = AbstractC22676k.m65745e(progressResult.getCurrentScreenId().name(), response.getInitialScreen());
        String title = content.getTitle();
        String subtitle = content.getSubtitle();
        String imageUrl = content.getImageUrl();
        EnumC16313m0 enumC16313m0 = null;
        AbstractC22403o.c cVar = imageUrl != null ? new AbstractC22403o.c(imageUrl, 0, 0, 0, 14, null) : null;
        InfoCalloutTileModel infoCallout = content.getInfoCallout();
        C4092p2 c4092p2M68922b = infoCallout != null ? AbstractC23653j2.m68922b(infoCallout) : null;
        HormonalContextBottomSheet bottomSheet = content.getBottomSheet();
        C21604d.b bVarM64226a = bottomSheet != null ? m64226a(bottomSheet) : null;
        String footerText = content.getFooterText();
        String optionsHeader = content.getOptionsHeader();
        String optionsHeaderIcon = content.getOptionsHeaderIcon();
        for (EnumC16313m0 enumC16313m1 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m1.name(), optionsHeaderIcon)) {
                enumC16313m0 = enumC16313m1;
                break;
            }
        }
        if (enumC16313m0 == null) {
            enumC16313m0 = EnumC16313m0.EDUCATION;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m0;
        List<HormonalContextMultipleChoiceOption> options = content.getOptions();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(m64227b((HormonalContextMultipleChoiceOption) it.next()));
        }
        return new C21604d.e(new C21604d.c.a(title, subtitle, cVar, c4092p2M68922b, bVarM64226a, footerText, optionsHeader, enumC16313m2, arrayList, content.getSelectedOptionId(), content.getNextButtonTitle(), content.getSaveButtonTitle(), content.getSelectedOptionId() != null, testId, progressResult.getCurrentScreenId(), zM65745e));
    }

    /* JADX INFO: renamed from: f */
    private final C21604d m64230f(AbstractC15706c.f fVar) {
        Object next;
        HormonalContextResponse response = fVar.getResponse();
        String strName = fVar.getProgressResult().getCurrentScreenId().name();
        Iterator<T> it = response.getIntakeScreens().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((HormonalContextScreen) next).getId(), strName));
        HormonalContextScreen hormonalContextScreen = (HormonalContextScreen) next;
        return hormonalContextScreen == null ? new C21604d(null, null, 1, null) : new C21604d(null, m64228c(hormonalContextScreen, fVar.getSaveRequest().getTestId(), fVar.getProgressResult(), fVar.getResponse()), 1, null);
    }

    /* JADX INFO: renamed from: e */
    public final C21604d m64231e(AbstractC15706c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC15706c.b) {
            return new C21604d(new C21604d.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 2, null);
        }
        if (domainResult instanceof AbstractC15706c.d) {
            return new C21604d(new C21604d.a(C33205o0.f138451a.m105293g(), InterfaceC21601a.c.f82827a, null, null, 12, null), null, 2, null);
        }
        if (domainResult instanceof AbstractC15706c.a) {
            return new C21604d(new C21604d.a(C33205o0.f138451a.m105291e(), null, null, InterfaceC21601a.c.f82827a, 6, null), null, 2, null);
        }
        if (domainResult instanceof AbstractC15706c.f) {
            AbstractC15706c.f fVar = (AbstractC15706c.f) domainResult;
            return fVar.getShouldExit() ? new C21604d(new C21604d.a(C33205o0.f138451a.m105293g(), null, null, null, 14, null), null, 2, null) : m64230f(fVar);
        }
        if (domainResult instanceof AbstractC15706c.e) {
            return new C21604d(new C21604d.a(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 2, null);
        }
        if (domainResult instanceof AbstractC15706c.c) {
            return new C21604d(new C21604d.a(C33205o0.f138451a.m105291e(), null, null, InterfaceC21601a.c.f82827a, 6, null), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
