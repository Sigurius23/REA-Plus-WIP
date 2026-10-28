package fb0;

import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import dp0.InterfaceC12251g;
import ep0.C13404j;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import java.net.URLEncoder;
import java.util.Map;
import jd0.C21610c;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: fb0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lfb0/b;", "", "Leb/a0;", "navController", "Lj02/o0;", "navigator", "Ldp0/g;", "globalCoachManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Leb/a0;Lj02/o0;Ldp0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/navigation/e;", "navigationAction", "Ll83/a0;", "a", "(Lcom/whoop/navigation/e;)V", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "Lep0/j;", "c", "(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;", "Lfb0/a;", "navigationEvent", "b", "(Lfb0/a;)V", "Leb/a0;", "Lj02/o0;", "Ldp0/g;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14336b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C14336b(AbstractC12939a0 navController, InterfaceC21159o0 navigator, InterfaceC12251g globalCoachManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.navController = navController;
        this.navigator = navigator;
        this.globalCoachManager = globalCoachManager;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final void m40952a(C9598e navigationAction) {
        NavigationScreenModel parameters = navigationAction.getParameters();
        if (!(parameters instanceof AiCoachChatScreenModel)) {
            this.navigator.mo59392a(navigationAction);
        } else if (this.featureFlagChecker.isFeatureEnabled("wce-dynamic-bdn-deeplink-support")) {
            InterfaceC12251g.m34132f(this.globalCoachManager, 0L, null, m40953c((AiCoachChatScreenModel) parameters), 3, null);
        } else {
            this.navigator.mo59392a(navigationAction);
        }
    }

    /* JADX INFO: renamed from: c */
    private final C13404j m40953c(AiCoachChatScreenModel aiCoachChatScreenModel) {
        String sourceType = aiCoachChatScreenModel.getSourceType();
        String sourceId = aiCoachChatScreenModel.getSourceId();
        String fingerprint = aiCoachChatScreenModel.getFingerprint();
        String staticInitialMessage = aiCoachChatScreenModel.getStaticInitialMessage();
        String userMessage = aiCoachChatScreenModel.getUserMessage();
        String presetQuestionKey = aiCoachChatScreenModel.getPresetQuestionKey();
        String staticInitialMessage2 = aiCoachChatScreenModel.getStaticInitialMessage();
        boolean z4 = !(staticInitialMessage2 == null || AbstractC39414r.m125890i0(staticInitialMessage2));
        Map<String, JsonElement> args = aiCoachChatScreenModel.getArgs();
        if (args == null) {
            args = C25272z.f99163w;
        }
        Map<String, JsonElement> map = args;
        CoachEducationType coachEducationTypeM18519a = CoachEducationType.INSTANCE.m18519a(aiCoachChatScreenModel.getEducationType());
        String onboardingAnalyticSource = aiCoachChatScreenModel.getOnboardingAnalyticSource();
        if (onboardingAnalyticSource == null) {
            onboardingAnalyticSource = aiCoachChatScreenModel.getSourceId();
        }
        return new C13404j(null, null, true, null, sourceType, sourceId, null, fingerprint, staticInitialMessage, userMessage, null, null, presetQuestionKey, z4, coachEducationTypeM18519a, onboardingAnalyticSource, map, null, aiCoachChatScreenModel.getShouldOpenFullSize(), null, null, null, false, 7996491, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m40954b(AbstractC14335a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (navigationEvent instanceof AbstractC14335a.b) {
            this.navController.m36410z();
            return;
        }
        if (navigationEvent instanceof AbstractC14335a.c) {
            m40952a(((AbstractC14335a.c) navigationEvent).getNavigationAction());
            return;
        }
        if (!(navigationEvent instanceof AbstractC14335a.a)) {
            if (!(navigationEvent instanceof AbstractC14335a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            this.navigator.mo59393b(new AbstractC21155m0.z(null, null, ((AbstractC14335a.d) navigationEvent).getMessage(), null, null, null, null, null, false, null, null, null, 4091, null));
            return;
        }
        AbstractC14335a.a aVar = (AbstractC14335a.a) navigationEvent;
        String strEncode = URLEncoder.encode(aVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getId(), "UTF-8");
        InterfaceC21159o0 interfaceC21159o0 = this.navigator;
        AbstractC22676k.m65747g(strEncode);
        String tag = aVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getTag();
        if (tag == null) {
            tag = "";
        }
        interfaceC21159o0.mo59393b(new AbstractC21155m0.f3(strEncode, tag, C21610c.INSTANCE.m60775a(), null, null, 24, null));
    }
}
