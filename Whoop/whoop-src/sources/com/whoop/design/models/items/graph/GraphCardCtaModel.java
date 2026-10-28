package com.whoop.design.models.items.graph;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.util.TrendKey;
import fw0.C14833a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphCardCtaModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "ctaMessage", "buttonLabel", "Lcom/whoop/util/TrendKey;", "trendKey", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/util/TrendKey;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/util/TrendKey;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/GraphCardCtaModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lcom/whoop/util/TrendKey;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/util/TrendKey;)Lcom/whoop/design/models/items/graph/GraphCardCtaModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getCtaMessage", "getButtonLabel", "Lcom/whoop/util/TrendKey;", "getTrendKey", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphCardCtaModel implements DesignSystemModel {
    private final TextResource buttonLabel;
    private final TextResource ctaMessage;
    private final TrendKey trendKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C14833a(27))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphCardCtaModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/GraphCardCtaModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphCardCtaModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphCardCtaModel(int i13, TextResource textResource, TextResource textResource2, TrendKey trendKey, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, GraphCardCtaModel$$serializer.INSTANCE.getDescriptor());
        }
        this.ctaMessage = textResource;
        this.buttonLabel = textResource2;
        if ((i13 & 4) == 0) {
            this.trendKey = TrendKey.NONE;
        } else {
            this.trendKey = trendKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TrendKey.INSTANCE.serializer();
    }

    public static /* synthetic */ GraphCardCtaModel copy$default(GraphCardCtaModel graphCardCtaModel, TextResource textResource, TextResource textResource2, TrendKey trendKey, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = graphCardCtaModel.ctaMessage;
        }
        if ((i13 & 2) != 0) {
            textResource2 = graphCardCtaModel.buttonLabel;
        }
        if ((i13 & 4) != 0) {
            trendKey = graphCardCtaModel.trendKey;
        }
        return graphCardCtaModel.copy(textResource, textResource2, trendKey);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphCardCtaModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.ctaMessage);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.buttonLabel);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.trendKey == TrendKey.NONE) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.trendKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getCtaMessage() {
        return this.ctaMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getButtonLabel() {
        return this.buttonLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    public final GraphCardCtaModel copy(TextResource ctaMessage, TextResource buttonLabel, TrendKey trendKey) {
        AbstractC22676k.m65750j(ctaMessage, "ctaMessage");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        return new GraphCardCtaModel(ctaMessage, buttonLabel, trendKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphCardCtaModel)) {
            return false;
        }
        GraphCardCtaModel graphCardCtaModel = (GraphCardCtaModel) other;
        return AbstractC22676k.m65745e(this.ctaMessage, graphCardCtaModel.ctaMessage) && AbstractC22676k.m65745e(this.buttonLabel, graphCardCtaModel.buttonLabel) && this.trendKey == graphCardCtaModel.trendKey;
    }

    public final TextResource getButtonLabel() {
        return this.buttonLabel;
    }

    public final TextResource getCtaMessage() {
        return this.ctaMessage;
    }

    public final TrendKey getTrendKey() {
        return this.trendKey;
    }

    public int hashCode() {
        int iHashCode = this.ctaMessage.hashCode() * 31;
        TextResource textResource = this.buttonLabel;
        return this.trendKey.hashCode() + ((iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        TextResource textResource = this.ctaMessage;
        TextResource textResource2 = this.buttonLabel;
        TrendKey trendKey = this.trendKey;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GraphCardCtaModel(ctaMessage=", textResource, ", buttonLabel=", textResource2, ", trendKey=");
        sbM106658q.append(trendKey);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public GraphCardCtaModel(TextResource ctaMessage, TextResource textResource, TrendKey trendKey) {
        AbstractC22676k.m65750j(ctaMessage, "ctaMessage");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        this.ctaMessage = ctaMessage;
        this.buttonLabel = textResource;
        this.trendKey = trendKey;
    }

    public /* synthetic */ GraphCardCtaModel(TextResource textResource, TextResource textResource2, TrendKey trendKey, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i13 & 4) != 0 ? TrendKey.NONE : trendKey);
    }
}
