package com.whoop.core.details.network.model;

import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001eR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u001bR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b7\u0010\u001e¨\u0006:"}, m65681d2 = {"Lcom/whoop/core/details/network/model/GraphTitleBar;", "", "", "leadingTitle", "leadingSubtitle", "Lcom/whoop/design/models/items/graph/stress/StressState;", "leadingState", "trailingTitle", "trailingSubtitle", "trailingState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/GraphTitleBar;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/graph/stress/StressState;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;)Lcom/whoop/core/details/network/model/GraphTitleBar;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeadingTitle", "getLeadingTitle$annotations", "()V", "getLeadingSubtitle", "getLeadingSubtitle$annotations", "Lcom/whoop/design/models/items/graph/stress/StressState;", "getLeadingState", "getTrailingTitle", "getTrailingTitle$annotations", "getTrailingSubtitle", "getTrailingSubtitle$annotations", "getTrailingState", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphTitleBar {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final StressState leadingState;
    private final String leadingSubtitle;
    private final String leadingTitle;
    private final StressState trailingState;
    private final String trailingSubtitle;
    private final String trailingTitle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/GraphTitleBar$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/GraphTitleBar;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphTitleBar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C6451a(11)), null, null, AbstractC30060g.m92087G(enumC23463i, new C6451a(12))};
    }

    public /* synthetic */ GraphTitleBar(int i13, String str, String str2, StressState stressState, String str3, String str4, StressState stressState2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, GraphTitleBar$$serializer.INSTANCE.getDescriptor());
        }
        this.leadingTitle = str;
        this.leadingSubtitle = str2;
        this.leadingState = stressState;
        this.trailingTitle = str3;
        this.trailingSubtitle = str4;
        this.trailingState = stressState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.stress.StressState", StressState.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.stress.StressState", StressState.values());
    }

    public static /* synthetic */ GraphTitleBar copy$default(GraphTitleBar graphTitleBar, String str, String str2, StressState stressState, String str3, String str4, StressState stressState2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = graphTitleBar.leadingTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = graphTitleBar.leadingSubtitle;
        }
        if ((i13 & 4) != 0) {
            stressState = graphTitleBar.leadingState;
        }
        if ((i13 & 8) != 0) {
            str3 = graphTitleBar.trailingTitle;
        }
        if ((i13 & 16) != 0) {
            str4 = graphTitleBar.trailingSubtitle;
        }
        if ((i13 & 32) != 0) {
            stressState2 = graphTitleBar.trailingState;
        }
        String str5 = str4;
        StressState stressState3 = stressState2;
        return graphTitleBar.copy(str, str2, stressState, str3, str5, stressState3);
    }

    @InterfaceC37143h("leading_subtitle_display")
    public static /* synthetic */ void getLeadingSubtitle$annotations() {
    }

    @InterfaceC37143h("leading_title_display")
    public static /* synthetic */ void getLeadingTitle$annotations() {
    }

    @InterfaceC37143h("trailing_subtitle_display")
    public static /* synthetic */ void getTrailingSubtitle$annotations() {
    }

    @InterfaceC37143h("trailing_title_display")
    public static /* synthetic */ void getTrailingTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(GraphTitleBar self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.leadingTitle);
        output.encodeStringElement(serialDesc, 1, self.leadingSubtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.leadingState);
        output.encodeStringElement(serialDesc, 3, self.trailingTitle);
        output.encodeStringElement(serialDesc, 4, self.trailingSubtitle);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.trailingState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeadingTitle() {
        return this.leadingTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeadingSubtitle() {
        return this.leadingSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StressState getLeadingState() {
        return this.leadingState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrailingTitle() {
        return this.trailingTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTrailingSubtitle() {
        return this.trailingSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StressState getTrailingState() {
        return this.trailingState;
    }

    public final GraphTitleBar copy(String leadingTitle, String leadingSubtitle, StressState leadingState, String trailingTitle, String trailingSubtitle, StressState trailingState) {
        AbstractC22676k.m65750j(leadingTitle, "leadingTitle");
        AbstractC22676k.m65750j(leadingSubtitle, "leadingSubtitle");
        AbstractC22676k.m65750j(leadingState, "leadingState");
        AbstractC22676k.m65750j(trailingTitle, "trailingTitle");
        AbstractC22676k.m65750j(trailingSubtitle, "trailingSubtitle");
        AbstractC22676k.m65750j(trailingState, "trailingState");
        return new GraphTitleBar(leadingTitle, leadingSubtitle, leadingState, trailingTitle, trailingSubtitle, trailingState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphTitleBar)) {
            return false;
        }
        GraphTitleBar graphTitleBar = (GraphTitleBar) other;
        return AbstractC22676k.m65745e(this.leadingTitle, graphTitleBar.leadingTitle) && AbstractC22676k.m65745e(this.leadingSubtitle, graphTitleBar.leadingSubtitle) && this.leadingState == graphTitleBar.leadingState && AbstractC22676k.m65745e(this.trailingTitle, graphTitleBar.trailingTitle) && AbstractC22676k.m65745e(this.trailingSubtitle, graphTitleBar.trailingSubtitle) && this.trailingState == graphTitleBar.trailingState;
    }

    public final StressState getLeadingState() {
        return this.leadingState;
    }

    public final String getLeadingSubtitle() {
        return this.leadingSubtitle;
    }

    public final String getLeadingTitle() {
        return this.leadingTitle;
    }

    public final StressState getTrailingState() {
        return this.trailingState;
    }

    public final String getTrailingSubtitle() {
        return this.trailingSubtitle;
    }

    public final String getTrailingTitle() {
        return this.trailingTitle;
    }

    public int hashCode() {
        return this.trailingState.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.leadingState.hashCode() + AbstractC11266d.m30450d(this.leadingTitle.hashCode() * 31, 31, this.leadingSubtitle)) * 31, 31, this.trailingTitle), 31, this.trailingSubtitle);
    }

    public String toString() {
        String str = this.leadingTitle;
        String str2 = this.leadingSubtitle;
        StressState stressState = this.leadingState;
        String str3 = this.trailingTitle;
        String str4 = this.trailingSubtitle;
        StressState stressState2 = this.trailingState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GraphTitleBar(leadingTitle=", str, ", leadingSubtitle=", str2, ", leadingState=");
        sbM32001t.append(stressState);
        sbM32001t.append(", trailingTitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", trailingSubtitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", trailingState=");
        sbM32001t.append(stressState2);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public GraphTitleBar(String leadingTitle, String leadingSubtitle, StressState leadingState, String trailingTitle, String trailingSubtitle, StressState trailingState) {
        AbstractC22676k.m65750j(leadingTitle, "leadingTitle");
        AbstractC22676k.m65750j(leadingSubtitle, "leadingSubtitle");
        AbstractC22676k.m65750j(leadingState, "leadingState");
        AbstractC22676k.m65750j(trailingTitle, "trailingTitle");
        AbstractC22676k.m65750j(trailingSubtitle, "trailingSubtitle");
        AbstractC22676k.m65750j(trailingState, "trailingState");
        this.leadingTitle = leadingTitle;
        this.leadingSubtitle = leadingSubtitle;
        this.leadingState = leadingState;
        this.trailingTitle = trailingTitle;
        this.trailingSubtitle = trailingSubtitle;
        this.trailingState = trailingState;
    }
}
