package ab0;

import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.CoachScreenModel;
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

/* JADX INFO: renamed from: ab0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lab0/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Ldp0/g;", "globalCoachManager", "<init>", "(Lj02/o0;Leb/a0;Ldp0/g;)V", "Lep0/j;", "screenContext", "Ll83/a0;", "b", "(Lep0/j;)V", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "c", "(Lcom/whoop/navigation/AiCoachChatScreenModel;)Lep0/j;", "Lcom/whoop/navigation/CoachScreenModel;", "d", "(Lcom/whoop/navigation/CoachScreenModel;)Lep0/j;", "Lab0/a;", "navigationEvent", "a", "(Lab0/a;)V", "Lj02/o0;", "Leb/a0;", "Ldp0/g;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0707b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    public C0707b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC12251g globalCoachManager) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        this.navigator = navigator;
        this.navController = navController;
        this.globalCoachManager = globalCoachManager;
    }

    /* JADX INFO: renamed from: b */
    private final void m1765b(C13404j screenContext) {
        this.globalCoachManager.mo34145t(false, screenContext);
        this.globalCoachManager.mo34137g(0L, null, screenContext);
    }

    /* JADX INFO: renamed from: c */
    private final C13404j m1766c(AiCoachChatScreenModel aiCoachChatScreenModel) {
        String sourceType = aiCoachChatScreenModel.getSourceType();
        String sourceId = aiCoachChatScreenModel.getSourceId();
        String fingerprint = aiCoachChatScreenModel.getFingerprint();
        String staticInitialMessage = aiCoachChatScreenModel.getStaticInitialMessage();
        String staticInitialMessage2 = aiCoachChatScreenModel.getStaticInitialMessage();
        boolean z4 = !(staticInitialMessage2 == null || AbstractC39414r.m125890i0(staticInitialMessage2));
        Map<String, JsonElement> args = aiCoachChatScreenModel.getArgs();
        if (args == null) {
            args = C25272z.f99163w;
        }
        return new C13404j(null, null, true, null, sourceType, sourceId, null, fingerprint, staticInitialMessage, null, null, null, null, z4, CoachEducationType.INSTANCE.m18519a(aiCoachChatScreenModel.getEducationType()), aiCoachChatScreenModel.getSourceId(), args, null, false, null, null, null, false, 8263243, null);
    }

    /* JADX INFO: renamed from: d */
    private final C13404j m1767d(CoachScreenModel coachScreenModel) {
        String sourceType = coachScreenModel.getSourceType();
        String sourceId = coachScreenModel.getSourceId();
        String conversationSeedId = coachScreenModel.getConversationSeedId();
        String entryText = coachScreenModel.getEntryText();
        String presetQuestion = coachScreenModel.getPresetQuestion();
        boolean includeInitialMessage = coachScreenModel.getIncludeInitialMessage();
        Map<String, JsonElement> args = coachScreenModel.getArgs();
        if (args == null) {
            args = C25272z.f99163w;
        }
        return new C13404j(null, null, true, null, sourceType, sourceId, conversationSeedId, null, entryText, null, null, presetQuestion, null, includeInitialMessage, CoachEducationType.INSTANCE.m18519a(coachScreenModel.getEducationType()), coachScreenModel.getSourceId(), args, null, false, null, null, null, false, 8263307, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1768a(AbstractC0706a navigationEvent) {
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        if (navigationEvent instanceof AbstractC0706a.b) {
            this.navController.m36410z();
            return;
        }
        if (navigationEvent instanceof AbstractC0706a.a) {
            AbstractC0706a.a aVar = (AbstractC0706a.a) navigationEvent;
            String strEncode = URLEncoder.encode(aVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getId(), "UTF-8");
            InterfaceC21159o0 interfaceC21159o0 = this.navigator;
            AbstractC22676k.m65747g(strEncode);
            String tag = aVar.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String().getTag();
            if (tag == null) {
                tag = "";
            }
            interfaceC21159o0.mo59393b(new AbstractC21155m0.f3(strEncode, tag, C21610c.INSTANCE.m60775a(), null, null, 24, null));
            return;
        }
        if (!(navigationEvent instanceof AbstractC0706a.c)) {
            if (!(navigationEvent instanceof AbstractC0706a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            m1765b(new C13404j(null, null, true, null, null, null, null, null, ((AbstractC0706a.d) navigationEvent).getMessage(), null, null, null, null, true, null, null, null, null, false, null, null, null, false, 8380155, null));
            return;
        }
        AbstractC0706a.c cVar = (AbstractC0706a.c) navigationEvent;
        NavigationScreenModel parameters = cVar.getNavigationAction().getParameters();
        if (parameters instanceof AiCoachChatScreenModel) {
            m1765b(m1766c((AiCoachChatScreenModel) parameters));
        } else if (parameters instanceof CoachScreenModel) {
            m1765b(m1767d((CoachScreenModel) parameters));
        } else {
            this.navigator.mo59392a(cVar.getNavigationAction());
        }
    }
}
