package wg0;

import com.whoop.p057ai.chat.models.MarkdownTextWidget;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wg0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lwg0/a;", "", "", "itemId", "messageId", "", "itemIndex", "Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/ai/chat/models/MarkdownTextWidget;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "d", "Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "()Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C37251a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String itemId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String messageId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int itemIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final MarkdownTextWidget widget;

    public C37251a(String itemId, String messageId, int i13, MarkdownTextWidget widget) {
        AbstractC22676k.m65750j(itemId, "itemId");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(widget, "widget");
        this.itemId = itemId;
        this.messageId = messageId;
        this.itemIndex = i13;
        this.widget = widget;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getItemIndex() {
        return this.itemIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MarkdownTextWidget getWidget() {
        return this.widget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37251a)) {
            return false;
        }
        C37251a c37251a = (C37251a) other;
        return AbstractC22676k.m65745e(this.itemId, c37251a.itemId) && AbstractC22676k.m65745e(this.messageId, c37251a.messageId) && this.itemIndex == c37251a.itemIndex && AbstractC22676k.m65745e(this.widget, c37251a.widget);
    }

    public int hashCode() {
        return this.widget.hashCode() + AbstractC11266d.m30448b(this.itemIndex, AbstractC11266d.m30450d(this.itemId.hashCode() * 31, 31, this.messageId), 31);
    }

    public String toString() {
        String str = this.itemId;
        String str2 = this.messageId;
        int i13 = this.itemIndex;
        MarkdownTextWidget markdownTextWidget = this.widget;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AssistantTextItem(itemId=", str, ", messageId=", str2, ", itemIndex=");
        sbM32001t.append(i13);
        sbM32001t.append(", widget=");
        sbM32001t.append(markdownTextWidget);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
