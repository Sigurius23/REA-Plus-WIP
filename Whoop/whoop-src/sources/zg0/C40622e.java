package zg0;

import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.bot.models.feedback.AiFeedbackType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nl0.EnumC26800b;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zg0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\u0018BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b!\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, m65681d2 = {"Lzg0/e;", "", "", "turnId", "", "Lzg0/d;", "messages", "", "feedbackEnabled", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "feedbackType", "rawTextContent", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "turnStatus", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "()Z", "d", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "()Lcom/whoop/bot/models/feedback/AiFeedbackType;", "f", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "()Lcom/whoop/bot/models/conversation/AiMessageStatus;", "g", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40622e {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h */
    public static final int f175070h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C40621d> messages;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean feedbackEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AiFeedbackType feedbackType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String rawTextContent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AiMessageStatus turnStatus;

    /* JADX INFO: renamed from: zg0.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lzg0/e$a;", "", "<init>", "()V", "", "Lzg0/e;", "", "a", "(Ljava/util/List;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m131756a(List<C40622e> list) {
            AbstractC22676k.m65750j(list, "<this>");
            List<C40622e> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                List<C40621d> listM131752c = ((C40622e) it.next()).m131752c();
                if (!(listM131752c instanceof Collection) || !listM131752c.isEmpty()) {
                    Iterator<T> it3 = listM131752c.iterator();
                    while (it3.hasNext()) {
                        if (((C40621d) it3.next()).getRole() == EnumC26800b.USER) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public C40622e(String turnId, List<C40621d> messages, boolean z4, AiFeedbackType aiFeedbackType, String rawTextContent, AiMessageStatus turnStatus) {
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(rawTextContent, "rawTextContent");
        AbstractC22676k.m65750j(turnStatus, "turnStatus");
        this.turnId = turnId;
        this.messages = messages;
        this.feedbackEnabled = z4;
        this.feedbackType = aiFeedbackType;
        this.rawTextContent = rawTextContent;
        this.turnStatus = turnStatus;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getFeedbackEnabled() {
        return this.feedbackEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AiFeedbackType getFeedbackType() {
        return this.feedbackType;
    }

    /* JADX INFO: renamed from: c */
    public final List<C40621d> m131752c() {
        return this.messages;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRawTextContent() {
        return this.rawTextContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40622e)) {
            return false;
        }
        C40622e c40622e = (C40622e) other;
        return AbstractC22676k.m65745e(this.turnId, c40622e.turnId) && AbstractC22676k.m65745e(this.messages, c40622e.messages) && this.feedbackEnabled == c40622e.feedbackEnabled && this.feedbackType == c40622e.feedbackType && AbstractC22676k.m65745e(this.rawTextContent, c40622e.rawTextContent) && this.turnStatus == c40622e.turnStatus;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final AiMessageStatus getTurnStatus() {
        return this.turnStatus;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.turnId.hashCode() * 31, 31, this.messages), 31, this.feedbackEnabled);
        AiFeedbackType aiFeedbackType = this.feedbackType;
        return this.turnStatus.hashCode() + AbstractC11266d.m30450d((iM8289b + (aiFeedbackType == null ? 0 : aiFeedbackType.hashCode())) * 31, 31, this.rawTextContent);
    }

    public String toString() {
        String str = this.turnId;
        List<C40621d> list = this.messages;
        boolean z4 = this.feedbackEnabled;
        AiFeedbackType aiFeedbackType = this.feedbackType;
        String str2 = this.rawTextContent;
        AiMessageStatus aiMessageStatus = this.turnStatus;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("AiChatSectionViewState(turnId=", str, ", messages=", ", feedbackEnabled=", list);
        sbM94766o.append(z4);
        sbM94766o.append(", feedbackType=");
        sbM94766o.append(aiFeedbackType);
        sbM94766o.append(", rawTextContent=");
        sbM94766o.append(str2);
        sbM94766o.append(", turnStatus=");
        sbM94766o.append(aiMessageStatus);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
