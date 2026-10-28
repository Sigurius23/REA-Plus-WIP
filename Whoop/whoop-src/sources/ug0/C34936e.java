package ug0;

import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.p057ai.chat.models.AIConversation;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg0.C33777b;
import xg0.AbstractC38269a;

/* JADX INFO: renamed from: ug0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001d0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001f"}, m65681d2 = {"Lug0/e;", "", "<init>", "()V", "Lcom/whoop/ai/chat/models/AITurn;", "", "b", "(Lcom/whoop/ai/chat/models/AITurn;)Z", "", "turnId", "isVisible", "Ll83/a0;", "d", "(Ljava/lang/String;Z)V", "c", "(Z)V", "fingerprint", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ltg0/b;", "result", "", "e", "(Ltg0/b;)Ljava/util/List;", "", "Ljava/util/Set;", "visibleTurnIds", "Z", "isReadingVisible", "Ll83/k;", "reported", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34936e {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isReadingVisible;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Set<String> visibleTurnIds = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Set<C23465k> reported = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    private final boolean m110260b(AITurn aITurn) {
        AIMessage aIMessage = (AIMessage) AbstractC25265s.m74114R0(aITurn.getMessages());
        if (aIMessage == null || !AbstractC38269a.m122609b(aIMessage)) {
            return false;
        }
        return aITurn.getTurnStatus() == AiMessageStatus.COMPLETE || aITurn.getTurnStatus() == AiMessageStatus.STOPPED;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m110261a(String fingerprint, String turnId) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(turnId, "turnId");
        return this.reported.add(new C23465k(fingerprint, turnId));
    }

    /* JADX INFO: renamed from: c */
    public final void m110262c(boolean isVisible) {
        this.isReadingVisible = isVisible;
    }

    /* JADX INFO: renamed from: d */
    public final void m110263d(String turnId, boolean isVisible) {
        AbstractC22676k.m65750j(turnId, "turnId");
        if (isVisible) {
            this.visibleTurnIds.add(turnId);
        } else {
            this.visibleTurnIds.remove(turnId);
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<String> m110264e(C33777b result) {
        AIConversation conversation;
        AbstractC22676k.m65750j(result, "result");
        boolean z4 = this.isReadingVisible;
        C25271y c25271y = C25271y.f99162w;
        if (!z4 || (conversation = result.getConversation()) == null) {
            return c25271y;
        }
        String fingerprint = conversation.getMetadata().getFingerprint();
        AITurn aITurn = (AITurn) AbstractC25265s.m74114R0(conversation.getTurns());
        String id4 = aITurn != null ? aITurn.getId() : null;
        List<AITurn> turns = conversation.getTurns();
        ArrayList arrayList = new ArrayList();
        for (Object obj : turns) {
            AITurn aITurn2 = (AITurn) obj;
            if (this.visibleTurnIds.contains(aITurn2.getId()) && m110260b(aITurn2) && (!AbstractC22676k.m65745e(aITurn2.getId(), id4) || result.getIsInterpolationComplete())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AITurn) it.next()).getId());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (m110261a(fingerprint, (String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}
