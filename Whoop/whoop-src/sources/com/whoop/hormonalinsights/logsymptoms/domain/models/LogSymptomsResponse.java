package com.whoop.hormonalinsights.logsymptoms.domain.models;

import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel$$serializer;
import com.whoop.design.models.items.CyclePhaseStyle;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JT\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;", "navigationBar", "", "title", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "categorySelector", "Lcom/whoop/design/models/items/CyclePhaseStyle;", "style", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;", "primaryButton", "", "", "suggestedTrackerIds", "<init>", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "component4", "()Lcom/whoop/design/models/items/CyclePhaseStyle;", "component5", "()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;", "component6", "()Ljava/util/List;", "copy", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;", "getNavigationBar", "Ljava/lang/String;", "getTitle", "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;", "getCategorySelector", "Lcom/whoop/design/models/items/CyclePhaseStyle;", "getStyle", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;", "getPrimaryButton", "Ljava/util/List;", "getSuggestedTrackerIds", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LogSymptomsResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final AnchorSelectorModel categorySelector;
    private final NavigationBar navigationBar;
    private final PrimaryButtonModel primaryButton;
    private final CyclePhaseStyle style;
    private final List<Integer> suggestedTrackerIds;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LogSymptomsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(26)), null, AbstractC30060g.m92087G(enumC23463i, new C21769a(27))};
    }

    public /* synthetic */ LogSymptomsResponse(int i13, NavigationBar navigationBar, String str, AnchorSelectorModel anchorSelectorModel, CyclePhaseStyle cyclePhaseStyle, PrimaryButtonModel primaryButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, LogSymptomsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBar;
        this.title = str;
        this.categorySelector = anchorSelectorModel;
        this.style = cyclePhaseStyle;
        this.primaryButton = primaryButtonModel;
        this.suggestedTrackerIds = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.CyclePhaseStyle", CyclePhaseStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(IntSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LogSymptomsResponse copy$default(LogSymptomsResponse logSymptomsResponse, NavigationBar navigationBar, String str, AnchorSelectorModel anchorSelectorModel, CyclePhaseStyle cyclePhaseStyle, PrimaryButtonModel primaryButtonModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBar = logSymptomsResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            str = logSymptomsResponse.title;
        }
        if ((i13 & 4) != 0) {
            anchorSelectorModel = logSymptomsResponse.categorySelector;
        }
        if ((i13 & 8) != 0) {
            cyclePhaseStyle = logSymptomsResponse.style;
        }
        if ((i13 & 16) != 0) {
            primaryButtonModel = logSymptomsResponse.primaryButton;
        }
        if ((i13 & 32) != 0) {
            list = logSymptomsResponse.suggestedTrackerIds;
        }
        PrimaryButtonModel primaryButtonModel2 = primaryButtonModel;
        List list2 = list;
        return logSymptomsResponse.copy(navigationBar, str, anchorSelectorModel, cyclePhaseStyle, primaryButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(LogSymptomsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, NavigationBar$$serializer.INSTANCE, self.navigationBar);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, AnchorSelectorModel$$serializer.INSTANCE, self.categorySelector);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        output.encodeSerializableElement(serialDesc, 4, PrimaryButtonModel$$serializer.INSTANCE, self.primaryButton);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.suggestedTrackerIds);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBar getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnchorSelectorModel getCategorySelector() {
        return this.categorySelector;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CyclePhaseStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PrimaryButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final List<Integer> component6() {
        return this.suggestedTrackerIds;
    }

    public final LogSymptomsResponse copy(NavigationBar navigationBar, String title, AnchorSelectorModel categorySelector, CyclePhaseStyle style, PrimaryButtonModel primaryButton, List<Integer> suggestedTrackerIds) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categorySelector, "categorySelector");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        return new LogSymptomsResponse(navigationBar, title, categorySelector, style, primaryButton, suggestedTrackerIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogSymptomsResponse)) {
            return false;
        }
        LogSymptomsResponse logSymptomsResponse = (LogSymptomsResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, logSymptomsResponse.navigationBar) && AbstractC22676k.m65745e(this.title, logSymptomsResponse.title) && AbstractC22676k.m65745e(this.categorySelector, logSymptomsResponse.categorySelector) && this.style == logSymptomsResponse.style && AbstractC22676k.m65745e(this.primaryButton, logSymptomsResponse.primaryButton) && AbstractC22676k.m65745e(this.suggestedTrackerIds, logSymptomsResponse.suggestedTrackerIds);
    }

    public final AnchorSelectorModel getCategorySelector() {
        return this.categorySelector;
    }

    public final NavigationBar getNavigationBar() {
        return this.navigationBar;
    }

    public final PrimaryButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final CyclePhaseStyle getStyle() {
        return this.style;
    }

    public final List<Integer> getSuggestedTrackerIds() {
        return this.suggestedTrackerIds;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.primaryButton.hashCode() + ((this.style.hashCode() + ((this.categorySelector.hashCode() + AbstractC11266d.m30450d(this.navigationBar.hashCode() * 31, 31, this.title)) * 31)) * 31)) * 31;
        List<Integer> list = this.suggestedTrackerIds;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "LogSymptomsResponse(navigationBar=" + this.navigationBar + ", title=" + this.title + ", categorySelector=" + this.categorySelector + ", style=" + this.style + ", primaryButton=" + this.primaryButton + ", suggestedTrackerIds=" + this.suggestedTrackerIds + ")";
    }

    public LogSymptomsResponse(NavigationBar navigationBar, String title, AnchorSelectorModel categorySelector, CyclePhaseStyle style, PrimaryButtonModel primaryButton, List<Integer> list) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(categorySelector, "categorySelector");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.navigationBar = navigationBar;
        this.title = title;
        this.categorySelector = categorySelector;
        this.style = style;
        this.primaryButton = primaryButton;
        this.suggestedTrackerIds = list;
    }
}
