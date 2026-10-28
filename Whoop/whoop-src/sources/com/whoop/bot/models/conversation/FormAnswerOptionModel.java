package com.whoop.bot.models.conversation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;", "", "", "optionId", "label", "value", "", "selected", "type", "userInputText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOptionId", "getLabel", "getValue", "Z", "getSelected", "getType", "getUserInputText", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormAnswerOptionModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String label;
    private final String optionId;
    private final boolean selected;
    private final String type;
    private final String userInputText;
    private final String value;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormAnswerOptionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormAnswerOptionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FormAnswerOptionModel() {
        this((String) null, (String) null, (String) null, false, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FormAnswerOptionModel copy$default(FormAnswerOptionModel formAnswerOptionModel, String str, String str2, String str3, boolean z4, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = formAnswerOptionModel.optionId;
        }
        if ((i13 & 2) != 0) {
            str2 = formAnswerOptionModel.label;
        }
        if ((i13 & 4) != 0) {
            str3 = formAnswerOptionModel.value;
        }
        if ((i13 & 8) != 0) {
            z4 = formAnswerOptionModel.selected;
        }
        if ((i13 & 16) != 0) {
            str4 = formAnswerOptionModel.type;
        }
        if ((i13 & 32) != 0) {
            str5 = formAnswerOptionModel.userInputText;
        }
        String str6 = str4;
        String str7 = str5;
        return formAnswerOptionModel.copy(str, str2, str3, z4, str6, str7);
    }

    public static final /* synthetic */ void write$Self$bot_release(FormAnswerOptionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.optionId, "")) {
            output.encodeStringElement(serialDesc, 0, self.optionId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.label, "")) {
            output.encodeStringElement(serialDesc, 1, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.value, "")) {
            output.encodeStringElement(serialDesc, 2, self.value);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.selected) {
            output.encodeBooleanElement(serialDesc, 3, self.selected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.type);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.userInputText == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.userInputText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUserInputText() {
        return this.userInputText;
    }

    public final FormAnswerOptionModel copy(String optionId, String label, String value, boolean selected, String type, String userInputText) {
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        return new FormAnswerOptionModel(optionId, label, value, selected, type, userInputText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormAnswerOptionModel)) {
            return false;
        }
        FormAnswerOptionModel formAnswerOptionModel = (FormAnswerOptionModel) other;
        return AbstractC22676k.m65745e(this.optionId, formAnswerOptionModel.optionId) && AbstractC22676k.m65745e(this.label, formAnswerOptionModel.label) && AbstractC22676k.m65745e(this.value, formAnswerOptionModel.value) && this.selected == formAnswerOptionModel.selected && AbstractC22676k.m65745e(this.type, formAnswerOptionModel.type) && AbstractC22676k.m65745e(this.userInputText, formAnswerOptionModel.userInputText);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserInputText() {
        return this.userInputText;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.optionId.hashCode() * 31, 31, this.label), 31, this.value), 31, this.selected);
        String str = this.type;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userInputText;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.optionId;
        String str2 = this.label;
        String str3 = this.value;
        boolean z4 = this.selected;
        String str4 = this.type;
        String str5 = this.userInputText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormAnswerOptionModel(optionId=", str, ", label=", str2, ", value=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", selected=", z4, ", type=");
        return AbstractC11266d.m30464r(sbM32001t, str4, ", userInputText=", str5, ")");
    }

    public /* synthetic */ FormAnswerOptionModel(int i13, String str, String str2, String str3, boolean z4, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.optionId = "";
        } else {
            this.optionId = str;
        }
        if ((i13 & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i13 & 4) == 0) {
            this.value = "";
        } else {
            this.value = str3;
        }
        if ((i13 & 8) == 0) {
            this.selected = false;
        } else {
            this.selected = z4;
        }
        if ((i13 & 16) == 0) {
            this.type = null;
        } else {
            this.type = str4;
        }
        if ((i13 & 32) == 0) {
            this.userInputText = null;
        } else {
            this.userInputText = str5;
        }
    }

    public FormAnswerOptionModel(String optionId, String label, String value, boolean z4, String str, String str2) {
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.optionId = optionId;
        this.label = label;
        this.value = value;
        this.selected = z4;
        this.type = str;
        this.userInputText = str2;
    }

    public /* synthetic */ FormAnswerOptionModel(String str, String str2, String str3, boolean z4, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z4, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5);
    }
}
