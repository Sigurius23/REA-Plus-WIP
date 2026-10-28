package com.whoop.design.models.items;

import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010%¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "", "", "title", "icon", "voiceoverText", "Lcom/whoop/navigation/AiAction;", "aiAction", "", "isEmphasized", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLcom/whoop/design/models/modal/AnyModal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/navigation/AiAction;", "component5", "()Z", "component6", "()Lcom/whoop/design/models/modal/AnyModal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getIcon", "getVoiceoverText", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Z", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatTalkTextButtonModel {
    private final AiAction aiAction;
    private final String icon;
    private final boolean isEmphasized;
    private final AnyModal modal;
    private final String title;
    private final String voiceoverText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36870a(9))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatTalkTextButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatTalkTextButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiChatTalkTextButtonModel() {
        this((String) null, (String) null, (String) null, (AiAction) null, false, (AnyModal) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AnyModal.INSTANCE.serializer();
    }

    public static /* synthetic */ AiChatTalkTextButtonModel copy$default(AiChatTalkTextButtonModel aiChatTalkTextButtonModel, String str, String str2, String str3, AiAction aiAction, boolean z4, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatTalkTextButtonModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = aiChatTalkTextButtonModel.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = aiChatTalkTextButtonModel.voiceoverText;
        }
        if ((i13 & 8) != 0) {
            aiAction = aiChatTalkTextButtonModel.aiAction;
        }
        if ((i13 & 16) != 0) {
            z4 = aiChatTalkTextButtonModel.isEmphasized;
        }
        if ((i13 & 32) != 0) {
            anyModal = aiChatTalkTextButtonModel.modal;
        }
        boolean z13 = z4;
        AnyModal anyModal2 = anyModal;
        return aiChatTalkTextButtonModel.copy(str, str2, str3, aiAction, z13, anyModal2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AiChatTalkTextButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.voiceoverText != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.voiceoverText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.aiAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, AiAction$$serializer.INSTANCE, self.aiAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isEmphasized) {
            output.encodeBooleanElement(serialDesc, 4, self.isEmphasized);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.modal == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.modal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVoiceoverText() {
        return this.voiceoverText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsEmphasized() {
        return this.isEmphasized;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public final AiChatTalkTextButtonModel copy(String title, String icon, String voiceoverText, AiAction aiAction, boolean isEmphasized, AnyModal modal) {
        return new AiChatTalkTextButtonModel(title, icon, voiceoverText, aiAction, isEmphasized, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatTalkTextButtonModel)) {
            return false;
        }
        AiChatTalkTextButtonModel aiChatTalkTextButtonModel = (AiChatTalkTextButtonModel) other;
        return AbstractC22676k.m65745e(this.title, aiChatTalkTextButtonModel.title) && AbstractC22676k.m65745e(this.icon, aiChatTalkTextButtonModel.icon) && AbstractC22676k.m65745e(this.voiceoverText, aiChatTalkTextButtonModel.voiceoverText) && AbstractC22676k.m65745e(this.aiAction, aiChatTalkTextButtonModel.aiAction) && this.isEmphasized == aiChatTalkTextButtonModel.isEmphasized && AbstractC22676k.m65745e(this.modal, aiChatTalkTextButtonModel.modal);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVoiceoverText() {
        return this.voiceoverText;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.voiceoverText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (aiAction == null ? 0 : aiAction.hashCode())) * 31, 31, this.isEmphasized);
        AnyModal anyModal = this.modal;
        return iM8289b + (anyModal != null ? anyModal.hashCode() : 0);
    }

    public final boolean isEmphasized() {
        return this.isEmphasized;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.icon;
        String str3 = this.voiceoverText;
        AiAction aiAction = this.aiAction;
        boolean z4 = this.isEmphasized;
        AnyModal anyModal = this.modal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiChatTalkTextButtonModel(title=", str, ", icon=", str2, ", voiceoverText=");
        sbM32001t.append(str3);
        sbM32001t.append(", aiAction=");
        sbM32001t.append(aiAction);
        sbM32001t.append(", isEmphasized=");
        sbM32001t.append(z4);
        sbM32001t.append(", modal=");
        sbM32001t.append(anyModal);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ AiChatTalkTextButtonModel(int i13, String str, String str2, String str3, AiAction aiAction, boolean z4, AnyModal anyModal, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i13 & 4) == 0) {
            this.voiceoverText = null;
        } else {
            this.voiceoverText = str3;
        }
        if ((i13 & 8) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
        if ((i13 & 16) == 0) {
            this.isEmphasized = false;
        } else {
            this.isEmphasized = z4;
        }
        if ((i13 & 32) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
    }

    public AiChatTalkTextButtonModel(String str, String str2, String str3, AiAction aiAction, boolean z4, AnyModal anyModal) {
        this.title = str;
        this.icon = str2;
        this.voiceoverText = str3;
        this.aiAction = aiAction;
        this.isEmphasized = z4;
        this.modal = anyModal;
    }

    public /* synthetic */ AiChatTalkTextButtonModel(String str, String str2, String str3, AiAction aiAction, boolean z4, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : aiAction, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : anyModal);
    }
}
