package xk1;

import com.whoop.navigation.AiAction;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xk1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!¨\u0006\""}, m65681d2 = {"Lxk1/g;", "", "", "title", "messageUsButtonTitle", "urlDestination", "Lxk1/h;", "supportTypeAction", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxk1/h;Lcom/whoop/navigation/AiAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "c", "getUrlDestination", "d", "Lxk1/h;", "getSupportTypeAction", "()Lxk1/h;", "e", "Lcom/whoop/navigation/AiAction;", "()Lcom/whoop/navigation/AiAction;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38433g {

    /* JADX INFO: renamed from: f */
    public static final int f164602f = AiAction.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String messageUsButtonTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String urlDestination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38434h supportTypeAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AiAction aiAction;

    public C38433g(String title, String messageUsButtonTitle, String urlDestination, EnumC38434h supportTypeAction, AiAction aiAction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(messageUsButtonTitle, "messageUsButtonTitle");
        AbstractC22676k.m65750j(urlDestination, "urlDestination");
        AbstractC22676k.m65750j(supportTypeAction, "supportTypeAction");
        this.title = title;
        this.messageUsButtonTitle = messageUsButtonTitle;
        this.urlDestination = urlDestination;
        this.supportTypeAction = supportTypeAction;
        this.aiAction = aiAction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessageUsButtonTitle() {
        return this.messageUsButtonTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38433g)) {
            return false;
        }
        C38433g c38433g = (C38433g) other;
        return AbstractC22676k.m65745e(this.title, c38433g.title) && AbstractC22676k.m65745e(this.messageUsButtonTitle, c38433g.messageUsButtonTitle) && AbstractC22676k.m65745e(this.urlDestination, c38433g.urlDestination) && this.supportTypeAction == c38433g.supportTypeAction && AbstractC22676k.m65745e(this.aiAction, c38433g.aiAction);
    }

    public int hashCode() {
        int iHashCode = (this.supportTypeAction.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.messageUsButtonTitle), 31, this.urlDestination)) * 31;
        AiAction aiAction = this.aiAction;
        return iHashCode + (aiAction == null ? 0 : aiAction.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.messageUsButtonTitle;
        String str3 = this.urlDestination;
        EnumC38434h enumC38434h = this.supportTypeAction;
        AiAction aiAction = this.aiAction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NeedMoreHelpSection(title=", str, ", messageUsButtonTitle=", str2, ", urlDestination=");
        sbM32001t.append(str3);
        sbM32001t.append(", supportTypeAction=");
        sbM32001t.append(enumC38434h);
        sbM32001t.append(", aiAction=");
        sbM32001t.append(aiAction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
