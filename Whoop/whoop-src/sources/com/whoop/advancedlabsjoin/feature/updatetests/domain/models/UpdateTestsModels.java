package com.whoop.advancedlabsjoin.feature.updatetests.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eb1.C13005a;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JN\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsModels;", "", "", "toolBarTitle", "initiallySelectedSegmentId", "", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionModel;", "sections", "", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/AdvanceLabsUpdateTestsStickyModel;", "bottomStickyItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_join_release", "(Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsModels;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsModels;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToolBarTitle", "getInitiallySelectedSegmentId", "Ljava/util/List;", "getSections", "Ljava/util/Map;", "getBottomStickyItems", "Companion", "$serializer", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpdateTestsModels {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, AdvanceLabsUpdateTestsStickyModel> bottomStickyItems;
    private final String initiallySelectedSegmentId;
    private final List<UpdateTestsSectionModel> sections;
    private final String toolBarTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsModels$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsModels;", "serializer", "()Lwc3/c;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpdateTestsModels$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C13005a(19)), AbstractC30060g.m92087G(enumC23463i, new C13005a(20))};
    }

    public /* synthetic */ UpdateTestsModels(int i13, String str, String str2, List list, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i13 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 13, UpdateTestsModels$$serializer.INSTANCE.getDescriptor());
        }
        this.toolBarTitle = str;
        if ((i13 & 2) == 0) {
            this.initiallySelectedSegmentId = null;
        } else {
            this.initiallySelectedSegmentId = str2;
        }
        this.sections = list;
        this.bottomStickyItems = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(UpdateTestsSectionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, AdvanceLabsUpdateTestsStickyModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateTestsModels copy$default(UpdateTestsModels updateTestsModels, String str, String str2, List list, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateTestsModels.toolBarTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = updateTestsModels.initiallySelectedSegmentId;
        }
        if ((i13 & 4) != 0) {
            list = updateTestsModels.sections;
        }
        if ((i13 & 8) != 0) {
            map = updateTestsModels.bottomStickyItems;
        }
        return updateTestsModels.copy(str, str2, list, map);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_join_release(UpdateTestsModels self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.toolBarTitle);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.initiallySelectedSegmentId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.initiallySelectedSegmentId);
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.bottomStickyItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<UpdateTestsSectionModel> component3() {
        return this.sections;
    }

    public final Map<String, AdvanceLabsUpdateTestsStickyModel> component4() {
        return this.bottomStickyItems;
    }

    public final UpdateTestsModels copy(String toolBarTitle, String initiallySelectedSegmentId, List<UpdateTestsSectionModel> sections, Map<String, AdvanceLabsUpdateTestsStickyModel> bottomStickyItems) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        return new UpdateTestsModels(toolBarTitle, initiallySelectedSegmentId, sections, bottomStickyItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateTestsModels)) {
            return false;
        }
        UpdateTestsModels updateTestsModels = (UpdateTestsModels) other;
        return AbstractC22676k.m65745e(this.toolBarTitle, updateTestsModels.toolBarTitle) && AbstractC22676k.m65745e(this.initiallySelectedSegmentId, updateTestsModels.initiallySelectedSegmentId) && AbstractC22676k.m65745e(this.sections, updateTestsModels.sections) && AbstractC22676k.m65745e(this.bottomStickyItems, updateTestsModels.bottomStickyItems);
    }

    public final Map<String, AdvanceLabsUpdateTestsStickyModel> getBottomStickyItems() {
        return this.bottomStickyItems;
    }

    public final String getInitiallySelectedSegmentId() {
        return this.initiallySelectedSegmentId;
    }

    public final List<UpdateTestsSectionModel> getSections() {
        return this.sections;
    }

    public final String getToolBarTitle() {
        return this.toolBarTitle;
    }

    public int hashCode() {
        int iHashCode = this.toolBarTitle.hashCode() * 31;
        String str = this.initiallySelectedSegmentId;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.sections);
        Map<String, AdvanceLabsUpdateTestsStickyModel> map = this.bottomStickyItems;
        return iM31983b + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.toolBarTitle;
        String str2 = this.initiallySelectedSegmentId;
        List<UpdateTestsSectionModel> list = this.sections;
        Map<String, AdvanceLabsUpdateTestsStickyModel> map = this.bottomStickyItems;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpdateTestsModels(toolBarTitle=", str, ", initiallySelectedSegmentId=", str2, ", sections=");
        sbM32001t.append(list);
        sbM32001t.append(", bottomStickyItems=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public UpdateTestsModels(String toolBarTitle, String str, List<UpdateTestsSectionModel> sections, Map<String, AdvanceLabsUpdateTestsStickyModel> map) {
        AbstractC22676k.m65750j(toolBarTitle, "toolBarTitle");
        AbstractC22676k.m65750j(sections, "sections");
        this.toolBarTitle = toolBarTitle;
        this.initiallySelectedSegmentId = str;
        this.sections = sections;
        this.bottomStickyItems = map;
    }

    public /* synthetic */ UpdateTestsModels(String str, String str2, List list, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, list, map);
    }
}
