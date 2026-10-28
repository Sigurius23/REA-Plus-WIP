package com.whoop.design.models.cards;

import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;", "", "Lcom/whoop/design/util/TextResource;", "startTitle", "endTitle", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lcom/whoop/design/models/items/ImpactModel;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getStartTitle", "getEndTitle", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphDescriptionFooterModel {
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextResource endTitle;
    private final TextResource startTitle;
    private final ImpactModel trend;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/GraphDescriptionFooterModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/GraphDescriptionFooterModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphDescriptionFooterModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14;
    }

    public /* synthetic */ GraphDescriptionFooterModel(int i13, TextResource textResource, TextResource textResource2, ImpactModel impactModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, GraphDescriptionFooterModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startTitle = textResource;
        this.endTitle = textResource2;
        this.trend = impactModel;
    }

    public static /* synthetic */ GraphDescriptionFooterModel copy$default(GraphDescriptionFooterModel graphDescriptionFooterModel, TextResource textResource, TextResource textResource2, ImpactModel impactModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = graphDescriptionFooterModel.startTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = graphDescriptionFooterModel.endTitle;
        }
        if ((i13 & 4) != 0) {
            impactModel = graphDescriptionFooterModel.trend;
        }
        return graphDescriptionFooterModel.copy(textResource, textResource2, impactModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphDescriptionFooterModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.startTitle);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.endTitle);
        output.encodeSerializableElement(serialDesc, 2, ImpactModel$$serializer.INSTANCE, self.trend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getStartTitle() {
        return this.startTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getEndTitle() {
        return this.endTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final GraphDescriptionFooterModel copy(TextResource startTitle, TextResource endTitle, ImpactModel trend) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(trend, "trend");
        return new GraphDescriptionFooterModel(startTitle, endTitle, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphDescriptionFooterModel)) {
            return false;
        }
        GraphDescriptionFooterModel graphDescriptionFooterModel = (GraphDescriptionFooterModel) other;
        return AbstractC22676k.m65745e(this.startTitle, graphDescriptionFooterModel.startTitle) && AbstractC22676k.m65745e(this.endTitle, graphDescriptionFooterModel.endTitle) && AbstractC22676k.m65745e(this.trend, graphDescriptionFooterModel.trend);
    }

    public final TextResource getEndTitle() {
        return this.endTitle;
    }

    public final TextResource getStartTitle() {
        return this.startTitle;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        return this.trend.hashCode() + AbstractC31061c.m95625a(this.startTitle.hashCode() * 31, this.endTitle, 31);
    }

    public String toString() {
        TextResource textResource = this.startTitle;
        TextResource textResource2 = this.endTitle;
        ImpactModel impactModel = this.trend;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GraphDescriptionFooterModel(startTitle=", textResource, ", endTitle=", textResource2, ", trend=");
        sbM106658q.append(impactModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public GraphDescriptionFooterModel(TextResource startTitle, TextResource endTitle, ImpactModel trend) {
        AbstractC22676k.m65750j(startTitle, "startTitle");
        AbstractC22676k.m65750j(endTitle, "endTitle");
        AbstractC22676k.m65750j(trend, "trend");
        this.startTitle = startTitle;
        this.endTitle = endTitle;
        this.trend = trend;
    }
}
