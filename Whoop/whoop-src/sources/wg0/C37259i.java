package wg0;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;
import xg0.AbstractC38269a;

/* JADX INFO: renamed from: wg0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0015B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b,\u0010\u001bR\u0011\u0010.\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b(\u0010-¨\u0006/"}, m65681d2 = {"Lwg0/i;", "", "Lcom/whoop/ai/chat/models/AITurn;", "originalTurn", "", "Lwg0/d;", "itemStates", "", "totalWordsInterpolated", "Lwg0/c;", "granularity", "charsPerStep", "<init>", "(Lcom/whoop/ai/chat/models/AITurn;Ljava/util/List;ILwg0/c;I)V", "c", "()Lwg0/i;", "turn", "e", "(Lcom/whoop/ai/chat/models/AITurn;)Lwg0/i;", "f", "()Lcom/whoop/ai/chat/models/AITurn;", "a", "(Lcom/whoop/ai/chat/models/AITurn;Ljava/util/List;ILwg0/c;I)Lwg0/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/ai/chat/models/AITurn;", "getOriginalTurn", "b", "Ljava/util/List;", "getItemStates", "()Ljava/util/List;", "I", "getTotalWordsInterpolated", "d", "Lwg0/c;", "getGranularity", "()Lwg0/c;", "getCharsPerStep", "()Z", "isComplete", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37259i {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f159398g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AITurn originalTurn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C37254d> itemStates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int totalWordsInterpolated;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC37253c granularity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int charsPerStep;

    /* JADX INFO: renamed from: wg0.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lwg0/i$a;", "", "<init>", "()V", "", "messageId", "", "itemIndex", "e", "(Ljava/lang/String;I)Ljava/lang/String;", "Lcom/whoop/ai/chat/models/AITurn;", "", "Lwg0/a;", "c", "(Lcom/whoop/ai/chat/models/AITurn;)Ljava/util/List;", "turn", "Lwg0/c;", "granularity", "charsPerStep", "Lwg0/i;", "d", "(Lcom/whoop/ai/chat/models/AITurn;Lwg0/c;I)Lwg0/i;", "WORD_BY_WORD_LIMIT", "I", "CHAR_BACKLOG_DIVISOR", "CHAR_MAX_PER_STEP", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final List<C37251a> m119419c(AITurn aITurn) {
            List<AIMessage> messages = aITurn.getMessages();
            ArrayList<AIMessage> arrayList = new ArrayList();
            for (Object obj : messages) {
                if (AbstractC38269a.m122609b((AIMessage) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (AIMessage aIMessage : arrayList) {
                C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(aIMessage.getItems());
                ArrayList<C25239c0> arrayList3 = new ArrayList();
                Iterator it = c25263qM74105J1.iterator();
                while (true) {
                    C25241d0 c25241d0 = (C25241d0) it;
                    if (!c25241d0.f99123x.hasNext()) {
                        break;
                    }
                    Object next = c25241d0.next();
                    if (((DesignSystemModel) ((C25239c0) next).f99118b) instanceof MarkdownTextWidget) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
                for (C25239c0 c25239c0 : arrayList3) {
                    int i13 = c25239c0.f99117a;
                    DesignSystemModel designSystemModel = (DesignSystemModel) c25239c0.f99118b;
                    String strM119420e = C37259i.INSTANCE.m119420e(aIMessage.getId(), i13);
                    String id4 = aIMessage.getId();
                    AbstractC22676k.m65748h(designSystemModel, "null cannot be cast to non-null type com.whoop.ai.chat.models.MarkdownTextWidget");
                    arrayList4.add(new C37251a(strM119420e, id4, i13, (MarkdownTextWidget) designSystemModel));
                }
                AbstractC25265s.m74141p0(arrayList2, arrayList4);
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public final String m119420e(String messageId, int itemIndex) {
            return AbstractC25012a.m73373f(itemIndex, messageId, "-");
        }

        /* JADX INFO: renamed from: d */
        public final C37259i m119421d(AITurn turn, EnumC37253c granularity, int charsPerStep) {
            AbstractC22676k.m65750j(turn, "turn");
            AbstractC22676k.m65750j(granularity, "granularity");
            return new C37259i(turn, C25271y.f99162w, 0, granularity, charsPerStep, 4, null).m119415e(turn);
        }

        private Companion() {
        }
    }

    public C37259i(AITurn originalTurn, List<C37254d> itemStates, int i13, EnumC37253c granularity, int i14) {
        AbstractC22676k.m65750j(originalTurn, "originalTurn");
        AbstractC22676k.m65750j(itemStates, "itemStates");
        AbstractC22676k.m65750j(granularity, "granularity");
        this.originalTurn = originalTurn;
        this.itemStates = itemStates;
        this.totalWordsInterpolated = i13;
        this.granularity = granularity;
        this.charsPerStep = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37259i m119411b(C37259i c37259i, AITurn aITurn, List list, int i13, EnumC37253c enumC37253c, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            aITurn = c37259i.originalTurn;
        }
        if ((i15 & 2) != 0) {
            list = c37259i.itemStates;
        }
        if ((i15 & 4) != 0) {
            i13 = c37259i.totalWordsInterpolated;
        }
        if ((i15 & 8) != 0) {
            enumC37253c = c37259i.granularity;
        }
        if ((i15 & 16) != 0) {
            i14 = c37259i.charsPerStep;
        }
        int i16 = i14;
        int i17 = i13;
        return c37259i.m119412a(aITurn, list, i17, enumC37253c, i16);
    }

    /* JADX INFO: renamed from: a */
    public final C37259i m119412a(AITurn originalTurn, List<C37254d> itemStates, int totalWordsInterpolated, EnumC37253c granularity, int charsPerStep) {
        AbstractC22676k.m65750j(originalTurn, "originalTurn");
        AbstractC22676k.m65750j(itemStates, "itemStates");
        AbstractC22676k.m65750j(granularity, "granularity");
        return new C37259i(originalTurn, itemStates, totalWordsInterpolated, granularity, charsPerStep);
    }

    /* JADX INFO: renamed from: c */
    public final C37259i m119413c() {
        Iterator<C37254d> it = this.itemStates.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (!it.next().m119405j()) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            return this;
        }
        if (this.granularity == EnumC37253c.CHARACTER) {
            C37254d c37254d = this.itemStates.get(i13);
            int iM36284n = AbstractC12889b.m36284n((c37254d.getTargetText().length() - c37254d.getCurrentText().length()) / 100, this.charsPerStep, 40);
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(this.itemStates);
            arrayListM74097F1.set(i13, c37254d.m119404h(Integer.valueOf(iM36284n)));
            return m119411b(this, null, arrayListM74097F1, this.totalWordsInterpolated + 1, null, 0, 25, null);
        }
        if (this.totalWordsInterpolated < 200) {
            ArrayList arrayListM74097F2 = AbstractC25265s.m74097F1(this.itemStates);
            arrayListM74097F2.set(i13, C37254d.m119397i(this.itemStates.get(i13), null, 1, null));
            return m119411b(this, null, arrayListM74097F2, this.totalWordsInterpolated + 1, null, 0, 25, null);
        }
        ArrayList arrayListM74097F3 = AbstractC25265s.m74097F1(this.itemStates);
        arrayListM74097F3.set(i13, this.itemStates.get(i13).m119398a());
        return m119411b(this, null, arrayListM74097F3, 0, null, 0, 29, null);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m119414d() {
        List<C37254d> list = this.itemStates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((C37254d) it.next()).m119405j()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C37259i m119415e(AITurn turn) {
        AbstractC22676k.m65750j(turn, "turn");
        List<C37254d> list = this.itemStates;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((C37254d) obj).getItemId(), obj);
        }
        List<C37251a> listM119419c = INSTANCE.m119419c(turn);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM119419c, 10));
        for (C37251a c37251a : listM119419c) {
            C37254d c37254d = (C37254d) linkedHashMap.get(c37251a.getItemId());
            arrayList.add(c37254d != null ? C37254d.m119396c(c37254d, null, null, 0, null, c37251a.getWidget().getText(), c37251a.getWidget().getTextHash(), null, 0, 207, null) : new C37254d(c37251a.getItemId(), c37251a.getMessageId(), c37251a.getItemIndex(), "", c37251a.getWidget().getText(), c37251a.getWidget().getTextHash(), this.granularity, this.charsPerStep));
        }
        return m119411b(this, turn, arrayList, 0, null, 0, 28, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37259i)) {
            return false;
        }
        C37259i c37259i = (C37259i) other;
        return AbstractC22676k.m65745e(this.originalTurn, c37259i.originalTurn) && AbstractC22676k.m65745e(this.itemStates, c37259i.itemStates) && this.totalWordsInterpolated == c37259i.totalWordsInterpolated && this.granularity == c37259i.granularity && this.charsPerStep == c37259i.charsPerStep;
    }

    /* JADX INFO: renamed from: f */
    public final AITurn m119416f() {
        List<C37254d> list = this.itemStates;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : list) {
            linkedHashMap.put(((C37254d) obj).getItemId(), obj);
        }
        List<AIMessage> messages = this.originalTurn.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        boolean z4 = false;
        for (AIMessage aIMessageCopy$default : messages) {
            if (AbstractC38269a.m122609b(aIMessageCopy$default)) {
                List<DesignSystemModel> items = aIMessageCopy$default.getItems();
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                for (Object obj2 : items) {
                    int i14 = i13 + 1;
                    DesignSystemModel designSystemModelCopy = null;
                    if (i13 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    DesignSystemModel designSystemModel = (DesignSystemModel) obj2;
                    if (designSystemModel instanceof MarkdownTextWidget) {
                        C37254d c37254d = (C37254d) linkedHashMap.get(INSTANCE.m119420e(aIMessageCopy$default.getId(), i13));
                        if (c37254d != null) {
                            if (!c37254d.m119405j()) {
                                z4 = true;
                            }
                            if (c37254d.getCurrentText().length() != 0) {
                                designSystemModelCopy = ((MarkdownTextWidget) designSystemModel).copy(c37254d.getCurrentText(), c37254d.m119401e(), this.granularity == EnumC37253c.CHARACTER && !c37254d.m119405j());
                            }
                        } else {
                            designSystemModelCopy = (MarkdownTextWidget) designSystemModel;
                        }
                    } else if (!z4) {
                        designSystemModelCopy = designSystemModel;
                    }
                    if (designSystemModelCopy != null) {
                        arrayList2.add(designSystemModelCopy);
                    }
                    i13 = i14;
                }
                aIMessageCopy$default = AIMessage.copy$default(aIMessageCopy$default, null, null, arrayList2, 3, null);
            }
            arrayList.add(aIMessageCopy$default);
        }
        return AITurn.copy$default(this.originalTurn, null, null, arrayList, null, null, false, 59, null);
    }

    public int hashCode() {
        return Integer.hashCode(this.charsPerStep) + ((this.granularity.hashCode() + AbstractC11266d.m30448b(this.totalWordsInterpolated, AbstractC11895b.m31983b(this.originalTurn.hashCode() * 31, 31, this.itemStates), 31)) * 31);
    }

    public String toString() {
        AITurn aITurn = this.originalTurn;
        List<C37254d> list = this.itemStates;
        int i13 = this.totalWordsInterpolated;
        EnumC37253c enumC37253c = this.granularity;
        int i14 = this.charsPerStep;
        StringBuilder sb4 = new StringBuilder("TurnInterpolationState(originalTurn=");
        sb4.append(aITurn);
        sb4.append(", itemStates=");
        sb4.append(list);
        sb4.append(", totalWordsInterpolated=");
        sb4.append(i13);
        sb4.append(", granularity=");
        sb4.append(enumC37253c);
        sb4.append(", charsPerStep=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }

    public /* synthetic */ C37259i(AITurn aITurn, List list, int i13, EnumC37253c enumC37253c, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(aITurn, list, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? EnumC37253c.WORD : enumC37253c, (i15 & 16) != 0 ? 1 : i14);
    }
}
