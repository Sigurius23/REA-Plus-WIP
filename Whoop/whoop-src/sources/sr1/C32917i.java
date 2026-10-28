package sr1;

import com.whoop.design.models.items.AiChatTalkTextModel;
import com.whoop.navigation.AiAction;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sr1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b\u001c\u0010\u000e¨\u0006!"}, m65681d2 = {"Lsr1/i;", "", "Lcom/whoop/design/models/items/AiChatTalkTextModel;", "widget", "Lcom/whoop/navigation/AiAction;", "aiAction", "", "autoSaveEnabled", "", "bottomButtonText", "autoSaveInstructionText", "<init>", "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/items/AiChatTalkTextModel;", "e", "()Lcom/whoop/design/models/items/AiChatTalkTextModel;", "b", "Lcom/whoop/navigation/AiAction;", "()Lcom/whoop/navigation/AiAction;", "c", "Z", "()Z", "d", "Ljava/lang/String;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32917i {

    /* JADX INFO: renamed from: f */
    public static final int f137188f = AiAction.$stable | AiChatTalkTextModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatTalkTextModel widget;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AiAction aiAction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean autoSaveEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String bottomButtonText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String autoSaveInstructionText;

    public C32917i(AiChatTalkTextModel aiChatTalkTextModel, AiAction aiAction, boolean z4, String str, String str2) {
        this.widget = aiChatTalkTextModel;
        this.aiAction = aiAction;
        this.autoSaveEnabled = z4;
        this.bottomButtonText = str;
        this.autoSaveInstructionText = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAutoSaveEnabled() {
        return this.autoSaveEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAutoSaveInstructionText() {
        return this.autoSaveInstructionText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AiChatTalkTextModel getWidget() {
        return this.widget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32917i)) {
            return false;
        }
        C32917i c32917i = (C32917i) other;
        return AbstractC22676k.m65745e(this.widget, c32917i.widget) && AbstractC22676k.m65745e(this.aiAction, c32917i.aiAction) && this.autoSaveEnabled == c32917i.autoSaveEnabled && AbstractC22676k.m65745e(this.bottomButtonText, c32917i.bottomButtonText) && AbstractC22676k.m65745e(this.autoSaveInstructionText, c32917i.autoSaveInstructionText);
    }

    public int hashCode() {
        AiChatTalkTextModel aiChatTalkTextModel = this.widget;
        int iHashCode = (aiChatTalkTextModel == null ? 0 : aiChatTalkTextModel.hashCode()) * 31;
        AiAction aiAction = this.aiAction;
        int iM8289b = AbstractC2875y.m8289b((iHashCode + (aiAction == null ? 0 : aiAction.hashCode())) * 31, 31, this.autoSaveEnabled);
        String str = this.bottomButtonText;
        int iHashCode2 = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.autoSaveInstructionText;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AiChatTalkTextModel aiChatTalkTextModel = this.widget;
        AiAction aiAction = this.aiAction;
        boolean z4 = this.autoSaveEnabled;
        String str = this.bottomButtonText;
        String str2 = this.autoSaveInstructionText;
        StringBuilder sb4 = new StringBuilder("TalkTextWidgetDomainState(widget=");
        sb4.append(aiChatTalkTextModel);
        sb4.append(", aiAction=");
        sb4.append(aiAction);
        sb4.append(", autoSaveEnabled=");
        AbstractC38963t7.m124391u(sb4, z4, ", bottomButtonText=", str, ", autoSaveInstructionText=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
