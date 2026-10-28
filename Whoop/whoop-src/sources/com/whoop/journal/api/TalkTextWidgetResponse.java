package com.whoop.journal.api;

import com.whoop.design.models.items.AiChatTalkTextModel;
import com.whoop.design.models.items.AiChatTalkTextModel$$serializer;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"JJ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b4\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/journal/api/TalkTextWidgetResponse;", "", "Lcom/whoop/design/models/items/AiChatTalkTextModel;", "widget", "Lcom/whoop/navigation/AiAction;", "aiAction", "", "autoSaveEnabled", "", "bottomButtonText", "autoSaveInstructionText", "<init>", "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$journal_release", "(Lcom/whoop/journal/api/TalkTextWidgetResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/AiChatTalkTextModel;", "component2", "()Lcom/whoop/navigation/AiAction;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/whoop/design/models/items/AiChatTalkTextModel;Lcom/whoop/navigation/AiAction;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/journal/api/TalkTextWidgetResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/AiChatTalkTextModel;", "getWidget", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Z", "getAutoSaveEnabled", "Ljava/lang/String;", "getBottomButtonText", "getAutoSaveInstructionText", "Companion", "$serializer", "a", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TalkTextWidgetResponse {
    private final AiAction aiAction;
    private final boolean autoSaveEnabled;
    private final String autoSaveInstructionText;
    private final String bottomButtonText;
    private final AiChatTalkTextModel widget;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiAction.$stable | AiChatTalkTextModel.$stable;

    /* JADX INFO: renamed from: com.whoop.journal.api.TalkTextWidgetResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/journal/api/TalkTextWidgetResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/journal/api/TalkTextWidgetResponse;", "serializer", "()Lwc3/c;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TalkTextWidgetResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TalkTextWidgetResponse() {
        this((AiChatTalkTextModel) null, (AiAction) null, false, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TalkTextWidgetResponse copy$default(TalkTextWidgetResponse talkTextWidgetResponse, AiChatTalkTextModel aiChatTalkTextModel, AiAction aiAction, boolean z4, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aiChatTalkTextModel = talkTextWidgetResponse.widget;
        }
        if ((i13 & 2) != 0) {
            aiAction = talkTextWidgetResponse.aiAction;
        }
        if ((i13 & 4) != 0) {
            z4 = talkTextWidgetResponse.autoSaveEnabled;
        }
        if ((i13 & 8) != 0) {
            str = talkTextWidgetResponse.bottomButtonText;
        }
        if ((i13 & 16) != 0) {
            str2 = talkTextWidgetResponse.autoSaveInstructionText;
        }
        String str3 = str2;
        boolean z13 = z4;
        return talkTextWidgetResponse.copy(aiChatTalkTextModel, aiAction, z13, str, str3);
    }

    public static final /* synthetic */ void write$Self$journal_release(TalkTextWidgetResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.widget != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, AiChatTalkTextModel$$serializer.INSTANCE, self.widget);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.aiAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AiAction$$serializer.INSTANCE, self.aiAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.autoSaveEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.autoSaveEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.bottomButtonText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.bottomButtonText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.autoSaveInstructionText == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.autoSaveInstructionText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AiChatTalkTextModel getWidget() {
        return this.widget;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAutoSaveEnabled() {
        return this.autoSaveEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAutoSaveInstructionText() {
        return this.autoSaveInstructionText;
    }

    public final TalkTextWidgetResponse copy(AiChatTalkTextModel widget, AiAction aiAction, boolean autoSaveEnabled, String bottomButtonText, String autoSaveInstructionText) {
        return new TalkTextWidgetResponse(widget, aiAction, autoSaveEnabled, bottomButtonText, autoSaveInstructionText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TalkTextWidgetResponse)) {
            return false;
        }
        TalkTextWidgetResponse talkTextWidgetResponse = (TalkTextWidgetResponse) other;
        return AbstractC22676k.m65745e(this.widget, talkTextWidgetResponse.widget) && AbstractC22676k.m65745e(this.aiAction, talkTextWidgetResponse.aiAction) && this.autoSaveEnabled == talkTextWidgetResponse.autoSaveEnabled && AbstractC22676k.m65745e(this.bottomButtonText, talkTextWidgetResponse.bottomButtonText) && AbstractC22676k.m65745e(this.autoSaveInstructionText, talkTextWidgetResponse.autoSaveInstructionText);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final boolean getAutoSaveEnabled() {
        return this.autoSaveEnabled;
    }

    public final String getAutoSaveInstructionText() {
        return this.autoSaveInstructionText;
    }

    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final AiChatTalkTextModel getWidget() {
        return this.widget;
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
        StringBuilder sb4 = new StringBuilder("TalkTextWidgetResponse(widget=");
        sb4.append(aiChatTalkTextModel);
        sb4.append(", aiAction=");
        sb4.append(aiAction);
        sb4.append(", autoSaveEnabled=");
        AbstractC38963t7.m124391u(sb4, z4, ", bottomButtonText=", str, ", autoSaveInstructionText=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public /* synthetic */ TalkTextWidgetResponse(int i13, AiChatTalkTextModel aiChatTalkTextModel, AiAction aiAction, boolean z4, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.widget = null;
        } else {
            this.widget = aiChatTalkTextModel;
        }
        if ((i13 & 2) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
        if ((i13 & 4) == 0) {
            this.autoSaveEnabled = false;
        } else {
            this.autoSaveEnabled = z4;
        }
        if ((i13 & 8) == 0) {
            this.bottomButtonText = null;
        } else {
            this.bottomButtonText = str;
        }
        if ((i13 & 16) == 0) {
            this.autoSaveInstructionText = null;
        } else {
            this.autoSaveInstructionText = str2;
        }
    }

    public TalkTextWidgetResponse(AiChatTalkTextModel aiChatTalkTextModel, AiAction aiAction, boolean z4, String str, String str2) {
        this.widget = aiChatTalkTextModel;
        this.aiAction = aiAction;
        this.autoSaveEnabled = z4;
        this.bottomButtonText = str;
        this.autoSaveInstructionText = str2;
    }

    public /* synthetic */ TalkTextWidgetResponse(AiChatTalkTextModel aiChatTalkTextModel, AiAction aiAction, boolean z4, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aiChatTalkTextModel, (i13 & 2) != 0 ? null : aiAction, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : str2);
    }
}
