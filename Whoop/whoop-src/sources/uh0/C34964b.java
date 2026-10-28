package uh0;

import c93.InterfaceC4339a;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.navigation.AiCoachChatScreenModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import dp0.InterfaceC12251g;
import ep0.C13404j;
import j02.InterfaceC21159o0;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import m83.C25272z;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uh0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Luh0/b;", "", "Leb/a0;", "composeNavController", "Lj02/o0;", "navigator", "Ldp0/g;", "globalCoachManager", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "<init>", "(Leb/a0;Lj02/o0;Ldp0/g;Lc93/a;)V", "Lcom/whoop/navigation/e;", "action", "a", "(Lcom/whoop/navigation/e;)V", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "model", "b", "(Lcom/whoop/navigation/AiCoachChatScreenModel;)V", "Luh0/a;", "navEvent", "c", "(Luh0/a;)V", "Leb/a0;", "Lj02/o0;", "Ldp0/g;", "d", "Lc93/a;", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34964b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 composeNavController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a onDismiss;

    public C34964b(AbstractC12939a0 composeNavController, InterfaceC21159o0 navigator, InterfaceC12251g globalCoachManager, InterfaceC4339a onDismiss) {
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        this.composeNavController = composeNavController;
        this.navigator = navigator;
        this.globalCoachManager = globalCoachManager;
        this.onDismiss = onDismiss;
    }

    /* JADX INFO: renamed from: a */
    private final void m110426a(C9598e action) {
        NavigationScreenModel parameters = action.getParameters();
        if ((action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9424u0) && (parameters instanceof AiCoachChatScreenModel)) {
            m110427b((AiCoachChatScreenModel) parameters);
        } else {
            this.navigator.mo59392a(action);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m110427b(AiCoachChatScreenModel model) {
        String sourceType = model.getSourceType();
        String sourceId = model.getSourceId();
        String fingerprint = model.getFingerprint();
        String staticInitialMessage = model.getStaticInitialMessage();
        String presetQuestionKey = model.getPresetQuestionKey();
        String staticInitialMessage2 = model.getStaticInitialMessage();
        boolean z4 = !(staticInitialMessage2 == null || AbstractC39414r.m125890i0(staticInitialMessage2));
        Map<String, JsonElement> args = model.getArgs();
        if (args == null) {
            args = C25272z.f99163w;
        }
        this.globalCoachManager.mo34145t(false, new C13404j(null, null, true, null, sourceType, sourceId, null, fingerprint, staticInitialMessage, null, null, null, presetQuestionKey, z4, CoachEducationType.INSTANCE.m18519a(model.getEducationType()), null, args, null, false, null, null, null, false, 8293963, null));
        InterfaceC12251g.m34132f(this.globalCoachManager, 0L, null, null, 6, null);
        this.onDismiss.invoke();
    }

    /* JADX INFO: renamed from: c */
    public final void m110428c(AbstractC34963a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        if (!(navEvent instanceof AbstractC34963a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        m110426a(((AbstractC34963a.a) navEvent).getDestination());
    }
}
