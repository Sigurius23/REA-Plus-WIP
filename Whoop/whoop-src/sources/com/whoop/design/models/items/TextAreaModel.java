package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJj\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010$J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u001d¨\u0006="}, m65681d2 = {"Lcom/whoop/design/models/items/TextAreaModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "label", "text", "Lcom/whoop/design/util/TextResource;", "hintText", "errorMessage", "", "maxLines", "maxCharacterCount", "stateUpdateValueKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TextAreaModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/util/TextResource;", "component5", "component6", "()I", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;IILjava/lang/String;)Lcom/whoop/design/models/items/TextAreaModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getText", "Lcom/whoop/design/util/TextResource;", "getHintText", "getErrorMessage", "I", "getMaxLines", "getMaxCharacterCount", "getStateUpdateValueKey", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextAreaModel implements DesignSystemModel {
    private final String errorMessage;
    private final TextResource hintText;
    private final String id;
    private final String label;
    private final int maxCharacterCount;
    private final int maxLines;
    private final String stateUpdateValueKey;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TextAreaModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TextAreaModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextAreaModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextAreaModel(int i13, String str, String str2, String str3, TextResource textResource, String str4, int i14, int i15, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, TextAreaModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = str2;
        this.text = str3;
        this.hintText = textResource;
        this.errorMessage = str4;
        this.maxLines = i14;
        this.maxCharacterCount = i15;
        if ((i13 & 128) == 0) {
            this.stateUpdateValueKey = null;
        } else {
            this.stateUpdateValueKey = str5;
        }
    }

    public static /* synthetic */ TextAreaModel copy$default(TextAreaModel textAreaModel, String str, String str2, String str3, TextResource textResource, String str4, int i13, int i14, String str5, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = textAreaModel.id;
        }
        if ((i15 & 2) != 0) {
            str2 = textAreaModel.label;
        }
        if ((i15 & 4) != 0) {
            str3 = textAreaModel.text;
        }
        if ((i15 & 8) != 0) {
            textResource = textAreaModel.hintText;
        }
        if ((i15 & 16) != 0) {
            str4 = textAreaModel.errorMessage;
        }
        if ((i15 & 32) != 0) {
            i13 = textAreaModel.maxLines;
        }
        if ((i15 & 64) != 0) {
            i14 = textAreaModel.maxCharacterCount;
        }
        if ((i15 & 128) != 0) {
            str5 = textAreaModel.stateUpdateValueKey;
        }
        int i16 = i14;
        String str6 = str5;
        String str7 = str4;
        int i17 = i13;
        return textAreaModel.copy(str, str2, str3, textResource, str7, i17, i16, str6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TextAreaModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.label);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.text);
        output.encodeSerializableElement(serialDesc, 3, C25452a.f99689a, self.hintText);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.errorMessage);
        output.encodeIntElement(serialDesc, 5, self.maxLines);
        output.encodeIntElement(serialDesc, 6, self.maxCharacterCount);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.stateUpdateValueKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.stateUpdateValueKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getHintText() {
        return this.hintText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMaxCharacterCount() {
        return this.maxCharacterCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final TextAreaModel copy(String id4, String label, String text, TextResource hintText, String errorMessage, int maxLines, int maxCharacterCount, String stateUpdateValueKey) {
        AbstractC22676k.m65750j(hintText, "hintText");
        return new TextAreaModel(id4, label, text, hintText, errorMessage, maxLines, maxCharacterCount, stateUpdateValueKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaModel)) {
            return false;
        }
        TextAreaModel textAreaModel = (TextAreaModel) other;
        return AbstractC22676k.m65745e(this.id, textAreaModel.id) && AbstractC22676k.m65745e(this.label, textAreaModel.label) && AbstractC22676k.m65745e(this.text, textAreaModel.text) && AbstractC22676k.m65745e(this.hintText, textAreaModel.hintText) && AbstractC22676k.m65745e(this.errorMessage, textAreaModel.errorMessage) && this.maxLines == textAreaModel.maxLines && this.maxCharacterCount == textAreaModel.maxCharacterCount && AbstractC22676k.m65745e(this.stateUpdateValueKey, textAreaModel.stateUpdateValueKey);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final TextResource getHintText() {
        return this.hintText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getMaxCharacterCount() {
        return this.maxCharacterCount;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final String getStateUpdateValueKey() {
        return this.stateUpdateValueKey;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iM95625a = AbstractC31061c.m95625a((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.hintText, 31);
        String str4 = this.errorMessage;
        int iM30448b = AbstractC11266d.m30448b(this.maxCharacterCount, AbstractC11266d.m30448b(this.maxLines, (iM95625a + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31);
        String str5 = this.stateUpdateValueKey;
        return iM30448b + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        String str3 = this.text;
        TextResource textResource = this.hintText;
        String str4 = this.errorMessage;
        int i13 = this.maxLines;
        int i14 = this.maxCharacterCount;
        String str5 = this.stateUpdateValueKey;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TextAreaModel(id=", str, ", label=", str2, ", text=");
        AbstractC30007c.m91826A(sbM32001t, str3, ", hintText=", textResource, ", errorMessage=");
        AbstractC11266d.m30470x(i13, str4, ", maxLines=", ", maxCharacterCount=", sbM32001t);
        return AbstractC38963t7.m124376f(i14, ", stateUpdateValueKey=", str5, ")", sbM32001t);
    }

    public TextAreaModel(String str, String str2, String str3, TextResource hintText, String str4, int i13, int i14, String str5) {
        AbstractC22676k.m65750j(hintText, "hintText");
        this.id = str;
        this.label = str2;
        this.text = str3;
        this.hintText = hintText;
        this.errorMessage = str4;
        this.maxLines = i13;
        this.maxCharacterCount = i14;
        this.stateUpdateValueKey = str5;
    }

    public /* synthetic */ TextAreaModel(String str, String str2, String str3, TextResource textResource, String str4, int i13, int i14, String str5, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, textResource, str4, i13, i14, (i15 & 128) != 0 ? null : str5);
    }
}
