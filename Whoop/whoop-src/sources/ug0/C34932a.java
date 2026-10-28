package ug0;

import androidx.core.app.NotificationCompat;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import nl0.EnumC26800b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg0.AbstractC33776a;
import zg0.AbstractC40624g;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: ug0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lug0/a;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lzg0/g;", NotificationCompat.CATEGORY_EVENT, "Ltg0/a;", "a", "(Lzg0/g;)Ltg0/a;", "Lzr2/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34932a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    public C34932a(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC33776a m110167a(AbstractC40624g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC40624g.w) {
            AbstractC40624g.w wVar = (AbstractC40624g.w) event;
            return new AbstractC33776a.u(wVar.m131808b(), wVar.m131807a());
        }
        if (event instanceof AbstractC40624g.m) {
            AbstractC40624g.m mVar = (AbstractC40624g.m) event;
            return new AbstractC33776a.k(mVar.getFileId(), mVar.getUri());
        }
        if (event instanceof AbstractC40624g.l) {
            AbstractC40624g.l lVar = (AbstractC40624g.l) event;
            return new AbstractC33776a.j(lVar.getFileId(), lVar.getFileUri());
        }
        if (event instanceof AbstractC40624g.v) {
            AbstractC40624g.v vVar = (AbstractC40624g.v) event;
            return new AbstractC33776a.t(vVar.m131806c(), vVar.m131804a(), vVar.m131805b());
        }
        if (event instanceof AbstractC40624g.h) {
            return new AbstractC33776a.f(((AbstractC40624g.h) event).getTurnId());
        }
        if (event instanceof AbstractC40624g.b) {
            AbstractC40624g.b bVar = (AbstractC40624g.b) event;
            String fingerprint = bVar.getFingerprint();
            String source = bVar.getSource();
            String sourceId = bVar.getSourceId();
            String initialMessage = bVar.getInitialMessage();
            String presetQuestionKey = bVar.getPresetQuestionKey();
            Map<String, JsonElement> mapM131767a = bVar.m131767a();
            boolean isWcePrefetch = bVar.getIsWcePrefetch();
            String initialUserTurnContent = bVar.getInitialUserTurnContent();
            return new AbstractC33776a.b(fingerprint, source, sourceId, initialMessage, presetQuestionKey, mapM131767a, isWcePrefetch, initialUserTurnContent != null ? new AbstractC33776a.d(initialUserTurnContent, EnumC26800b.USER, null, this.dateAndTimeProvider.mo133363b(), false, 20, null) : null, bVar.getEntrypointExperience(), bVar.getIsPastConversation(), bVar.getIsDay0());
        }
        if (event instanceof AbstractC40624g.q) {
            return AbstractC33776a.n.f141405a;
        }
        if (event instanceof AbstractC40624g.d) {
            AbstractC40624g.d dVar = (AbstractC40624g.d) event;
            return new AbstractC33776a.d(dVar.getContent(), dVar.getRole(), dVar.m131781b(), dVar.getUserTimestamp(), dVar.getIsSuggestion());
        }
        if (event instanceof AbstractC40624g.r) {
            return AbstractC33776a.o.f141406a;
        }
        if (event instanceof AbstractC40624g.s) {
            AbstractC40624g.s sVar = (AbstractC40624g.s) event;
            return new AbstractC33776a.p(sVar.getTurnFeedback(), sVar.getShowToast());
        }
        if (event instanceof AbstractC40624g.a) {
            AbstractC40624g.a aVar = (AbstractC40624g.a) event;
            return new AbstractC33776a.a(aVar.getRecommendationId(), aVar.getCommitted(), aVar.getReplacementId(), aVar.getActivityTitle());
        }
        if (event instanceof AbstractC40624g.o) {
            return new AbstractC33776a.d(((AbstractC40624g.o) event).getContent(), EnumC26800b.USER, null, this.dateAndTimeProvider.mo133363b(), true, 4, null);
        }
        if (event instanceof AbstractC40624g.c) {
            AbstractC40624g.c cVar = (AbstractC40624g.c) event;
            return new AbstractC33776a.c(cVar.getTurnId(), cVar.getActionId());
        }
        if (event instanceof AbstractC40624g.n) {
            return AbstractC33776a.l.f141402a;
        }
        if (event instanceof AbstractC40624g.f) {
            return AbstractC33776a.e.f141392a;
        }
        if (event instanceof AbstractC40624g.t) {
            return new AbstractC33776a.r(((AbstractC40624g.t) event).getTurnId());
        }
        if (event instanceof AbstractC40624g.u) {
            AbstractC40624g.u uVar = (AbstractC40624g.u) event;
            return new AbstractC33776a.s(uVar.getTurnId(), uVar.getIsVisible());
        }
        if (event instanceof AbstractC40624g.j) {
            return new AbstractC33776a.h(((AbstractC40624g.j) event).getIsVisible());
        }
        if (event instanceof AbstractC40624g.i) {
            AbstractC40624g.i iVar = (AbstractC40624g.i) event;
            return new AbstractC33776a.g(iVar.getFingerprint(), iVar.getTurnId());
        }
        if (event.equals(AbstractC40624g.k.f175114a)) {
            return AbstractC33776a.i.f141397a;
        }
        if (event instanceof AbstractC40624g.p) {
            return new AbstractC33776a.m(((AbstractC40624g.p) event).getError());
        }
        if ((event instanceof AbstractC40624g.e) || event.equals(AbstractC40624g.g.f175109a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
