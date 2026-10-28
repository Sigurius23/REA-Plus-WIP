package com.whoop.advancedlabs.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
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
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eBm\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010#Jh\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b8\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b9\u0010\u001eR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b:\u0010#¨\u0006="}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "secondaryButton", "", "Lcom/whoop/advancedlabs/domain/models/LabsTestItemModel;", "testItems", "expandText", "secondaryTitle", "secondaryTestItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getSecondaryButton", "Ljava/util/List;", "getTestItems", "getExpandText", "getSecondaryTitle", "getSecondaryTestItems", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LabsTestListCalloutModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String expandText;
    private final String id;
    private final SecondaryButtonModel secondaryButton;
    private final List<LabsTestItemModel> secondaryTestItems;
    private final String secondaryTitle;
    private final List<LabsTestItemModel> testItems;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/LabsTestListCalloutModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LabsTestListCalloutModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(9)), null, null, AbstractC30060g.m92087G(enumC23463i, new C33690a(10))};
    }

    public /* synthetic */ LabsTestListCalloutModel(int i13, String str, String str2, SecondaryButtonModel secondaryButtonModel, List list, String str3, String str4, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, LabsTestListCalloutModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.secondaryButton = secondaryButtonModel;
        this.testItems = list;
        this.expandText = str3;
        this.secondaryTitle = str4;
        this.secondaryTestItems = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LabsTestItemModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(LabsTestItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabsTestListCalloutModel copy$default(LabsTestListCalloutModel labsTestListCalloutModel, String str, String str2, SecondaryButtonModel secondaryButtonModel, List list, String str3, String str4, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = labsTestListCalloutModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = labsTestListCalloutModel.title;
        }
        if ((i13 & 4) != 0) {
            secondaryButtonModel = labsTestListCalloutModel.secondaryButton;
        }
        if ((i13 & 8) != 0) {
            list = labsTestListCalloutModel.testItems;
        }
        if ((i13 & 16) != 0) {
            str3 = labsTestListCalloutModel.expandText;
        }
        if ((i13 & 32) != 0) {
            str4 = labsTestListCalloutModel.secondaryTitle;
        }
        if ((i13 & 64) != 0) {
            list2 = labsTestListCalloutModel.secondaryTestItems;
        }
        String str5 = str4;
        List list3 = list2;
        String str6 = str3;
        SecondaryButtonModel secondaryButtonModel2 = secondaryButtonModel;
        return labsTestListCalloutModel.copy(str, str2, secondaryButtonModel2, list, str6, str5, list3);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(LabsTestListCalloutModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, SecondaryButtonModel$$serializer.INSTANCE, self.secondaryButton);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.testItems);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.expandText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.secondaryTitle);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.secondaryTestItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final List<LabsTestItemModel> component4() {
        return this.testItems;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpandText() {
        return this.expandText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final List<LabsTestItemModel> component7() {
        return this.secondaryTestItems;
    }

    public final LabsTestListCalloutModel copy(String id4, String title, SecondaryButtonModel secondaryButton, List<LabsTestItemModel> testItems, String expandText, String secondaryTitle, List<LabsTestItemModel> secondaryTestItems) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        AbstractC22676k.m65750j(testItems, "testItems");
        return new LabsTestListCalloutModel(id4, title, secondaryButton, testItems, expandText, secondaryTitle, secondaryTestItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabsTestListCalloutModel)) {
            return false;
        }
        LabsTestListCalloutModel labsTestListCalloutModel = (LabsTestListCalloutModel) other;
        return AbstractC22676k.m65745e(this.id, labsTestListCalloutModel.id) && AbstractC22676k.m65745e(this.title, labsTestListCalloutModel.title) && AbstractC22676k.m65745e(this.secondaryButton, labsTestListCalloutModel.secondaryButton) && AbstractC22676k.m65745e(this.testItems, labsTestListCalloutModel.testItems) && AbstractC22676k.m65745e(this.expandText, labsTestListCalloutModel.expandText) && AbstractC22676k.m65745e(this.secondaryTitle, labsTestListCalloutModel.secondaryTitle) && AbstractC22676k.m65745e(this.secondaryTestItems, labsTestListCalloutModel.secondaryTestItems);
    }

    public final String getExpandText() {
        return this.expandText;
    }

    public final String getId() {
        return this.id;
    }

    public final SecondaryButtonModel getSecondaryButton() {
        return this.secondaryButton;
    }

    public final List<LabsTestItemModel> getSecondaryTestItems() {
        return this.secondaryTestItems;
    }

    public final String getSecondaryTitle() {
        return this.secondaryTitle;
    }

    public final List<LabsTestItemModel> getTestItems() {
        return this.testItems;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.secondaryButton.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31, 31, this.testItems);
        String str = this.expandText;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<LabsTestItemModel> list = this.secondaryTestItems;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        SecondaryButtonModel secondaryButtonModel = this.secondaryButton;
        List<LabsTestItemModel> list = this.testItems;
        String str3 = this.expandText;
        String str4 = this.secondaryTitle;
        List<LabsTestItemModel> list2 = this.secondaryTestItems;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LabsTestListCalloutModel(id=", str, ", title=", str2, ", secondaryButton=");
        sbM32001t.append(secondaryButtonModel);
        sbM32001t.append(", testItems=");
        sbM32001t.append(list);
        sbM32001t.append(", expandText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", secondaryTitle=", str4, ", secondaryTestItems=");
        return AbstractC3855a.m11829m(sbM32001t, list2, ")");
    }

    public LabsTestListCalloutModel(String id4, String title, SecondaryButtonModel secondaryButton, List<LabsTestItemModel> testItems, String str, String str2, List<LabsTestItemModel> list) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        AbstractC22676k.m65750j(testItems, "testItems");
        this.id = id4;
        this.title = title;
        this.secondaryButton = secondaryButton;
        this.testItems = testItems;
        this.expandText = str;
        this.secondaryTitle = str2;
        this.secondaryTestItems = list;
    }
}
