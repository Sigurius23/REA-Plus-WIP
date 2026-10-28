package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel$$serializer;
import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.GoalSettingsTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019Jz\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*J'\u00103\u001a\u0002002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0001¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b:\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b;\u0010\u0017R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b=\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010 R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u00106\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010\u0019¨\u0006F"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "", "", "topHeadingDisplay", "", "Lcom/whoop/design/models/items/GoalSettingsTileModel;", "topInitialToggles", "headingDisplay", "subHeadingDisplay", "initialToggles", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;", "bottomButton", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "bottomSheet", "topInitialToggleIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;", "component7", "()Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/util/List;)Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTopHeadingDisplay", "Ljava/util/List;", "getTopInitialToggles", "getTopInitialToggles$annotations", "()V", "getHeadingDisplay", "getSubHeadingDisplay", "getInitialToggles", "getInitialToggles$annotations", "Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;", "getBottomButton", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "getBottomSheet", "getTopInitialToggleIds", "getTopInitialToggleIds$annotations", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ToggleContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final BottomButton bottomButton;
    private final CustomizeBottomSheetSelectorModel bottomSheet;
    private final String headingDisplay;
    private final List<GoalSettingsTileModel> initialToggles;
    private final String subHeadingDisplay;
    private final String topHeadingDisplay;
    private final List<String> topInitialToggleIds;
    private final List<GoalSettingsTileModel> topInitialToggles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ToggleContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C10717a(1)), null, null, AbstractC30060g.m92087G(enumC23463i, new C10717a(2)), null, null};
    }

    public /* synthetic */ ToggleContent(int i13, String str, List list, String str2, String str3, List list2, BottomButton bottomButton, CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ToggleContent$$serializer.INSTANCE.getDescriptor());
        }
        this.topHeadingDisplay = str;
        this.topInitialToggles = list;
        this.headingDisplay = str2;
        this.subHeadingDisplay = str3;
        this.initialToggles = list2;
        this.bottomButton = bottomButton;
        this.bottomSheet = customizeBottomSheetSelectorModel;
        this.topInitialToggleIds = C25271y.f99162w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GoalSettingsTileModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(GoalSettingsTileModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToggleContent copy$default(ToggleContent toggleContent, String str, List list, String str2, String str3, List list2, BottomButton bottomButton, CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, List list3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = toggleContent.topHeadingDisplay;
        }
        if ((i13 & 2) != 0) {
            list = toggleContent.topInitialToggles;
        }
        if ((i13 & 4) != 0) {
            str2 = toggleContent.headingDisplay;
        }
        if ((i13 & 8) != 0) {
            str3 = toggleContent.subHeadingDisplay;
        }
        if ((i13 & 16) != 0) {
            list2 = toggleContent.initialToggles;
        }
        if ((i13 & 32) != 0) {
            bottomButton = toggleContent.bottomButton;
        }
        if ((i13 & 64) != 0) {
            customizeBottomSheetSelectorModel = toggleContent.bottomSheet;
        }
        if ((i13 & 128) != 0) {
            list3 = toggleContent.topInitialToggleIds;
        }
        CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel2 = customizeBottomSheetSelectorModel;
        List list4 = list3;
        List list5 = list2;
        BottomButton bottomButton2 = bottomButton;
        return toggleContent.copy(str, list, str2, str3, list5, bottomButton2, customizeBottomSheetSelectorModel2, list4);
    }

    @InterfaceC37143h("initial_goal_settings_tiles")
    public static /* synthetic */ void getInitialToggles$annotations() {
    }

    public static /* synthetic */ void getTopInitialToggleIds$annotations() {
    }

    @InterfaceC37143h("top_initial_goal_settings_tiles")
    public static /* synthetic */ void getTopInitialToggles$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ToggleContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.topHeadingDisplay);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.topInitialToggles);
        output.encodeStringElement(serialDesc, 2, self.headingDisplay);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.subHeadingDisplay);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.initialToggles);
        output.encodeSerializableElement(serialDesc, 5, BottomButton$$serializer.INSTANCE, self.bottomButton);
        output.encodeSerializableElement(serialDesc, 6, CustomizeBottomSheetSelectorModel$$serializer.INSTANCE, self.bottomSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopHeadingDisplay() {
        return this.topHeadingDisplay;
    }

    public final List<GoalSettingsTileModel> component2() {
        return this.topInitialToggles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeadingDisplay() {
        return this.headingDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubHeadingDisplay() {
        return this.subHeadingDisplay;
    }

    public final List<GoalSettingsTileModel> component5() {
        return this.initialToggles;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BottomButton getBottomButton() {
        return this.bottomButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CustomizeBottomSheetSelectorModel getBottomSheet() {
        return this.bottomSheet;
    }

    public final List<String> component8() {
        return this.topInitialToggleIds;
    }

    public final ToggleContent copy(String topHeadingDisplay, List<GoalSettingsTileModel> topInitialToggles, String headingDisplay, String subHeadingDisplay, List<GoalSettingsTileModel> initialToggles, BottomButton bottomButton, CustomizeBottomSheetSelectorModel bottomSheet, List<String> topInitialToggleIds) {
        AbstractC22676k.m65750j(headingDisplay, "headingDisplay");
        AbstractC22676k.m65750j(initialToggles, "initialToggles");
        AbstractC22676k.m65750j(bottomButton, "bottomButton");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        return new ToggleContent(topHeadingDisplay, topInitialToggles, headingDisplay, subHeadingDisplay, initialToggles, bottomButton, bottomSheet, topInitialToggleIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToggleContent)) {
            return false;
        }
        ToggleContent toggleContent = (ToggleContent) other;
        return AbstractC22676k.m65745e(this.topHeadingDisplay, toggleContent.topHeadingDisplay) && AbstractC22676k.m65745e(this.topInitialToggles, toggleContent.topInitialToggles) && AbstractC22676k.m65745e(this.headingDisplay, toggleContent.headingDisplay) && AbstractC22676k.m65745e(this.subHeadingDisplay, toggleContent.subHeadingDisplay) && AbstractC22676k.m65745e(this.initialToggles, toggleContent.initialToggles) && AbstractC22676k.m65745e(this.bottomButton, toggleContent.bottomButton) && AbstractC22676k.m65745e(this.bottomSheet, toggleContent.bottomSheet) && AbstractC22676k.m65745e(this.topInitialToggleIds, toggleContent.topInitialToggleIds);
    }

    public final BottomButton getBottomButton() {
        return this.bottomButton;
    }

    public final CustomizeBottomSheetSelectorModel getBottomSheet() {
        return this.bottomSheet;
    }

    public final String getHeadingDisplay() {
        return this.headingDisplay;
    }

    public final List<GoalSettingsTileModel> getInitialToggles() {
        return this.initialToggles;
    }

    public final String getSubHeadingDisplay() {
        return this.subHeadingDisplay;
    }

    public final String getTopHeadingDisplay() {
        return this.topHeadingDisplay;
    }

    public final List<String> getTopInitialToggleIds() {
        return this.topInitialToggleIds;
    }

    public final List<GoalSettingsTileModel> getTopInitialToggles() {
        return this.topInitialToggles;
    }

    public int hashCode() {
        String str = this.topHeadingDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GoalSettingsTileModel> list = this.topInitialToggles;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.headingDisplay);
        String str2 = this.subHeadingDisplay;
        int iHashCode2 = (this.bottomSheet.hashCode() + ((this.bottomButton.hashCode() + AbstractC11895b.m31983b((iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.initialToggles)) * 31)) * 31;
        List<String> list2 = this.topInitialToggleIds;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.topHeadingDisplay;
        List<GoalSettingsTileModel> list = this.topInitialToggles;
        String str2 = this.headingDisplay;
        String str3 = this.subHeadingDisplay;
        List<GoalSettingsTileModel> list2 = this.initialToggles;
        BottomButton bottomButton = this.bottomButton;
        CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel = this.bottomSheet;
        List<String> list3 = this.topInitialToggleIds;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ToggleContent(topHeadingDisplay=", str, ", topInitialToggles=", ", headingDisplay=", list);
        AbstractC11266d.m30444B(sbM94766o, str2, ", subHeadingDisplay=", str3, ", initialToggles=");
        sbM94766o.append(list2);
        sbM94766o.append(", bottomButton=");
        sbM94766o.append(bottomButton);
        sbM94766o.append(", bottomSheet=");
        sbM94766o.append(customizeBottomSheetSelectorModel);
        sbM94766o.append(", topInitialToggleIds=");
        sbM94766o.append(list3);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public ToggleContent(String str, List<GoalSettingsTileModel> list, String headingDisplay, String str2, List<GoalSettingsTileModel> initialToggles, BottomButton bottomButton, CustomizeBottomSheetSelectorModel bottomSheet, List<String> list2) {
        AbstractC22676k.m65750j(headingDisplay, "headingDisplay");
        AbstractC22676k.m65750j(initialToggles, "initialToggles");
        AbstractC22676k.m65750j(bottomButton, "bottomButton");
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        this.topHeadingDisplay = str;
        this.topInitialToggles = list;
        this.headingDisplay = headingDisplay;
        this.subHeadingDisplay = str2;
        this.initialToggles = initialToggles;
        this.bottomButton = bottomButton;
        this.bottomSheet = bottomSheet;
        this.topInitialToggleIds = list2;
    }

    public /* synthetic */ ToggleContent(String str, List list, String str2, String str3, List list2, BottomButton bottomButton, CustomizeBottomSheetSelectorModel customizeBottomSheetSelectorModel, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, str3, list2, bottomButton, customizeBottomSheetSelectorModel, (i13 & 128) != 0 ? C25271y.f99162w : list3);
    }
}
