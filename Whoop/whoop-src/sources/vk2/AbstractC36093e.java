package vk2;

import com.whoop.activitysession.PauseSegment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import x90.AbstractC38102h;

/* JADX INFO: renamed from: vk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lvk2/b;", "", "sessionElapsedMs", "c", "(Lvk2/b;J)Lvk2/b;", "d", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36093e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C36090b m114668c(C36090b c36090b, long j7) {
        if (AbstractC38102h.m122077b(c36090b.m114632f())) {
            return c36090b;
        }
        return C36090b.m114627b(c36090b, 0L, 0L, null, AbstractC25265s.m74128f1(new PauseSegment(j7, (Long) null, 2, (DefaultConstructorMarker) null), c36090b.m114632f()), null, null, null, null, null, false, MessageListItemViewType.LINK_ATTACHMENTS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C36090b m114669d(C36090b c36090b, long j7) {
        PauseSegment pauseSegment = (PauseSegment) AbstractC25265s.m74114R0(c36090b.m114632f());
        if (pauseSegment != null) {
            if (pauseSegment.getEndTimeMs() != null) {
                pauseSegment = null;
            }
            PauseSegment pauseSegment2 = pauseSegment;
            if (pauseSegment2 != null) {
                return C36090b.m114627b(c36090b, 0L, 0L, null, AbstractC25265s.m74128f1(PauseSegment.copy$default(pauseSegment2, 0L, Long.valueOf(j7), 1, null), AbstractC25265s.m74086A0(1, c36090b.m114632f())), null, null, null, null, null, false, MessageListItemViewType.LINK_ATTACHMENTS, null);
            }
        }
        return c36090b;
    }
}
