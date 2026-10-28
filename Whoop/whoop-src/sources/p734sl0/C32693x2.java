package p734sl0;

import fl0.AbstractC14566k;
import nl0.AbstractC26802d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sl0.x2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lsl0/x2;", "", "<init>", "()V", "Lfl0/k;", "retryAction", "Lnl0/d;", "a", "(Lfl0/k;)Lnl0/d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32693x2 {
    /* JADX INFO: renamed from: a */
    public final AbstractC26802d m102586a(AbstractC14566k retryAction) {
        AbstractC22676k.m65750j(retryAction, "retryAction");
        if (retryAction instanceof AbstractC14566k.b) {
            AbstractC14566k.b bVar = (AbstractC14566k.b) retryAction;
            return new AbstractC26802d.h(bVar.getInitialMessage(), bVar.getCycleOrActivityId(), bVar.getSource(), bVar.getPresetQuestion(), bVar.getIncludeInitialMessage(), bVar.getHasLocationPermission(), null, null, 192, null);
        }
        if (!(retryAction instanceof AbstractC14566k.e)) {
            return null;
        }
        AbstractC14566k.e eVar = (AbstractC14566k.e) retryAction;
        if (!eVar.getIsSuggestion()) {
            return new AbstractC26802d.l(eVar.getMessageContent(), 0, eVar.getMessageId(), null, null, false, eVar.getAnalyticsData(), 58, null);
        }
        return new AbstractC26802d.m(eVar.getMessageContent(), 0, 0, eVar.getConversationId(), eVar.getMessageId(), eVar.getAnalyticsData(), 6, null);
    }
}
