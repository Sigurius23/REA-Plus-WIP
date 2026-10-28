package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gp1.C16065a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010$¨\u0006<"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "singleTitle", "multipleTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;", "textField", "buttonTitle", "skipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "skipNextId", "nextId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;", "component4", "component5", "component6", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSingleTitle", "getMultipleTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/TextInputField;", "getTextField", "getButtonTitle", "getSkipTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getSkipNextId", "getNextId", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalTextInputScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonTitle;
    private final String multipleTitle;
    private final HormonalScreenId nextId;
    private final String singleTitle;
    private final HormonalScreenId skipNextId;
    private final String skipTitle;
    private final TextInputField textField;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalTextInputScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalTextInputScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C16065a(0)), AbstractC30060g.m92087G(enumC23463i, new C16065a(1))};
    }

    public /* synthetic */ HormonalTextInputScreen(int i13, String str, String str2, TextInputField textInputField, String str3, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, HormonalTextInputScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.singleTitle = str;
        this.multipleTitle = str2;
        this.textField = textInputField;
        this.buttonTitle = str3;
        this.skipTitle = str4;
        this.skipNextId = hormonalScreenId;
        this.nextId = hormonalScreenId2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ HormonalTextInputScreen copy$default(HormonalTextInputScreen hormonalTextInputScreen, String str, String str2, TextInputField textInputField, String str3, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalTextInputScreen.singleTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalTextInputScreen.multipleTitle;
        }
        if ((i13 & 4) != 0) {
            textInputField = hormonalTextInputScreen.textField;
        }
        if ((i13 & 8) != 0) {
            str3 = hormonalTextInputScreen.buttonTitle;
        }
        if ((i13 & 16) != 0) {
            str4 = hormonalTextInputScreen.skipTitle;
        }
        if ((i13 & 32) != 0) {
            hormonalScreenId = hormonalTextInputScreen.skipNextId;
        }
        if ((i13 & 64) != 0) {
            hormonalScreenId2 = hormonalTextInputScreen.nextId;
        }
        HormonalScreenId hormonalScreenId3 = hormonalScreenId;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId2;
        String str5 = str4;
        TextInputField textInputField2 = textInputField;
        return hormonalTextInputScreen.copy(str, str2, textInputField2, str3, str5, hormonalScreenId3, hormonalScreenId4);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalTextInputScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.singleTitle);
        output.encodeStringElement(serialDesc, 1, self.multipleTitle);
        output.encodeSerializableElement(serialDesc, 2, TextInputField$$serializer.INSTANCE, self.textField);
        output.encodeStringElement(serialDesc, 3, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.skipTitle);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.skipNextId);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.nextId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSingleTitle() {
        return this.singleTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMultipleTitle() {
        return this.multipleTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextInputField getTextField() {
        return this.textField;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final HormonalTextInputScreen copy(String singleTitle, String multipleTitle, TextInputField textField, String buttonTitle, String skipTitle, HormonalScreenId skipNextId, HormonalScreenId nextId) {
        AbstractC22676k.m65750j(singleTitle, "singleTitle");
        AbstractC22676k.m65750j(multipleTitle, "multipleTitle");
        AbstractC22676k.m65750j(textField, "textField");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        return new HormonalTextInputScreen(singleTitle, multipleTitle, textField, buttonTitle, skipTitle, skipNextId, nextId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalTextInputScreen)) {
            return false;
        }
        HormonalTextInputScreen hormonalTextInputScreen = (HormonalTextInputScreen) other;
        return AbstractC22676k.m65745e(this.singleTitle, hormonalTextInputScreen.singleTitle) && AbstractC22676k.m65745e(this.multipleTitle, hormonalTextInputScreen.multipleTitle) && AbstractC22676k.m65745e(this.textField, hormonalTextInputScreen.textField) && AbstractC22676k.m65745e(this.buttonTitle, hormonalTextInputScreen.buttonTitle) && AbstractC22676k.m65745e(this.skipTitle, hormonalTextInputScreen.skipTitle) && this.skipNextId == hormonalTextInputScreen.skipNextId && this.nextId == hormonalTextInputScreen.nextId;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getMultipleTitle() {
        return this.multipleTitle;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final String getSingleTitle() {
        return this.singleTitle;
    }

    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    public final String getSkipTitle() {
        return this.skipTitle;
    }

    public final TextInputField getTextField() {
        return this.textField;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.textField.hashCode() + AbstractC11266d.m30450d(this.singleTitle.hashCode() * 31, 31, this.multipleTitle)) * 31, 31, this.buttonTitle);
        String str = this.skipTitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        int iHashCode2 = (iHashCode + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        HormonalScreenId hormonalScreenId2 = this.nextId;
        return iHashCode2 + (hormonalScreenId2 != null ? hormonalScreenId2.hashCode() : 0);
    }

    public String toString() {
        String str = this.singleTitle;
        String str2 = this.multipleTitle;
        TextInputField textInputField = this.textField;
        String str3 = this.buttonTitle;
        String str4 = this.skipTitle;
        HormonalScreenId hormonalScreenId = this.skipNextId;
        HormonalScreenId hormonalScreenId2 = this.nextId;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalTextInputScreen(singleTitle=", str, ", multipleTitle=", str2, ", textField=");
        sbM32001t.append(textInputField);
        sbM32001t.append(", buttonTitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", skipTitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", skipNextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", nextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HormonalTextInputScreen(String singleTitle, String multipleTitle, TextInputField textField, String buttonTitle, String str, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2) {
        AbstractC22676k.m65750j(singleTitle, "singleTitle");
        AbstractC22676k.m65750j(multipleTitle, "multipleTitle");
        AbstractC22676k.m65750j(textField, "textField");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.singleTitle = singleTitle;
        this.multipleTitle = multipleTitle;
        this.textField = textField;
        this.buttonTitle = buttonTitle;
        this.skipTitle = str;
        this.skipNextId = hormonalScreenId;
        this.nextId = hormonalScreenId2;
    }
}
