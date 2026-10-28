package cm0;

import androidx.core.app.NotificationCompat;
import com.whoop.bot.models.conversation.ActionButtonActionType;
import com.whoop.bot.models.conversation.ActionButtonType;
import com.whoop.navigation.C9598e;
import nl0.AbstractC26802d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cm0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0017\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, m65681d2 = {"Lcm0/a;", "", "", "text", "Lcom/whoop/bot/models/conversation/ActionButtonType;", "type", "Lcom/whoop/bot/models/conversation/ActionButtonActionType;", "action", "Lcom/whoop/navigation/e;", "destination", "Lnl0/d;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/ActionButtonType;Lcom/whoop/bot/models/conversation/ActionButtonActionType;Lcom/whoop/navigation/e;Lnl0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/bot/models/conversation/ActionButtonType;", "getType", "()Lcom/whoop/bot/models/conversation/ActionButtonType;", "Lcom/whoop/bot/models/conversation/ActionButtonActionType;", "getAction", "()Lcom/whoop/bot/models/conversation/ActionButtonActionType;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "e", "Lnl0/d;", "()Lnl0/d;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4804a {

    /* JADX INFO: renamed from: f */
    public static final int f19792f = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActionButtonType type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ActionButtonActionType action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC26802d event;

    public C4804a(String text, ActionButtonType type, ActionButtonActionType action, C9598e c9598e, AbstractC26802d abstractC26802d) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(action, "action");
        this.text = text;
        this.type = type;
        this.action = action;
        this.destination = c9598e;
        this.event = abstractC26802d;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC26802d getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4804a)) {
            return false;
        }
        C4804a c4804a = (C4804a) other;
        return AbstractC22676k.m65745e(this.text, c4804a.text) && this.type == c4804a.type && this.action == c4804a.action && AbstractC22676k.m65745e(this.destination, c4804a.destination) && AbstractC22676k.m65745e(this.event, c4804a.event);
    }

    public int hashCode() {
        int iHashCode = (this.action.hashCode() + ((this.type.hashCode() + (this.text.hashCode() * 31)) * 31)) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AbstractC26802d abstractC26802d = this.event;
        return iHashCode2 + (abstractC26802d != null ? abstractC26802d.hashCode() : 0);
    }

    public String toString() {
        return "ActionButtonState(text=" + this.text + ", type=" + this.type + ", action=" + this.action + ", destination=" + this.destination + ", event=" + this.event + ")";
    }
}
