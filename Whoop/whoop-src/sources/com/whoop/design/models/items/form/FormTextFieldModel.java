package com.whoop.design.models.items.form;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o91.C27687d;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p133f1.C13998z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0080\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u0010\u0018R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b\u000f\u0010!¨\u0006E"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormTextFieldModel;", "", "", "id", "label", "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;", "keyboardType", "hintText", "text", "validRegex", "errorMessage", "", "disabled", "Lcom/whoop/design/models/items/form/FormSheetModel;", "selectionSheet", "isRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "()Lcom/whoop/design/models/items/form/FormSheetModel;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/items/form/FormSheetModel;Z)Lcom/whoop/design/models/items/form/FormTextFieldModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/form/FormTextFieldModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getLabel", "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;", "getKeyboardType", "getHintText", "getText", "getValidRegex", "getErrorMessage", "Z", "getDisabled", "Lcom/whoop/design/models/items/form/FormSheetModel;", "getSelectionSheet", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormTextFieldModel {
    private final boolean disabled;
    private final String errorMessage;
    private final String hintText;
    private final String id;
    private final boolean isRequired;
    private final FormTextFieldKeyboardType keyboardType;
    private final String label;
    private final FormSheetModel selectionSheet;
    private final String text;
    private final String validRegex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13998z1(2)), null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/form/FormTextFieldModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/form/FormTextFieldModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormTextFieldModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FormTextFieldModel(int i13, String str, String str2, FormTextFieldKeyboardType formTextFieldKeyboardType, String str3, String str4, String str5, String str6, boolean z4, FormSheetModel formSheetModel, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (643 != (i13 & 643)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 643, FormTextFieldModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.label = str2;
        if ((i13 & 4) == 0) {
            this.keyboardType = null;
        } else {
            this.keyboardType = formTextFieldKeyboardType;
        }
        if ((i13 & 8) == 0) {
            this.hintText = null;
        } else {
            this.hintText = str3;
        }
        if ((i13 & 16) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
        if ((i13 & 32) == 0) {
            this.validRegex = null;
        } else {
            this.validRegex = str5;
        }
        if ((i13 & 64) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str6;
        }
        this.disabled = z4;
        if ((i13 & 256) == 0) {
            this.selectionSheet = null;
        } else {
            this.selectionSheet = formSheetModel;
        }
        this.isRequired = z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.form.FormTextFieldKeyboardType", FormTextFieldKeyboardType.values());
    }

    public static /* synthetic */ FormTextFieldModel copy$default(FormTextFieldModel formTextFieldModel, String str, String str2, FormTextFieldKeyboardType formTextFieldKeyboardType, String str3, String str4, String str5, String str6, boolean z4, FormSheetModel formSheetModel, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = formTextFieldModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = formTextFieldModel.label;
        }
        if ((i13 & 4) != 0) {
            formTextFieldKeyboardType = formTextFieldModel.keyboardType;
        }
        if ((i13 & 8) != 0) {
            str3 = formTextFieldModel.hintText;
        }
        if ((i13 & 16) != 0) {
            str4 = formTextFieldModel.text;
        }
        if ((i13 & 32) != 0) {
            str5 = formTextFieldModel.validRegex;
        }
        if ((i13 & 64) != 0) {
            str6 = formTextFieldModel.errorMessage;
        }
        if ((i13 & 128) != 0) {
            z4 = formTextFieldModel.disabled;
        }
        if ((i13 & 256) != 0) {
            formSheetModel = formTextFieldModel.selectionSheet;
        }
        if ((i13 & 512) != 0) {
            z13 = formTextFieldModel.isRequired;
        }
        FormSheetModel formSheetModel2 = formSheetModel;
        boolean z14 = z13;
        String str7 = str6;
        boolean z15 = z4;
        String str8 = str4;
        String str9 = str5;
        return formTextFieldModel.copy(str, str2, formTextFieldKeyboardType, str3, str8, str9, str7, z15, formSheetModel2, z14);
    }

    public static final /* synthetic */ void write$Self$design_models_release(FormTextFieldModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.label);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.keyboardType != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.keyboardType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hintText != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.hintText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.text != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.text);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.validRegex != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.validRegex);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.errorMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.errorMessage);
        }
        output.encodeBooleanElement(serialDesc, 7, self.disabled);
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.selectionSheet != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, C27687d.f111455a, self.selectionSheet);
        }
        output.encodeBooleanElement(serialDesc, 9, self.isRequired);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FormTextFieldKeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHintText() {
        return this.hintText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValidRegex() {
        return this.validRegex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FormSheetModel getSelectionSheet() {
        return this.selectionSheet;
    }

    public final FormTextFieldModel copy(String id4, String label, FormTextFieldKeyboardType keyboardType, String hintText, String text, String validRegex, String errorMessage, boolean disabled, FormSheetModel selectionSheet, boolean isRequired) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        return new FormTextFieldModel(id4, label, keyboardType, hintText, text, validRegex, errorMessage, disabled, selectionSheet, isRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormTextFieldModel)) {
            return false;
        }
        FormTextFieldModel formTextFieldModel = (FormTextFieldModel) other;
        return AbstractC22676k.m65745e(this.id, formTextFieldModel.id) && AbstractC22676k.m65745e(this.label, formTextFieldModel.label) && this.keyboardType == formTextFieldModel.keyboardType && AbstractC22676k.m65745e(this.hintText, formTextFieldModel.hintText) && AbstractC22676k.m65745e(this.text, formTextFieldModel.text) && AbstractC22676k.m65745e(this.validRegex, formTextFieldModel.validRegex) && AbstractC22676k.m65745e(this.errorMessage, formTextFieldModel.errorMessage) && this.disabled == formTextFieldModel.disabled && AbstractC22676k.m65745e(this.selectionSheet, formTextFieldModel.selectionSheet) && this.isRequired == formTextFieldModel.isRequired;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final String getId() {
        return this.id;
    }

    public final FormTextFieldKeyboardType getKeyboardType() {
        return this.keyboardType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final FormSheetModel getSelectionSheet() {
        return this.selectionSheet;
    }

    public final String getText() {
        return this.text;
    }

    public final String getValidRegex() {
        return this.validRegex;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.label);
        FormTextFieldKeyboardType formTextFieldKeyboardType = this.keyboardType;
        int iHashCode = (iM30450d + (formTextFieldKeyboardType == null ? 0 : formTextFieldKeyboardType.hashCode())) * 31;
        String str = this.hintText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.validRegex;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.disabled);
        FormSheetModel formSheetModel = this.selectionSheet;
        return Boolean.hashCode(this.isRequired) + ((iM8289b + (formSheetModel != null ? formSheetModel.hashCode() : 0)) * 31);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.label;
        FormTextFieldKeyboardType formTextFieldKeyboardType = this.keyboardType;
        String str3 = this.hintText;
        String str4 = this.text;
        String str5 = this.validRegex;
        String str6 = this.errorMessage;
        boolean z4 = this.disabled;
        FormSheetModel formSheetModel = this.selectionSheet;
        boolean z13 = this.isRequired;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormTextFieldModel(id=", str, ", label=", str2, ", keyboardType=");
        sbM32001t.append(formTextFieldKeyboardType);
        sbM32001t.append(", hintText=");
        sbM32001t.append(str3);
        sbM32001t.append(", text=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", validRegex=", str5, ", errorMessage=");
        AbstractC38963t7.m124390t(sbM32001t, str6, ", disabled=", z4, ", selectionSheet=");
        sbM32001t.append(formSheetModel);
        sbM32001t.append(", isRequired=");
        sbM32001t.append(z13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public FormTextFieldModel(String id4, String label, FormTextFieldKeyboardType formTextFieldKeyboardType, String str, String str2, String str3, String str4, boolean z4, FormSheetModel formSheetModel, boolean z13) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(label, "label");
        this.id = id4;
        this.label = label;
        this.keyboardType = formTextFieldKeyboardType;
        this.hintText = str;
        this.text = str2;
        this.validRegex = str3;
        this.errorMessage = str4;
        this.disabled = z4;
        this.selectionSheet = formSheetModel;
        this.isRequired = z13;
    }

    public /* synthetic */ FormTextFieldModel(String str, String str2, FormTextFieldKeyboardType formTextFieldKeyboardType, String str3, String str4, String str5, String str6, boolean z4, FormSheetModel formSheetModel, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : formTextFieldKeyboardType, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, z4, (i13 & 256) != 0 ? null : formSheetModel, z13);
    }
}
