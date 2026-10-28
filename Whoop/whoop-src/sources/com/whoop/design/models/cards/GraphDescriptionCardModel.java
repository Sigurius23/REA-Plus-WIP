package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import t42.C33538a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXBk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0088\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00101\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010C\u001a\u0004\bD\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bE\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010J\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010'R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010P\u0012\u0004\bR\u0010M\u001a\u0004\bQ\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u0010+R(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010U\u0012\u0004\bW\u0010M\u001a\u0004\bV\u0010-¨\u0006Z"}, m65681d2 = {"Lcom/whoop/design/models/cards/GraphDescriptionCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "cardName", "Lcom/whoop/design/util/TextResource;", "title", "endIcon", "Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;", "body", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "rightItem", "Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;", "footer", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/design/models/items/TagModel;", "navigationTag", "", "subItems", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "()Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;", "component5", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component6", "()Lcom/whoop/design/models/DesignSystemModel;", "component7", "()Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;", "component8", "()Lcom/whoop/navigation/e;", "component9", "()Lcom/whoop/design/models/items/TagModel;", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/TagModel;Ljava/util/List;)Lcom/whoop/design/models/cards/GraphDescriptionCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/GraphDescriptionCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getCardName", "Lcom/whoop/design/util/TextResource;", "getTitle", "getEndIcon", "Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;", "getBody", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Lcom/whoop/design/models/DesignSystemModel;", "getRightItem", "getRightItem$annotations", "()V", "Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;", "getFooter", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Lcom/whoop/design/models/items/TagModel;", "getNavigationTag", "Ljava/util/List;", "getSubItems", "getSubItems$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphDescriptionCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final GraphDescriptionCardBodyModel body;
    private final String cardName;
    private final C9598e destination;
    private final String endIcon;
    private final GraphDescriptionFooterModel footer;
    private final GraphModel graph;
    private final TagModel navigationTag;
    private final DesignSystemModel rightItem;
    private final List<DesignSystemModel> subItems;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/GraphDescriptionCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/GraphDescriptionCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphDescriptionCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C33538a(13)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(14)), null, AbstractC30060g.m92087G(enumC23463i, new C33538a(15))};
    }

    public /* synthetic */ GraphDescriptionCardModel(int i13, String str, TextResource textResource, String str2, GraphDescriptionCardBodyModel graphDescriptionCardBodyModel, GraphModel graphModel, DesignSystemModel designSystemModel, GraphDescriptionFooterModel graphDescriptionFooterModel, C9598e c9598e, TagModel tagModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, GraphDescriptionCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cardName = str;
        this.title = textResource;
        this.endIcon = str2;
        this.body = graphDescriptionCardBodyModel;
        this.graph = graphModel;
        this.rightItem = designSystemModel;
        this.footer = graphDescriptionFooterModel;
        this.destination = c9598e;
        this.navigationTag = tagModel;
        this.subItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphDescriptionCardModel copy$default(GraphDescriptionCardModel graphDescriptionCardModel, String str, TextResource textResource, String str2, GraphDescriptionCardBodyModel graphDescriptionCardBodyModel, GraphModel graphModel, DesignSystemModel designSystemModel, GraphDescriptionFooterModel graphDescriptionFooterModel, C9598e c9598e, TagModel tagModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = graphDescriptionCardModel.cardName;
        }
        if ((i13 & 2) != 0) {
            textResource = graphDescriptionCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = graphDescriptionCardModel.endIcon;
        }
        if ((i13 & 8) != 0) {
            graphDescriptionCardBodyModel = graphDescriptionCardModel.body;
        }
        if ((i13 & 16) != 0) {
            graphModel = graphDescriptionCardModel.graph;
        }
        if ((i13 & 32) != 0) {
            designSystemModel = graphDescriptionCardModel.rightItem;
        }
        if ((i13 & 64) != 0) {
            graphDescriptionFooterModel = graphDescriptionCardModel.footer;
        }
        if ((i13 & 128) != 0) {
            c9598e = graphDescriptionCardModel.destination;
        }
        if ((i13 & 256) != 0) {
            tagModel = graphDescriptionCardModel.navigationTag;
        }
        if ((i13 & 512) != 0) {
            list = graphDescriptionCardModel.subItems;
        }
        TagModel tagModel2 = tagModel;
        List list2 = list;
        GraphDescriptionFooterModel graphDescriptionFooterModel2 = graphDescriptionFooterModel;
        C9598e c9598e2 = c9598e;
        GraphModel graphModel2 = graphModel;
        DesignSystemModel designSystemModel2 = designSystemModel;
        return graphDescriptionCardModel.copy(str, textResource, str2, graphDescriptionCardBodyModel, graphModel2, designSystemModel2, graphDescriptionFooterModel2, c9598e2, tagModel2, list2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37144i
    public static /* synthetic */ void getRightItem$annotations() {
    }

    @InterfaceC37144i
    public static /* synthetic */ void getSubItems$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphDescriptionCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.cardName);
        output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.endIcon);
        output.encodeSerializableElement(serialDesc, 3, GraphDescriptionCardBodyModel$$serializer.INSTANCE, self.body);
        output.encodeSerializableElement(serialDesc, 4, GraphModel$$serializer.INSTANCE, self.graph);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.rightItem);
        output.encodeNullableSerializableElement(serialDesc, 6, GraphDescriptionFooterModel$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 8, TagModel$$serializer.INSTANCE, self.navigationTag);
        output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.subItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    public final List<DesignSystemModel> component10() {
        return this.subItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GraphDescriptionCardBodyModel getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DesignSystemModel getRightItem() {
        return this.rightItem;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphDescriptionFooterModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final GraphDescriptionCardModel copy(String cardName, TextResource title, String endIcon, GraphDescriptionCardBodyModel body, GraphModel graph, DesignSystemModel rightItem, GraphDescriptionFooterModel footer, C9598e destination, TagModel navigationTag, List<? extends DesignSystemModel> subItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(graph, "graph");
        return new GraphDescriptionCardModel(cardName, title, endIcon, body, graph, rightItem, footer, destination, navigationTag, subItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphDescriptionCardModel)) {
            return false;
        }
        GraphDescriptionCardModel graphDescriptionCardModel = (GraphDescriptionCardModel) other;
        return AbstractC22676k.m65745e(this.cardName, graphDescriptionCardModel.cardName) && AbstractC22676k.m65745e(this.title, graphDescriptionCardModel.title) && AbstractC22676k.m65745e(this.endIcon, graphDescriptionCardModel.endIcon) && AbstractC22676k.m65745e(this.body, graphDescriptionCardModel.body) && AbstractC22676k.m65745e(this.graph, graphDescriptionCardModel.graph) && AbstractC22676k.m65745e(this.rightItem, graphDescriptionCardModel.rightItem) && AbstractC22676k.m65745e(this.footer, graphDescriptionCardModel.footer) && AbstractC22676k.m65745e(this.destination, graphDescriptionCardModel.destination) && AbstractC22676k.m65745e(this.navigationTag, graphDescriptionCardModel.navigationTag) && AbstractC22676k.m65745e(this.subItems, graphDescriptionCardModel.subItems);
    }

    public final GraphDescriptionCardBodyModel getBody() {
        return this.body;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final GraphDescriptionFooterModel getFooter() {
        return this.footer;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final DesignSystemModel getRightItem() {
        return this.rightItem;
    }

    public final List<DesignSystemModel> getSubItems() {
        return this.subItems;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.cardName;
        int iM95625a = AbstractC31061c.m95625a((str == null ? 0 : str.hashCode()) * 31, this.title, 31);
        String str2 = this.endIcon;
        int iHashCode = (this.graph.hashCode() + ((this.body.hashCode() + ((iM95625a + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        DesignSystemModel designSystemModel = this.rightItem;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        GraphDescriptionFooterModel graphDescriptionFooterModel = this.footer;
        int iHashCode3 = (iHashCode2 + (graphDescriptionFooterModel == null ? 0 : graphDescriptionFooterModel.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        TagModel tagModel = this.navigationTag;
        int iHashCode5 = (iHashCode4 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.subItems;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardName;
        TextResource textResource = this.title;
        String str2 = this.endIcon;
        GraphDescriptionCardBodyModel graphDescriptionCardBodyModel = this.body;
        GraphModel graphModel = this.graph;
        DesignSystemModel designSystemModel = this.rightItem;
        GraphDescriptionFooterModel graphDescriptionFooterModel = this.footer;
        C9598e c9598e = this.destination;
        TagModel tagModel = this.navigationTag;
        List<DesignSystemModel> list = this.subItems;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("GraphDescriptionCardModel(cardName=", str, ", title=", textResource, ", endIcon=");
        sbM91847q.append(str2);
        sbM91847q.append(", body=");
        sbM91847q.append(graphDescriptionCardBodyModel);
        sbM91847q.append(", graph=");
        sbM91847q.append(graphModel);
        sbM91847q.append(", rightItem=");
        sbM91847q.append(designSystemModel);
        sbM91847q.append(", footer=");
        sbM91847q.append(graphDescriptionFooterModel);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", navigationTag=");
        sbM91847q.append(tagModel);
        sbM91847q.append(", subItems=");
        sbM91847q.append(list);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphDescriptionCardModel(String str, TextResource title, String str2, GraphDescriptionCardBodyModel body, GraphModel graph, DesignSystemModel designSystemModel, GraphDescriptionFooterModel graphDescriptionFooterModel, C9598e c9598e, TagModel tagModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(graph, "graph");
        this.cardName = str;
        this.title = title;
        this.endIcon = str2;
        this.body = body;
        this.graph = graph;
        this.rightItem = designSystemModel;
        this.footer = graphDescriptionFooterModel;
        this.destination = c9598e;
        this.navigationTag = tagModel;
        this.subItems = list;
    }
}
