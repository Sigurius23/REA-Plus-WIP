package el0;

import androidx.core.app.NotificationCompat;
import fl0.AbstractC14556a;
import nl0.AbstractC26802d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: el0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lel0/b;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lnl0/d;", NotificationCompat.CATEGORY_EVENT, "Lfl0/a;", "a", "(Lnl0/d;)Lfl0/a;", "Lzr2/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13314b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    public C13314b(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC14556a m37419a(AbstractC26802d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC26802d.l) {
            AbstractC26802d.l lVar = (AbstractC26802d.l) event;
            return new AbstractC14556a.i(lVar.getUserQuestion(), lVar.getMessageId(), lVar.m79919b(), lVar.m79918a(), Long.valueOf(this.dateAndTimeProvider.mo133363b()), lVar.getIsVoiceInput(), lVar.getRetryAnalyticsData());
        }
        if (event instanceof AbstractC26802d.m) {
            AbstractC26802d.m mVar = (AbstractC26802d.m) event;
            return new AbstractC14556a.j(mVar.getUserQuestion(), mVar.getMessageId(), mVar.getRetryAnalyticsData());
        }
        if (event instanceof AbstractC26802d.h) {
            AbstractC26802d.h hVar = (AbstractC26802d.h) event;
            return new AbstractC14556a.k(hVar.getContextualMessage(), hVar.getConversationIdSeed(), hVar.getSourceType(), hVar.getPresetQuestion(), hVar.getIncludeInitialMessage(), hVar.getHasLocationPermission(), hVar.getSourceId(), hVar.m79906a(), Long.valueOf(this.dateAndTimeProvider.mo133363b()));
        }
        if (event instanceof AbstractC26802d.n) {
            return AbstractC14556a.l.f53227a;
        }
        if (event.equals(AbstractC26802d.i.f106778a)) {
            return new AbstractC14556a.k(null, null, null, null, false, false, null, null, Long.valueOf(this.dateAndTimeProvider.mo133363b()), 255, null);
        }
        if (event instanceof AbstractC26802d.s) {
            return new AbstractC14556a.f(((AbstractC26802d.s) event).getConversationId());
        }
        if (event.equals(AbstractC26802d.e.f106767a)) {
            return AbstractC14556a.e.f53204a;
        }
        if (event instanceof AbstractC26802d.d) {
            return new AbstractC14556a.d(((AbstractC26802d.d) event).getConversationId());
        }
        if (event instanceof AbstractC26802d.c) {
            return new AbstractC14556a.c(((AbstractC26802d.c) event).getSupportActionTileId());
        }
        if (event instanceof AbstractC26802d.b) {
            return AbstractC14556a.b.f53201a;
        }
        if (event instanceof AbstractC26802d.a) {
            AbstractC26802d.a aVar = (AbstractC26802d.a) event;
            return new AbstractC14556a.a(aVar.getCommitted(), aVar.getRecommendationId(), aVar.getFromGhostTile(), aVar.getReplacementId(), aVar.getActivityName());
        }
        if (event instanceof AbstractC26802d.r) {
            return new AbstractC14556a.m(((AbstractC26802d.r) event).m79937a());
        }
        if (!(event instanceof AbstractC26802d.j)) {
            return null;
        }
        AbstractC26802d.j jVar = (AbstractC26802d.j) event;
        return new AbstractC14556a.h(jVar.getFileId(), jVar.getFileUri());
    }
}
