package zg0;

import com.whoop.bot.models.conversation.AiMessageStatus;
import java.util.List;
import nh3.AbstractC26725a;
import nl0.EnumC26800b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: zg0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001b\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b \u0010\u0012¨\u0006*"}, m65681d2 = {"Lzg0/d;", "", "", "id", "turnId", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "messageStatus", "Lnl0/b;", "role", "", "Lm91/u;", "items", "", "feedbackEnabled", "rawTextContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Lnl0/b;Ljava/util/List;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "()Lcom/whoop/bot/models/conversation/AiMessageStatus;", "d", "Lnl0/b;", "e", "()Lnl0/b;", "Ljava/util/List;", "()Ljava/util/List;", "Z", "getFeedbackEnabled", "()Z", "g", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40621d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String turnId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AiMessageStatus messageStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC26800b role;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean feedbackEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String rawTextContent;

    /* JADX WARN: Multi-variable type inference failed */
    public C40621d(String id4, String turnId, AiMessageStatus messageStatus, EnumC26800b role, List<? extends InterfaceC25312u> items, boolean z4, String rawTextContent) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(messageStatus, "messageStatus");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(rawTextContent, "rawTextContent");
        this.id = id4;
        this.turnId = turnId;
        this.messageStatus = messageStatus;
        this.role = role;
        this.items = items;
        this.feedbackEnabled = z4;
        this.rawTextContent = rawTextContent;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m131745b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AiMessageStatus getMessageStatus() {
        return this.messageStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRawTextContent() {
        return this.rawTextContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC26800b getRole() {
        return this.role;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40621d)) {
            return false;
        }
        C40621d c40621d = (C40621d) other;
        return AbstractC22676k.m65745e(this.id, c40621d.id) && AbstractC22676k.m65745e(this.turnId, c40621d.turnId) && this.messageStatus == c40621d.messageStatus && this.role == c40621d.role && AbstractC22676k.m65745e(this.items, c40621d.items) && this.feedbackEnabled == c40621d.feedbackEnabled && AbstractC22676k.m65745e(this.rawTextContent, c40621d.rawTextContent);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        return this.rawTextContent.hashCode() + AbstractC2875y.m8289b(AbstractC11895b.m31983b((this.role.hashCode() + ((this.messageStatus.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.turnId)) * 31)) * 31, 31, this.items), 31, this.feedbackEnabled);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.turnId;
        AiMessageStatus aiMessageStatus = this.messageStatus;
        EnumC26800b enumC26800b = this.role;
        List<InterfaceC25312u> list = this.items;
        boolean z4 = this.feedbackEnabled;
        String str3 = this.rawTextContent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatMessageViewState(id=", str, ", turnId=", str2, ", messageStatus=");
        sbM32001t.append(aiMessageStatus);
        sbM32001t.append(", role=");
        sbM32001t.append(enumC26800b);
        sbM32001t.append(", items=");
        AbstractC26725a.m79512p(", feedbackEnabled=", ", rawTextContent=", sbM32001t, list, z4);
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    public /* synthetic */ C40621d(String str, String str2, AiMessageStatus aiMessageStatus, EnumC26800b enumC26800b, List list, boolean z4, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, aiMessageStatus, (i13 & 8) != 0 ? EnumC26800b.USER : enumC26800b, list, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? "" : str3);
    }
}
