package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bq\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jr\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\"R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b<\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b\n\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010.¨\u0006F"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel;", "", "", "title", "id", "", "Lcom/whoop/design/models/items/TagModel;", "tags", "rightIcon", "", "isEnabled", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticsModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/whoop/navigation/e;", "component7", "()Lcom/whoop/whoopaction/domain/models/Action;", "component8", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getId", "Ljava/util/List;", "getTags", "getRightIcon", "Ljava/lang/Boolean;", "Lcom/whoop/navigation/e;", "getDestination", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticsModel", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CycleJournalItemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private final AnalyticEventModel analyticsModel;
    private final C9598e destination;
    private final String id;
    private final Boolean isEnabled;
    private final String rightIcon;
    private final List<TagModel> tags;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalItemModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CycleJournalItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C30526a(6)), null, null, AbstractC30060g.m92087G(enumC23463i, new C30526a(7)), AbstractC30060g.m92087G(enumC23463i, new C30526a(8)), null};
    }

    public /* synthetic */ CycleJournalItemModel(int i13, String str, String str2, List list, String str3, Boolean bool, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, CycleJournalItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.id = str2;
        this.tags = list;
        this.rightIcon = str3;
        this.isEnabled = bool;
        this.destination = c9598e;
        this.action = action;
        this.analyticsModel = analyticEventModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TagModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CycleJournalItemModel copy$default(CycleJournalItemModel cycleJournalItemModel, String str, String str2, List list, String str3, Boolean bool, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cycleJournalItemModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = cycleJournalItemModel.id;
        }
        if ((i13 & 4) != 0) {
            list = cycleJournalItemModel.tags;
        }
        if ((i13 & 8) != 0) {
            str3 = cycleJournalItemModel.rightIcon;
        }
        if ((i13 & 16) != 0) {
            bool = cycleJournalItemModel.isEnabled;
        }
        if ((i13 & 32) != 0) {
            c9598e = cycleJournalItemModel.destination;
        }
        if ((i13 & 64) != 0) {
            action = cycleJournalItemModel.action;
        }
        if ((i13 & 128) != 0) {
            analyticEventModel = cycleJournalItemModel.analyticsModel;
        }
        Action action2 = action;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        Boolean bool2 = bool;
        C9598e c9598e2 = c9598e;
        return cycleJournalItemModel.copy(str, str2, list, str3, bool2, c9598e2, action2, analyticEventModel2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(CycleJournalItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.id);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.tags);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.isEnabled);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.action);
        output.encodeNullableSerializableElement(serialDesc, 7, AnalyticEventModel$$serializer.INSTANCE, self.analyticsModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<TagModel> component3() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final AnalyticEventModel getAnalyticsModel() {
        return this.analyticsModel;
    }

    public final CycleJournalItemModel copy(String title, String id4, List<TagModel> tags, String rightIcon, Boolean isEnabled, C9598e destination, Action action, AnalyticEventModel analyticsModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        return new CycleJournalItemModel(title, id4, tags, rightIcon, isEnabled, destination, action, analyticsModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CycleJournalItemModel)) {
            return false;
        }
        CycleJournalItemModel cycleJournalItemModel = (CycleJournalItemModel) other;
        return AbstractC22676k.m65745e(this.title, cycleJournalItemModel.title) && AbstractC22676k.m65745e(this.id, cycleJournalItemModel.id) && AbstractC22676k.m65745e(this.tags, cycleJournalItemModel.tags) && AbstractC22676k.m65745e(this.rightIcon, cycleJournalItemModel.rightIcon) && AbstractC22676k.m65745e(this.isEnabled, cycleJournalItemModel.isEnabled) && AbstractC22676k.m65745e(this.destination, cycleJournalItemModel.destination) && AbstractC22676k.m65745e(this.action, cycleJournalItemModel.action) && AbstractC22676k.m65745e(this.analyticsModel, cycleJournalItemModel.analyticsModel);
    }

    public final Action getAction() {
        return this.action;
    }

    public final AnalyticEventModel getAnalyticsModel() {
        return this.analyticsModel;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final List<TagModel> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.id);
        List<TagModel> list = this.tags;
        int iHashCode = (iM30450d + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.rightIcon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Action action = this.action;
        int iHashCode5 = (iHashCode4 + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticsModel;
        return iHashCode5 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.id;
        List<TagModel> list = this.tags;
        String str3 = this.rightIcon;
        Boolean bool = this.isEnabled;
        C9598e c9598e = this.destination;
        Action action = this.action;
        AnalyticEventModel analyticEventModel = this.analyticsModel;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CycleJournalItemModel(title=", str, ", id=", str2, ", tags=");
        AbstractC17176i.m48511m(", rightIcon=", str3, ", isEnabled=", sbM32001t, list);
        sbM32001t.append(bool);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", action=");
        sbM32001t.append(action);
        sbM32001t.append(", analyticsModel=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public CycleJournalItemModel(String title, String id4, List<TagModel> list, String str, Boolean bool, C9598e c9598e, Action action, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(id4, "id");
        this.title = title;
        this.id = id4;
        this.tags = list;
        this.rightIcon = str;
        this.isEnabled = bool;
        this.destination = c9598e;
        this.action = action;
        this.analyticsModel = analyticEventModel;
    }
}
