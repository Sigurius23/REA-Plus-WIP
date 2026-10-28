package com.whoop.design.models.items.graph;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.C13395a;
import ga1.C15621b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0090\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bA\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bB\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010>\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010\"R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bF\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bG\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010&R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010(¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "", "title", "icon", "cta", "lastUpdatedText", "stressGraphVowDisplay", "Lcom/whoop/design/models/items/graph/stress/StressState;", "stressGraphState", "stressGraphLabel", "stressGraphScore", "Lcom/whoop/design/models/items/graph/StressGraphingCardSize;", "size", "", "subItems", "<init>", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/models/items/graph/stress/StressState;", "component8", "component9", "component10", "()Lcom/whoop/design/models/items/graph/StressGraphingCardSize;", "component11", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/stress/StressState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/StressGraphingCardSize;Ljava/util/List;)Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/StressGraphingCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Ljava/lang/String;", "getTitle", "getIcon", "getCta", "getLastUpdatedText", "getStressGraphVowDisplay", "Lcom/whoop/design/models/items/graph/stress/StressState;", "getStressGraphState", "getStressGraphLabel", "getStressGraphScore", "Lcom/whoop/design/models/items/graph/StressGraphingCardSize;", "getSize", "Ljava/util/List;", "getSubItems", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StressGraphingCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String cta;
    private final GraphModel graph;
    private final String icon;
    private final String lastUpdatedText;
    private final StressGraphingCardSize size;
    private final String stressGraphLabel;
    private final String stressGraphScore;
    private final StressState stressGraphState;
    private final String stressGraphVowDisplay;
    private final List<DesignSystemModel> subItems;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/StressGraphingCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StressGraphingCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C13395a(29)), null, null, AbstractC30060g.m92087G(enumC23463i, new C15621b(0)), AbstractC30060g.m92087G(enumC23463i, new C15621b(1))};
    }

    public /* synthetic */ StressGraphingCardModel(int i13, GraphModel graphModel, String str, String str2, String str3, String str4, String str5, StressState stressState, String str6, String str7, StressGraphingCardSize stressGraphingCardSize, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, StressGraphingCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.graph = graphModel;
        this.title = str;
        this.icon = str2;
        this.cta = str3;
        this.lastUpdatedText = str4;
        this.stressGraphVowDisplay = str5;
        this.stressGraphState = stressState;
        this.stressGraphLabel = str6;
        this.stressGraphScore = str7;
        this.size = stressGraphingCardSize;
        this.subItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.stress.StressState", StressState.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.StressGraphingCardSize", StressGraphingCardSize.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StressGraphingCardModel copy$default(StressGraphingCardModel stressGraphingCardModel, GraphModel graphModel, String str, String str2, String str3, String str4, String str5, StressState stressState, String str6, String str7, StressGraphingCardSize stressGraphingCardSize, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            graphModel = stressGraphingCardModel.graph;
        }
        if ((i13 & 2) != 0) {
            str = stressGraphingCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = stressGraphingCardModel.icon;
        }
        if ((i13 & 8) != 0) {
            str3 = stressGraphingCardModel.cta;
        }
        if ((i13 & 16) != 0) {
            str4 = stressGraphingCardModel.lastUpdatedText;
        }
        if ((i13 & 32) != 0) {
            str5 = stressGraphingCardModel.stressGraphVowDisplay;
        }
        if ((i13 & 64) != 0) {
            stressState = stressGraphingCardModel.stressGraphState;
        }
        if ((i13 & 128) != 0) {
            str6 = stressGraphingCardModel.stressGraphLabel;
        }
        if ((i13 & 256) != 0) {
            str7 = stressGraphingCardModel.stressGraphScore;
        }
        if ((i13 & 512) != 0) {
            stressGraphingCardSize = stressGraphingCardModel.size;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list = stressGraphingCardModel.subItems;
        }
        StressGraphingCardSize stressGraphingCardSize2 = stressGraphingCardSize;
        List list2 = list;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        StressState stressState2 = stressState;
        String str11 = str4;
        String str12 = str2;
        return stressGraphingCardModel.copy(graphModel, str, str12, str3, str11, str10, stressState2, str8, str9, stressGraphingCardSize2, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(StressGraphingCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, GraphModel$$serializer.INSTANCE, self.graph);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.lastUpdatedText);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.stressGraphVowDisplay);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.stressGraphState);
        output.encodeStringElement(serialDesc, 7, self.stressGraphLabel);
        output.encodeStringElement(serialDesc, 8, self.stressGraphScore);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.size);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.subItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final StressGraphingCardSize getSize() {
        return this.size;
    }

    public final List<DesignSystemModel> component11() {
        return this.subItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLastUpdatedText() {
        return this.lastUpdatedText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStressGraphVowDisplay() {
        return this.stressGraphVowDisplay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StressState getStressGraphState() {
        return this.stressGraphState;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStressGraphLabel() {
        return this.stressGraphLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStressGraphScore() {
        return this.stressGraphScore;
    }

    public final StressGraphingCardModel copy(GraphModel graph, String title, String icon, String cta, String lastUpdatedText, String stressGraphVowDisplay, StressState stressGraphState, String stressGraphLabel, String stressGraphScore, StressGraphingCardSize size, List<? extends DesignSystemModel> subItems) {
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(stressGraphState, "stressGraphState");
        AbstractC22676k.m65750j(stressGraphLabel, "stressGraphLabel");
        AbstractC22676k.m65750j(stressGraphScore, "stressGraphScore");
        AbstractC22676k.m65750j(size, "size");
        return new StressGraphingCardModel(graph, title, icon, cta, lastUpdatedText, stressGraphVowDisplay, stressGraphState, stressGraphLabel, stressGraphScore, size, subItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressGraphingCardModel)) {
            return false;
        }
        StressGraphingCardModel stressGraphingCardModel = (StressGraphingCardModel) other;
        return AbstractC22676k.m65745e(this.graph, stressGraphingCardModel.graph) && AbstractC22676k.m65745e(this.title, stressGraphingCardModel.title) && AbstractC22676k.m65745e(this.icon, stressGraphingCardModel.icon) && AbstractC22676k.m65745e(this.cta, stressGraphingCardModel.cta) && AbstractC22676k.m65745e(this.lastUpdatedText, stressGraphingCardModel.lastUpdatedText) && AbstractC22676k.m65745e(this.stressGraphVowDisplay, stressGraphingCardModel.stressGraphVowDisplay) && this.stressGraphState == stressGraphingCardModel.stressGraphState && AbstractC22676k.m65745e(this.stressGraphLabel, stressGraphingCardModel.stressGraphLabel) && AbstractC22676k.m65745e(this.stressGraphScore, stressGraphingCardModel.stressGraphScore) && this.size == stressGraphingCardModel.size && AbstractC22676k.m65745e(this.subItems, stressGraphingCardModel.subItems);
    }

    public final String getCta() {
        return this.cta;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLastUpdatedText() {
        return this.lastUpdatedText;
    }

    public final StressGraphingCardSize getSize() {
        return this.size;
    }

    public final String getStressGraphLabel() {
        return this.stressGraphLabel;
    }

    public final String getStressGraphScore() {
        return this.stressGraphScore;
    }

    public final StressState getStressGraphState() {
        return this.stressGraphState;
    }

    public final String getStressGraphVowDisplay() {
        return this.stressGraphVowDisplay;
    }

    public final List<DesignSystemModel> getSubItems() {
        return this.subItems;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.graph.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cta;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastUpdatedText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stressGraphVowDisplay;
        int iHashCode6 = (this.size.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.stressGraphState.hashCode() + ((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31, this.stressGraphLabel), 31, this.stressGraphScore)) * 31;
        List<DesignSystemModel> list = this.subItems;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        GraphModel graphModel = this.graph;
        String str = this.title;
        String str2 = this.icon;
        String str3 = this.cta;
        String str4 = this.lastUpdatedText;
        String str5 = this.stressGraphVowDisplay;
        StressState stressState = this.stressGraphState;
        String str6 = this.stressGraphLabel;
        String str7 = this.stressGraphScore;
        StressGraphingCardSize stressGraphingCardSize = this.size;
        List<DesignSystemModel> list = this.subItems;
        StringBuilder sb4 = new StringBuilder("StressGraphingCardModel(graph=");
        sb4.append(graphModel);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", icon=");
        AbstractC11266d.m30444B(sb4, str2, ", cta=", str3, ", lastUpdatedText=");
        AbstractC11266d.m30444B(sb4, str4, ", stressGraphVowDisplay=", str5, ", stressGraphState=");
        sb4.append(stressState);
        sb4.append(", stressGraphLabel=");
        sb4.append(str6);
        sb4.append(", stressGraphScore=");
        sb4.append(str7);
        sb4.append(", size=");
        sb4.append(stressGraphingCardSize);
        sb4.append(", subItems=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StressGraphingCardModel(GraphModel graph, String str, String str2, String str3, String str4, String str5, StressState stressGraphState, String stressGraphLabel, String stressGraphScore, StressGraphingCardSize size, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(stressGraphState, "stressGraphState");
        AbstractC22676k.m65750j(stressGraphLabel, "stressGraphLabel");
        AbstractC22676k.m65750j(stressGraphScore, "stressGraphScore");
        AbstractC22676k.m65750j(size, "size");
        this.graph = graph;
        this.title = str;
        this.icon = str2;
        this.cta = str3;
        this.lastUpdatedText = str4;
        this.stressGraphVowDisplay = str5;
        this.stressGraphState = stressGraphState;
        this.stressGraphLabel = stressGraphLabel;
        this.stressGraphScore = stressGraphScore;
        this.size = size;
        this.subItems = list;
    }
}
