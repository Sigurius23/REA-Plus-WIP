package y31;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b\u001e\u0010'¨\u0006("}, m65681d2 = {"Ly31/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "icon", "", "voiceoverText", "Lcom/whoop/navigation/AiAction;", "aiAction", "", "isEmphasized", "modal", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "c", "Ljava/lang/String;", "e", "Lcom/whoop/navigation/AiAction;", "()Lcom/whoop/navigation/AiAction;", "Z", "f", "()Z", "Ljava/lang/Object;", "()Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39192a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String voiceoverText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AiAction aiAction;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isEmphasized;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Object modal;

    public C39192a(TextResource textResource, EnumC16313m0 icon, String str, AiAction aiAction, boolean z4, Object obj) {
        AbstractC22676k.m65750j(icon, "icon");
        this.title = textResource;
        this.icon = icon;
        this.voiceoverText = str;
        this.aiAction = aiAction;
        this.isEmphasized = z4;
        this.modal = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getModal() {
        return this.modal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVoiceoverText() {
        return this.voiceoverText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39192a)) {
            return false;
        }
        C39192a c39192a = (C39192a) other;
        return AbstractC22676k.m65745e(this.title, c39192a.title) && this.icon == c39192a.icon && AbstractC22676k.m65745e(this.voiceoverText, c39192a.voiceoverText) && AbstractC22676k.m65745e(this.aiAction, c39192a.aiAction) && this.isEmphasized == c39192a.isEmphasized && AbstractC22676k.m65745e(this.modal, c39192a.modal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsEmphasized() {
        return this.isEmphasized;
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int iM48500b = AbstractC17176i.m48500b(this.icon, (textResource == null ? 0 : textResource.hashCode()) * 31, 31);
        String str = this.voiceoverText;
        int iHashCode = (iM48500b + (str == null ? 0 : str.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (aiAction == null ? 0 : aiAction.hashCode())) * 31, 31, this.isEmphasized);
        Object obj = this.modal;
        return iM8289b + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.voiceoverText;
        AiAction aiAction = this.aiAction;
        boolean z4 = this.isEmphasized;
        Object obj = this.modal;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("AiChatTalkTextButtonViewState(title=", textResource, ", icon=", enumC16313m0, ", voiceoverText=");
        sbM61140k.append(str);
        sbM61140k.append(", aiAction=");
        sbM61140k.append(aiAction);
        sbM61140k.append(", isEmphasized=");
        sbM61140k.append(z4);
        sbM61140k.append(", modal=");
        sbM61140k.append(obj);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }

    public /* synthetic */ C39192a(TextResource textResource, EnumC16313m0 enumC16313m0, String str, AiAction aiAction, boolean z4, Object obj, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, enumC16313m0, str, aiAction, z4, (i13 & 32) != 0 ? null : obj);
    }
}
