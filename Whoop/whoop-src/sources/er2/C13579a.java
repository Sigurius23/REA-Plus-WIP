package er2;

import com.whoop.design.util.TextResource;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: er2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u0016\u0010!¨\u0006\""}, m65681d2 = {"Ler2/a;", "", "Lcom/whoop/design/util/TextResource;", "descriptionText", "", "chatText", "Ler2/g;", "chatType", "Lkd1/o;", "avatarUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ler2/g;Lkd1/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ler2/g;", "()Ler2/g;", "Lkd1/o;", "()Lkd1/o;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13579a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource descriptionText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<TextResource> chatText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC13585g chatType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o avatarUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public C13579a(TextResource descriptionText, List<? extends TextResource> chatText, EnumC13585g chatType, AbstractC22403o abstractC22403o) {
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        AbstractC22676k.m65750j(chatText, "chatText");
        AbstractC22676k.m65750j(chatType, "chatType");
        this.descriptionText = descriptionText;
        this.chatText = chatText;
        this.chatType = chatType;
        this.avatarUrl = abstractC22403o;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: b */
    public final List<TextResource> m38324b() {
        return this.chatText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC13585g getChatType() {
        return this.chatType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getDescriptionText() {
        return this.descriptionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13579a)) {
            return false;
        }
        C13579a c13579a = (C13579a) other;
        return AbstractC22676k.m65745e(this.descriptionText, c13579a.descriptionText) && AbstractC22676k.m65745e(this.chatText, c13579a.chatText) && this.chatType == c13579a.chatType && AbstractC22676k.m65745e(this.avatarUrl, c13579a.avatarUrl);
    }

    public int hashCode() {
        int iHashCode = (this.chatType.hashCode() + AbstractC11895b.m31983b(this.descriptionText.hashCode() * 31, 31, this.chatText)) * 31;
        AbstractC22403o abstractC22403o = this.avatarUrl;
        return iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode());
    }

    public String toString() {
        TextResource textResource = this.descriptionText;
        List<TextResource> list = this.chatText;
        EnumC13585g enumC13585g = this.chatType;
        AbstractC22403o abstractC22403o = this.avatarUrl;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ChatBoxState(descriptionText=", ", chatText=", ", chatType=", list);
        sbM106657p.append(enumC13585g);
        sbM106657p.append(", avatarUrl=");
        sbM106657p.append(abstractC22403o);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
